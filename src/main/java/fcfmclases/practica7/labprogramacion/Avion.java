package fcfmclases.practica7.labprogramacion;
/** PRACTICA 7 "POLIMORFISMO GENERIC"
 * CLASE HIJA "AVION"
 * @since 17/03/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 */
public class Avion extends Transporte implements IVolar, ISElectrico, ISFrenos{
     //  M E T O D O  C O N S T R U C T O R
    public Avion(int velocidad, int gas){
        super(velocidad, gas);
    }
    //   M E T O D O S
    public void Despegar(int gas){
        if(gas>150){
            System.out.println("EL AVION ESTA DESPEGANDO!");
        }else{
            System.out.println("NO ES POSIBLE DESPEGAR BAJO COMBUSTIBLE");
        }
    }
    
    @Override
    public void encender(int gas) {
        if(gas>150){
            System.out.println("MOTRES DEL AVION ENCENDIDOS!");
            System.out.println("NIVEL DE GASOLINA: "+gas);
        }else{
            System.out.println("NO HAY SUFICIENTE GASOLINA!");
            System.out.println("NIVEL DE GASOLINA: "+gas);
        }
    }
    
    @Override
    public String volar() {
        System.out.println("AVION DESPEGANDO...");
        return "EL AVION ESTA VOLANDO!";
    }
    
    //INTERFACE SISTEMA ELECTRICO
    @Override
    public String EncenderLuces() {
        return "LUCES ENCENDIDAS!";
    }
    @Override
    public String upVidrio() {
        System.out.println("SUBIENDO VIDRIO..."); 
        return "SUBIENDO VIDRIO...";
    }

    //INTERFACE SISTEMA FRENOS
    @Override
    public String Frenar() {
        return "LUCES ENCENDIDAS";
    }
    
}
