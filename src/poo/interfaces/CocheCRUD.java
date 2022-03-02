package poo.interfaces;

import java.util.List;



    public interface CocheCRUD {

        void save(CocheCRUDImpl Coche);

        List<CocheCRUDImpl> findAll();

        void delete(CocheCRUDImpl Coche);

}
