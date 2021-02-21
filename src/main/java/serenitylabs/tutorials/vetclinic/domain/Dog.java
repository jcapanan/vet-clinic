package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class Dog {
    private final String name;
    private final String breed;
    private final LocalDate dateOfBirth;
    private final String favouriteToy;
    private final String colour;
    private final String favouriteFood;

    public Dog(String name, String breed, String colour, String favouriteFood, LocalDate dateOfBirth, String favouriteToy) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.favouriteFood = favouriteFood;
        this.dateOfBirth = dateOfBirth;
        this.favouriteToy = favouriteToy;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() { return colour; }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }
}
