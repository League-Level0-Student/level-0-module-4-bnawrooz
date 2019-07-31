package _06_test_scores;

import javax.swing.JOptionPane;

public class Test_score {
public static void main(String[] args) {
	
	String score = JOptionPane.showInputDialog("Type your test score.");
	double Score = Double.parseDouble(score);
	if (Score <= 50) {
		JOptionPane.showMessageDialog(null, "you will get it next time");
	}else if (Score <= 60) {
		JOptionPane.showMessageDialog(null, "try harder");
	}else if (Score <= 70) {
		JOptionPane.showMessageDialog(null, "fine i guess");
	}else if (Score <= 80) {
		JOptionPane.showMessageDialog(null, "nice");
	}else if (Score >= 90) {
		JOptionPane.showMessageDialog(null, "you got it");
	}	
}
}
