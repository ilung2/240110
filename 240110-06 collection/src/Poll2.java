import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
class HumanInformation {
	private String name;
	private String phoneNum;
	
	public HumanInformation(String name, String phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	@Override
	public String toString() {
		return "HumanInformation [name=" + name + ", phoneNum=" + phoneNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNum == null) ? 0 : phoneNum.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof HumanInformation))
			return false;
		HumanInformation other = (HumanInformation) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNum == null) {
			if (other.phoneNum != null)
				return false;
		} else if (!phoneNum.equals(other.phoneNum))
			return false;
		return true;
	}
}
class Vote {
	private String name;
	private String phoneNum;
	private String vote;
	
	public Vote(String name, String phoneNum, String vote) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.vote = vote;
	}
	@Override
	public String toString() {
		return "Vote [name=" + name + ", phoneNum=" + phoneNum + ", vote=" + vote + "]";
	}
	
}

public class Poll2 extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Poll2 frame = new Poll2();
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
	public Poll2() {
		setTitle("설문조사\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel(); // 처음패널
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		ArrayList<HumanInformation> humanList = new ArrayList<>();
		ArrayList<Vote> voteList = new ArrayList<>(); 
		
		JPanel panel = new JPanel(); // 큰 패널
		contentPane.add(panel, BorderLayout.CENTER);
		CardLayout card = new CardLayout();
		panel.setLayout(card);
		JPanel ppanel = new JPanel(); // 인적사항 패널
		panel.add(ppanel, "인적 사항");
		SpringLayout sl_panel_1 = new SpringLayout();
		ppanel.setLayout(sl_panel_1);
		
		
		JLabel lblNewLabel = new JLabel("이름");
		ppanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1, 23, SpringLayout.WEST, ppanel);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_1);
		ppanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField, 79, SpringLayout.NORTH, ppanel);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField, 56, SpringLayout.EAST, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel, 3, SpringLayout.NORTH, textField);
		ppanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_1, 54, SpringLayout.SOUTH, textField);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 3, SpringLayout.NORTH, textField_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		textField_1.setColumns(10);
		ppanel.add(textField_1);
		
		JButton btnNewButton = new JButton("설문조사시작");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 30, SpringLayout.NORTH, ppanel);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton, -30, SpringLayout.SOUTH, ppanel);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, -34, SpringLayout.EAST, ppanel);
		ppanel.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
		    	HumanInformation humanInfo = new HumanInformation(textField.getText(), textField_1.getText());
		    	if (!humanList.contains(humanInfo)) {
		    		humanList.add(humanInfo);
		    		card.show(panel, "설문지");
		    		setVisible(true);
		    	} else {
		    		System.out.println("중복된 사람입니다.");
		    	}
		    }
		});
		
		JPanel apanel = new JPanel();
		panel.add(apanel, "설문지");
		SpringLayout sl_panel_2 = new SpringLayout();
		apanel.setLayout(sl_panel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("찬성");
		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 75, SpringLayout.NORTH, apanel);
		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxNewCheckBox, 87, SpringLayout.WEST, apanel);
		apanel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("반대");
		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_1, 53, SpringLayout.SOUTH, chckbxNewCheckBox);
		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_1, 0, SpringLayout.WEST, chckbxNewCheckBox);
		apanel.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (chckbxNewCheckBox.isSelected()) { 
					chckbxNewCheckBox_1.setSelected(false);
					
				}
			}
		});
		
		chckbxNewCheckBox_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (chckbxNewCheckBox_1.isSelected()) {
					chckbxNewCheckBox.setSelected(false); 
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton("제출");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, chckbxNewCheckBox);
		sl_panel_2.putConstraint(SpringLayout.WEST, btnNewButton_1, -119, SpringLayout.EAST, apanel);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 178, SpringLayout.NORTH, apanel);
		sl_panel_2.putConstraint(SpringLayout.EAST, btnNewButton_1, -22, SpringLayout.EAST, apanel);
		apanel.add(btnNewButton_1);
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			int yesVote = 0;
			int noVote = 0;
			public void mouseClicked(MouseEvent e) {
				card.show(panel, "총 찬반수");
				if (voteList.add(new Vote(textField.getText(), textField_1.getText(), chckbxNewCheckBox.getActionCommand()))) {
					yesVote++;
				} else if (voteList.add(new Vote(textField.getText(), textField_1.getText(), chckbxNewCheckBox.getActionCommand()))) {
					
				}
						
				
				
			}
		});
		
		JPanel total = new JPanel();
		panel.add(total, "총 찬반수");
		SpringLayout sl_panel_3 = new SpringLayout();
		total.setLayout(sl_panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("찬성 수");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 82, SpringLayout.NORTH, total);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_2, 25, SpringLayout.WEST, total);
		total.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("반대 수");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 53, SpringLayout.SOUTH, lblNewLabel_2);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel_2);
		total.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("완료");
		sl_panel_3.putConstraint(SpringLayout.NORTH, btnNewButton_2, 39, SpringLayout.NORTH, total);
		sl_panel_3.putConstraint(SpringLayout.WEST, btnNewButton_2, -131, SpringLayout.EAST, total);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -57, SpringLayout.SOUTH, total);
		sl_panel_3.putConstraint(SpringLayout.EAST, btnNewButton_2, -34, SpringLayout.EAST, total);
		total.add(btnNewButton_2);
		
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				card.show(panel, "인적 사항");
			}
		});
		
		
	}
}
