/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.JFrame;


import com.kaii.utils.MsgBox;
import com.kaii.utils.XDate;
import static com.kaii.utils.convertEng.removeAccent;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import com.itextpdf.text.BadElementException;
import com.lowagie.text.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ducit
 */
public class FormDetailInvoiceSell extends javax.swing.JFrame {

    /**
     * Creates new form FormDetailInvoiceSell
     */
    DefaultTableModel model;
    int row;
    int id;

    public FormDetailInvoiceSell(int id, DefaultTableModel model, int row) {
        this.model = model;
        this.row = row;
        this.id = id;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage("src\\com\\raven\\icon\\shop (6).png");
        this.setIconImage(icon);
    }

    Locale lc = new Locale("nv", "VN");
    NumberFormat nf = NumberFormat.getInstance(lc);



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableShow = new com.raven.suportSwing.TableColumn();
        myButton6 = new com.raven.suportSwing.MyButton();
        myButton7 = new com.raven.suportSwing.MyButton();
        scrollBarCustom1 = new com.raven.suportSwing.ScrollBarCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("H??a ????n chi ti???t");

        jScrollPane5.setVerticalScrollBar(scrollBarCustom1);

        tableShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "T??n SP", "T??n kh??ch h??ng", "Size", "Color", "Ch???t li???u", "S??? l?????ng", "Gi?? ti???n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tableShow);
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

        myButton6.setText("Hu???");
        myButton6.setRadius(20);
        myButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton6ActionPerformed(evt);
            }
        });

        myButton7.setText("Xu???t ho?? ????n");
        myButton7.setRadius(20);
        myButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addComponent(myButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(myButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_myButton6ActionPerformed

    public void outputPDF() throws IOException, BadElementException {

        String pathnn = XDate.toString(new Date(), " hh-mm-ss aa dd-MM-yyyy");
        pathnn = pathnn.replaceAll(" ", "_");
        System.out.println(pathnn);
        String path = "D:\\InvoiceSell"+pathnn+".pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        com.itextpdf.layout.Document document = new com.itextpdf.layout.Document(pdfDocument);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document doc = new Document(pdfDocument);
        float col = 280f;
        float columnWidth[] = {col, col};
        com.itextpdf.layout.element.Table table = new com.itextpdf.layout.element.Table(columnWidth);
        table.setBackgroundColor(new DeviceRgb(63, 169, 219)).setFontColor(Color.WHITE);
        String file = "src\\com\\raven\\icon\\shop (2).png";
        ImageData date = ImageDataFactory.create(file);
        com.itextpdf.layout.element.Image image = new com.itextpdf.layout.element.Image(date);
        table.addCell(new Cell().add(image).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add("IT SHOP").setFontSize(30f).setBorder(Border.NO_BORDER));

        table.addCell(new Cell().add("68 Nguyen Trai \n S??T: 0332429178 - 03324287654")
                .setTextAlignment(TextAlignment.RIGHT).setMarginTop(30f).setMarginBottom(30f).setBorder(Border.NO_BORDER).setMarginRight(10f)
        );

        float colWidth[] = {80, 250, 80, 150};

        com.itextpdf.layout.element.Table customerInfor = new com.itextpdf.layout.element.Table(colWidth);
        customerInfor.addCell(new Cell(0, 4).add("Phieu Thanh Toan").setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.CENTER));

        customerInfor.addCell(new Cell(0, 4).add("Thong tin").setBold().setBorder(Border.NO_BORDER));
        customerInfor.addCell(new Cell().add("Khach Hang: ").setBorder(Border.NO_BORDER));
        customerInfor.addCell(new Cell().add(removeAccent(model.getValueAt(row, 1).toString())).setBorder(Border.NO_BORDER));
        customerInfor.addCell(new Cell().add("Ma Hoa Don: ").setBorder(Border.NO_BORDER));
        customerInfor.addCell(new Cell().add(model.getValueAt(row, 0) + "").setBorder(Border.NO_BORDER));
        customerInfor.addCell(new Cell().add("SDT: ").setBorder(Border.NO_BORDER)); //
        customerInfor.addCell(new Cell().add(removeAccent(model.getValueAt(row, 2).toString())).setBorder(Border.NO_BORDER)); //

        customerInfor.addCell(new Cell().add("Thu Ngan: ").setBorder(Border.NO_BORDER)); //
        customerInfor.addCell(new Cell().add(removeAccent(model.getValueAt(row, 3).toString())).setBorder(Border.NO_BORDER)); //
        customerInfor.addCell(new Cell().add("Date: ").setBorder(Border.NO_BORDER));
        customerInfor.addCell(new Cell().add(model.getValueAt(row, 5) + "").setBorder(Border.NO_BORDER));

        float iteamInforColWidth[] = {140, 140, 140, 140};
        com.itextpdf.layout.element.Table itemInforTable = new com.itextpdf.layout.element.Table(iteamInforColWidth);
        itemInforTable.addCell(new Cell().add("San Pham").setBackgroundColor(new DeviceRgb(63, 169, 219)).setFontColor(Color.WHITE));
        itemInforTable.addCell(new Cell().add("So luong").setBackgroundColor(new DeviceRgb(63, 169, 219)).setFontColor(Color.WHITE));
        itemInforTable.addCell(new Cell().add("Gia").setBackgroundColor(new DeviceRgb(63, 169, 219)).setFontColor(Color.WHITE).setTextAlignment(TextAlignment.RIGHT));
        itemInforTable.addCell(new Cell().add("Thanh Tien").setBackgroundColor(new DeviceRgb(63, 169, 219)).setFontColor(Color.WHITE).setTextAlignment(TextAlignment.RIGHT));

        int total = 0;
        int quantitySum = 0;
       

        itemInforTable.addCell(new Cell().add("Tong So Luong").setBackgroundColor(new DeviceRgb(63, 169, 219)).setBorder(Border.NO_BORDER));
        itemInforTable.addCell(new Cell().add(quantitySum + "").setBackgroundColor(new DeviceRgb(63, 169, 219)).setBorder(Border.NO_BORDER));
        itemInforTable.addCell(new Cell().add("Tong Tien").setTextAlignment(TextAlignment.RIGHT).setBackgroundColor(new DeviceRgb(63, 169, 219)).setBorder(Border.NO_BORDER).setFontColor(Color.WHITE));
        itemInforTable.addCell(new Cell().add(nf.format(total) + " VND").setTextAlignment(TextAlignment.RIGHT).setBackgroundColor(new DeviceRgb(63, 169, 219)).setBorder(Border.NO_BORDER).setFontColor(Color.WHITE));

        float colWidthNote[] = {560};
        com.itextpdf.layout.element.Table customerInforNote = new com.itextpdf.layout.element.Table(colWidthNote);

        customerInforNote.addCell(new Cell().add("Luu y: Quy khach vui long kiem tra hang truoc khi roi khoi shop \n Giu hoa don khi tra hang trong vong 2 ngay").
                setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setItalic().setFontColor(Color.RED));
        customerInforNote.addCell(new Cell().add("Xin cam on quy khach !!!").
                setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setItalic().setFontColor(Color.BLACK));
        document.add(table);
        document.add(new Paragraph("\n"));
        document.add(customerInfor);
        document.add(new Paragraph("\n"));
        document.add(itemInforTable);
        document.add(new Paragraph("\n"));
        document.add(customerInforNote);
        document.close();
    }
    private void myButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton7ActionPerformed
        try {
            // TODO add your handling code here:
            outputPDF();
            MsgBox.alert(this, "In ho?? ????n th??nh c??ng");

        } catch (IOException ex) {
            Logger.getLogger(FormDetailInvoiceSell.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadElementException ex) {
            Logger.getLogger(FormDetailInvoiceSell.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_myButton7ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane5;
    private com.raven.suportSwing.MyButton myButton6;
    private com.raven.suportSwing.MyButton myButton7;
    private com.raven.suportSwing.ScrollBarCustom scrollBarCustom1;
    private com.raven.suportSwing.TableColumn tableShow;
    // End of variables declaration//GEN-END:variables
}
