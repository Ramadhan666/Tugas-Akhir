/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ROG
 */
public class transaksi extends javax.swing.JFrame {
Connection conn;
Statement stat;
ResultSet res;
Connection con;

private void loaddata(){
    DefaultTableModel t= new DefaultTableModel();
    t.addColumn("Kode_Buku");
    t.addColumn("Nama_buku");
    t.addColumn("Nama_Pengarang");
    t.addColumn("Penerbit");
    t.addColumn("Tahun_Terbit");
    tabuk.setModel (t);
    try{
        res=stat.executeQuery("Select * from data_buku");
        while(res.next()){
            t.addRow (new Object []
            {res.getString("Kode_Buku"),
            res.getString("Nama_Buku"),
            res.getString("Nama_Pengarang"),
            res.getString("Penerbit"),
            res.getString("Tahun_Terbit")
            }
            );
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
}

private void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbcmysql://127.0.0.1/database_perpustakaan","root", "");
            stat= con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}

private void loaddata1(){
    DefaultTableModel t= new DefaultTableModel();
    t.addColumn("NIM");
    t.addColumn("Nama");
    t.addColumn("KodeBuku");
    t.addColumn("NamaBuku");
    t.addColumn("TanggalPeminjaman");
    t.addColumn("TanggalPengembalian");
    
    tabuk.setModel (t);
    try{
        res=stat.executeQuery("Select * from data_buku");
        while(res.next()){
            t.addRow (new Object []
            {res.getString("NIM"),
            res.getString("Nama"),
            res.getString("KodeBuku"),
            res.getString("NamaBuku"),
            res.getString("TanggalPeminjaman"),
            res.getString("TanggalPengembalian")
            }
            );
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
}

    /**
     * Creates new form transaksi
     */
    public transaksi() {
        initComponents();
        koneksi();
        loaddata();
        loaddata1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nimm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        peminjam = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabuk = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        kodebuku = new javax.swing.JTextField();
        namabuku = new javax.swing.JTextField();
        tglp = new javax.swing.JTextField();
        tglk = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PEMINJAMAN BUKU");

        nimm.setText("Nim");

        jLabel2.setText("Nama");

        jLabel3.setText("Kode Buku");

        jLabel4.setText("Nama Buku");

        jLabel5.setText("Tanggal Pinjam");

        jLabel6.setText("Tanggal Kembali");

        jLabel7.setText("Tabel Data Peminjam");

        peminjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(peminjam);

        tabuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabuk);

        jLabel8.setText("Tabel Data Buku");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        edit.setText("Edit");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(290, 290, 290)
                                .addComponent(edit))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(264, 264, 264)
                                .addComponent(save)
                                .addGap(18, 18, 18)
                                .addComponent(exit))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nimm)
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tglk)
                                    .addComponent(tglp)
                                    .addComponent(namabuku)
                                    .addComponent(kodebuku)
                                    .addComponent(nama)
                                    .addComponent(nim))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete)
                            .addComponent(refresh))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nimm)
                            .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search)
                            .addComponent(refresh))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(kodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(namabuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tglp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tglk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edit)
                                    .addComponent(delete))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(save)
                                    .addComponent(exit))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        nim.setText(null);
        nama.setText(null);
        kodebuku.setText(null);
        namabuku.setText(null);
        tglp.setText(null);
        tglk.setText(null);
    }//GEN-LAST:event_refreshActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String x=kodebuku.getText();
        try{
            String sql="delete from data_buku where KodeBuku='"+x+"'";
            res=stat.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Data telah dihapus");
            loaddata();
            nim.setText(null);
            nama.setText(null);
            kodebuku.setText(null);
            namabuku.setText(null);
            tglp.setText(null);
            tglk.setText(null);
        }catch(Exception e){
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "Koneksi gagal");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        try{
            stat.executeUpdate("insert into peminjam values ("
            +"'"+nim.getText()+"','"
            +"'"+nama.getText()+"','"
            +"'"+kodebuku.getText()+"','"
            +"'"+tglp.getText()+"','"
            +"'"+tglp.getText()+"','");
            loaddata1();
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Perintah salah"+e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?","yakin?" , JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
            this.dispose();
            new menuutama().show();
    }//GEN-LAST:event_exitActionPerformed
    }
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String x=JOptionPane.showInputDialog(null, "Masukkan Kode Buku!!");
        try{
            String cari="select * from peminjam where Kodebuku='"+x+"'";
            res=stat.executeQuery(cari);
            if(res.next()){
                System.out.println(res.getString(1));
                JOptionPane.showMessageDialog(null, "Data ditemukan");
                nim.setText(res.getString("NIM"));
                nama.setText(res.getString("Nama"));
                kodebuku.setText(res.getString("KodeBuku"));
                namabuku.setText(res.getString("NamaBuku"));
                tglp.setText(res.getString("TanggalPeminjaman"));
                tglk.setText(res.getString("TanggalPengembalian"));
            }else{
                JOptionPane.showMessageDialog(null, "Buku Belum Dipinjam");
            }
        }catch(Exception e){
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "Koneksi gagal");
        }
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kodebuku;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField namabuku;
    private javax.swing.JTextField nim;
    private javax.swing.JLabel nimm;
    private javax.swing.JTable peminjam;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTable tabuk;
    private javax.swing.JTextField tglk;
    private javax.swing.JTextField tglp;
    // End of variables declaration//GEN-END:variables
}
