package com.example.demo.entity.crmentity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bi_api_tbl_features_for_user")
public class FeaturesForUser {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="sr_no" ,nullable = false)
private int sr_no;
@Column(nullable = false )
private int feature_sr_no_fk;
@Column(nullable = false)
private int role_sr_no_fk;
		
}
