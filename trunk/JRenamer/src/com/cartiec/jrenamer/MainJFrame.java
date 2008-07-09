/*
 * MainJFrame.java
 *
 * Created on 8 de julio de 2008, 11:47
 */
package com.cartiec.jrenamer;

import java.io.File;
import javax.swing.DefaultComboBoxModel;
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
    
    DefaultComboBoxModel cmbCaseReplaceModel = null;

    /** Creates new form MainJFrame */
    public MainJFrame() {
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/cartiec/jrenamer/MainJFrame"); // NOI18N
        cmbCaseReplaceModel = new javax.swing.DefaultComboBoxModel(
                new String[] { 
            bundle.getString("todasEnMayusculas"), 
            bundle.getString("todasEnMinusculas"),
            bundle.getString("primeraLetraMayusculas"),
            bundle.getString("primeraLetraDeCadaPalabraEnMayusculas") }
        );
        
        initComponents();

        TableColumn column = table.getColumn("Seleccionar");
        column.setMinWidth(20);
        column.setPreferredWidth(70);
        column.setMaxWidth(70);        
        table.getTableHeader().setReorderingAllowed(false);


        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setLeafIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/document-properties.png")));
        renderer.setOpenIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/document-open.png")));
        renderer.setClosedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/folder-new.png")));
        tree.setCellRenderer(renderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnGroupUpperLower = new javax.swing.ButtonGroup();
        btnGroupExtensions = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tree =  new JTree(top);
        jPanel1 = new javax.swing.JPanel();
        chkShowDir = new javax.swing.JCheckBox();
        chkShowFiles = new javax.swing.JCheckBox();
        tbPaneConversions = new javax.swing.JTabbedPane();
        changeCasePanel = new javax.swing.JPanel();
        spUpperFrom = new javax.swing.JSpinner();
        spUpperTo = new javax.swing.JSpinner();
        spLowerFrom = new javax.swing.JSpinner();
        spLowerTo = new javax.swing.JSpinner();
        lblFrom = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        rbtnUppercase = new javax.swing.JRadioButton();
        rbtnLowercase = new javax.swing.JRadioButton();
        btnReset = new javax.swing.JButton();
        rbtnUpperExtension = new javax.swing.JRadioButton();
        rbtnLowerExtension = new javax.swing.JRadioButton();
        cmbCaseReplace = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        chkAccents = new javax.swing.JCheckBox();
        replacePanel = new javax.swing.JPanel();

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
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/cartiec/jrenamer/MainJFrame"); // NOI18N
        chkShowDir.setText(bundle.getString("mostrarDirectorios")); // NOI18N

        chkShowFiles.setSelected(true);
        chkShowFiles.setText(bundle.getString("mostrarArchivos")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkShowDir)
                .addGap(18, 18, 18)
                .addComponent(chkShowFiles)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(chkShowDir)
                .addComponent(chkShowFiles))
        );

        changeCasePanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        changeCasePanel.add(spUpperFrom, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        changeCasePanel.add(spUpperTo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        changeCasePanel.add(spLowerFrom, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        changeCasePanel.add(spLowerTo, gridBagConstraints);

        lblFrom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrom.setText(bundle.getString("desde")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        changeCasePanel.add(lblFrom, gridBagConstraints);

        lblTo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTo.setText(bundle.getString("hasta")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        changeCasePanel.add(lblTo, gridBagConstraints);

        btnGroupUpperLower.add(rbtnUppercase);
        rbtnUppercase.setText(bundle.getString("convertirAMayusculas")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 1, 0);
        changeCasePanel.add(rbtnUppercase, gridBagConstraints);

        btnGroupUpperLower.add(rbtnLowercase);
        rbtnLowercase.setText(bundle.getString("convertirAMinusculas")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        changeCasePanel.add(rbtnLowercase, gridBagConstraints);

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/edit-undo.png"))); // NOI18N
        btnReset.setToolTipText(bundle.getString("reiniciar")); // NOI18N
        btnReset.setMaximumSize(new java.awt.Dimension(23, 23));
        btnReset.setMinimumSize(new java.awt.Dimension(23, 23));
        btnReset.setPreferredSize(new java.awt.Dimension(23, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 0, 0);
        changeCasePanel.add(btnReset, gridBagConstraints);

        btnGroupExtensions.add(rbtnUpperExtension);
        rbtnUpperExtension.setText(bundle.getString("extensionEnMayusculas")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 1, 5);
        changeCasePanel.add(rbtnUpperExtension, gridBagConstraints);

        btnGroupExtensions.add(rbtnLowerExtension);
        rbtnLowerExtension.setText(bundle.getString("extensionEnMinusculas")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        changeCasePanel.add(rbtnLowerExtension, gridBagConstraints);

        cmbCaseReplace.setModel(cmbCaseReplaceModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        changeCasePanel.add(cmbCaseReplace, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        changeCasePanel.add(jCheckBox1, gridBagConstraints);

        chkAccents.setText(bundle.getString("eliminarAcentos")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        changeCasePanel.add(chkAccents, gridBagConstraints);

        tbPaneConversions.addTab(bundle.getString("mayusculasMinusculas"), changeCasePanel); // NOI18N

        replacePanel.setLayout(new java.awt.GridBagLayout());
        tbPaneConversions.addTab(bundle.getString("reemplazar"), replacePanel); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbPaneConversions, javax.swing.GroupLayout.PREFERRED_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tbPaneConversions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-671)/2, (screenSize.height-510)/2, 671, 510);
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
    private javax.swing.ButtonGroup btnGroupExtensions;
    private javax.swing.ButtonGroup btnGroupUpperLower;
    private javax.swing.JButton btnReset;
    private javax.swing.JPanel changeCasePanel;
    private javax.swing.JCheckBox chkAccents;
    private javax.swing.JCheckBox chkShowDir;
    private javax.swing.JCheckBox chkShowFiles;
    private javax.swing.JComboBox cmbCaseReplace;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblTo;
    private javax.swing.JRadioButton rbtnLowerExtension;
    private javax.swing.JRadioButton rbtnLowercase;
    private javax.swing.JRadioButton rbtnUpperExtension;
    private javax.swing.JRadioButton rbtnUppercase;
    private javax.swing.JPanel replacePanel;
    private javax.swing.JSpinner spLowerFrom;
    private javax.swing.JSpinner spLowerTo;
    private javax.swing.JSpinner spUpperFrom;
    private javax.swing.JSpinner spUpperTo;
    private javax.swing.JTable table;
    private javax.swing.JTabbedPane tbPaneConversions;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables
}
