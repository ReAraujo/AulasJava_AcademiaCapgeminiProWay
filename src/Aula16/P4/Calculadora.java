package Modulo02.Aula16.P4;

public class Calculadora {
    // Sobrecarga de métodos:

    public double soma(double v1, double v2){
        return v1 + v2;
    }

    public double soma(double v1, double v2, double v3){
        return v1 + v2 + v3;
    }

    public double soma(int v1, int v2){
        return v1 + v2;
    }
    
    public double soma(String v1, String v2){
        return Double.parseDouble(v1)  + Double.parseDouble(v2);
    }

    // public string soma(String v1, String v2){
    //     return v1  + v2;
    // }

    public double soma(String v1, String v2, String v3){
        return Double.parseDouble(v1)  + Double.parseDouble(v2) + Double.parseDouble(v3);
    }
}
