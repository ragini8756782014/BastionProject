package com.example.demo.entity.vendorentity;

import java.sql.Date;

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
public class VendorsCustomers {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="sr_no" ,nullable = false)
private int sr_no;
@Column(name ="cust_email" ,nullable = false)
private String cust_email;
@Column(name ="cust_password" ,nullable = false)
private String cust_password;
@Column(name ="is_s3_subscriber" ,nullable = false)
private byte is_s3_subscriber;
@Column(name ="role" ,nullable = false)
private String  role;
@Column(name ="status" ,nullable = false)
private String status;
@Column(name ="create_date" ,nullable = false)
private Date create_date;
@Column(name ="update_date" ,nullable = false)
private Date update_date;
@Column(name ="customer_accessToken" )
private String customer_accessToken;
@Column(name ="cust_name")
private String cust_name;
@Column(name ="descrip")
private String descrip;
}
