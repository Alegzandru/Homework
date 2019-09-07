package Homework;

public class CharList {


    public static void main(String[] args) {
        CharList list = new CharList();
        list.printChars('1', 'Z', 10);

    }


    public void printChars(char ch1, char ch2, int numberPerLine) {
        int t = (int)ch1;
        int i =1;

        for (int n = (int)ch1; n <= (int)ch2; n++) {
                System.out.print((char)t+" ");
                t++;
                i++;
                if (i%numberPerLine==0)
                    System.out.println("  ");
            }

        }

    }
