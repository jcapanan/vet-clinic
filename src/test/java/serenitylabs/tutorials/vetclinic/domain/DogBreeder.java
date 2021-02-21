package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class DogBreeder implements WithBreed, WithColour {
        private String name;
        private String breed;
        private String colour;
        private String favouriteFood;
        private String favouriteToy;

        public static DogBreeder aDog() {
             return new DogBreeder();
        }

        public static DogBreeder aLargeDog() {
                return aDog().ofBreed("Labrador");
        }

        public static DogBreeder aSmallDog() {
            return aDog().ofBreed("Poodle");
        }

        public static DogBreeder aGuardDog() {
            return aDog().ofBreed("Huskey");
        }

        public DogBreeder called(String name) {
            this.name = name;
            return this;
        }

        public DogBreeder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog bornOn(LocalDate dateOfBirth) {
            return new Dog(name, breed, colour, favouriteFood, dateOfBirth, favouriteToy);
        }

        public DogBreeder ofColour(String colour) {
            this.colour = colour;
            return this;
        }

        public DogBreeder withFavouriteFood(String favouriteFood) {
            this.favouriteFood = favouriteFood;
            return this;
        }

        public DogBreeder withFavouriteToy(String favouriteToy) {
            this.favouriteToy = favouriteToy;
            return this;
        }
    }