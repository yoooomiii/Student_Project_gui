package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.StudentDAO;
import dto.StudentDTO;
import oracle.net.aso.s;

public class StudentAdd extends JFrame implements ActionListener {
	private StudentDTO s;



		JPanel [] info = new JPanel[5];
		JLabel name = new JLabel("이름:");
		JTextField sname = new JTextField(10);
		JLabel grade = new JLabel("학년:");
		JTextField sgrade = new JTextField(10);
		JLabel classnum = new JLabel("반:");
		JTextField sclassnum = new JTextField(10);
		JLabel address = new JLabel("주소:");
		JTextField saddress = new JTextField(10);
		JLabel point = new JLabel("성적:");
		JTextField spoint = new JTextField(10);
		JLabel penalty = new JLabel("벌점:");
		JTextField spenalty = new JTextField(10);
		JLabel title = new JLabel("학생 정보 입력");
		JButton save = new JButton("저장");
		
		
		StudentAdd() {
		this.setBounds(400, 300, 400, 300);
		this.setLayout(new GridLayout(5,1));
		for( int i=0; i<info.length; i++) {
			info[i]=new JPanel();
			this.add(info[i]);
		}
		info[0].add(title);
		info[1].add(name);
		info[1].add(sname);
		info[1].add(grade);
		info[1].add(sgrade);
		info[2].add(classnum);
		info[2].add(sclassnum);
		info[2].add(address);
		info[2].add(saddress);
		info[3].add(point);
		info[3].add(spoint);
		info[3].add(penalty);
		info[3].add(spenalty);
		info[4].add(save);
		save.addActionListener(this);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);


		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		StudentDAO sdao = new StudentDAO();
		if (e.getSource() == save) {
			String studentName = sname.getText();
			String studentGrade = sgrade.getText();
			String studentClassNum = sclassnum.getText();
			String studentAddress = saddress.getText();
			String studentPoint = spoint.getText();
			String studentPenalty= spenalty.getText();

			sdao.insert(s);

			this.dispose();
		}
	}
}
	
	
