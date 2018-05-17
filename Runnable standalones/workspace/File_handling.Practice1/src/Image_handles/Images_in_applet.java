package Image_handles;

/*
 * <applet code="Images_in_applet.class" codebase="file:///C|/Users/Aloy/workspace/File_handling.Practice1/src/Image_handles/" name="IMAGE applet" width=248 height=146 align="middle" id="IMAGE applet">
   <param name="img" value="C:\Users\Aloy\Pictures\00267_graf_1280x960.jpg">
  </applet>
 */
import java.awt.*;
import java.applet.*;

public class Images_in_applet extends Applet
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Image img;

  public void init() {
    img = getImage(getDocumentBase(), getParameter("img"));
  }

  public void paint(Graphics g) {
    g.drawImage(img, 0, 0, this);
  }
}
