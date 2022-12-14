package GUI;

import DAL.Animal;
import DAL.Consulta;
import DAL.Funcionario;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ComboBoxModel;
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
public class AreaConsulta extends javax.swing.JPanel {

    private MenuPrincipal parentFrame;
    private static final String Persistence_UNIT_NAME = "1Projeto2PU";
    private static EntityManagerFactory factory;
     private Consulta cons;
     
    /**
     * Creates new form AdministrarUtilizadores
     */
    public AreaConsulta(MenuPrincipal parent, BigDecimal idCons) {
        initComponents();
        parentFrame = parent;
        setSize(1071, 750);
         setCons(idCons);
        popularForm();
        
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nconsulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nchip = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

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
                .addGap(366, 366, 366)
                .addComponent(jLabel2)
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1071, 83);

        jLabel5.setBackground(new java.awt.Color(36, 64, 102));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 64, 102));
        jLabel5.setText("??rea de Consulta");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, 120, 250, 30);

        jButton1.setBackground(new java.awt.Color(36, 64, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(770, 680, 115, 33);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 64, 102));
        jLabel1.setText("N??mero da Consulta:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 210, 160, 20);

        nconsulta.setEditable(false);
        nconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nconsultaActionPerformed(evt);
            }
        });
        jPanel1.add(nconsulta);
        nconsulta.setBounds(200, 240, 250, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(36, 64, 102));
        jLabel4.setText("N??mero do Chip:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(540, 210, 160, 20);

        nchip.setEditable(false);
        jPanel1.add(nchip);
        nchip.setBounds(540, 240, 250, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(36, 64, 102));
        jLabel8.setText("Observa????es/sintomas:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(200, 300, 180, 20);

        obs.setColumns(20);
        obs.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        obs.setRows(5);
        jScrollPane1.setViewportView(obs);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 330, 590, 180);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/icon.png"))); // NOI18N
        jLabel9.setText("jLabel6");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(200, 560, 30, 30);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(36, 64, 102));
        jButton5.setText("Registar Receita M??dica");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(240, 560, 220, 30);

        jButton6.setBackground(new java.awt.Color(36, 64, 102));
        jButton6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(910, 680, 115, 33);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/icon.png"))); // NOI18N
        jLabel10.setText("jLabel6");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(200, 520, 30, 30);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(36, 64, 102));
        jButton7.setText("Registar Exame M??dico");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(240, 520, 220, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel1HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1HierarchyChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.parentFrame.trocaPainel(new GestaoConsultas(this.parentFrame));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.parentFrame.trocaPainel(new RegistarReceita(this.parentFrame, new BigDecimal(nconsulta.getText())));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void nconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nconsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nconsultaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        factory = Persistence.createEntityManagerFactory(Persistence_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        int input = JOptionPane.showOptionDialog(null, "Pretende guardar as altera????es efetuadas?", "Sucesso", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        if (input == JOptionPane.OK_OPTION) {
            this.cons.setIdconsulta(new BigDecimal (nconsulta.getText()));
            Animal animal = findAnimal(new BigInteger(nchip.getText()));
            this.cons.setIdanimal(animal);
            this.cons.setObservacoes(obs.getText());

            em.getTransaction().begin();
            em.merge(this.cons);
            em.getTransaction().commit();
            
            this.parentFrame.trocaPainel(new GestaoConsultas(this.parentFrame));
            

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         this.parentFrame.trocaPainel(new RegistarExame(this.parentFrame, cons.getIdconsulta()));
    }//GEN-LAST:event_jButton7ActionPerformed
  private void setCons(BigDecimal idCons) {
        factory = Persistence.createEntityManagerFactory(Persistence_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        Query q = em.createNamedQuery("Consulta.findAll");
        Consulta con = null;
        for (Object d : q.getResultList()) {
            BigDecimal id = ((Consulta) d).getIdconsulta();
            if (id.compareTo(idCons) == 0) {
                con = ((Consulta) d);
            }
        }
        this.cons = con;
    }

    private void popularForm() {

       nconsulta.setText(this.cons.getIdconsulta().toString());
        obs.setText(this.cons.getObservacoes());
        nchip.setText(this.cons.getIdanimal().getNumchip().toString());

       

    }
    
    private Animal findAnimal(BigInteger numChip) {

        factory = Persistence.createEntityManagerFactory(Persistence_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        Query q = em.createNamedQuery("Animal.findAll");
        Animal animal = null;
        for (Object d : q.getResultList()) {
            if (((Animal) d).getNumchip().compareTo(numChip) == 0) {
                animal = (Animal) d;
            }
        }

        return animal;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nchip;
    private javax.swing.JTextField nconsulta;
    private javax.swing.JTextArea obs;
    // End of variables declaration//GEN-END:variables
}
