package main;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.media.AudioClip;

public class Controller extends Main{

    @FXML
    private Button lowC, lowD, lowE, lowF, lowG, lowA, lowB;


    AudioClip s1 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-60-127.aif").toURI().toString());
    AudioClip s2 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-61-127.aif").toURI().toString());
    AudioClip s3 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-62-127.aif").toURI().toString());
    AudioClip s4 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-63-127.aif").toURI().toString());
    AudioClip s5 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-64-127.aif").toURI().toString());
    AudioClip s6 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-65-127.aif").toURI().toString());
    AudioClip s7 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-66-127.aif").toURI().toString());
    AudioClip s8 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-67-127.aif").toURI().toString());
    AudioClip s9 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-68-127.aif").toURI().toString());
    AudioClip s10 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-69-127.aif").toURI().toString());
    AudioClip s11 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-70-127.aif").toURI().toString());
    AudioClip s12 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-71-127.aif").toURI().toString());
    AudioClip s13 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-72-127.aif").toURI().toString());
    AudioClip s14 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-73-127.aif").toURI().toString());
    AudioClip s15 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-74-127.aif").toURI().toString());
    AudioClip s16 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-75-127.aif").toURI().toString());
    AudioClip s17 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-76-127.aif").toURI().toString());
    AudioClip s18 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-77-127.aif").toURI().toString());
    AudioClip s19 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-78-127.aif").toURI().toString());
    AudioClip s20 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-79-127.aif").toURI().toString());
    AudioClip s21 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-80-127.aif").toURI().toString());
    AudioClip s22 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-81-127.aif").toURI().toString());
    AudioClip s23 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-82-127.aif").toURI().toString());
    AudioClip s24 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-83-127.aif").toURI().toString());
    AudioClip s25 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-84-127.aif").toURI().toString());
    AudioClip s26 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-85-127.aif").toURI().toString());
    AudioClip s27 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-86-127.aif").toURI().toString());
    AudioClip s28 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-87-127.aif").toURI().toString());
    AudioClip s29 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-88-127.aif").toURI().toString());
    AudioClip s30 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-89-127.aif").toURI().toString());
    AudioClip s31 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-90-127.aif").toURI().toString());
    AudioClip s32 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-91-127.aif").toURI().toString());
    AudioClip s33 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-92-127.aif").toURI().toString());
    AudioClip s34 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-93-127.aif").toURI().toString());
    AudioClip s35 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-94-127.aif").toURI().toString());
    AudioClip s36 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-95-127.aif").toURI().toString());
    AudioClip s37 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-96-127.aif").toURI().toString());
    AudioClip s38 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-97-127.aif").toURI().toString());
    AudioClip s39 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-98-127.aif").toURI().toString());
    AudioClip s40 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-99-127.aif").toURI().toString());
    AudioClip s41 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-100-127.aif").toURI().toString());
    AudioClip s42 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-101-127.aif").toURI().toString());

    AudioClip[] marimba = {s1, s2,s3,s4,s5,s6,s7,s8,s9,s10,
                           s11,s12,s13,s14,s15,s16,s17, s18,s19,s20,
                           s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,
                           s31,s32, s33,s34,s35,s36,s37,s38,s39,s40,s41,s42};
    AudioClip[] sine,square,saw;




    public void playSound() {

        System.out.println(this.getClass());
        System.out.println(this.getClass().getComponentType());
        System.out.println(this.getClass().getDeclaringClass());
    }
//        if () {
//            s1.play();
//        } else if (lowD.getId().equals(this)){
//            s10.play();
//        }
//    }


    public void keyPlayed(ActionEvent ae)
    {
        String keyValue;
        AudioClip[] waveForm;
        int octive = 0;

        if(1 == 1) waveForm = marimba;
        else if(1 == 2) waveForm = sine;
        else if(1 == 3) waveForm = square;
        else if(1 == 4) waveForm = saw;

        
        if (ae.getSource() == lowC) {
            keyValue = lowC.getAccessibleText();
            waveForm[Integer.parseInt(keyValue) + octive].play();
        } else if (ae.getSource() == lowD) {
            keyValue = lowD.getAccessibleText();
            waveForm[Integer.parseInt(keyValue)].play();
        } else if (ae.getSource() == lowE) {
            keyValue = lowE.getAccessibleText();
            waveForm[Integer.parseInt(keyValue)].play();
        } else if (ae.getSource() == lowF) {
            keyValue = lowF.getAccessibleText();
            waveForm[Integer.parseInt(keyValue)].play();
        } else if (ae.getSource() == lowG) {
            keyValue = lowG.getAccessibleText();
            waveForm[Integer.parseInt(keyValue)].play();
        } else if (ae.getSource() == lowA)  {
            keyValue = lowA.getAccessibleText();
            waveForm[Integer.parseInt(keyValue)].play();
        } else if (ae.getSource() == lowB)  {
            keyValue = lowB.getAccessibleText();
            waveForm[Integer.parseInt(keyValue)].play();
        }

//        else if (ae.getSource() == lowCSharp) {
//            keyValue = lowC.getAccessibleText();
//            marimba[Integer.parseInt(keyValue)].play();
//        } else if (ae.getSource() == lowDSharp) {
//            keyValue = lowD.getAccessibleText();
//            marimba[Integer.parseInt(keyValue)].play();
//        } else if (ae.getSource() == lowESharp) {
//            keyValue = lowE.getAccessibleText();
//            marimba[Integer.parseInt(keyValue)].play();
//        } else if (ae.getSource() == lowFSharp) {
//            keyValue = lowF.getAccessibleText();
//            marimba[Integer.parseInt(keyValue)].play();
//        } else if (ae.getSource() == lowGSharp) {
//            keyValue = lowG.getAccessibleText();
//            marimba[Integer.parseInt(keyValue)].play();
//        } else if (ae.getSource() == lowASharp)  {
//            keyValue = lowA.getAccessibleText();
//            marimba[Integer.parseInt(keyValue)].play();
//        } else if (ae.getSource() == lowBSharp)  {
//            keyValue = lowB.getAccessibleText();
//            marimba[Integer.parseInt(keyValue)].play();
//        }
    }
}
