package com.bts.sio.azurimmoapi.repository;

import com.bts.sio.azurimmoapi.model.Locataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocataireRepository  extends JpaRepository<Locataire, Long> {
}
