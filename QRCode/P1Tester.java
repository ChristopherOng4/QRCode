import javax.swing.*;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;

public class P1Tester {

	public class P1Tester extends JFrame {
	    static int[][] grid = null;

	    public void paint(Graphics g) {
	        int row, col, x, y;
	        final int HEIGHT = 6;

	        for (row = 0; row < grid.length; row++) {
	            for (col = 0; col < grid[row].length; col++) {
	                x = col * HEIGHT;
	                y = row * HEIGHT;

	                if (grid[row][col] == 3)
	                    g.setColor(Color.BLACK);
	                else if (grid[row][col] == 2)
	                    g.setColor(Color.WHITE);
	                else if (grid[row][col] == 1)
	                    g.setColor(Color.WHITE);
	                else
	                    g.setColor(Color.BLACK);

	                g.fillRect(x, y, HEIGHT, HEIGHT);
	            }
	        }
	    }

	    private static void setGrid(int[][] matrix) {
	        grid = matrix;
	    }
	    @SuppressWarnings("static-access")
	    public static void main(String args[]) {

	        QRCode qrc = new QRCode();
	        final int DEFAULT_SEED = 160;
	        final int DEFAULT_DIMENSION = 30;
	        int[] pattern = null;
	        int seed ;
	        int dim ;
	        
	       	QRCode QR = new QRCode();
	       	pattern = QR.createPattern(4,3);
	       	System.out.println(pattern);
	    }

	        grid = qrc.getGrid();

	        // Build the jFrame for visualization
	        P1Tester qrcode = new P1Tester();
	        qrcode.setGrid(grid);
	        // qrcode.setExtendedState(JFrame.MAXIMIZED_BOTH);
	        qrcode.setUndecorated(true); // <-- the title bar is removed here
	        qrcode.setTitle("QR Code");
	        qrcode.setSize(368, 374);
	        qrcode.setDefaultCloseOperation(qrcode.EXIT_ON_CLOSE);
	        qrcode.setVisible(true);
	    }
	}
	

}
