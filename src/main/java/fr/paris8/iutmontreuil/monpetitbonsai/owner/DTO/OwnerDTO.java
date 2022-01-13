package fr.paris8.iutmontreuil.monpetitbonsai.owner.DTO;


import fr.paris8.iutmontreuil.monpetitbonsai.owner.Bonsai;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OwnerDTO {
    private UUID id;
    private String name;
    private List<Bonsai> bonsai = new ArrayList<>();

    public OwnerDTO() {
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

    public  void setName(String name) {
        this.name = name;
    }

    public List<Bonsai> getBonsai() {
        return bonsai;
    }

    public void setBonsai(List<Bonsai> bonsai) {
        this.bonsai = bonsai;
    }
}