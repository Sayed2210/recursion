public class recursion {
    public static void main(String[] args) {
        System.out.println(add(10));
    }
    public static int add(int a){
        if(a !=0) return a+add(a-1);
        return 0;
    }
}
