package Java_Oops;

interface mycamera{
    void takesnap();
    void recordvid();
    default void record4K(){
        System.out.println("Recording in 4K");
    }
}
interface mywifi{
    String[] getnetworks();
    void connectToNetworks(String network);
}

class mycellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }

}
class mySmartphone extends mycellphone implements mywifi , mycamera{
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
public class cwh_57_default_methods {
    public static void main(String[] args) {
        mySmartphone ms = new mySmartphone();
        String[] ar = ms.getnetworks();

         for(String item: ar){
             System.out.println(item);
         }

    }
}
