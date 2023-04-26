package StringManipulation;

public class Firstnonrepeatedchar {
    public static void main(String[] args) {
        String word="annotations";
        for (int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            boolean repeat=false;
            for(int j=0;j<word.length();j++) {
                if(ch==word.charAt(j) && i!=j) {
                    //System.out.println(ch + " repeated");
                    repeat = true;
                    break;
                }
            }
            if(repeat==false){
                System.out.println(ch+" not repeated");
                break;
            }
        }
    }
}
