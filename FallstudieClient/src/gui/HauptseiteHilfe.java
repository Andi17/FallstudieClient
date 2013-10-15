package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class HauptseiteHilfe extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			HauptseiteHilfe dialog = new HauptseiteHilfe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HauptseiteHilfe() {
		setTitle("Hauptseite - Hilfe");
		setResizable(false);
		setBackground(new Color(255, 250, 240));
		setBounds(100, 100, 460, 310);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 250, 240));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JTextPane txtpnTodo = new JTextPane();
			//TODO Inhalt
			txtpnTodo.setText("Diese Hilfe bezieht sich auf das generelle Fenster und nicht auf die einzelnen Tabs.\n\rSie k\u00F6nnen je nach Benutzerrecht die Tabs \u201EStricheln\u201C, \u201EStatistik\u201C oder \u201EAdministration\u201C ausw\u00E4hlen. Diese haben jeweils ihre eigenen Hilfeseiten.\n\rLinks unten neben dem \u201EHilfe\u201C-Button  k\u00F6nnen Sie \u00FCberpr\u00FCfen als welche Person Sie zurzeit eingeloggt sind. Sollte hier nicht Ihr Name stehen beenden Sie bitte die Anwendung und starten diese neu.\n\rDer Button \u201EBeenden\u201C f\u00FChrt dazu, dass die Anwendung \u201EELASTICO\u201C beendet wird.\r");
			txtpnTodo.setEditable(false);
			txtpnTodo.setBackground(new Color(255, 250, 240));
			txtpnTodo.setBounds(6, 6, 438, 208);
			contentPanel.add(txtpnTodo);
		}
		{
			JButton okButton = new JButton("OK");
			okButton.setBounds(189, 236, 100, 30);
			okButton.setBackground(Color.WHITE);
			contentPanel.add(okButton);
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				dispose();
				}
			});
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
	}

}