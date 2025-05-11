import java.util.Scanner;

public class SentenceToWords {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int spaceIndex,length;
        String word;
        String updatedSentence;

        System.out.println("Enter a sentence");
        String sentence= sc.nextLine();
        sentence=sentence.trim();

        while(!sentence.isEmpty()){

            spaceIndex=sentence.indexOf(" ");

            if(spaceIndex!=-1){

                word=sentence.substring(0,spaceIndex);
                System.out.println(word);

                length=sentence.length();
                sentence=sentence.substring(spaceIndex,length).trim();
            }
            else{
                System.out.println(sentence);
                sentence="";
            }

        }

    };
}

