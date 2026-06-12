package Java_Oops;
interface mycamera3{
    void takesnap();
    void recordvid();
    default void record4K(){
        System.out.println("Recording in 4K");
    }
}
interface mywifi3{
    String[] getnetworks();
    void connectToNetworks(String network);
}

class mycellphone3{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }

}
class mySmartphone3 extends mycellphone3 implements mywifi3 , mycamera3{
    public void takesnap(){
        System.out.println("Taking Snap");
    }
    public void recordvid(){
        System.out.println("Recording Video");
    }
    public String[] getnetworks(){
        System.out.println("Getting List of networks");
        String[] networkList = {"Abhishek","Wifi5G", "K2K4G"};
        return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("Connecting to" +network);
    }

}
public class cwh_59_polymorphism {

    public static void main(String[] args) {

mycamera3 cm= new mySmartphone3();  // this is smartphone but use it as camera only
//  cm.getNetworks(); // not allowed
    cm.record4K(); //--it is running
    mySmartphone3 s = new mySmartphone3();
    s.getnetworks();
    s.takesnap();
    s.callNumber(87);

    }

}
