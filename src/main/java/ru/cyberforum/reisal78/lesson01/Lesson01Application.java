package ru.cyberforum.reisal78.lesson01;

import ru.cyberforum.reisal78.lib.Lesson01Data;
import ru.cyberforum.reisal78.lib.Lesson01;
import ru.cyberforum.reisal78.lib.Lesson01JFrame;

public class Lesson01Application implements Lesson01Data {

    public static void main(String[] args) {
        Lesson01 lesson01 = new Lesson01JFrame();
        lesson01.setSize(800, 600);
        lesson01.addShare(share1);
        lesson01.addShare(share2);
        lesson01.addShare(share3);
        lesson01.addShare(share4);



    }
}
