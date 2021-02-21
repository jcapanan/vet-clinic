package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class WhenWeCreateANewDog {

    @Test
    public void a_dog_should_have_a_name() {
        LocalDate THE_FOURTH_OF_JULY = LocalDate.now();

        Dog fido = DogBreeder.aLargeDog()
                      .called("Fido")
                      .ofColour("black")
                      .withFavouriteFood("pizza")
                      .withFavouriteToy("bone")
                      .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals("black", fido.getColour());
        Assert.assertEquals("pizza", fido.getFavouriteFood());
        Assert.assertEquals(THE_FOURTH_OF_JULY, fido.getDateOfBirth());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy() {
        LocalDate THE_FOURTH_OF_JULY = LocalDate.now();

        Dog martin = DogBreeder.aSmallDog()
                        .called("Martin")
                        .ofColour("white")
                        .withFavouriteToy("ball")
                        .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Martin", martin.getName());
        Assert.assertEquals("Poodle", martin.getBreed());
        Assert.assertEquals("white", martin.getColour());
        Assert.assertEquals("ball", martin.getFavouriteToy());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_food() {
        LocalDate THE_FOURTH_OF_JULY = LocalDate.now();

        Dog douglas = DogBreeder.aGuardDog()
                         .called("Douglas")
                         .ofColour("silver")
                         .withFavouriteFood("chicken")
                         .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Douglas", douglas.getName());
        Assert.assertEquals("Huskey", douglas.getBreed());
        Assert.assertEquals("silver", douglas.getColour());
        Assert.assertEquals("chicken", douglas.getFavouriteFood());
        Assert.assertEquals(THE_FOURTH_OF_JULY, douglas.getDateOfBirth());
    }
}
