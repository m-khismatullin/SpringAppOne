package ru.khismatullin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.setName("First");
        firstMusicPlayer.setVolume(10);
        firstMusicPlayer.playMusic();

        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        secondMusicPlayer.setName("Second");
        secondMusicPlayer.playMusic();

        context.close();
    }
}
