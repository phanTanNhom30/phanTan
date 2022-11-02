/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.JFrame;



import com.kaii.utils.MsgBox;
import com.kaii.utils.XImage;
import com.raven.form.FormItems;
import com.raven.form.MainForm;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ducit
 */
public class FormImportItemJFrame extends javax.swing.JFrame {


    public FormImportItemJFrame() {
        initComponents();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        statusForm();

        btnDelete.setEnabled(false);
    }

    public void statusForm() {
        btnAddMaterial.setVisible(false);
        btnColorAdd.setVisible(false);
        btnEditColor.setVisible(false);
        btnEditMaterial.setVisible(false);
        btnEditSize.setVisible(false);
        btnAddSize.setVisible(false);
        txtColorAdd.setVisible(false);
        txtMaterialAdd.setVisible(false);
        txtSizeAdd.setVisible(false);
        lblColor.setVisible(false);
        lblMaterialAdd.setVisible(false);
        lblSizeAdd.setVisible(false);
        lblMaterialAdd.setVisible(false);
        lblPrice.setVisible(false);

    }










    public void clearImage() {
        int i = 0;
        for (Component jc : panelImage.getComponents()) {
            if (jc instanceof JLabel) {
                if (i > 0) {
                    JLabel label = (JLabel) jc;
                    panelImage.remove(jc);

                }
                i++;
            }
        }
        repaint();
        revalidate();
    }

    public void choseImage() {
        JFileChooser fileChooser = new JFileChooser("D:\\Fall2021\\ABDemoImg");
        fileChooser.setDialogTitle("Please select more images");
        fileChooser.setMultiSelectionEnabled(true);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File[] img = fileChooser.getSelectedFiles();
            for (File f : img) {
                XImage.save(f);//luu vao thu muc
                ImageIcon icon = XImage.read(f.getName());//doc hinh tu logo
                JLabel lbl = new JLabel(icon);
                lbl.setToolTipText(f.getName());//giu ten hinh trong tooltip
                panelImage.add(lbl);
            }
            repaint();
            revalidate();
        }
    }

    public void addEvenFillTable(ActionListener evt) {
        btnAddProductItem.addActionListener(evt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableColumn1 = new com.raven.suportSwing.TableColumn();
        scrollBar1 = new com.raven.suportSwing.ScrollBar();
        jPanel2 = new javax.swing.JPanel();
        panelImage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbbProduct = new com.raven.suportSwing.Combobox();
        txtPrice = new com.raven.suportSwing.TextField();
        jPanel6 = new javax.swing.JPanel();
        btn = new com.raven.suportSwing.MyButton();
        txtColorAdd = new com.raven.suportSwing.TextField();
        btnEditColor = new com.raven.suportSwing.MyButton();
        cbbColor = new com.raven.suportSwing.Combobox();
        btnAddSize = new com.raven.suportSwing.MyButton();
        txtMaterialAdd = new com.raven.suportSwing.TextField();
        cbbSize = new com.raven.suportSwing.Combobox();
        cbbMaterial = new com.raven.suportSwing.Combobox();
        btnEditSize = new com.raven.suportSwing.MyButton();
        myButton11 = new com.raven.suportSwing.MyButton();
        txtSizeAdd = new com.raven.suportSwing.TextField();
        btnEditMaterial = new com.raven.suportSwing.MyButton();
        myButton10 = new com.raven.suportSwing.MyButton();
        btnColorAdd = new com.raven.suportSwing.MyButton();
        btnAddMaterial = new com.raven.suportSwing.MyButton();
        lblSizeAdd = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblMaterialAdd = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        myButton7 = new com.raven.suportSwing.MyButton();
        btnAddProductItem = new com.raven.suportSwing.MyButton();
        btnDelete = new com.raven.suportSwing.MyButton();
        btnClearImg = new com.raven.suportSwing.MyButton();
        myButton3 = new com.raven.suportSwing.MyButton();
        btnAddTemp = new com.raven.suportSwing.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        jPanel1.setBackground(java.awt.Color.white);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Thêm mặt hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.Color.white);

        tableColumn1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Giá Bán", "Size", "Màu Sắc", "Chất liệu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableColumn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableColumn1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableColumn1);
        if (tableColumn1.getColumnModel().getColumnCount() > 0) {
            tableColumn1.getColumnModel().getColumn(0).setResizable(false);
            tableColumn1.getColumnModel().getColumn(1).setResizable(false);
            tableColumn1.getColumnModel().getColumn(2).setResizable(false);
            tableColumn1.getColumnModel().getColumn(3).setResizable(false);
            tableColumn1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(scrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(scrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.white);
//        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Tahoma", 1, 11))); 

        panelImage.setBackground(new java.awt.Color(255, 255, 255));
//        panelImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null));
        panelImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelImage.setLayout(new java.awt.FlowLayout(0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/add (1).png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelImage.add(jLabel1);

        cbbProduct.setLabeText("Tên sản phẩm");
        cbbProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbProductActionPerformed(evt);
            }
        });

        txtPrice.setLabelText("Giá Bán");
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Create.png"))); // NOI18N
        btn.setRadius(20);
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        txtColorAdd.setLabelText("Màu Thêm");
        txtColorAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtColorAddFocusGained(evt);
            }
        });

        btnEditColor.setText("Sửa");
        btnEditColor.setMaximumSize(new java.awt.Dimension(59, 23));
        btnEditColor.setMinimumSize(new java.awt.Dimension(59, 23));
        btnEditColor.setPreferredSize(new java.awt.Dimension(59, 23));
        btnEditColor.setRadius(20);
        btnEditColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditColorActionPerformed(evt);
            }
        });

        cbbColor.setLabeText("Màu sắc");
        cbbColor.setPreferredSize(new java.awt.Dimension(30, 40));
        cbbColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbColorActionPerformed(evt);
            }
        });

        btnAddSize.setText("Thêm");
        btnAddSize.setRadius(20);
        btnAddSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSizeActionPerformed(evt);
            }
        });

        txtMaterialAdd.setLabelText("Chất liệu Thêm");
        txtMaterialAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaterialAddFocusGained(evt);
            }
        });
        txtMaterialAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaterialAddActionPerformed(evt);
            }
        });

        cbbSize.setLabeText("Size");
        cbbSize.setPreferredSize(new java.awt.Dimension(30, 40));
        cbbSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbSizeMouseClicked(evt);
            }
        });
        cbbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSizeActionPerformed(evt);
            }
        });

        cbbMaterial.setLabeText("Chất liệu");
        cbbMaterial.setPreferredSize(new java.awt.Dimension(30, 40));
        cbbMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaterialActionPerformed(evt);
            }
        });

        btnEditSize.setText("Sửa");
        btnEditSize.setMaximumSize(new java.awt.Dimension(59, 23));
        btnEditSize.setMinimumSize(new java.awt.Dimension(59, 23));
        btnEditSize.setPreferredSize(new java.awt.Dimension(59, 23));
        btnEditSize.setRadius(20);
        btnEditSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSizeActionPerformed(evt);
            }
        });

        myButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Create.png"))); // NOI18N
        myButton11.setRadius(20);
        myButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton11ActionPerformed(evt);
            }
        });

        txtSizeAdd.setLabelText("Size Thêm");
        txtSizeAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSizeAddFocusGained(evt);
            }
        });

        btnEditMaterial.setText("Sửa");
        btnEditMaterial.setMaximumSize(new java.awt.Dimension(59, 23));
        btnEditMaterial.setMinimumSize(new java.awt.Dimension(59, 23));
        btnEditMaterial.setPreferredSize(new java.awt.Dimension(59, 23));
        btnEditMaterial.setRadius(20);
        btnEditMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMaterialActionPerformed(evt);
            }
        });

        myButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Create.png"))); // NOI18N
        myButton10.setRadius(20);
        myButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton10ActionPerformed(evt);
            }
        });

        btnColorAdd.setText("Thêm");
        btnColorAdd.setRadius(20);
        btnColorAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorAddActionPerformed(evt);
            }
        });

        btnAddMaterial.setText("Thêm");
        btnAddMaterial.setRadius(20);
        btnAddMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMaterialActionPerformed(evt);
            }
        });

        lblSizeAdd.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblSizeAdd.setForeground(new java.awt.Color(255, 0, 0));

        lblColor.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 0, 0));

        lblMaterialAdd.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblMaterialAdd.setForeground(new java.awt.Color(255, 51, 0));
        lblMaterialAdd.setText("jLabel3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAddMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAddSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblSizeAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSizeAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnColorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaterialAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cbbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMaterialAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSizeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSizeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSize, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(myButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnColorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaterialAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMaterialAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblPrice.setForeground(new java.awt.Color(225, 0, 0));
        lblPrice.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cbbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        myButton7.setText("Huỷ");
        myButton7.setRadius(20);
        myButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton7ActionPerformed(evt);
            }
        });

        btnAddProductItem.setText("Hoàn Thành");
        btnAddProductItem.setRadius(20);
        btnAddProductItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductItemActionPerformed(evt);
            }
        });

        btnDelete.setText("Xoá");
        btnDelete.setRadius(20);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClearImg.setText("Tạo mới hình");
        btnClearImg.setRadius(20);
        btnClearImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearImgActionPerformed(evt);
            }
        });

        myButton3.setText("Mới");
        myButton3.setRadius(20);

        btnAddTemp.setText("Lưu tạm");
        btnAddTemp.setRadius(20);
        btnAddTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTempActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(399, 399, 399)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProductItem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearImg, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 872, Short.MAX_VALUE))
                    .addGap(103, 103, 103)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnAddTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnClearImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnAddProductItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(myButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        if (txtSizeAdd.isVisible()) {
            txtSizeAdd.setVisible(false);
            btnAddSize.setVisible(false);
            btnEditSize.setVisible(false);
            lblSizeAdd.setText("");
        } else {
            txtSizeAdd.setVisible(true);
            btnAddSize.setVisible(true);
            btnEditSize.setVisible(true);
        }

    }//GEN-LAST:event_btnActionPerformed

    private void myButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton10ActionPerformed
        if (txtColorAdd.isVisible()) {
            btnColorAdd.setVisible(false);
            txtColorAdd.setVisible(false);
            btnEditColor.setVisible(false);
            lblColor.setText("");
        } else {
            btnColorAdd.setVisible(true);
            txtColorAdd.setVisible(true);
            btnEditColor.setVisible(true);
        }
    }//GEN-LAST:event_myButton10ActionPerformed

    private void myButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton11ActionPerformed
        // TODO add your handling code here:
        if (txtMaterialAdd.isVisible()) {
            txtMaterialAdd.setVisible(false);
            btnAddMaterial.setVisible(false);
            btnEditMaterial.setVisible(false);
            lblMaterialAdd.setText("");
        } else {
            txtMaterialAdd.setVisible(true);
            btnAddMaterial.setVisible(true);
            btnEditMaterial.setVisible(true);
        }
    }//GEN-LAST:event_myButton11ActionPerformed

    private void cbbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbColorActionPerformed

    private void txtMaterialAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaterialAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaterialAddActionPerformed

    private void btnEditMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditMaterialActionPerformed

    private void cbbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSizeActionPerformed
    }//GEN-LAST:event_cbbSizeActionPerformed

    private void btnAddSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSizeActionPerformed

    private void cbbSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbSizeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbSizeMouseClicked

    private void btnColorAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnColorAddActionPerformed

    private void btnEditColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditColorActionPerformed

    private void btnAddMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMaterialActionPerformed

    private void cbbMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMaterialActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        choseImage();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnClearImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearImgActionPerformed
        clearImage();
    }//GEN-LAST:event_btnClearImgActionPerformed

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        lblPrice.setVisible(false);
    }//GEN-LAST:event_txtPriceFocusGained

    private void btnAddTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTempActionPerformed
        clearImage();
    }//GEN-LAST:event_btnAddTempActionPerformed


    private void btnAddProductItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductItemActionPerformed

    }//GEN-LAST:event_btnAddProductItemActionPerformed


    private void tableColumn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableColumn1MouseClicked
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tableColumn1MouseClicked

    private void cbbProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbProductActionPerformed

    private void btnEditSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditSizeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void myButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        txtPrice.setText("");
        cbbColor.setSelectedIndex(0);
        cbbMaterial.setSelectedIndex(0);
        cbbProduct.setSelectedIndex(0);
        cbbSize.setSelectedIndex(0);
        clearImage();
        DefaultTableModel model = (DefaultTableModel) tableColumn1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_myButton7ActionPerformed

    private void txtSizeAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSizeAddFocusGained
        // TODO add your handling code here:
        lblSizeAdd.setText("");
    }//GEN-LAST:event_txtSizeAddFocusGained

    private void txtColorAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtColorAddFocusGained
        // TODO add your handling code here:
        lblColor.setText("");
    }//GEN-LAST:event_txtColorAddFocusGained

    private void txtMaterialAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaterialAddFocusGained
        // TODO add your handling code here:
        lblMaterialAdd.setText("");
    }//GEN-LAST:event_txtMaterialAddFocusGained

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
            java.util.logging.Logger.getLogger(FormImportItemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormImportItemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormImportItemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormImportItemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormImportItemJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.suportSwing.MyButton btn;
    private com.raven.suportSwing.MyButton btnAddMaterial;
    private com.raven.suportSwing.MyButton btnAddProductItem;
    private com.raven.suportSwing.MyButton btnAddSize;
    private com.raven.suportSwing.MyButton btnAddTemp;
    private com.raven.suportSwing.MyButton btnClearImg;
    private com.raven.suportSwing.MyButton btnColorAdd;
    private com.raven.suportSwing.MyButton btnDelete;
    private com.raven.suportSwing.MyButton btnEditColor;
    private com.raven.suportSwing.MyButton btnEditMaterial;
    private com.raven.suportSwing.MyButton btnEditSize;
    private com.raven.suportSwing.Combobox cbbColor;
    private com.raven.suportSwing.Combobox cbbMaterial;
    private com.raven.suportSwing.Combobox cbbProduct;
    private com.raven.suportSwing.Combobox cbbSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMaterialAdd;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSizeAdd;
    private com.raven.suportSwing.MyButton myButton10;
    private com.raven.suportSwing.MyButton myButton11;
    private com.raven.suportSwing.MyButton myButton3;
    private com.raven.suportSwing.MyButton myButton7;
    private javax.swing.JPanel panelImage;
    private com.raven.suportSwing.ScrollBar scrollBar1;
    private com.raven.suportSwing.TableColumn tableColumn1;
    private com.raven.suportSwing.TextField txtColorAdd;
    private com.raven.suportSwing.TextField txtMaterialAdd;
    private com.raven.suportSwing.TextField txtPrice;
    private com.raven.suportSwing.TextField txtSizeAdd;
    // End of variables declaration//GEN-END:variables

}
