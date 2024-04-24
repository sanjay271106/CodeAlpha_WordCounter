import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

class Main {
	public static void main(String args[]) {
		JFrame f = new JFrame("Character Count");
		JLabel l2, l3, l4;
		JTextArea text;
		JLabel l1;
		JButton submit, clear;
		text = new JTextArea("");
		submit = new JButton("SUBMIT");
		clear = new JButton("CLEAR");
		l1 = new JLabel("Enter Your string Here : ");
		l4 = new JLabel("Number of Words : ");
		l2 = new JLabel("Number of Character : ");
		l3 = new JLabel("Number of Character Without Spaces : ");
		Font txtFont = new Font(Font.SERIF, Font.PLAIN, 16);
		l1.setFont(txtFont);
		l4.setFont(txtFont);
		l2.setFont(txtFont);
		l3.setFont(txtFont);
		l1.setBounds(10, 25, 200, 30);
		text.setBounds(18, 60, 450, 300);
		l4.setBounds(10, 370, 400, 30);
		l2.setBounds(10, 400, 400, 30);
		l3.setBounds(10, 430, 400, 30);
		submit.setBounds(100, 470, 100, 50);
		clear.setBounds(275, 470, 100, 50);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = text.getText().strip();
				int count = 0, i, word = 0;
				for (i = 0; i < str.length(); i++) {
					if (str.charAt(i) != ' ')
					count++;
					else
					word++;
				}
				l4.setText("Number of Words : " + (word + 1));
				l2.setText("Number of Character : " + str.length());
				l3.setText("Number of Character Without Spaces : " + count);
			}
		});
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("");
				l4.setText("Number of Words : ");
				l2.setText("Number of Character : ");
				l3.setText("Number of Character Without Spaces : ");
			}
		});
		f.add(l1);
		f.add(text);
		f.add(l4);
		f.add(l2);
		f.add(l3);
		f.add(submit);
		f.add(clear);
		f.setSize(500, 570);
		f.setResizable(false);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}