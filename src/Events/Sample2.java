package Events;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AwtThree extends Frame implements ActionListener{
	public AwtThree() 
	{
		setSize(500,500);
		Button b=new Button("Quit");
		b.setBounds(100, 100,100,30);
		add(b);
		b.addActionListener(this);
		setLayout(null);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AwtThree();

	}

}
