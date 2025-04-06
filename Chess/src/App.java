
import javax.swing.JFrame;

public class App {
// Main driver method
    public static void main(String[] args)
    {
    	JFrame window = new JFrame();
    	
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	window.setResizable(false);
    	window.setTitle("Chess");
    	

    	//setting gamePanel "on top" of physical window
    	GamePanel gamePanel = new GamePanel();

    	window.add(gamePanel);
    	window.pack();
    	window.setLocationRelativeTo(null);
    	window.setVisible(true);
    
    	


    	while (gamePanel.gameThread != null) {
    		gamePanel.run();
    	}
    	
    	
    	
    	
    	
    	
    }


	





}
