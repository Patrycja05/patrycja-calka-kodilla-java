package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String souce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String souce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder souce(String souce) {
            this.souce = souce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, souce, ingredients);
        }
    }

    private Bigmac(final String bun, final int burgers, final String souce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.souce = souce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSouce() {
        return souce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", souce='" + souce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
