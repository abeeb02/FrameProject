import javax.swing.*;
import java.awt.*;

class FrameProject extends JFrame {
   int x, y, h, w, x2, y2, r;
   double a, angle, count;
   
   FrameProject() {   
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
    public static void main(String args[]) {
          new FrameProject();
    }
}


