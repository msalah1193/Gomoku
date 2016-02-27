/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gomoku;

import java.util.ArrayList;

/**
 *
 * @author kito
 */

public class board extends javax.swing.JFrame {

    Game myGame;
    ArrayList<javax.swing.JLabel> labels;
    private int role;
    
    /**
     * the default constructor to initialize the array list label and add 196 labels 
     */
    public board() {
        initComponents();
        role = 1;
        labels = new ArrayList<javax.swing.JLabel>();
        labels.add(num00);
        labels.add(num01);
        labels.add(num02);
        labels.add(num03);
        labels.add(num04);
        labels.add(num05);
        labels.add(num06);
        labels.add(num07);
        labels.add(num08);
        labels.add(num09);
        labels.add(num010);
        labels.add(num011);
        labels.add(num012);
        labels.add(num013);
        labels.add(num10);
        labels.add(num11);
        labels.add(num12);
        labels.add(num13);
        labels.add(num14);
        labels.add(num15);
        labels.add(num16);
        labels.add(num17);
        labels.add(num18);
        labels.add(num19);
        labels.add(num110);
        labels.add(num111);
        labels.add(num112);
        labels.add(num113);
        labels.add(num20);
        labels.add(num21);
        labels.add(num22);
        labels.add(num23);
        labels.add(num24);
        labels.add(num25);
        labels.add(num26);
        labels.add(num27);
        labels.add(num28);
        labels.add(num29);
        labels.add(num210);
        labels.add(num211);
        labels.add(num212);
        labels.add(num213);
        labels.add(num30);
        labels.add(num31);
        labels.add(num32);
        labels.add(num33);
        labels.add(num34);
        labels.add(num35);
        labels.add(num36);
        labels.add(num37);
        labels.add(num38);
        labels.add(num39);
        labels.add(num310);
        labels.add(num311);
        labels.add(num312);
        labels.add(num313);
        labels.add(num40);
        labels.add(num41);
        labels.add(num42);
        labels.add(num43);
        labels.add(num44);
        labels.add(num45);
        labels.add(num46);
        labels.add(num47);
        labels.add(num48);
        labels.add(num49);
        labels.add(num410);
        labels.add(num411);
        labels.add(num412);
        labels.add(num413);
        labels.add(num50);
        labels.add(num51);
        labels.add(num52);
        labels.add(num53);
        labels.add(num54);
        labels.add(num55);
        labels.add(num56);
        labels.add(num57);
        labels.add(num58);
        labels.add(num59);
        labels.add(num510);
        labels.add(num511);
        labels.add(num512);
        labels.add(num513);
        labels.add(num60);
        labels.add(num61);
        labels.add(num62);
        labels.add(num63);
        labels.add(num64);
        labels.add(num65);
        labels.add(num66);
        labels.add(num67);
        labels.add(num68);
        labels.add(num69);
        labels.add(num610);
        labels.add(num611);
        labels.add(num612);
        labels.add(num613);
        labels.add(num70);
        labels.add(num71);
        labels.add(num72);
        labels.add(num73);
        labels.add(num74);
        labels.add(num75);
        labels.add(num76);
        labels.add(num77);
        labels.add(num78);
        labels.add(num79);
        labels.add(num710);
        labels.add(num711);
        labels.add(num712);
        labels.add(num713);
        labels.add(num80);
        labels.add(num81);
        labels.add(num82);
        labels.add(num83);
        labels.add(num84);
        labels.add(num85);
        labels.add(num86);
        labels.add(num87);
        labels.add(num88);
        labels.add(num89);
        labels.add(num810);
        labels.add(num811);
        labels.add(num812);
        labels.add(num813);
        labels.add(num90);
        labels.add(num91);
        labels.add(num92);
        labels.add(num93);
        labels.add(num94);
        labels.add(num95);
        labels.add(num96);
        labels.add(num97);
        labels.add(num98);
        labels.add(num99);
        labels.add(num910);
        labels.add(num911);
        labels.add(num912);
        labels.add(num913);
        labels.add(num100);
        labels.add(num101);
        labels.add(num102);
        labels.add(num103);
        labels.add(num104);
        labels.add(num105);
        labels.add(num106);
        labels.add(num107);
        labels.add(num108);
        labels.add(num109);
        labels.add(num1010);
        labels.add(num1011);
        labels.add(num1012);
        labels.add(num1013);
        labels.add(num1100);
        labels.add(num1101);
        labels.add(num1102);
        labels.add(num1103);
        labels.add(num1104);
        labels.add(num1105);
        labels.add(num1106);
        labels.add(num1107);
        labels.add(num1108);
        labels.add(num1109);
        labels.add(num1110);
        labels.add(num1111);
        labels.add(num1112);
        labels.add(num1113);
        labels.add(num1200);
        labels.add(num1201);
        labels.add(num1202);
        labels.add(num1203);
        labels.add(num1204);
        labels.add(num1205);
        labels.add(num1206);
        labels.add(num1207);
        labels.add(num1208);
        labels.add(num1209);
        labels.add(num1210);
        labels.add(num1211);
        labels.add(num1212);
        labels.add(num1213);
        labels.add(num1300);
        labels.add(num1301);
        labels.add(num1302);
        labels.add(num1303);
        labels.add(num1304);
        labels.add(num1305);
        labels.add(num1306);
        labels.add(num1307);
        labels.add(num1308);
        labels.add(num1309);
        labels.add(num1310);
        labels.add(num1311);
        labels.add(num1312);
        labels.add(num1313);
    }
    
    /**
     * 
     * @param s 
     * set the game object
     */
    public void setGame(Game s){
        myGame = s;
    }
    
    /**
     * 
     * @param row
     * @param col
     * save the board
     * check if the clicked position is allowed or not
     * check Game type 
     * if Single game call play and make computer plays with function of myGame levelofDiff
     * if Multi  game call play, hints 
     */
    public void click(int row, int col){
        myGame.saveBoard();
        //text.setText("" + row + "  ,  "+col);
        if(!myGame.allow(row, col))
                return;
        
        if(myGame.type == 1){
            myGame.play(myGame.p1.getType(), row, col);
            readBoard();
            
            if(myGame.check_win(myGame.p1.getType(), row, col)){
                wins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/Wins.PNG")));
                return;
            }
            
            if(myGame.levelOfDiff == 1)
                myGame.easy(row,col);
            
            else if(myGame.levelOfDiff == 2)
                myGame.medium(row, col);
            
            else if(myGame.levelOfDiff == 3)
                myGame.hard(row,col);
            
            if(myGame.check_win(myGame.p2.getType(), myGame.lastRow, myGame.lastCol)){
                wins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/Wins.PNG")));
                return;
            }
            readBoard();
        }
        else {
            if(role == 1)
                pPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/whiteplay.PNG")));
            else 
                pPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/blackplay.PNG")));
            
            myGame.play(role, row, col);
            myGame.hints(role, row, col);
            readBoard();
            myGame.resetBoard();
            
            if(myGame.check_win(role, row, col)){
                wins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/Wins.PNG")));
                return;
            }
            if(role == 1) // if player one role set the role to player two
                role = 2;
            else
                role = 1;
        }
        
    }
    
    /**
     * set image icon to labels 
     * if 0 set null
     * if 1 set black icon
     * if 2 set white icon
     * if 3 set hints icon
     */
    public void readBoard(){
        int cnt = 0;
        for(int i=0; i<14; i++){
            for(int j=0; j<14; j++){
                if(myGame.getAtIndex(i, j) == 0)
                    labels.get(cnt).setIcon(null);
                
                else if(myGame.getAtIndex(i, j) == 1)
                    labels.get(cnt).setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/b.PNG")));
                
                else if(myGame.getAtIndex(i, j) == 2)
                    labels.get(cnt).setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/a.PNG")));
                
                else if(myGame.getAtIndex(i, j) == 3)
                    labels.get(cnt).setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/r.PNG")));
                
                cnt++;
            }
        }
    }
      
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wins = new javax.swing.JLabel();
        newGame = new javax.swing.JLabel();
        undo = new javax.swing.JLabel();
        pPlay = new javax.swing.JLabel();
        num00 = new javax.swing.JLabel();
        num01 = new javax.swing.JLabel();
        num03 = new javax.swing.JLabel();
        num02 = new javax.swing.JLabel();
        num04 = new javax.swing.JLabel();
        num05 = new javax.swing.JLabel();
        num06 = new javax.swing.JLabel();
        num07 = new javax.swing.JLabel();
        num08 = new javax.swing.JLabel();
        num09 = new javax.swing.JLabel();
        num010 = new javax.swing.JLabel();
        num011 = new javax.swing.JLabel();
        num012 = new javax.swing.JLabel();
        num013 = new javax.swing.JLabel();
        num10 = new javax.swing.JLabel();
        num11 = new javax.swing.JLabel();
        num12 = new javax.swing.JLabel();
        num13 = new javax.swing.JLabel();
        num14 = new javax.swing.JLabel();
        num15 = new javax.swing.JLabel();
        num16 = new javax.swing.JLabel();
        num17 = new javax.swing.JLabel();
        num18 = new javax.swing.JLabel();
        num19 = new javax.swing.JLabel();
        num110 = new javax.swing.JLabel();
        num111 = new javax.swing.JLabel();
        num112 = new javax.swing.JLabel();
        num113 = new javax.swing.JLabel();
        num20 = new javax.swing.JLabel();
        num21 = new javax.swing.JLabel();
        num22 = new javax.swing.JLabel();
        num23 = new javax.swing.JLabel();
        num24 = new javax.swing.JLabel();
        num25 = new javax.swing.JLabel();
        num26 = new javax.swing.JLabel();
        num27 = new javax.swing.JLabel();
        num28 = new javax.swing.JLabel();
        num29 = new javax.swing.JLabel();
        num210 = new javax.swing.JLabel();
        num211 = new javax.swing.JLabel();
        num212 = new javax.swing.JLabel();
        num213 = new javax.swing.JLabel();
        num30 = new javax.swing.JLabel();
        num31 = new javax.swing.JLabel();
        num32 = new javax.swing.JLabel();
        num33 = new javax.swing.JLabel();
        num34 = new javax.swing.JLabel();
        num35 = new javax.swing.JLabel();
        num36 = new javax.swing.JLabel();
        num37 = new javax.swing.JLabel();
        num38 = new javax.swing.JLabel();
        num39 = new javax.swing.JLabel();
        num310 = new javax.swing.JLabel();
        num311 = new javax.swing.JLabel();
        num312 = new javax.swing.JLabel();
        num313 = new javax.swing.JLabel();
        num40 = new javax.swing.JLabel();
        num41 = new javax.swing.JLabel();
        num42 = new javax.swing.JLabel();
        num43 = new javax.swing.JLabel();
        num44 = new javax.swing.JLabel();
        num45 = new javax.swing.JLabel();
        num46 = new javax.swing.JLabel();
        num47 = new javax.swing.JLabel();
        num48 = new javax.swing.JLabel();
        num49 = new javax.swing.JLabel();
        num410 = new javax.swing.JLabel();
        num411 = new javax.swing.JLabel();
        num412 = new javax.swing.JLabel();
        num413 = new javax.swing.JLabel();
        num50 = new javax.swing.JLabel();
        num51 = new javax.swing.JLabel();
        num52 = new javax.swing.JLabel();
        num53 = new javax.swing.JLabel();
        num54 = new javax.swing.JLabel();
        num55 = new javax.swing.JLabel();
        num56 = new javax.swing.JLabel();
        num57 = new javax.swing.JLabel();
        num58 = new javax.swing.JLabel();
        num59 = new javax.swing.JLabel();
        num510 = new javax.swing.JLabel();
        num511 = new javax.swing.JLabel();
        num512 = new javax.swing.JLabel();
        num513 = new javax.swing.JLabel();
        num60 = new javax.swing.JLabel();
        num61 = new javax.swing.JLabel();
        num62 = new javax.swing.JLabel();
        num63 = new javax.swing.JLabel();
        num64 = new javax.swing.JLabel();
        num65 = new javax.swing.JLabel();
        num66 = new javax.swing.JLabel();
        num67 = new javax.swing.JLabel();
        num68 = new javax.swing.JLabel();
        num69 = new javax.swing.JLabel();
        num610 = new javax.swing.JLabel();
        num611 = new javax.swing.JLabel();
        num612 = new javax.swing.JLabel();
        num613 = new javax.swing.JLabel();
        num70 = new javax.swing.JLabel();
        num71 = new javax.swing.JLabel();
        num72 = new javax.swing.JLabel();
        num73 = new javax.swing.JLabel();
        num74 = new javax.swing.JLabel();
        num75 = new javax.swing.JLabel();
        num76 = new javax.swing.JLabel();
        num77 = new javax.swing.JLabel();
        num78 = new javax.swing.JLabel();
        num79 = new javax.swing.JLabel();
        num710 = new javax.swing.JLabel();
        num711 = new javax.swing.JLabel();
        num712 = new javax.swing.JLabel();
        num713 = new javax.swing.JLabel();
        num80 = new javax.swing.JLabel();
        num81 = new javax.swing.JLabel();
        num82 = new javax.swing.JLabel();
        num83 = new javax.swing.JLabel();
        num84 = new javax.swing.JLabel();
        num85 = new javax.swing.JLabel();
        num86 = new javax.swing.JLabel();
        num87 = new javax.swing.JLabel();
        num88 = new javax.swing.JLabel();
        num89 = new javax.swing.JLabel();
        num810 = new javax.swing.JLabel();
        num811 = new javax.swing.JLabel();
        num812 = new javax.swing.JLabel();
        num813 = new javax.swing.JLabel();
        num90 = new javax.swing.JLabel();
        num91 = new javax.swing.JLabel();
        num92 = new javax.swing.JLabel();
        num93 = new javax.swing.JLabel();
        num94 = new javax.swing.JLabel();
        num95 = new javax.swing.JLabel();
        num96 = new javax.swing.JLabel();
        num97 = new javax.swing.JLabel();
        num98 = new javax.swing.JLabel();
        num99 = new javax.swing.JLabel();
        num910 = new javax.swing.JLabel();
        num911 = new javax.swing.JLabel();
        num912 = new javax.swing.JLabel();
        num913 = new javax.swing.JLabel();
        num100 = new javax.swing.JLabel();
        num101 = new javax.swing.JLabel();
        num102 = new javax.swing.JLabel();
        num103 = new javax.swing.JLabel();
        num104 = new javax.swing.JLabel();
        num105 = new javax.swing.JLabel();
        num106 = new javax.swing.JLabel();
        num107 = new javax.swing.JLabel();
        num108 = new javax.swing.JLabel();
        num109 = new javax.swing.JLabel();
        num1010 = new javax.swing.JLabel();
        num1011 = new javax.swing.JLabel();
        num1012 = new javax.swing.JLabel();
        num1013 = new javax.swing.JLabel();
        num1100 = new javax.swing.JLabel();
        num1101 = new javax.swing.JLabel();
        num1102 = new javax.swing.JLabel();
        num1103 = new javax.swing.JLabel();
        num1104 = new javax.swing.JLabel();
        num1105 = new javax.swing.JLabel();
        num1106 = new javax.swing.JLabel();
        num1107 = new javax.swing.JLabel();
        num1108 = new javax.swing.JLabel();
        num1109 = new javax.swing.JLabel();
        num1110 = new javax.swing.JLabel();
        num1111 = new javax.swing.JLabel();
        num1112 = new javax.swing.JLabel();
        num1113 = new javax.swing.JLabel();
        num1200 = new javax.swing.JLabel();
        num1201 = new javax.swing.JLabel();
        num1202 = new javax.swing.JLabel();
        num1203 = new javax.swing.JLabel();
        num1204 = new javax.swing.JLabel();
        num1205 = new javax.swing.JLabel();
        num1206 = new javax.swing.JLabel();
        num1207 = new javax.swing.JLabel();
        num1208 = new javax.swing.JLabel();
        num1209 = new javax.swing.JLabel();
        num1210 = new javax.swing.JLabel();
        num1211 = new javax.swing.JLabel();
        num1212 = new javax.swing.JLabel();
        num1213 = new javax.swing.JLabel();
        num1300 = new javax.swing.JLabel();
        num1301 = new javax.swing.JLabel();
        num1302 = new javax.swing.JLabel();
        num1303 = new javax.swing.JLabel();
        num1304 = new javax.swing.JLabel();
        num1305 = new javax.swing.JLabel();
        num1306 = new javax.swing.JLabel();
        num1307 = new javax.swing.JLabel();
        num1308 = new javax.swing.JLabel();
        num1309 = new javax.swing.JLabel();
        num1310 = new javax.swing.JLabel();
        num1311 = new javax.swing.JLabel();
        num1312 = new javax.swing.JLabel();
        num1313 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gomoku - Board");
        setMaximumSize(new java.awt.Dimension(655, 515));
        setMinimumSize(new java.awt.Dimension(655, 515));
        setPreferredSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(null);

        wins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                winsMouseClicked(evt);
            }
        });
        getContentPane().add(wins);
        wins.setBounds(500, 148, 140, 130);

        newGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/new.PNG"))); // NOI18N
        newGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newGameMouseClicked(evt);
            }
        });
        getContentPane().add(newGame);
        newGame.setBounds(480, 340, 158, 60);

        undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/undo.PNG"))); // NOI18N
        undo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                undoMouseClicked(evt);
            }
        });
        getContentPane().add(undo);
        undo.setBounds(500, 410, 118, 50);

        pPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/blackplay.PNG"))); // NOI18N
        getContentPane().add(pPlay);
        pPlay.setBounds(490, 40, 140, 50);

        num00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num00MouseClicked(evt);
            }
        });
        getContentPane().add(num00);
        num00.setBounds(30, 35, 22, 23);

        num01.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num01MouseClicked(evt);
            }
        });
        getContentPane().add(num01);
        num01.setBounds(60, 35, 22, 23);

        num03.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num03MouseClicked(evt);
            }
        });
        getContentPane().add(num03);
        num03.setBounds(127, 35, 22, 23);

        num02.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num02MouseClicked(evt);
            }
        });
        getContentPane().add(num02);
        num02.setBounds(95, 35, 22, 23);

        num04.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num04MouseClicked(evt);
            }
        });
        getContentPane().add(num04);
        num04.setBounds(160, 35, 22, 23);

        num05.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num05MouseClicked(evt);
            }
        });
        getContentPane().add(num05);
        num05.setBounds(190, 35, 22, 23);

        num06.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num06MouseClicked(evt);
            }
        });
        getContentPane().add(num06);
        num06.setBounds(223, 35, 22, 23);

        num07.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num07MouseClicked(evt);
            }
        });
        getContentPane().add(num07);
        num07.setBounds(255, 35, 22, 23);

        num08.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num08MouseClicked(evt);
            }
        });
        getContentPane().add(num08);
        num08.setBounds(285, 35, 22, 23);

        num09.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num09MouseClicked(evt);
            }
        });
        getContentPane().add(num09);
        num09.setBounds(318, 35, 22, 23);

        num010.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num010.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num010MouseClicked(evt);
            }
        });
        getContentPane().add(num010);
        num010.setBounds(348, 35, 22, 23);

        num011.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num011.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num011MouseClicked(evt);
            }
        });
        getContentPane().add(num011);
        num011.setBounds(380, 35, 22, 23);

        num012.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num012.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num012MouseClicked(evt);
            }
        });
        getContentPane().add(num012);
        num012.setBounds(412, 35, 22, 23);

        num013.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num013.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num013MouseClicked(evt);
            }
        });
        getContentPane().add(num013);
        num013.setBounds(442, 35, 22, 23);

        num10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num10MouseClicked(evt);
            }
        });
        getContentPane().add(num10);
        num10.setBounds(31, 68, 22, 23);

        num11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num11MouseClicked(evt);
            }
        });
        getContentPane().add(num11);
        num11.setBounds(62, 68, 22, 23);

        num12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num12MouseClicked(evt);
            }
        });
        getContentPane().add(num12);
        num12.setBounds(96, 68, 22, 23);

        num13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num13MouseClicked(evt);
            }
        });
        getContentPane().add(num13);
        num13.setBounds(126, 68, 22, 23);

        num14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num14MouseClicked(evt);
            }
        });
        getContentPane().add(num14);
        num14.setBounds(158, 68, 22, 23);

        num15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num15MouseClicked(evt);
            }
        });
        getContentPane().add(num15);
        num15.setBounds(190, 68, 22, 23);

        num16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num16MouseClicked(evt);
            }
        });
        getContentPane().add(num16);
        num16.setBounds(223, 68, 22, 23);

        num17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num17MouseClicked(evt);
            }
        });
        getContentPane().add(num17);
        num17.setBounds(255, 68, 22, 23);

        num18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num18MouseClicked(evt);
            }
        });
        getContentPane().add(num18);
        num18.setBounds(285, 68, 22, 23);

        num19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num19MouseClicked(evt);
            }
        });
        getContentPane().add(num19);
        num19.setBounds(318, 68, 22, 23);

        num110.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num110MouseClicked(evt);
            }
        });
        getContentPane().add(num110);
        num110.setBounds(348, 68, 22, 23);

        num111.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num111MouseClicked(evt);
            }
        });
        getContentPane().add(num111);
        num111.setBounds(380, 68, 22, 23);

        num112.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num112.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num112MouseClicked(evt);
            }
        });
        getContentPane().add(num112);
        num112.setBounds(412, 68, 22, 23);

        num113.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num113.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num113MouseClicked(evt);
            }
        });
        getContentPane().add(num113);
        num113.setBounds(442, 68, 22, 23);

        num20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num20MouseClicked(evt);
            }
        });
        getContentPane().add(num20);
        num20.setBounds(31, 98, 22, 23);

        num21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num21MouseClicked(evt);
            }
        });
        getContentPane().add(num21);
        num21.setBounds(62, 98, 22, 23);

        num22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num22MouseClicked(evt);
            }
        });
        getContentPane().add(num22);
        num22.setBounds(96, 98, 22, 23);

        num23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num23MouseClicked(evt);
            }
        });
        getContentPane().add(num23);
        num23.setBounds(126, 98, 22, 23);

        num24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num24MouseClicked(evt);
            }
        });
        getContentPane().add(num24);
        num24.setBounds(158, 98, 22, 23);

        num25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num25MouseClicked(evt);
            }
        });
        getContentPane().add(num25);
        num25.setBounds(190, 98, 22, 23);

        num26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num26MouseClicked(evt);
            }
        });
        getContentPane().add(num26);
        num26.setBounds(223, 98, 22, 23);

        num27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num27MouseClicked(evt);
            }
        });
        getContentPane().add(num27);
        num27.setBounds(255, 98, 22, 23);

        num28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num28MouseClicked(evt);
            }
        });
        getContentPane().add(num28);
        num28.setBounds(285, 98, 22, 23);

        num29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num29MouseClicked(evt);
            }
        });
        getContentPane().add(num29);
        num29.setBounds(318, 98, 22, 23);

        num210.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num210.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num210MouseClicked(evt);
            }
        });
        getContentPane().add(num210);
        num210.setBounds(348, 98, 22, 23);

        num211.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num211.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num211MouseClicked(evt);
            }
        });
        getContentPane().add(num211);
        num211.setBounds(380, 98, 22, 23);

        num212.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num212.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num212MouseClicked(evt);
            }
        });
        getContentPane().add(num212);
        num212.setBounds(412, 98, 22, 23);

        num213.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num213.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num213MouseClicked(evt);
            }
        });
        getContentPane().add(num213);
        num213.setBounds(442, 98, 22, 23);

        num30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num30MouseClicked(evt);
            }
        });
        getContentPane().add(num30);
        num30.setBounds(31, 132, 22, 23);

        num31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num31MouseClicked(evt);
            }
        });
        getContentPane().add(num31);
        num31.setBounds(62, 132, 22, 23);

        num32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num32MouseClicked(evt);
            }
        });
        getContentPane().add(num32);
        num32.setBounds(96, 132, 22, 23);

        num33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num33MouseClicked(evt);
            }
        });
        getContentPane().add(num33);
        num33.setBounds(126, 132, 22, 23);

        num34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num34MouseClicked(evt);
            }
        });
        getContentPane().add(num34);
        num34.setBounds(158, 132, 22, 23);

        num35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num35MouseClicked(evt);
            }
        });
        getContentPane().add(num35);
        num35.setBounds(190, 132, 22, 23);

        num36.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num36MouseClicked(evt);
            }
        });
        getContentPane().add(num36);
        num36.setBounds(223, 132, 22, 23);

        num37.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num37MouseClicked(evt);
            }
        });
        getContentPane().add(num37);
        num37.setBounds(255, 132, 22, 23);

        num38.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num38MouseClicked(evt);
            }
        });
        getContentPane().add(num38);
        num38.setBounds(285, 132, 22, 23);

        num39.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num39MouseClicked(evt);
            }
        });
        getContentPane().add(num39);
        num39.setBounds(318, 132, 22, 23);

        num310.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num310.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num310MouseClicked(evt);
            }
        });
        getContentPane().add(num310);
        num310.setBounds(348, 132, 22, 23);

        num311.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num311.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num311MouseClicked(evt);
            }
        });
        getContentPane().add(num311);
        num311.setBounds(380, 132, 22, 23);

        num312.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num312.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num312MouseClicked(evt);
            }
        });
        getContentPane().add(num312);
        num312.setBounds(412, 132, 22, 23);

        num313.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num313.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num313MouseClicked(evt);
            }
        });
        getContentPane().add(num313);
        num313.setBounds(442, 132, 22, 23);

        num40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num40MouseClicked(evt);
            }
        });
        getContentPane().add(num40);
        num40.setBounds(31, 162, 22, 23);

        num41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num41MouseClicked(evt);
            }
        });
        getContentPane().add(num41);
        num41.setBounds(62, 162, 22, 23);

        num42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num42MouseClicked(evt);
            }
        });
        getContentPane().add(num42);
        num42.setBounds(96, 162, 22, 23);

        num43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num43MouseClicked(evt);
            }
        });
        getContentPane().add(num43);
        num43.setBounds(126, 162, 22, 23);

        num44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num44MouseClicked(evt);
            }
        });
        getContentPane().add(num44);
        num44.setBounds(158, 162, 22, 23);

        num45.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num45MouseClicked(evt);
            }
        });
        getContentPane().add(num45);
        num45.setBounds(190, 162, 22, 23);

        num46.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num46MouseClicked(evt);
            }
        });
        getContentPane().add(num46);
        num46.setBounds(223, 162, 22, 23);

        num47.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num47MouseClicked(evt);
            }
        });
        getContentPane().add(num47);
        num47.setBounds(255, 162, 22, 23);

        num48.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num48MouseClicked(evt);
            }
        });
        getContentPane().add(num48);
        num48.setBounds(285, 162, 22, 23);

        num49.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num49MouseClicked(evt);
            }
        });
        getContentPane().add(num49);
        num49.setBounds(318, 162, 22, 23);

        num410.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num410.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num410MouseClicked(evt);
            }
        });
        getContentPane().add(num410);
        num410.setBounds(348, 162, 22, 23);

        num411.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num411.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num411MouseClicked(evt);
            }
        });
        getContentPane().add(num411);
        num411.setBounds(380, 162, 22, 23);

        num412.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num412.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num412MouseClicked(evt);
            }
        });
        getContentPane().add(num412);
        num412.setBounds(412, 162, 22, 23);

        num413.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num413.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num413MouseClicked(evt);
            }
        });
        getContentPane().add(num413);
        num413.setBounds(442, 162, 22, 23);

        num50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num50MouseClicked(evt);
            }
        });
        getContentPane().add(num50);
        num50.setBounds(31, 195, 22, 23);

        num51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num51MouseClicked(evt);
            }
        });
        getContentPane().add(num51);
        num51.setBounds(62, 195, 22, 23);

        num52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num52MouseClicked(evt);
            }
        });
        getContentPane().add(num52);
        num52.setBounds(96, 195, 22, 23);

        num53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num53MouseClicked(evt);
            }
        });
        getContentPane().add(num53);
        num53.setBounds(126, 195, 22, 23);

        num54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num54MouseClicked(evt);
            }
        });
        getContentPane().add(num54);
        num54.setBounds(158, 195, 22, 23);

        num55.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num55MouseClicked(evt);
            }
        });
        getContentPane().add(num55);
        num55.setBounds(190, 195, 22, 23);

        num56.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num56MouseClicked(evt);
            }
        });
        getContentPane().add(num56);
        num56.setBounds(223, 195, 22, 23);

        num57.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num57MouseClicked(evt);
            }
        });
        getContentPane().add(num57);
        num57.setBounds(255, 195, 22, 23);

        num58.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num58MouseClicked(evt);
            }
        });
        getContentPane().add(num58);
        num58.setBounds(285, 195, 22, 23);

        num59.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num59MouseClicked(evt);
            }
        });
        getContentPane().add(num59);
        num59.setBounds(318, 195, 22, 23);

        num510.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num510.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num510MouseClicked(evt);
            }
        });
        getContentPane().add(num510);
        num510.setBounds(348, 195, 22, 23);

        num511.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num511.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num511MouseClicked(evt);
            }
        });
        getContentPane().add(num511);
        num511.setBounds(380, 195, 22, 23);

        num512.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num512.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num512MouseClicked(evt);
            }
        });
        getContentPane().add(num512);
        num512.setBounds(412, 195, 22, 23);

        num513.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num513.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num513MouseClicked(evt);
            }
        });
        getContentPane().add(num513);
        num513.setBounds(442, 195, 22, 23);

        num60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num60MouseClicked(evt);
            }
        });
        getContentPane().add(num60);
        num60.setBounds(31, 227, 22, 23);

        num61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num61MouseClicked(evt);
            }
        });
        getContentPane().add(num61);
        num61.setBounds(62, 227, 22, 23);

        num62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num62MouseClicked(evt);
            }
        });
        getContentPane().add(num62);
        num62.setBounds(96, 227, 22, 23);

        num63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num63MouseClicked(evt);
            }
        });
        getContentPane().add(num63);
        num63.setBounds(126, 227, 22, 23);

        num64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num64MouseClicked(evt);
            }
        });
        getContentPane().add(num64);
        num64.setBounds(158, 227, 22, 23);

        num65.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num65MouseClicked(evt);
            }
        });
        getContentPane().add(num65);
        num65.setBounds(190, 227, 22, 23);

        num66.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num66MouseClicked(evt);
            }
        });
        getContentPane().add(num66);
        num66.setBounds(223, 227, 22, 23);

        num67.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num67MouseClicked(evt);
            }
        });
        getContentPane().add(num67);
        num67.setBounds(255, 227, 22, 23);

        num68.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num68MouseClicked(evt);
            }
        });
        getContentPane().add(num68);
        num68.setBounds(285, 227, 22, 23);

        num69.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num69MouseClicked(evt);
            }
        });
        getContentPane().add(num69);
        num69.setBounds(318, 227, 22, 23);

        num610.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num610.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num610MouseClicked(evt);
            }
        });
        getContentPane().add(num610);
        num610.setBounds(348, 227, 22, 23);

        num611.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num611.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num611MouseClicked(evt);
            }
        });
        getContentPane().add(num611);
        num611.setBounds(380, 227, 22, 23);

        num612.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num612.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num612MouseClicked(evt);
            }
        });
        getContentPane().add(num612);
        num612.setBounds(412, 227, 22, 23);

        num613.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num613.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num613MouseClicked(evt);
            }
        });
        getContentPane().add(num613);
        num613.setBounds(442, 227, 22, 23);

        num70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num70MouseClicked(evt);
            }
        });
        getContentPane().add(num70);
        num70.setBounds(31, 259, 22, 23);

        num71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num71MouseClicked(evt);
            }
        });
        getContentPane().add(num71);
        num71.setBounds(62, 259, 22, 23);

        num72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num72MouseClicked(evt);
            }
        });
        getContentPane().add(num72);
        num72.setBounds(96, 259, 22, 23);

        num73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num73MouseClicked(evt);
            }
        });
        getContentPane().add(num73);
        num73.setBounds(126, 259, 22, 23);

        num74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num74MouseClicked(evt);
            }
        });
        getContentPane().add(num74);
        num74.setBounds(158, 259, 22, 23);

        num75.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num75MouseClicked(evt);
            }
        });
        getContentPane().add(num75);
        num75.setBounds(190, 259, 22, 23);

        num76.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num76MouseClicked(evt);
            }
        });
        getContentPane().add(num76);
        num76.setBounds(223, 259, 22, 23);

        num77.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num77MouseClicked(evt);
            }
        });
        getContentPane().add(num77);
        num77.setBounds(255, 259, 22, 23);

        num78.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num78MouseClicked(evt);
            }
        });
        getContentPane().add(num78);
        num78.setBounds(285, 259, 22, 23);

        num79.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num79MouseClicked(evt);
            }
        });
        getContentPane().add(num79);
        num79.setBounds(318, 259, 22, 23);

        num710.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num710.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num710MouseClicked(evt);
            }
        });
        getContentPane().add(num710);
        num710.setBounds(348, 259, 22, 23);

        num711.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num711.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num711MouseClicked(evt);
            }
        });
        getContentPane().add(num711);
        num711.setBounds(380, 259, 22, 23);

        num712.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num712.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num712MouseClicked(evt);
            }
        });
        getContentPane().add(num712);
        num712.setBounds(412, 259, 22, 23);

        num713.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num713.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num713MouseClicked(evt);
            }
        });
        getContentPane().add(num713);
        num713.setBounds(442, 259, 22, 23);

        num80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num80MouseClicked(evt);
            }
        });
        getContentPane().add(num80);
        num80.setBounds(31, 291, 22, 23);

        num81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num81MouseClicked(evt);
            }
        });
        getContentPane().add(num81);
        num81.setBounds(62, 291, 22, 23);

        num82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num82MouseClicked(evt);
            }
        });
        getContentPane().add(num82);
        num82.setBounds(96, 291, 22, 23);

        num83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num83MouseClicked(evt);
            }
        });
        getContentPane().add(num83);
        num83.setBounds(126, 291, 22, 23);

        num84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num84MouseClicked(evt);
            }
        });
        getContentPane().add(num84);
        num84.setBounds(158, 291, 22, 23);

        num85.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num85MouseClicked(evt);
            }
        });
        getContentPane().add(num85);
        num85.setBounds(190, 291, 22, 23);

        num86.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num86MouseClicked(evt);
            }
        });
        getContentPane().add(num86);
        num86.setBounds(223, 291, 22, 23);

        num87.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num87MouseClicked(evt);
            }
        });
        getContentPane().add(num87);
        num87.setBounds(255, 291, 22, 23);

        num88.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num88MouseClicked(evt);
            }
        });
        getContentPane().add(num88);
        num88.setBounds(285, 291, 22, 23);

        num89.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num89MouseClicked(evt);
            }
        });
        getContentPane().add(num89);
        num89.setBounds(318, 291, 22, 23);

        num810.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num810.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num810MouseClicked(evt);
            }
        });
        getContentPane().add(num810);
        num810.setBounds(348, 291, 22, 23);

        num811.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num811.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num811MouseClicked(evt);
            }
        });
        getContentPane().add(num811);
        num811.setBounds(380, 291, 22, 23);

        num812.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num812.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num812MouseClicked(evt);
            }
        });
        getContentPane().add(num812);
        num812.setBounds(412, 291, 22, 23);

        num813.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num813.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num813MouseClicked(evt);
            }
        });
        getContentPane().add(num813);
        num813.setBounds(442, 291, 22, 23);

        num90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num90MouseClicked(evt);
            }
        });
        getContentPane().add(num90);
        num90.setBounds(31, 325, 22, 23);

        num91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num91MouseClicked(evt);
            }
        });
        getContentPane().add(num91);
        num91.setBounds(62, 325, 22, 23);

        num92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num92MouseClicked(evt);
            }
        });
        getContentPane().add(num92);
        num92.setBounds(96, 325, 22, 23);

        num93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num93MouseClicked(evt);
            }
        });
        getContentPane().add(num93);
        num93.setBounds(126, 325, 22, 23);

        num94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num94MouseClicked(evt);
            }
        });
        getContentPane().add(num94);
        num94.setBounds(158, 325, 22, 23);

        num95.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num95MouseClicked(evt);
            }
        });
        getContentPane().add(num95);
        num95.setBounds(190, 325, 22, 23);

        num96.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num96MouseClicked(evt);
            }
        });
        getContentPane().add(num96);
        num96.setBounds(223, 325, 22, 23);

        num97.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num97MouseClicked(evt);
            }
        });
        getContentPane().add(num97);
        num97.setBounds(255, 325, 22, 23);

        num98.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num98MouseClicked(evt);
            }
        });
        getContentPane().add(num98);
        num98.setBounds(285, 325, 22, 23);

        num99.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num99MouseClicked(evt);
            }
        });
        getContentPane().add(num99);
        num99.setBounds(318, 325, 22, 23);

        num910.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num910.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num910MouseClicked(evt);
            }
        });
        getContentPane().add(num910);
        num910.setBounds(348, 325, 22, 23);

        num911.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num911.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num911MouseClicked(evt);
            }
        });
        getContentPane().add(num911);
        num911.setBounds(380, 325, 22, 23);

        num912.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num912.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num912MouseClicked(evt);
            }
        });
        getContentPane().add(num912);
        num912.setBounds(412, 325, 22, 23);

        num913.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num913.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num913MouseClicked(evt);
            }
        });
        getContentPane().add(num913);
        num913.setBounds(442, 325, 22, 23);

        num100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num100MouseClicked(evt);
            }
        });
        getContentPane().add(num100);
        num100.setBounds(31, 355, 22, 23);

        num101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num101MouseClicked(evt);
            }
        });
        getContentPane().add(num101);
        num101.setBounds(62, 355, 22, 23);

        num102.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num102MouseClicked(evt);
            }
        });
        getContentPane().add(num102);
        num102.setBounds(96, 355, 22, 23);

        num103.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num103MouseClicked(evt);
            }
        });
        getContentPane().add(num103);
        num103.setBounds(126, 355, 22, 23);

        num104.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num104MouseClicked(evt);
            }
        });
        getContentPane().add(num104);
        num104.setBounds(158, 355, 22, 23);

        num105.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num105MouseClicked(evt);
            }
        });
        getContentPane().add(num105);
        num105.setBounds(190, 355, 22, 23);

        num106.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num106MouseClicked(evt);
            }
        });
        getContentPane().add(num106);
        num106.setBounds(223, 355, 22, 23);

        num107.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num107.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num107MouseClicked(evt);
            }
        });
        getContentPane().add(num107);
        num107.setBounds(255, 355, 22, 23);

        num108.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num108.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num108MouseClicked(evt);
            }
        });
        getContentPane().add(num108);
        num108.setBounds(285, 355, 22, 23);

        num109.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num109.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num109MouseClicked(evt);
            }
        });
        getContentPane().add(num109);
        num109.setBounds(318, 355, 22, 23);

        num1010.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1010.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1010MouseClicked(evt);
            }
        });
        getContentPane().add(num1010);
        num1010.setBounds(348, 355, 22, 23);

        num1011.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1011.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1011MouseClicked(evt);
            }
        });
        getContentPane().add(num1011);
        num1011.setBounds(380, 355, 22, 23);

        num1012.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1012.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1012MouseClicked(evt);
            }
        });
        getContentPane().add(num1012);
        num1012.setBounds(412, 355, 22, 23);

        num1013.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1013.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1013MouseClicked(evt);
            }
        });
        getContentPane().add(num1013);
        num1013.setBounds(442, 355, 22, 23);

        num1100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1100MouseClicked(evt);
            }
        });
        getContentPane().add(num1100);
        num1100.setBounds(31, 387, 22, 23);

        num1101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1101MouseClicked(evt);
            }
        });
        getContentPane().add(num1101);
        num1101.setBounds(62, 387, 22, 23);

        num1102.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1102MouseClicked(evt);
            }
        });
        getContentPane().add(num1102);
        num1102.setBounds(96, 387, 22, 23);

        num1103.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1103MouseClicked(evt);
            }
        });
        getContentPane().add(num1103);
        num1103.setBounds(126, 387, 22, 23);

        num1104.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1104MouseClicked(evt);
            }
        });
        getContentPane().add(num1104);
        num1104.setBounds(158, 387, 22, 23);

        num1105.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1105MouseClicked(evt);
            }
        });
        getContentPane().add(num1105);
        num1105.setBounds(190, 387, 22, 23);

        num1106.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1106MouseClicked(evt);
            }
        });
        getContentPane().add(num1106);
        num1106.setBounds(223, 387, 22, 23);

        num1107.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1107.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1107MouseClicked(evt);
            }
        });
        getContentPane().add(num1107);
        num1107.setBounds(255, 387, 22, 23);

        num1108.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1108.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1108MouseClicked(evt);
            }
        });
        getContentPane().add(num1108);
        num1108.setBounds(285, 387, 22, 23);

        num1109.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1109.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1109MouseClicked(evt);
            }
        });
        getContentPane().add(num1109);
        num1109.setBounds(318, 387, 22, 23);

        num1110.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1110MouseClicked(evt);
            }
        });
        getContentPane().add(num1110);
        num1110.setBounds(348, 387, 22, 23);

        num1111.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1111MouseClicked(evt);
            }
        });
        getContentPane().add(num1111);
        num1111.setBounds(380, 387, 22, 23);

        num1112.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1112.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1112MouseClicked(evt);
            }
        });
        getContentPane().add(num1112);
        num1112.setBounds(412, 387, 22, 23);

        num1113.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1113.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1113MouseClicked(evt);
            }
        });
        getContentPane().add(num1113);
        num1113.setBounds(442, 387, 22, 23);

        num1200.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1200MouseClicked(evt);
            }
        });
        getContentPane().add(num1200);
        num1200.setBounds(31, 419, 22, 23);

        num1201.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1201MouseClicked(evt);
            }
        });
        getContentPane().add(num1201);
        num1201.setBounds(62, 419, 22, 23);

        num1202.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1202MouseClicked(evt);
            }
        });
        getContentPane().add(num1202);
        num1202.setBounds(96, 419, 22, 23);

        num1203.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1203MouseClicked(evt);
            }
        });
        getContentPane().add(num1203);
        num1203.setBounds(126, 419, 22, 23);

        num1204.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1204MouseClicked(evt);
            }
        });
        getContentPane().add(num1204);
        num1204.setBounds(158, 419, 22, 23);

        num1205.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1205.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1205MouseClicked(evt);
            }
        });
        getContentPane().add(num1205);
        num1205.setBounds(190, 419, 22, 23);

        num1206.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1206.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1206MouseClicked(evt);
            }
        });
        getContentPane().add(num1206);
        num1206.setBounds(223, 419, 22, 23);

        num1207.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1207.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1207MouseClicked(evt);
            }
        });
        getContentPane().add(num1207);
        num1207.setBounds(255, 419, 22, 23);

        num1208.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1208.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1208MouseClicked(evt);
            }
        });
        getContentPane().add(num1208);
        num1208.setBounds(285, 419, 22, 23);

        num1209.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1209.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1209MouseClicked(evt);
            }
        });
        getContentPane().add(num1209);
        num1209.setBounds(318, 419, 22, 23);

        num1210.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1210.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1210MouseClicked(evt);
            }
        });
        getContentPane().add(num1210);
        num1210.setBounds(348, 419, 22, 23);

        num1211.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1211.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1211MouseClicked(evt);
            }
        });
        getContentPane().add(num1211);
        num1211.setBounds(380, 419, 22, 23);

        num1212.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1212.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1212MouseClicked(evt);
            }
        });
        getContentPane().add(num1212);
        num1212.setBounds(412, 419, 22, 23);

        num1213.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1213.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1213MouseClicked(evt);
            }
        });
        getContentPane().add(num1213);
        num1213.setBounds(442, 419, 22, 23);

        num1300.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1300MouseClicked(evt);
            }
        });
        getContentPane().add(num1300);
        num1300.setBounds(31, 449, 22, 23);

        num1301.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1301MouseClicked(evt);
            }
        });
        getContentPane().add(num1301);
        num1301.setBounds(62, 449, 22, 23);

        num1302.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1302MouseClicked(evt);
            }
        });
        getContentPane().add(num1302);
        num1302.setBounds(96, 449, 22, 23);

        num1303.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1303MouseClicked(evt);
            }
        });
        getContentPane().add(num1303);
        num1303.setBounds(126, 449, 22, 23);

        num1304.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1304MouseClicked(evt);
            }
        });
        getContentPane().add(num1304);
        num1304.setBounds(158, 449, 22, 23);

        num1305.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1305.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1305MouseClicked(evt);
            }
        });
        getContentPane().add(num1305);
        num1305.setBounds(190, 449, 22, 23);

        num1306.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1306.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1306MouseClicked(evt);
            }
        });
        getContentPane().add(num1306);
        num1306.setBounds(223, 449, 22, 23);

        num1307.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1307.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1307MouseClicked(evt);
            }
        });
        getContentPane().add(num1307);
        num1307.setBounds(255, 449, 22, 23);

        num1308.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1308.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1308MouseClicked(evt);
            }
        });
        getContentPane().add(num1308);
        num1308.setBounds(285, 449, 22, 23);

        num1309.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1309.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1309MouseClicked(evt);
            }
        });
        getContentPane().add(num1309);
        num1309.setBounds(318, 449, 22, 23);

        num1310.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1310.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1310MouseClicked(evt);
            }
        });
        getContentPane().add(num1310);
        num1310.setBounds(348, 449, 22, 23);

        num1311.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1311.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1311MouseClicked(evt);
            }
        });
        getContentPane().add(num1311);
        num1311.setBounds(380, 449, 22, 23);

        num1312.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1312.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1312MouseClicked(evt);
            }
        });
        getContentPane().add(num1312);
        num1312.setBounds(412, 449, 22, 23);

        num1313.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1313.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1313MouseClicked(evt);
            }
        });
        getContentPane().add(num1313);
        num1313.setBounds(442, 449, 22, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/board2.JPG"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 640, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * 
     * @param evt 
     * navigate to menu2 and hide board JFrame
     */
    private void newGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseClicked
        setVisible(false);
        menu2 N = new menu2();
        N.setVisible(true);
    }//GEN-LAST:event_newGameMouseClicked

    /**
     * Mouse Clicked Functions 
     * call click function with parameters row and col
     * 
     */
    private void num00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num00MouseClicked
        click(0,0);        
    }//GEN-LAST:event_num00MouseClicked

    private void num01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num01MouseClicked
        click(0,1);
    }//GEN-LAST:event_num01MouseClicked

    private void num10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num10MouseClicked
        click(1,0);
    }//GEN-LAST:event_num10MouseClicked

    private void num03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num03MouseClicked
        click(0,3);
    }//GEN-LAST:event_num03MouseClicked

    private void num02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num02MouseClicked
        click(0,2);
    }//GEN-LAST:event_num02MouseClicked

    private void num04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num04MouseClicked
        click(0,4);
    }//GEN-LAST:event_num04MouseClicked

    private void num05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num05MouseClicked
        click(0,5);
    }//GEN-LAST:event_num05MouseClicked

    private void num06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num06MouseClicked
        click(0,6);
    }//GEN-LAST:event_num06MouseClicked

    private void num07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num07MouseClicked
        click(0,7);
    }//GEN-LAST:event_num07MouseClicked

    private void num08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num08MouseClicked
        click(0,8);
    }//GEN-LAST:event_num08MouseClicked

    private void num09MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num09MouseClicked
        click(0,9);
    }//GEN-LAST:event_num09MouseClicked

    private void num010MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num010MouseClicked
        click(0,10);
    }//GEN-LAST:event_num010MouseClicked

    private void num011MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num011MouseClicked
        click(0,11);
    }//GEN-LAST:event_num011MouseClicked

    private void num012MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num012MouseClicked
        click(0,12);
    }//GEN-LAST:event_num012MouseClicked

    private void num013MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num013MouseClicked
        click(0,13);
    }//GEN-LAST:event_num013MouseClicked

    private void num11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num11MouseClicked
        click(1,1);
    }//GEN-LAST:event_num11MouseClicked

    private void num12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num12MouseClicked
        click(1,2);
    }//GEN-LAST:event_num12MouseClicked

    private void num13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num13MouseClicked
        click(1,3);
    }//GEN-LAST:event_num13MouseClicked

    private void num14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num14MouseClicked
        click(1,4);
    }//GEN-LAST:event_num14MouseClicked

    private void num15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num15MouseClicked
        click(1,5);
    }//GEN-LAST:event_num15MouseClicked

    private void num16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num16MouseClicked
        click(1,6);
    }//GEN-LAST:event_num16MouseClicked

    private void num17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num17MouseClicked
        click(1,7);
    }//GEN-LAST:event_num17MouseClicked

    private void num18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num18MouseClicked
        click(1,8);
    }//GEN-LAST:event_num18MouseClicked

    private void num19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num19MouseClicked
        click(1,9);
    }//GEN-LAST:event_num19MouseClicked

    private void num110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num110MouseClicked
        click(1,10);
    }//GEN-LAST:event_num110MouseClicked

    private void num111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num111MouseClicked
        click(1,11);
    }//GEN-LAST:event_num111MouseClicked

    private void num112MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num112MouseClicked
        click(1,12);
    }//GEN-LAST:event_num112MouseClicked

    private void num113MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num113MouseClicked
        click(1,13);
    }//GEN-LAST:event_num113MouseClicked

    private void num211MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num211MouseClicked
        click(2,11);
    }//GEN-LAST:event_num211MouseClicked

    private void num29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num29MouseClicked
        click(2,9);
    }//GEN-LAST:event_num29MouseClicked

    private void num25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num25MouseClicked
        click(2,5);
    }//GEN-LAST:event_num25MouseClicked

    private void num210MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num210MouseClicked
        click(2,10);
    }//GEN-LAST:event_num210MouseClicked

    private void num21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num21MouseClicked
        click(2,1);
    }//GEN-LAST:event_num21MouseClicked

    private void num22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num22MouseClicked
        click(2,2);
    }//GEN-LAST:event_num22MouseClicked

    private void num27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num27MouseClicked
        click(2,7);
    }//GEN-LAST:event_num27MouseClicked

    private void num24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num24MouseClicked
        click(2,4);
    }//GEN-LAST:event_num24MouseClicked

    private void num20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num20MouseClicked
        click(2,0);
    }//GEN-LAST:event_num20MouseClicked

    private void num23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num23MouseClicked
        click(2,3);
    }//GEN-LAST:event_num23MouseClicked

    private void num26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num26MouseClicked
        click(2,6);
    }//GEN-LAST:event_num26MouseClicked

    private void num28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num28MouseClicked
        click(2,8);
    }//GEN-LAST:event_num28MouseClicked

    private void num212MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num212MouseClicked
        click(2,12);
    }//GEN-LAST:event_num212MouseClicked

    private void num213MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num213MouseClicked
        click(2,13);
    }//GEN-LAST:event_num213MouseClicked

    private void num30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num30MouseClicked
        click(3,0);
    }//GEN-LAST:event_num30MouseClicked

    private void num31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num31MouseClicked
        click(3,1);
    }//GEN-LAST:event_num31MouseClicked

    private void num32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num32MouseClicked
        click(3,2);
    }//GEN-LAST:event_num32MouseClicked

    private void num33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num33MouseClicked
        click(3,3);
    }//GEN-LAST:event_num33MouseClicked

    private void num34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num34MouseClicked
        click(3,4);
    }//GEN-LAST:event_num34MouseClicked

    private void num35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num35MouseClicked
        click(3,5);
    }//GEN-LAST:event_num35MouseClicked

    private void num36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num36MouseClicked
        click(3,6);
    }//GEN-LAST:event_num36MouseClicked

    private void num37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num37MouseClicked
        click(3,7);
    }//GEN-LAST:event_num37MouseClicked

    private void num38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num38MouseClicked
        click(3,8);
    }//GEN-LAST:event_num38MouseClicked

    private void num39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num39MouseClicked
        click(3,9);
    }//GEN-LAST:event_num39MouseClicked

    private void num310MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num310MouseClicked
        click(3,10);
    }//GEN-LAST:event_num310MouseClicked

    private void num311MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num311MouseClicked
        click(3,11);
    }//GEN-LAST:event_num311MouseClicked

    private void num312MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num312MouseClicked
        click(3,12);
    }//GEN-LAST:event_num312MouseClicked

    private void num313MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num313MouseClicked
        click(3,13);
    }//GEN-LAST:event_num313MouseClicked

    private void num40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num40MouseClicked
        click(4,0);
    }//GEN-LAST:event_num40MouseClicked

    private void num41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num41MouseClicked
        click(4,1);
    }//GEN-LAST:event_num41MouseClicked

    private void num42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num42MouseClicked
        click(4,2);
    }//GEN-LAST:event_num42MouseClicked

    private void num43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num43MouseClicked
        click(4,3);
    }//GEN-LAST:event_num43MouseClicked

    private void num44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num44MouseClicked
        click(4,4);
    }//GEN-LAST:event_num44MouseClicked

    private void num45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num45MouseClicked
        click(4,5);
    }//GEN-LAST:event_num45MouseClicked

    private void num46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num46MouseClicked
        click(4,6);
    }//GEN-LAST:event_num46MouseClicked

    private void num47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num47MouseClicked
        click(4,7);
    }//GEN-LAST:event_num47MouseClicked

    private void num48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num48MouseClicked
        click(4,8);
    }//GEN-LAST:event_num48MouseClicked

    private void num49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num49MouseClicked
        click(4,9);
    }//GEN-LAST:event_num49MouseClicked

    private void num410MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num410MouseClicked
        click(4,10);
    }//GEN-LAST:event_num410MouseClicked

    private void num411MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num411MouseClicked
        click(4,11);
    }//GEN-LAST:event_num411MouseClicked

    private void num412MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num412MouseClicked
        click(4,12);
    }//GEN-LAST:event_num412MouseClicked

    private void num413MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num413MouseClicked
        click(4,13);
    }//GEN-LAST:event_num413MouseClicked

    private void num50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num50MouseClicked
        click(5,0);
    }//GEN-LAST:event_num50MouseClicked

    private void num51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num51MouseClicked
        click(5,1);
    }//GEN-LAST:event_num51MouseClicked

    private void num52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num52MouseClicked
        click(5,2);
    }//GEN-LAST:event_num52MouseClicked

    private void num53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num53MouseClicked
        click(5,3);
    }//GEN-LAST:event_num53MouseClicked

    private void num54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num54MouseClicked
        click(5,4);
    }//GEN-LAST:event_num54MouseClicked

    private void num55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num55MouseClicked
        click(5,5);
    }//GEN-LAST:event_num55MouseClicked

    private void num56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num56MouseClicked
        click(5,6);
    }//GEN-LAST:event_num56MouseClicked

    private void num57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num57MouseClicked
        click(5,7);
    }//GEN-LAST:event_num57MouseClicked

    private void num58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num58MouseClicked
        click(5,8);
    }//GEN-LAST:event_num58MouseClicked

    private void num59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num59MouseClicked
        click(5,9);
    }//GEN-LAST:event_num59MouseClicked

    private void num510MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num510MouseClicked
        click(5,10);
    }//GEN-LAST:event_num510MouseClicked

    private void num511MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num511MouseClicked
        click(5,11);
    }//GEN-LAST:event_num511MouseClicked

    private void num512MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num512MouseClicked
        click(5,12);
    }//GEN-LAST:event_num512MouseClicked

    private void num513MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num513MouseClicked
        click(5,13);
    }//GEN-LAST:event_num513MouseClicked

    private void num60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num60MouseClicked
        click(6,0);
    }//GEN-LAST:event_num60MouseClicked

    private void num61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num61MouseClicked
        click(6,1);
    }//GEN-LAST:event_num61MouseClicked

    private void num62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num62MouseClicked
        click(6,2);
    }//GEN-LAST:event_num62MouseClicked

    private void num63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num63MouseClicked
        click(6,3);
    }//GEN-LAST:event_num63MouseClicked

    private void num64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num64MouseClicked
        click(6,4);
    }//GEN-LAST:event_num64MouseClicked

    private void num65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num65MouseClicked
        click(6,5);
    }//GEN-LAST:event_num65MouseClicked

    private void num66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num66MouseClicked
        click(6,6);
    }//GEN-LAST:event_num66MouseClicked

    private void num67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num67MouseClicked
        click(6,7);
    }//GEN-LAST:event_num67MouseClicked

    private void num68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num68MouseClicked
        click(6,8);
    }//GEN-LAST:event_num68MouseClicked

    private void num69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num69MouseClicked
        click(6,9);
    }//GEN-LAST:event_num69MouseClicked

    private void num610MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num610MouseClicked
        click(6,10);
    }//GEN-LAST:event_num610MouseClicked

    private void num611MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num611MouseClicked
        click(6,11);
    }//GEN-LAST:event_num611MouseClicked

    private void num612MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num612MouseClicked
        click(6,12);
    }//GEN-LAST:event_num612MouseClicked

    private void num613MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num613MouseClicked
        click(6,13);
    }//GEN-LAST:event_num613MouseClicked

    private void num70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num70MouseClicked
        click(7,0);
    }//GEN-LAST:event_num70MouseClicked

    private void num71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num71MouseClicked
        click(7,1);
    }//GEN-LAST:event_num71MouseClicked

    private void num72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num72MouseClicked
        click(7,2);
    }//GEN-LAST:event_num72MouseClicked

    private void num73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num73MouseClicked
        click(7,3);
    }//GEN-LAST:event_num73MouseClicked

    private void num74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num74MouseClicked
        click(7,4);
    }//GEN-LAST:event_num74MouseClicked

    private void num75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num75MouseClicked
        click(7,5);
    }//GEN-LAST:event_num75MouseClicked

    private void num76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num76MouseClicked
        click(7,6);
    }//GEN-LAST:event_num76MouseClicked

    private void num77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num77MouseClicked
        click(7,7);
    }//GEN-LAST:event_num77MouseClicked

    private void num78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num78MouseClicked
        click(7,8);
    }//GEN-LAST:event_num78MouseClicked

    private void num79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num79MouseClicked
        click(7,9);
    }//GEN-LAST:event_num79MouseClicked

    private void num710MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num710MouseClicked
        click(7,10);
    }//GEN-LAST:event_num710MouseClicked

    private void num711MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num711MouseClicked
        click(7,11);
    }//GEN-LAST:event_num711MouseClicked

    private void num712MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num712MouseClicked
        click(7,12);
    }//GEN-LAST:event_num712MouseClicked

    private void num713MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num713MouseClicked
        click(7,13);
    }//GEN-LAST:event_num713MouseClicked

    private void num80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num80MouseClicked
        click(8,0);
    }//GEN-LAST:event_num80MouseClicked

    private void num81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num81MouseClicked
        click(8,1);
    }//GEN-LAST:event_num81MouseClicked

    private void num82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num82MouseClicked
        click(8,2);
    }//GEN-LAST:event_num82MouseClicked

    private void num83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num83MouseClicked
        click(8,3);
    }//GEN-LAST:event_num83MouseClicked

    private void num84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num84MouseClicked
        click(8,4);
    }//GEN-LAST:event_num84MouseClicked

    private void num85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num85MouseClicked
        click(8,5);
    }//GEN-LAST:event_num85MouseClicked

    private void num86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num86MouseClicked
        click(8,6);
    }//GEN-LAST:event_num86MouseClicked

    private void num87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num87MouseClicked
        click(8,7);
    }//GEN-LAST:event_num87MouseClicked

    private void num88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num88MouseClicked
        click(8,8);
    }//GEN-LAST:event_num88MouseClicked

    private void num89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num89MouseClicked
        click(8,9);
    }//GEN-LAST:event_num89MouseClicked

    private void num810MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num810MouseClicked
        click(8,10);
    }//GEN-LAST:event_num810MouseClicked

    private void num811MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num811MouseClicked
        click(8,11);
    }//GEN-LAST:event_num811MouseClicked

    private void num812MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num812MouseClicked
        click(8,12);
    }//GEN-LAST:event_num812MouseClicked

    private void num813MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num813MouseClicked
        click(8,13);
    }//GEN-LAST:event_num813MouseClicked

    private void num90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num90MouseClicked
        click(9,0);
    }//GEN-LAST:event_num90MouseClicked

    private void num91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num91MouseClicked
        click(9,1);
    }//GEN-LAST:event_num91MouseClicked

    private void num92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num92MouseClicked
        click(9,2);
    }//GEN-LAST:event_num92MouseClicked

    private void num93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num93MouseClicked
        click(9,3);
    }//GEN-LAST:event_num93MouseClicked

    private void num94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num94MouseClicked
        click(9,4);
    }//GEN-LAST:event_num94MouseClicked

    private void num95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num95MouseClicked
        click(9,5);
    }//GEN-LAST:event_num95MouseClicked

    private void num96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num96MouseClicked
        click(9,6);
    }//GEN-LAST:event_num96MouseClicked

    private void num97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num97MouseClicked
        click(9,7);
    }//GEN-LAST:event_num97MouseClicked

    private void num98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num98MouseClicked
        click(9,8);
    }//GEN-LAST:event_num98MouseClicked

    private void num99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num99MouseClicked
        click(9,9);
    }//GEN-LAST:event_num99MouseClicked

    private void num910MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num910MouseClicked
        click(9,10);
    }//GEN-LAST:event_num910MouseClicked

    private void num911MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num911MouseClicked
        click(9,11);
    }//GEN-LAST:event_num911MouseClicked

    private void num912MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num912MouseClicked
        click(9,12);
    }//GEN-LAST:event_num912MouseClicked

    private void num913MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num913MouseClicked
        click(9,13);
    }//GEN-LAST:event_num913MouseClicked

    private void num100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num100MouseClicked
        click(10,0);
    }//GEN-LAST:event_num100MouseClicked

    private void num101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num101MouseClicked
        click(10,1);
    }//GEN-LAST:event_num101MouseClicked

    private void num102MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num102MouseClicked
        click(10,2);
    }//GEN-LAST:event_num102MouseClicked

    private void num103MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num103MouseClicked
        click(10,3);
    }//GEN-LAST:event_num103MouseClicked

    private void num104MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num104MouseClicked
        click(10,4);
    }//GEN-LAST:event_num104MouseClicked

    private void num105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num105MouseClicked
        click(10,5);
    }//GEN-LAST:event_num105MouseClicked

    private void num106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num106MouseClicked
        click(10,6);
    }//GEN-LAST:event_num106MouseClicked

    private void num107MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num107MouseClicked
        click(10,7);
    }//GEN-LAST:event_num107MouseClicked

    private void num108MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num108MouseClicked
        click(10,8);
    }//GEN-LAST:event_num108MouseClicked

    private void num109MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num109MouseClicked
        click(10,9);
    }//GEN-LAST:event_num109MouseClicked

    private void num1010MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1010MouseClicked
        click(10,10);
    }//GEN-LAST:event_num1010MouseClicked

    private void num1011MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1011MouseClicked
        click(10,11);
    }//GEN-LAST:event_num1011MouseClicked

    private void num1012MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1012MouseClicked
        click(10,12);
    }//GEN-LAST:event_num1012MouseClicked

    private void num1013MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1013MouseClicked
        click(10,13);
    }//GEN-LAST:event_num1013MouseClicked

    private void num1100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1100MouseClicked
        click(11,0);
    }//GEN-LAST:event_num1100MouseClicked

    private void num1101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1101MouseClicked
        click(11,1);
    }//GEN-LAST:event_num1101MouseClicked

    private void num1102MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1102MouseClicked
        click(11,2);
    }//GEN-LAST:event_num1102MouseClicked

    private void num1103MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1103MouseClicked
        click(11,3);
    }//GEN-LAST:event_num1103MouseClicked

    private void num1104MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1104MouseClicked
        click(11,4);
    }//GEN-LAST:event_num1104MouseClicked

    private void num1105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1105MouseClicked
        click(11,5);
    }//GEN-LAST:event_num1105MouseClicked

    private void num1106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1106MouseClicked
        click(11,6);
    }//GEN-LAST:event_num1106MouseClicked

    private void num1107MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1107MouseClicked
        click(11,7);
    }//GEN-LAST:event_num1107MouseClicked

    private void num1108MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1108MouseClicked
        click(11,8);
    }//GEN-LAST:event_num1108MouseClicked

    private void num1109MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1109MouseClicked
        click(11,9);
    }//GEN-LAST:event_num1109MouseClicked

    private void num1110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1110MouseClicked
        click(11,10);
    }//GEN-LAST:event_num1110MouseClicked

    private void num1111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1111MouseClicked
        click(11,11);
    }//GEN-LAST:event_num1111MouseClicked

    private void num1112MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1112MouseClicked
        click(11,12);
    }//GEN-LAST:event_num1112MouseClicked

    private void num1113MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1113MouseClicked
        click(11,13);
    }//GEN-LAST:event_num1113MouseClicked

    private void num1200MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1200MouseClicked
        click(12,0);
    }//GEN-LAST:event_num1200MouseClicked

    private void num1201MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1201MouseClicked
        click(12,1);
    }//GEN-LAST:event_num1201MouseClicked

    private void num1202MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1202MouseClicked
        click(12,2);
    }//GEN-LAST:event_num1202MouseClicked

    private void num1203MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1203MouseClicked
        click(12,3);
    }//GEN-LAST:event_num1203MouseClicked

    private void num1204MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1204MouseClicked
        click(12,4);
    }//GEN-LAST:event_num1204MouseClicked

    private void num1205MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1205MouseClicked
        click(12,5);
    }//GEN-LAST:event_num1205MouseClicked

    private void num1206MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1206MouseClicked
        click(12,6);
    }//GEN-LAST:event_num1206MouseClicked

    private void num1207MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1207MouseClicked
        click(12,7);
    }//GEN-LAST:event_num1207MouseClicked

    private void num1208MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1208MouseClicked
        click(12,8);
    }//GEN-LAST:event_num1208MouseClicked

    private void num1209MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1209MouseClicked
        click(12,9);
    }//GEN-LAST:event_num1209MouseClicked

    private void num1210MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1210MouseClicked
        click(12,10);
    }//GEN-LAST:event_num1210MouseClicked

    private void num1211MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1211MouseClicked
        click(12,11);
    }//GEN-LAST:event_num1211MouseClicked

    private void num1212MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1212MouseClicked
        click(12,12);
    }//GEN-LAST:event_num1212MouseClicked

    private void num1213MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1213MouseClicked
        click(12,13);
    }//GEN-LAST:event_num1213MouseClicked

    private void num1300MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1300MouseClicked
        click(13,0);
    }//GEN-LAST:event_num1300MouseClicked

    private void num1301MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1301MouseClicked
        click(13,1);
    }//GEN-LAST:event_num1301MouseClicked

    private void num1302MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1302MouseClicked
        click(13,2);
    }//GEN-LAST:event_num1302MouseClicked

    private void num1303MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1303MouseClicked
        click(13,3);
    }//GEN-LAST:event_num1303MouseClicked

    private void num1304MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1304MouseClicked
        click(13,4);
    }//GEN-LAST:event_num1304MouseClicked

    private void num1305MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1305MouseClicked
        click(13,5);
    }//GEN-LAST:event_num1305MouseClicked

    private void num1306MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1306MouseClicked
        click(13,6);
    }//GEN-LAST:event_num1306MouseClicked

    private void num1307MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1307MouseClicked
        click(13,7);
    }//GEN-LAST:event_num1307MouseClicked

    private void num1308MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1308MouseClicked
        click(13,8);
    }//GEN-LAST:event_num1308MouseClicked

    private void num1309MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1309MouseClicked
        click(13,9);
    }//GEN-LAST:event_num1309MouseClicked

    private void num1310MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1310MouseClicked
        click(13,10);
    }//GEN-LAST:event_num1310MouseClicked

    private void num1311MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1311MouseClicked
        click(13,11);
    }//GEN-LAST:event_num1311MouseClicked

    private void num1312MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1312MouseClicked
        click(13,12);
    }//GEN-LAST:event_num1312MouseClicked

    private void num1313MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1313MouseClicked
        click(13,13);
    }//GEN-LAST:event_num1313MouseClicked

    private void winsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_winsMouseClicked
        wins.setIcon(null);
    }//GEN-LAST:event_winsMouseClicked

    
    /*
     * load board and change roles 
     */
    private void undoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_undoMouseClicked
        myGame.loadBoard();
        if(myGame.type == 2){
            if(role == 1){
                role = 2;
                pPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/whiteplay.PNG")));
            } else{
                role = 1;
                pPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gomoku/blackplay.PNG")));
            }
        }
        readBoard();
    }//GEN-LAST:event_undoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new board().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel newGame;
    private javax.swing.JLabel num00;
    private javax.swing.JLabel num01;
    private javax.swing.JLabel num010;
    private javax.swing.JLabel num011;
    private javax.swing.JLabel num012;
    private javax.swing.JLabel num013;
    private javax.swing.JLabel num02;
    private javax.swing.JLabel num03;
    private javax.swing.JLabel num04;
    private javax.swing.JLabel num05;
    private javax.swing.JLabel num06;
    private javax.swing.JLabel num07;
    private javax.swing.JLabel num08;
    private javax.swing.JLabel num09;
    private javax.swing.JLabel num10;
    private javax.swing.JLabel num100;
    private javax.swing.JLabel num101;
    private javax.swing.JLabel num1010;
    private javax.swing.JLabel num1011;
    private javax.swing.JLabel num1012;
    private javax.swing.JLabel num1013;
    private javax.swing.JLabel num102;
    private javax.swing.JLabel num103;
    private javax.swing.JLabel num104;
    private javax.swing.JLabel num105;
    private javax.swing.JLabel num106;
    private javax.swing.JLabel num107;
    private javax.swing.JLabel num108;
    private javax.swing.JLabel num109;
    private javax.swing.JLabel num11;
    private javax.swing.JLabel num110;
    private javax.swing.JLabel num1100;
    private javax.swing.JLabel num1101;
    private javax.swing.JLabel num1102;
    private javax.swing.JLabel num1103;
    private javax.swing.JLabel num1104;
    private javax.swing.JLabel num1105;
    private javax.swing.JLabel num1106;
    private javax.swing.JLabel num1107;
    private javax.swing.JLabel num1108;
    private javax.swing.JLabel num1109;
    private javax.swing.JLabel num111;
    private javax.swing.JLabel num1110;
    private javax.swing.JLabel num1111;
    private javax.swing.JLabel num1112;
    private javax.swing.JLabel num1113;
    private javax.swing.JLabel num112;
    private javax.swing.JLabel num113;
    private javax.swing.JLabel num12;
    private javax.swing.JLabel num1200;
    private javax.swing.JLabel num1201;
    private javax.swing.JLabel num1202;
    private javax.swing.JLabel num1203;
    private javax.swing.JLabel num1204;
    private javax.swing.JLabel num1205;
    private javax.swing.JLabel num1206;
    private javax.swing.JLabel num1207;
    private javax.swing.JLabel num1208;
    private javax.swing.JLabel num1209;
    private javax.swing.JLabel num1210;
    private javax.swing.JLabel num1211;
    private javax.swing.JLabel num1212;
    private javax.swing.JLabel num1213;
    private javax.swing.JLabel num13;
    private javax.swing.JLabel num1300;
    private javax.swing.JLabel num1301;
    private javax.swing.JLabel num1302;
    private javax.swing.JLabel num1303;
    private javax.swing.JLabel num1304;
    private javax.swing.JLabel num1305;
    private javax.swing.JLabel num1306;
    private javax.swing.JLabel num1307;
    private javax.swing.JLabel num1308;
    private javax.swing.JLabel num1309;
    private javax.swing.JLabel num1310;
    private javax.swing.JLabel num1311;
    private javax.swing.JLabel num1312;
    private javax.swing.JLabel num1313;
    private javax.swing.JLabel num14;
    private javax.swing.JLabel num15;
    private javax.swing.JLabel num16;
    private javax.swing.JLabel num17;
    private javax.swing.JLabel num18;
    private javax.swing.JLabel num19;
    private javax.swing.JLabel num20;
    private javax.swing.JLabel num21;
    private javax.swing.JLabel num210;
    private javax.swing.JLabel num211;
    private javax.swing.JLabel num212;
    private javax.swing.JLabel num213;
    private javax.swing.JLabel num22;
    private javax.swing.JLabel num23;
    private javax.swing.JLabel num24;
    private javax.swing.JLabel num25;
    private javax.swing.JLabel num26;
    private javax.swing.JLabel num27;
    private javax.swing.JLabel num28;
    private javax.swing.JLabel num29;
    private javax.swing.JLabel num30;
    private javax.swing.JLabel num31;
    private javax.swing.JLabel num310;
    private javax.swing.JLabel num311;
    private javax.swing.JLabel num312;
    private javax.swing.JLabel num313;
    private javax.swing.JLabel num32;
    private javax.swing.JLabel num33;
    private javax.swing.JLabel num34;
    private javax.swing.JLabel num35;
    private javax.swing.JLabel num36;
    private javax.swing.JLabel num37;
    private javax.swing.JLabel num38;
    private javax.swing.JLabel num39;
    private javax.swing.JLabel num40;
    private javax.swing.JLabel num41;
    private javax.swing.JLabel num410;
    private javax.swing.JLabel num411;
    private javax.swing.JLabel num412;
    private javax.swing.JLabel num413;
    private javax.swing.JLabel num42;
    private javax.swing.JLabel num43;
    private javax.swing.JLabel num44;
    private javax.swing.JLabel num45;
    private javax.swing.JLabel num46;
    private javax.swing.JLabel num47;
    private javax.swing.JLabel num48;
    private javax.swing.JLabel num49;
    private javax.swing.JLabel num50;
    private javax.swing.JLabel num51;
    private javax.swing.JLabel num510;
    private javax.swing.JLabel num511;
    private javax.swing.JLabel num512;
    private javax.swing.JLabel num513;
    private javax.swing.JLabel num52;
    private javax.swing.JLabel num53;
    private javax.swing.JLabel num54;
    private javax.swing.JLabel num55;
    private javax.swing.JLabel num56;
    private javax.swing.JLabel num57;
    private javax.swing.JLabel num58;
    private javax.swing.JLabel num59;
    private javax.swing.JLabel num60;
    private javax.swing.JLabel num61;
    private javax.swing.JLabel num610;
    private javax.swing.JLabel num611;
    private javax.swing.JLabel num612;
    private javax.swing.JLabel num613;
    private javax.swing.JLabel num62;
    private javax.swing.JLabel num63;
    private javax.swing.JLabel num64;
    private javax.swing.JLabel num65;
    private javax.swing.JLabel num66;
    private javax.swing.JLabel num67;
    private javax.swing.JLabel num68;
    private javax.swing.JLabel num69;
    private javax.swing.JLabel num70;
    private javax.swing.JLabel num71;
    private javax.swing.JLabel num710;
    private javax.swing.JLabel num711;
    private javax.swing.JLabel num712;
    private javax.swing.JLabel num713;
    private javax.swing.JLabel num72;
    private javax.swing.JLabel num73;
    private javax.swing.JLabel num74;
    private javax.swing.JLabel num75;
    private javax.swing.JLabel num76;
    private javax.swing.JLabel num77;
    private javax.swing.JLabel num78;
    private javax.swing.JLabel num79;
    private javax.swing.JLabel num80;
    private javax.swing.JLabel num81;
    private javax.swing.JLabel num810;
    private javax.swing.JLabel num811;
    private javax.swing.JLabel num812;
    private javax.swing.JLabel num813;
    private javax.swing.JLabel num82;
    private javax.swing.JLabel num83;
    private javax.swing.JLabel num84;
    private javax.swing.JLabel num85;
    private javax.swing.JLabel num86;
    private javax.swing.JLabel num87;
    private javax.swing.JLabel num88;
    private javax.swing.JLabel num89;
    private javax.swing.JLabel num90;
    private javax.swing.JLabel num91;
    private javax.swing.JLabel num910;
    private javax.swing.JLabel num911;
    private javax.swing.JLabel num912;
    private javax.swing.JLabel num913;
    private javax.swing.JLabel num92;
    private javax.swing.JLabel num93;
    private javax.swing.JLabel num94;
    private javax.swing.JLabel num95;
    private javax.swing.JLabel num96;
    private javax.swing.JLabel num97;
    private javax.swing.JLabel num98;
    private javax.swing.JLabel num99;
    private javax.swing.JLabel pPlay;
    private javax.swing.JLabel undo;
    private javax.swing.JLabel wins;
    // End of variables declaration//GEN-END:variables
}
