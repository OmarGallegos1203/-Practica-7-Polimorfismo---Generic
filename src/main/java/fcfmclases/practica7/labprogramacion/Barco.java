package fcfmclases.practica7.labprogramacion;
/** PRACTICA 7 "POLIMORFISMO GENERIC"
 * RCLASE HIJA "BARCO"
 * @since 17/03/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 */
public class Barco extends Transporte implements ISElectrico, ISFrenos{
    //  M E T O D O  C O N S T R U C T O R
    public Barco(int velocidad, int gas){
        super(velocidad, gas);
    }
    //  M E T O D O S
    public void onRadar(){
        System.out.println("ECENDIENDO RADAR!");
    }
    
    @Override
    public void encender(int gas) {
        if(gas>10){
            System.out.println("MOTOR DE BARCO ENCENDIDO!");
            System.out.println("NIVEL DE GASOLINA: "+gas);
        }else{
            System.out.println("NO HAY SUFICIENTE GASOLINA!");
            System.out.println("NIVEL DE GASOLINA: "+gas);
        }
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














