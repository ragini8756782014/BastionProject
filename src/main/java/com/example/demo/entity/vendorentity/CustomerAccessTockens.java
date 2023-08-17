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
@Table(name = "bi_api_tbl_customer_access_tokens")
public class CustomerAccessTockens {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="sr_no" ,nullable = false)
private int  sr_no;
@Column(name ="cust_email_fk" ,nullable = false)
private String  cust_email_fk;
@Column(name ="access_token" ,nullable = false)
private String  access_token;
@Column(name ="create_time" ,nullable = false)
private Timestamp create_time;
@Column(name ="last_accessed_time" )
private Timestamp last_accessed_time;
@Column(name ="expiry" ,nullable = false)
private int expiry;
@Column(name ="grant_type" )
private String grant_type;
@Column(name ="scope" )
private String scope;
@Column(name ="status")
private String status;
}
