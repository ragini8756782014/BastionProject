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
@Table(name = "bi_api_tbl_invoices")
public class Invoices {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="sr_no" ,nullable = false)
private int sr_no;
@Column(name ="inv_id" ,nullable = false)
private String inv_id;
@Column(name ="inv_no" ,nullable = false)
private String inv_no;
@Column(name ="cust_batch_code_fk" ,nullable = false)
private String cust_batch_code_fk;
@Column(name ="inv_company" ,nullable = false)
private String inv_company;
@Column(name ="inv_vendor_id" ,nullable = false)
private String inv_vendor_id;
@Column(name ="inv_descrip" ,nullable = false)
private String inv_descrip;
@Column(name ="inv_status" )
private String inv_status;
@Column(name ="total_quantity" )
private int total_quantity;
@Column(name ="create_date" ,nullable = false)
private Timestamp create_date;
@Column(name ="update_date" )
private Timestamp update_date;
}
