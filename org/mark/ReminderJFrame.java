package org.mark;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
public class ReminderJFrame extends JFrame{
	
	public ReminderJFrame(int height,int weight){
		setVisible(true);
		setSize(height,weight);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JLabel lab=new JLabel("Please take a rest",JLabel.CENTER);
        setAlwaysOnTop(true);
        add(lab);
	}

}
/*
class size{

	private static int HEIGHT;
	private static int WEIGHT;
	public size(int h,int w){
		setSize(h,w);
	}
	public void setSize(int height,int weight){
		HEIGHT=height;
		WEIGHT=weight;
	}
	public int getHeight(){
		return WEIGHT;
	}
	public int getWeight(){
		return HEIGHT;
	}

}*/