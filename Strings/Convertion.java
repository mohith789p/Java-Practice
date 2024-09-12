public class Convertion {
    public static void main(String[] args) {
        String num = "12345";
        int n = Integer.valueOf(num);
        System.out.println("integer: " + n);
        float nf = Float.valueOf(n);
        System.out.println("Float: " + nf + " (from int)");
        float nfs = Float.valueOf(num);
        System.out.println("Float: " + nfs + " (from String)");
        double nd = Double.valueOf(nfs);
        System.out.println("Double: " + nd + " (from float)");
        String ns = String.valueOf(nd);
        System.out.println("String: " + ns + " (from double)");
        ns = ns+"abcd";
        System.out.println("String: " + ns + " (after adding)");

    }
}
