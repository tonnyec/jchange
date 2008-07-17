/*
 * MainJFrame.java
 *
 * Created on 8 de julio de 2008, 11:47
 */
package com.cartiec.jrenamer;

import com.cartiec.jrenamer.tags.TagID3;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author  Tonny
 */
public class MainJFrame extends javax.swing.JFrame {

    public static Logger LOG = Logger.getLogger("log.txt");
    HashMap<File, File> filesRenamed = new HashMap<File, File>();
    DefaultComboBoxModel cmbCaseReplaceModel = null;
    DefaultComboBoxModel cmbSpacesModel = null;
    FilesCellRenderer fcrenderer = new FilesCellRenderer();
    ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/cartiec/jrenamer/MainJFrame");

    public MainJFrame() {

        try {
            FileHandler logFile = new FileHandler("log.txt");
            logFile.setFormatter(new SimpleFormatter());
            LOG.addHandler(logFile);
            LOG.info("Inicia la aplicacion");

        } catch (IOException ex) {
            LOG.log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }

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
        popupMenu = new javax.swing.JPopupMenu();
        fileBrowser = new com.cartiec.jrenamer.JFileBrowser();
        centerPane = new javax.swing.JPanel();
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
        txfReplaceWith = new javax.swing.JTextField();
        lblWith = new javax.swing.JLabel();
        chkSpaces = new javax.swing.JCheckBox();
        cmbSpaces = new javax.swing.JComboBox();
        chkAccents = new javax.swing.JCheckBox();
        eniesPanel = new javax.swing.JPanel();
        chkEnies = new javax.swing.JCheckBox();
        rbtnNi = new javax.swing.JRadioButton();
        rbtnN = new javax.swing.JRadioButton();
        insertPanel = new javax.swing.JPanel();
        chkInsert = new javax.swing.JCheckBox();
        txfInsert = new javax.swing.JTextField();
        lblIn = new javax.swing.JLabel();
        spPosInsert = new javax.swing.JSpinner();
        chkInsertEnd = new javax.swing.JCheckBox();
        chkInsertNumbers = new javax.swing.JCheckBox();
        lblNumberIn = new javax.swing.JLabel();
        spPosAutoNumber = new javax.swing.JSpinner();
        lblStartAutoNumber = new javax.swing.JLabel();
        spStartAutoNumber = new javax.swing.JSpinner();
        chkEqualLenDigits = new javax.swing.JCheckBox();
        deletePanel = new javax.swing.JPanel();
        chkDeleteFrom = new javax.swing.JCheckBox();
        spDeleteFrom = new javax.swing.JSpinner();
        lblDeleteTo = new javax.swing.JLabel();
        spDeleteTo = new javax.swing.JSpinner();
        chkDeleteToEnd = new javax.swing.JCheckBox();
        chkDeleteChars = new javax.swing.JCheckBox();
        chkDeleteBrackets = new javax.swing.JCheckBox();
        chkDeleteMoreOneSpaces = new javax.swing.JCheckBox();
        txfDelete = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        chkShowTag = new javax.swing.JCheckBox();
        btnPreview = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        chkShowDir = new javax.swing.JCheckBox();
        chkShowFiles = new javax.swing.JCheckBox();
        chkSelectAll = new javax.swing.JCheckBox();
        btnRename = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();
        txfExtension = new javax.swing.JTextField();
        lblExtension = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JRenamer");

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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
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

        txfReplaceWith.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        replacePanel.add(txfReplaceWith, gridBagConstraints);

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

        insertPanel.setLayout(new java.awt.GridBagLayout());

        chkInsert.setText(bundle.getString("insertar")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        insertPanel.add(chkInsert, gridBagConstraints);

        txfInsert.setPreferredSize(new java.awt.Dimension(70, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        insertPanel.add(txfInsert, gridBagConstraints);

        lblIn.setText(bundle.getString("en")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        insertPanel.add(lblIn, gridBagConstraints);

        spPosInsert.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spPosInsert.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        insertPanel.add(spPosInsert, gridBagConstraints);

        chkInsertEnd.setText(bundle.getString("o al final")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        insertPanel.add(chkInsertEnd, gridBagConstraints);

        chkInsertNumbers.setText(bundle.getString("Insertar Números")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        insertPanel.add(chkInsertNumbers, gridBagConstraints);

        lblNumberIn.setText(bundle.getString("en")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        insertPanel.add(lblNumberIn, gridBagConstraints);

        spPosAutoNumber.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spPosAutoNumber.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        insertPanel.add(spPosAutoNumber, gridBagConstraints);

        lblStartAutoNumber.setText(bundle.getString("iniciar en")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        insertPanel.add(lblStartAutoNumber, gridBagConstraints);

        spStartAutoNumber.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spStartAutoNumber.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        insertPanel.add(spStartAutoNumber, gridBagConstraints);

        chkEqualLenDigits.setText(bundle.getString("crear siempre con digitos iguales")); // NOI18N
        chkEqualLenDigits.setToolTipText("<html>\n01, 02, 03<br>\n001, 002, 003\n</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        insertPanel.add(chkEqualLenDigits, gridBagConstraints);

        tbPaneConversions.addTab(bundle.getString("Insertar"), insertPanel); // NOI18N

        deletePanel.setLayout(new java.awt.GridBagLayout());

        chkDeleteFrom.setText(bundle.getString("Eliminar desde")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        deletePanel.add(chkDeleteFrom, gridBagConstraints);

        spDeleteFrom.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spDeleteFrom.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        deletePanel.add(spDeleteFrom, gridBagConstraints);

        lblDeleteTo.setText(bundle.getString("hasta")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        deletePanel.add(lblDeleteTo, gridBagConstraints);

        spDeleteTo.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spDeleteTo.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        deletePanel.add(spDeleteTo, gridBagConstraints);

        chkDeleteToEnd.setText(bundle.getString("o hasta el final")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        deletePanel.add(chkDeleteToEnd, gridBagConstraints);

        chkDeleteChars.setText(bundle.getString("Eliminar todo")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        deletePanel.add(chkDeleteChars, gridBagConstraints);

        chkDeleteBrackets.setText(bundle.getString("Eliminar parentesis")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        deletePanel.add(chkDeleteBrackets, gridBagConstraints);

        chkDeleteMoreOneSpaces.setText(bundle.getString("Eliminar espacios dobles")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 0);
        deletePanel.add(chkDeleteMoreOneSpaces, gridBagConstraints);

        txfDelete.setPreferredSize(new java.awt.Dimension(70, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        deletePanel.add(txfDelete, gridBagConstraints);

        tbPaneConversions.addTab(bundle.getString("Eliminar"), deletePanel); // NOI18N

        jPanel1.setLayout(new java.awt.GridBagLayout());

        chkShowTag.setText(bundle.getString("Mostrar Tags con un clic")); // NOI18N
        jPanel1.add(chkShowTag, new java.awt.GridBagConstraints());

        tbPaneConversions.addTab(bundle.getString("Música"), jPanel1); // NOI18N

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
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

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

        chkSelectAll.setText(bundle.getString("Seleccionar Todos")); // NOI18N
        chkSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSelectAllActionPerformed(evt);
            }
        });

        btnRename.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cartiec/jrenamer/res/icons22x22/document-save.png"))); // NOI18N
        btnRename.setText(bundle.getString("Renombrar")); // NOI18N
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
        btnUndo.setMaximumSize(new java.awt.Dimension(23, 23));
        btnUndo.setMinimumSize(new java.awt.Dimension(23, 23));
        btnUndo.setPreferredSize(new java.awt.Dimension(50, 23));
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });

        txfExtension.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfExtensionMouseClicked(evt);
            }
        });
        txfExtension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfExtensionKeyReleased(evt);
            }
        });

        lblExtension.setText(bundle.getString("extensión")); // NOI18N

        javax.swing.GroupLayout centerPaneLayout = new javax.swing.GroupLayout(centerPane);
        centerPane.setLayout(centerPaneLayout);
        centerPaneLayout.setHorizontalGroup(
            centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, centerPaneLayout.createSequentialGroup()
                            .addGroup(centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnPreview)
                                .addComponent(chkSelectAll))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(centerPaneLayout.createSequentialGroup()
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRename, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(centerPaneLayout.createSequentialGroup()
                                    .addComponent(chkShowDir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(chkShowFiles)))
                            .addGroup(centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(centerPaneLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(lblExtension)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txfExtension, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addGroup(centerPaneLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnUndo, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))
                        .addComponent(tbPaneConversions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        centerPaneLayout.setVerticalGroup(
            centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbPaneConversions, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreview)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRename, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUndo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkShowDir)
                    .addComponent(chkSelectAll)
                    .addComponent(chkShowFiles)
                    .addComponent(lblExtension)
                    .addComponent(txfExtension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableView, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(centerPane, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-763)/2, (screenSize.height-527)/2, 763, 527);
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
        if (JOptionPane.showConfirmDialog(this, bundle.getString("confirmaRenombrar"), getTitle(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            renameFiles();
        }
    }//GEN-LAST:event_btnRenameActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
		if (JOptionPane.showConfirmDialog(this, bundle.getString("confirmarDeshacer"), getTitle(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {//GEN-LAST:event_btnUndoActionPerformed
            deshacer();
        }
    }

    private void txfExtensionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfExtensionKeyReleased
        refreshTable();
    }//GEN-LAST:event_txfExtensionKeyReleased

    private void txfExtensionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfExtensionMouseClicked
        txfExtension.selectAll();
    }//GEN-LAST:event_txfExtensionMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        restartControls();
    }//GEN-LAST:event_btnResetActionPerformed

private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    if (chkShowTag.isSelected()) {
        int r = table.getSelectedRow();
        File f = (File) ((DefaultTableModel) table.getModel()).getValueAt(r, 1);
        TagID3 tag = new TagID3();
        tag.readTags(f);
        TagJPanel tagJPanel = new TagJPanel();
        if(tagJPanel.load(tag)){
            popupMenu.removeAll();
            popupMenu.add(tagJPanel);
            popupMenu.show(table, evt.getX() + 15 , 
                    evt.getY() );
        }
    }
}//GEN-LAST:event_tableMouseClicked
    
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
        if(chkShowFiles.isSelected() && (txfExtension.getText().length() > 0)){
            if (f.isFile()) {
                String n = f.getName();
                add = n.endsWith(txfExtension.getText());
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
        int activeFiles = 0;
        boolean chkInsertNumbersSelected = chkInsertNumbers.isSelected();
        boolean chkEqualLenDigitsSelected = chkEqualLenDigits.isSelected();
        if(chkInsertNumbersSelected){
            activeFiles = countActiveFiles() + (Integer)spStartAutoNumber.getValue();
        }
        
        Vector<Vector> data = ((DefaultTableModel) table.getModel()).getDataVector();
        Boolean check;
        File file;
        String newName;
        String args = null;
        int i = 0;
        int j = (Integer)spStartAutoNumber.getValue();
        for (Vector objects : data) {
            if (objects != null) {
                check = (Boolean) objects.get(0);
                file = (File) objects.get(1);
                if (check) {
                    if(chkInsertNumbersSelected && chkEqualLenDigitsSelected){
                        args = Renamer.getCompleteIndex(activeFiles, j);
                    }
                    else if(chkInsertNumbersSelected){
                        args = String.valueOf(j);
                    }
                    newName = renameItem(file.getName(),args);
                    data.get(i).set(2, newName);
                    j++;
                }
            }
            i++;
        }
        ((DefaultTableModel) table.getModel()).fireTableDataChanged();
    }
    
    private int countActiveFiles(){
        Vector<Vector> data = ((DefaultTableModel) table.getModel()).getDataVector();
        Boolean check;
        int i = 0;
        for (Vector objects : data) {
            if (objects != null) {
                check = (Boolean) objects.get(0);
                if (check) {
                    i++;
                }
            }
        }
        return i;
    }
    
    private void renameFiles() {
        Vector<Vector> data = ((DefaultTableModel) table.getModel()).getDataVector();
        Boolean check;
        File file;
        File fileNewName;
        String newName;
        int i = 0;
        filesRenamed.clear();
        for (Vector objects : data) {
            if (objects != null) {
                check = (Boolean) objects.get(0);
                file = (File) objects.get(1);
                newName = (String)objects.get(2);
                if (check) {
                    fileNewName = new File(file.getParent()+ File.separator + newName);
                    boolean rename = file.renameTo(fileNewName);
                    if(rename){
                        filesRenamed.put(fileNewName, file);
                    }
                }
            }
            i++;
        }
        refreshTable();
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
            if(files == null){
                return ;
            }
            for (File myFile : files) {
                addToTable(myFile);
            }
        }
    }

    private String renameItem(String str,String args) {
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
        
        if(chkReplace.isSelected()){
            str = str.replaceAll(txfReplaceThis.getText(), txfReplaceWith.getText());
        }
        
        if(chkSpaces.isSelected()){
            Object o = cmbSpaces.getSelectedItem();
            
            if(bundle.getString("espaciosAGuionesBajos").equals(o)){ 
                str = str.replaceAll("\\ ", "\\_");
            }
            else if(bundle.getString("guionesBajosAEspacios").equals(o)){ 
                str = str.replaceAll("\\_", "\\ ");
            }
            else if(bundle.getString("espaciosAPuntos").equals(o)){ 
                str = str.replaceAll("\\ ", "\\.");
            }
            else if(bundle.getString("puntosAEspacios").equals(o)){ 
                str = str.replaceAll("\\.", "\\ ");
            }
            else if(bundle.getString("espaciosAGuiones").equals(o)){ 
                str = str.replaceAll("\\ ", "\\-");
            }
            else if(bundle.getString("guionesAEspacios").equals(o)){ 
                str = str.replaceAll("\\-", "\\ ");
            }
        }
        
        if(chkAccents.isSelected()){
            str = Renamer.deleteAccents(str);
        }
        
        if(chkEnies.isSelected()){
            String p;
            if(str.indexOf("ñ") >= 0){
                p = rbtnN.isSelected() ? "n" : "ni";
                str = str.replaceAll("ñ", p);
            }
            else if(str.indexOf("Ñ") >= 0){
                p = rbtnN.isSelected() ? "N" : "NI";
                str = str.replaceAll("Ñ", p);
            }
        }
        
        if(chkInsert.isSelected()){
            str = Renamer.insert(str, txfInsert.getText(), 
                    (Integer)spPosInsert.getValue(), chkInsertEnd.isSelected());
        }
        
        if(chkDeleteFrom.isSelected()){
            str = Renamer.delete(str, (Integer)spDeleteFrom.getValue(), 
                    (Integer)spDeleteTo.getValue(), chkDeleteToEnd.isSelected());
        }
        
        if(chkDeleteChars.isSelected()){
            str = str.replaceAll(txfDelete.getText(), "");
        }
        
        if(chkDeleteBrackets.isSelected()){
            str = str.replaceAll("\\(", "");
            str = str.replaceAll("\\)", "");
        }
        
        if(chkDeleteMoreOneSpaces.isSelected()){
            str = Renamer.deleteDobleSpaces(str);
        }
        
        if(chkInsertNumbers.isSelected()){
            int p =  (Integer)spPosAutoNumber.getValue();
            if(p > 0){
                str = Renamer.insert(str, args,p,false);            
            }
            else{
                str = args + str;
            }
        }

        return str;
    }
    
    private void deshacer(){
        for (Iterator<File> it = filesRenamed.keySet().iterator(); it.hasNext();) {
            File fileName = it.next();
            File oldName = filesRenamed.get(fileName);
            fileName.renameTo(oldName);
        }
        refreshTable();
    }
    
    private void restartControls(){
        Component[] tabbedPane = tbPaneConversions.getComponents();
        
        for (int i = 0; i < tabbedPane.length; i++) {
            Component component = tabbedPane[i];
            if (component instanceof JPanel) {
                Component[] panel = ((JPanel)component).getComponents();
                for (int j = 0; j < panel.length; j++) {
                    Component c = panel[j];
                    if(c instanceof JRadioButton){
                        ((JRadioButton)c).setSelected(false);   
                    }
                    if(c instanceof JSpinner){
                        ((JSpinner)c).setValue(0);
                    }
                    
                    if(c instanceof JCheckBox){
                        ((JCheckBox)c).setSelected(false);
                    }
                    
                    if (c instanceof JTextField) {
                        ((JTextField)c).setText("");
                    }
                }
            }
        }
        
        btnGroupEnies.clearSelection();
        btnGroupExtensions.clearSelection();
        btnGroupUpperLower.clearSelection();
        chkEnies.setSelected(false);
        
        rbtnNi.setSelected(true);
        spDeleteTo.setValue(1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException ex) {
           LOG.log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
           LOG.log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
           LOG.log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
           LOG.log(Level.SEVERE, null, ex);
        }       
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
    private javax.swing.JPanel centerPane;
    private javax.swing.JPanel changeCasePanel;
    private javax.swing.JCheckBox chkAccents;
    private javax.swing.JCheckBox chkCaseReplace;
    private javax.swing.JCheckBox chkDeleteBrackets;
    private javax.swing.JCheckBox chkDeleteChars;
    private javax.swing.JCheckBox chkDeleteFrom;
    private javax.swing.JCheckBox chkDeleteMoreOneSpaces;
    private javax.swing.JCheckBox chkDeleteToEnd;
    private javax.swing.JCheckBox chkEnies;
    private javax.swing.JCheckBox chkEqualLenDigits;
    private javax.swing.JCheckBox chkInsert;
    private javax.swing.JCheckBox chkInsertEnd;
    private javax.swing.JCheckBox chkInsertNumbers;
    private javax.swing.JCheckBox chkReplace;
    private javax.swing.JCheckBox chkSelectAll;
    private javax.swing.JCheckBox chkShowDir;
    private javax.swing.JCheckBox chkShowFiles;
    private javax.swing.JCheckBox chkShowTag;
    private javax.swing.JCheckBox chkSpaces;
    private javax.swing.JComboBox cmbCaseReplace;
    private javax.swing.JComboBox cmbSpaces;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JPanel eniesPanel;
    private com.cartiec.jrenamer.JFileBrowser fileBrowser;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDeleteTo;
    private javax.swing.JLabel lblExtension;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblIn;
    private javax.swing.JLabel lblNumberIn;
    private javax.swing.JLabel lblStartAutoNumber;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblWith;
    private javax.swing.JPopupMenu popupMenu;
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
    private javax.swing.JSpinner spPosAutoNumber;
    private javax.swing.JSpinner spPosInsert;
    private javax.swing.JSpinner spStartAutoNumber;
    private javax.swing.JSpinner spUpperFrom;
    private javax.swing.JSpinner spUpperTo;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableView;
    private javax.swing.JTabbedPane tbPaneConversions;
    private javax.swing.JTextField txfDelete;
    private javax.swing.JTextField txfDelim;
    private javax.swing.JTextField txfExtension;
    private javax.swing.JTextField txfInsert;
    private javax.swing.JTextField txfReplaceThis;
    private javax.swing.JTextField txfReplaceWith;
    // End of variables declaration//GEN-END:variables
}
