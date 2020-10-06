/*
 Write a program to count number of bytes in a image file(jpeg/png/gif).  
 Also find how much time it will take to upload the file on server if internet speed is 256 bps(bits per second).*/

package p1;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
 
 
public class Q65 {
	public static void main(String[] args) throws IOException{
		String dirName="C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots";
		ByteArrayOutputStream baos=new ByteArrayOutputStream(1000);
		BufferedImage img=ImageIO.read(new File(dirName,"dip.png"));
		ImageIO.write(img, "jpg", baos);
		baos.flush();
 
		String base64String=Base64.encode(baos.toByteArray());
		baos.close();
 
		byte[] bytearray = Base64.decode(base64String);
 
		BufferedImage imag=ImageIO.read(new ByteArrayInputStream(bytearray));
		ImageIO.write(imag, "jpg", new File(dirName,"snap.jpg"));
	}
}
