package org.example.service;

import org.example.model.Treatment;

import java.util.List;

public interface TreatmentService {

    Treatment createTreatment(Treatment treatment);

    Treatment getTreatmentById(Long id);

    List<Treatment> getAllTreatments();

    List<Treatment> getTreatmentsByPatientId(Long patientId);

    Treatment updateTreatment(Long id, Treatment treatment);

    void deleteTreatment(Long treatment);

    Treatment addTreatment(Treatment treatment);
}