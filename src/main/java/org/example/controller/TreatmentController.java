package org.example.controller;

import org.example.model.Treatment;
import org.example.service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treatments")
public class TreatmentController {

    @Autowired
    private TreatmentService treatmentService;

    @GetMapping
    public ResponseEntity<List<Treatment>> getAllTreatments() {
        List<Treatment> treatments = treatmentService.getAllTreatments();
        return new ResponseEntity<>(treatments, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Treatment> getTreatmentById(@PathVariable("id") Long id) {
        Treatment treatment = treatmentService.getTreatmentById(id);
        return new ResponseEntity<>(treatment, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Treatment> addTreatment(@RequestBody Treatment treatment) {
        Treatment savedTreatment = treatmentService.addTreatment(treatment);
        return new ResponseEntity<>(savedTreatment, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Treatment> updateTreatment(@PathVariable("id") Long id, @RequestBody Treatment treatment) {
        Treatment updatedTreatment = treatmentService.updateTreatment(id, treatment);
        return new ResponseEntity<>(updatedTreatment, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTreatment(@PathVariable("id") Long id) {
        treatmentService.deleteTreatment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}