package fr.paris8.iutmontreuil.monpetitbonsai.bonsai.infrastuture.Repository;

import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.domain.Modele.Bonsai;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class BonsaiRepository{

    private final BonsaiDao bonsaiDao;
    private BonsaiMapper bonsaiMapper;


    public BonsaiRepository(BonsaiDao bonsaiDao) {
        this.bonsaiDao = bonsaiDao;
    }


    @GetMapping("/{uuid}")
    public Optional<Bonsai> findById(UUID uuid) {
        return bonsaiDao.findById(uuid)
                .map(BonsaiMapper::EntityToBonsai);
    }


    @GetMapping
    public List<Bonsai> findAll() {
        return bonsaiDao.findAll().stream()
                .map(BonsaiMapper::EntityToBonsai)
                .collect(Collectors.toList());
    }





    //a modifier le meme que pour le create
    @PostMapping
    public BonsaiEntity create(@RequestBody BonsaiEntity bonsai){
        return bonsaiDao.save(bonsai);
    }
//


//ok
     @DeleteMapping
     public void deleteById(UUID id) {
        bonsaiDao.deleteById(id);
    }
//



//a modifier le meme que pour le create

    public Bonsai patch(Bonsai bonsai, UUID id){
        return bonsaiDao.save(bonsai);
    }


    }
//


