package com.Pizzas;

public class Pizzas {
    int masa;
    boolean relleno;
    int tamaño;
    boolean salsa;
    int recogida;
    String tipoSalsa;
    boolean cebolla;
    boolean sinGluten;
    boolean extraQueso;
    boolean piña;
    boolean champiñones;
    boolean jamon;

//tipo de masa

    public static final int FINA = 0;
    public static final int PAN = 1;

    //tamaño de la pizza

    public static final int SMALL = 2;
    public static final int MEDIUM = 3;
    public static final int BIG = 4;

    //Recogida

    public static final int ENTIENDA = 0;
    public static final int PARALLEVAR = 1;

    public Pizzas(int masa, boolean relleno, int tamaño, boolean salsa, int recogida, String tipoSalsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tamaño = tamaño;
        this.salsa = salsa;
        this.recogida = recogida;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
    }

    public Pizzas() {
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public int getRecogida() {
        return recogida;
    }

    public void setRecogida(int recogida) {
        this.recogida = recogida;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return "Pizzas" +
                "\n masa =" + masa +
                "\n relleno = " + relleno +
                "\n tamaño = " + tamaño +
                "\n salsa = " + salsa +
                "\n recogida = " + recogida +
                "\n tipoSalsa = " + tipoSalsa +
                "\n cebolla = " + cebolla +
                "\n sinGluten = " + sinGluten +
                "\n extraQueso = " + extraQueso +
                "\n piña = " + piña +
                "\n champiñones = " + champiñones +
                "\n jamon = " + jamon
                ;



    }
}
