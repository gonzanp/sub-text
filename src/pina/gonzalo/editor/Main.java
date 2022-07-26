package pina.gonzalo.editor;

import javax.swing.*;


public class Main {
	public static void main(String [] args) {
		Frame frame = new Frame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
 
class Frame extends  JFrame{
	public Frame() {
		setBounds(300,300,300,300);
		setTitle("Sub text");
		add(new Panel());
		
	}
	
}

class Panel extends JPanel{
	public Panel() {
		
		///---------------------------Text Area-----------------------------------
		tPane = new JTabbedPane();
		
		
		
		///-----------------------------------------------------------------------
		panelCreator();
		
		add(tPane);
	}
	
	public void panelCreator() {
		window = new JPanel();
		textArea = new JTextPane();
		
		window.add(textArea);
		tPane.addTab("title", window);
	}
	
	
	
	
	
	private JTabbedPane tPane;
	private JPanel window;
	private JTextPane textArea;
}