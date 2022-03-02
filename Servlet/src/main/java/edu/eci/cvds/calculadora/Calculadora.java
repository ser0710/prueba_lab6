package edu.eci.cvds.calculadora;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

@ManagedBean(name = "calculadoraBean")
@ApplicationScoped


public class Calculadora {

    private double resModa;
    private double resMediana;
    private double resVarianza;
    private double resDesvEstandar;
    private int cantNum;
    private String numeros;


    public Calculadora(){
    }

    public double getResModa() {
        return resModa;
    }

    public void setResModa(double resModa) {
        this.resModa = resModa;
    }

    public double getResMediana() {
        return resMediana;
    }

    public void setResMediana(double resMediana) {
        this.resMediana = resMediana;
    }

    public double getResVarianza() {
        return resVarianza;
    }

    public void setResVarianza(double resVarianza) {
        this.resVarianza = resVarianza;
    }

    public double getResDesvEstandar() {
        return resDesvEstandar;
    }

    public void setResDesvEstandar(double resDesvEstandar) {
        this.resDesvEstandar = resDesvEstandar;
    }

    public int getCantNum() {
        return cantNum;
    }

    public void setCantNum(int cantNum) {
        this.cantNum = cantNum;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }


}
