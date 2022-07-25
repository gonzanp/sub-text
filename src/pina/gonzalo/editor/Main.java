package pina.gonzalo.editor;

import javax.swing.*;


public class Main {
	public static void main(String [] args) {
		Window window = new Window();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
 
class Window extends  JFrame{
	public Window() {
		setBounds(300,300,300,300);
		setTitle("Sub text");
		add(new Panel());
		
	}
	
}

class Panel extends JPanel{
	public Panel() {

	}
	
}