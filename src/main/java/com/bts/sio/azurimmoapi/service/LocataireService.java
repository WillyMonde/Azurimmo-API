package com.bts.sio.azurimmoapi.service;

/**import com.bts.sio.azurimmoapi.model.Contrat;**/
import com.bts.sio.azurimmoapi.model.Locataire;
/**import com.bts.sio.azurimmoapi.repository.ContratRepository;**/
import com.bts.sio.azurimmoapi.repository.LocataireRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class LocataireService {

    @Autowired
    private LocataireRepository locataireRepository;

    public Iterable<Locataire> getLocataires() {
        return locataireRepository.findAll();
    }

    public Optional<Locataire> getLocataireById(final Long id) {
        return locataireRepository.findById(id);
    }

    public void deleteLocataire(final Long id) {
        locataireRepository.deleteById(id);
    }

    public Locataire saveLocataire(Locataire locataire) {
        Locataire saved = locataireRepository.save(locataire);
        return saved;
    }
}