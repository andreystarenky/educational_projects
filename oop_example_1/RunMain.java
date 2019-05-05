public class RunMain {
 public static void main(String[] args) {
  PeripheralDevice PD = new PeripheralDevice("USB",6,100,"Windows,Mac","mouse", "Logitech 400");
  OutputDevice OD = new OutputDevice("LCD Monitor", 1920,1080,480.5,270.2,true);
  //PeripheralDevice Methods
  System.out.println("Device "+PD.getDeviceName()+" is now connected");
  System.out.println("Voltage: "+PD.getVoltage()+'V');
  System.out.println("Current: "+PD.getCurrent()+"mAh");
  System.out.println("Compatible Systems: "+PD.getCompSystems());
  System.out.println("Device Type: "+PD.getDeviceType());
  System.out.println("Connection Type: "+PD.getConnectionType());
  System.out.println("Device connected? "+ PD.isConnected());
  PD.disconnect();
  System.out.println("Device "+PD.getDeviceName()+" is now disconnected");
  PD.reConnect();
  System.out.println("Device "+PD.getDeviceName()+" is now connected");
  //OuputDevice Methods
  System.out.println(OD.getDeviceName()+" is now connected");
  System.out.println("Display Type: "+OD.getDisplayType());
  System.out.println("Resolution: "+OD.getResolutionWidth()+" x " +OD.getResolutionHeight());
  System.out.println("Screen Size: "+OD.getScreenWidth()+" cm by "+OD.getScreenHeight()+" cm");
  System.out.println("Needs external power source?: "+OD.isNeedsExternalPowerSource());
  OD.cropResolution(1280, 720);
  System.out.println("Resolution cropped to "+OD.getResolutionWidth()+" x " +OD.getResolutionHeight());
 }
 
}
