package fr.paris8.iutmontreuil.monpetitbonsai.owner.DAO;

import fr.paris8.iutmontreuil.monpetitbonsai.owner.Entity.BonsaiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BonsaiDAO extends JpaRepository<BonsaiEntity, UUID> {


}