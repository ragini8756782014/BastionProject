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
@Table(name = "bi_api_tbl_zoho_clients")
public class ZohoClients {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="sr_no" ,nullable = false)
	private int sr_no;
	@Column(name ="developer_email_id_fk" )
	private String developer_email_id_fk;
	@Column(name ="client_id" ,nullable = false)
	private String client_id;
	@Column(name ="client_secret" )
	private String client_secret;
	@Column(name ="client_name" )
	private String client_name;
	@Column(name ="redirect_uri" )
	private String redirect_uri;
	@Column(name ="create_date" ,nullable = false)
	private Timestamp create_date;
	@Column(name ="update_date" ,nullable = false)
	private Timestamp update_date;
}
