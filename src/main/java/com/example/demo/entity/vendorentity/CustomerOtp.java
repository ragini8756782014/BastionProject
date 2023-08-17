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
@Table(name = "bi_api_tbl_customer_otp")
public class CustomerOtp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="sr_no" ,nullable = false)
	private int sr_no;
	@Column(name ="cust_email_fk" ,nullable = false)
	private String cust_email_fk;
	@Column(name ="otp" ,nullable = false)
	private int otp;
	@Column(name ="status" ,nullable = false)
	private byte status;
	@Column(name ="expiry" ,nullable = false)
	private int expiry;
	@Column(name ="create_time")
	private Timestamp create_time;
	@Column(name ="update_time" ,nullable = false)
	private Timestamp update_time;
	@Column(name ="attempt_count" )
	private int attempt_count;
}
