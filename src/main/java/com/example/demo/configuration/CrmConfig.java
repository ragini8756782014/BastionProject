package com.example.demo.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;


import java.util.HashMap;


@PropertySource({"classpath:multiple-db-boot.properties"})
@EnableJpaRepositories(basePackages = "com.example.demo.repository.crmrepo", entityManagerFactoryRef = "crmEntityManager", transactionManagerRef = "crmTransactionManager")
@Profile("!tc")
public class CrmConfig {

    @Autowired
    private Environment env;

    public CrmConfig() {
        super();
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean crmEntityManager() {
        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(crmDataSource());
        em.setPackagesToScan("com.example.demo.entity.crmentity");

        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        final HashMap<String, Object> properties = new HashMap<String, Object>();
        properties.put("hibernate.ddl-auto", env.getProperty("hibernate.ddl-auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource crmDataSource() {
        return DataSourceBuilder.create().build();
    }


    @Bean
    public PlatformTransactionManager crmTransactionManager() {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(crmEntityManager().getObject());
        return transactionManager;
    }

}


//@Configuration
//@EnableAutoConfiguration
//@EnableJpaRepositories(basePackages = "com.example.demo.crm.entitty", entityManagerFactoryRef = "entityManagerFactoryCrm",
//transactionManagerRef = "transactionManagerCrm")
//public class CrmConfig {
//		
//	  
//	    @Bean(name = "dataSourceCrmProperties")
//	    @ConfigurationProperties(prefix = "spring.datasource.crm")
//	    public DataSourceProperties dataSourceCrmProperties() {
//	        return new DataSourceProperties();
//	    }
//
//	    
//	    @Bean(name = "dataSourceCrm")
//	    public DataSource dataSourceCrm(@Qualifier("dataSourceCrmProperties") DataSourceProperties dataSourceProperties) {
//	        return dataSourceProperties.initializeDataSourceBuilder().build();
//	    }
//
//	    
//	    @Bean(name = "entityManagerFactoryCrm")
//	    public LocalContainerEntityManagerFactoryBean entityManagerFactoryCrm(
//	            EntityManagerFactoryBuilder builder, @Qualifier("dataSourceCrm") DataSource dataSource) {
//	        return builder
//	                .dataSource(dataSource)
//	                .packages("com.example.demo.crm.entitty")
//	                .persistenceUnit("dbCrm")
//	                .build();
//	    }
//
//	    
//	    @Bean(name = "transactionManagerCrm")
//	    public PlatformTransactionManager transactionManagerCrm(
//	            @Qualifier("entityManagerFactoryCrm") EntityManagerFactory entityManagerFactory) {
//	        return new JpaTransactionManager(entityManagerFactory);
//	    }
//	
//	    
//	    
//
//}
