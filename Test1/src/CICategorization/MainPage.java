package CICategorization;

//package jtextfielddemo;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Panel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage {

	JFrame frmIncidentCategorization;
	private JTextField txtInc;
	private JTextField txtInc_1;
	private JTextField txtInc_2;
	private JTextField txtInc_3;
	private JTextField txtInc_4;
	private JTextField txtInc_5;
	private JTextField txtInc_6;
	private JTextField txtInc_7;
	private JTextField txtInc_8;
	private JTextField txtInc_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField txtSruthiPerumbillavil;
	private JTextField txtKaushikBose;
	private JTextField txtJoshuaRajanayagam;
	private JTextField txtVijayaVegi;
	private JTextField txtChinnaPriyanka;
	private JTextField txtKomalSajnani;
	private JTextField txtKunalLal;
	private JTextField txtSowmyaMathialagan;
	private JTextField txtPurnimaNagaraj;
	private JTextField txtGayathriMadhuri;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField txtApplication;
	private JTextField txtServer;
	private JTextField txtServer_1;
	private JTextField txtApplication_1;
	private JTextField txtServer_2;
	private JTextField txtApplication_2;
	private JTextField txtServer_3;
	private JTextField txtApplication_3;
	private JTextField txtServer_4;
	private JTextField txtApplication_4;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField txtErrorMessage;
	private JTextField txtBackuprestoreJobFailure;
	private JTextField txtWebServices;
	private JTextField txtInterface;
	private JTextField txtMonitoringAlert;
	private JTextField txtConfigurationFirewall;
	private JTextField txtMonitoringAlert_1;
	private JTextField txtHowTouserTraining;
	private JTextField txtBackuprestoreJobFailure_1;
	private JTextField txtHowTouserTraining_1;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField txtClosed;
	private JTextField txtClosed_1;
	private JTextField txtClosed_2;
	private JTextField txtClosed_3;
	private JTextField txtClosed_4;
	private JTextField txtClosed_5;
	private JTextField txtClosed_6;
	private JTextField txtClosed_7;
	private JTextField txtClosed_8;
	private JTextField txtClosed_9;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	private JComboBox comboBox_11;
	private JComboBox comboBox_12;
	private JComboBox comboBox_13;
	private JComboBox comboBox_14;
	private JComboBox comboBox_15;
	private JComboBox comboBox_16;
	private JComboBox comboBox_17;
	private JComboBox comboBox_18;
	private JComboBox comboBox_20;
	private JComboBox comboBox_21;
	private JComboBox comboBox_22;
	private JComboBox comboBox_23;
	private JComboBox comboBox_24;
	private JComboBox comboBox_25;
	private JComboBox comboBox_26;
	private JComboBox comboBox_27;
	private JComboBox comboBox_28;
	private JComboBox comboBox_29;
	private JComboBox comboBox_30;
	private JComboBox comboBox_31;
	private JComboBox comboBox_32;
	private JComboBox comboBox_19;
	private JTextField txtQuoteInformation;
	private JTextField txtNa;
	private JTextField txtNa_2;
	private JTextField txtPackageAllocationIssue;
	private JTextField textField_86;
	private JTextField txtQuoteInformation_1;
	private JTextField txtDatamovement;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField txtNa_1;
	private JTextField txtNa_3;
	private JTextField txtQuoteStatusChange;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField textField_108;
	private JTextField textField_109;
	private JTextField textField_110;
	private JTextField textField_111;
	private JTextField textField_112;
	private JTextField textField_113;
	private JButton btnUpdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frmIncidentCategorization.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIncidentCategorization = new JFrame();
		frmIncidentCategorization.setLocation(50, 50);
		frmIncidentCategorization.setSize(new Dimension(1200, 550));
		frmIncidentCategorization.setResizable(false);
		frmIncidentCategorization.setTitle("Incident Categorization");
//		frmIncidentCategorization.setBounds(100, 100, 450, 300);
		frmIncidentCategorization.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIncidentCategorization.getContentPane().setLayout(null);
		
		JLabel lblServicenowTicketDetails = new JLabel("ServiceNow Ticket Update");
		lblServicenowTicketDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblServicenowTicketDetails.setBounds(440, 0, 367, 38);
		frmIncidentCategorization.getContentPane().add(lblServicenowTicketDetails);
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(15, 43, 1169, 49);
		frmIncidentCategorization.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblInc = new JLabel("IncidentNumber");
		lblInc.setBounds(15, 16, 122, 20);
		panel.add(lblInc);
		
		JLabel lblAss = new JLabel("Assigned To");
		lblAss.setBounds(139, 16, 104, 20);
		panel.add(lblAss);
		
		JLabel lblIssTyp = new JLabel("Issue Type");
		lblIssTyp.setBounds(702, 16, 96, 20);
		panel.add(lblIssTyp);
		
		JLabel lblResTyp = new JLabel("Resolution Type");
		lblResTyp.setBounds(584, 16, 131, 20);
		panel.add(lblResTyp);
		
		JLabel lblSCat = new JLabel("SNOW Category");
		lblSCat.setBounds(231, 16, 131, 20);
		panel.add(lblSCat);
		
		JLabel lblSSCat = new JLabel("SNOW SubCategory");
		lblSSCat.setBounds(332, 16, 151, 20);
		panel.add(lblSSCat);
		
		JLabel lblResStat = new JLabel("Resolution Status");
		lblResStat.setBounds(459, 16, 131, 20);
		panel.add(lblResStat);
		
		JLabel lblCat = new JLabel("Category");
		lblCat.setBounds(867, 16, 96, 20);
		panel.add(lblCat);
		
		JLabel lblSubcategory = new JLabel("Sub-Category");
		lblSubcategory.setBounds(1036, 16, 96, 20);
		panel.add(lblSubcategory);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(609, 29, 1, 1);
		frmIncidentCategorization.getContentPane().add(horizontalGlue);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(15, 98, 115, 402);
		frmIncidentCategorization.getContentPane().add(panel_1);
		
		txtInc = new JTextField();
		txtInc.setText("INC002164128");
		txtInc.setEditable(false);
		panel_1.add(txtInc);
		txtInc.setColumns(10);
		
		txtInc_1 = new JTextField();
		txtInc_1.setText("INC002164415");
		txtInc_1.setEditable(false);
		txtInc_1.setColumns(10);
		panel_1.add(txtInc_1);
		
		txtInc_2 = new JTextField();
		txtInc_2.setText("INC002166587");
		txtInc_2.setEditable(false);
		txtInc_2.setColumns(10);
		panel_1.add(txtInc_2);
		
		txtInc_3 = new JTextField();
		txtInc_3.setText("INC002168710");
		txtInc_3.setEditable(false);
		txtInc_3.setColumns(10);
		panel_1.add(txtInc_3);
		
		txtInc_4 = new JTextField();
		txtInc_4.setText("INC002169813");
		txtInc_4.setEditable(false);
		txtInc_4.setColumns(10);
		panel_1.add(txtInc_4);
		
		txtInc_5 = new JTextField();
		txtInc_5.setText("INC002170314");
		txtInc_5.setEditable(false);
		txtInc_5.setColumns(10);
		panel_1.add(txtInc_5);
		
		txtInc_6 = new JTextField();
		txtInc_6.setText("INC002170357");
		txtInc_6.setEditable(false);
		txtInc_6.setColumns(10);
		panel_1.add(txtInc_6);
		
		txtInc_7 = new JTextField();
		txtInc_7.setText("INC002167532");
		txtInc_7.setEditable(false);
		txtInc_7.setColumns(10);
		panel_1.add(txtInc_7);
		
		txtInc_8 = new JTextField();
		txtInc_8.setText("INC002170551");
		txtInc_8.setEditable(false);
		txtInc_8.setColumns(10);
		panel_1.add(txtInc_8);
		
		txtInc_9 = new JTextField();
		txtInc_9.setText("INC002169088");
		txtInc_9.setEditable(false);
		txtInc_9.setColumns(10);
		panel_1.add(txtInc_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		panel_1.add(textField_15);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(130, 98, 115, 402);
		frmIncidentCategorization.getContentPane().add(panel_2);
		
		txtSruthiPerumbillavil = new JTextField();
		txtSruthiPerumbillavil.setText("Sruthi Perumbillavil");
		txtSruthiPerumbillavil.setEditable(false);
		txtSruthiPerumbillavil.setColumns(10);
		txtSruthiPerumbillavil.setCaretPosition(0);		
		panel_2.add(txtSruthiPerumbillavil);
		
		txtKaushikBose = new JTextField();
		txtKaushikBose.setText("Kaushik Bose");
		txtKaushikBose.setEditable(false);
		txtKaushikBose.setColumns(10);
		txtKaushikBose.setCaretPosition(0);	
		panel_2.add(txtKaushikBose);
		
		txtJoshuaRajanayagam = new JTextField();
		txtJoshuaRajanayagam.setText("Joshua Rajanayagam");
		txtJoshuaRajanayagam.setEditable(false);
		txtJoshuaRajanayagam.setColumns(10);
		txtJoshuaRajanayagam.setCaretPosition(0);
		panel_2.add(txtJoshuaRajanayagam);
		
		txtVijayaVegi = new JTextField();
		txtVijayaVegi.setText("Vijaya Vegi");
		txtVijayaVegi.setEditable(false);
		txtVijayaVegi.setColumns(10);
		txtVijayaVegi.setCaretPosition(0);	
		panel_2.add(txtVijayaVegi);
		
		txtChinnaPriyanka = new JTextField();
		txtChinnaPriyanka.setText("Chinna Priyanka");
		txtChinnaPriyanka.setEditable(false);
		txtChinnaPriyanka.setColumns(10);
		txtChinnaPriyanka.setCaretPosition(0);
		panel_2.add(txtChinnaPriyanka);
		
		txtKomalSajnani = new JTextField();
		txtKomalSajnani.setText("Komal Sajnani");
		txtKomalSajnani.setEditable(false);
		txtKomalSajnani.setColumns(10);
		txtKomalSajnani.setCaretPosition(0);
		panel_2.add(txtKomalSajnani);
		
		txtKunalLal = new JTextField();
		txtKunalLal.setText("Kunal Lal");
		txtKunalLal.setEditable(false);
		txtKunalLal.setColumns(10);
		txtKunalLal.setCaretPosition(0);
		panel_2.add(txtKunalLal);
		
		txtSowmyaMathialagan = new JTextField();
		txtSowmyaMathialagan.setText("Sowmya Mathialagan");
		txtSowmyaMathialagan.setEditable(false);
		txtSowmyaMathialagan.setColumns(10);
		txtSowmyaMathialagan.setCaretPosition(0);	
		panel_2.add(txtSowmyaMathialagan);
		
		txtPurnimaNagaraj = new JTextField();
		txtPurnimaNagaraj.setText("Chinna Priyanka");
		txtPurnimaNagaraj.setEditable(false);
		txtPurnimaNagaraj.setColumns(10);
		txtPurnimaNagaraj.setCaretPosition(0);	
		panel_2.add(txtPurnimaNagaraj);
		
		txtGayathriMadhuri = new JTextField();
		txtGayathriMadhuri.setText("Sruthi Perumbillavil");
		txtGayathriMadhuri.setEditable(false);
		txtGayathriMadhuri.setColumns(10);
		txtGayathriMadhuri.setCaretPosition(0);		
		panel_2.add(txtGayathriMadhuri);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		panel_2.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		panel_2.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		panel_2.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		panel_2.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		panel_2.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		panel_2.add(textField_32);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(245, 98, 115, 402);
		frmIncidentCategorization.getContentPane().add(panel_3);
		
		txtApplication = new JTextField();
		txtApplication.setText("Application");
		txtApplication.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtApplication.setEditable(false);
		txtApplication.setColumns(10);
		panel_3.add(txtApplication);
		
		txtServer = new JTextField();
		txtServer.setText("Server");
		txtServer.setEditable(false);
		txtServer.setColumns(10);
		panel_3.add(txtServer);
		
		txtServer_1 = new JTextField();
		txtServer_1.setText("Server");
		txtServer_1.setEditable(false);
		txtServer_1.setColumns(10);
		panel_3.add(txtServer_1);
		
		txtApplication_1 = new JTextField();
		txtApplication_1.setText("Application");
		txtApplication_1.setEditable(false);
		txtApplication_1.setColumns(10);
		panel_3.add(txtApplication_1);
		
		txtServer_2 = new JTextField();
		txtServer_2.setText("Server");
		txtServer_2.setEditable(false);
		txtServer_2.setColumns(10);
		panel_3.add(txtServer_2);
		
		txtApplication_2 = new JTextField();
		txtApplication_2.setText("Application");
		txtApplication_2.setEditable(false);
		txtApplication_2.setColumns(10);
		panel_3.add(txtApplication_2);
		
		txtServer_3 = new JTextField();
		txtServer_3.setText("Server");
		txtServer_3.setEditable(false);
		txtServer_3.setColumns(10);
		panel_3.add(txtServer_3);
		
		txtApplication_3 = new JTextField();
		txtApplication_3.setText("Application");
		txtApplication_3.setEditable(false);
		txtApplication_3.setColumns(10);
		panel_3.add(txtApplication_3);
		
		txtServer_4 = new JTextField();
		txtServer_4.setText("Server");
		txtServer_4.setEditable(false);
		txtServer_4.setColumns(10);
		panel_3.add(txtServer_4);
		
		txtApplication_4 = new JTextField();
		txtApplication_4.setText("Application");
		txtApplication_4.setEditable(false);
		txtApplication_4.setColumns(10);
		panel_3.add(txtApplication_4);
		
		textField_43 = new JTextField();
		textField_43.setEditable(false);
		textField_43.setColumns(10);
		panel_3.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setEditable(false);
		textField_44.setColumns(10);
		panel_3.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setEditable(false);
		textField_45.setColumns(10);
		panel_3.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setEditable(false);
		textField_46.setColumns(10);
		panel_3.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setEditable(false);
		textField_47.setColumns(10);
		panel_3.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setEditable(false);
		textField_48.setColumns(10);
		panel_3.add(textField_48);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(354, 98, 130, 402);
		frmIncidentCategorization.getContentPane().add(panel_4);
		
		txtErrorMessage = new JTextField();
		txtErrorMessage.setMaximumSize(new Dimension(130, 26));
		txtErrorMessage.setText("Error Message");
		txtErrorMessage.setEditable(false);
		txtErrorMessage.setColumns(10);
		txtErrorMessage.setAlignmentX(0.0f);
		txtErrorMessage.setScrollOffset(0);
		txtErrorMessage.setCaretPosition(0);
		panel_4.add(txtErrorMessage);
		
		txtBackuprestoreJobFailure = new JTextField();
		txtBackuprestoreJobFailure.setMaximumSize(new Dimension(130, 26));
		txtBackuprestoreJobFailure.setText("Backup/Restore Job Failure");
		txtBackuprestoreJobFailure.setEditable(false);
		txtBackuprestoreJobFailure.setColumns(10);
		txtBackuprestoreJobFailure.setAlignmentX(0.0f);
		txtBackuprestoreJobFailure.setCaretPosition(0);
		panel_4.add(txtBackuprestoreJobFailure);
		
		
		
		txtWebServices = new JTextField();
		txtWebServices.setText("Web Services");
		txtWebServices.setEditable(false);
		txtWebServices.setColumns(10);
		txtWebServices.setAlignmentX(0.0f);
		txtWebServices.setCaretPosition(0);
		panel_4.add(txtWebServices);
		
		txtInterface = new JTextField();
		txtInterface.setText("Interface");
		txtInterface.setEditable(false);
		txtInterface.setColumns(10);
		txtInterface.setAlignmentX(0.0f);
		txtInterface.setCaretPosition(0);
		panel_4.add(txtInterface);
		
		txtMonitoringAlert = new JTextField();
		txtMonitoringAlert.setText("Monitoring Alert");
		txtMonitoringAlert.setEditable(false);
		txtMonitoringAlert.setColumns(10);
		txtMonitoringAlert.setAlignmentX(0.0f);
		txtMonitoringAlert.setCaretPosition(0);
		panel_4.add(txtMonitoringAlert);
		
		txtConfigurationFirewall = new JTextField();
		txtConfigurationFirewall.setText("Configuration \u2013 Firewall");
		txtConfigurationFirewall.setEditable(false);
		txtConfigurationFirewall.setColumns(10);
		txtConfigurationFirewall.setAlignmentX(0.0f);
		txtConfigurationFirewall.setCaretPosition(0);
		panel_4.add(txtConfigurationFirewall);
		
		txtMonitoringAlert_1 = new JTextField();
		txtMonitoringAlert_1.setText("Monitoring Alert");
		txtMonitoringAlert_1.setEditable(false);
		txtMonitoringAlert_1.setColumns(10);
		txtMonitoringAlert_1.setAlignmentX(0.0f);
		txtMonitoringAlert_1.setCaretPosition(0);
		panel_4.add(txtMonitoringAlert_1);
		
		txtHowTouserTraining = new JTextField();
		txtHowTouserTraining.setText("Interface");
		txtHowTouserTraining.setEditable(false);
		txtHowTouserTraining.setColumns(10);
		txtHowTouserTraining.setAlignmentX(0.0f);
		txtHowTouserTraining.setCaretPosition(0);
		panel_4.add(txtHowTouserTraining);
		
		txtBackuprestoreJobFailure_1 = new JTextField();
		txtBackuprestoreJobFailure_1.setText("Error Message");
		txtBackuprestoreJobFailure_1.setEditable(false);
		txtBackuprestoreJobFailure_1.setColumns(10);
		txtBackuprestoreJobFailure_1.setAlignmentX(0.0f);
		txtBackuprestoreJobFailure_1.setCaretPosition(0);
		panel_4.add(txtBackuprestoreJobFailure_1);
		
		txtHowTouserTraining_1 = new JTextField();
		txtHowTouserTraining_1.setText("How To/User Training");
		txtHowTouserTraining_1.setEditable(false);
		txtHowTouserTraining_1.setColumns(10);
		txtHowTouserTraining_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtHowTouserTraining_1.setCaretPosition(0);
		panel_4.add(txtHowTouserTraining_1);
		
		textField_59 = new JTextField();
		textField_59.setEditable(false);
		textField_59.setColumns(10);
		textField_59.setAlignmentX(0.0f);
		panel_4.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setEditable(false);
		textField_60.setColumns(10);
		textField_60.setAlignmentX(0.0f);
		panel_4.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setEditable(false);
		textField_61.setColumns(10);
		textField_61.setAlignmentX(0.0f);
		panel_4.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setEditable(false);
		textField_62.setColumns(10);
		textField_62.setAlignmentX(0.0f);
		panel_4.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setEditable(false);
		textField_63.setColumns(10);
		textField_63.setAlignmentX(0.0f);
		panel_4.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setEditable(false);
		textField_64.setColumns(10);
		textField_64.setAlignmentX(0.0f);
		panel_4.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setEditable(false);
		textField_65.setColumns(10);
		textField_65.setAlignmentX(0.0f);
		panel_4.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setEditable(false);
		textField_66.setColumns(10);
		textField_66.setAlignmentX(0.0f);
		panel_4.add(textField_66);
		
		Panel panel_5 = new Panel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(484, 98, 107, 402);
		frmIncidentCategorization.getContentPane().add(panel_5);
		
		txtClosed = new JTextField();
		txtClosed.setText("Closed");
		txtClosed.setEditable(false);
		txtClosed.setColumns(10);
		txtClosed.setAlignmentX(0.0f);
		panel_5.add(txtClosed);
		
		txtClosed_1 = new JTextField();
		txtClosed_1.setText("Closed");
		txtClosed_1.setEditable(false);
		txtClosed_1.setColumns(10);
		txtClosed_1.setAlignmentX(0.0f);
		panel_5.add(txtClosed_1);
		
		txtClosed_2 = new JTextField();
		txtClosed_2.setText("Closed");
		txtClosed_2.setEditable(false);
		txtClosed_2.setColumns(10);
		txtClosed_2.setAlignmentX(0.0f);
		panel_5.add(txtClosed_2);
		
		txtClosed_3 = new JTextField();
		txtClosed_3.setText("Closed");
		txtClosed_3.setEditable(false);
		txtClosed_3.setColumns(10);
		txtClosed_3.setAlignmentX(0.0f);
		panel_5.add(txtClosed_3);
		
		txtClosed_4 = new JTextField();
		txtClosed_4.setText("Closed");
		txtClosed_4.setEditable(false);
		txtClosed_4.setColumns(10);
		txtClosed_4.setAlignmentX(0.0f);
		panel_5.add(txtClosed_4);
		
		txtClosed_5 = new JTextField();
		txtClosed_5.setText("Closed");
		txtClosed_5.setEditable(false);
		txtClosed_5.setColumns(10);
		txtClosed_5.setAlignmentX(0.0f);
		panel_5.add(txtClosed_5);
		
		txtClosed_6 = new JTextField();
		txtClosed_6.setText("Closed");
		txtClosed_6.setEditable(false);
		txtClosed_6.setColumns(10);
		txtClosed_6.setAlignmentX(0.0f);
		panel_5.add(txtClosed_6);
		
		txtClosed_7 = new JTextField();
		txtClosed_7.setText("Closed");
		txtClosed_7.setEditable(false);
		txtClosed_7.setColumns(10);
		txtClosed_7.setAlignmentX(0.0f);
		panel_5.add(txtClosed_7);
		
		txtClosed_8 = new JTextField();
		txtClosed_8.setText("Closed");
		txtClosed_8.setEditable(false);
		txtClosed_8.setColumns(10);
		txtClosed_8.setAlignmentX(0.0f);
		panel_5.add(txtClosed_8);
		
		txtClosed_9 = new JTextField();
		txtClosed_9.setText("Closed");
		txtClosed_9.setEditable(false);
		txtClosed_9.setColumns(10);
		txtClosed_9.setAlignmentX(0.0f);
		panel_5.add(txtClosed_9);
		
		textField_77 = new JTextField();
		textField_77.setEditable(false);
		textField_77.setColumns(10);
		textField_77.setAlignmentX(0.0f);
		panel_5.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setEditable(false);
		textField_78.setColumns(10);
		textField_78.setAlignmentX(0.0f);
		panel_5.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setEditable(false);
		textField_79.setColumns(10);
		textField_79.setAlignmentX(0.0f);
		panel_5.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setEditable(false);
		textField_80.setColumns(10);
		textField_80.setAlignmentX(0.0f);
		panel_5.add(textField_80);
		
		textField_81 = new JTextField();
		textField_81.setEditable(false);
		textField_81.setColumns(10);
		textField_81.setAlignmentX(0.0f);
		panel_5.add(textField_81);
		
		textField_82 = new JTextField();
		textField_82.setEditable(false);
		textField_82.setColumns(10);
		textField_82.setAlignmentX(0.0f);
		panel_5.add(textField_82);
		
		Panel panel_6 = new Panel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(582, 98, 115, 402);
		frmIncidentCategorization.getContentPane().add(panel_6);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox.setPreferredSize(new Dimension(90, 20));
		comboBox.setName("");
		comboBox.setMaximumRowCount(20);
		comboBox.setAutoscrolls(true);
		comboBox.setAlignmentX(0.0f);
		panel_6.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_1.setPreferredSize(new Dimension(90, 20));
		comboBox_1.setName("");
		comboBox_1.setMaximumRowCount(20);
		comboBox_1.setAutoscrolls(true);
		comboBox_1.setAlignmentX(0.0f);
		panel_6.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_2.setPreferredSize(new Dimension(90, 20));
		comboBox_2.setName("");
		comboBox_2.setMaximumRowCount(20);
		comboBox_2.setAutoscrolls(true);
		comboBox_2.setAlignmentX(0.0f);
		panel_6.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_3.setPreferredSize(new Dimension(90, 20));
		comboBox_3.setName("");
		comboBox_3.setMaximumRowCount(20);
		comboBox_3.setAutoscrolls(true);
		comboBox_3.setAlignmentX(0.0f);
		panel_6.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_4.setPreferredSize(new Dimension(90, 20));
		comboBox_4.setName("");
		comboBox_4.setMaximumRowCount(20);
		comboBox_4.setAutoscrolls(true);
		comboBox_4.setAlignmentX(0.0f);
		panel_6.add(comboBox_4);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_5.setPreferredSize(new Dimension(90, 20));
		comboBox_5.setName("");
		comboBox_5.setMaximumRowCount(20);
		comboBox_5.setAutoscrolls(true);
		comboBox_5.setAlignmentX(0.0f);
		panel_6.add(comboBox_5);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_6.setPreferredSize(new Dimension(90, 20));
		comboBox_6.setName("");
		comboBox_6.setMaximumRowCount(20);
		comboBox_6.setAutoscrolls(true);
		comboBox_6.setAlignmentX(0.0f);
		panel_6.add(comboBox_6);
		
		comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_7.setPreferredSize(new Dimension(90, 20));
		comboBox_7.setName("");
		comboBox_7.setMaximumRowCount(20);
		comboBox_7.setAutoscrolls(true);
		comboBox_7.setAlignmentX(0.0f);
		panel_6.add(comboBox_7);
		
		comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_8.setPreferredSize(new Dimension(90, 20));
		comboBox_8.setName("");
		comboBox_8.setMaximumRowCount(20);
		comboBox_8.setAutoscrolls(true);
		comboBox_8.setAlignmentX(0.0f);
		panel_6.add(comboBox_8);
		
		comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_9.setPreferredSize(new Dimension(90, 20));
		comboBox_9.setName("");
		comboBox_9.setMaximumRowCount(20);
		comboBox_9.setAutoscrolls(true);
		comboBox_9.setAlignmentX(0.0f);
		panel_6.add(comboBox_9);
		
		comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_10.setPreferredSize(new Dimension(90, 20));
		comboBox_10.setName("");
		comboBox_10.setMaximumRowCount(20);
		comboBox_10.setAutoscrolls(true);
		comboBox_10.setAlignmentX(0.0f);
		panel_6.add(comboBox_10);
		
		comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_11.setPreferredSize(new Dimension(90, 20));
		comboBox_11.setName("");
		comboBox_11.setMaximumRowCount(20);
		comboBox_11.setAutoscrolls(true);
		comboBox_11.setAlignmentX(0.0f);
		panel_6.add(comboBox_11);
		
		comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_12.setPreferredSize(new Dimension(90, 20));
		comboBox_12.setName("");
		comboBox_12.setMaximumRowCount(20);
		comboBox_12.setAutoscrolls(true);
		comboBox_12.setAlignmentX(0.0f);
		panel_6.add(comboBox_12);
		
		comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_13.setPreferredSize(new Dimension(90, 20));
		comboBox_13.setName("");
		comboBox_13.setMaximumRowCount(20);
		comboBox_13.setAutoscrolls(true);
		comboBox_13.setAlignmentX(0.0f);
		panel_6.add(comboBox_13);
		
		comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_14.setPreferredSize(new Dimension(90, 20));
		comboBox_14.setName("");
		comboBox_14.setMaximumRowCount(20);
		comboBox_14.setAutoscrolls(true);
		comboBox_14.setAlignmentX(0.0f);
		panel_6.add(comboBox_14);
		
		comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Application_Defect", "Data_Remediation", "How To/User Training", "Infrastructure", "Starwood_Data", "User_Query", "User_Training"}));
		comboBox_15.setPreferredSize(new Dimension(90, 20));
		comboBox_15.setName("");
		comboBox_15.setMaximumRowCount(20);
		comboBox_15.setAutoscrolls(true);
		comboBox_15.setAlignmentX(0.0f);
		panel_6.add(comboBox_15);
		
		Panel panel_7 = new Panel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(692, 98, 154, 402);
		frmIncidentCategorization.getContentPane().add(panel_7);
		
		comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_16.setPreferredSize(new Dimension(150, 20));
		comboBox_16.setName("");
		comboBox_16.setMaximumRowCount(20);
		comboBox_16.setAutoscrolls(true);
		comboBox_16.setAlignmentX(0.0f);
		panel_7.add(comboBox_16);
		
		comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_17.setPreferredSize(new Dimension(150, 20));
		comboBox_17.setName("");
		comboBox_17.setMaximumRowCount(20);
		comboBox_17.setAutoscrolls(true);
		comboBox_17.setAlignmentX(0.0f);
		panel_7.add(comboBox_17);
		
		comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_18.setPreferredSize(new Dimension(150, 20));
		comboBox_18.setName("");
		comboBox_18.setMaximumRowCount(20);
		comboBox_18.setAutoscrolls(true);
		comboBox_18.setAlignmentX(0.0f);
		panel_7.add(comboBox_18);
		
		comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_19.setPreferredSize(new Dimension(150, 20));
		comboBox_19.setName("");
		comboBox_19.setMaximumRowCount(20);
		comboBox_19.setAutoscrolls(true);
		comboBox_19.setAlignmentX(0.0f);
		panel_7.add(comboBox_19);
		
		comboBox_20 = new JComboBox();
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_20.setPreferredSize(new Dimension(150, 20));
		comboBox_20.setName("");
		comboBox_20.setMaximumRowCount(20);
		comboBox_20.setAutoscrolls(true);
		comboBox_20.setAlignmentX(0.0f);
		panel_7.add(comboBox_20);
		
		comboBox_21 = new JComboBox();
		comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_21.setPreferredSize(new Dimension(150, 20));
		comboBox_21.setName("");
		comboBox_21.setMaximumRowCount(20);
		comboBox_21.setAutoscrolls(true);
		comboBox_21.setAlignmentX(0.0f);
		panel_7.add(comboBox_21);
		
		comboBox_22 = new JComboBox();
		comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_22.setPreferredSize(new Dimension(150, 20));
		comboBox_22.setName("");
		comboBox_22.setMaximumRowCount(20);
		comboBox_22.setAutoscrolls(true);
		comboBox_22.setAlignmentX(0.0f);
		panel_7.add(comboBox_22);
		
		comboBox_23 = new JComboBox();
		comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_23.setPreferredSize(new Dimension(150, 20));
		comboBox_23.setName("");
		comboBox_23.setMaximumRowCount(20);
		comboBox_23.setAutoscrolls(true);
		comboBox_23.setAlignmentX(0.0f);
		panel_7.add(comboBox_23);
		
		comboBox_24 = new JComboBox();
		comboBox_24.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_24.setPreferredSize(new Dimension(150, 20));
		comboBox_24.setName("");
		comboBox_24.setMaximumRowCount(20);
		comboBox_24.setAutoscrolls(true);
		comboBox_24.setAlignmentX(0.0f);
		panel_7.add(comboBox_24);
		
		comboBox_25 = new JComboBox();
		comboBox_25.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_25.setPreferredSize(new Dimension(150, 20));
		comboBox_25.setName("");
		comboBox_25.setMaximumRowCount(20);
		comboBox_25.setAutoscrolls(true);
		comboBox_25.setAlignmentX(0.0f);
		panel_7.add(comboBox_25);
		
		comboBox_26 = new JComboBox();
		comboBox_26.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_26.setPreferredSize(new Dimension(150, 20));
		comboBox_26.setName("");
		comboBox_26.setMaximumRowCount(20);
		comboBox_26.setAutoscrolls(true);
		comboBox_26.setAlignmentX(0.0f);
		panel_7.add(comboBox_26);
		
		comboBox_27 = new JComboBox();
		comboBox_27.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_27.setPreferredSize(new Dimension(150, 20));
		comboBox_27.setName("");
		comboBox_27.setMaximumRowCount(20);
		comboBox_27.setAutoscrolls(true);
		comboBox_27.setAlignmentX(0.0f);
		panel_7.add(comboBox_27);
		
		comboBox_28 = new JComboBox();
		comboBox_28.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_28.setPreferredSize(new Dimension(150, 20));
		comboBox_28.setName("");
		comboBox_28.setMaximumRowCount(20);
		comboBox_28.setAutoscrolls(true);
		comboBox_28.setAlignmentX(0.0f);
		panel_7.add(comboBox_28);
		
		comboBox_29 = new JComboBox();
		comboBox_29.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_29.setPreferredSize(new Dimension(150, 20));
		comboBox_29.setName("");
		comboBox_29.setMaximumRowCount(20);
		comboBox_29.setAutoscrolls(true);
		comboBox_29.setAlignmentX(0.0f);
		panel_7.add(comboBox_29);
		
		comboBox_30 = new JComboBox();
		comboBox_30.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_30.setPreferredSize(new Dimension(150, 20));
		comboBox_30.setName("");
		comboBox_30.setMaximumRowCount(20);
		comboBox_30.setAutoscrolls(true);
		comboBox_30.setAlignmentX(0.0f);
		panel_7.add(comboBox_30);
		
		comboBox_31 = new JComboBox();
		comboBox_31.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_31.setPreferredSize(new Dimension(150, 20));
		comboBox_31.setName("");
		comboBox_31.setMaximumRowCount(20);
		comboBox_31.setAutoscrolls(true);
		comboBox_31.setAlignmentX(0.0f);
		panel_7.add(comboBox_31);
		
		comboBox_32 = new JComboBox();
		comboBox_32.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Batch Jobs", "C++", "Config Defect", "Data Conversion", "Designed Functionality", "Event Check Recalculate", "LTC Function Space Release", "Refresh Job", "Server Component", "Status Sync Job", "Third party issue/Connectivity", "User Generic Query", "User Specific Issue", "User_Training", "Web Services"}));
		comboBox_32.setPreferredSize(new Dimension(150, 20));
		comboBox_32.setName("");
		comboBox_32.setMaximumRowCount(20);
		comboBox_32.setAutoscrolls(true);
		comboBox_32.setAlignmentX(0.0f);
		panel_7.add(comboBox_32);
		
		Panel panel_8 = new Panel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(832, 98, 164, 402);
		frmIncidentCategorization.getContentPane().add(panel_8);
		
		txtQuoteInformation = new JTextField();
		txtQuoteInformation.setToolTipText("");
		panel_8.add(txtQuoteInformation);
		txtQuoteInformation.setColumns(10);
		
		txtNa = new JTextField();
		txtNa.setToolTipText("");
		txtNa.setColumns(10);
		panel_8.add(txtNa);
		
		txtNa_2 = new JTextField();
		txtNa_2.setToolTipText("");
		txtNa_2.setColumns(10);
		panel_8.add(txtNa_2);
		
		txtQuoteInformation_1 = new JTextField();
		txtQuoteInformation_1.setToolTipText("");
		txtQuoteInformation_1.setColumns(10);
		txtQuoteInformation_1.setAlignmentX(0.0f);
		panel_8.add(txtQuoteInformation_1);
		
		txtDatamovement = new JTextField();
		txtDatamovement.setToolTipText("");
		txtDatamovement.setColumns(10);
		txtDatamovement.setAlignmentX(0.0f);
		panel_8.add(txtDatamovement);
		
		textField_86 = new JTextField();
		textField_86.setToolTipText("");
		textField_86.setColumns(10);
		textField_86.setAlignmentX(0.0f);
		panel_8.add(textField_86);
		
		textField_89 = new JTextField();
		textField_89.setToolTipText("");
		textField_89.setColumns(10);
		textField_89.setAlignmentX(0.0f);
		panel_8.add(textField_89);
		
		textField_90 = new JTextField();
		textField_90.setToolTipText("");
		textField_90.setColumns(10);
		textField_90.setAlignmentX(0.0f);
		panel_8.add(textField_90);
		
		textField_91 = new JTextField();
		textField_91.setToolTipText("");
		textField_91.setColumns(10);
		textField_91.setAlignmentX(0.0f);
		panel_8.add(textField_91);
		
		textField_92 = new JTextField();
		textField_92.setToolTipText("");
		textField_92.setColumns(10);
		textField_92.setAlignmentX(0.0f);
		panel_8.add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setToolTipText("");
		textField_93.setColumns(10);
		textField_93.setAlignmentX(0.0f);
		panel_8.add(textField_93);
		
		textField_94 = new JTextField();
		textField_94.setToolTipText("");
		textField_94.setColumns(10);
		textField_94.setAlignmentX(0.0f);
		panel_8.add(textField_94);
		
		textField_95 = new JTextField();
		textField_95.setToolTipText("");
		textField_95.setColumns(10);
		textField_95.setAlignmentX(0.0f);
		panel_8.add(textField_95);
		
		textField_96 = new JTextField();
		textField_96.setToolTipText("");
		textField_96.setColumns(10);
		textField_96.setAlignmentX(0.0f);
		panel_8.add(textField_96);
		
		textField_97 = new JTextField();
		textField_97.setToolTipText("");
		textField_97.setColumns(10);
		textField_97.setAlignmentX(0.0f);
		panel_8.add(textField_97);
		
		textField_98 = new JTextField();
		textField_98.setToolTipText("");
		textField_98.setColumns(10);
		textField_98.setAlignmentX(0.0f);
		panel_8.add(textField_98);
		
		Panel panel_9 = new Panel();
		panel_9.setBackground(Color.LIGHT_GRAY);
		panel_9.setBounds(979, 98, 205, 402);
		frmIncidentCategorization.getContentPane().add(panel_9);
		
		txtPackageAllocationIssue = new JTextField();
		txtPackageAllocationIssue.setToolTipText("");
		txtPackageAllocationIssue.setColumns(15);
		txtPackageAllocationIssue.setAlignmentX(0.0f);
		panel_9.add(txtPackageAllocationIssue);
		
		txtNa_1 = new JTextField();
		txtNa_1.setToolTipText("");
		txtNa_1.setColumns(15);
		txtNa_1.setAlignmentX(0.0f);
		panel_9.add(txtNa_1);
		
		txtNa_3 = new JTextField();
		txtNa_3.setToolTipText("");
		txtNa_3.setColumns(15);
		txtNa_3.setAlignmentX(0.0f);
		panel_9.add(txtNa_3);
		
		txtQuoteStatusChange = new JTextField();
		txtQuoteStatusChange.setToolTipText("");
		txtQuoteStatusChange.setColumns(15);
		txtQuoteStatusChange.setAlignmentX(0.0f);
		panel_9.add(txtQuoteStatusChange);
		
		textField_102 = new JTextField();
		textField_102.setToolTipText("");
		textField_102.setColumns(15);
		textField_102.setAlignmentX(0.0f);
		panel_9.add(textField_102);
		
		textField_103 = new JTextField();
		textField_103.setToolTipText("");
		textField_103.setColumns(15);
		textField_103.setAlignmentX(0.0f);
		panel_9.add(textField_103);
		
		textField_104 = new JTextField();
		textField_104.setToolTipText("");
		textField_104.setColumns(15);
		textField_104.setAlignmentX(0.0f);
		panel_9.add(textField_104);
		
		textField_105 = new JTextField();
		textField_105.setToolTipText("");
		textField_105.setColumns(15);
		textField_105.setAlignmentX(0.0f);
		panel_9.add(textField_105);
		
		textField_106 = new JTextField();
		textField_106.setToolTipText("");
		textField_106.setColumns(15);
		textField_106.setAlignmentX(0.0f);
		panel_9.add(textField_106);
		
		textField_107 = new JTextField();
		textField_107.setToolTipText("");
		textField_107.setColumns(15);
		textField_107.setAlignmentX(0.0f);
		panel_9.add(textField_107);
		
		textField_108 = new JTextField();
		textField_108.setToolTipText("");
		textField_108.setColumns(15);
		textField_108.setAlignmentX(0.0f);
		panel_9.add(textField_108);
		
		textField_109 = new JTextField();
		textField_109.setToolTipText("");
		textField_109.setColumns(15);
		textField_109.setAlignmentX(0.0f);
		panel_9.add(textField_109);
		
		textField_110 = new JTextField();
		textField_110.setToolTipText("");
		textField_110.setColumns(15);
		textField_110.setAlignmentX(0.0f);
		panel_9.add(textField_110);
		
		textField_111 = new JTextField();
		textField_111.setToolTipText("");
		textField_111.setColumns(15);
		textField_111.setAlignmentX(0.0f);
		panel_9.add(textField_111);
		
		textField_112 = new JTextField();
		textField_112.setToolTipText("");
		textField_112.setColumns(15);
		textField_112.setAlignmentX(0.0f);
		panel_9.add(textField_112);
		
		textField_113 = new JTextField();
		textField_113.setToolTipText("");
		textField_113.setColumns(15);
		textField_113.setAlignmentX(0.0f);
		panel_9.add(textField_113);
		
		btnUpdate = new JButton("Upload");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnUpdate.setBounds(1064, 9, 115, 29);
		frmIncidentCategorization.getContentPane().add(btnUpdate);
	}
}

