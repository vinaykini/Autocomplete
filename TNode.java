public class TNode{
    char letter;
    TNode links[];
    boolean isEnd;
    
    public TNode(char letter){
        this.letter = letter;
        this.links = new TNode[26];
        this.isEnd = false;
    }

    public String toString(){
        return (new String(letter+""));
    }
}