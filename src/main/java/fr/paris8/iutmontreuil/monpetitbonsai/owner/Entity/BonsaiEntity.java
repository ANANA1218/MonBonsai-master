package fr.paris8.iutmontreuil.monpetitbonsai.owner.Entity;
import fr.paris8.iutmontreuil.monpetitbonsai.owner.OwnerEntity.OwnerEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity(name = "bonsai")
@Table(name = "bonsai")
public class BonsaiEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "species")
    private String species;
    @Column(name = "acquisition_date")
    private Date acquisition_date;
    @Column(name = "acquisition_age")
    private int acquisition_age;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private fr.paris8.iutmontreuil.monpetitbonsai.owner.OwnerEntity.OwnerEntity ownerEntity;


    public BonsaiEntity() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Date getAcquisition_date() {
        return acquisition_date;
    }

    public void setAcquisition_date(Date acquisition_date) {
        this.acquisition_date = acquisition_date;
    }

    public int getAcquisition_age() {
        return acquisition_age;
    }

    public void setAcquisition_age(int acquisition_age) {
        this.acquisition_age = acquisition_age;
    }

    public OwnerEntity getOwnerEntity() {
        return ownerEntity;
    }

    public void setOwnerEntity(OwnerEntity ownerEntity) {
        this.ownerEntity = ownerEntity;
    }
}