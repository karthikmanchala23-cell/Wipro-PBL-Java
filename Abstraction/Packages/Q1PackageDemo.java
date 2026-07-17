package Abstraction.Package;

public class Q1PackageDemo {

    public static void main(String[] args) {

        Abstraction.Package.Q1Foundation obj = new Q1Foundation();

        // System.out.println(obj.var1); // Private - Not Accessible
        // System.out.println(obj.var2); // Default - Not Accessible
        // System.out.println(obj.var3); // Protected - Not Accessible

        System.out.println("Public Variable : " + obj.var4);
    }

    private static class Q1Foundation extends Abstraction.Package.Q1Foundation {
    }
}