
package com.raven.form;



import com.kaii.utils.MsgBox;
import com.kaii.utils.XDate;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ducit
 */
public class FormSell extends javax.swing.JPanel {

    /**
     * Creates new form FormProducts
     */
    public FormSell() {
        initComponents();
        setOpaque(false);

        jcheckVoucher.setSelected(false);
        cbbVoucher.setVisible(false);
        txtReturn.setEditable(false);
        txtTotal.setEditable(false);
    }

    public String deleteLastKey(String str) {
        if (str.charAt(str.length() - 1) == 'đ') {
            str = str.replace(str.substring(str.length() - 1), "");
            return str;
        } else {
            return str;
        }
    }

    public String fomartFloat(String txt) {
        String pattern = deleteLastKey(txt);
        return pattern = pattern.replaceAll(",", "");
    }

  



    public float TotalBuy() {
        float price = 0;
        int index = tableSellTemp.getRowCount();
        for (int i = 0; i < index; i++) {
            price += Float.parseFloat(fomartFloat((String) tableSellTemp.getValueAt(i, 6))) * (int) tableSellTemp.getValueAt(i, 7);
        }
        return price;
    }


 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new com.raven.suportSwing.TextField();
        myButton5 = new com.raven.suportSwing.MyButton();
        lblSearch = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShow = new com.raven.suportSwing.TableColumn();
        scrollBarCustom1 = new com.raven.suportSwing.ScrollBarCustom();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        myButton2 = new com.raven.suportSwing.MyButton();
        myButton3 = new com.raven.suportSwing.MyButton();
        txtMoneyCustomer = new com.raven.suportSwing.TextField();
        txtReturn = new com.raven.suportSwing.TextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableSellTemp = new com.raven.suportSwing.TableColumn();
        txtTotal = new com.raven.suportSwing.TextField();
        cbbVoucher = new com.raven.suportSwing.Combobox();
        jcheckVoucher = new javax.swing.JCheckBox();
        lblMoneyCustomer = new javax.swing.JLabel();
        scrollBarCustom2 = new com.raven.suportSwing.ScrollBarCustom();
        txtQuantity = new com.raven.suportSwing.TextField();
        myButton1 = new com.raven.suportSwing.MyButton();
        lblQuantity = new javax.swing.JLabel();
        cbbCustomer = new com.raven.suportSwing.Combobox();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Thánh toán bán hàng");

        txtSearch.setLabelText("Tìm theo tên or mã");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        myButton5.setText("Tìm");
        myButton5.setRadius(20);
        myButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton5ActionPerformed(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addComponent(myButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(myButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setVerticalScrollBar(scrollBarCustom1);

        tableShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Loại", "Chất Liệu", "Đơn giá", "Số lượng tồn kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableShow);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328)
                .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtDes.setColumns(20);
        txtDes.setRows(5);
        jScrollPane3.setViewportView(txtDes);

        jLabel1.setText("Ghi Chú");

        myButton2.setText("Xoá");
        myButton2.setRadius(20);
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });

        myButton3.setText("Hoàn thành");
        myButton3.setRadius(20);
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });

        txtMoneyCustomer.setLabelText("Tiền khách đưa");
        txtMoneyCustomer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMoneyCustomerFocusGained(evt);
            }
        });
        txtMoneyCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMoneyCustomerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMoneyCustomerKeyReleased(evt);
            }
        });

        txtReturn.setLabelText("Tiền trả lại");
        txtReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReturnActionPerformed(evt);
            }
        });

        jScrollPane4.setVerticalScrollBar(scrollBarCustom2);

        tableSellTemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Loại", "Chất Liệu", "Đơn giá", "Số lượng bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableSellTemp);

        txtTotal.setLabelText("Tổng tiền");

        cbbVoucher.setLabeText("Mã giảm giá");
        cbbVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbVoucherActionPerformed(evt);
            }
        });

        jcheckVoucher.setText("ÁP mã voucher ?");
        jcheckVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckVoucherActionPerformed(evt);
            }
        });

        lblMoneyCustomer.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblMoneyCustomer.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(742, 742, 742)
                        .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(lblMoneyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(scrollBarCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMoneyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jcheckVoucher)
                                        .addGap(51, 51, 51)
                                        .addComponent(cbbVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lblMoneyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(249, 249, 249))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcheckVoucher)
                                    .addComponent(cbbVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMoneyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txtReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(scrollBarCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        txtQuantity.setLabelText("Số lượng bán");
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantityFocusGained(evt);
            }
        });
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });

        myButton1.setText("Lưu tạm");
        myButton1.setRadius(20);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 0, 0));

        cbbCustomer.setLabeText("Khách hàng");
        cbbCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(302, 302, 302))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbbCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbbCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCustomerActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtQuantityActionPerformed
    }// GEN-LAST:event_txtQuantityActionPerformed

    private void myButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_myButton5ActionPerformed

    }// GEN-LAST:event_myButton5ActionPerformed

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_myButton4ActionPerformed
    }// GEN-LAST:event_myButton4ActionPerformed

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_myButton2ActionPerformed
        // TODO add your handling code here:
        if (jcheckVoucher.isSelected()) {
            if (cbbVoucher.getSelectedItem() == null) {
                return;
            } else {
                if (txtMoneyCustomer.getText().isEmpty()) {
                    return;
                } else {

                }
            }
        } else {
            if (txtMoneyCustomer.getText().isEmpty()) {
                return;
            } else {

                txtReturn.setText(nf.format(Float.valueOf(txtMoneyCustomer.getText()) - Float.valueOf(TotalBuy())) + " đ");
            }
            txtTotal.setText(nf.format(TotalBuy()) + " đ");
        }
    }

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
        if (jcheckVoucher.isSelected()) {
            if (cbbVoucher.getSelectedItem() == null) {
                return;
            } else {
                if (txtMoneyCustomer.getText().isEmpty()) {
                    return;
                } else {

                }
            }
        } else {
            txtTotal.setText(nf.format(TotalBuy()) + " đ");
            if (txtMoneyCustomer.getText().isEmpty()) {
                return;
            } else {

                txtReturn.setText(nf.format(Float.valueOf(txtMoneyCustomer.getText()) - Float.valueOf(TotalBuy())) + " đ");
            }
        }
    }// GEN-LAST:event_myButton1ActionPerformed

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
        txtTotal.setText("");
        txtMoneyCustomer.setText("");
        txtReturn.setText("");
        lblMoneyCustomer.setText("");
        lblQuantity.setText("");
        lblSearch.setText("");
    }// GEN-LAST:event_myButton3ActionPerformed

    private void cbbVoucherActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbbVoucherActionPerformed

    }// GEN-LAST:event_cbbVoucherActionPerformed

    private void txtMoneyCustomerKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtMoneyCustomerKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtMoneyCustomerKeyPressed

    private void jcheckVoucherActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jcheckVoucherActionPerformed
        // TODO add your handling code here:
        if (jcheckVoucher.isSelected()) {
            cbbVoucher.setVisible(true);
            if (cbbVoucher.getSelectedItem() == null) {
                return;
            } else {
                cbbVoucher.setSelectedIndex(0);
                if (txtMoneyCustomer.getText().isEmpty()) {
                    return;
                } else {
                }
            }
        } else {
            cbbVoucher.setVisible(false);
            txtReturn.setText(nf.format(Float.valueOf(txtMoneyCustomer.getText()) - Float.valueOf(TotalBuy())) + " đ");
            txtTotal.setText(nf.format(TotalBuy()) + " đ");
        }
//        txtReturn.setText(nf.format(Float.valueOf(txtMoneyCustomer.getText()) - Float.valueOf(TotalBuy())) + " đ");
    }// GEN-LAST:event_jcheckVoucherActionPerformed

    private void txtReturnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtReturnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtReturnActionPerformed
    Locale lc = new Locale("nv", "VN");
    NumberFormat nf = NumberFormat.getInstance(lc);

    private void txtMoneyCustomerKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtMoneyCustomerKeyReleased
        // TODO add your handling code here:
        if (txtMoneyCustomer.getText().isEmpty()) {
            txtReturn.setText("");
            return;
        } else {
            if (jcheckVoucher.isSelected()) {
            } else {
                txtReturn.setText(nf.format(Float.valueOf(txtMoneyCustomer.getText()) - Float.valueOf(TotalBuy())) + " đ");
            }
        }
    }// GEN-LAST:event_txtMoneyCustomerKeyReleased

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtQuantityKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtQuantityKeyPressed

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtQuantityFocusGained
        // TODO add your handling code here:
        lblQuantity.setText("");
    }// GEN-LAST:event_txtQuantityFocusGained

    private void txtMoneyCustomerFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtMoneyCustomerFocusGained
        // TODO add your handling code here:
        lblMoneyCustomer.setText("");
    }// GEN-LAST:event_txtMoneyCustomerFocusGained

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtSearchKeyReleased
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.suportSwing.Combobox cbbCustomer;
    private com.raven.suportSwing.Combobox cbbVoucher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JCheckBox jcheckVoucher;
    private javax.swing.JLabel lblMoneyCustomer;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSearch;
    private com.raven.suportSwing.MyButton myButton1;
    private com.raven.suportSwing.MyButton myButton2;
    private com.raven.suportSwing.MyButton myButton3;
    private com.raven.suportSwing.MyButton myButton5;
    private com.raven.suportSwing.ScrollBarCustom scrollBarCustom1;
    private com.raven.suportSwing.ScrollBarCustom scrollBarCustom2;
    private com.raven.suportSwing.TableColumn tableSellTemp;
    private com.raven.suportSwing.TableColumn tableShow;
    private javax.swing.JTextArea txtDes;
    private com.raven.suportSwing.TextField txtMoneyCustomer;
    private com.raven.suportSwing.TextField txtQuantity;
    private com.raven.suportSwing.TextField txtReturn;
    private com.raven.suportSwing.TextField txtSearch;
    private com.raven.suportSwing.TextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
