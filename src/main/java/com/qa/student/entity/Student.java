package com.qa.student.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "s_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "s_firstName")
    private String firstName;

    @Column (name = "s_lastName")
    private String lastName;
    
    @Column (name = "s_town")
    private String town;

    @Column (name = "s_dob")
    private String dob;
    
    

}
