public class Articles {

    public static void main(String[] args) {
        System.out.println(foo("Kidderminster Times and Advertiser for Bewdley & Stourport"));
        System.out.println(foo("Lincolnshire Free Press"));

    }

    public static String foo(String inputString){

        if(inputString.length() > 25){
            if(Character.toString(inputString.charAt(25)).equals(" ")) {
                inputString = inputString.substring(0,25) + "...";
            } else {
                for(int i = 26; i > 0; i--){
                    if(Character.toString(inputString.charAt(i)).equals(" ")){
                        inputString = inputString.substring(0, i) + "...";
                        break;
                    }
                }
            }

        } else {
            inputString = inputString + "...";
        }

        return inputString;
    }
}
