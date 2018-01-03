public class MyClass {
    public static void main(String args[]) {
    permute("namer");
    }
    public static void permute(String name){
        permute("", name);
    }
    private static void permute(String prefix, String name){
        int n= name.length();
        if(n == 0 ){
            System.out.println(prefix);
        }else{
            for(int i=0;i<n;i++)
                permute(prefix + name.charAt(i), name.substring(0,i) + name.substring(i+1,n));
        }
    }
}

