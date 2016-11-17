import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FrameOne implements ItemListener{
	
	FrameOne(){
		JFrame frame = new JFrame("Frame One");
		JRadioButton buttons[] = {new JRadioButton("Circles", false), new JRadioButton("Regions", false), new JRadioButton("Labels", false)};
		frame.setSize(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(JRadioButton button : buttons){
			frame.add(button);
			button.addItemListener(this);
		}
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}

	public void itemStateChanged(ItemEvent e){
		JRadioButton sel = (JRadioButton)e.getItemSelectable();
		String text = sel.getText();
		if(sel.isSelected()){
			if(text.equals("Circles")){
				// open frame 2
			}else if(text.equals("Regions")){
				// open frame 3
			}else if(text.equals("Labels")){
				FrameFour b = new FrameFour();
			}
		}
	}
	
	public static void main(String[] args){
		FrameOne a = new FrameOne();
		new FrameTwo();
	}
}

class FrameFour implements ActionListener{
	private int count;
	private Panel pane;
	private String[] txt = {"Too expensive", "Too flimsy", "Too bulky", "Too feminine", "Too masculine"};
	
	FrameFour(){
		JFrame frame = new JFrame("Frame Four");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		pane = new Panel();
		JButton button = new JButton("");
		button.addActionListener(this);
		frame.add(button, BorderLayout.CENTER);
		frame.add(pane, BorderLayout.EAST);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(count < 5){
				pane.add(new JLabel(txt[count]));
				pane.revalidate();
		}
		count++;
	}	
}

class FrameTwo extends JFrame {
   int x, y, h, w, x2, y2, r;
   double a, angle, count;
   
   FrameTwo() {   
      setSize(800, 800);
      setVisible(true);
      getContentPane().setBackground(Color.white);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
      public void paint(Graphics g) {
      super.paint(g);
      
      x = 100;
      y = 100;
      h = 100;
      w = 100;
      
      g.setColor(Color.orange);
      g.fillOval(x, y, h, w);
      g.setColor(Color.blue);
      r = w/2;
      angle = Math.toDegrees(Math.atan((r/(w/2))));
      count = 360/angle;
      
      for(int i = 1; i < count-1; i ++) {
         x2 = (int)(x + (w * Math.cos(a))+ (r/2));
         y2 = (int)(y + (w * Math.sin(a)) + (r/2));
         g.fillOval(x2, y2, r, r);
         a+=angle;
      }
          
      x = 350;
      y = 350;
      h = 200;
      w = 200;
      
      g.setColor(Color.orange);
      g.fillOval(x, y, h, w);
      g.setColor(Color.blue);
      r = w/2;
      angle = Math.toDegrees(Math.atan((r/(w/2))));
      count = 360/angle;
      
      for(int i = 1; i < count-1; i ++) {
         x2 = (int)(x + (w * Math.cos(a))+ (r/2));
         y2 = (int)(y + (w * Math.sin(a)) + (r/2));
         g.fillOval(x2, y2, r, r);
         a+=angle;
      }
    
    
    }
}


