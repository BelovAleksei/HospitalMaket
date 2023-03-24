package org.example.dao;

import org.example.model.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentDAO extends JpaRepository<Treatment, Long> {

}