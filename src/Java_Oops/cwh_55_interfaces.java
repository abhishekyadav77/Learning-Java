package Java_Oops;
interface Bicycle{
int a= 34;
    void applyBrake(int decrement);
    void speedUp(int increment);

}
interface HornBicycle{
    void BlowHornk3g(int increment);
    void BlowHorn46(int decrement);

}
class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brakes");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void BlowHornk3g(int decrement){
        System.out.println("kabhi Khushi kabhi gum");
    }
    public void BlowHorn46(int increment){
        System.out.println("Pee Pee Po Po");
    }
}

public class cwh_55_interfaces {
    public static void main(String[] args) {
      AvonCycle abhicy = new AvonCycle();
      abhicy.applyBrake(2);
      // you can create properties in interfaces
      System.out.println(abhicy.a);
      // you cannot modify the properties in interfacws as they are final
        //abhicy.a = 38;  -- error or not modified
        //System.out.println(abhicy.a);


        abhicy.BlowHornk3g(4);
        abhicy.BlowHorn46(6);
    }
}
