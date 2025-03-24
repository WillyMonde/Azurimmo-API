package com.bts.sio.azurimmoapi.repository;

import com.bts.sio.azurimmoapi.model.Reparation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReparationRepository  extends JpaRepository<Reparation, Long> {
}
