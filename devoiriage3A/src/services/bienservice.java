package services;

public class bienservice {
    bienrepository bienrepository=new bienrepository();
public void ajouterBien(bien bien){
    bienrepository.insert(bien);
}

public List<bien> listerBien(){
    return bienrepository.selectAll();
}
}
