package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {
        
        int [] ages = new int [] {3,5,11,33,57,18};

        for (int i = 0; i < ages.length; i++) {

            System.out.println(ages[i]);
        }
        
        int [] areaCode = { 703, 300, 954 , 665};

        for (int x = 0; x < areaCode.length ; x++) {

            System.out.println("areCode[x] = " + areaCode[x]);
        }
    }
    
}
