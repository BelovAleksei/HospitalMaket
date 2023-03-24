package org.example.dao;

import org.example.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorDAO extends JpaRepository<Doctor, Long> {

}