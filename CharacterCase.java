public class CharacterCase {
    public static void main(String[] args){
        char ch='a';
        if(ch>='a' && ch<='z'){
            System.out.println(ch +"->"+ Character.toUpperCase(ch));
        }else if(ch>='A' && ch<='Z'){
            System.out.println(ch +"->"+ Character.toLowerCase(ch));
        }else{
            System.out.println("Invalid Character");
        }
    }
}
