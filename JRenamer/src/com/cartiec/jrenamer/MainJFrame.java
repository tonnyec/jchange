/*
 * MainJFrame.java
 *
 * Created on 8 de julio de 2008, 11:47
 */
package com.cartiec.jrenamer;

import java.io.File;
import java.util.Vector;
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

    DefaultMutableTreeNode top = null;
    DefaultComboBoxModel cmbCaseReplaceModel = null;
    DefaultComboBoxModel cmbSpacesModel = null;
    
    public MainJFrame() {
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/cartiec/jrenamer/MainJFrame"); // NOI18N
        
        top = new DefaultMutableTreeNode(bundle.getString("raiz"));
        cmbCaseReplaceModel = new javax.swing.DefaultComboBoxModel(
                new String[]{
                    bundle.getString("todasEnMayusculas"),
                    bundle.getString("todasEnMinusculas"),
                    bundle.getString("primeraLetraMayusculas"),
                    bundle.getString("primeraLetraDeCadaPalabraEnMayusculas")
                });
        
        cmbSpacesModel = new javax.swing.DefaultComboBoxModel(
                new String[]{
                    bundle.getString("espaciosAGuionesBajos"),
                    bundle.getString("guionesBajosAEspacios"),
                    bundle.getString("espaciosAPuntos"),
                    bundle.getString("puntosAEspacios"),
                    bundle.getString("espaciosAGuiones"),
                    bundle.getString("guionesAEspacios")
                });
               
                
        initComponents();
        
        //Table
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setMinWidth(20);
        column.setPreferredWidth(70);
        column.setMaxWidth(70);
        table.getTableHeader().setReorderingAllowed(false);
        
        //Tree
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setLeafIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/folder.png")));
        renderer.setOpenIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/document-open.png")));
        renderer.setClosedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/folder.png")));
        tree.setCellRenderer(renderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnGroupUpperLower = new javax.swing.ButtonGroup();
        btnGroupExtensions = new javax.swing.ButtonGroup();
        btnGroupEnies = new javax.swing.ButtonGroup();
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
        rbtnUpperExtension = new javax.swing.JRadioButton();
        rbtnLowerExtension = new javax.swing.JRadioButton();
        cmbCaseReplace = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        replacePanel = new javax.swing.JPanel();
        chkReplace = new javax.swing.JCheckBox();
        txfReplaceThis = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        lblWith = new javax.swing.JLabel();
        chkSpaces = new javax.swing.JCheckBox();
        cmbSpaces = new javax.swing.JComboBox();
        chkAccents = new javax.swing.JCheckBox();
        eniesPanel = new javax.swing.JPanel();
        chkEnies = new javax.swing.JCheckBox();
        rbtnNi = new javax.swing.JRadioButton();
        rbtnN = new javax.swing.JRadioButton();
        insertDeletePanel = new javax.swing.JPanel();
        chkInsert = new javax.swing.JCheckBox();
        txfInsert = new javax.swing.JTextField();
        lblIn = new javax.swing.JLabel();
        spPosInsert = new javax.swing.JSpinner();
        chkInsertEnd = new javax.swing.JCheckBox();
        chkDeleteFrom = new javax.swing.JCheckBox();
        spDeleteFrom = new javax.swing.JSpinner();
        lblDeleteTo = new javax.swing.JLabel();
        spDeleteTo = new javax.swing.JSpinner();
        chkDeleteToEnd = new javax.swing.JCheckBox();
        chkDeleteChars = new javax.swing.JCheckBox();
        txfDelete = new javax.swing.JTextField();
        chkDeleteBrackets = new javax.swing.JCheckBox();
        chkDeleteMoreOneSpaces = new javax.swing.JCheckBox();
        patternsPanel = new javax.swing.JPanel();
        btnPreview = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

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
        tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeMouseClicked(evt);
            }
        });
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

        tbPaneConversions.addTab(bundle.getString("mayusculasMinusculas"), changeCasePanel); // NOI18N

        replacePanel.setLayout(new java.awt.GridBagLayout());

        chkReplace.setText(bundle.getString("reemplazar")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        replacePanel.add(chkReplace, gridBagConstraints);

        txfReplaceThis.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        replacePanel.add(txfReplaceThis, gridBagConstraints);

        jTextField2.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        replacePanel.add(jTextField2, gridBagConstraints);

        lblWith.setText(bundle.getString("con")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        replacePanel.add(lblWith, gridBagConstraints);

        chkSpaces.setText(bundle.getString("espacios")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        replacePanel.add(chkSpaces, gridBagConstraints);

        cmbSpaces.setModel(cmbSpacesModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        replacePanel.add(cmbSpaces, gridBagConstraints);

        chkAccents.setText(bundle.getString("Reemplazar Acentos")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        replacePanel.add(chkAccents, gridBagConstraints);

        chkEnies.setText(bundle.getString("reemplazarEnies")); // NOI18N
        eniesPanel.add(chkEnies);

        btnGroupEnies.add(rbtnNi);
        rbtnNi.setSelected(true);
        rbtnNi.setText("ni");
        eniesPanel.add(rbtnNi);

        btnGroupEnies.add(rbtnN);
        rbtnN.setText("n");
        eniesPanel.add(rbtnN);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        replacePanel.add(eniesPanel, gridBagConstraints);

        tbPaneConversions.addTab(bundle.getString("reemplazar"), replacePanel); // NOI18N

        insertDeletePanel.setLayout(new java.awt.GridBagLayout());

        chkInsert.setText(bundle.getString("insertar")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        insertDeletePanel.add(chkInsert, gridBagConstraints);

        txfInsert.setPreferredSize(new java.awt.Dimension(70, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        insertDeletePanel.add(txfInsert, gridBagConstraints);

        lblIn.setText(bundle.getString("en")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        insertDeletePanel.add(lblIn, gridBagConstraints);

        spPosInsert.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        insertDeletePanel.add(spPosInsert, gridBagConstraints);

        chkInsertEnd.setText(bundle.getString("o al final")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        insertDeletePanel.add(chkInsertEnd, gridBagConstraints);

        chkDeleteFrom.setText(bundle.getString("Eliminar desde")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        insertDeletePanel.add(chkDeleteFrom, gridBagConstraints);

        spDeleteFrom.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        insertDeletePanel.add(spDeleteFrom, gridBagConstraints);

        lblDeleteTo.setText(bundle.getString("hasta")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        insertDeletePanel.add(lblDeleteTo, gridBagConstraints);

        spDeleteTo.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        insertDeletePanel.add(spDeleteTo, gridBagConstraints);

        chkDeleteToEnd.setText(bundle.getString("o hasta el final")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        insertDeletePanel.add(chkDeleteToEnd, gridBagConstraints);

        chkDeleteChars.setText(bundle.getString("Eliminar todo")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        insertDeletePanel.add(chkDeleteChars, gridBagConstraints);

        txfDelete.setPreferredSize(new java.awt.Dimension(70, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        insertDeletePanel.add(txfDelete, gridBagConstraints);

        chkDeleteBrackets.setText(bundle.getString("Eliminar parentesis")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        insertDeletePanel.add(chkDeleteBrackets, gridBagConstraints);

        chkDeleteMoreOneSpaces.setText(bundle.getString("Eliminar espacios dobles")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        insertDeletePanel.add(chkDeleteMoreOneSpaces, gridBagConstraints);

        tbPaneConversions.addTab(bundle.getString("Insertar/Eliminar"), insertDeletePanel); // NOI18N

        javax.swing.GroupLayout patternsPanelLayout = new javax.swing.GroupLayout(patternsPanel);
        patternsPanel.setLayout(patternsPanelLayout);
        patternsPanelLayout.setHorizontalGroup(
            patternsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );
        patternsPanelLayout.setVerticalGroup(
            patternsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        tbPaneConversions.addTab(bundle.getString("patrones"), patternsPanel); // NOI18N

        btnPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/edit-find.png"))); // NOI18N
        btnPreview.setText(bundle.getString("vistaPrevia")); // NOI18N
        btnPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviewActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/edit-undo.png"))); // NOI18N
        btnReset.setText(bundle.getString("reiniciar")); // NOI18N
        btnReset.setToolTipText(bundle.getString("reiniciar")); // NOI18N
        btnReset.setMaximumSize(new java.awt.Dimension(23, 23));
        btnReset.setMinimumSize(new java.awt.Dimension(23, 23));
        btnReset.setPreferredSize(new java.awt.Dimension(23, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(tbPaneConversions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnPreview)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tbPaneConversions, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(btnPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }
}//GEN-LAST:event_treeTreeExpanded

private void treeTreeCollapsed(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_treeTreeCollapsed
}//GEN-LAST:event_treeTreeCollapsed

private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviewActionPerformed
    processTable();
}//GEN-LAST:event_btnPreviewActionPerformed

private void treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeMouseClicked
    DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
    ((DefaultTableModel) table.getModel()).getDataVector().clear();

    Object uo = node.getUserObject();

    if (uo instanceof MyFile) {
        MyFile[] files = ((MyFile) uo).listFiles();
        for (MyFile myFile : files) {
            addToTable(myFile);
        }
    }
}//GEN-LAST:event_treeMouseClicked

    private void checkNode(DefaultMutableTreeNode node) {
        DefaultMutableTreeNode rootFile = null;
        if (node == null) {
            return;
        }

        Object nodeInfo = node.getUserObject();
        if (nodeInfo instanceof String) {
            File[] roots = File.listRoots();
            if (top.getChildCount() == 0) {
                for (int i = 0; i < roots.length; ++i) {
                    rootFile = new DefaultMutableTreeNode(new MyFile(roots[i]));
                    if (roots[i].isDirectory()) {
                        top.add(rootFile);
                    }
                }
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
                if (f.isDirectory()) {
                    node.add(rootFile);
                }
            }

        }

    }

    private void addToTable(MyFile f) {
        boolean add = false;
        if (chkShowDir.isSelected()) {
            if (f.isDirectory()) {
                add = true;
            }
        }

        if (chkShowFiles.isSelected()) {
            if (f.isFile()) {
                add = true;
            }
        }

        if (add) {
            ((DefaultTableModel) table.getModel()).addRow(
                    new Object[]{true, f, ""});
        }
    }

    class MyFile extends File {

        public MyFile(File pathname) {
            super(pathname.getPath());
        }
        
        public MyFile(String parent, String child) {
            super(parent,child);
        }
        


        @Override
        public String toString() {
            String s = getName();
            return s.equals("") ? getPath() : s;
        }

        @Override
        public MyFile[] listFiles() {
            String[] ss = list();
            if (ss == null) {
                return null;
            }
            int n = ss.length;
            MyFile[] fs = new MyFile[n];
            for (int i = 0; i < n; i++) {
                fs[i] = new MyFile(this.getPath(),ss[i]);
            }
            return fs;
        }
    }

    /**
     * Loop table data - new Object[]{boolean, MyFile, String}
     */
    private void processTable() {
        Vector<Vector> data = ((DefaultTableModel) table.getModel()).getDataVector();
        Boolean check;
        MyFile file;
        String newName;
        int i = 0;
        for (Vector objects : data) {
            if (objects != null) {
                check = (Boolean) objects.get(0);
                file = (MyFile) objects.get(1);
                if (check) {
                    newName = renameItem(file.toString());
                    data.get(i).set(2, newName);
                }
            }
            i++;
        }
        ((DefaultTableModel) table.getModel()).fireTableDataChanged();
    }

    private String renameItem(String str) {
        return str.toUpperCase();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupEnies;
    private javax.swing.ButtonGroup btnGroupExtensions;
    private javax.swing.ButtonGroup btnGroupUpperLower;
    private javax.swing.JButton btnPreview;
    private javax.swing.JButton btnReset;
    private javax.swing.JPanel changeCasePanel;
    private javax.swing.JCheckBox chkAccents;
    private javax.swing.JCheckBox chkDeleteBrackets;
    private javax.swing.JCheckBox chkDeleteChars;
    private javax.swing.JCheckBox chkDeleteFrom;
    private javax.swing.JCheckBox chkDeleteMoreOneSpaces;
    private javax.swing.JCheckBox chkDeleteToEnd;
    private javax.swing.JCheckBox chkEnies;
    private javax.swing.JCheckBox chkInsert;
    private javax.swing.JCheckBox chkInsertEnd;
    private javax.swing.JCheckBox chkReplace;
    private javax.swing.JCheckBox chkShowDir;
    private javax.swing.JCheckBox chkShowFiles;
    private javax.swing.JCheckBox chkSpaces;
    private javax.swing.JComboBox cmbCaseReplace;
    private javax.swing.JComboBox cmbSpaces;
    private javax.swing.JPanel eniesPanel;
    private javax.swing.JPanel insertDeletePanel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDeleteTo;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblIn;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblWith;
    private javax.swing.JPanel patternsPanel;
    private javax.swing.JRadioButton rbtnLowerExtension;
    private javax.swing.JRadioButton rbtnLowercase;
    private javax.swing.JRadioButton rbtnN;
    private javax.swing.JRadioButton rbtnNi;
    private javax.swing.JRadioButton rbtnUpperExtension;
    private javax.swing.JRadioButton rbtnUppercase;
    private javax.swing.JPanel replacePanel;
    private javax.swing.JSpinner spDeleteFrom;
    private javax.swing.JSpinner spDeleteTo;
    private javax.swing.JSpinner spLowerFrom;
    private javax.swing.JSpinner spLowerTo;
    private javax.swing.JSpinner spPosInsert;
    private javax.swing.JSpinner spUpperFrom;
    private javax.swing.JSpinner spUpperTo;
    private javax.swing.JTable table;
    private javax.swing.JTabbedPane tbPaneConversions;
    private javax.swing.JTree tree;
    private javax.swing.JTextField txfDelete;
    private javax.swing.JTextField txfInsert;
    private javax.swing.JTextField txfReplaceThis;
    // End of variables declaration//GEN-END:variables
}
