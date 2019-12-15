package com.controller;

import com.model.DoctorMO;
import com.model.ErrorMO;
import com.model.SuccessMO;
import com.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    private DoctorService doctorService;

    @Autowired
    DoctorController(DoctorService doctorService){
        this.doctorService=doctorService;
    }

    @PostMapping(value ="/saveDoctorRecord")
    public ResponseEntity<Object> saveDoctorInfo(@RequestBody DoctorMO doctorMO){
        try {
            if (doctorService.saveDoctorInfo(doctorMO))
                return new ResponseEntity<>(new SuccessMO(HttpStatus.CREATED.value(),
                        "Doctor created successfully"), HttpStatus.CREATED);
        } /*catch (CustomException customException) {
            return new ResponseEntity(customException.getErrorMOList(), HttpStatus.INTERNAL_SERVER_ERROR);
        } */catch (Exception e) {
            return new ResponseEntity<>(new ErrorMO(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getLocalizedMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(new ErrorMO(HttpStatus.BAD_REQUEST.value(), "Doctor creation Failed"), HttpStatus.BAD_REQUEST);
    }


//delete doctor on the basis of doctorID
//get All doctor info
//get Single doctor on the basis of doctorID
//update doctor on the basis of DoctorID

}
