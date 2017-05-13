package Advanced;

class Calender_change extends javax.swing.JFrame {

    int date;
    int month;
    int year;
    int etdate;
    int etmonth;
    int etyear;

    /**
     * Creates new form
     */
    public Calender_change() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        k = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ken = new javax.swing.JTextField();
        Amet = new javax.swing.JTextField();
        Wer = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Ethioken = new javax.swing.JTextField();
        EthioWer = new javax.swing.JTextField();
        EthioYear = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        k.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        k.setText("ቀይር");
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 3, 24)); // NOI18N
        jLabel2.setText("ከ ግሪጎሪያነን ወደ ግዕዝ የቀን መለወጫ");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        jLabel4.setText("አመት");

        jLabel6.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        jLabel6.setText("ቀን");

        jLabel7.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        jLabel7.setText("ወር");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Amet, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(Wer, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(ken))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Wer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Amet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Ethioken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EthiokenActionPerformed(evt);
            }
        });

        EthioWer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EthioWerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EthioYear, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(EthioWer, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ethioken, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Ethioken, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EthioWer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EthioYear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(k)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        date=(Integer.parseInt(ken.getText()));
        month=(Integer.parseInt(Wer.getText()));
        year=(Integer.parseInt(Amet.getText()));
        int eyear;
        if (month >= 1 && month < 8) {
            etyear = year - 8;
            eyear = etyear;
        } else {
            etyear = year - 7;
            eyear = etyear;

        }
        if (month == 1)// january
        {
            if (year % 4 == 0) {
                if (date < 10) {
                    EthioWer.setText("month 4");
                    etdate = (date + 31) - 10;
                    Ethioken.setText(" " + etdate);
                    EthioYear.setText("" + eyear);

                } else {
                    EthioWer.setText("month 4");//5
                    etdate = date - 9;//8
                    Ethioken.setText("" + etdate);
                    EthioYear.setText("" + eyear);
                }
            } else {
                if (date < 9) {
                    EthioWer.setText("month 4");
                    etdate = (date + 31) - 9;
                    EthioYear.setText("" + eyear);
                    Ethioken.setText("" + etdate);
                } else {
                    EthioWer.setText("month 5");
                    etdate = date - 8;
                    Ethioken.setText("" + etdate);
                    EthioYear.setText("" + eyear);
                }
            }
        } else if (month == 2)//february
        {
            if (year % 4 == 0) {
                if (date < 10) {
                    EthioWer.setText(" month is 5");
                    etdate = (date + 31) - 9;
                    Ethioken.setText(" " + etdate);
                } else {
                    EthioWer.setText(" month is  6");
                    etdate = date - 8;//9
                    Ethioken.setText("" + etdate);
                }
            } else {
                if (date < 8) {
                    EthioWer.setText("month is  5");
                    etdate = (date + 31) - 8;
                    Ethioken.setText("" + etdate);
                } else {
                    EthioWer.setText("month is  6");
                    etdate = date - 7;//8
                    Ethioken.setText("" + etdate);
                }
            }

        }
        if (month == 3)// month is  march
        //if(year%4==0)
        {
            if (date < 10) {
                EthioWer.setText(" " + "month is  6");
                etdate = (date + 29) - 8;
                Ethioken.setText(" " + etdate);
            } else {
                EthioWer.setText("month is  7");
                etdate = date - 9;
                Ethioken.setText("" + etdate);
            }
        }
        if (month == 4)// April is  march
        {
            if (date < 9) {
                EthioWer.setText(" " + "month is  7");
                etdate = (date + 30) - 8;
                Ethioken.setText(" " + etdate);
            } else {
                EthioWer.setText("month is  8");
                etdate = date - 8;
                Ethioken.setText("" + etdate);
            }
        }

        if (month == 5)// may is  ..............
        {
            if (date < 9) {
                EthioWer.setText("month is  8");
                etdate = (date + 30) - 8;
                Ethioken.setText(" " + etdate);
            } else {
                EthioWer.setText("month is  9");
                etdate = date - 8;
                Ethioken.setText("" + etdate);
            }
        }
        if (month == 6) {// june sene
            if (date < 8) {
                EthioWer.setText("month is 9");
                etdate = (date + 31) - 8;
                Ethioken.setText("" + etdate);
            } else {
                EthioWer.setText("month is  10");
                etdate = date - 7;
                Ethioken.setText("" + etdate);
            }
        }

        if (month == 7)// julay
        {
            if (date < 8) {
                EthioWer.setText("month 10");
                etdate = (date + 30) - 7;
                Ethioken.setText("" + etdate);
            } else {
                EthioWer.setText("month 11");
                etdate = date - 7;//6
                Ethioken.setText("" + etdate);
            }
        }
        if (month == 8)//august
        {
            if (date < 7) {
                EthioWer.setText("month 11");
                etdate = (date + 31) - 7;
                Ethioken.setText(" " + etdate);
            } else {
                EthioWer.setText("month 12");
                etdate = date - 6;//5
                Ethioken.setText("" + etdate);
            }
        }
        if (month == 9)// Sepetmber.....
        {
            if (etyear % 4 == 0) {
                //if (year % 4 == 0) {
                if (date < 6) {
                    //JOptionPane.showMessageDialog(null, "if "+eyear);
                    EthioWer.setText("month 12");
                    etdate = (date + 31) - 6;
                    eyear--;
                    //JOptionPane.showMessageDialog(null, "if "+eyear);
                    //EthioYear.setText("" + etyear);
                    EthioWer.setText("" + etdate);
                    EthioYear.setText("" + eyear);

                } else if (date < 12) {
                    EthioWer.setText("month 13");
                    etdate = date - 6;//7
                    eyear--;
                    //JOptionPane.showMessageDialog(null, "else if "+eyear);
                    EthioYear.setText("" + eyear);
                    Ethioken.setText("" + etdate);
                } else {
                    //JOptionPane.showMessageDialog(null,"else "+ eyear);
                    EthioWer.setText("month 1");
                    etdate = date - 10;
                    eyear++;
                    EthioYear.setText("" + eyear);
                    Ethioken.setText("" + etdate);

                }
            } else if (year % 4 != 0) {
                if (date < 6) {
                    EthioWer.setText("month 12");
                    etdate = (date + 31) - 7;
                    eyear--;
                    EthioYear.setText("df" + eyear);
                    Ethioken.setText("" + etdate);
                } else if (date < 12) {
                    EthioWer.setText("month 13");
                    etdate = date - 5;
                    eyear--;
                    EthioYear.setText("df" + eyear);
                    Ethioken.setText("" + etdate);
                } else {
                    EthioWer.setText("month 1");
                    etdate = date - 10;
                    Ethioken.setText("" + etdate);
                    eyear++;
                    EthioYear.setText("" + etyear);
                }
            } else {
                if (date < 5) {
                    EthioWer.setText("month 12");
                    eyear--;
                    EthioYear.setText("" + eyear);
                    etdate = (date + 31) - 5;
                    Ethioken.setText("" + etdate);
                } else if (date < 11) {
                    EthioWer.setText("month 13");
                    etdate = date - 4;
                    eyear--;
                    EthioYear.setText("" + eyear);
                    Ethioken.setText("" + etdate);
                } else {
                    EthioWer.setText("month 1");
                    etdate = date - 10;
                    EthioYear.setText("" + etyear);
                    Ethioken.setText("" + etdate);
                }

//            } else if (date < 5) {
//                EthioWer.setText("month 12");
//                etdate = (date + 31) - 6;
//                Ethioken.ssetText("" + etdate);
//
//            } else if (date < 11) {
//                EthioWer.setText("month 13");
//                etdate = date - 5;
//                Ethioken.setText("" + etdate);
//
//
//            }
            }
        }

        if (month == 10) {
            if (year % 4 == 0) {
                if (date < 12) {
                    EthioWer.setText("month 1");
                    etdate = (date + 30) - 11;
                    Ethioken.setText("" + etdate);
                } else {
                    EthioWer.setText("month 2");
                    etdate = date - 11;
                    Ethioken.setText("" + etdate);

                }
                }
            else if(year%4!=0){
                if(date<11){
                 EthioWer.setText("month 1");
                 etdate=(date+30)-10;
                 Ethioken.setText(""+etdate);
                
                }
            }
            
        }
        if (month == 11) {
            if (year % 4 == 0) {
                if (date < 11) {
                    EthioWer.setText("month 2");
                    etdate = (date + 31) - 11;
                    Ethioken.setText("" + etdate);
                } else {
                    EthioWer.setText("month 3");
                    etdate = date - 10;
                    Ethioken.setText("" + etdate);
                }
            }
            if (date < 10) {
                EthioWer.setText("month 2");
                etdate = (date + 31) - 10;
                Ethioken.setText("" + etdate);
            }
        }
        if (month == 12) {
            if (year % 4 == 0) {
                if (date < 11) {
                    EthioWer.setText("month 3");
                    etdate = (date + 30) - 10;
                    Ethioken.setText("" + etdate);
                } else {
                    EthioWer.setText("month 4");
                    etdate = date - 10;
                    Ethioken.setText("" + etdate);
                }//
                if (date < 10) {
                    EthioWer.setText("month 4");//3
                    etdate = (date + 30) - 9;
                    Ethioken.setText("" + etdate);

                } else {
                    EthioWer.setText("month 3");//4
                    etdate = date - 9;
                    Ethioken.setText("" + etdate);
                }
            }
        }
    }//GEN-LAST:event_kActionPerformed


    private void EthioWerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EthioWerActionPerformed


    }//GEN-LAST:event_EthioWerActionPerformed

    private void EthiokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EthiokenActionPerformed


    }//GEN-LAST:event_EthiokenActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Calender_change().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amet;
    private javax.swing.JTextField EthioWer;
    private javax.swing.JTextField EthioYear;
    private javax.swing.JTextField Ethioken;
    private javax.swing.JTextField Wer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton k;
    private javax.swing.JTextField ken;
    // End of variables declaration//GEN-END:variables
}
