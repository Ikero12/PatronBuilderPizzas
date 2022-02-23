package com.Pizzas;

import static com.Pizzas.Pizzas.*;

public class Main {

    public static void main(String[] args) {

        Pizzas miPizza;

       /* Instanciamos builder básico
        BuilderPizza miBuilder = new BuilderPizza();

       BuilderPizza miBuilder2 = miBuilder.setTipoMasa(FINA);

        miPizza = miBuilder.build();

        System.out.println(miPizza.toString()); */

        miPizza = new BuilderPizza().setTipoMasa(FINA).setSize(SMALL).build();

        System.out.println(miPizza.toString());

        Pizzas miPizza2 = new BuilderPizza().setSize(BIG).setTipoMasa(FINA).setRelleno(true).build();
        System.out.println(miPizza2.toString());
    }
}
