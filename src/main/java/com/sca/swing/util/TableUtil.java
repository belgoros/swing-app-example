package com.sca.swing.util;

import javax.swing.*;

public class TableUtil {
    public static JTable newTable(String name) {
        JTable table = new JTable();
        table.setName(name);
        return table;
    }

    public static JTable newTable(String name, Object[][] rowData, Object[] columnNames) {
        JTable table = new JTable(rowData, columnNames);
        table.setName(name);
        return table;
    }
}
