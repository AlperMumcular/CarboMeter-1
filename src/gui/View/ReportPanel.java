package gui.View;

import user.NormalUser;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class ReportPanel extends javax.swing.JPanel {


    public ReportPanel() {
       initComponents();
    }

    public void function(Double newFood,Double newTravel,Double newHome,Double newOthers,Double oldHome,Double oldTravel,Double oldFood,Double oldOthers){
        reportTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"Total", (double)(newFood.intValue()+newTravel.intValue()+newHome.intValue()+newOthers.intValue())/1000, 48.721, (double) (oldFood.intValue()+oldTravel.intValue()+oldHome.intValue()+oldOthers.intValue() )/1000 },
                        {"Food",(double) (newFood.intValue() ) /1000, 7.182,(double) (oldFood.intValue() ) /1000},
                        {"Transportation", (double) ( newTravel.intValue() ) /1000, 15.391, (double ) (oldTravel.intValue() ) /1000 },
                        {"House", (double)(newHome.intValue() ) /1000, 12.106, (double) (oldHome.intValue() ) /1000 },
                        {"Others", (double)(newOthers.intValue())/1000, 14.042,(double) (oldOthers.intValue())/1000}
                },
                new String [] {
                        "", "My Carbopoint", "Average", "My Old Data"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }

    private void initComponents() {
        reportLabel = new javax.swing.JLabel();
        reportBar = new javax.swing.JProgressBar();
        carbobarLabel = new javax.swing.JLabel();
        reportPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        nextPageButton = new javax.swing.JButton();
        backPageButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        reportLabel.setBackground(new java.awt.Color(255, 255, 255));
        reportLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        reportLabel.setForeground(new java.awt.Color(255, 255, 255));
        reportLabel.setText("REPORT");
        add(reportLabel);
        reportLabel.setBounds(575, 80, 160, 60);

        reportBar.setValue(45);
        reportBar.setPreferredSize(new java.awt.Dimension(300, 20));
        reportBar.setRequestFocusEnabled(false);
        add(reportBar);
        reportBar.setBounds(500, 630, 300, 20);

        carbobarLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        carbobarLabel.setForeground(new java.awt.Color(255, 255, 255));
        carbobarLabel.setText("Carbobar");
        add(carbobarLabel);
        carbobarLabel.setBounds(600, 600, 100, 29);

        reportTable.setBackground(new java.awt.Color(88, 78, 69));
        reportTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        reportTable.setForeground(new java.awt.Color(255, 255, 255));

        function (0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);

        reportTable.setRowHeight(72);
        reportPane.setViewportView(reportTable);
        if (reportTable.getColumnModel().getColumnCount() > 0) {
            reportTable.getColumnModel().getColumn(0).setResizable(false);
            reportTable.getColumnModel().getColumn(1).setResizable(false);
            reportTable.getColumnModel().getColumn(2).setResizable(false);
            reportTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(reportPane);
        reportPane.setBounds(240, 190, 800, 390);

        nextPageButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nextPageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png"))); // NOI18N
        nextPageButton.setText("Next");
        add(nextPageButton);
        nextPageButton.setBounds(1120, 620, 110, 35);

        backPageButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        backPageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png"))); // NOI18N
        backPageButton.setText("Go Back");
        add(backPageButton);
        backPageButton.setBounds(50, 620, 110, 35);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setToolTipText("");
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1282, 700);
    }

    public javax.swing.JButton backPageButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel carbobarLabel;
    public javax.swing.JButton nextPageButton;
    private javax.swing.JProgressBar reportBar;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JScrollPane reportPane;
    private javax.swing.JTable reportTable;

}
