
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String args[]){
    Trie t = new Trie();
    
    String strArray[] = {"apples","oranges","bananas","apricot","gauva","papaya","watermelon","melon","pineapple","applepine","gatorade","gatorlocator","gator","gogators","beer","paplet","grapes"}; 
    System.out.print("Inserting..... ");
    for(String a:strArray){
        System.out.print(a+" \n");
        t.insert(a);    
    }
    System.out.println();
    System.out.println("Found gauva? "+t.find("gauva"));
    System.out.println("Found apple? "+t.find("apple"));
    System.out.println("Found apples? "+t.find("apples"));
    System.out.println("Found pine? "+t.find("pine"));
    
    System.out.println("Autocompleting ap? ");
    t.autoComplete("ap");
    System.out.println("================================");
    System.out.println("Autocompleting nic? ");
    t.autoComplete("nic");
    System.out.println("=================================");
    System.out.println("Autocompleting p? ");
    t.autoComplete("p");
    System.out.println("=================================");
    
}
}
