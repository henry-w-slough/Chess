

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

public class Mouse implements MouseInputListener{

    int[] mousePosition;

    public Mouse() {

        mousePosition = new int[]{0, 0};
    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }


    @Override
    public void mousePressed(MouseEvent e) {

    }


    @Override
    public void mouseReleased(MouseEvent e) {

    }


    @Override
    public void mouseEntered(MouseEvent e) {
    }


    @Override
    public void mouseExited(MouseEvent e) {

    }


    @Override
    public void mouseDragged(MouseEvent e) {
        mousePosition[0] = e.getX();
        mousePosition[1] = e.getY();

        
        System.out.println("Pos: (" + mousePosition[0] + ", " + mousePosition[1] + ")");

    }


    @Override
    public void mouseMoved(MouseEvent e) {

    }



    
}
