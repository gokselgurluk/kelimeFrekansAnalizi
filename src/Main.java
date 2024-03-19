import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Metni Giriniz");
        String text = input.nextLine();
        String[] arrayText = text.split(" ");

        HashMap<String, Integer> hashMap = new HashMap<>();
        int count = 1;
        for (int i = 0; i < arrayText.length; i++) {

            if(!hashMap.containsKey(arrayText[i])){
                hashMap.put(arrayText[i],count);
            }else{
                hashMap.put(arrayText[i],hashMap.get(arrayText[i])+1);
            }
            // aşagıdaki kod satırı yukarı da bulunan if else kod blogu ile aynı işleve sahip
           // hashMap.put(arrayText[i], hashMap.getOrDefault(arrayText[i],0)+1);
        }
        String mostMentionedWord =null ;
        int wordCount =0;
       for(Map.Entry<String ,Integer> entry :hashMap.entrySet()){
           String key = entry.getKey();
           int value = entry.getValue();
           if(wordCount<value){
               mostMentionedWord=key;
               wordCount=value;

           }
       }
        System.out.println("En çok geçen kelime:  "+mostMentionedWord+"\nGeçtigi sayı: "+wordCount);
    }
}
