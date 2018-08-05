
package interfaz;

public class Rectangulo implements Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    

    @Override
    public double calcularPerimetro() {
        System.out.println("Perimetro del rectangulo:");
        return 2*(base+altura);
    }

    @Override
    public double calcularArea() {
        System.out.println("Perimetro del rectangulo:");
        return base*altura;
    }
    
    
}
