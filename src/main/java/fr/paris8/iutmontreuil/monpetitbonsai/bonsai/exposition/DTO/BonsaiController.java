package fr.paris8.iutmontreuil.monpetitbonsai.bonsai.exposition.DTO;

import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.domain.Modele.BonsaiService;
import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.infrastuture.Repository.BonsaiDao;
import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.infrastuture.Repository.BonsaiEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bonsais")
public class BonsaiController {


    private BonsaiDao bonsaiDao;
  

    public BonsaiController(BonsaiDao bonsaiDao) {
        this.bonsaiDao = bonsaiDao;
    }


    // modifier
    @GetMapping
    public List<BonsaiEntity> FindAllBonsai(){

        return bonsaiDao.findAll();
    }
    //


    // modifier
    @GetMapping("/{uuid}")
    public ResponseEntity<BonsaiEntity> findById(@PathVariable("uuid") UUID uuid){
        return bonsaiDao.findById(uuid)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //


// modifier
    @PostMapping
    public BonsaiEntity save(@RequestBody BonsaiEntity bonsai){




        return bonsaiDao.save(bonsai);
    }
    //

    
    // OK
    @DeleteMapping("/{uuid}")
    public ResponseEntity<BonsaiEntity> delete(@PathVariable("uuid") UUID uuid){
        bonsaiDao.deleteById(uuid);
        return ResponseEntity.ok().build();

    }
    //
    
    
    // modifier
    @PatchMapping("/{uuid}")
    public ResponseEntity<BonsaiEntity> patch(@RequestBody BonsaiEntity bonsai,@PathVariable("uuid") UUID uuid){


        return (ResponseEntity<BonsaiEntity>) bonsaiDao;
    }
    
//

}



