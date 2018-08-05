

package interfaz;


public class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
   
    
    
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularPerimetro(){
        System.out.println("Perimetro del circulo:");
    return 2*(PI*radio);
    }
    
    @Override
    public double calcularArea(){
        System.out.println("Perimetro del circulo:");
    return PI*radio;
    }
    
}
