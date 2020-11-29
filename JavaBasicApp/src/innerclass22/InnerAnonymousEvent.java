package innerclass22;

import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InnerAnonymousEvent extends JFrame{
	
	JButton button1, button2, button3;
	
	ActionListener handler = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	};
	public InnerAnonymousEvent() {
		setTitle("내부 익명 클래스로 이벤트 처리하기");
		setLayout(new FlowLayout());	

		add(button1 = new JButton("1st Button"));
		add(button2 = new JButton("2nd Button"));
		add(button3 = new JButton("3rd Button"));
		//익명 클래스로 윈도우 종료 이벤트 처리]
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});

		//익명 클래스로 버튼의 이벤트 처리]
		/*button1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button1, "첫번째 버튼 클릭");
			}
		});
		button2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button2, "두번째 버튼 클릭");				
			}
		});
		button3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button3, "세번째 버튼 클릭");
			}
		});
		*/
		//방법2]
		button1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button1, "첫번째 버튼 클릭");
			}
		});
		button2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button2, "두번째 버튼 클릭");				
			}
		});
		button3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button3, "세번째 버튼 클릭");
			}
		});
		
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new InnerAnonymousEvent(); 
	}

}
