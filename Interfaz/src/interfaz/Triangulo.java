
package interfaz;

public class Triangulo implements Figura {
    
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;
    private double base;

    public Triangulo(double lado1, double lado2, double lado3, double altura, double base) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    
     @Override
    public double calcularPerimetro(){
        System.out.println("Perimetro del triangulo:");
    return lado1+lado2+lado3;
    }

    @Override
    public double calcularArea(){
    return (base*altura);
    }
    
    
}
