package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class WhenWeBookAnAppointment {

    private static final LocalDateTime TODAY_AT_2_PM = LocalDateTime.now().withHour(2).withMinute(0);

    @Test
    public void an_appointment_has_a_patient_name_an_owner_and_a_date() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

//        Assert.assertEquals("Fido",appointment.getPetName());
//        Assert.assertEquals("Fred",appointment.getOwner());
//        Assert.assertEquals(TODAY_AT_2_PM,appointment.getAppointmentTime());

        assertThat(appointment.getPetName(), is(equalTo("Fido")));
        assertThat(appointment.getOwner(), is(equalTo("Fred")));
        assertThat(appointment.getAppointmentTime(), is(equalTo(TODAY_AT_2_PM)));
    }

    @Test
    public void an_appointment_can_have_an_optional_reason() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

//        Assert.assertEquals(true,appointment.getReason().isPresent());
//        Assert.assertEquals("He is sick",appointment.getReason().get());

        assertThat(appointment.getReason().isPresent(), is(equalTo(true)));
        assertThat(appointment.getReason().get(), is(equalTo("He is sick")));
    }

    @Test
    public void an_appointment_has_correct_schedule() {
        LocalDateTime TODAY_3_PM = LocalDateTime.now().withHour(3).withMinute(0);
        LocalDateTime TODAY_1_PM = LocalDateTime.now().withHour(1).withMinute(0);

        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        assertThat(appointment.isBefore(TODAY_3_PM), is(true));
        assertThat(appointment.isBefore(TODAY_1_PM), is(false));

        assertThat(appointment.isAfter(TODAY_1_PM), is(true));
        assertThat(appointment.isAfter(TODAY_3_PM), is(false));
    }

}
