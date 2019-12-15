package com.service;

import com.dao.DoctorDAO;
import com.entity.Doctor;
import com.model.DoctorMO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService{

    private DoctorDAO doctorDAO;

    @Autowired
    DoctorServiceImpl(DoctorDAO doctorDAO){
        this.doctorDAO=doctorDAO;
    }


    @Override //TODO
    public boolean saveDoctorInfo(DoctorMO doctorMO) {
        Doctor doctor=new Doctor();
        doctor.setAddress(doctorMO.getAddress());
        doctor.setContactNumber(doctorMO.getContactNumber());
        doctor.setDegree(doctorMO.getDegree());
        doctor.setEmailID(doctorMO.getEmailID());
        doctor.setSpecialization(doctorMO.getSpecialization());
        doctor.setExperience(doctorMO.getExperience());
        //BeanUtils.copyProperties(doctor, doctorMO);
        return doctorDAO.saveDoctorInfo(doctor);
    }
}
