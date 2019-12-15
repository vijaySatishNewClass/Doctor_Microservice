package com.dao;

import com.entity.Doctor;

public interface DoctorDAO {
    public boolean saveDoctorInfo(Doctor doctor);
    public Integer getDoctorID();
}
