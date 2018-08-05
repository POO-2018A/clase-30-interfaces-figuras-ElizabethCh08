

package interfaz;

public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    
    
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double calcularPerimetro(){
    System.out.println("Perimetro del cuadrado:");
    return lado+lado+lado+lado;
    }
    
    @Override
    public double calcularArea(){
    System.out.println("Area del cuadrado:");
    return lado*lado;
    }
}
