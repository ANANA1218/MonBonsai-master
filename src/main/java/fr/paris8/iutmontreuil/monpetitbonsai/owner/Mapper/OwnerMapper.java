package fr.paris8.iutmontreuil.monpetitbonsai.owner.Mapper;


import fr.paris8.iutmontreuil.monpetitbonsai.bonsai.infrastuture.Repository.Entity.BonsaiEntity;
import fr.paris8.iutmontreuil.monpetitbonsai.owner.Bonsai;
import fr.paris8.iutmontreuil.monpetitbonsai.owner.DTO.BonsaiDTO;
import fr.paris8.iutmontreuil.monpetitbonsai.owner.DTO.OwnerDTO;
import fr.paris8.iutmontreuil.monpetitbonsai.owner.Owner;
import fr.paris8.iutmontreuil.monpetitbonsai.owner.OwnerEntity.OwnerEntity;


public class OwnerMapper {


    public static OwnerDTO OwnertoDto(Owner owner) {
        OwnerDTO ownerDTO = new OwnerDTO();
        ownerDTO .setId(owner.getId());
        ownerDTO .setName(owner.getName());
        return ownerDTO ;
    }




    public static Owner DtoToOwner (OwnerDTO ownerDTO){
        Owner ownerdto = new Owner();
        ownerdto.setId(ownerDTO.getId());
        ownerdto.setName(ownerDTO.getName());

        return ownerdto;
    }

    public static Owner EntityToOwner (OwnerEntity ownerEntity){
        Owner ownerentity = new Owner();
        ownerentity.setId(ownerEntity.getId());
        ownerentity.setName(ownerEntity.getName());

        return  ownerentity;
    }

    public static OwnerEntity OwnerToEntity (Owner owner){
        OwnerEntity ownerEntity= new OwnerEntity();
        ownerEntity.setId(owner.getId());
        ownerEntity.setName(owner.getName());


        return ownerEntity;
    }

    public static Bonsai EntityToBonsai(BonsaiEntity bonsaiEntity) {
        Bonsai bonsai = new Bonsai();
        bonsai.setId(bonsaiEntity.getId());
        bonsai.setName(bonsaiEntity.getName());
        bonsai.setSpecies(bonsaiEntity.getSpecies());
        bonsai.setAcquisition_age(bonsaiEntity.getAcquisition_age());
        return bonsai;
    }
    public static BonsaiEntity BonsaitoEntity(Bonsai bonsai) {
        BonsaiEntity bonsaiEntity = new BonsaiEntity();
        bonsaiEntity.setId(bonsai.getId());
        bonsaiEntity.setName(bonsai.getName());
        bonsaiEntity.setSpecies(bonsai.getSpecies());
        bonsaiEntity.setAcquisition_age(bonsai.getAcquisition_age());
        return bonsaiEntity;
    }

    public static Bonsai DTOtoBonsai(BonsaiDTO bonsaiDto) {
        fr.paris8.iutmontreuil.monpetitbonsai.owner.Bonsai bonsai = new fr.paris8.iutmontreuil.monpetitbonsai.owner.Bonsai();
        bonsai.setId(bonsaiDto.getId());
        bonsai.setName(bonsaiDto.getName());
        bonsai.setSpecies(bonsaiDto.getSpecies());
        bonsai.setAcquisition_age(bonsaiDto.getAcquisition_age());
        return bonsai;
    }

    public static BonsaiDTO BonsaitoDTO(Bonsai bonsai) {
        BonsaiDTO bonsaiDto = new BonsaiDTO();
        bonsaiDto.setId(bonsai.getId());
        bonsaiDto.setName(bonsai.getName());
        bonsaiDto.setSpecies(bonsai.getSpecies());
        bonsaiDto.setAcquisition_age(bonsai.getAcquisition_age());
        return bonsaiDto;
    }

}