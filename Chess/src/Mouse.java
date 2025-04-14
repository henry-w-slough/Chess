import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

public class Mouse implements MouseInputListener{

    Point mousePosition;

    public Mouse() {

        mousePosition = new Point(0, 0);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: " + e.getPoint());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed at: " + e.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released at: " + e.getPoint());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered component at: " + e.getPoint());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited component at: " + e.getPoint());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse dragged to: " + e.getPoint());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mousePosition = e.getPoint();
    }
    
}
