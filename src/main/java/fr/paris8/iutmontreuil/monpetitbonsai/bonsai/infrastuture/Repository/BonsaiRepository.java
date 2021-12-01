package fr.paris8.iutmontreuil.monpetitbonsai.bonsai.infrastuture.Repository;

import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.domain.Modele.Bonsai;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class BonsaiRepository{

    private final BonsaiDao bonsaiDao;



    public BonsaiRepository(BonsaiDao bonsaiDao) {
        this.bonsaiDao = bonsaiDao;
    }


    @GetMapping("/{uuid}")
    public ResponseEntity<BonsaiEntity> findById(@PathVariable("uuid") UUID uuid){
        return bonsaiDao.findById(uuid)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // a modifier
    @GetMapping
    public List<Bonsai> findAll() {
        List<BonsaiEntity> bonsaiEntityList = bonsaiDao.findAll();
        List<Bonsai> bonsaiList = new ArrayList<>();

        return bonsaiList;
    }
    //


    //a modifier
    @PostMapping
    public Bonsai save(@RequestBody BonsaiEntity bonsai){


        return (Bonsai) bonsaiDao.save(bonsai);
    }
//


//ok
     @DeleteMapping
     public void deleteById(UUID id) {
        bonsaiDao.deleteById(id);
    }
//



//a modifier
    public Bonsai patch(Bonsai bonsai, UUID id) {

        return bonsai;
    }
//

}
