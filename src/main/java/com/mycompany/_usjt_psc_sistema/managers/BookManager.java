/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany._usjt_psc_sistema.managers;

import java.awt.Toolkit;

import com.mycompany._usjt_psc_sistema.BookRegister;
import com.mycompany._usjt_psc_sistema.DAOS.BookDAO;
import com.mycompany._usjt_psc_sistema.DAOS.RateDAO;
import com.mycompany._usjt_psc_sistema.RateBook;
import com.mycompany._usjt_psc_sistema.models.Book;
import com.mycompany._usjt_psc_sistema.models.ExtendedBook;
import com.mycompany._usjt_psc_sistema.screens.DashboardScreen;

import helpers.BookFinder;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class BookManager extends javax.swing.JFrame {

    /**
     * Creates new form BookManager
     */
    public BookManager() {
        super("Universo Literário - Painel de Livros");
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
        registerBookButton = new javax.swing.JButton();
        seeBooksButton = new javax.swing.JButton();
        rateBookButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Livros"));

        registerBookButton.setText("Cadastrar Livro");
        registerBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBookButtonActionPerformed(evt);
            }
        });

        seeBooksButton.setText("Ver Livros");
        seeBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeBooksButtonActionPerformed(evt);
            }
        });

        rateBookButton.setText("Avaliar Livro");
        rateBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateBookButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Voltar");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(seeBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, 219,
                                                Short.MAX_VALUE)
                                        .addComponent(registerBookButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rateBookButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 219,
                                                Short.MAX_VALUE))
                                .addContainerGap(55, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(registerBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rateBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(seeBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rateBookButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rateBookButtonActionPerformed
        this.dispose();
        RateBook rb = new RateBook();
        rb.setVisible(true);
    }// GEN-LAST:event_rateBookButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_returnButtonActionPerformed
        this.dispose();
        DashboardScreen ds = new DashboardScreen();
        ds.setVisible(true);
    }// GEN-LAST:event_returnButtonActionPerformed

    private void registerBookButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registerBookButtonActionPerformed
        this.dispose();
        BookRegister br = new BookRegister();
        br.setVisible(true);
    }// GEN-LAST:event_registerBookButtonActionPerformed

    private void seeBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //BookFinder bookFinder = new BookFinder();
        //bookFinder.findAll();
        BookDAO books = new BookDAO();
        RateDAO rates = new RateDAO();

        String message = "";

        try {
            Book[] foundBooks = books.getBooks();
            ExtendedBook[] ratedBooks = new ExtendedBook[foundBooks.length];

            for (Book book : foundBooks) {
                int bookId = book.getId();
                int ratings = rates.countRatings(bookId);
                int sumOfRatings = rates.getSumOfRatings(bookId);

                ExtendedBook extendedBook = new ExtendedBook(book, ratings, sumOfRatings);
                ratedBooks[bookId - 1] = extendedBook;
            }
            ExtendedBook[] sortedBooks = ExtendedBook.sort(ratedBooks);
            for (ExtendedBook eBook : sortedBooks) {
                message += "ID: " + eBook.getId() + "\n";
                message += "Título: " + eBook.getTitle() + "\n";
                message += "Autor: " + eBook.getAuthor() + "\n";
                message += "Gênero: " + eBook.getGenre() + "\n";
                message += "Nota Média: " + eBook.getRateAverage() + "\n";
            }
            JOptionPane.showMessageDialog(null, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rateBookButton;
    private javax.swing.JButton registerBookButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton seeBooksButton;
    // End of variables declaration//GEN-END:variables
}
