public class finalkeyword {
    int getNextNo(int n){
        try {
            if (n == 5) {
                return n + 1;
            }
        }
        finally {
            System.out.println("this is import code");
        }
        return  n-1;
    }
    public static void main(String[] args){
        finalkeyword obj = new finalkeyword();
        System.out.println(obj.getNextNo(5));
    }
}
