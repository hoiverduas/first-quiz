package org.velezreyes.quiz.question6;

public class Beverage implements Drink {
    private String name;  // Nombre de la bebida.
    private boolean fizzy;  // Variable para indicar si la bebida tiene gas o no.

    public Beverage(String name, boolean fizzy) {
        this.name = name;
        this.fizzy = fizzy;
    }

    @Override
    public String getName() {
        return name;  // Devuelve el nombre de la bebida.
    }

    @Override
    public boolean isFizzy() {
        return fizzy;  // Devuelve true si la bebida tiene gas, false si no.
    }
}

