/*
 * MainJFrame.java
 *
 * Created on 8 de julio de 2008, 11:47
 */
package com.cartiec.jrenamer;

import java.io.File;
import java.util.ResourceBundle;
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
    ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/cartiec/jrenamer/MainJFrame");

    public MainJFrame() {

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
        fileBrowser = new com.cartiec.jrenamer.JFileBrowser();
        jPanel2 = new javax.swing.JPanel();
        tableView = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
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
        chkCaseReplace = new javax.swing.JCheckBox();
        txfDelim = new javax.swing.JTextField();
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
        chkShowDir = new javax.swing.JCheckBox();
        chkShowFiles = new javax.swing.JCheckBox();
        chkSelectAll = new javax.swing.JCheckBox();
        btnRename = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileBrowser.setPreferredSize(new java.awt.Dimension(150, 322));
        fileBrowser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fileBrowserPropertyChange(evt);
            }
        });
        getContentPane().add(fileBrowser, java.awt.BorderLayout.WEST);

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
        tableView.setViewportView(table);

        changeCasePanel.setLayout(new java.awt.GridBagLayout());

        spUpperFrom.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        changeCasePanel.add(spUpperFrom, gridBagConstraints);

        spUpperTo.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        changeCasePanel.add(spUpperTo, gridBagConstraints);

        spLowerFrom.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        changeCasePanel.add(spLowerFrom, gridBagConstraints);

        spLowerTo.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        changeCasePanel.add(spLowerTo, gridBagConstraints);

        lblFrom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/cartiec/jrenamer/MainJFrame"); // NOI18N
        lblFrom.setText(bundle.getString("desde")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        changeCasePanel.add(lblFrom, gridBagConstraints);

        lblTo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTo.setText(bundle.getString("hasta")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        changeCasePanel.add(lblTo, gridBagConstraints);

        btnGroupUpperLower.add(rbtnUppercase);
        rbtnUppercase.setText(bundle.getString("convertirAMayusculas")); // NOI18N
        rbtnUppercase.setLabel(bundle.getString("Convertir a Mayúsculas")); // NOI18N
        rbtnUppercase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 1, 0);
        changeCasePanel.add(rbtnUppercase, gridBagConstraints);

        btnGroupUpperLower.add(rbtnLowercase);
        rbtnLowercase.setText(bundle.getString("convertirAMinusculas")); // NOI18N
        rbtnLowercase.setLabel(bundle.getString("Convertir a Minúsculas")); // NOI18N
        rbtnLowercase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        changeCasePanel.add(rbtnLowercase, gridBagConstraints);

        btnGroupExtensions.add(rbtnUpperExtension);
        rbtnUpperExtension.setText(bundle.getString("extensionEnMayusculas")); // NOI18N
        rbtnUpperExtension.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnExtensionMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 1, 5);
        changeCasePanel.add(rbtnUpperExtension, gridBagConstraints);

        btnGroupExtensions.add(rbtnLowerExtension);
        rbtnLowerExtension.setText(bundle.getString("extensionEnMinusculas")); // NOI18N
        rbtnLowerExtension.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnExtensionMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
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
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        changeCasePanel.add(cmbCaseReplace, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        changeCasePanel.add(chkCaseReplace, gridBagConstraints);

        txfDelim.setText(" ");
        txfDelim.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        changeCasePanel.add(txfDelim, gridBagConstraints);

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

        spPosInsert.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
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

        spDeleteFrom.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
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

        spDeleteTo.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
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
            .addGap(0, 504, Short.MAX_VALUE)
        );
        patternsPanelLayout.setVerticalGroup(
            patternsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        tbPaneConversions.addTab(bundle.getString("patrones"), patternsPanel); // NOI18N

        btnPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/icons22x22/edit-find.png"))); // NOI18N
        btnPreview.setText(bundle.getString("vistaPrevia")); // NOI18N
        btnPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviewActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/icons22x22/edit-clear.png"))); // NOI18N
        btnReset.setText(bundle.getString("reiniciar")); // NOI18N
        btnReset.setToolTipText(bundle.getString("reiniciar")); // NOI18N
        btnReset.setMaximumSize(new java.awt.Dimension(23, 23));
        btnReset.setMinimumSize(new java.awt.Dimension(23, 23));
        btnReset.setPreferredSize(new java.awt.Dimension(50, 23));

        chkShowDir.setSelected(true);
        chkShowDir.setText(bundle.getString("mostrarDirectorios")); // NOI18N
        chkShowDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowDirFileActionPerformed(evt);
            }
        });

        chkShowFiles.setSelected(true);
        chkShowFiles.setText(bundle.getString("mostrarArchivos")); // NOI18N
        chkShowFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowDirFileActionPerformed(evt);
            }
        });

        chkSelectAll.setSelected(true);
        chkSelectAll.setText(bundle.getString("Seleccionar Todos")); // NOI18N
        chkSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSelectAllActionPerformed(evt);
            }
        });

        btnRename.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/icons22x22/document-save.png"))); // NOI18N
        btnRename.setText(bundle.getString("Renombrar")); // NOI18N
        btnRename.setToolTipText(bundle.getString("reiniciar")); // NOI18N
        btnRename.setMaximumSize(new java.awt.Dimension(23, 23));
        btnRename.setMinimumSize(new java.awt.Dimension(23, 23));
        btnRename.setPreferredSize(new java.awt.Dimension(50, 23));
        btnRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenameActionPerformed(evt);
            }
        });

        btnUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/icons22x22/edit-undo.png"))); // NOI18N
        btnUndo.setText(bundle.getString("Deshacer")); // NOI18N
        btnUndo.setToolTipText(bundle.getString("reiniciar")); // NOI18N
        btnUndo.setMaximumSize(new java.awt.Dimension(23, 23));
        btnUndo.setMinimumSize(new java.awt.Dimension(23, 23));
        btnUndo.setPreferredSize(new java.awt.Dimension(50, 23));
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPreview)
                                    .addComponent(chkSelectAll))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRename, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(chkShowDir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkShowFiles))))
                            .addComponent(tbPaneConversions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbPaneConversions, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreview)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRename, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkShowDir)
                    .addComponent(chkSelectAll)
                    .addComponent(chkShowFiles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableView, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-719)/2, (screenSize.height-527)/2, 719, 527);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviewActionPerformed
        previewTable();
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

    private void rbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnMouseClicked
        if (evt.getClickCount() > 1) {
            btnGroupUpperLower.clearSelection();
        }
    }//GEN-LAST:event_rbtnMouseClicked

    private void rbtnExtensionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnExtensionMouseClicked
        if (evt.getClickCount() > 1) {
            btnGroupExtensions.clearSelection();
        }
    }//GEN-LAST:event_rbtnExtensionMouseClicked

private void chkSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSelectAllActionPerformed
    checkRows(chkSelectAll.isSelected());
}//GEN-LAST:event_chkSelectAllActionPerformed

private void chkShowDirFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowDirFileActionPerformed
    refreshTable();
}//GEN-LAST:event_chkShowDirFileActionPerformed

private void btnRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenameActionPerformed
    renameFiles();
}//GEN-LAST:event_btnRenameActionPerformed

private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
}//GEN-LAST:event_btnUndoActionPerformed
    
    /**
     * Add new row to rable
     * @param f
     */
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
    private void previewTable() {
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
                    newName = renameItem(file.getName());
                    data.get(i).set(2, newName);
                }
            }
            i++;
        }
        ((DefaultTableModel) table.getModel()).fireTableDataChanged();
    }
    
    private void renameFiles() {
        Vector<Vector> data = ((DefaultTableModel) table.getModel()).getDataVector();
        Boolean check;
        File file;
        File fileNewName;
        String newName;
        int i = 0;
        for (Vector objects : data) {
            if (objects != null) {
                check = (Boolean) objects.get(0);
                file = (File) objects.get(1);
                newName = (String)objects.get(2);
                if (check) {
                    fileNewName = new File(file.getParent()+ File.separator + newName);
                    file.renameTo(fileNewName);
                }
            }
            i++;
        }
        ((DefaultTableModel) table.getModel()).fireTableDataChanged();
    }
    
    private void checkRows(boolean value){
        Vector<Vector> data = ((DefaultTableModel) table.getModel()).getDataVector();
        Boolean check;
        File file;
        String newName;
        int i = 0;
        for (Vector objects : data) {
            data.get(i).set(0, value);
            i++;
        }
        ((DefaultTableModel) table.getModel()).fireTableDataChanged();
    }
    
    private void refreshTable(){
        ((DefaultTableModel) table.getModel()).getDataVector().clear();
        File f = fileBrowser.getSelectetFile();
        if (f != null) {
            File[] files =  f.listFiles();
            for (File myFile : files) {
                addToTable(myFile);
            }
        }
    }

    private String renameItem(String str) {
        if(rbtnUppercase.isSelected()){
            str = Renamer.toUpperCase(str, (Integer)spUpperFrom.getValue(), (Integer)spUpperTo.getValue());
        }
        
        if(rbtnLowercase.isSelected()){
            str = Renamer.toLowerCase(str, (Integer)spLowerFrom.getValue(), (Integer)spLowerTo.getValue());
        }
        
        if(chkCaseReplace.isSelected()){
            Object o = cmbCaseReplace.getSelectedItem();
            
            if(bundle.getString("todasEnMayusculas").equals(o)){ 
                str = str.toUpperCase();
            }
            else if(bundle.getString("todasEnMinusculas").equals(o)){ 
                str = str.toLowerCase();
            }
            else if(bundle.getString("primeraLetraMayusculas").equals(o)){ 
                str = Renamer.toFirstLetterUppercase(str);
            }
            else if(bundle.getString("primeraLetraDeCadaPalabraEnMayusculas").equals(o)){ 
                str = Renamer.toFirstLetterWordUppercase(str, txfDelim.getText());
            }
        }

        if(rbtnUpperExtension.isSelected()){
            str = Renamer.toExtensionUppercase(str);
        }
        
        if(rbtnLowerExtension.isSelected()){
            str = Renamer.toExtensionLowercase(str);
        }
        
        return str;
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
    private javax.swing.JButton btnRename;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUndo;
    private javax.swing.JPanel changeCasePanel;
    private javax.swing.JCheckBox chkAccents;
    private javax.swing.JCheckBox chkCaseReplace;
    private javax.swing.JCheckBox chkDeleteBrackets;
    private javax.swing.JCheckBox chkDeleteChars;
    private javax.swing.JCheckBox chkDeleteFrom;
    private javax.swing.JCheckBox chkDeleteMoreOneSpaces;
    private javax.swing.JCheckBox chkDeleteToEnd;
    private javax.swing.JCheckBox chkEnies;
    private javax.swing.JCheckBox chkInsert;
    private javax.swing.JCheckBox chkInsertEnd;
    private javax.swing.JCheckBox chkReplace;
    private javax.swing.JCheckBox chkSelectAll;
    private javax.swing.JCheckBox chkShowDir;
    private javax.swing.JCheckBox chkShowFiles;
    private javax.swing.JCheckBox chkSpaces;
    private javax.swing.JComboBox cmbCaseReplace;
    private javax.swing.JComboBox cmbSpaces;
    private javax.swing.JPanel eniesPanel;
    private com.cartiec.jrenamer.JFileBrowser fileBrowser;
    private javax.swing.JPanel insertDeletePanel;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JScrollPane tableView;
    private javax.swing.JTabbedPane tbPaneConversions;
    private javax.swing.JTextField txfDelete;
    private javax.swing.JTextField txfDelim;
    private javax.swing.JTextField txfInsert;
    private javax.swing.JTextField txfReplaceThis;
    // End of variables declaration//GEN-END:variables
}
