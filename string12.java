package stringpackage1;
//b.bhanu vara prasad
//210303126079
//19 division
public class string12 {
    //InternExample{
        public static void main(String args[]){
            String s1=new String("hello");
            String s2="hello";
            String s3=s1.intern();
            System.out.println(s1==s2);
            System.out.println(s2==s3);
        }
}


