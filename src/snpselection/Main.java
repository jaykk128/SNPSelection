/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snpselection;

import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jay Khurana
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }
    /**
     * TODO: Load data
     * TODO: Add ability to run data and re-enable stuff
     * TODO: User-hints and tooltip texts
     * TODO: Error checking for data input and algorithm parameters
     * TODO: Algorithm-specific parameters
     * TODO: Refactor GUI elements with better names
     * TODO: Better dynamic resizing of GUI
     * Long term TODO:
     * TODO: Add metadata to data (ex. SNP name, other annotations)
     * TODO: Add support for retrieving SNPSelection data from thousand genomes problem autonomously with annotations
     * TODO: Add support for external SNP visualizatio software like UCSC genome browser
     * TODO: add support for running from command line
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SNP Selection");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Import Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setText("Run Data");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setText("Save Results");
        jButton4.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("SNP Selection Algorithm");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("LD-Select");
        jRadioButton1.setEnabled(false);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("HyperLogLog");
        jRadioButton2.setEnabled(false);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Tree Join");
        jRadioButton3.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("SNP Selection Options");

        jLabel4.setText("# of Haps");

        jLabel5.setText("# of SNPs");

        jTextField1.setEnabled(false);

        jTextField2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1)
                                        .addComponent(jTextField2)))
                                .addComponent(jLabel3))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Loads and validates data.
     * If the data is valid, the rest of the GUI is enabled otherwise an error message is displayed
     * TODO: Display error message on invalid data
     * @param evt the event from pressing the import data button
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text = retrieveText();
        try{
             formatData(text);
        }catch(Exception exe){
            //Display error message based on type of exception
            enableGUI(false);
            return;
        }
        this.jTextField1.setText(""+data.get(0).size());
        this.jTextField2.setText(""+data.size());
        enableGUI(true);
        System.out.println();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Run the chosen user algorithm with the chosen parameters. The algorithm should run on a separate thread/
     * TODO: add thread that updates user on status of job and blocks other jobs from being started unless the current job is canceled.
     * @param evt run button press 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int numSNPs = Integer.parseInt(jTextField1.getText());
        int numHaps = Integer.parseInt(jTextField2.getText());
        if(this.jRadioButton1.isSelected()){
            SNPSelectionAlgo algo = new LDSelect(data, metadata, numSNPs, numHaps);
            try{
                algo.runAlgo();
            }catch(Exception exe){
                //TODO: Analyze exception and notify user
            }
        }else if(this.jRadioButton1.isSelected()){
            //TODO: run HLL algorithm
        }else{
            //run tree join algorithm
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    /**
     * Retrieves text (as String) from file selected by user in file chooser
     * @return the text from the file chosen as a String
     */
    private static String retrieveText(){
        JFileChooser selectBatch = new JFileChooser();
        FileFilter textOnly = new FileNameExtensionFilter("Format file", "FORMAT");
        selectBatch.setFileFilter(textOnly);
        int fileChosen=selectBatch.showDialog(null,"Open File");
        StringBuilder text = new StringBuilder();
        String fileText="";
        if(fileChosen==1){
            return null;
        }
        BufferedReader fileReader; 
        Charset charset = Charset.forName("Cp1252");
        try{    
            fileReader = Files.newBufferedReader(selectBatch.getSelectedFile().toPath(), charset);
        }catch(IOException exe){
            JOptionPane.showMessageDialog(null,"Could not find file at specified"
                    + " location!","Warning",JOptionPane.WARNING_MESSAGE);
            return null;
        }
        String line;
        try{    
            while ((line = fileReader.readLine()) != null) {
                text=text.append(line).append("\r");
            }
        }catch(IOException exe){             
            JOptionPane.showMessageDialog(null,"Could not read from file at "
                    + "selected location!","Warning",JOptionPane.WARNING_MESSAGE);        
        }         
        fileText=text.toString();
        return fileText;
    }
    
    /**
     * Formats data into
     * TODO: Add exception that is thrown if data is not formatted properly
     * TODO: Add error checking
     * TODO (long term) add support for different formats of data
     * TODO (long term) get metadata from different formats of data
     */
    private static void formatData(String text) throws Exception{
        List<List<Integer>> hapList = new ArrayList<>();
        Scanner stringReader = new Scanner(text.substring(text.indexOf("\r")+1));
        while(stringReader.hasNextLine()){
            String hap = stringReader.nextLine();
            String [] genotype = hap.split("\t");
            List<Integer> hap1 = new ArrayList<>();
            List<Integer> hap2 = new ArrayList<>();
            for(int i=2; i < genotype.length; i++){
                try{
                    String h1SNP = genotype[i].substring(0, genotype[i].indexOf("|"));
                    int end = genotype[i].lastIndexOf("|") == -1 || genotype[i].lastIndexOf("|") == genotype[i].indexOf("|") ? genotype[i].length() : genotype[i].lastIndexOf("|");
                    String h2SNP = genotype[i].substring(genotype[i].indexOf("|")+1, end);                    
                    hap1.add(Integer.parseInt(h1SNP));
                    hap2.add(Integer.parseInt(h2SNP));
                }catch(Exception exe){
                    throw new NumberFormatException();
                }
            }
            if(hap1.size() != hap2.size() || ( hapList.size() >= 2 && hap2.size() != hapList.get(0).size() )){
                throw new Exception(); //TODO more specific exception
            }
            hapList.add(hap1);
            hapList.add(hap2);
        }
        data = hapList;
        stringReader.close();
    }
    
    private void enableGUI(boolean enable) {
        jButton3.setEnabled(enable);
        jButton4.setEnabled(enable);
        jRadioButton1.setEnabled(enable);        
        jRadioButton2.setEnabled(enable);
        jRadioButton3.setEnabled(enable);
        jTextField1.setEnabled(enable);
        jTextField2.setEnabled(enable);
    }
    
    private static List<List<Integer>> data; //SNP data
    private static HashMap<String, Object> metadata; //metadata containing SNPData, TODO: instead of extending object add support for generic insertion
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
