package org.animalia.species;

public record Bird(String species, double wingSpan, boolean canFly) {
    public Bird() {
        this("Pidgeon", 20, true);
    }
}
