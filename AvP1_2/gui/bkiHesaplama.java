package gui;

import javax.swing.*;
import java.awt.event.*;

public class bkiHesaplama {
    public static void main(String[] args) {
        JFrame f = new JFrame("BKİ Hesaplama");
        JLabel lkg = new JLabel("Ağırlık (kg):");
        lkg.setBounds(10, 10, 200, 50);
        JTextField tfkg = new JTextField();
        tfkg.setBounds(200,25,100,20);
        JLabel lcm = new JLabel("Boy (cm):");
        lcm.setBounds(10, 60, 200, 50);
        JTextField tfcm = new JTextField();
        tfcm.setBounds(200,70,100,20);
        JButton b = new JButton("Hesapla!");
        b.setBounds(200,120,100,45);
        JLabel ls = new JLabel("Sonuç:");
        ls.setBounds(10, 130, 200, 50);
        JLabel ld = new JLabel("Durum:");
        ld.setBounds(10, 150, 200, 50);

        b.addActionListener(
            new ActionListener() {
                @Override
                public void  actionPerformed(ActionEvent e){
                    Double boy = Double.parseDouble(tfcm.getText())/100;
                    Double agirlik = Double.parseDouble(tfkg.getText());
                    Double bki = agirlik / (boy * boy);
                    System.out.println(bki);
                    bki = (double) Math.round(bki);
                    ls.setText("BKİ Sonucu:"+Double.toString(bki));
                    if(bki <= 20){
                        ld.setText("Durum: Zayıf");
                    }else if(bki<=25){
                        ld.setText("Durum: Normal");
                    }else if(bki<=30){
                        ld.setText("Durum: Kilolu");
                    }else if(bki<=40){
                        ld.setText("Durum: Obez");
                    }else{
                        ld.setText("Durum: Aşırı obez");
                    }
                }
            }
        );

        f.add(b);
        f.add(tfkg);
        f.add(lkg);
        f.add(tfcm);
        f.add(lcm);
        f.add(ld);
        f.add(ls);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(
            new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
            }
        );
        
    }
}
