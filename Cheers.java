// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args){
        String name = args[0].toUpperCase();
        int repeat = Integer.parseInt(args[1]);
        String chars = "AEFHILMNORSX";
        for(int i = 0; i < name.length(); i++){
            if(chars.indexOf(name.charAt(i)) >= 0){
                   System.out.println("Give me an " + name.charAt(i) + ": " + 
                                      name.charAt(i) + "!");
            }else{
                System.out.println("Give me a " + name.charAt(i) + ": " + 
                                      name.charAt(i) + "!");
            }
        }
        System.out.println("What does that spell?");
        for(int i = 0; i < repeat; i++){
            System.out.println(name + "!!!");
        }

    }
}
