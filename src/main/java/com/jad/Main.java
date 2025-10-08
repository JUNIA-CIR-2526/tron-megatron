package com.jad;

import com.jad.textwindow.TextWindow;
import com.jad.textwindow.TextWindowSettings;

import java.awt.*;
import java.awt.event.KeyEvent;

public enum Main {
    ;

    public static void main(String[] args) {
        TextWindowSettings settings = new TextWindowSettings();
        settings.addKeyboardListener(KeyEvent.VK_ESCAPE, "exit");
        /// touches du joueur 1
        settings.addKeyboardListener(KeyEvent.VK_Q, "player1_left");
        settings.addKeyboardListener(KeyEvent.VK_D, "player1_right");
        settings.addKeyboardListener(KeyEvent.VK_Z, "player1_up");
        settings.addKeyboardListener(KeyEvent.VK_S, "player1_down");
        /// touches du joueur 2
        settings.addKeyboardListener(KeyEvent.VK_NUMPAD4, "player2_left");
        settings.addKeyboardListener(KeyEvent.VK_NUMPAD6, "player2_right");
        settings.addKeyboardListener(KeyEvent.VK_NUMPAD8, "player2_up");
        settings.addKeyboardListener(KeyEvent.VK_NUMPAD2, "player2_down");

        settings.setBackgroundColor(Color.PINK);
        settings.setScreenHeight(10);
        settings.setScreenWidth(50);
        settings.setFontSize(42);
        TextWindow textWindow = new TextWindow(settings);
        textWindow.setVisible(true);

        Point lastMousePosition;
        while (textWindow.isOff("exit")) {
            if (textWindow.isOn("player2_up")) textWindow.display("YOULOU");
            if (textWindow.isOff("player2_up")) textWindow.display("Yagoulou");
        }
        textWindow.close();
    }
}