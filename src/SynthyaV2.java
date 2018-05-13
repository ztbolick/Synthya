import javax.swing.*;


public class SynthyaV2 {


    public static void main(String[] args) {
        JFrame gui = new JFrame("v1.0"); // instantiate a JFrame window
        gui.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );


        gui.add(FrontEnd.makeFrontEnd());
        gui.pack();
        gui.setResizable(false);
        gui.setVisible(true);
    }


}
