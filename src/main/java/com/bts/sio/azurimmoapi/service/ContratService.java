package com.bts.sio.azurimmoapi.service;


import com.bts.sio.azurimmoapi.model.Contrat;
import com.bts.sio.azurimmoapi.repository.ContratRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Data
@Service
public class ContratService {

    @Autowired
    private ContratRepository contratRepository;

    public Iterable<Contrat> getContrats() {
        return contratRepository.findAll();
    }

    public Optional<Contrat> getContratById(final Long id) {
        return contratRepository.findById(id);
    }

    public void deleteContrat(final Long id) {
        contratRepository.deleteById(id);
    }

    public Contrat saveContrat(Contrat contrat) {
        Contrat saved = contratRepository.save(contrat);
        return saved;
    }
}
