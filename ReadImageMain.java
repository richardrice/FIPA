
package imageproj;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReadImageMain {
	
	public static void main(String[] args){
		
		File originalImage = new File("/Users/richardrice/Pictures/Marshland2.jpg");
		
		BufferedImage img = null;
		try {
			img = ImageIO.read(originalImage);
			
			BufferedImage grayscaleImage = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
			
			for (int i =0;i< img.getWidth();i++){
				for(int j=0;j<img.getWidth();j++)
				{
					Color c = new Color(img.getRGB(j, i));
					int r = c.getRed();
					int g = c.getGreen();
					int b = c.getBlue();
					int a = c.getAlpha();
					
					
					int gr = (r + g+ b) /3;
					
					Color gColor = new Color(gr, gr, gr,a);
					grayscaleImage.setRGB(j, i, gColor.getRGB());
					
				}
			}
			ImageIO.write(grayscaleImage, "grayscale.jpg", new File ("/Users/richardrice/Pictures"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
