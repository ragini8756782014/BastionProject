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
@Table(name = "bi_api_tbl_distributors")
public class Distributer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="sr_no" ,nullable = false)
private int sr_no;
@Column(name ="distributor_email" ,nullable = false)
private String distributor_email;
@Column(name ="cust_email_fk" ,nullable = false)
private String cust_email_fk;
@Column(name ="distributor_password" ,nullable = false)
private String distributor_password;
@Column(name ="distributor_name" ,nullable = false)
private String distributor_name;
@Column(name ="status" ,nullable = false)
private String status;
@Column(name ="contact_no" ,nullable = false)
private String contact_no;
@Column(name ="create_date" )
private Timestamp create_date;
@Column(name ="update_date" )
private Timestamp update_date;
	
	
}
