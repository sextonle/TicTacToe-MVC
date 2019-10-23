import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIView extends JFrame{

	Controller controller;
	private JButton[] board = new JButton[9];
	private JButton playAgain;
	private JPanel messages;
	private JLabel topText;
	public char player = 'x';
	
	ActionListener buttonListener = new action();
	
	public void View(Controller controller) {
		this.controller = controller;
		setupGUI();
	}
	
	private void setupGUI() {
		setupFrame();
		setupMessageArea();
		createBoard();
		
	}
	
	private void setupFrame() {
		setSize(400,400);
		setTitle("TicTacToe game with MVC architecture");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,3));	
	}
	
	private void setupMessageArea() {
		messages = new JPanel();
		topText = new JLabel("X Begins");
		playAgain = new JButton("Reset");
		messages.add(topText);
		this.getContentPane().add(messages, BorderLayout.NORTH);
		this.getContentPane().add(playAgain, BorderLayout.SOUTH);
	}

	private void createBoard() {
		for(int i = 0; i < 8; i++) {
			board[i] = new JButton();
			board[i].setText("");
			board[i].addActionListener(buttonListener);
		}
	}
	
	
	class action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() instanceof JButton) {
				JButton button = (JButton)e.getSource();
				if(!button.getText().equals("")) {
					if(player == 'x') {
						button.setText("x");
					}
					else if(player == 'o') {
						button.setText("o");
					}
				}
				else {
					//do nothing
				}	
			}//end top if
		}//end override method
	}//end actionlistener class
	
	
	
	

}
