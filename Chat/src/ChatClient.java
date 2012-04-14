import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.*;

public class ChatClient extends Frame {

	/**
	 * @param args
	 */
	TextField tf = new TextField();
	TextArea ta = new TextArea();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatClient().lauchFrame();
		
	}

	public void lauchFrame() {
		setLocation(400, 300);
		this.setSize(300, 300);
		add(tf, BorderLayout.SOUTH);
		add(ta, BorderLayout.NORTH);
		pack();
		// �رմ����¼�,ʹ��������
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		// ��ӻس��¼�
		tf.addActionListener(new CliEnter());
		setVisible(true);
		connect();//���ӷ�����
		// this.addMouseListener(new MouClose());
	}
    public void  connect() {
    	try {
			Socket s = new Socket("127.0.0.1",8888);
System.out.println("connected!");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// �ڲ���,����س��¼�
	private class CliEnter implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = tf.getText().trim();
			ta.setText(s);
			tf.setText("");
		}

	}
}

/*
 * Class MouClose extends MouseAdapter {
 * 
 * }
 */

