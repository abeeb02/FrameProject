import javax.swing.*;
import java.awt.*;

class GUI extends JFrame {
   
   GUI(Flower f) {   
      setSize(900, 600);
      setVisible(true);
      getContentPane().setBackground(Color.white);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(f);
   }
}

class Flower {
   int x, y, h, w, x2, y2, r;
   double c, count, a, angle;
   
   Flower(int x, int y, int h, int w) {
      this.x = x;
      this.y = y;
      this.h = h;
      this.w = w;
   }
   public void paint(Graphics g) {
      super.paint(g);
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
      g.setColor(Color.orange);
      g.fillOval(x, y, h, w);
   }
   
   public static void main(String args[]) {
      Flower f1 = new Flower(100, 200, 50, 50);
      Flower f2 = new Flower(500, 200, 200, 200);
   }
}
