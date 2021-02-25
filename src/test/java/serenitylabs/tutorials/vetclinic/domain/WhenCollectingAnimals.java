package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class WhenCollectingAnimals {

    @Test
    public void a_list_of_animals_can_contain_cats_and_dog() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        List<Animal> animals = new ArrayList<>();

        animals.add(fido);
        animals.add(felix);

        assertThat(animals, hasItems(fido, felix));
    }

    @Test
    public void a_dog_complains_by_growling() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black", "White");

        assertThat(fido.complaint(), is(equalTo("Grrrr")));
    }

    @Test
    public void a_cat_complains_by_meowing() {
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("Brown");

        assertThat(felix.complaint(), is(equalTo("Meow")));
    }
}
