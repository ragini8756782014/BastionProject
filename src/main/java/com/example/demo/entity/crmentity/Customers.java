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
@Table(name = "bi_api_tbl_customers")
public class Customers {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="sr_no" ,nullable = false)
private int sr_no;
@Column(name ="cust_batch_code" ,nullable = false)
private String cust_batch_code;
@Column(name ="cust_email" ,nullable = false)
private String cust_email;
@Column(name ="cust_password" ,nullable = false)
private String cust_password;
@Column(name ="cust_company" ,nullable = false)
private String cust_company;
@Column(name ="cust_vendor_id" ,nullable = false)
private String cust_vendor_id;
@Column(name ="is_s3_subscriber" ,nullable = false)
private byte is_s3_subscriber;
@Column(name ="cust_status")
private String cust_status;
@Column(name ="contact_person" )
private String contact_person;
@Column(name ="cust_mobile" ,nullable = false)
private String cust_mobile;
@Column(name ="cust_descrip")
private String cust_descrip;
@Column(name ="create_date" ,nullable = false)
private Timestamp create_date;
@Column(name ="update_date" )
private Timestamp update_date;
}
