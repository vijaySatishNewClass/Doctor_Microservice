package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class DoctorMO {

    private Integer doctorID;
    private String  doctorName;
    private String specialization;
    private String degree;
    private String emailID;
    private String contactNumber;
    private String address;
    private String experience;
}
