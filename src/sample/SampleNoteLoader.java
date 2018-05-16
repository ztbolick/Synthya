package sample;


import javafx.event.ActionEvent;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.*;
import java.io.File;

public class SampleNoteLoader {

    File lowC = new File("resources/Marimba/Liveschool Korg Marimba Bass-64-127.aif");



    public void PlaySound(ActionEvent event) {

        try {
            Clip bar = AudioSystem.getClip();
            bar.open(AudioSystem.getAudioInputStream(lowC));
            bar.start();

        } catch (Exception e) {
        }

    }


    public static void createAndLoadSampleArray() {

//        AudioClip lowc = new AudioClip("resources/MS-20-Pulse-48-127.aif");

//        // Make the low clips
//        AudioClip lowC = new AudioClip("/resources/sound/lowC");
//        AudioClip lowCSharp = new AudioClip("/resources/sound/lowCSharp");
//        AudioClip lowD = new AudioClip("/resources/sound/lowD");
//        AudioClip lowDSharp = new AudioClip("/resources/sound/lowDSharp");
//        AudioClip lowE = new AudioClip("/resources/sound/lowE");
//        AudioClip lowF = new AudioClip("/resources/sound/lowF");
//        AudioClip lowFSharp = new AudioClip("/resources/sound/lowGSharp");
//        AudioClip lowG = new AudioClip("/resources/sound/lowG");
//        AudioClip lowGSharp = new AudioClip("/resources/sound/lowGSharp");
//        AudioClip lowA = new AudioClip("/resources/sound/lowA");
//        AudioClip lowASharp = new AudioClip("/resources/sound/lowASharp");
//        AudioClip lowB = new AudioClip("/resources/sound/lowB");
//
//        // Make the high clips
//        AudioClip highC = new AudioClip("/resources/sound/highC");
//        AudioClip highCSharp = new AudioClip("/resources/sound/highCSharp");
//        AudioClip highD = new AudioClip("/resources/sound/highD");
//        AudioClip highDSharp = new AudioClip("/resources/sound/highDSharp");
//        AudioClip highE = new AudioClip("/resources/sound/highE");
//        AudioClip highF = new AudioClip("/resources/sound/highF");
//        AudioClip highFSharp = new AudioClip("/resources/sound/highGSharp");
//        AudioClip highG = new AudioClip("/resources/sound/highG");
//        AudioClip highGSharp = new AudioClip("/resources/sound/highGSharp");
//        AudioClip highA = new AudioClip("/resources/sound/highA");
//        AudioClip highASharp = new AudioClip("/resources/sound/highASharp");
//        AudioClip highB = new AudioClip("/resources/sound/highB");
//
//        AudioClip[] lowNotes = new AudioClip[12];
//        AudioClip[] highNotes = new AudioClip[12];
//
//        // Make the low clips
//        lowNotes[0] = lowC;
//        lowNotes[1] = lowCSharp;
//        lowNotes[2] = lowD;
//        lowNotes[3] = lowDSharp;
//        lowNotes[4] = lowE;
//        lowNotes[5] = lowF;
//        lowNotes[6] = lowGSharp;
//        lowNotes[7] = lowG;
//        lowNotes[8] = lowGSharp;
//        lowNotes[9] = lowA;
//        lowNotes[10] = lowASharp;
//        lowNotes[11] = lowB;
//
//        // Make the high clips
//        highNotes[0] = highC;
//        highNotes[1] = highCSharp;
//        highNotes[2] = highD;
//        highNotes[3] = highDSharp;
//        highNotes[4] = highE;
//        highNotes[5] = highF;
//        highNotes[6] = highGSharp;
//        highNotes[7] = highG;
//        highNotes[8] = highGSharp;
//        highNotes[9] = highA;
//        highNotes[10] = highASharp;
//        highNotes[11] = highB;
    }
}