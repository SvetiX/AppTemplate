package ru.cyberforum.reisal78.lesson01;

import ru.cyberforum.reisal78.lib.Lesson01Data;
import ru.cyberforum.reisal78.lib.Lesson01;
import ru.cyberforum.reisal78.lib.Lesson01JFrame;

public class Lesson01Application implements Lesson01Data {

    public static void main(String[] args) {
        Lesson01 lesson01 = new Lesson01JFrame();
        int widthWindows = 1920;
        int heightWindows = 1080;
        int distance = 60;

        lesson01.setSize(widthWindows, heightWindows);
        lesson01.addShare(share1);
        lesson01.addShare(share2);
        lesson01.addShare(share3);
        lesson01.addShare(share4);
        share2.width = 80;


        Help help = new Help();
        share2.width = share2.width * Help.messageLast(123);


//теперь на центр

        share4.x = widthWindows / 2 - share4.width / 2;
        share4.y = heightWindows / 2 - (share1.height + distance) / 2;


        share1.x = widthWindows / 2 - share2.width / 2 - share1.width;
        share1.y = share4.y + distance;


        share2.x = widthWindows / 2 - share2.width / 2;
        share2.y = share1.y;

        share3.x = widthWindows / 2 + share2.width / 2;
        share3.y = share2.y;


    }
}
