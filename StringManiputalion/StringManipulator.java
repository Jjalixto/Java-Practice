package StringManiputalion;

public class StringManipulator {

    // String trimAndConcat(String A, String B){
    //     String tb = A.trim();
    //     String tc = B.trim();
    //     String result = tb.concat(tc);
    //     return result;
    // }

    // int getIndexOrNull(String D, char E){ 
    //     int result = D.indexOf(E);
    //     return result;
    // }

    String concatSubstring(String F, int G, int H, String I){
        String subcadena = F.substring(G,H);
        return subcadena+I;
    }   
}

