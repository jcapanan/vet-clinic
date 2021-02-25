package serenitylabs.tutorials.vetclinic.playingball.model;

public class PlayerForGame {
    public static Player called(Game game) {
        switch (game) {
            case Football: return new PlayingFootball();
            case Tennis: return new PlayTennis();
            case Cricket: return new PlayCricket();
            case Handball: return new PlayHandball();
            case Hockey: return new PlayHockey();
            default: return null;
        }
    }
}
