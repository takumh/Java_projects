import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dictionaryIN {
    public static void main(String[] args) {

            Map<String,Integer> phoneBook = new HashMap<String,Integer>();
            Scanner sc = new Scanner (System.in);
            int length = sc.nextInt();
            for (int i = 0; i < length; i++){
                String name = sc.next();
                int num = sc.nextInt();
                phoneBook.put(name, num);
            } while(sc.hasNext()){
                String s = sc.next();
                Integer phoneNumber = phoneBook.get(s);
                System.out.println(
                        (phoneNumber != null)
                                ? s + "=" + phoneNumber
                                : "Not found"
                );
            }
            sc.close();
        }
    }



