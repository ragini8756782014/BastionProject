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
@Table(name = "bi_api_tbl_zoho_persistence")
public class ZohoPersistence {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="sr_no" ,nullable = false)
private int sr_no;
@Column(name ="developer_email_id" ,nullable = false)
private String developer_email_id;
@Column(name ="refresh_token" )
private String refresh_token;
@Column(name ="client_id")
private String client_id;
@Column(name ="client_secret" )
private String client_secret;
@Column(name ="client_name" ,nullable = false)
private String client_name;
@Column(name ="redirect_uri" ,nullable = false)
private String redirect_uri;
@Column(name ="access_token" )
private String access_token;
@Column(name ="access_token_status" )
private String access_token_status;
@Column(name ="organization_id" ,nullable = false)
private String organization_id;
@Column(name ="expiry_time" ,nullable = false)
private int expiry_time;
@Column(name ="token_descrip")
private String token_descrip;
@Column(name ="create_date" ,nullable = false)
private Timestamp create_date;
@Column(name ="update_date" ,nullable = false)
private Timestamp update_date;
}
