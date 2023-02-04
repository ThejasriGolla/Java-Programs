//Write a Java method to display the middle character of a string.
public class MiddleChar {
    public static void main(String[] args) {
        String str = "thejasr";
        char[] name = str.toCharArray();
        int mid = name.length/2;
        if (mid%2==0) {
            System.out.println(name[mid-1] + " " + name[mid]);
        }
        else {
            System.out.println(name[mid]);
        }
    }
}