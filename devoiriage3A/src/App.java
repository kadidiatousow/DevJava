import java.util.List;
import java.util.Scanner;

import entities.zone;
import services.zoneservice;
import services.bienservice;

public class App {
    public static void main(String[] args) throws Exception {
       int choix;
        Scanner sc=new Scanner(System.in);
        zoneservice zoneservice=new zoneservice();
        bienservice bienservice=new bienservice();
        sc.nextLine();
            do{
            System.out.println("1-créér une zone");
            System.out.println("2-Lister zone");
            System.out.println("3-ajouter un bien et lui associer une zone");
            System.out.println("4-lister les biens en affichant le nom de la zone");
            System.out.println("5-quitter");
                choix=sc.nextInt();
                sc.nextLine();
                switch (choix) {
                    case 1:
                    System.out.println("Entrer une zone");
                    String id=sc.nextLine();
                    String nomzone;
                    zone zone= zoneservice.rechercherZoneByNom(nomzone);
                    if (zone!=null) {
                        System.out.println("la zone existe déjà");
                    } else {
                        System.out.println("Entrer un nom");
                        nomzone=sc.nextLine();
                        System.out.println("Entrer un id");
                        id=sc.nextLine();
                        zone= new zone();
                        zone.setNomzone(nomzone);
                        zone.setId(id);
                        zoneservice.ajouterZone(client);
                    }
                        break;
                
                    case 2:
                     List<zone> zones= zoneservice.listerZone();
                        for (zone zn : zones) {
                            System.out.println("Numerozone "+ zone.getNomzone());
                            System.out.println("Telephone "+ zone.getId());
                            System.out.println("================================");
                        }
                        break;
                }
            }

    }
}
