package com.bts.sio.azurimmoapi.service;

import com.bts.sio.azurimmoapi.model.Batiment;
import com.bts.sio.azurimmoapi.repository.BatimentRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
@Data
@Service
public class BatimentService {

    @Autowired
    private BatimentRepository batimentRepository;

    public Iterable<Batiment> getBatiments() {
        return batimentRepository.findAll();
    }

    public Optional<Batiment> getBatimentById(final Long id) {
        return batimentRepository.findById(id);
    }

    public void deleteBatiment(final Long id) {
        batimentRepository.deleteById(id);
    }

    public Batiment saveBatiment(Batiment batiment) {
        Batiment saved = batimentRepository.save(batiment);
        return saved;
    }
}
