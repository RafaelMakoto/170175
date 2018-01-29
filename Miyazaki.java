      import java.io.*;
      import javax.swing.*;
      import java.awt.*;
      import java.awt.event.*;
          //menu
          public class Miyazaki extends JFrame implements ActionListener{
          //ラジオボタンを追加した
           private JRadioButton[] radiobtn;
           private JLabel label;
           private JPanel panel;
          
          	Miyazaki(String title){
          	setTitle(title);
          	setSize(400,400);
          	setLocation(400,400);
          	setDefaultCloseOperation(EXIT_ON_CLOSE);
           	//パネル、ボタン、ラジオボタンの追加
             panel = new JPanel();
             label = new JLabel();
             
             
             radiobtn = new JRadioButton[5];
             radiobtn[0] = new JRadioButton("name:山口弘展 ");
             radiobtn[1] = new JRadioButton("address:東京 ");
             radiobtn[2] = new JRadioButton("ID:@hiro ");
             radiobtn[3] = new JRadioButton("favorite:車 ");
             radiobtn[4] = new JRadioButton("bloodtype:O型 ");
             
             ButtonGroup radioGroup = new ButtonGroup();
             radioGroup.add(radiobtn[0]);
             radioGroup.add(radiobtn[1]);
             radioGroup.add(radiobtn[2]);
             radioGroup.add(radiobtn[3]);
             radioGroup.add(radiobtn[4]);
             
              panel.add(radiobtn[0]);
              panel.add(radiobtn[1]);
              panel.add(radiobtn[2]);
              panel.add(radiobtn[3]);
              panel.add(radiobtn[4]);
              
              
              panel.add(label);
        
              JPanel buttonpanel = new JPanel();
        
              JButton button = new JButton("登録");  
              button.addActionListener(this);
        
              buttonpanel.add(button);
        
              Container contentPane = getContentPane();
              contentPane.add(panel,BorderLayout.CENTER);
              contentPane.add(buttonpanel,BorderLayout.SOUTH);
              }
              
              //表示
              public static void main(String[] args){
              Miyazaki frame = new Miyazaki("山口さんPG");
              frame.setVisible(true);
              }
              
              public void actionPerformed(ActionEvent e){
              System.out.println("テキストファイルに書き込まれました");
              String name = "";
        
            for (int i = 0 ; i < radiobtn.length; i++){
              if (radiobtn[i].isSelected()){
               name = radiobtn[i].getText();
              }
            }
        
            JLabel msg = new JLabel(name);
            JOptionPane.showMessageDialog(this, msg);
            //データ書き込み
              try{
              FileWriter fw = new FileWriter("data.txt",true);
              BufferedWriter bw = new BufferedWriter(fw); 
              bw.append(name+"\r\n");//"\r\n"で改行
              bw.close();
              }catch(IOException a){
              	System.out.println("入力できませんでした");
             }
          } 
        }  