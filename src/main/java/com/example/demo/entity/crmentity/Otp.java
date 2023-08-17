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
@Table(name = "bi_api_tbl_otp")
public class Otp {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="sr_no" ,nullable = false)
private int sr_no;
@Column(name ="user_email_fk" ,nullable = false)
private String user_email_fk;
@Column(name ="otp" ,nullable = false)
private int otp;
@Column(name ="status" ,nullable = false)
private byte status;
@Column(name ="expiry" ,nullable = false)
private int expiry;
@Column(name ="create_tim" )
private Timestamp create_time;
@Column(name ="update_time" ,nullable = false)
private Timestamp update_time;
@Column(name ="attempt_count" )
private int attempt_count;
}
