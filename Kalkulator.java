package kalkulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulator extends JFrame implements ActionListener {
    JTextField input1, input2, hasil;
    JButton tambah, kurang, kali, bagi, clear;

    public Kalkulator() {
        setTitle("Kalkulator Sederhana");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Komponen input
        add(new JLabel("Angka 1:"));
        input1 = new JTextField();
        add(input1);

        add(new JLabel("Angka 2:"));
        input2 = new JTextField();
        add(input2);

        // Tombol operasi
        tambah = new JButton("+");
        kurang = new JButton("-");
        kali = new JButton("*");
        bagi = new JButton("/");
        clear = new JButton("Clear");

        tambah.addActionListener(this);
        kurang.addActionListener(this);
        kali.addActionListener(this);
        bagi.addActionListener(this);
        clear.addActionListener(this);

        add(tambah);
        add(kurang);
        add(kali);
        add(bagi);

        // Hasil dan tombol clear
        add(new JLabel("Hasil:"));
        hasil = new JTextField();
        hasil.setEditable(false);
        add(hasil);

        add(clear);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double angka1 = Double.parseDouble(input1.getText());
            double angka2 = Double.parseDouble(input2.getText());
            double hasilAkhir = 0;

            if (e.getSource() == tambah) {
                hasilAkhir = angka1 + angka2;
            } else if (e.getSource() == kurang) {
                hasilAkhir = angka1 - angka2;
            } else if (e.getSource() == kali) {
                hasilAkhir = angka1 * angka2;
            } else if (e.getSource() == bagi) {
                if (angka2 != 0)
                    hasilAkhir = angka1 / angka2;
                else
                    throw new ArithmeticException("Tidak bisa dibagi 0");
            } else if (e.getSource() == clear) {
                input1.setText("");
                input2.setText("");
                hasil.setText("");
                return;
            }

            hasil.setText(String.valueOf(hasilAkhir));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Kalkulator();
    }
}