/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cartiec.jrenamer;

import java.awt.Component;
import java.io.File;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author Tonny
 */
public class FilesTreeCellRenderer extends DefaultTreeCellRenderer {

    public FilesTreeCellRenderer() {
        setLeafIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/icons22x22/folder.png")));
        setOpenIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/icons22x22/document-open.png")));
        setClosedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/icons22x22/folder.png")));
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        DefaultTreeCellRenderer tr = (DefaultTreeCellRenderer) super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
        
        if(value instanceof DefaultMutableTreeNode){
            DefaultMutableTreeNode tn = (DefaultMutableTreeNode) value;
            Object uo = tn.getUserObject();
            if(uo instanceof File){
                File f = (File) uo;
                String name = f.getName();
                if((name != null) && (!name.equals(""))){
                    tr.setText(name);
                }
            }
        }
        return tr;
    }
    
    
}
