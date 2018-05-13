import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
  *
  * @author ztbolick
  */

public class FrontEnd {
    private static JPanel frontEnd;

    public static JPanel makeFrontEnd() {
        // Create JPanel with grid layout
        frontEnd = new JPanel();
        Dimension defaultWindowSize = new Dimension(700,550);
        frontEnd.setSize(defaultWindowSize);
        frontEnd.setMinimumSize(defaultWindowSize);
        frontEnd.setPreferredSize(defaultWindowSize);


        // Create new dimension for the size of the playable keys
        Dimension whiteKeySize = new Dimension(40,175);
        Dimension blackKeySize = new Dimension(30, (175/4)*2);


        // Create sliders
        JSlider freq = new JSlider();
        JSlider res = new JSlider();

        JRadioButton squareWave = new JRadioButton();
        JRadioButton sineWave = new JRadioButton();
        JRadioButton sawWave = new JRadioButton();
        JRadioButton triangleWave = new JRadioButton();


        // Create the keys and set their size
        ////////////////////////// Low Keys ///////////////////////////////
        // C
        JButton lowC = new JButton("C");
        lowC.setPreferredSize(whiteKeySize);
        lowC.setMaximumSize(whiteKeySize);

        // C#
        JButton lowCSharp = new JButton("C#");
        lowCSharp.setPreferredSize(blackKeySize);
        lowCSharp.setMaximumSize(blackKeySize);

        // D
        JButton lowD = new JButton("D");
        lowD.setPreferredSize(whiteKeySize);
        lowD.setMaximumSize(whiteKeySize);

        // D#
        JButton lowDSharp = new JButton("D#");
        lowDSharp.setPreferredSize(whiteKeySize);
        lowDSharp.setMaximumSize(whiteKeySize);

        // E
        JButton lowE = new JButton("E");
        lowE.setPreferredSize(whiteKeySize);
        lowE.setMaximumSize(whiteKeySize);

        // F
        JButton lowF = new JButton("F");
        lowF.setPreferredSize(whiteKeySize);
        lowF.setMaximumSize(whiteKeySize);

        // F#
        JButton lowFSharp = new JButton("F#");
        lowFSharp.setPreferredSize(whiteKeySize);
        lowFSharp.setMaximumSize(whiteKeySize);

        // G
        JButton lowG = new JButton("G");
        lowG.setPreferredSize(whiteKeySize);
        lowG.setMaximumSize(whiteKeySize);

        // G#
        JButton lowGSharp = new JButton("G#");
        lowGSharp.setPreferredSize(whiteKeySize);
        lowGSharp.setMaximumSize(whiteKeySize);

        // A
        JButton lowA = new JButton("A");
        lowA.setPreferredSize(whiteKeySize);
        lowA.setMaximumSize(whiteKeySize);

        // A#
        JButton lowASharp = new JButton("A#");
        lowASharp.setPreferredSize(whiteKeySize);
        lowASharp.setMaximumSize(whiteKeySize);

        // B
        JButton lowB = new JButton("B");
        lowB.setPreferredSize(whiteKeySize);
        lowB.setMaximumSize(whiteKeySize);

        ////////////////////////// High Keys ///////////////////////////////
        // C
        JButton highC = new JButton("C");
        highC.setPreferredSize(whiteKeySize);
        highC.setMaximumSize(whiteKeySize);

        // C#
        JButton highCSharp = new JButton("C#");
        highCSharp.setPreferredSize(whiteKeySize);
        highCSharp.setMaximumSize(whiteKeySize);

        // D
        JButton highD = new JButton("D");
        highD.setPreferredSize(whiteKeySize);
        highD.setMaximumSize(whiteKeySize);

        // D#
        JButton highDSharp = new JButton("D#");
        highDSharp.setPreferredSize(whiteKeySize);
        highDSharp.setMaximumSize(whiteKeySize);

        // E
        JButton highE = new JButton("E");
        highE.setPreferredSize(whiteKeySize);
        highE.setMaximumSize(whiteKeySize);

        // F
        JButton highF = new JButton("F");
        highF.setPreferredSize(whiteKeySize);
        highF.setMaximumSize(whiteKeySize);

        // F#
        JButton highFSharp = new JButton("F#");
        highFSharp.setPreferredSize(whiteKeySize);
        highFSharp.setMaximumSize(whiteKeySize);

        // G
        JButton highG = new JButton("G");
        highG.setPreferredSize(whiteKeySize);
        highG.setMaximumSize(whiteKeySize);

        // G#
        JButton highGSharp = new JButton("G#");
        highGSharp.setPreferredSize(whiteKeySize);
        highGSharp.setMaximumSize(whiteKeySize);

        // A
        JButton highA = new JButton("A");
        highA.setPreferredSize(whiteKeySize);
        highA.setMaximumSize(whiteKeySize);

        // A#
        JButton highASharp = new JButton("A#");
        highASharp.setPreferredSize(whiteKeySize);
        highASharp.setMaximumSize(whiteKeySize);

        // B
        JButton highB = new JButton("B");
        highB.setPreferredSize(whiteKeySize);
        highB.setMaximumSize(whiteKeySize);

        ////////////////////////// End Keys ///////////////////////////////

        ////////////////////////// Start Action Listener ///////////////////////////////
        // Low key Listener
        KListenLow lowListen = new KListenLow();
        lowC.addActionListener(lowListen);
        lowCSharp.addActionListener(lowListen);
        lowD.addActionListener(lowListen);
        lowDSharp.addActionListener(lowListen);
        lowE.addActionListener(lowListen);
        lowF.addActionListener(lowListen);
        lowFSharp.addActionListener(lowListen);
        lowG.addActionListener(lowListen);
        lowGSharp.addActionListener(lowListen);
        lowA.addActionListener(lowListen);
        lowASharp.addActionListener(lowListen);
        lowB.addActionListener(lowListen);

        // High key listener
        KListenHigh highListen = new KListenHigh();
        highC.addActionListener(highListen);
        highCSharp.addActionListener(highListen);
        highD.addActionListener(highListen);
        highDSharp.addActionListener(highListen);
        highE.addActionListener(highListen);
        highF.addActionListener(highListen);
        highFSharp.addActionListener(highListen);
        highG.addActionListener(highListen);
        highGSharp.addActionListener(highListen);
        highA.addActionListener(highListen);
        highASharp.addActionListener(highListen);
        highB.addActionListener(highListen);

        ////////////////////////// Add elements to JFrame ///////////////////////////////

        // filter and wave form elements
//        frontEnd.add(freq);
//        frontEnd.add(res);
//
//        frontEnd.add(squareWave);
//        frontEnd.add(sineWave);
//        frontEnd.add(sawWave);
//        frontEnd.add(triangleWave);

        // Low keys
        frontEnd.setLayout(null);

        lowCSharp.setBounds(35,200,30, 131);
        frontEnd.add(lowCSharp);
        lowDSharp.setBounds(70,200,30, 131);
        frontEnd.add(lowDSharp);
        lowFSharp.setBounds(150,200,30, 131);
        frontEnd.add(lowFSharp);
        lowGSharp.setBounds(195,200,30, 131);
        frontEnd.add(lowGSharp);
        lowASharp.setBounds(235,200,30, 131);
        frontEnd.add(lowASharp);

        lowC.setBounds(5,200,40,175);
        frontEnd.add(lowC);
        lowD.setBounds(45,200,40,175);
        frontEnd.add(lowD);
        lowE.setBounds(85,200,40,175);
        frontEnd.add(lowE);
        lowF.setBounds(125,200,40,175);
        frontEnd.add(lowF);
        lowG.setBounds(165,200,40,175);
        frontEnd.add(lowG);
        lowA.setBounds(205,200,40,175);
        frontEnd.add(lowA);
        lowB.setBounds(245,200,40,175);
        frontEnd.add(lowB);

        // High keys
        highCSharp.setBounds(35,375,30, 131);
        frontEnd.add(highCSharp);
        highDSharp.setBounds(70,375,30, 131);
        frontEnd.add(highDSharp);
        highFSharp.setBounds(150,375,30, 131);
        frontEnd.add(highFSharp);
        highGSharp.setBounds(195,375,30, 131);
        frontEnd.add(highGSharp);
        highASharp.setBounds(235,375,30, 131);
        frontEnd.add(highASharp);

        highC.setBounds(5,375,40,175);
        frontEnd.add(highC);
        highD.setBounds(45,375,40,175);
        frontEnd.add(highD);
        highE.setBounds(85,375,40,175);
        frontEnd.add(highE);
        highF.setBounds(125,375,40,175);
        frontEnd.add(highF);
        highG.setBounds(165,375,40,175);
        frontEnd.add(highG);
        highA.setBounds(205,375,40,175);
        frontEnd.add(highA);
        highB.setBounds(245,375,40,175);
        frontEnd.add(highB);

        return frontEnd;
    }


    // Key listener methods to listen for key pressed
    public static class KListenLow implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("C")) {
                System.out.println("Low C");
            } else if (e.getActionCommand().equals("C#")) {
                System.out.println("lowCSharp");
            } else if (e.getActionCommand().equals("D")) {
                System.out.println("lowD");
            } else if (e.getActionCommand().equals("D#")) {
                System.out.println("lowDSharp");
            } else if (e.getActionCommand().equals("E")) {
                System.out.println("lowE");
            } else if (e.getActionCommand().equals("F")) {
                System.out.println("lowF");
            } else if (e.getActionCommand().equals("F#")) {
                System.out.println("lowFSharp");
            } else if (e.getActionCommand().equals("G")) {
                System.out.println("lowG");
            } else if (e.getActionCommand().equals("G#")) {
                System.out.println("lowGSharp");
            } else if (e.getActionCommand().equals("A")) {
                System.out.println("lowA");
            } else if (e.getActionCommand().equals("A#")) {
                System.out.println("lowASharp");
            } else if (e.getActionCommand().equals("B")) {
                System.out.println("lowB");
            }
        }
    }

    public static class KListenHigh implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("C")) {
                System.out.println("high C");
            } else if (e.getActionCommand().equals("C#")) {
                System.out.println("highCSharp");
            } else if (e.getActionCommand().equals("D")) {
                System.out.println("highD");
            } else if (e.getActionCommand().equals("D#")) {
                System.out.println("highDSharp");
            } else if (e.getActionCommand().equals("E")) {
                System.out.println("highE");
            } else if (e.getActionCommand().equals("F")) {
                System.out.println("highF");
            } else if (e.getActionCommand().equals("F#")) {
                System.out.println("highFSharp");
            } else if (e.getActionCommand().equals("G")) {
                System.out.println("highG");
            } else if (e.getActionCommand().equals("G#")) {
                System.out.println("highGSharp");
            } else if (e.getActionCommand().equals("A")) {
                System.out.println("highA");
            } else if (e.getActionCommand().equals("A#")) {
                System.out.println("highASharp");
            } else if (e.getActionCommand().equals("B")) {
                System.out.println("highB");
            }
        }
    }
}
