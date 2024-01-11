package Teacher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class InputDialog extends JDialog {
	private JTextField tfName;
	private JTextField tfPhone;
	private JCheckBox chkAgree;

	public InputDialog(PollGUI parent) {
		super(parent);
		
		setModal(true);
		
		JLabel lblName = new JLabel("설문자 이름");
		tfName = new JTextField(10);
		JLabel lblPhone = new JLabel("설문자 전화번호");
		tfPhone = new JTextField(10);
		JLabel lblAgree = new JLabel("찬성/반대");
		chkAgree = new JCheckBox("찬성");
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(lblName);
		pnlCenter.add(tfName);
		pnlCenter.add(lblPhone);
		pnlCenter.add(tfPhone);
		pnlCenter.add(lblAgree);
		pnlCenter.add(chkAgree);
		
		add(pnlCenter);
		
		setSize(400, 400);
		setLocationRelativeTo(parent);
	}

	public Survey showDialog() {
		setVisible(true);
		
		String name = tfName.getText();
		String phone = tfPhone.getText();
		boolean agree = chkAgree.isSelected();
		
		return new Survey(name, phone, agree);
	}
}

public class PollGUI extends JFrame {
	public PollGUI() {
		JPanel pnlCenter = new JPanel();
		JButton btnAdd = new JButton("기록하기");
		JButton btnCount = new JButton("집계하기");
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InputDialog dialog = new InputDialog(PollGUI.this);
				Survey s = dialog.showDialog();
				
				System.out.println("확인: " + s);
			}
		});
		
		pnlCenter.add(btnAdd);
		pnlCenter.add(btnCount);
		
		add(pnlCenter);
		
		showGUI();
	}
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PollGUI();
	}
}
