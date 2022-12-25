import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class tictactoe {
    public static void main(String[] args) {
        game obj = new game();
    }


}

class game extends JFrame{
    JButton[][] boxes = new JButton[3][3];
//    JButton PlayAgain;
    JButton exit;
    JPanel panel;
    JFrame frame;
    Font custom = new Font("Courier New", Font.BOLD, 105);
    int clicked = 1;
    boolean flag00 = true;
    boolean flag01 = true;
    boolean flag02 = true;
    boolean flag10 = true;
    boolean flag11 = true;
    boolean flag12 = true;
    boolean flag20 = true;
    boolean flag21 = true;
    boolean flag22 = true;
    //int playagainclicked=0;


    public game() {
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        boxes[0][0] = new JButton("");
        boxes[0][1] = new JButton("");
        boxes[0][2] = new JButton("");
        boxes[1][0] = new JButton("");
        boxes[1][1] = new JButton("");
        boxes[1][2] = new JButton("");
        boxes[2][0] = new JButton("");
        boxes[2][1] = new JButton("");
        boxes[2][2] = new JButton("");


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxes[i][j].setForeground(Color.WHITE);
                boxes[i][j].setBackground(Color.darkGray);
                boxes[i][j].setBorder(BorderFactory.createRaisedBevelBorder());
                boxes[i][j].setFont(custom);
            }
        }

        panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setLayout(new GridLayout(3, 3, 5, 5));
        panel.setBounds(35, 55, 400, 400);

        panel.add(boxes[0][0]);
        panel.add(boxes[0][1]);
        panel.add(boxes[0][2]);
        panel.add(boxes[1][0]);
        panel.add(boxes[1][1]);
        panel.add(boxes[1][2]);
        panel.add(boxes[2][0]);
        panel.add(boxes[2][1]);
        panel.add(boxes[2][2]);
        add(panel);

        exit=new JButton("EXIT");
        exit.setBounds(465,55,100,400);
        exit.setForeground(Color.white);
        exit.setBackground(Color.black);
        add(exit);
        exit.addActionListener(e->
        {
            System.exit(0);
        });
//        PlayAgain = new JButton("RES");
//        PlayAgain.setBounds(465, 55, 100, 400);
//        PlayAgain.setForeground(Color.RED);
//        PlayAgain.setBackground(Color.black);
//        add(PlayAgain);
//        PlayAgain.addActionListener(e->{
//            if(e.getSource()==PlayAgain)
//            {
//                playagainclicked=1;
//                 boxes[0][0].setText(null);
//                 boxes[0][0].setEnabled(true);
//                 boxes[0][1].setText(null);
//                boxes[0][1].setEnabled(true);
//                 boxes[0][2].setText(null);
//                boxes[0][2].setEnabled(true);
//
//                 boxes[1][0].setText(null);
//                boxes[1][0].setEnabled(true);
//                 boxes[1][1].setText(null);
//                boxes[1][1].setEnabled(true);
//                 boxes[1][2].setText(null);
//                boxes[1][2].setEnabled(true);
//
//                 boxes[2][0].setText(null);
//                boxes[2][0].setEnabled(true);
//                 boxes[2][1].setText(null);
//                boxes[2][1].setEnabled(true);
//                 boxes[2][2].setText(null);
//                boxes[2][2].setEnabled(true);
//            }
//        });
boxes[0][0].addActionListener(e->{
    if (flag00) {
        clicked++;
        if (clicked % 2 == 0) {
            boxes[0][0].setLabel("O");
            boxes[0][0].setEnabled(false);
            flag00 = false;
        } else {
            boxes[0][0].setLabel("X");
            boxes[0][0].setEnabled(false);
            flag00 = false;
        }
        check_winner();
    }
});

boxes[0][1].addActionListener(e->
{
    if (flag01) {
        clicked++;
        if (clicked % 2 == 0) {
            boxes[0][1].setLabel("O");
            boxes[0][1].setEnabled(false);
            flag01 = false;
        } else {
            boxes[0][1].setLabel("X");
            boxes[0][1].setEnabled(false);
            flag01 = false;
        }
        check_winner();
    }

});
boxes[0][2].addActionListener(e->{
    if (flag02) {
        clicked++;
        if (clicked % 2 == 0) {
            boxes[0][2].setLabel("O");
            boxes[0][2].setEnabled(false);
            flag02 = false;
        } else {
            boxes[0][2].setLabel("X");
            boxes[0][2].setEnabled(false);
            flag02 = false;
        }
        check_winner();
    }

});
boxes[1][0].addActionListener(e->{
    if (flag10) {
        clicked++;
        if (clicked % 2 == 0) {
            boxes[1][0].setLabel("O");
            boxes[1][0].setEnabled(false);
            flag10 = false;
        } else {
            boxes[1][0].setLabel("X");
            boxes[1][0].setEnabled(false);
            flag10 = false;
        }
        check_winner();
    }
});
boxes[1][1].addActionListener(e->{
    if (flag11) {
        clicked++;
        if (clicked % 2 == 0) {
            boxes[1][1].setLabel("O");
            boxes[1][1].setEnabled(false);
            flag11 = false;
        } else {
            boxes[1][1].setLabel("X");
            boxes[1][1].setEnabled(false);
            flag11 = false;
        }
        check_winner();
    }
});
boxes[1][2].addActionListener(e->{
    if (flag12) {
        clicked++;
        if (clicked % 2 == 0) {
            boxes[1][2].setLabel("O");
            boxes[1][2].setEnabled(false);
            flag12 = false;
        } else {
            boxes[1][2].setLabel("X");
            boxes[1][2].setEnabled(false);
            flag12 = false;
        }
        check_winner();
    }
});
boxes[2][0].addActionListener(e->{
    if (flag20) {
        clicked++;
        if (clicked % 2 == 0) {
            boxes[2][0].setLabel("O");
            boxes[2][0].setEnabled(false);
            flag20 = false;
        } else {
            boxes[2][0].setLabel("X");
            boxes[2][0].setEnabled(false);
            flag20 = false;
        }
        check_winner();
    }
});
boxes[2][1].addActionListener(e->{
    if (flag21) {
        clicked++;
        if (clicked % 2 == 0) {
            boxes[2][1].setLabel("O");
            boxes[2][1].setEnabled(false);
            flag21 = false;
        } else {
            boxes[2][1].setLabel("X");
            boxes[2][1].setEnabled(false);
            flag21 = false;
        }
        check_winner();
    }
});
boxes[2][2].addActionListener(e->{
    if (flag22) {
        clicked++;
        if (clicked % 2 == 0) {
            boxes[2][2].setLabel("O");
            boxes[2][2].setEnabled(false);
            flag22 = false;
        } else {
            boxes[2][2].setLabel("X");
            boxes[2][2].setEnabled(false);
            flag22 = false;
        }
        check_winner();
    }
});


setVisible(true);

}

void check_winner(){
        if(flag00 == false && boxes[0][0].getText().equals(boxes[0][1].getText())&&boxes[0][1].getText().equals(boxes[0][2].getText())){
//            System.out.println("Winner");
            String value = boxes[0][0].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if(flag10 == false && boxes[1][0].getText().equals(boxes[1][1].getText())&&boxes[1][1].getText().equals(boxes[1][2].getText())) {
//            System.out.println("Winner");
            String value = boxes[1][0].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if(flag20 == false && boxes[2][0].getText().equals(boxes[2][1].getText())&&boxes[2][1].getText().equals(boxes[2][2].getText())) {
//            System.out.println("Winner");
            String value = boxes[2][0].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if(flag00 == false && boxes[0][0].getText().equals(boxes[1][1].getText())&&boxes[1][1].getText().equals(boxes[2][2].getText())) {
//            System.out.println("Winner");
            String value = boxes[0][0].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if(flag02 == false && boxes[0][2].getText().equals(boxes[1][1].getText())&&boxes[1][1].getText().equals(boxes[2][0].getText())) {
//            System.out.println("Winner");
            String value = boxes[0][2].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if((flag00 == false && boxes[0][0].getText().equals(boxes[1][0].getText())&&boxes[1][0].getText().equals(boxes[2][0].getText()))){
            String value = boxes[0][0].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if((flag00 == false && boxes[0][1].getText().equals(boxes[1][1].getText())&&boxes[1][1].getText().equals(boxes[2][2].getText()))){
        String value = boxes[0][1].getText();
        JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if((flag02 == false && boxes[0][2].getText().equals(boxes[1][2].getText())&&boxes[1][2].getText().equals(boxes[2][2].getText())) ){
            String value = boxes[0][2].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if((flag10 == false && boxes[1][0].getText().equals(boxes[0][0].getText())&&boxes[0][0].getText().equals(boxes[2][0].getText()))){
            String value = boxes[1][0].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if((flag11 == false && boxes[1][1].getText().equals(boxes[0][1].getText())&&boxes[0][1].getText().equals(boxes[2][1].getText())) ){
            String value = boxes[1][1].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if((flag12 == false && boxes[1][2].getText().equals(boxes[0][2].getText())&&boxes[0][2].getText().equals(boxes[2][2].getText()))){
            String value = boxes[1][2].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if((flag20 == false && boxes[2][0].getText().equals(boxes[1][0].getText())&&boxes[1][0].getText().equals(boxes[0][0].getText())) ){
            String value = boxes[2][0].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }

        else if((flag21 == false && boxes[2][1].getText().equals(boxes[1][1].getText())&&boxes[1][1].getText().equals(boxes[0][1].getText())) ){
        String value = boxes[2][1].getText();
        JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if( (flag22 == false && boxes[2][2].getText().equals(boxes[1][2].getText())&&boxes[1][2].getText().equals(boxes[0][2].getText())) ){

            String value = boxes[2][2].getText();
            JOptionPane.showMessageDialog(null,value+" is the winner");
        }
        else if (flag00==false && flag01==false && flag02==false &&  flag10==false &&  flag11==false &&  flag12==false &&  flag20==false &&  flag21==false &&  flag22==false ){
            JOptionPane.showMessageDialog(null," It is draw");
        }
    }


}



