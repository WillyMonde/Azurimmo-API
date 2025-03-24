package com.bts.sio.azurimmoapi.service;

import com.bts.sio.azurimmoapi.model.Reparation;
import com.bts.sio.azurimmoapi.repository.ReparationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ReparationService {

    @Autowired
    private ReparationRepository reparationRepository;

    public Iterable<Reparation> getReparations() {
        return reparationRepository.findAll();
    }

    public Optional<Reparation> getReparationById(final Long id) {
        return reparationRepository.findById(id);
    }

    public void deleteReparation(final Long id) {
        reparationRepository.deleteById(id);
    }

    public Reparation saveReparation(Reparation reparation) {
        Reparation saved = reparationRepository.save(reparation);
        return saved;
    }
}
