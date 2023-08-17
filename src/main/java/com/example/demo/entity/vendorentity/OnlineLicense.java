package com.example.demo.entity.vendorentity;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bi_api_tbl_online_licenses")
public class OnlineLicense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sr_no;
	
	@Column(nullable = false) 
	private String license_key;
	
	 @Column(name = "cust_email_fk")
	private String cust_email_fk;
	
	 @Column(name = "distributor_email_fk")
	private String distributor_email_fk;
	
	 @Column(name = " user_name")
	private String user_name;
	
	 @Column(name = "user_email_id")
	private String user_email_id;
	
	 @Column(name = "mobile_no")
	private String mobile_no;
	
	 @Column(name = "user_address")
	private String user_address;
		
	@Column(columnDefinition = "Timestamp default CURRENT_TIMESTAMP")
	private Timestamp create_date;
	
	@Column(columnDefinition = "Timestamp default CURRENT_TIMESTAMP")
	private Timestamp update_date;
	
}
