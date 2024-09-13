
package project_sign_in;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Freepharmacy extends JFrame {
    private int panadol = 6, maxilase = 10, aspirin = 28, advil = 3;
    private JButton getPanadol, givePanadol, getMaxilase, giveMaxilase, getAspirin, giveAspirin, getAdvil, giveAdvil;
    private JLabel panadolNum, maxilaseNum, aspirinNum, advilNum;
    private JButton backButton;

    public Freepharmacy() {
        setLayout(new BorderLayout(10, 10));

        backButton = new JButton("Back to Clinics");
        backButton.addActionListener(new BackButtonListener());

        JPanel backButtonPanel = new JPanel();
        backButtonPanel.add(backButton);

        add(BorderLayout.NORTH, backButtonPanel);

        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(137, 207, 240));

        JPanel p1 = new JPanel(new GridLayout(1, 3, 10, 10));
        p1.add(new JLabel("Panadol"));
        panadolNum = new JLabel(String.valueOf(panadol));
        p1.add(panadolNum);
        getPanadol = new JButton("Get one");
        p1.add(getPanadol);
        getPanadol.addActionListener(new GetOneListener(1));
        givePanadol = new JButton("Give one");
        p1.add(givePanadol);
        givePanadol.addActionListener(new GiveOneListener(1));
        p1.setBackground(new Color(137, 207, 240));

        JPanel p2 = new JPanel(new GridLayout(1, 3, 10, 10));
        p2.add(new JLabel("Maxilase"));
        maxilaseNum = new JLabel(String.valueOf(maxilase));
        p2.add(maxilaseNum);
        getMaxilase = new JButton("Get one");
        p2.add(getMaxilase);
        getMaxilase.addActionListener(new GetOneListener(2));
        giveMaxilase = new JButton("Give one");
        p2.add(giveMaxilase);
        giveMaxilase.addActionListener(new GiveOneListener(2));
        p2.setBackground(new Color(137, 207, 240));

        JPanel p3 = new JPanel(new GridLayout(1, 3, 10, 10));
        p3.add(new JLabel("Aspirin"));
        aspirinNum = new JLabel(String.valueOf(aspirin));
        p3.add(aspirinNum);
        getAspirin = new JButton("Get one");
        p3.add(getAspirin);
        getAspirin.addActionListener(new GetOneListener(3));
        giveAspirin = new JButton("Give one");
        p3.add(giveAspirin);
        giveAspirin.addActionListener(new GiveOneListener(3));
        p3.setBackground(new Color(137, 207, 240));

        JPanel p4 = new JPanel(new GridLayout(1, 3, 10, 10));
        p4.add(new JLabel("Advil"));
        advilNum = new JLabel(String.valueOf(advil));
        p4.add(advilNum);
        getAdvil = new JButton("Get one");
        p4.add(getAdvil);
        getAdvil.addActionListener(new GetOneListener(4));
        giveAdvil = new JButton("Give one");
        p4.add(giveAdvil);
        giveAdvil.addActionListener(new GiveOneListener(4));
        p4.setBackground(new Color(137, 207, 240));

        JPanel p5 = new JPanel();
        p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
        p5.setBackground(new Color(137, 207, 240));
        p5.add(p1);
        p5.add(p2);
        p5.add(p3);
        p5.add(p4);

        add(BorderLayout.CENTER, p5);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(500, 300);
        setLocationRelativeTo(null);
    }

  

    public class GiveOneListener implements ActionListener {
        private int medicineType;

        public GiveOneListener(int type) {
            this.medicineType = type;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            switch (medicineType) {
                case 1:
                    panadol++;
                    panadolNum.setText(String.valueOf(panadol));
                    break;
                case 2:
                    maxilase++;
                    maxilaseNum.setText(String.valueOf(maxilase));
                    break;
                case 3:
                    aspirin++;
                    aspirinNum.setText(String.valueOf(aspirin));
                    break;
                case 4:
                    advil++;
                    advilNum.setText(String.valueOf(advil));
                    break;
            }
        }
    }

    public class GetOneListener implements ActionListener {
        private int medicineType;

        public GetOneListener(int type) {
            this.medicineType = type;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            switch (medicineType) {
                case 1:
                    if (panadol > 0) {
                        panadol--;
                        panadolNum.setText(String.valueOf(panadol));
                    } else {
                        panadolNum.setText("The quantity is over");
                    }
                    break;
                case 2:
                    if (maxilase > 0) {
                        maxilase--;
                        maxilaseNum.setText(String.valueOf(maxilase));
                    } else {
                        maxilaseNum.setText("The quantity is over");
                    }
                    break;
                case 3:
                    if (aspirin > 0) {
                        aspirin--;
                        aspirinNum.setText(String.valueOf(aspirin));
                    } else {
                        aspirinNum.setText("The quantity is over");
                    }
                    break;
                case 4:
                    if (advil > 0) {
                        advil--;
                        advilNum.setText(String.valueOf(advil));
                    } else {
                        advilNum.setText("The quantity is over");
                    }
                   break;
            }
        }
    }

    private class BackButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            dispose();

            Clinics clinicsFrame = new Clinics();
            clinicsFrame.setVisible(true);
        }
    }
}