package entities;

import java.util.ArrayList;
import java.util.List;

public class bien {
    private int id;
    private String reference;
    private String description;
    private int prix;
    private String datecreation;
    List<zone> zone=new ArrayList<>();
    public List<zone> getComptes() {
        return zone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    public String getDatecreation() {
        return datecreation;
    }
    public void setDatecreation(String datecreation) {
        this.datecreation = datecreation;
    }
    public List<zone> getZone() {
        return zone;
    }
    public void setZone(List<zone> zone) {
        this.zone = zone;
    }
    
    
}
