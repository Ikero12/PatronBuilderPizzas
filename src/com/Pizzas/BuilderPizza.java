package com.Pizzas;

public class BuilderPizza {
    //Objeto que va a construir una pizza con todos los parámetros.
    //Se usa el guión bajo para remarcar que es un objeto de esta clase
    private Pizzas _pizza;

    public Pizzas build(){
       return this._pizza;
    }

    public BuilderPizza(){
        _pizza=new Pizzas();
    }

    public BuilderPizza setTipoMasa(int tipoMasa){
        _pizza.setMasa(tipoMasa);
        return this;
    }

    public BuilderPizza setSize (int Tamaño){
        _pizza.setTamaño(Tamaño);
        return this;

    }

    public BuilderPizza setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }

    public BuilderPizza setCebolla(boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;

    }

    public BuilderPizza setSinGluten(boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;

    }

    public BuilderPizza setRecojida(int recojida) {
        _pizza.setRecogida(recojida);
        return this;
    }


}
