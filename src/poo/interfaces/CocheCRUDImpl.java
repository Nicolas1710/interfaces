package poo.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

   /** // 1. Atributos

    String fabricante;
    String modelo;
    int year;
    boolean sport;


    // 2. Constructores

    public CocheCRUDImpl(){}

    public CocheCRUDImpl(String fabricante, String modelo, int year, boolean sport) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.sport = sport;
    }
    **/


    // 3. Metodos

    List<CocheCRUDImpl> coches = new ArrayList<>();

    public void save(CocheCRUDImpl Coche){
        coches.add(Coche);
    }

    public List<CocheCRUDImpl> findAll(){
        return null;
    }

    @Override
    public void delete(CocheCRUDImpl Coche) {

    }


}
