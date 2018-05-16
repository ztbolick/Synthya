import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class SampleInterface {

    public SampleInterface() {
        // no args constructor
    }

    public static void playSample(int kc) {
        if (kc == 65) {
            InputStream in;
            try {
                in = new FileInputStream(new File("resources/Marimba/Liveschool Korg Marimba Bass-70-127.aif"));
                AudioStream sample = new AudioStream(in);
                AudioPlayer.player.start(sample);
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (kc == 65) {
            System.out.println(65);
        } else if (kc == 87) {
            System.out.println(65);
        } else if (kc == 83) {
            System.out.println(65);
        } else if (kc == 69) {
            System.out.println(65);
        } else if (kc == 68) {
            System.out.println(65);
        } else if (kc == 70) {
            System.out.println(65);
        } else if (kc == 84) {
            System.out.println(65);
        } else if (kc == 71) {
            System.out.println(65);
        } else if (kc == 89) {
            System.out.println(65);
        } else if (kc == 72) {
            System.out.println(65);
        } else if (kc == 85) {
            System.out.println(65);
        }else if (kc == 74) {

        }
    }
}
