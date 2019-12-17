package Interface;

import Interface.Notification;

public class Telegram implements Notification {

    @Override
    public void send(String userContact) {

        System.out.println("Interface.Telegram");

    }
}
