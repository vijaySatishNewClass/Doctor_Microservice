package com.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="doctor_info")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="doctor_ID")
    private Integer doctorID;
    @Column(name="doctor_Name")
    private String  doctorName;
    @Column(name="specialization")
    private String specialization;
    @Column(name="degree")
    private String degree;
    @Column(name="emailID")
    private String emailID;
    @Column(name="contactNumber")
    private String contactNumber;
    @Column(name="address")
    private String address;
    @Column(name="experience")
    private String experience;
    @Column(name="doctorCode")
    private String doctorCode;

}
