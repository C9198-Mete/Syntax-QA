package project1;

public class Task11 {
    public static void main(String[] args) {

        String[] words={"Fener","Bahce","Bahce","Kexzman","Anelka","Anelka"};


        for (int i = 0; i < words.length ; i++) {
            for (int j = i+1; j < words.length ; j++) {
                if (words[i].equals(words[j])){
                    System.out.println(words[i]);
                }


            }
            
        }

        }
    }

