package md.tekwill.exercises.inputoutput;

public class TheTwelveDaysOfChristmass {
    public static void main(String[] args) {
        for (int i = 1; i<=12;i++){
            System.out.print("On the ");
            switch (i){
                case 1:
                    System.out.print("first day of Christmas\n" +
                            "My true love gave to me\n");
                    break;
                case 2:
                    System.out.print("second day of Christmas\n" +
                            "My true love gave to me\n");
                    break;
                case 3:
                    System.out.print("third day of Christmas\n" +
                            "My true love gave to me\n");
                    break;
                case 4:
                    System.out.print("fifth day of Christmas\n"+
                            "My true love gave to me\n");
                    break;
                case 5:
                    System.out.print("sixth day of Christmas\n"+
                            "My true love gave to me\n");
                    break;
                case 6:
                    System.out.print("seventh day of Christmas\n"+
                            "My true love me\n");
                    break;
                case 8:
                    System.out.print("eighth day of Christmas\n"+
                            "My true love gave me\n");
                    break;
                case 9:
                    System.out.print("ninth day of Christmas\n"+
                            "My true love gave me");
                    break;
                case 10:
                    System.out.print("tenth day of Christmas");
                    break;
                case 11:
                    System.out.print("eleventh day of Christmas");
                    break;
                case 12:
                    System.out.print("twelfth day of Christmas");
                    break;
            }
            switch (i){
                case 12 :
                    System.out.println(
                            "12 drummers drumming");
                case 11:
                    System.out.println(
                            "Eleven pipers piping") ;
                    case 10:
                    System.out.println(
                            "Ten lords a leaping");
                case 9:
                    System.out.println(
                            "Nine ladies dancing");
                case 8:
                    System.out.println(
                            "Eight maids a milking");
                case 7:
                    System.out.println(
                            "Seven swans a swimming");
                case 6:
                    System.out.println(
                            "Six geese a laying");
                case 5:
                    System.out.println(
                            "Five gold rings, badam-pam-pam");
                case 4:
                    System.out.println(
                            "Four calling birds");
                case 3:
                    System.out.println(
                            "Three French hens");
                case 2:
                    System.out.println(
                            "Two turtle doves");
                case 1:
                    System.out.println(
                            "And a partridge in a pear tree");
            }
        }
    }
}
