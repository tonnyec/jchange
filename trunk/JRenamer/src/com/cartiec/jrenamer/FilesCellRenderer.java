/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cartiec.jrenamer;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Tonny
 */
public class FilesCellRenderer extends JLabel implements TableCellRenderer {

    /**
     * An empty <code>Border</code>. This field might not be used. To change the
     * <code>Border</code> used by this renderer override the 
     * <code>getTableCellRendererComponent</code> method and set the border
     * of the returned component directly.
     */
    protected static Border noFocusBorder = new EmptyBorder(1, 1, 1, 1);
    private static final Border SAFE_NO_FOCUS_BORDER = new EmptyBorder(1, 1, 1, 1);    // We need a place to store the color the JLabel should be returned 
    // to after its foreground and background colors have been set 
    // to the selection background color. 
    // These ivars will be made protected when their names are finalized. 
    private Color unselectedForeground;
    private Color unselectedBackground;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        Color fg = null;
        Color bg = null;

        JTable.DropLocation dropLocation = table.getDropLocation();
        if (dropLocation != null && !dropLocation.isInsertRow() && !dropLocation.isInsertColumn() && dropLocation.getRow() == row && dropLocation.getColumn() == column) {

            fg = UIManager.getColor("Table.dropCellForeground");
            bg = UIManager.getColor("Table.dropCellBackground");

            isSelected = true;
        }

        if (isSelected) {
            super.setForeground(fg == null ? table.getSelectionForeground()
                    : fg);
            super.setBackground(bg == null ? table.getSelectionBackground()
                    : bg);
        } else {
            super.setForeground(unselectedForeground != null
                    ? unselectedForeground
                    : table.getForeground());
            super.setBackground(unselectedBackground != null
                    ? unselectedBackground
                    : table.getBackground());
        }

        setFont(table.getFont());

        if (hasFocus) {
            Border border = null;
            if (isSelected) {
                border = UIManager.getBorder("Table.focusSelectedCellHighlightBorder");
            }
            if (border == null) {
                border = UIManager.getBorder("Table.focusCellHighlightBorder");
            }
            setBorder(border);

            if (!isSelected && table.isCellEditable(row, column)) {
                Color col;
                col = UIManager.getColor("Table.focusCellForeground");
                if (col != null) {
                    super.setForeground(col);
                }
                col = UIManager.getColor("Table.focusCellBackground");
                if (col != null) {
                    super.setBackground(col);
                }
            }
        } else {
            setBorder(getNoFocusBorder());
        }

        setIcon(null);
        
        if (value instanceof String) {
            setOpaque(true);
            setText((String) value);
        }

        if (value instanceof File) {
            File f = (File) value;
            setOpaque(true);
            setText((f.getName()));
            if(f.isDirectory()){
                setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/icons16x16/folder.png")));
            }
            else{
                setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/icons16x16/document-properties.png")));
            }
        }

        if (value instanceof Boolean) {
            JCheckBox chk = new JCheckBox("", ((Boolean) value));
            chk.setHorizontalAlignment(SwingConstants.CENTER);
            if (isSelected) {
                chk.setBackground(bg == null ? table.getSelectionBackground()
                        : bg);
            } else {
                chk.setBackground(unselectedBackground != null
                        ? unselectedBackground
                        : table.getBackground());
            }
            return chk;
        }



        return this;

    }

    private static Border getNoFocusBorder() {
        if (System.getSecurityManager() != null) {
            return SAFE_NO_FOCUS_BORDER;
        } else {
            return noFocusBorder;
        }
    }
}
