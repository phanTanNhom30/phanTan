/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.kaii.utils.Excel;
import com.kaii.utils.MsgBox;
import com.raven.chart.ModelChart;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ducit
 */
public class FormSalesStatistics extends javax.swing.JPanel {

    /**
     * Creates new form FormProducts
     */
    public FormSalesStatistics() {
        initComponents();
        setOpaque(false);
        radiStreet.setSelected(true);
        
    }

        
    
    
   

   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cbbYear = new com.raven.suportSwing.Combobox();
        cbbMonth = new com.raven.suportSwing.Combobox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShow = new com.raven.suportSwing.TableColumn();
        myButton6 = new com.raven.suportSwing.MyButton();
        myButton7 = new com.raven.suportSwing.MyButton();
        radiStreet = new com.raven.suportSwing.RadioButtonCustom();
        radiColumn = new com.raven.suportSwing.RadioButtonCustom();
        scrollBarCustom1 = new com.raven.suportSwing.ScrollBarCustom();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cbbYear.setToolTipText("");
        cbbYear.setLabeText("Năm");
        cbbYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbYearItemStateChanged(evt);
            }
        });
        cbbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbYearActionPerformed(evt);
            }
        });

        cbbMonth.setLabeText("Tháng");
        cbbMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbMonthItemStateChanged(evt);
            }
        });
        cbbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMonthActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Thống kê doanh số");

        jScrollPane1.setVerticalScrollBar(scrollBarCustom1);

        tableShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Số lượng bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableShow);

        myButton6.setText("Xuất");
        myButton6.setRadius(20);
        myButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton6ActionPerformed(evt);
            }
        });

        myButton7.setText("Biểu đồ");
        myButton7.setRadius(20);
        myButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiStreet);
        radiStreet.setText("Biều đồ đường");
        radiStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiStreetActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiColumn);
        radiColumn.setText("Biều đồ Cột");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(myButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radiStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(myButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(cbbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(radiStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radiColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157)
                                .addComponent(myButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(scrollBarCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void excel() throws IOException {
        Excel.outExcel((DefaultTableModel) tableShow.getModel());
        MsgBox.alert(this, "Xuất file thành công");
    }
    private void myButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton6ActionPerformed
        // TODO add your handling code here:
        try {
            excel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_myButton6ActionPerformed

    private void cbbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbYearActionPerformed
        // TODO add your handling code here:
//        fillTable();
    }//GEN-LAST:event_cbbYearActionPerformed

    private void cbbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMonthActionPerformed
        // TODO add your handling code here:
        if (cbbMonth.getSelectedItem() == null) {
            return;
        } else {
        }

//        fillTable();
    }//GEN-LAST:event_cbbMonthActionPerformed

    private void cbbMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbMonthItemStateChanged
        // TODO add your handling code here:
//        fillTable();
    }//GEN-LAST:event_cbbMonthItemStateChanged

    private void cbbYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbYearItemStateChanged
        // TODO add your handling code here:
//        fillComboboxMonths();
    }//GEN-LAST:event_cbbYearItemStateChanged

    private void myButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton7ActionPerformed
 
        if (radiColumn.isSelected()) {
            new showChartRevenue((DefaultTableModel) tableShow.getModel(), null).setVisible(true);
        } else {
            new ShowChart((DefaultTableModel) tableShow.getModel()).setVisible(true);

        }
    }//GEN-LAST:event_myButton7ActionPerformed

    private void radiStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiStreetActionPerformed
    }//GEN-LAST:event_radiStreetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.raven.suportSwing.Combobox cbbMonth;
    private com.raven.suportSwing.Combobox cbbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.suportSwing.MyButton myButton6;
    private com.raven.suportSwing.MyButton myButton7;
    private com.raven.suportSwing.RadioButtonCustom radiColumn;
    private com.raven.suportSwing.RadioButtonCustom radiStreet;
    private com.raven.suportSwing.ScrollBarCustom scrollBarCustom1;
    private com.raven.suportSwing.TableColumn tableShow;
    // End of variables declaration//GEN-END:variables
}
