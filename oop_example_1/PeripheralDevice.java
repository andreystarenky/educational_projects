
public class PeripheralDevice {
 private String connectionType;  //Type of connection to computer
 private double voltageRequired;  //Voltage used by device in V
 private double currentRequired;  //Current used by device in mAh    
 private String compatibleSystems; //Systems that device is compatible with
 private String deviceType;   //Type of device
 private String deviceName;   //Name of device
 private boolean isConnected;  //Whether or not device is connected

 
 /**
  * @param ct is the connection type
  * @param vr is the voltage required 
  * @param cr is the current required
  * @param cs is the compatible systems
  * @param dt is the device type
  * @param dn is the device name
  */
 public PeripheralDevice(String ct, double vr, double cr, String cs, String dt, String dn) {
  connectionType = ct;
  voltageRequired = vr;
  currentRequired = cr;
  compatibleSystems = cs;
  deviceType = dt;
  deviceName = dn;
  isConnected = true;   //When device is added, it is assumed it is connected
 }
 
 public PeripheralDevice() {  //Default constructor
  connectionType = "";
  voltageRequired = 5;
  currentRequired = 100;
  compatibleSystems = "Windows,MacOS,Linux"; //Default systems
  deviceType = null;
  deviceName = "Device1";  //Default device name
  isConnected = true;
 }
 
 public void disconnect() {  //Disconnects device
  isConnected = false;
 }

 public void reConnect() {  //Reconnects the device
  isConnected = true;
 }

 public String getConnectionType() {  //Returns Connection Type
  return connectionType;
 }

 public double getVoltage() {    //Returns voltage
  return voltageRequired;
 }

 public double getCurrent() {   //Returns current
  return currentRequired;
 }

 public String getCompSystems() {  //Returns compatible systems
  return compatibleSystems;
 }

 public String getDeviceType() {   //Returns device type
  return deviceType;
 }

 public String getDeviceName() {   //Returns device name
  return deviceName;
 }

 /**
  * @param dn is the device name
  */
 public void setDeviceName(String dn) { //Returns Device name
  dn = deviceName;
 }

 public boolean isConnected() {   //Checks if device is connected
  return isConnected;
 }
}