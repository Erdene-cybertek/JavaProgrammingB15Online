package day16_Must_Practice;

public class SecondWordGetter {

    public static void main(String[] args) {

        //                01234567890
        String sentence= "I love Java";
        String secondWord;

        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);
        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);
        System.out.println( sentence.substring(2, 6));
       
       
        secondWord = sentence.substring(firstSpaceIndex +1 , lastSpaceIndex );
        System.out.println( "secondWord = "+secondWord);

        // 2 dah ugiig tasalj avhad sentence.substring(); gej avsan ni deer.  
        
        String firstWord = sentence.substring(0, firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);
        
        String lastWord = sentence.substring(lastSpaceIndex + 1 );
        System.out.println("lastWord = " + lastWord);
        
        
        
        
        
    }
}
