import edu.duke.*;
import java.io.*;

public class GrayScaleConverter {
    
    public ImageResource makeGray(ImageResource inImage) {
        
        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
        
        for (Pixel px: outImage.pixels()) {
            
            Pixel inPixel = inImage.getPixel(px.getX(), px.getY());
            
            int average = (inPixel.getRed() + inPixel.getBlue() + inPixel.getGreen())/3;
            
            px.setRed(average);
            px.setBlue(average);
            px.setGreen(average);
            
            
    }
    
    return outImage;
}
 public void selectAndConvert() {
     DirectoryResource dr = new DirectoryResource();
     for (File f: dr.selectedFiles()){
         ImageResource inImage = new ImageResource(f);
         ImageResource gray = makeGray(inImage);
         gray.draw();
}
}
}
