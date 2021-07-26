import java.util.HashMap;
import java.util.Map;

public class Dictionaries {
    public static void main(String[] args){
        // English to Spanish Dictionary
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        //putting things inside our dictionary
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday","Martes");
        englSpanDictionary.put("Wednesday","Miercoles");
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday","Sabados");
        englSpanDictionary.put("Sunday","Domingos");

        //retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.get("Saturday"));
        System.out.println(englSpanDictionary.get("Sunday"));
        //print out all keys
        System.out.println(englSpanDictionary.keySet());
        //print out all values
        System.out.println(englSpanDictionary.values());
        //Print out size
        System.out.println("The size of our dictionary is " + englSpanDictionary.size());

        System.out.println();
        System.out.println();

        //SHOPPING LIST
        Map<String,Boolean>shoppingList = new HashMap<String,Boolean>();
        //putting values inside our map
        shoppingList.put("bread", true);
        shoppingList.put("nuts", false);
        shoppingList.put("sugar", false);
        shoppingList.put("chocolate", true);
        shoppingList.put("flour", false);
        //retrieve items
        System.out.println(shoppingList.get("bread"));
        System.out.println(shoppingList.get("sugar"));
        //key-value pairs print out
        System.out.println(shoppingList.toString());
        //is empty?
        System.out.println(shoppingList.isEmpty());
        shoppingList.remove("sugar");
        //replace values for a certain key
        shoppingList.replace("bread", false);
        //key-value pairs print out
        System.out.println(shoppingList.toString());
        //clear our dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        //is empty?
        System.out.println(shoppingList.isEmpty());
        //remove things






    }
}

