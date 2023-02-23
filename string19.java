package stringpackage1;
//b.bhanu vara prasad
//210303126079
//19 division
public class string19 {
    // SplitExample{
    public static void main(String args[]){
        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");

        for(String w:words){
            System.out.println(w);
        }
    }
}

