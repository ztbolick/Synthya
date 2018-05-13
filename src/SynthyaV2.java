import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SynthyaV2 {

    private static JPanel frontEnd;

    public static void main(String[] args) {
        JFrame gui = new JFrame("v1.0"); // instantiate a JFrame window
        gui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        makeFrontEnd();
        gui.add(frontEnd);

        gui.pack();
        gui.setVisible(true);
    }

    private static void makeFrontEnd() {
        // Create JPanel with grid layout
        frontEnd = new JPanel();
        frontEnd.setLayout(new GridLayout(2,3));

        // Create new dimension for the size of the playable keys
        Dimension keySize = new Dimension(20,200);


        // Create the keys and set their size
        ////////////////////////// Low Keys ///////////////////////////////
        // C
        JButton lowC = new JButton("C");
        lowC.setPreferredSize(keySize);
        lowC.setMaximumSize(keySize);

        // C#
        JButton lowCSharp = new JButton("C#");
        lowCSharp.setPreferredSize(keySize);
        lowCSharp.setMaximumSize(keySize);

        // D
        JButton lowD = new JButton("D");
        lowD.setPreferredSize(keySize);
        lowD.setMaximumSize(keySize);

        // D#
        JButton lowDSharp = new JButton("D#");
        lowDSharp.setPreferredSize(keySize);
        lowDSharp.setMaximumSize(keySize);

        // E
        JButton lowE = new JButton("E");
        lowE.setPreferredSize(keySize);
        lowE.setMaximumSize(keySize);

        // F
        JButton lowF = new JButton("F");
        lowF.setPreferredSize(keySize);
        lowF.setMaximumSize(keySize);

        // F#
        JButton lowFSharp = new JButton("F#");
        lowFSharp.setPreferredSize(keySize);
        lowFSharp.setMaximumSize(keySize);

        // G
        JButton lowG = new JButton("G");
        lowG.setPreferredSize(keySize);
        lowG.setMaximumSize(keySize);

        // G#
        JButton lowGSharp = new JButton("G#");
        lowGSharp.setPreferredSize(keySize);
        lowGSharp.setMaximumSize(keySize);

        // A
        JButton lowA = new JButton("A");
        lowA.setPreferredSize(keySize);
        lowA.setMaximumSize(keySize);

        // A#
        JButton lowASharp = new JButton("A#");
        lowASharp.setPreferredSize(keySize);
        lowASharp.setMaximumSize(keySize);

        // B
        JButton lowB = new JButton("B");
        lowB.setPreferredSize(keySize);
        lowB.setMaximumSize(keySize);

        ////////////////////////// High Keys ///////////////////////////////
        // C
        JButton highC = new JButton("C");
        highC.setPreferredSize(keySize);
        highC.setMaximumSize(keySize);

        // C#
        JButton highCSharp = new JButton("C#");
        highCSharp.setPreferredSize(keySize);
        highCSharp.setMaximumSize(keySize);

        // D
        JButton highD = new JButton("D");
        highD.setPreferredSize(keySize);
        highD.setMaximumSize(keySize);

        // D#
        JButton highDSharp = new JButton("D#");
        highDSharp.setPreferredSize(keySize);
        highDSharp.setMaximumSize(keySize);

        // E
        JButton highE = new JButton("E");
        highE.setPreferredSize(keySize);
        highE.setMaximumSize(keySize);

        // F
        JButton highF = new JButton("F");
        highF.setPreferredSize(keySize);
        highF.setMaximumSize(keySize);

        // F#
        JButton highFSharp = new JButton("F#");
        highFSharp.setPreferredSize(keySize);
        highFSharp.setMaximumSize(keySize);

        // G
        JButton highG = new JButton("G");
        highG.setPreferredSize(keySize);
        highG.setMaximumSize(keySize);

        // G#
        JButton highGSharp = new JButton("G#");
        highGSharp.setPreferredSize(keySize);
        highGSharp.setMaximumSize(keySize);

        // A
        JButton highA = new JButton("A");
        highA.setPreferredSize(keySize);
        highA.setMaximumSize(keySize);

        // A#
        JButton highASharp = new JButton("A#");
        highASharp.setPreferredSize(keySize);
        highASharp.setMaximumSize(keySize);

        // B
        JButton highB = new JButton("B");
        highB.setPreferredSize(keySize);
        highB.setMaximumSize(keySize);

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
        // Low keys
        frontEnd.add(lowC);
        frontEnd.add(lowCSharp);
        frontEnd.add(lowD);
        frontEnd.add(lowDSharp);
        frontEnd.add(lowE);
        frontEnd.add(lowF);
        frontEnd.add(lowFSharp);
        frontEnd.add(lowG);
        frontEnd.add(lowGSharp);
        frontEnd.add(lowA);
        frontEnd.add(lowASharp);
        frontEnd.add(lowB);

        // High keys
        frontEnd.add(highC);
        frontEnd.add(highCSharp);
        frontEnd.add(highD);
        frontEnd.add(highDSharp);
        frontEnd.add(highE);
        frontEnd.add(highF);
        frontEnd.add(highFSharp);
        frontEnd.add(highG);
        frontEnd.add(highGSharp);
        frontEnd.add(highA);
        frontEnd.add(highASharp);
        frontEnd.add(highB);

    }


    // Key listener methods to listen for key pressed
    public static class KListenLow implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("C")) {
                System.out.println("low C");
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
