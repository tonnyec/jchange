/*
 * MainJFrame.java
 *
 * Created on 8 de julio de 2008, 11:47
 */
package com.cartiec.jrenamer;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author  Tonny
 */
public class MainJFrame extends javax.swing.JFrame {

    DefaultMutableTreeNode top = new DefaultMutableTreeNode("My Computer");

    /** Creates new form MainJFrame */
    public MainJFrame() {
        initComponents();

        TableColumn column = table.getColumn("Seleccionar");
        column.setMinWidth(20);
        column.setPreferredWidth(70);
        column.setMaxWidth(70);


        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setLeafIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/polygon.png")));
        renderer.setOpenIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/folder.png")));
        renderer.setClosedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/folder_new.png")));
        tree.setCellRenderer(renderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tree =  new JTree(top);
        jPanel1 = new javax.swing.JPanel();
        chkShowDir = new javax.swing.JCheckBox();
        chkShowFiles = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seleccionar", "Archivo", "Archivo Renombrado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        tree.setToggleClickCount(1);
        tree.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
                treeTreeCollapsed(evt);
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                treeTreeExpanded(evt);
            }
        });
        tree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(tree);

        chkShowDir.setSelected(true);
        chkShowDir.setText("Mostrar Directorios");

        chkShowFiles.setSelected(true);
        chkShowFiles.setText("Mostrar Archivos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkShowDir)
                .addGap(18, 18, 18)
                .addComponent(chkShowFiles)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkShowDir)
                    .addComponent(chkShowFiles))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-621)/2, (screenSize.height-378)/2, 621, 378);
    }// </editor-fold>//GEN-END:initComponents

private void treeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeValueChanged
    DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
    checkNode(node);
}//GEN-LAST:event_treeValueChanged

private void treeTreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_treeTreeExpanded
    DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
    ((DefaultTableModel) table.getModel()).getDataVector().clear();
    for (int i = 0; i < node.getChildCount(); i++) {
        checkNode((DefaultMutableTreeNode) node.getChildAt(i));
        addToTable((DefaultMutableTreeNode) node.getChildAt(i));
    }

}//GEN-LAST:event_treeTreeExpanded

private void treeTreeCollapsed(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_treeTreeCollapsed
    DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
    ((DefaultTableModel) table.getModel()).getDataVector().clear();
    for (int i = 0; i < node.getChildCount(); i++) {
        addToTable((DefaultMutableTreeNode) node.getChildAt(i));
    }
}//GEN-LAST:event_treeTreeCollapsed

    private void checkNode(DefaultMutableTreeNode node) {
        DefaultMutableTreeNode rootFile = null;
        if (node == null) {
            return;
        }

        Object nodeInfo = node.getUserObject();
        if (nodeInfo instanceof String) {
            System.out.println(nodeInfo);
            File[] roots = File.listRoots();

            for (int i = 0; i < roots.length; ++i) {
                rootFile = new DefaultMutableTreeNode(new MyFile(roots[i]));
                top.add(rootFile);
            }
        }

        if ((node.getChildCount() == 0) && (nodeInfo instanceof MyFile) && (((MyFile) nodeInfo).isDirectory())) {
            File files[] = ((MyFile) nodeInfo).listFiles();
            if (files == null) {
                return;
            }

            for (File file : files) {
                MyFile f = new MyFile(file);
                rootFile = new DefaultMutableTreeNode(f);
                node.add(rootFile);
            }

        }

    }

    private void addToTable(DefaultMutableTreeNode dmn) {
        MyFile f = (MyFile) dmn.getUserObject();
        boolean add = false;
        if(chkShowDir.isSelected()){
            if(f.isDirectory()){
                add = true;
            }            
        }
        
        if(chkShowFiles.isSelected()){
            if(f.isFile()){
                add = true;
            }  
        }
        
        if(add){
            ((DefaultTableModel) table.getModel()).addRow(
                    new Object[]{true, f, ""});
        }
    }

    class MyFile extends File {

        public MyFile(File pathname) {
            super(pathname.getPath());
        }

        @Override
        public String toString() {
            String s = getName();
            return s.equals("") ? getPath() : s;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainJFrame().setVisible(true);
                File f = new File("");

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkShowDir;
    private javax.swing.JCheckBox chkShowFiles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables
}
