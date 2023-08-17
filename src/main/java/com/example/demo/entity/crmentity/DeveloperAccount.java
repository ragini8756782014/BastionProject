package com.example.demo.entity.crmentity;


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
@Table(name = "bi_api_tbl_developer_accounts")
public class DeveloperAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="developer_account_id" ,nullable = false)
	private int developer_account_id;
	@Column(name ="developer_email_id" ,nullable = false)
	private String developer_email_id;
	@Column(name ="developer_password")
	private String developer_password;
	@Column(name ="create_time" )
	private String create_time;
	
}
