package fr.paris8.iutmontreuil.monpetitbonsai.owner.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OwnerDAO extends JpaRepository<fr.paris8.iutmontreuil.monpetitbonsai.owner.OwnerEntity.OwnerEntity, UUID> {

}