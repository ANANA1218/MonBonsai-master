package fr.paris8.iutmontreuil.monpetitbonsai.bonsai.domain.Modele;

import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.infrastuture.Repository.BonsaiRepository;
import org.springframework.stereotype.Service;

import javax.persistence.OneToMany;
import java.util.*;

@Service
public class BonsaiService {

    @OneToMany
    private BonsaiRepository repository;

    public BonsaiService(BonsaiRepository repository){
        this.repository=repository;
    }
    public Optional<Bonsai> findById(UUID id) {
        return repository.findById(id);
    }

    public List<Bonsai> findAll() {
        return repository.findAll();
    }


    public Bonsai create(Bonsai bonsai) {
        return repository.create(bonsai);
    }

    public Bonsai updat(Bonsai bonsai, UUID id) {
        return repository.update(bonsai, id);
    }

    public Bonsai updatStatus(Bonsai bonsai, UUID id) {
        return repository.update(bonsai, id);
    }


    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

    public List<Watering> getWatering(UUID uuid) {
        return repository.getWatering(uuid);
    }
    public List<Repotting> getRepotting(UUID uuid) {
        return repository.getRepotting(uuid);
    }
    public List<Pruning> getPruning(UUID uuid) {
        return repository.getPruning(uuid);
    }
}
