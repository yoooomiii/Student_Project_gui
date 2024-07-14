package gui;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class MenuStudent extends JFrame implements ActionListener{

	StudentAdd sadd;
	JLabel title = new JLabel("�л� ���� �ý���");
	JPanel[] stu = new JPanel[3];
	JButton add = new JButton("�л� ���� �߰�");
	JButton sinfo = new JButton("�л� ����");
	JButton srecord = new JButton("�л� ����/����");
	

	MenuStudent() {
		this.setBounds(400,300,400,300);
		this.setLayout(new GridLayout(3,1));
		for( int i=0; i<stu.length; i++) {
			stu[i]= new JPanel();
			this.add(stu[i]);
		}
		stu[0].add(title);
		stu[1].add(add);
		stu[1].add(sinfo);
		stu[2].add(srecord);
		add.addActionListener(this);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	}
		
	public void actionPerformed(ActionEvent e) {
		sadd= new StudentAdd();
		sadd.setVisible(true);
		this.setVisible(false);
	}
}



