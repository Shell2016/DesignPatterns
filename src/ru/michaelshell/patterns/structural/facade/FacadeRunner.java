package ru.michaelshell.patterns.structural.facade;

public class FacadeRunner {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Audiosystem audio = new Audiosystem();
        Projector projector = new Projector();
        HomeTheatreFacade homeTheatre = new HomeTheatreFacade(audio, projector, screen);

        homeTheatre.startMovie();
        System.out.println("---------------");
        homeTheatre.endMovie();
    }


}
