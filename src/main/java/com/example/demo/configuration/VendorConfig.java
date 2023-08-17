package com.example.demo.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

import java.util.HashMap;

@PropertySource({"classpath:multiple-db-boot.properties"})
@EnableJpaRepositories(basePackages = "com.example.demo.repository.vendorrepo", entityManagerFactoryRef = "vendorEntityManager", transactionManagerRef = "vendorTransactionManager")
@Profile("!tc")
public class VendorConfig {

	@Autowired
	private Environment env;

	public VendorConfig() {
		super();
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean vendorEntityManager() {
		final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(vendorDataSource());
		em.setPackagesToScan("com.example.demo.entity.vendorentity");

		final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		final HashMap<String, Object> properties = new HashMap<String, Object>();
		properties.put("hibernate.ddl-auto", env.getProperty("hibernate.ddl-auto"));
		properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
		em.setJpaPropertyMap(properties);

		return em;
	}

	@Bean
	@ConfigurationProperties(prefix="spring.datasource.vendor")
	public DataSource vendorDataSource() {
		return DataSourceBuilder.create().build();
	}


	@Bean
	public PlatformTransactionManager vendorTransactionManager() {
		final JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(vendorEntityManager().getObject());
		return transactionManager;
	}
}
