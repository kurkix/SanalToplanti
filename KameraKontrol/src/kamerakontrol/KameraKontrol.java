/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kamerakontrol;

import org.opencv.videoio.VideoCapture;
import org.opencv.core.Core;
import org.opencv.core.Mat;

/**
 *
 * @author Burak
 */

public class KameraKontrol {
      static {
                // Load the native OpenCV library
		System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        // TODO code application logic here
        VideoCapture cap = new VideoCapture(0);

		// Check if video capturing is enabled
		if (!cap.isOpened()) {
			System.exit(-1);
		}

		// Matrix for storing image
		Mat image = new Mat();
		// Frame for displaying image
		MyFrame frame = new MyFrame();
		frame.setVisible(true);

		// Main loop
		while (true) {
			// Read current camera frame into matrix
			cap.read(image);
			// Render frame if the camera is still acquiring images
			if (image != null) {
				frame.render(image);
			} else {
				System.out.println("No captured frame -- camera disconnected");
				break;
			}
		}
    }
    
}
