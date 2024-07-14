package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JFrame implements ActionListener {
	MenuStudent ms;
	TeacherAdd tad;
	JPanel [] menu = new JPanel[3];
	JLabel title = new JLabel("○○ 학교 정보 시스템");
	JButton student = new JButton("학생 관리");
	JButton teacher = new JButton("교직원 관리");
	JButton event = new JButton("학교 행사 관리");
	JButton lunch = new JButton("점심 메뉴");

	public MainMenu() {
		this.setBounds(400,300,400,300);
		this.setLayout(new GridLayout(3,1));
		for( int i=0; i<menu.length; i++) {
			menu[i]= new JPanel();
			this.add(menu[i]);
		}
		menu[0].add(title);
		menu[1].add(student);
		menu[1].add(teacher);
		menu[2].add(event);
		menu[2].add(lunch);

		student.addActionListener(this);
		teacher.addActionListener(this);
		event.addActionListener(this);
		lunch.addActionListener(this);

		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
	
		ms = new MenuStudent();
        ms.setVisible(true);
        setVisible(false); 
		
    }
}
 
	




