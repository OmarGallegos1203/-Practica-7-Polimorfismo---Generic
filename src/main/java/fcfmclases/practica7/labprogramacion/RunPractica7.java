package fcfmclases.practica7.labprogramacion;;
/** PRACTICA 7 "POLIMORFISMO GENERIC"
 * RUN FILE
 * @since 17/03/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 */
public class RunPractica7 {
    public static void main(String[] args) {
        //LOGIN DATOS CLASE AUTOMOVIL
        Automovil bocho = new Automovil(60,50);
        bocho.setMarca("Bocho");
        bocho.setModelo("1990");
        //LOGIN DATOS CLASE AUTOBUS
        Autobus camion = new Autobus(30, 80);
        camion.setMarca("mazda");
        camion.setModelo("2000");
        //LOGIN DATOS CLASE HELICOPTERO
        Helicoptero azteca = new Helicoptero(200, 150);
        azteca.setMarca("Apache");
        azteca.setModelo("2010");
        //LOGIN DATOS CLASE AVION
        Avion boing = new Avion(500, 200);
        boing.setMarca("Boing");
        boing.setModelo("2015");
        //LOGIN DATOS CLASE BARCO
        Barco titan = new Barco(90 ,50);
        titan.setMarca("Titan");
        titan.setModelo("1982");
        
        //  P R I N T
        //Automovil
        System.out.println("\n\n\tAutomovil - Clase Hija ");
        System.out.println("Marca: "+bocho.getMarca());
        System.out.println("Modelo: "+bocho.getModelo());
        bocho.encender(50);
        System.out.println(bocho.EncenderLuces());
        System.out.println(bocho.upVidrio());
        bocho.opCajuela();
        System.out.println(bocho.Frenar());
        bocho.acelerar(60, 50);
        //Autobus
        System.out.println("\n\n\tAutobus - Clase Hija ");
        System.out.println("Marca: "+camion.getMarca());
        System.out.println("Modelo: "+camion.getModelo());
        camion.encender(80);
        System.out.println(camion.EncenderLuces());
        System.out.println(camion.upVidrio());
        camion.onAlarma();
        System.out.println(camion.Frenar());
        camion.acelerar(30, 80);
        //Helicoptero
        System.out.println("\n\n\tHelicoptero - Clase Hija ");
        System.out.println("Marca: "+azteca.getMarca());
        System.out.println("Modelo: "+azteca.getModelo());
        azteca.encender(150);
        System.out.println(azteca.EncenderLuces());
        System.out.println(azteca.upVidrio());
        azteca.onHelice(150);
        System.out.println(azteca.Frenar());
        azteca.acelerar(200, 150);
        //Avion
        System.out.println("\n\n\tAvion - Clase Hija ");
        System.out.println("Marca: "+boing.getMarca());
        System.out.println("Modelo: "+boing.getModelo());
        boing.encender(200);
        System.out.println(boing.EncenderLuces());
        System.out.println(boing.upVidrio());
        boing.Despegar(200);
        System.out.println(boing.Frenar());
        boing.acelerar(500, 200);
        //Barco
        System.out.println("\n\n\tBarco - Clase Hija ");
        System.out.println("Marca: "+titan.getMarca());
        System.out.println("Modelo: "+titan.getModelo());
        titan.encender(150);
        System.out.println(titan.EncenderLuces());
        System.out.println(titan.upVidrio());
        titan.onRadar();
        System.out.println(titan.Frenar());
        titan.acelerar(90, 50);
    }
}

/*
IMPOSTAMOS PARA PODER USAR EL "ARRAY LIST"
Un array List soporta dodos los tipos de datos de Java
HACEMOS UN POLIMORFISMO GENERICO PARA QUE NUESTRO ARRAYLIST SOLO SOPORTE DATOS DE TIPO
AUTOMOVIL, BARCO, AVION, etc.
UTILIZANDO EL "GENERIC" ( < > )
*/