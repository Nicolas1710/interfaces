package poo.interfaces;

public class mainInterfaces {



    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.findAll();
        System.out.println("cocheCrud.findAll()");

        cocheCrud.delete(new CocheCRUDImpl());
        System.out.println("cocheCrud.delete()");

        cocheCrud.save(new CocheCRUDImpl());
        System.out.println("cocheCrud.save(new CocheCRUDImpl());");



    }
}

// Crear una interfaz CocheCRUD.
//
//
//Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
//
//
//Como métodos de CocheCRUD podemos poner:
//
//
//save()
//findAll()
//delete() que simplemente impriman por consola el nombre del propio método.
//
//
//Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
//
//
//Ejemplo: CocheCRUD cocheCrud = new CocheCRUDImpl()