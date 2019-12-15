package com.dao;

import com.entity.Doctor;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

@Repository
@Transactional
public class DoctorDAOImpl implements DoctorDAO {

    private SessionFactory sessionFactory;

    @Autowired
    DoctorDAOImpl(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    @Override
    public boolean saveDoctorInfo(Doctor doctor) {
        Session session=sessionFactory.openSession();
        Integer status=(Integer) session.save(doctor);
        if(status>0) return true;
        return false;
    }

    @Override
    public Integer getDoctorID() {
        Session session=sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Doctor> criteria = builder.createQuery(Doctor.class);





        return null;
    }
}
