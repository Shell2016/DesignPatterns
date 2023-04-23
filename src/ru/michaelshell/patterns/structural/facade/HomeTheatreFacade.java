package ru.michaelshell.patterns.structural.facade;

public class HomeTheatreFacade {
    private Audiosystem audiosystem;
    private Projector projector;
    private Screen screen;

    public HomeTheatreFacade(Audiosystem audiosystem, Projector projector, Screen screen) {
        this.audiosystem = audiosystem;
        this.projector = projector;
        this.screen = screen;
    }

    public void startMovie() {
        screen.up();
        projector.on();
        audiosystem.on();
        audiosystem.volume(30);
    }

    public void endMovie() {
        screen.down();
        projector.off();
        audiosystem.off();
    }
}
