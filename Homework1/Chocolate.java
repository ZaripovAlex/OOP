package org.example;

public class Chocolate extends Product{
    private String typeChocolate;
    private int ProcentCocao;
    public Chocolate(String name, double cost, int procentCocao) {
        super(name, cost);
        this.ProcentCocao = procentCocao;
        if (procentCocao < 20) {
            this.typeChocolate = "Белый";
        }else if(procentCocao>20 && procentCocao<40) {
            this.typeChocolate = "Молочный";
        }else if (procentCocao>=40 && procentCocao<56) {
            this.typeChocolate = "Темный";
        }else{
            this.typeChocolate ="Черный";
        }
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" Процент какао: %d", ProcentCocao));
        localString.append(String.format(" Цвет шоколада: %s", typeChocolate));
        return localString.toString();
    }
}
