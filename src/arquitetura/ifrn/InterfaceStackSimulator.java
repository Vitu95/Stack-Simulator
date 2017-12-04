package arquitetura.ifrn;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceStackSimulator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField valorReg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceStackSimulator frame = new InterfaceStackSimulator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceStackSimulator() {
		setTitle("Stack Simulator");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InterfaceStackSimulator.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Stack Simulator");
		title.setForeground(Color.BLACK);
		title.setFont(new Font("Century Gothic", Font.BOLD, 35));
		title.setBounds(298, 12, 264, 56);
		contentPane.add(title);
		
		JLabel lblValorDosRegistradores = new JLabel("Valor dos registradores:");
		lblValorDosRegistradores.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorDosRegistradores.setBounds(40, 134, 181, 20);
		contentPane.add(lblValorDosRegistradores);
		
		valorReg = new JTextField();
		valorReg.setFont(new Font("Tahoma", Font.BOLD, 12));
		valorReg.setBounds(41, 174, 86, 29);
		contentPane.add(valorReg);
		valorReg.setColumns(10);
		
		JComboBox registradores = new JComboBox();
		registradores.setBackground(SystemColor.menu);
		registradores.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}));
		registradores.setToolTipText("REGS");
		registradores.setBounds(136, 174, 85, 29);
		contentPane.add(registradores);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valor = Integer.parseInt(valorReg.getText());
				
			}
		});
		btnAdicionar.setBackground(SystemColor.controlHighlight);
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdicionar.setBounds(231, 174, 94, 29);
		contentPane.add(btnAdicionar);
		
		JLabel lblInstrucoes = new JLabel("Instru\u00E7\u00F5es:");
		lblInstrucoes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInstrucoes.setBounds(40, 245, 181, 20);
		contentPane.add(lblInstrucoes);
		
		JTextArea campoInstrucoes = new JTextArea();
		campoInstrucoes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		campoInstrucoes.setBounds(40, 276, 287, 148);
		contentPane.add(campoInstrucoes);
		
		JButton btnExecutar = new JButton("Executar");
		btnExecutar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExecutar.setBackground(SystemColor.controlHighlight);
		btnExecutar.setBounds(233, 438, 94, 29);
		contentPane.add(btnExecutar);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBounds(40, 276, 290, 150);
		contentPane.add(panel);
		
		JLabel lblPilha = new JLabel("Pilha");
		lblPilha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPilha.setBounds(636, 135, 49, 20);
		contentPane.add(lblPilha);
		
		JPanel a = new JPanel();
		a.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		a.setBackground(new Color(211, 211, 211));
		a.setBounds(522, 176, 270, 30);
		contentPane.add(a);
		
		JLabel lblA = new JLabel("A");
		a.add(lblA);
		
		JPanel b = new JPanel();
		b.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		b.setBackground(SystemColor.controlHighlight);
		b.setBounds(522, 205, 270, 30);
		contentPane.add(b);
		
		JLabel lblB = new JLabel("B");
		b.add(lblB);
		
		JPanel c = new JPanel();
		c.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		c.setBackground(new Color(211, 211, 211));
		c.setBounds(522, 234, 270, 30);
		contentPane.add(c);
		
		JLabel lblC = new JLabel("C");
		c.add(lblC);
		
		JPanel d = new JPanel();
		d.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		d.setBackground(SystemColor.controlHighlight);
		d.setBounds(522, 263, 270, 30);
		contentPane.add(d);
		
		JLabel lblD = new JLabel("D");
		d.add(lblD);
		
		JPanel e = new JPanel();
		e.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		e.setBackground(new Color(211, 211, 211));
		e.setBounds(522, 292, 270, 30);
		contentPane.add(e);
		
		JLabel lblE = new JLabel("E");
		e.add(lblE);
		
		JPanel f = new JPanel();
		f.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		f.setBackground(SystemColor.controlHighlight);
		f.setBounds(522, 321, 270, 30);
		contentPane.add(f);
		
		JLabel lblF = new JLabel("F");
		f.add(lblF);
		
		JPanel g = new JPanel();
		g.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		g.setBackground(new Color(211, 211, 211));
		g.setBounds(522, 350, 270, 30);
		contentPane.add(g);
		
		JLabel lblG = new JLabel("G");
		g.add(lblG);
		
		JPanel h = new JPanel();
		h.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		h.setBackground(SystemColor.controlHighlight);
		h.setBounds(522, 379, 270, 30);
		contentPane.add(h);
		
		JLabel lblH = new JLabel("H");
		h.add(lblH);
		
		JPanel i = new JPanel();
		i.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		i.setBackground(new Color(211, 211, 211));
		i.setBounds(522, 408, 270, 30);
		contentPane.add(i);
		
		JLabel lblI = new JLabel("I");
		i.add(lblI);
		
		JPanel j = new JPanel();
		j.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		j.setBackground(SystemColor.controlHighlight);
		j.setBounds(522, 437, 270, 30);
		contentPane.add(j);
		
		JLabel lblJ = new JLabel("J");
		j.add(lblJ);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(411, 190, 71, 30);
		contentPane.add(panel_1);
		
		JLabel pc = new JLabel("");
		panel_1.add(pc);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(411, 305, 71, 30);
		contentPane.add(panel_2);
		
		JLabel ir = new JLabel("");
		panel_2.add(ir);
		
		JLabel lblNewLabel = new JLabel("PC");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(411, 165, 29, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIr = new JLabel("IR");
		lblIr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIr.setBounds(411, 279, 29, 14);
		contentPane.add(lblIr);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(377, 134, 29, 362);
		contentPane.add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(0, 0, 834, 79);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(0, 524, 834, 38);
		contentPane.add(panel_4);
		
		JLabel copyrigth = new JLabel("\u00A9 Desenvolvido por Adlem, Breno e Victor");
		panel_4.add(copyrigth);
	}
}
