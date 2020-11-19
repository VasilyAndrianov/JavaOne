package Them8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFrame extends JFrame implements ActionListener {
    public CalcFrame(){
        setTitle("Calculate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 240, 370 );
        add(new CalcPanel());

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println(arg0.getActionCommand());
    }
}