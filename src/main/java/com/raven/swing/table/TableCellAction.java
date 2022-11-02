package com.raven.swing.table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableCellAction extends DefaultCellEditor {

    private ModelAction data;

    public TableCellAction() {
        super(new JCheckBox());
    }

  

    //  This method to pass data to cell render when focus lose in cell
    
}
