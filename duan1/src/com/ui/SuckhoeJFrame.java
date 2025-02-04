/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui;

import com.dao.DongVatDAO;
import com.dao.suckhoedao;
import com.mode.dongvat;
import com.mode.suckhoe;
import com.utils.Auth;
import com.utils.MsgBox;
import com.dao.DongVatDAO;
import com.dao.suckhoedao;
import com.mode.dongvat;
import com.mode.suckhoe;
import com.utils.Auth;
import com.utils.MsgBox;
import com.utils.XImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author DELL
 */
public class SuckhoeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form Suckhoe
     */
    public SuckhoeJFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnhietdocothe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnhieptim = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbobieuhien = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtsinhsan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtghichu = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldongvat = new javax.swing.JTable();
        txtmadv = new javax.swing.JTextField();
        txtngay = new javax.swing.JTextField();
        lblTenLoai = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnindanhsach = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lblBatLoiMDV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sức Khỏe");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Cập nhật sức khỏe động vật");

        jLabel2.setText("Mã Động vật:");

        jLabel3.setText("Tên loai:");

        jLabel5.setText("Nhiệt độ cơ thể:");

        jLabel6.setText("Nhịp tim: ");

        jLabel7.setText("Biểu hiện:");

        cbobieuhien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bình thường", "Yếu ớt", "Ốm", "Cáo gắt." }));

        jLabel8.setText("Sinh sản:");

        jLabel9.setText("Ghi chú:");

        txtghichu.setColumns(20);
        txtghichu.setRows(5);
        jScrollPane1.setViewportView(txtghichu);

        tbldongvat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Động Vật", "Mã Nhân Viên", "Nhiệt độ cơ thể", "Nhịp tim", "Biểu hiện", "Ngày khám", "Sinh sản", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldongvat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbldongvat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldongvatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbldongvat);

        txtmadv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmadvKeyReleased(evt);
            }
        });

        txtngay.setEditable(false);

        lblTenLoai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTenLoai.setForeground(new java.awt.Color(204, 0, 0));
        lblTenLoai.setText("Không xác định");

        btnindanhsach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Print.png"))); // NOI18N
        btnindanhsach.setText("In danh sách");
        btnindanhsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnindanhsachActionPerformed(evt);
            }
        });
        jPanel1.add(btnindanhsach);

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Add.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnMoi);

        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Add to basket.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });
        jPanel1.add(btnthem);

        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Delete.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnxoa);

        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Edit.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnsua);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/Exit.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangXuat);

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sticker/No.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat);

        lblBatLoiMDV.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsinhsan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbobieuhien, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtnhieptim)
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnhietdocothe)
                                    .addComponent(txtmadv)
                                    .addComponent(lblTenLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBatLoiMDV, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtngay, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmadv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(lblBatLoiMDV, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnhietdocothe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnhieptim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbobieuhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtsinhsan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void tbldongvatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldongvatMouseClicked
        // TODO add your handling code here:
        int row = tbldongvat.getSelectedRow();

        if (row >= 0) {
            String madv = (String) tbldongvat.getValueAt(row, 0);
            String ngayKham = (String) tbldongvat.getValueAt(row, 5);
            suckhoe sk = dao.selectByTimKiem(madv,ngayKham);
            if (sk != null) {
                this.setForm(sk);
                ;
            }
        }
    }//GEN-LAST:event_tbldongvatMouseClicked

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        this.dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnindanhsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnindanhsachActionPerformed
        exportExcel();
    }//GEN-LAST:event_btnindanhsachActionPerformed

    private void txtmadvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmadvKeyReleased
        try {
            DongVatDAO dvdao = new DongVatDAO();
            dongvat dv = new dongvat();
            dv = dvdao.selectById(txtmadv.getText());
            if(dv!=null){
                lblTenLoai.setText(dv.getTenDV());
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Không tìm thấy tên động vật");
        }
    }//GEN-LAST:event_txtmadvKeyReleased

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
            java.util.logging.Logger.getLogger(SuckhoeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuckhoeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuckhoeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuckhoeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuckhoeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnindanhsach;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbobieuhien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBatLoiMDV;
    private javax.swing.JLabel lblTenLoai;
    private javax.swing.JTable tbldongvat;
    private javax.swing.JTextArea txtghichu;
    private javax.swing.JTextField txtmadv;
    private javax.swing.JTextField txtngay;
    private javax.swing.JTextField txtnhieptim;
    private javax.swing.JTextField txtnhietdocothe;
    private javax.swing.JTextField txtsinhsan;
    // End of variables declaration//GEN-END:variables
suckhoedao dao = new suckhoedao();
    int row = -1;

    private void init() {
        this.setLocationRelativeTo(null);
        this.fillTable();
        this.row = -1;
        starDongHo();
        this.setIconImage(XImage.getAppIcon());
    }
    private void dangXuat(){
        Auth.clear();
        this.dispose();
        new DangNhapJDialog(this, true).setVisible(true);
    }
    private void starDongHo() {
        new Timer(1000, new ActionListener() {
            @Override
            //cứ 1000ms sẽ gọi hàm 1 lần
            public void actionPerformed(ActionEvent e) {
                // lấy thời gian hệ thống ra
                Date now = new Date();
                //Chuyển đổi sang chuổi giờ phút giây
                SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss a");
                
                txtngay.setText(fm.format(new Date()));
                //a: sáng chiều
                //String text = format.format(now);
               // lblngay.setText(text);
            }
        }).start();
    }
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbldongvat.getModel();
        model.setRowCount(0);
        try {
            List<suckhoe> list = dao.selectAll();
            for (suckhoe sk : list) {
                Object[] row = {
                    sk.getMadv(),
                    sk.getManv(),
                    sk.getNhietdocothe(),
                    sk.getNhieptim(),
                    sk.getBieuhien(),
                    sk.getNgaykham(),
                    sk.getSinhsan(),
                    sk.getGhiChu()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void insert() {
        try {
            if (txtmadv.getText().length() == 0) {
                lblBatLoiMDV.setText("Vui nhập mã động vật");
            }
            suckhoe model = getForm();

            dao.insert(model);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }

    }

    void update() {
        try {
            if (txtmadv.getText().length() == 0) {
                lblBatLoiMDV.setText("Vui nhập mã động vật");
            }
            suckhoe model = getForm();

            dao.update(model);
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
        if (txtmadv.getText().length() == 0) {
            lblBatLoiMDV.setText("Vui nhập mã động vật");
        } else if (MsgBox.confirm(this, "Bạn có muốn xóa hay không?")) {
            String madv = txtmadv.getText();
            try {
                dao.delete(madv);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }
        }

    }

    void clearForm() {
        this.setForm(new suckhoe());
        lblTenLoai.setText("Không xác định");
        this.row = -1;

    }

    void setForm(suckhoe sk) {
        txtmadv.setText(sk.getMadv());
        txtnhietdocothe.setText(String.valueOf(sk.getNhietdocothe()));
        txtnhieptim.setText(String.valueOf(sk.getNhieptim()));
        cbobieuhien.setSelectedItem(sk.getBieuhien());
        txtsinhsan.setText(sk.getSinhsan());
        txtghichu.setText(sk.getGhiChu());
        txtmadvKeyReleased(null);

    }

    suckhoe getForm() {

        suckhoe sk = new suckhoe();
        sk.setMadv(txtmadv.getText());
        sk.setManv(Auth.user.getManv());
        sk.setNhietdocothe(Float.valueOf(txtnhietdocothe.getText()));
        sk.setNhieptim(Float.valueOf(txtnhieptim.getText()));
        sk.setBieuhien(cbobieuhien.getSelectedItem().toString());
        sk.setNgaykham(txtngay.getText());
        sk.setSinhsan(txtsinhsan.getText());
        sk.setGhiChu(txtghichu.getText());
        return sk;
    }

    void edit() {
        String madv = (String) tbldongvat.getValueAt(row, 0);
        suckhoe sk = dao.selectById(madv);
        this.setForm(sk);
        this.updateStatus();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        // Trạng thái form
        txtmadv.setEditable(!edit);
        btnthem.setEnabled(!edit);
        btnsua.setEnabled(edit);
        btnxoa.setEnabled(edit);

    }
    // Ham xuat file Excel
    public void exportExcel() {
        try {
            File fileExcel = new File("file", "Báo Cáo Thống kê chi tiết.xlsx");

            JFileChooser chooser = new JFileChooser();
            chooser.setSelectedFile(fileExcel);

            int res = chooser.showSaveDialog(this);

            if (res == JFileChooser.APPROVE_OPTION) {
                String path = chooser.getSelectedFile().getAbsolutePath();
                saveExcel(path);
            }
            JOptionPane.showMessageDialog(this, "Xuất File Thành Công");
        } catch (Exception e) {
        }
    }

    public File saveExcel(String path) {
        try {
            File file;
            try (Workbook workbook = new XSSFWorkbook()) {
                
                
                //tên của sheet
                Sheet sh = workbook.createSheet("Sức Khoe");
                //tên cột của bảng
                String[] columnHeadings = {"Mã Động Vật", "Mã Nhân Viên", "Tên động vật", "Nhiệt độ cơ thể", "Nhịp tim", "Biểu hiện", "Ngày khám","Sinh sản"};
//                Font headerFont = workbook.createFont();
//                headerFont.setBold(true);
//                headerFont.setColor(IndexedColors.BLACK.index);
//                CellStyle headerStyle = workbook.createCellStyle();
//                headerStyle.setFont(headerFont);
//                headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//                headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
//                Row titleRow = sh.createRow(0);
//                Cell title = titleRow.createCell(0);
//                title.setCellStyle(headerStyle);
                Font headerFont = workbook.createFont();  
                headerFont.setBold(true);  
                headerFont.setFontHeightInPoints((short) 14);  
                headerFont.setColor(IndexedColors.RED.getIndex());  

                // Tạo kiểu ô bằng phông chữ  
                CellStyle headerCellStyle = workbook.createCellStyle();  
                headerCellStyle.setFont(headerFont);
                
                //in dữ liệu trong table
                sh.addMergedRegion(new CellRangeAddress(0, 0, 0, columnHeadings.length - 1));
                Row headerRow = sh.createRow(2);
                for (int i = 0; i < columnHeadings.length; i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(columnHeadings[i]);
                    
                    cell.setCellStyle(headerCellStyle);
                }
                
                int n = tbldongvat.getRowCount();
                int rownum = 3;
                for (int i = 0; i < n; i++) {
                    String MaDV = (String) tbldongvat.getValueAt(i, 0);
                    String MaNV = (String) tbldongvat.getValueAt(i, 1);
                    Float NDCT = (Float) tbldongvat.getValueAt(i, 2);
                    Float NT = (Float) tbldongvat.getValueAt(i, 3);
                    String BH = (String) tbldongvat.getValueAt(i, 4);
                    String ngay = (String) tbldongvat.getValueAt(i, 5);
                    String SS = (String) tbldongvat.getValueAt(i, 6);
                    String Gk = (String) tbldongvat.getValueAt(i, 7);
                   

                    Row row = sh.createRow(rownum++);

                    row.createCell(0).setCellValue(MaDV);
                    row.createCell(1).setCellValue(MaNV);
                    row.createCell(2).setCellValue(NDCT);
                    row.createCell(3).setCellValue(NT);
                    row.createCell(4).setCellValue(BH);
                    row.createCell(5).setCellValue(ngay);
                    row.createCell(6).setCellValue(SS);
                    row.createCell(7).setCellValue(Gk);
                }

                for (int i = 0; i < columnHeadings.length; i++) {
                    sh.autoSizeColumn(i);
                }   // Save file
                String fileName = "Báo Cáo Đơn hàng.xlsx";
                file = null;
                if (path == null) {
                    file = new File("file", fileName);
                } else {
                    file = new File(path);
                }
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOut = new FileOutputStream(file.getAbsolutePath());
                workbook.write(fileOut);
                fileOut.close();
            }
            return file;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
