/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * opl.java
 *
 * Created on Mar 29, 2017, 4:20:17 PM
 */

package Advanced;

/**
 *
 * @author hcs
 */
 class Calender_change extends javax.swing.JFrame {
int date;
int month;
int year;
int etdate;
int etmonth;
int etyear;
    /** Creates new form  */
    public Calender_change() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        k = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ken = new javax.swing.JTextField();
        Amet = new javax.swing.JTextField();
        Wer = new javax.swing.JTextField();
        Ethioken = new javax.swing.JTextField();
        EthioWer = new javax.swing.JTextField();
        EthioYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        k.setFont(new java.awt.Font("Nyala", 1, 18));
        k.setText("ቀይር");
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 3, 24));
        jLabel2.setText("ከ ግሪጎሪያነን ወደ ግዕዝ የቀን መለወጫ");

        jLabel4.setFont(new java.awt.Font("Nyala", 3, 18));
        jLabel4.setText("አመት");

        jLabel6.setFont(new java.awt.Font("Nyala", 3, 18));
        jLabel6.setText("ቀን");

        jLabel7.setFont(new java.awt.Font("Nyala", 3, 18));
        jLabel7.setText("ወር");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(377, 377, 377))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(ken, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Amet, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Wer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EthioWer)
                    .addComponent(Ethioken)
                    .addComponent(EthioYear, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addComponent(k)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ethioken, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Wer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EthioWer, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EthioYear)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Amet, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(k)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
           date=(int)  (Integer.parseInt(ken.getText()));
           month= (int) (Integer.parseInt(Wer.getText()));
           year= (int) (Integer.parseInt(Amet.getText()));

             if(month>=1&& month<8)
             {
       etyear=year-8;
       EthioYear.setText(""+etyear);
   }
 else{
         etyear=year-7;
   EthioYear.setText(""+etyear);

 }
              if(month==1)// janwary
        if(year%4==0)
            if(date<10)
            {
           EthioWer.setText("month 4");
           etdate=(date+31)-10;
           Ethioken.setText(" "+etdate);
            }
            else
            {
            EthioWer.setText("month 4");
           etdate=date-9;
           Ethioken.setText(""+etdate);
            }
      else
        {
          if(date<9)
          {

                EthioWer.setText("");
                etdate=(date+31)-9;
               Ethioken.setText(""+etdate);
          }
 else{
               String fo=String.valueOf(5);
              EthioWer.setText(fo);
                etdate=date-8;
                 String f=String.valueOf(etdate);
                  Ethioken.setText(f);
 }
       }

else if(month==2)//febriwary
{
 if(year%4==0)
            if(date<10){
           EthioWer.setText("ethiiopian month is  5");
           etdate=(date+31)-9;
           Ethioken.setText(" "+etdate);
            }
            else
            {
           EthioWer.setText(" month is  6");
           etdate=date-8;
           Ethioken.setText(""+etdate);
            }
            else
        {
          if(date<8)
          {
                EthioWer.setText("month is  5");
                etdate=(date+31)-8;
               Ethioken.setText(""+etdate);
          }
 else{
                EthioWer.setText("month is  6");
                etdate=date-7;
                  Ethioken.setText(""+etdate);
 }
       }

     }
           if(month==3)// month is  march
        //if(year%4==0)
           if(date<10){
           EthioWer.setText("month is  6");
           etdate=(date+29)-8;
           Ethioken.setText(" "+etdate);
            }
            else
            {
            EthioWer.setText("month is  7");
           etdate=date-9;
           Ethioken.setText(""+etdate);
            }
if(month==4)// April is  march
      if(date<9){
           EthioWer.setText("month is  7");
           etdate=(date+30)-8;
           Ethioken.setText(" "+etdate);
            }
            else
            {
            EthioWer.setText("month is  8");
           etdate=date-8;
          Ethioken.setText(""+etdate);
            }

if(month==5)// may is  ..............
             if(date<9){
           EthioWer.setText("month is  8");
           etdate=(date+30)-8;
           Ethioken.setText(" "+etdate);
            }
            else
            {
            EthioWer.setText("month is  9");
           etdate=date-8;
           Ethioken.setText(""+etdate);
            }
           if(month==6)
               if(date<8){
                   EthioWer.setText("month is 9");
                   etdate=(date+31)-8;
                   Ethioken.setText(""+etdate);
               } else{
               EthioWer.setText("month is  10");
               etdate=date-7;
               Ethioken.setText(""+etdate);
               }



if(month==7)// julay
        if(date<8){
           EthioWer.setText("month 10");
         etdate=(date+30)-7;
         Ethioken.setText(""+etdate);
        }
        else
        {
        EthioWer.setText("month 11");
         etdate=date-7;
         Ethioken.setText(""+etdate);
         }
  if(month==8)//august
         if(date<7){
            EthioWer.setText("month 11");
           etdate=(date+31)-7;
            Ethioken.setText(""+etdate);
         }
 else{
         EthioWer.setText("month 12");
         etdate=date-6;
         Ethioken.setText(""+etdate);
 }
          if(month==9)// Sepetmber.....
                 if(etyear%4==0)
                     if(year%4==0)
                         if(date<6){
                             EthioWer.setText("month 12");
                              etdate=(date+31)-6;
                              EthioWer.setText(""+etdate);

                         }
 else if(date<12){
                      EthioWer.setText("month 13");
                      etdate=date-5;
                      Ethioken.setText(""+etdate);
                         }
 else{
                      EthioWer.setText("month 1");
                      etdate=date-10;
                      Ethioken.setText(""+etdate);

 }
                     else if(date<6){
                       EthioWer.setText("month 12");
                     etdate=(date+31)-7;
                     Ethioken.setText(""+etdate);

                     }
 else if(date<12){
     EthioWer.setText("month 13");
     etdate=date-6;
     Ethioken.setText(""+etdate);


      }
 else{
                    EthioWer.setText("month 1");
                     etdate=date-10;
                      Ethioken.setText(""+etdate);
 }
                 else if(year%4==0){
                     if(date<5){
                      EthioWer.setText("month 12");
                      etdate=(date+31)-5;
                      Ethioken.setText(""+etdate);
                     }
 else if(date<11){
     EthioWer.setText("month 13");
     etdate=date-4;
     Ethioken.setText(""+etdate);

 }
 else{
                         EthioWer.setText("month 1");
                         etdate=date-10;
                         Ethioken.setText(""+etdate);

 }

                 }
 else if(date<5){
     EthioWer.setText("month 12");
     etdate=(date+31)-6;
     Ethioken.setText(""+etdate);

 }
 else if(date<11){
     EthioWer.setText("month 13");
     etdate=date-5;
     Ethioken.setText(""+etdate);


 }
 
 
 if(month==10){
         if(year%4==0){
             if(date<12){
                 EthioWer.setText("month 1");
                   etdate=(date+30)-11;
                   Ethioken.setText(""+etdate);
             }else{
                 EthioWer.setText("month 2");
                 etdate=date-11;
                 Ethioken.setText(""+etdate);
             
             }
             //missing part

         }
     }
     if(month==11){
      if(year%4==0)
          if(date<11){
              EthioWer.setText("month 2");
              etdate=(date+31)-11;
              Ethioken.setText(""+etdate);
          }else{
             EthioWer.setText("month 3");
              etdate=date-10;
              Ethioken.setText(""+etdate);
          }
          if(date<10){
           EthioWer.setText("month 2");
           etdate=(date+31)-10;
           Ethioken.setText(""+etdate);
          }
      }
     if(month==12){
         if(year%4==0){
             if(date<11){
                 EthioWer.setText("month 3" );
                 etdate=(date+30)-10;
                 Ethioken.setText(""+etdate);
             }else{
                 EthioWer.setText("month 4");
                 etdate=date-10;
                 Ethioken.setText(""+etdate);
             }
            if(date<10){
                EthioWer.setText("month 4");
            etdate=(date+30)-9;
            Ethioken.setText(""+etdate);

            }
 else{
                 EthioWer.setText("month 3");
                 etdate=date-9;
                Ethioken.setText(""+etdate);
 }
         }
     }
    }//GEN-LAST:event_kActionPerformed

    
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton k;
    private javax.swing.JTextField ken;
    // End of variables declaration//GEN-END:variables

}
