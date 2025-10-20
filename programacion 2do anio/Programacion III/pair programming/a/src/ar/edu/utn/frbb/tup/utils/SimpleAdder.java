package ar.edu.utn.frbb.tup.utils;

public class SimpleAdder {

    public int sumaHistorica;
    
    public SimpleAdder(){
        sumaHistorica = 0;

    }

    public int add(int a, int b){
        this.sumaHistorica = sumaHistorica + a + b;
        return a + b;
    }
}
