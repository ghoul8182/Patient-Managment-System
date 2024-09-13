
package project_sign_in;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ShowDoctorsFrame extends JFrame {
    private final DefaultListModel<String> doctorListModel;
    private final JList<String> doctorList;

    public ShowDoctorsFrame(DefaultListModel<String> doctorListModel) {
        this.doctorListModel = doctorListModel;

        setTitle("List of Doctors");
        setSize(300, 400);

        doctorList = new JList<>(doctorListModel);
        JScrollPane scrollPane = new JScrollPane(doctorList);
        add(scrollPane);

        setLocationRelativeTo(null);
    }

    public void updateDoctorList(String[] doctors) {
        doctorListModel.removeAllElements();
        for (String doctor : doctors) {
            doctorListModel.addElement(doctor);
        }
    }
}
