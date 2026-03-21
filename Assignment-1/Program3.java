class Program3 {
    public static void main(String[] args) {

        // Wrapper Class Demo
        int x = 10;

        Integer obj = Integer.valueOf(x);   // Boxing
        int y = obj.intValue();             // Unboxing

        System.out.println("Primitive value: " + x);
        System.out.println("Wrapper object: " + obj);
        System.out.println("Unboxed value: " + y);

        // String vs StringBuffer
        String s = "Hello";
        s.concat(" World");   // does not change original string
        System.out.println("\nString after concat: " + s);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  // modifies original object
        System.out.println("StringBuffer after append: " + sb);
    }
}
