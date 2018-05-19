package main;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

public class SampleInterface {

    public SampleInterface() {
        // no args constructor
    }

    public static void playSample(int kc) {
        switch (kc) {
            case KeyEvent.VK_A:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-70-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_W:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-71-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_R:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-72-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_F:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-73-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_S:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-74-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_T:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-75-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_G:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-76-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_D:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-77-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_J:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-78-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_H:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-79-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_L:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-80-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case KeyEvent.VK_N:
                try {
                    AudioStream sample = new AudioStream(new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-81-127.aif")));
                    AudioPlayer.player.start(sample);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
        }
    }
}
