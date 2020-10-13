package com.peamo.designpatterns.facade;

/**
 * @author hualong.li
 * @date 2018/8/30
 */
public class Test {
    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcomPopper popcomPopper = new PopcomPopper();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer,popcomPopper,screen);
        homeTheaterFacade.watchMovie("人鬼情未了");

        System.out.println("接到☎️============");
        homeTheaterFacade.endMovie();

    }
}
