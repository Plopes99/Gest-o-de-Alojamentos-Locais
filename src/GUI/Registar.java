package GUI;

import DAL.Funcionario;
import DAL.Tipofuncionario;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 35192
 */
public class Registar extends javax.swing.JPanel {

    private MenuPrincipal parentFrame;
    private static final String Persistence_UNIT_NAME = "1Projeto2PU";
    private static EntityManagerFactory factory;

    /**
     * Creates new form Registar
     */
    public Registar(MenuPrincipal parent) {
        initComponents();
        parentFrame = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        con = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        nome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        niss1 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jPanel1HierarchyChanged(evt);
            }
        });
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(36, 64, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VetAnimar");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(402, 402, 402)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1071, 73);

        jLabel5.setBackground(new java.awt.Color(36, 64, 102));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 64, 102));
        jLabel5.setText("Registar Utlizador");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 110, 270, 30);

        cpass.setText("jPasswordField1");
        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });
        jPanel1.add(cpass);
        cpass.setBounds(500, 280, 410, 30);

        jLabel6.setBackground(new java.awt.Color(36, 64, 102));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 64, 102));
        jLabel6.setText("Nome de Utilizador:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 200, 140, 30);

        jButton1.setBackground(new java.awt.Color(36, 64, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(750, 680, 115, 30);

        jButton2.setBackground(new java.awt.Color(36, 64, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(890, 680, 115, 30);

        con.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActionPerformed(evt);
            }
        });
        jPanel1.add(con);
        con.setBounds(500, 320, 410, 30);

        jLabel10.setBackground(new java.awt.Color(36, 64, 102));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 64, 102));
        jLabel10.setText(" Password:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(390, 240, 80, 30);

        pass.setText("jPasswordField1");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(500, 240, 410, 30);

        jLabel11.setBackground(new java.awt.Color(36, 64, 102));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 64, 102));
        jLabel11.setText("Confirmar Password:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(320, 280, 150, 30);

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(36, 64, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de utilizador:", "Rececionista", "Veterin??rio", "Assistente", "Administrador" }));
        jComboBox1.setToolTipText("Tipo de Utilizador");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(130, 160, 170, 30);

        nome.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jPanel1.add(nome);
        nome.setBounds(500, 200, 410, 30);

        jLabel12.setBackground(new java.awt.Color(36, 64, 102));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 64, 102));
        jLabel12.setText("Contacto:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(400, 320, 80, 30);

        email.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(500, 400, 410, 30);

        jLabel13.setBackground(new java.awt.Color(36, 64, 102));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(36, 64, 102));
        jLabel13.setText(" Email:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(420, 400, 60, 30);

        jLabel14.setBackground(new java.awt.Color(36, 64, 102));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(36, 64, 102));
        jLabel14.setText("Niss:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(430, 360, 40, 30);

        niss1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        niss1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niss1ActionPerformed(evt);
            }
        });
        jPanel1.add(niss1);
        niss1.setBounds(500, 360, 410, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel1HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1HierarchyChanged

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed

    }//GEN-LAST:event_nomeActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nomeInput = nome.getText();
        String passInput = pass.getText();
        String cpassInput = cpass.getText();
        String nissInput = niss1.getText();
        String emailInput = email.getText();
        String contInput = con.getText();
        int tipoUser = 0;
        boolean existe = verificaUtilizador(emailInput);
        boolean camposVazios = false;

        if (nomeInput.isEmpty() || passInput.isEmpty() || cpassInput.isEmpty() || nissInput.isEmpty() || emailInput.isEmpty() || contInput.isEmpty()) {
            camposVazios = true;
        }

        if (camposVazios) {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigat??rios!!!");
        } else if (existe) {
            JOptionPane.showMessageDialog(null, "Utilizador j?? existe!!!");
        } else {
            int input = JOptionPane.showOptionDialog(null, "Pretende registar utilizador?", "Sucesso", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if (input == JOptionPane.OK_OPTION) {
                factory = Persistence.createEntityManagerFactory(Persistence_UNIT_NAME);
                EntityManager em = factory.createEntityManager();
                Funcionario dono = new Funcionario();
                dono.setNome(nomeInput);
                dono.setContacto(contInput);
                dono.setEmail(emailInput);
                dono.setPassword(passInput);
                dono.setNiss(nissInput);
                Tipofuncionario tf;
                tf = new Tipofuncionario(new BigDecimal("" + jComboBox1.getSelectedIndex()));
                dono.setCodtipofuncionario(tf);

                em.getTransaction().begin();
                em.persist(dono);
                em.getTransaction().commit();

                this.parentFrame.trocaPainel(new MenuAdministrador(this.parentFrame));
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassActionPerformed

    private void niss1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niss1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niss1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.parentFrame.trocaPainel(new MenuAdministrador(this.parentFrame));
    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean verificaUtilizador(String emailInput) {
        factory = Persistence.createEntityManagerFactory(Persistence_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        Query q = em.createNamedQuery("Funcionario.findAll");
        boolean existe = false;

        for (Object d : q.getResultList()) {
            String email = ((Funcionario) d).getEmail();
            if (email.equals(emailInput)) {
                existe = true;
            }
        }

        return existe;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField con;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField niss1;
    private javax.swing.JTextField nome;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
