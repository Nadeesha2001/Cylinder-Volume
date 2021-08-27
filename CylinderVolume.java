import java.util.Scanner;

class CylinderVolume {

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in);

        System.out.println("Enter Radius");
        Double r = Values.nextDouble();

        System.out.println("Enter High");
        Double h = Values.nextDouble();

        Double volume = Math.PI * Math.pow(r, 2) * h;
        System.out.println("Your Cylinder Volume is" + " " + volume);
    }
}
