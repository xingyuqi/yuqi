package gui.yuqi.com;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class MouseYq {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YFrame  f = new YFrame() ;
		f.launchFrame();
	}
}

class YFrame extends Frame {
	public void launchFrame() {
		setBounds(200,200,640,480);
		this.addMouseListener(new MouseMon()) ;
		setVisible(true);
	}
	
	}

class MouseMon extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseClicked(e);
		System.out.println("111");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseDragged(e);
	}

	
}
