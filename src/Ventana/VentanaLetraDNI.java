package Ventana;



import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;




/*
 * By Paco Gomez
 * Esta ventana tendra dos JTextFields
 * El primero recojera el DNI
 * El segundo calculara la letra al apretar el boton
 * 
 * */
public class VentanaLetraDNI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;



	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblIntroduceDni = new JLabel("INTRODUCE DNI:");
		contentPane.add(lblIntroduceDni);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLetraDniCalculada = new JLabel("LETRA DNI CALCULADA:");
		contentPane.add(lblLetraDniCalculada);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(btnNewButton);
		

	}

}
