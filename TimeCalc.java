public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int newHours = ((((hours * 60) + minutes + minutesToAdd) / 60) % 24);
        int newMinutes = ((hours * 60) + minutes + minutesToAdd) - 
                         (((((hours * 60) + minutes + minutesToAdd) / 60)) * 60);
        
        if(newMinutes >= 10){
            if(newHours >= 10){
                System.out.print(newHours + ":" + newMinutes);
            }else{
                System.out.print("0" + newHours + ":" + newMinutes);
            }
            }
            else{
                if(newHours >= 10){
                    System.out.print(newHours + ":0" + newMinutes);
                }else{
                    System.out.print("0" + newHours + ":0" + newMinutes);
                }
            }
        }
}
