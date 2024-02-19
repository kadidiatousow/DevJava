package services;


import java.util.List;

import entities.zone;
import repository.zonerepository;

public class zoneservice {
    private zonerepository zonerepository=new zonerepository();

    public List<zone> listerZone(){
        return zonerepository.selectAll();
    }
}
