/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany._usjt_psc_sistema;

import com.mycompany._usjt_psc_sistema.models.User;
import com.mycompany._usjt_psc_sistema.DAOS.UserDAO;
import com.mycompany._usjt_psc_sistema.screens.AdminDashboardScreen;

import helpers.GenreNames;

import java.awt.Toolkit;

import javax.swing.JOptionPane;

/**
 *
 * @author 823155744
 */
public class UserRegister extends javax.swing.JFrame {

        /**
         * Creates new form ManagementUsers
         */
        public UserRegister() {
                super("Universo Literário - Registro de Usuários");
                setIconImage(Toolkit.getDefaultToolkit().getImage(""));
                initComponents();
                setLocationRelativeTo(null);
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
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                nameFormTextField = new javax.swing.JTextField();
                emailFormTextField = new javax.swing.JTextField();
                ageFormTextField = new javax.swing.JTextField();
                passwordFormPasswordField = new javax.swing.JPasswordField();
                genderField = new javax.swing.JComboBox<>();
                userTypeField = new javax.swing.JComboBox<>();
                register = new javax.swing.JButton();
                firstGender = new javax.swing.JComboBox<>();
                secondGender = new javax.swing.JComboBox<>();
                returnButton = new javax.swing.JButton();
                String[] genreNames = GenreNames.getGenreNames();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Usuários"));

                nameFormTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Primeiro Nome"));

                emailFormTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mail"));

                ageFormTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Idade"));

                passwordFormPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

                genderField.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Masculino", "Feminino", "Outro" }));

                userTypeField.setModel(
                                new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Administrador" }));
                userTypeField.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Usuário"));

                register.setText("Cadastrar");
                register.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                registerActionPerformed(evt);
                        }
                });

                firstGender.setModel(new javax.swing.DefaultComboBoxModel<>(genreNames));
                firstGender.setBorder(javax.swing.BorderFactory.createTitledBorder("Primeiro Gênero Favorito"));

                secondGender.setModel(new javax.swing.DefaultComboBoxModel<>(genreNames));
                secondGender.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo Gênero Favorito"));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(genderField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                281,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(nameFormTextField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                281,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(emailFormTextField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                281,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(ageFormTextField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                281,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                54,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(passwordFormPasswordField,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                281,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(userTypeField,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                281,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(firstGender,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                281,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(secondGender,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                281,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap())
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(register,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                210,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(209, 209, 209)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(nameFormTextField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                56,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(passwordFormPasswordField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                56,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(emailFormTextField)
                                                                                .addComponent(userTypeField,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                56,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(ageFormTextField,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                56,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(firstGender,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                56,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(genderField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                56,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(secondGender,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                56,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                18,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(register,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                47,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                returnButton.setText("Cancelar");
                returnButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                returnButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(19, 19, 19)
                                                                                                .addComponent(jPanel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(248, 248, 248)
                                                                                                .addComponent(returnButton,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                210,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(23, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(23, Short.MAX_VALUE)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(returnButton,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_returnButtonActionPerformed
                this.dispose();
                AdminDashboardScreen ds = new AdminDashboardScreen();
                ds.setVisible(true);
        }// GEN-LAST:event_returnButtonActionPerformed

        private void registerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registerActionPerformed
                String getterName = nameFormTextField.getText();
                String getterEmail = emailFormTextField.getText();
                String getterAge = ageFormTextField.getText();
                String getterGender = genderField.getSelectedItem().toString();
                String getterPassword = new String(passwordFormPasswordField.getPassword());
                int getterFirstFavorite = firstGender.getSelectedIndex() + 1;
                int getterSecondFavorite = secondGender.getSelectedIndex() + 1;
                boolean getterType = userTypeField.getSelectedItem().toString().equals("Administrador");

                try {
                        // Verification of empty fields, so nothing is sent to the database if they are
                        // nullish
                        if (getterName.isEmpty() || getterEmail.isEmpty() || getterAge.isEmpty()
                                        || getterPassword.isEmpty()) {
                                JOptionPane.showMessageDialog(null,
                                                "Preencha todos os campos para continuar.");
                        } else {
                                User pessoa = new User(getterName, "", getterEmail, getterAge, getterGender,
                                                getterPassword,
                                                getterFirstFavorite, getterSecondFavorite, getterType);
                                UserDAO dao = new UserDAO();
                                dao.register(pessoa);
                                this.dispose();
                                AdminDashboardScreen ds = new AdminDashboardScreen();
                                ds.setVisible(true);
                        }

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                        "Parece que tivemos um problema. Tente novamente mais tarde.");
                        e.printStackTrace();
                }
        }// GEN-LAST:event_registerActionPerformed

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
                        java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new UserRegister().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField ageFormTextField;
        private javax.swing.JTextField emailFormTextField;
        private javax.swing.JComboBox<String> firstGender;
        private javax.swing.JComboBox<String> genderField;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField nameFormTextField;
        private javax.swing.JPasswordField passwordFormPasswordField;
        private javax.swing.JButton register;
        private javax.swing.JButton returnButton;
        private javax.swing.JComboBox<String> secondGender;
        private javax.swing.JComboBox<String> userTypeField;
        // End of variables declaration//GEN-END:variables
}
