package com.peamo.designpatterns.facade;

/**
 * @author hualong.li
 * @date 2018/8/30
 */
public class HomeTheaterFacade {

    private DvdPlayer dvdPlayer;

    private PopcomPopper popcomPopper;

    private Screen screen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, PopcomPopper popcomPopper, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.popcomPopper = popcomPopper;
        this.screen = screen;
    }

    public void watchMovie(String movieName) {
        popcomPopper.on();
        popcomPopper.pop();

        screen.down();
        dvdPlayer.on();
        dvdPlayer.play(movieName);
    }

    public void endMovie() {
        dvdPlayer.off();
        screen.up();
        popcomPopper.off();
    }
}
