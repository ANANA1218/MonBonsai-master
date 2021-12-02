package fr.paris8.iutmontreuil.monpetitbonsai.bonsai.exposition.DTO;

import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.domain.Modele.Bonsai;
import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.domain.Modele.BonsaiService;
import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.infrastuture.Repository.BonsaiEntity;
import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.infrastuture.Repository.BonsaiMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bonsais")
public class BonsaiController {


    private BonsaiService bonsaiService;


    public BonsaiController(BonsaiService bonsaiService) {
        this.bonsaiService = bonsaiService;
    }

    // modifier
    @GetMapping
    public List<Bonsai> findAll() {
        return bonsaiService.findAll().stream()
                .map(BonsaiMapper::EntityToBonsai)
                .collect(Collectors.toList());
    }
    //


    // modifier
    @GetMapping("/{uuid}")
    public ResponseEntity<Bonsai> findById(@PathVariable("uuid") UUID uuid){
        return bonsaiService.findById(uuid)
                .map(BonsaiMapper::EntityToBonsai)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //


// modifier
    @PostMapping

        public BonsaiEntity create(@RequestBody BonsaiEntity bonsai){
            return bonsaiService.create(bonsai);
        }



    //

    
    // OK
    @DeleteMapping("/{uuid}")
    public ResponseEntity<BonsaiEntity> delete(@PathVariable("uuid") UUID uuid){
        bonsaiService.deleteById(uuid);
        return ResponseEntity.ok().build();

    }
    //
    
    
    // modifier
    @PatchMapping("/{uuid}")
    public BonsaiService patch(@RequestBody BonsaiEntity bonsai, @PathVariable("uuid") UUID uuid){

            return bonsaiService;
        }


    
//

}



