package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

	MainMenu mm;
	JPanel[] log = new JPanel[4];
	JLabel title = new JLabel("○○ 학교 정보 시스템");
	JLabel id = new JLabel("ID");
	JLabel pw = new JLabel("PW");
	JTextField idid = new JTextField(10);
	JTextField pwpw = new JTextField(10);
	JButton b = new JButton("로그인");
	
	 public Login() {
		
		this.setBounds(400,300,400,300);
		this.setLayout(new GridLayout(4,1));
		for( int i=0; i<log.length; i++) {
			log[i]=new JPanel();
			this.add(log[i]);
		}
		log[0].add(title);
		log[1].add(id);
		log[1].add(idid);
		log[2].add(pw);
		log[2].add(pwpw);
		log[3].add(b);
		b.addActionListener(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		String getid = idid.getText();
		String getpw = pwpw.getText();
		mm= new MainMenu();
		mm.setVisible(true);
		this.setVisible(false);
	}
}
