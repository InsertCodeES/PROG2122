package Figuras;

public class Circunferencia {

    private int radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public float longitud() {
        return (float) (2*3.14*radio);
    }

    public float area() {
        return (float) (3.14*Math.pow(radio,2));
    }

    public float volumen() {
        return (float) (4*3.14*Math.pow(radio,3)/3);
    }
}
