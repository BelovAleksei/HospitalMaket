package org.example.service;

import org.example.model.Doctor;


import java.util.List;

public interface DoctorService {

    Doctor createDoctor(Doctor doctor);

    Doctor getDoctorById(Long id);

    List<Doctor> getAllDoctors();

    Doctor updateDoctor(Long id, Doctor doctor);

    void deleteDoctor(Long doctor);

    Doctor addDoctor(Doctor doctor);
}