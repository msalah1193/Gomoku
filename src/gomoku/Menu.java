/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gomoku;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author kito
 */
public class Menu {
    JFrame mFrame;
    JFrame mFrame2;
    JFrame mFrame3;
            
    Menu(){
        mFrame = new JFrame();    
        mFrame.setSize(800, 600);
        mFrame.setLocationRelativeTo(null);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout();
        mFrame.setVisible(true);
        
        mFrame2 = new JFrame();
        mFrame3 = new JFrame();
        
    }
    void setLayout(){
        
        /*mFrame.setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("img\\a.jpg"));
        background.setLayout(new FlowLayout());
        mFrame.add(background);
        
        JLabel panel = new JLabel();
        panel.setLayout(new GridLayout(2,0));
        /*panel.setBounds(300, 200, 100, 140);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLocation(400, 300);
        panel.setHorizontalAlignment(JLabel.CENTER);
      //  panel.setVerticalAlignment(JLabel.CENTER);*/
        //panel.setHorizontalAlignment(JLabel.CENTER); 
        JPanel a = new JPanel();
        mFrame.setLayout(new BorderLayout());
	mFrame.setContentPane(new JLabel(new ImageIcon("img\\a.jpg")));
	mFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        ImageIcon img = new ImageIcon("img\\z.png");
        JButton newGame = new JButton();
        newGame.setIcon(img);
        newGame.setLocation(0,50);
        newGame.setFont(new Font( "Arial", Font.BOLD, 18));
        newGame.setBackground(Color.ORANGE);
        mFrame.add(newGame);
        newGame.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                goNext();
                setLayout2();
            }
        });
        
       /* JButton exit = new JButton("Exit");
        panel.add(exit);
        
        background.add(panel);
        mFrame.pack();
        panel.setLayout(new FlowLayout());
        panel.setVisible(true);*/
        
    }
    
    void goNext(){
        mFrame2.setSize(800, 600);
        mFrame2.setLocationRelativeTo(null);
        mFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setVisible(false);
        mFrame3.setVisible(false);
        mFrame2.setVisible(true);
    }
    
    void setLayout2(){
        JLabel playWith = new JLabel("PLAY WITH");        
        JRadioButton b1 = new JRadioButton("HUMAN");
        JRadioButton b2 = new JRadioButton("COMPUTER");
        
        JLabel color = new JLabel("YOUR COLOR");   
        JRadioButton b3 = new JRadioButton("WHITE");
        JRadioButton b4 = new JRadioButton("BLACK");
        
        JLabel diff = new JLabel("LEVEL OF DIFFCULTY");   
        JRadioButton b5 = new JRadioButton("EASY");
        JRadioButton b6 = new JRadioButton("MEDIUM");
        JRadioButton b7 = new JRadioButton("HARD");
        
        JButton start = new JButton("START");
        start.setFont(new Font( "Arial", Font.BOLD, 18));
        start.setBackground(Color.ORANGE);
        start.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                goNext2();
                setLayout3();
            }
        });
        

        
        JPanel panel = new JPanel();
        mFrame2.setLayout(null);

        panel.setBounds(100, 100, 200, 440);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        mFrame2.add(panel);
  
        
        panel.add (playWith);
        panel.add (b1);
        panel.add (b2);
        panel.add (color);
        panel.add (b3);
        panel.add (b4);
        panel.add (diff);
        panel.add (b5);
        panel.add (b6);
        panel.add (b7);
        panel.add (start);

    }
    
    void goNext2(){
        mFrame3.setSize(800, 600);
        mFrame3.setLocationRelativeTo(null);
        mFrame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame2.setVisible(false);
        mFrame.setVisible(false);
        mFrame3.setVisible(true);
    }
    
    void setLayout3(){
        JPanel parent = new JPanel();
        parent.setBounds(0,0, 800, 600);
        parent.setLayout(new GridBagLayout());
        parent.setBackground(Color.red);
        mFrame3.setLayout(null);
        mFrame3.add(parent);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        //panel.setBounds(1,0, 600, 600);
        panel.setLayout(new GridLayout(14, 14));
        for(int i=0; i<196; i++)
            panel.add(new JButton(" "));
        
        parent.add(panel);
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        parent.add(panel2);
        
        
        JPanel menu = new JPanel();
        menu.setBackground(Color.red);
        menu.setBounds(200, 200, 200, 600);
        menu.setLayout(new BoxLayout(menu, BoxLayout.PAGE_AXIS));
        
        JButton newGame = new JButton("NEW GAME");
        newGame.setFont(new Font( "Arial", Font.BOLD, 18));
        newGame.setBackground(Color.ORANGE);
        newGame.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                goNext();
                setLayout2();
            }
        });
        
        menu.add(newGame);
        
        JLabel ff = new JLabel("   ");
        menu.add(ff);
        
        JButton UNDO = new JButton("    UNDO     ");
        UNDO.setFont(new Font( "Arial", Font.BOLD, 18));
        UNDO.setBackground(Color.ORANGE);
        menu.add(UNDO);
        
        parent.add(menu);
        
    }
    
}
