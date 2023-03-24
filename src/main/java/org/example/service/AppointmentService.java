package org.example.service;

import org.example.model.Appointment;
import org.example.model.Patient;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentService {

    Appointment createAppointment(Patient patient, LocalDateTime dateTime);

    Appointment getAppointmentById(Long id);

    List<Appointment> getAppointmentsByPatient(Patient patient);

    List<Appointment> getAppointmentsByDoctor(Long doctorId);

    Appointment updateAppointment(Long id, Appointment appointment);

    void deleteAppointment(Long appointment);

    List<Appointment> getAllAppointments();

    Appointment addAppointment(Appointment appointment);
}