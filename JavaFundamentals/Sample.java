public class Sample{
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("Please provide one number as command line argument");
            return;
        }
        System.out.println("Welcome "+ args[0]);
    }
}