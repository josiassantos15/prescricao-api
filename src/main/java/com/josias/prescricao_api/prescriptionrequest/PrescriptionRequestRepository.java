package com.josias.prescricao_api.prescriptionrequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRequestRepository extends JpaRepository<PrescriptionRequest, Long> {
}
