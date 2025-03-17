package com.bts.sio.azurimmoapi.repository;


import com.bts.sio.azurimmoapi.model.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
}