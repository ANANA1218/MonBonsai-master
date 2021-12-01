package fr.paris8.iutmontreuil.monpetitbonsai.bonsai.domain.Modele;

import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.infrastuture.Repository.BonsaiEntity;
import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.infrastuture.Repository.BonsaiRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Service
public class BonsaiService {

    @OneToMany
    private BonsaiRepository repository;

    public BonsaiService(BonsaiRepository repository){
        this.repository=repository;
    }
    public ResponseEntity<BonsaiEntity> findById(UUID id) {
        return repository.findById(id);
    }

    public List<Bonsai> findAll() {
        return repository.findAll();
    }

//a modifier
    public Bonsai save(Bonsai bonsai) {
        return repository.save(bonsai);
    }
//

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

    public Bonsai patch(Bonsai bonsai, UUID id) {
        return repository.patch(bonsai, id);
    }


}
