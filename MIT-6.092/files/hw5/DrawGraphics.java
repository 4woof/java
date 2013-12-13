import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    //BouncingBox box;
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
//        ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
        boxes.add(new BouncingBox(200, 50, Color.RED)); //.setMovementVector(10, -10));
        boxes.add(new BouncingBox(50, 200, Color.BLUE));//.setMovementVector(0, 5));
        boxes.add(new BouncingBox(125, 125, Color.GREEN)); //.setMovementVector(1, 3));
//        box = new BouncingBox(200, 50, Color.RED);
//        box.setMovementVector(10,-10);

        boxes.get(0).setMovementVector(10, -10);
        boxes.get(1).setMovementVector(0, 5);
        boxes.get(2).setMovementVector(1, 3);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
//        surface.drawLine(50, 50, 250, 250);
        surface.setColor(Color.lightGray);
        surface.drawOval(20, 20, 50, 100);
        surface.fill3DRect(60, 150, 80, 70, true);
        surface.drawString("Assignment part 1 complete", 25, 250);
//        box.draw(surface);

        for (BouncingBox box: boxes){
            box.draw(surface);
        }
    }
} 
