
public class OutputDevice extends PeripheralDevice{
 private String displayType;  //Type of display
 private int resolutionWidth; //Resolution width in pixels
 private int resolutionHeight; //Resolution height in pixels
 private double screenWidth;  //Width of screen in cm
 private double screenHeight; //Height of screen in cm
 private boolean needsExternalPowerSource; //Whether or not the output device uses an external power source
 
 /**
  * @param dt is the display type
  * @param rw is the resolution width
  * @param rh is the resolution height
  * @param sw is the screen width
  * @param sh is the screen height
  * @param ep is the needsExternalPowerSource
  */
 public OutputDevice(String dt, int rw, int rh, double sw, double sh, boolean ep) {
  displayType=dt;
  resolutionWidth=rw;
  resolutionHeight=rh;
  screenWidth=sw;
  screenHeight=sh;
  needsExternalPowerSource=ep;
 }
 
 public OutputDevice() {
  displayType="LCD Monitor";
  resolutionWidth=1280;
  resolutionHeight=720;
  screenWidth=240.2;
  screenHeight=135.1;
  needsExternalPowerSource=true;
 }
 
 /**
  * @param w is the resolution width
  * @param h is the resolution height
  */
 public void cropResolution(int w,int h) {   //Crops display
   resolutionWidth=w;
   resolutionHeight=h;
 }
 
 public String getDisplayType() {  //Returns displayType
  return displayType;
 }

 public int getResolutionWidth() {  //Returns resolutionWidth
  return resolutionWidth;
 }

 public int getResolutionHeight() {  //Returns resolutionHeight
  return resolutionHeight;
 }

 public double getScreenWidth() {  //Returns screenWidth
  return screenWidth;
 }

 public double getScreenHeight() {
  return screenHeight;    //Returns screenHeight
 }

 public boolean isNeedsExternalPowerSource() { //Returns needsExternalPowerSource
  return needsExternalPowerSource;   
 }
 
}
