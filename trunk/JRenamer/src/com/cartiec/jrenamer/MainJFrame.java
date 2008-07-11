/*
 * MainJFrame.java
 *
 * Created on 8 de julio de 2008, 11:47
 */
package com.cartiec.jrenamer;

import java.io.File;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author  Tonny
 */
public class MainJFrame extends javax.swing.JFrame {

    DefaultComboBoxModel cmbCaseReplaceModel = null;
    DefaultComboBoxModel cmbSpacesModel = null;
    FilesCellRenderer fcrenderer = new FilesCellRenderer();

    public MainJFrame() {
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/cartiec/jrenamer/MainJFrame");
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
        table.setDefaultRenderer(String.class, fcrenderer);
        table.setDefaultRenderer(Boolean.class, fcrenderer);
        table.setDefaultRenderer(Object.class, fcrenderer);
        

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
        fileBrowser = new com.cartiec.jrenamer.JFileBrowser();

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
                .addContainerGap(264, Short.MAX_VALUE))
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
            .addGap(0, 507, Short.MAX_VALUE)
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

        fileBrowser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fileBrowserPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fileBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addComponent(tbPaneConversions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
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
                    .addComponent(fileBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
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

private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviewActionPerformed
    processTable();
}//GEN-LAST:event_btnPreviewActionPerformed

private void fileBrowserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fileBrowserPropertyChange
    if (evt.getPropertyName().equals(JFileBrowser.MOUSE_CLICKED)) {
        ((DefaultTableModel) table.getModel()).getDataVector().clear();
        Object uo = evt.getNewValue();
        if (uo instanceof File) {
            File[] files = ((File) uo).listFiles();
            for (File myFile : files) {
                addToTable(myFile);
            }
        }
    }
}//GEN-LAST:event_fileBrowserPropertyChange
    
    private void addToTable(File f) {
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

    /**
     * Loop table data - new Object[]{boolean, MyFile, String}
     */
    private void processTable() {
        Vector<Vector> data = ((DefaultTableModel) table.getModel()).getDataVector();
        Boolean check;
        File file;
        String newName;
        int i = 0;
        for (Vector objects : data) {
            if (objects != null) {
                check = (Boolean) objects.get(0);
                file = (File) objects.get(1);
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
    private com.cartiec.jrenamer.JFileBrowser fileBrowser;
    private javax.swing.JPanel insertDeletePanel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField txfDelete;
    private javax.swing.JTextField txfInsert;
    private javax.swing.JTextField txfReplaceThis;
    // End of variables declaration//GEN-END:variables
}
