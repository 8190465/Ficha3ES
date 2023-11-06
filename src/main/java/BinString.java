public class BinString{


    public String convert(String s){
        return binarise(sum(s));
    }

    public int sum(String s){
        if(s == "") return 0;
        if (s.length() == 1) return ((int) s.charAt(0));
        return (((int) s.charAt(0))) + sum(s.substring(1));
    }

    public String binarise(int x) {
        if (x == 0) return "0";
        String binary = "";

        while (x > 0) {
            int bit = x % 2;
            binary = bit + binary;
            x /= 2;
        }

        return binary;
    }
}