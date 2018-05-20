package main;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.media.AudioClip;

public class Controller extends Main{

    @FXML
    private Button lowC, lowD, lowE, lowF, lowG, lowA, lowB, lowCSharp, lowDSharp, lowFSharp, lowGSharp, lowASharp;

    @FXML
    private Button highC, highD, highE, highF, highG, highA, highB, highCSharp, highDSharp, highFSharp, highGSharp, highASharp;

    @FXML
    private Button octaveUp, octaveDown;

    @FXML
    private RadioButton MarimBASS, TrevBASS;

    @FXML
    private Label octaveText;

    private int waveFormSelection;
    private int octave = 12;





    private AudioClip s1 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-60-127.aif").toURI().toString());
    private AudioClip s2 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-61-127.aif").toURI().toString());
    private AudioClip s3 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-62-127.aif").toURI().toString());
    private AudioClip s4 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-63-127.aif").toURI().toString());
    private AudioClip s5 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-64-127.aif").toURI().toString());
    private AudioClip s6 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-65-127.aif").toURI().toString());
    private AudioClip s7 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-66-127.aif").toURI().toString());
    private AudioClip s8 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-67-127.aif").toURI().toString());
    private AudioClip s9 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-68-127.aif").toURI().toString());
    private AudioClip s10 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-69-127.aif").toURI().toString());
    private AudioClip s11 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-70-127.aif").toURI().toString());
    private AudioClip s12 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-71-127.aif").toURI().toString());
    private AudioClip s13 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-72-127.aif").toURI().toString());
    private AudioClip s14 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-73-127.aif").toURI().toString());
    private AudioClip s15 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-74-127.aif").toURI().toString());
    private AudioClip s16 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-75-127.aif").toURI().toString());
    private AudioClip s17 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-76-127.aif").toURI().toString());
    private AudioClip s18 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-77-127.aif").toURI().toString());
    private AudioClip s19 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-78-127.aif").toURI().toString());
    private AudioClip s20 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-79-127.aif").toURI().toString());
    private AudioClip s21 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-80-127.aif").toURI().toString());
    private AudioClip s22 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-81-127.aif").toURI().toString());
    private AudioClip s23 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-82-127.aif").toURI().toString());
    private AudioClip s24 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-83-127.aif").toURI().toString());
    private AudioClip s25 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-84-127.aif").toURI().toString());
    private AudioClip s26 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-85-127.aif").toURI().toString());
    private AudioClip s27 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-86-127.aif").toURI().toString());
    private AudioClip s28 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-87-127.aif").toURI().toString());
    private AudioClip s29 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-88-127.aif").toURI().toString());
    private AudioClip s30 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-89-127.aif").toURI().toString());
    private AudioClip s31 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-90-127.aif").toURI().toString());
    private AudioClip s32 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-91-127.aif").toURI().toString());
    private AudioClip s33 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-92-127.aif").toURI().toString());
    private AudioClip s34 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-93-127.aif").toURI().toString());
    private AudioClip s35 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-94-127.aif").toURI().toString());
    private AudioClip s36 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-95-127.aif").toURI().toString());
    private AudioClip s37 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-96-127.aif").toURI().toString());
    private AudioClip s38 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-97-127.aif").toURI().toString());
    private AudioClip s39 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-98-127.aif").toURI().toString());
    private AudioClip s40 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-99-127.aif").toURI().toString());
    private AudioClip s41 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-100-127.aif").toURI().toString());
    private AudioClip s42 = new AudioClip(new File("resources/Marimba/Liveschool Korg Marimba Bass-101-127.aif").toURI().toString());

    private AudioClip treB1 = new AudioClip(new File("resources/TrevorBass/Liveschool Korg MS-20 Trevor's Bass-48-127.aif").toURI().toString());
    private AudioClip treB2 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-49-127.aif").toURI().toString());
    private AudioClip treB3 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-50-127.aif").toURI().toString());
    private AudioClip treB4 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-51-127.aif").toURI().toString());
    private AudioClip treB5 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-52-127.aif").toURI().toString());
    private AudioClip treB6 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-53-127.aif").toURI().toString());
    private AudioClip treB7 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-54-127.aif").toURI().toString());
    private AudioClip treB8 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-55-127.aif").toURI().toString());
    private AudioClip treB9 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-56-127.aif").toURI().toString());
    private AudioClip treB10 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-57-127.aif").toURI().toString());
    private AudioClip treB11 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-58-127.aif").toURI().toString());
    private AudioClip treB12 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-59-127.aif").toURI().toString());
    private AudioClip treB13 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-60-127.aif").toURI().toString());
    private AudioClip treB14 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-61-127.aif").toURI().toString());
    private AudioClip treB15 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-62-127.aif").toURI().toString());
    private AudioClip treB16 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-63-127.aif").toURI().toString());
    private AudioClip treB17 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-64-127.aif").toURI().toString());
    private AudioClip treB18 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-65-127.aif").toURI().toString());
    private AudioClip treB19 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-66-127.aif").toURI().toString());
    private AudioClip treB20 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-67-127.aif").toURI().toString());
    private AudioClip treB21 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-68-127.aif").toURI().toString());
    private AudioClip treB22 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-69-127.aif").toURI().toString());
    private AudioClip treB23 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-70-127.aif").toURI().toString());
    private AudioClip treB24 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-71-127.aif").toURI().toString());
    private AudioClip treB25 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-72-127.aif").toURI().toString());
    private AudioClip treB26 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-73-127.aif").toURI().toString());
    private AudioClip treB27 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-74-127.aif").toURI().toString());
    private AudioClip treB28 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-75-127.aif").toURI().toString());
    private AudioClip treB29 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-76-127.aif").toURI().toString());
    private AudioClip treB30 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-77-127.aif").toURI().toString());
    private AudioClip treB31 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-78-127.aif").toURI().toString());
    private AudioClip treB32 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-79-127.aif").toURI().toString());
    private AudioClip treB33 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-80-127.aif").toURI().toString());
    private AudioClip treB34 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-81-127.aif").toURI().toString());
    private AudioClip treB35 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-82-127.aif").toURI().toString());
    private AudioClip treB36 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-83-127.aif").toURI().toString());
    private AudioClip treB37 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-84-127.aif").toURI().toString());
    private AudioClip treB38 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-85-127.aif").toURI().toString());
    private AudioClip treB39 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-86-127.aif").toURI().toString());
    private AudioClip treB40 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-87-127.aif").toURI().toString());
    private AudioClip treB41 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-88-127.aif").toURI().toString());
    private AudioClip treB42 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-89-127.aif").toURI().toString());
    private AudioClip treB43 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-90-127.aif").toURI().toString());
    private AudioClip treB44 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-91-127.aif").toURI().toString());
    private AudioClip treB45 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-92-127.aif").toURI().toString());
    private AudioClip treB46 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-93-127.aif").toURI().toString());
    private AudioClip treB47 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-94-127.aif").toURI().toString());
    private AudioClip treB48 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-95-127.aif").toURI().toString());
    private AudioClip treB49 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-96-127.aif").toURI().toString());
    private AudioClip treB50 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-97-127.aif").toURI().toString());
    private AudioClip treB51 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-98-127.aif").toURI().toString());
    private AudioClip treB52 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-99-127.aif").toURI().toString());
    private AudioClip treB53 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-100-127.aif").toURI().toString());
    private AudioClip treB54 = new AudioClip(new File("resources/TrevorBass/LiveSchool Korg MS-20 Trevor's Bass-101-127.aif").toURI().toString());

    private AudioClip rave1 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-60-127.aif").toURI().toString());
    private AudioClip rave2 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-61-127.aif").toURI().toString());
    private AudioClip rave3 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-62-127.aif").toURI().toString());
    private AudioClip rave4 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-63-127.aif").toURI().toString());
    private AudioClip rave5 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-64-127.aif").toURI().toString());
    private AudioClip rave6 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-65-127.aif").toURI().toString());
    private AudioClip rave7 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-66-127.aif").toURI().toString());
    private AudioClip rave8 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-67-127.aif").toURI().toString());
    private AudioClip rave9 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-68-127.aif").toURI().toString());
    private AudioClip rave10 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-69-127.aif").toURI().toString());
    private AudioClip rave11 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-70-127.aif").toURI().toString());
    private AudioClip rave12 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-71-127.aif").toURI().toString());
    private AudioClip rave13 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-72-127.aif").toURI().toString());
    private AudioClip rave14 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-73-127.aif").toURI().toString());
    private AudioClip rave15 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-74-127.aif").toURI().toString());
    private AudioClip rave16 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-75-127.aif").toURI().toString());
    private AudioClip rave17 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-76-127.aif").toURI().toString());
    private AudioClip rave18 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-77-127.aif").toURI().toString());
    private AudioClip rave19 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-78-127.aif").toURI().toString());
    private AudioClip rave20 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-79-127.aif").toURI().toString());
    private AudioClip rave21 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-80-127.aif").toURI().toString());
    private AudioClip rave22 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-81-127.aif").toURI().toString());
    private AudioClip rave23 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-82-127.aif").toURI().toString());
    private AudioClip rave24 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-83-127.aif").toURI().toString());
    private AudioClip rave25 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-84-127.aif").toURI().toString());
    private AudioClip rave26 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-85-127.aif").toURI().toString());
    private AudioClip rave27 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-86-127.aif").toURI().toString());
    private AudioClip rave28 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-87-127.aif").toURI().toString());
    private AudioClip rave29 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-88-127.aif").toURI().toString());
    private AudioClip rave30 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-89-127.aif").toURI().toString());
    private AudioClip rave31 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-90-127.aif").toURI().toString());
    private AudioClip rave32 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-91-127.aif").toURI().toString());
    private AudioClip rave33 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-92-127.aif").toURI().toString());
    private AudioClip rave34 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-93-127.aif").toURI().toString());
    private AudioClip rave35 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-95-127.aif").toURI().toString());
    private AudioClip rave36 = new AudioClip(new File("resources/Rave/Liveschool Korg MS-20 Rave-Athon-96-127.aif").toURI().toString());

    private AudioClip[] marimba = { s1, s2,s3,s4,s5,s6,s7,s8,s9,s10,
                            s11,s12,s13,s14,s15,s16,s17, s18,s19,s20,
                            s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,
                            s31,s32, s33,s34,s35,s36,s37,s38,s39,s40,
                            s41,s42
                            };

    private AudioClip[] trevBass = { treB1, treB2, treB3, treB4, treB5, treB6, treB7, treB8, treB9, treB10,
                             treB11, treB12, treB13, treB14, treB15, treB16, treB17, treB18, treB19, treB20,
                             treB21, treB22, treB23, treB24, treB25, treB26, treB27, treB28, treB29, treB30,
                             treB31, treB32, treB33, treB34, treB35, treB36, treB37, treB38, treB39, treB40,
                             treB41, treB42, treB43, treB44, treB45, treB46, treB47, treB48, treB49, treB50,
                             treB51, treB52, treB53, treB54
                             };

    private AudioClip[] rave = { rave1, rave2, rave3, rave4, rave5, rave6, rave7, rave8, rave9, rave10,
                         rave11, rave12, rave13, rave14, rave15, rave16, rave17, rave18, rave19, rave20,
                         rave21, rave22, rave23, rave24, rave25, rave26, rave27, rave28, rave29, rave30,
                         rave31, rave32, rave33, rave34, rave35, rave36
                         };


    public void setWaveFormSelection(ActionEvent ae) {
        if(ae.getSource() == MarimBASS) {
            waveFormSelection = 1;
        } else if (ae.getSource() == TrevBASS) {
            waveFormSelection = 2;
        } else {
            waveFormSelection = 3;
        }
    }

    private int getWaveFormSelection () {
        return waveFormSelection;
    }

    public void setOctave(ActionEvent ae) {
        if (ae.getSource() == octaveUp && octave < 48) octave += 12;
        else if (ae.getSource() == octaveDown && octave > 0) octave -= 12;

        octaveText.setText(Integer.toString(octave - 12));
    }

    private int getOctave () {
        return octave;
    }


    public void keyPlayed(ActionEvent ae) {
        String keyValue;
        AudioClip[] waveForm;

        if (getWaveFormSelection() == 1) waveForm = marimba;
        else if (getWaveFormSelection() == 2) waveForm = trevBass;
        else if (getWaveFormSelection() == 3) waveForm = rave;
        else waveForm = marimba;

        if (ae.getSource().toString().contains("low")) {
            try {
                if (ae.getSource() == lowC) {
                    keyValue = lowC.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowD) {
                    keyValue = lowD.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowE) {
                    keyValue = lowE.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowF) {
                    keyValue = lowF.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowG) {
                    keyValue = lowG.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowA)  {
                    keyValue = lowA.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowB)  {
                    keyValue = lowB.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowCSharp) {
                    keyValue = lowCSharp.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowDSharp) {
                    keyValue = lowDSharp.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowFSharp) {
                    keyValue = lowFSharp.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowGSharp) {
                    keyValue = lowGSharp.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == lowASharp) {
                    keyValue = lowASharp.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                if (ae.getSource() == highC) {
                    keyValue = highC.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highD) {
                    keyValue = highD.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highE) {
                    keyValue = highE.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highF) {
                    keyValue = highF.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highG) {
                    keyValue = highG.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highA)  {
                    keyValue = highA.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highB)  {
                    keyValue = highB.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highCSharp) {
                    keyValue = highCSharp.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highDSharp) {
                    keyValue = highDSharp.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highFSharp) {
                    keyValue = highFSharp.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highGSharp) {
                    keyValue = highGSharp.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                } else if (ae.getSource() == highASharp) {
                    keyValue = highASharp.getAccessibleText();
                    waveForm[Integer.parseInt(keyValue) + getOctave()].play();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}