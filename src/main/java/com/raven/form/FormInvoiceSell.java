/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;


import com.kaii.utils.Excel;
import com.kaii.utils.MsgBox;
import com.kaii.utils.XDate;
import com.raven.JFrame.FormDetailInvoiceSell;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ducit
 */
public class FormInvoiceSell extends javax.swing.JPanel {

    /**
     * Creates new form FormItems
     */
    Locale lc = new Locale("nv", "VN");
    NumberFormat nf = NumberFormat.getInstance(lc);

    public FormInvoiceSell() {
        initComponents();
        setOpaque(false);
        fillPagination();
        lblSearchId.setVisible(false);
    }

    DefaultTableModel model;
    int page = 1;
    int rowCountPerPage = 5;
    int totalPage = 1;
    Integer totalData = 0;
    boolean flag = false;

    public void edit() {
        if (page == 1) {
            btnFirst.setEnabled(false);
            btnBack.setEnabled(false);
        } else {
            btnFirst.setEnabled(true);
            btnBack.setEnabled(true);
        }

        if (page == totalPage) {
            btnLast.setEnabled(false);
            btnNext.setEnabled(false);
        } else {
            btnLast.setEnabled(true);
            btnNext.setEnabled(true);
        }

        if (page > totalPage) {
            page = 1;
        }
    }

    public void fillPagination() {
        rowCountPerPage = Integer.valueOf(cbbPagination.getSelectedItem().toString());
        Double totalPageD = Math.ceil(totalData.doubleValue() / rowCountPerPage);
        totalPage = totalPageD.intValue();

        edit();
        model = (DefaultTableModel) tableShow.getModel();
        model.setRowCount(0);

        String phone = "";
        String status = "";


        lblCount.setText("Page " + page + " for " + totalPage);

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchId = new com.raven.suportSwing.TextField();
        myButton5 = new com.raven.suportSwing.MyButton();
        myButton6 = new com.raven.suportSwing.MyButton();
        jPanel3 = new javax.swing.JPanel();
        txtDate = new com.raven.suportSwing.TextField();
        btnFillDate = new com.raven.suportSwing.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShow = new com.raven.suportSwing.TableColumn();
        btnReset = new com.raven.suportSwing.MyButton();
        btnBack = new javax.swing.JButton();
        cbbPagination = new javax.swing.JComboBox<>();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblCount = new javax.swing.JLabel();
        scrollBarCustom1 = new com.raven.suportSwing.ScrollBarCustom();
        lblSearchId = new javax.swing.JLabel();

        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(txtDate);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Hoá đơn thanh toán");

        txtSearchId.setLabelText("Tìm theo mã phiếu nhập");
        txtSearchId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchIdFocusGained(evt);
            }
        });

        myButton5.setText("Tìm");
        myButton5.setRadius(20);
        myButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton5ActionPerformed(evt);
            }
        });

        myButton6.setText("Xuất");
        myButton6.setRadius(20);
        myButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(myButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
                .addComponent(myButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(436, 436, 436))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(myButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtDate.setLabelText("Thời gian");

        btnFillDate.setText("Lọc");
        btnFillDate.setRadius(20);
        btnFillDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillDateActionPerformed(evt);
            }
        });

        jScrollPane1.setVerticalScrollBar(scrollBarCustom1);

        tableShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hoá đơn", "Tên Khách hàng", "Số điện thoại", "Nhân Viên", "Tổng Tiền", "Ngày Tạo", "Ghi Chú", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableShow);
        if (tableShow.getColumnModel().getColumnCount() > 0) {
            tableShow.getColumnModel().getColumn(0).setResizable(false);
            tableShow.getColumnModel().getColumn(1).setResizable(false);
            tableShow.getColumnModel().getColumn(2).setResizable(false);
            tableShow.getColumnModel().getColumn(3).setResizable(false);
            tableShow.getColumnModel().getColumn(4).setResizable(false);
            tableShow.getColumnModel().getColumn(5).setResizable(false);
            tableShow.getColumnModel().getColumn(6).setResizable(false);
            tableShow.getColumnModel().getColumn(7).setResizable(false);
        }

        btnReset.setText("Reset");
        btnReset.setRadius(20);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBack.setText("<");
        btnBack.setToolTipText("");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cbbPagination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30" }));
        cbbPagination.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbPaginationItemStateChanged(evt);
            }
        });
        cbbPagination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbPaginationActionPerformed(evt);
            }
        });

        btnFirst.setText("<<");
        btnFirst.setToolTipText("");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setText(">>");
        btnLast.setToolTipText("");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.setToolTipText("");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblCount.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnFillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbPagination, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1214, 1214, 1214))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFillDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(226, 226, 226)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(cbbPagination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext)
                    .addComponent(btnLast)
                    .addComponent(btnFirst))
                .addGap(34, 34, 34)
                .addComponent(lblCount)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(scrollBarCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.getAccessibleContext().setAccessibleName("");

        lblSearchId.setForeground(new java.awt.Color(225, 0, 0));
        lblSearchId.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(lblSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblSearchId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton5ActionPerformed
        if (txtSearchId.getText().isEmpty()) {
            fillPagination();
        }
    }//GEN-LAST:event_myButton5ActionPerformed

    public void excelSell() throws IOException {
        Excel.outExcel((DefaultTableModel) tableShow.getModel());
        MsgBox.alert(this, "Xuất file thành công");
    }
    private void myButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton6ActionPerformed
        // TODO add your handling code here:
        try {
            excelSell();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_myButton6ActionPerformed

    private void btnFillDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillDateActionPerformed
        // TODO add your handling code here:
        flag = true;
    }//GEN-LAST:event_btnFillDateActionPerformed

    private void tableShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableShowMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int row = tableShow.getSelectedRow();
            int id = (int) tableShow.getValueAt(row, 0);
            new FormDetailInvoiceSell(id, (DefaultTableModel) tableShow.getModel(), tableShow.getSelectedRow()).setVisible(true);
        }
    }//GEN-LAST:event_tableShowMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        fillPagination();
        flag = false;
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        page = totalPage;
        if (flag) {
            return;
        }
        fillPagination();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        page++;
        if (flag) {
            return;
        }
        fillPagination();
    }//GEN-LAST:event_btnNextActionPerformed

    private void cbbPaginationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbPaginationItemStateChanged
        if (flag) {
            return;
        }
        fillPagination();
    }//GEN-LAST:event_cbbPaginationItemStateChanged

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        page--;
        if (flag) {
            return;
        }
        fillPagination();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        page = 1;
        if (flag) {
            return;
        }
        fillPagination();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void txtSearchIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchIdFocusGained
        lblSearchId.setVisible(false);
    }//GEN-LAST:event_txtSearchIdFocusGained

    private void cbbPaginationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbPaginationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbPaginationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private com.raven.suportSwing.MyButton btnFillDate;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private com.raven.suportSwing.MyButton btnReset;
    private javax.swing.JComboBox<String> cbbPagination;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblSearchId;
    private com.raven.suportSwing.MyButton myButton5;
    private com.raven.suportSwing.MyButton myButton6;
    private com.raven.suportSwing.ScrollBarCustom scrollBarCustom1;
    private com.raven.suportSwing.TableColumn tableShow;
    private com.raven.suportSwing.TextField txtDate;
    private com.raven.suportSwing.TextField txtSearchId;
    // End of variables declaration//GEN-END:variables
}
