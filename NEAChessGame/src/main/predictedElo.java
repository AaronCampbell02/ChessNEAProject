package main;

import javax.swing.ImageIcon;
import javax.swing.*;

public class predictedElo extends JFrame {

    
    public predictedElo(int averageRating) {
        ImageIcon cornerIcon = new ImageIcon(getClass().getResource("/images/pawn.png"));
        setIconImage(cornerIcon.getImage());
        setTitle("Chess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        eloPanel eloPanel = new eloPanel(averageRating,this);
        add(eloPanel);
        pack();
        
        setLocationRelativeTo(null);
        setVisible(true);
        
        eloPanel.launchGame();
    }
}
	

