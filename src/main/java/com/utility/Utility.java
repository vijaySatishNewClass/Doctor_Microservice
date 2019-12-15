package com.utility;

import com.dao.DoctorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Utility {

    @Autowired
    private DoctorDAO doctorDAO;


    public static String autoGenDoctorCode(){

        return null;
    }


}
