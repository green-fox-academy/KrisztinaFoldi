public class Cuboid {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000
    // v= a*b*c
    // A= 2*(a*b + a*c + b*c)
    public static void main(String[] args) {
        double length = 20;
        double height = 10;
        double width = 5;
        System.out.println("Volume: " + ( length * height * width));
        System.out.println("Surface Area: " + (2*(length*height + length*width + height*width)));
    }
}
