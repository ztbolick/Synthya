package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class KeyObserver {

    // Key listener methods to listen for key pressed
    public static class KListenLow implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "C":
                    System.out.println("Low C");
                    break;
                case "C#":
                    System.out.println("lowCSharp");
                    break;
                case "D":
                    System.out.println("lowD");
                    break;
                case "D#":
                    System.out.println("lowDSharp");
                    break;
                case "E":
                    System.out.println("lowE");
                    break;
                case "F":
                    System.out.println("lowF");
                    break;
                case "F#":
                    System.out.println("lowFSharp");
                    break;
                case "G":
                    System.out.println("lowG");
                    break;
                case "G#":
                    System.out.println("lowGSharp");
                    break;
                case "A":
                    System.out.println("lowA");
                    break;
                case "A#":
                    System.out.println("lowASharp");
                    break;
                case "B":
                    System.out.println("lowB");
                    break;
            }
        }
    }

    public static class KListenHigh implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "C":
                    System.out.println("high C");
                    break;
                case "C#":
                    System.out.println("highCSharp");
                    break;
                case "D":
                    System.out.println("highD");
                    break;
                case "D#":
                    System.out.println("highDSharp");
                    break;
                case "E":
                    System.out.println("highE");
                    break;
                case "F":
                    System.out.println("highF");
                    break;
                case "F#":
                    System.out.println("highFSharp");
                    break;
                case "G":
                    System.out.println("highG");
                    break;
                case "G#":
                    System.out.println("highGSharp");
                    break;
                case "A":
                    System.out.println("highA");
                    break;
                case "A#":
                    System.out.println("highASharp");
                    break;
                case "B":
                    System.out.println("highB");
                    break;
            }
        }
    }

    public static void setKeyListener(JButton jButtonX) {
        jButtonX.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A:
                        SampleInterface.playSample(KeyEvent.VK_A);
                        break;
                    case KeyEvent.VK_W:
                        SampleInterface.playSample(KeyEvent.VK_W);
                        break;
                    case KeyEvent.VK_R:
                        SampleInterface.playSample(KeyEvent.VK_R);
                        break;
                    case KeyEvent.VK_F:
                        SampleInterface.playSample(KeyEvent.VK_F);
                        break;
                    case KeyEvent.VK_S:
                        SampleInterface.playSample(KeyEvent.VK_S);
                        break;
                    case KeyEvent.VK_T:
                        SampleInterface.playSample(KeyEvent.VK_T);
                        break;
                    case KeyEvent.VK_G:
                        SampleInterface.playSample(KeyEvent.VK_G);
                        break;
                    case KeyEvent.VK_D:
                        SampleInterface.playSample(KeyEvent.VK_D);
                        break;
                    case KeyEvent.VK_J:
                        SampleInterface.playSample(KeyEvent.VK_J);
                        break;
                    case KeyEvent.VK_H:
                        SampleInterface.playSample(KeyEvent.VK_H);
                        break;
                    case KeyEvent.VK_L:
                        SampleInterface.playSample(KeyEvent.VK_L);
                        break;
                    case KeyEvent.VK_N:
                        SampleInterface.playSample(KeyEvent.VK_N);
                        break;
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}
