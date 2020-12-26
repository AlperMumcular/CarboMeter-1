package gui;

/**
 * @author Eren Özen, Onur Ertunç
 */
public class NormalUserHomePanel extends javax.swing.JPanel {

    public NormalUserHomePanel() {
        initComponents();
    }

    private void initComponents() {

        normalHomeLabel = new javax.swing.JLabel();
        newReportButton = new javax.swing.JButton();
        oldReportButton = new javax.swing.JButton();
        donationButton = new javax.swing.JButton();
        challangesButton = new javax.swing.JButton();
        friendsButton = new javax.swing.JButton();
        reccommendationsButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        normalHomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        normalHomeLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        normalHomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        normalHomeLabel.setText("HOME");
        add(normalHomeLabel);
        normalHomeLabel.setBounds(575, 80, 130, 40);

        newReportButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        newReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/report.png"))); // NOI18N
        newReportButton.setText("Create a New Report");
        newReportButton.setMaximumSize(new java.awt.Dimension(200, 37));
        newReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReportButtonActionPerformed(evt);
            }
        });
        add(newReportButton);
        newReportButton.setBounds(440, 210, 400, 50);

        oldReportButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        oldReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/seo-report.png"))); // NOI18N
        oldReportButton.setText("My Old Reports");
        oldReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldReportButtonActionPerformed(evt);
            }
        });
        add(oldReportButton);
        oldReportButton.setBounds(440, 280, 400, 50);

        donationButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        donationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/heart.png"))); // NOI18N
        donationButton.setText("Donations");
        add(donationButton);
        donationButton.setBounds(440, 420, 400, 50);

        challangesButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        challangesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/note.png"))); // NOI18N
        challangesButton.setText("Challenges");
        challangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                challangesButtonActionPerformed(evt);
            }
        });
        add(challangesButton);
        challangesButton.setBounds(440, 350, 400, 50);

        friendsButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        friendsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/friends.png"))); // NOI18N
        friendsButton.setText("Friends");
        friendsButton.setToolTipText("");
        add(friendsButton);
        friendsButton.setBounds(440, 490, 400, 50);

        reccommendationsButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        reccommendationsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/star.png"))); // NOI18N
        reccommendationsButton.setText("Reccommendations");
        add(reccommendationsButton);
        reccommendationsButton.setBounds(440, 560, 400, 50);

        logOutButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/door.png"))); // NOI18N
        logOutButton.setText("Log Out");
        add(logOutButton);
        logOutButton.setBounds(1140, 30, 110, 35);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    private void newReportButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void oldReportButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void challangesButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JLabel background;
    private javax.swing.JButton challangesButton;
    private javax.swing.JButton donationButton;
    private javax.swing.JButton friendsButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton newReportButton;
    private javax.swing.JLabel normalHomeLabel;
    private javax.swing.JButton oldReportButton;
    private javax.swing.JButton reccommendationsButton;

}
