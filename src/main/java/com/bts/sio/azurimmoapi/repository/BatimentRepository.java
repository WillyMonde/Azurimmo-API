package com.bts.sio.azurimmoapi.repository;

import org.springframework.stereotype.Repository;
import com.bts.sio.azurimmoapi.model.Batiment;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BatimentRepository extends  JpaRepository<Batiment, Long> {
}
