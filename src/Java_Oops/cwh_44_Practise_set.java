package Java_Oops;
class cylinder{
    private float radius;
    private float height;

    public float getRadius(){
        return radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getheight(){
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public double Surface_Area(){
        return 2*3.14* radius* height + 2*3.14* radius* radius;
    }
    public double Volume(){
        return 3.14*radius*radius*height;
    }

}
public class cwh_44_Practise_set {
    public static void main(String[] args) {


        cylinder myTank = new cylinder();
        myTank.setHeight(15);
        float h = myTank.getheight();
        System.out.println("The Height id Cylinde is : " +myTank.getheight());
        myTank.setRadius(12);
        System.out.println("The Radius of cylinder is : " +myTank.getRadius());

        System.out.println("The surface are of cylinder is " +myTank.Surface_Area());
        System.out.println("The Volume of Cylinder is "+ myTank.Volume());
    }

}
