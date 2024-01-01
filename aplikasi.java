import javax.swing.*;
import java.awt.*;

public class FormulirGUI {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Formulir");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat panel dengan latar belakang berwarna biru
        JPanel panel = new JPanel();
        panel.setBackground(Color.blue); // Ubah warna latar belakang panel
        frame.add(panel);
        placeComponents(panel);

        // Menampilkan frame
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Mengatur warna teks menjadi putih
        Color textColor = Color.WHITE;

        JLabel nameLabel = new JLabel("Nama:");
        nameLabel.setForeground(textColor); // Ubah warna teks label
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(100, 20, 165, 25);
        panel.add(nameText);

        JLabel ageLabel = new JLabel("Usia:");
        ageLabel.setForeground(textColor); // Ubah warna teks label
        ageLabel.setBounds(10, 50, 80, 25);
        panel.add(ageLabel);

        JTextField ageText = new JTextField(20);
        ageText.setBounds(100, 50, 165, 25);
        panel.add(ageText);

        JLabel addressLabel = new JLabel("Alamat:");
        addressLabel.setForeground(textColor); // Ubah warna teks label
        addressLabel.setBounds(10, 80, 80, 25);
        panel.add(addressLabel);

        JTextField addressText = new JTextField(20);
        addressText.setBounds(100, 80, 165, 25);
        panel.add(addressText);

        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(Color.gray); // Ubah warna latar belakang tombol
        submitButton.setForeground(textColor); // Ubah warna teks tombol
        submitButton.setBounds(100, 120, 80, 25);
        panel.add(submitButton);

        submitButton.addActionListener(e -> {
            String name = nameText.getText();
            String age = ageText.getText();
            String address = addressText.getText();

            // Mengubah warna background dan teks pada dialog
            UIManager.put("OptionPane.background", Color.YELLOW);
            UIManager.put("Panel.background", Color.YELLOW);
            UIManager.put("OptionPane.messageForeground", textColor);

            JOptionPane.showMessageDialog(panel,
                    "Nama: " + name + "\nUsia: " + age + "\nAlamat: " + address,
                    "Informasi Formulir",
                    JOptionPane.INFORMATION_MESSAGE);
        });
    }
}
