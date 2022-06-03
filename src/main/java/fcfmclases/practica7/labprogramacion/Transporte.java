package fcfmclases.practica7.labprogramacion;
/** PRACTICA 7 "POLIMORFISMO GENERIC"
 * CLASE PADRE "TRANSPORTE"
 * @since 17/03/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 */
public abstract class Transporte {
    // A T R I B U T O S
    public int velocidad, gas;
    private String marca;
    private String modelo;
    //  M E T O D O  C O N T R U C T O R
    public Transporte(int velocidad, int gas){
        this.velocidad = velocidad;
        this.gas = gas;
    }
    // M E T O D O  A B S T R AC T O
    public abstract void encender(int gas);
    // M E T O D O S
    public void acelerar(int velocidad, int gas){
        if(gas>20){
            System.out.println("ACELERANDO!");
            System.out.println("VELOCIDAD: "+velocidad);
        }else{
            System.out.println("NO HAY SUFICIENTE COMBUSTIBLE!");
        }
    }
    
    //ENCABSULAMIENDO GET Y SET
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //ENCABSULAMIENDO GET Y SET
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
/* CONSTRUCTOR: METODO QUE NO LLEVA TIPO CON EL MISMO NOMBRE DE LA CLASE
    public Transporte(){
        
    }
ES DE TIPO CLASE TRANSPORTE
*/