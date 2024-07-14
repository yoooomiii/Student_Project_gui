package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dao.StudentDAO;

public class TeacherAdd extends JFrame implements ActionListener {
	
	JPanel [] tea = new JPanel[4];
	JLabel title = new JLabel("교직원 관리");
	JButton add = new JButton("신규 교직원 등록");
	JButton search = new JButton("교직원 검색");

	
	TeacherAdd() {
		this.setBounds(400, 300, 400, 300);
		this.setLayout(new GridLayout(4,1));
		for( int i=0; i<tea.length; i++) {
			tea[i]=new JPanel();
			this.add(tea[i]);
		}
		tea[0].add(title);
		tea[2].add(add);
		tea[2].add(search);
		add.addActionListener(this);
		search.addActionListener(this);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		sadd= new StudentAdd();
//		sadd.setVisible(true);
//		this.setVisible(false);
	}
}
	
	

