package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import Webservice.ComOrgaEinheit;
import Webservice.Webservice;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.util.List;

@SuppressWarnings("serial")
public class NeuerBenutzer extends JDialog {
	
	private String Benutzername;
	private String Passwort;
	private Webservice port;

	private final JPanel contentPanel = new JPanel();
	private JTextField txtBenutzername;
	private JTextField txtPasswort;
	private JTextField txtOrgaEinheit;
	private JComboBox comboBoxOrgaEinheit;
	private String[] CoboBezeichnungOrgaEinheit;
	private List<ComOrgaEinheit> OrgaEinheitListe;



	/**
	 * Create the dialog.
	 */
	public NeuerBenutzer(String Benutzername, String Passwort, Webservice port) {
		this.Benutzername = Benutzername;
		this.Passwort = Passwort;
		this.port = port;
		initialize();
	}
	private void initialize(){
		setTitle("Benutzer - Anlegen");
		setResizable(false);
		setBackground(Color.WHITE);
		setBounds(100, 100, 500, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color (255, 250, 240));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblBenutzername = new JLabel("Benutzername:");
			lblBenutzername.setBounds(30, 20, 150, 30);
			contentPanel.add(lblBenutzername);
		}
		{
			JLabel lblPasswort = new JLabel("Passwort:");
			lblPasswort.setBounds(30, 50, 150, 30);
			contentPanel.add(lblPasswort);
		}
		{
			JLabel lblOrgaEinheit = new JLabel("Organisationseinheit:");
			lblOrgaEinheit.setBounds(30, 80, 150, 30);
			contentPanel.add(lblOrgaEinheit);
		}
		{
			txtBenutzername = new JTextField();
			txtBenutzername.setBounds(175, 20, 150, 26);
			contentPanel.add(txtBenutzername);
			txtBenutzername.setColumns(10);
		}
		{
			txtPasswort = new JTextField();
			txtPasswort.setBounds(175, 50, 150, 26);
			contentPanel.add(txtPasswort);
			txtPasswort.setColumns(10);
		}
		{
			txtOrgaEinheit = new JTextField();
			txtOrgaEinheit.setBounds(175, 80, 150, 26);
			contentPanel.add(txtOrgaEinheit);
			txtOrgaEinheit.setColumns(10);
		}

		{
			JButton okButton = new JButton("Best\u00E4tigen");
			okButton.setBounds(265, 120, 100, 30);
			okButton.setBackground(Color.ORANGE);
			contentPanel.add(okButton);
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//TODO Aktion	
					// �bergabe von "benutzer", "benutzername" und "passwort" an "NeuerBenutzerFrage"

					String neuerbenutzername = txtBenutzername.getText();
					String neuespasswort = txtPasswort.getText();
					int orgaEinheit = 0;
					try{
						orgaEinheit = Integer.parseInt(txtOrgaEinheit.getText());
						if (port.gibtesBenutzerschon(Benutzername, Passwort, neuerbenutzername)){
							txtBenutzername.setText("");
							txtPasswort.setText("");
							
						}
						else{

						
						
						NeuerBenutzerFrage NeuerBenutzerFrage = new NeuerBenutzerFrage(Benutzername, Passwort, port, txtBenutzername.getText(), txtPasswort.getText(), orgaEinheit);
						NeuerBenutzerFrage.setVisible(true);
						dispose();
						}
					}
					catch (NumberFormatException a){
						txtOrgaEinheit.setText("");
						if (port.gibtesBenutzerschon(Benutzername, Passwort, neuerbenutzername)){
							txtBenutzername.setText("");
							txtPasswort.setText("");
							
						}
					}
					
				}
			});
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Abbrechen");
			cancelButton.setBounds(370, 120, 100, 30);
			cancelButton.setBackground(Color.WHITE);
			contentPanel.add(cancelButton);
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			cancelButton.setActionCommand("Cancel");
		}
		OrgaEinheitListe = port.getOrgaEinheiten(Benutzername, Passwort);
		CoboBezeichnungOrgaEinheit = new String[OrgaEinheitListe.size()];
		int zaehler2 = 0;
		for (ComOrgaEinheit Orga : OrgaEinheitListe){
			CoboBezeichnungOrgaEinheit[zaehler2] = Orga.getOrgaEinheitBez();
			zaehler2++;
		}
		comboBoxOrgaEinheit = new JComboBox(CoboBezeichnungOrgaEinheit);
		comboBoxOrgaEinheit.addActionListener(new  ActionListener() {
				public void actionPerformed(ActionEvent c) {
					txtOrgaEinheit.setText(""+OrgaEinheitListe.get(comboBoxOrgaEinheit.getSelectedIndex()).getIdOrgaEinheit());
				}
			});
		comboBoxOrgaEinheit.setBounds(330, 80, 140, 26);
		contentPanel.add(comboBoxOrgaEinheit);
	
	}

}
