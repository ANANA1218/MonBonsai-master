package fr.paris8.iutmontreuil.monpetitbonsai.owner.Repository;


import fr.paris8.iutmontreuil.monpetitbonsai.owner.Bonsai;
import fr.paris8.iutmontreuil.monpetitbonsai.owner.DAO.BonsaiDAO;
import fr.paris8.iutmontreuil.monpetitbonsai.owner.DAO.OwnerDAO;
import fr.paris8.iutmontreuil.monpetitbonsai.owner.Mapper.OwnerMapper;

import fr.paris8.iutmontreuil.monpetitbonsai.owner.Owner;
import fr.paris8.iutmontreuil.monpetitbonsai.owner.OwnerEntity.OwnerEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class OwnerRepository {



    private static OwnerDAO ownerDao;
    private static BonsaiDAO bonsaiDao;

    public OwnerRepository() {
    }



    //ok
    public Optional<Owner> findById(UUID uuid) {
        return ownerDao.findById(uuid)
                .map(OwnerMapper::EntityToOwner);

    }
//

    //ok
    public List<Owner> findAll() {
        return ownerDao.findAll().stream()
                .map(OwnerMapper::EntityToOwner)
                .collect(Collectors.toList());
    }

//

    public Owner create(Owner owner){

        OwnerEntity ownerEntity = OwnerMapper.OwnerToEntity(owner);
        OwnerEntity save = ownerDao.save(ownerEntity);

        return OwnerMapper.EntityToOwner(save);
    }


//ok

    public void deleteById(UUID id) {
        ownerDao.deleteById(id);
    }
//

    public List<Bonsai> getBonsai(UUID id) {
        return bonsaiDao.findAll()
                .stream()
                .filter(bonsai -> bonsai.getOwnerEntity().getId().equals(id))
                .map(OwnerMapper::EntityToBonsai)
                .collect(Collectors.toList());
    }

}