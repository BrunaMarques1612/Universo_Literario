/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany._usjt_psc_sistema.screens;

import java.awt.Toolkit;

import javax.swing.JOptionPane;

import com.mycompany._usjt_psc_sistema.DAOS.UserDAO;
import com.mycompany._usjt_psc_sistema.models.User;

import app.App;
import helpers.GenreNames;

/**
 *
 * @author Mauricio
 */
public class RegisterScreen extends javax.swing.JFrame {

    /**
     * Creates new form RegisterScreen
     */
    public RegisterScreen() {
        super("Universo Literário - Registro");
        setIconImage(Toolkit.getDefaultToolkit().getImage(""));
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        genderBox = new javax.swing.JComboBox<>();
        passwordField = new javax.swing.JPasswordField();
        firstFavorite = new javax.swing.JComboBox<>();
        secondFavorite = new javax.swing.JComboBox<>();
        returnButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        String[] genreNames = GenreNames.getGenreNames();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registre-se"));

        nameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        surnameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Sobrenome"));

        ageField.setBorder(javax.swing.BorderFactory.createTitledBorder("Idade"));

        emailField.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mail"));

        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        genderBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        passwordField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        firstFavorite.setModel(new javax.swing.DefaultComboBoxModel<>(genreNames));
        firstFavorite.setBorder(javax.swing.BorderFactory.createTitledBorder("1º Gênero Favorito"));

        secondFavorite
                .setModel(new javax.swing.DefaultComboBoxModel<>(genreNames));
        secondFavorite.setBorder(javax.swing.BorderFactory.createTitledBorder("2º Gênero Favorito"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(firstFavorite, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(secondFavorite, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(emailField)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(passwordField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                181,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(nameField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                169,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(surnameField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                181,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ageField)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(genderBox,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 48,
                                                Short.MAX_VALUE)
                                        .addComponent(surnameField)
                                        .addComponent(ageField))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(emailField)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(passwordField))
                                        .addComponent(genderBox, javax.swing.GroupLayout.DEFAULT_SIZE, 52,
                                                Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(firstFavorite, javax.swing.GroupLayout.DEFAULT_SIZE, 51,
                                                Short.MAX_VALUE)
                                        .addComponent(secondFavorite))
                                .addGap(21, 21, 21)));

        returnButton.setText("Voltar");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Cadastrar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registerButtonActionPerformed
        String getterName = nameField.getText();
        String getterSurname = surnameField.getText();
        String getterEmail = emailField.getText();
        String getterAge = ageField.getText();
        String getterGender = genderBox.getSelectedItem().toString();
        String getterPassword = new String(passwordField.getPassword());
        int getterFirstFavorite = firstFavorite.getSelectedIndex() + 1;
        int getterSecondFavorite = secondFavorite.getSelectedIndex() + 1;

        try {
            // Verification of empty fields, so nothing is sent to the database if they are
            // nullish
            if (getterName.isEmpty() || getterEmail.isEmpty() || getterAge.isEmpty()
                    || getterPassword.isEmpty() || getterSurname.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Preencha todos os campos para continuar.");
            } else if (getterFirstFavorite == getterSecondFavorite) {
                JOptionPane.showMessageDialog(null,
                        "Seus gêneros favoritos não podem ser iguais.");
            } else {
                User pessoa = new User(getterName, getterSurname, getterEmail, getterAge, getterGender,
                        getterPassword,
                        getterFirstFavorite, getterSecondFavorite, false);
                UserDAO dao = new UserDAO();
                dao.register(pessoa);
                this.dispose();
                //AdminDashboardScreen ds = new AdminDashboardScreen();
                //DashboardScreen ds = new DashboardScreen();
                //ds.setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Parece que tivemos um problema. Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }// GEN-LAST:event_registerButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_returnButtonActionPerformed
        this.dispose();
        App app = new App();
        app.setVisible(true);
    }// GEN-LAST:event_returnButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField emailField;
    private javax.swing.JComboBox<String> firstFavorite;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JComboBox<String> secondFavorite;
    private javax.swing.JTextField surnameField;
    // End of variables declaration//GEN-END:variables
}
