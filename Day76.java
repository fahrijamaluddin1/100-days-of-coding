public class Day76 {
    public static void main(String[] args) {
        String teks = " Fahri jamaluddin ";
        String rapi = teks.trim();
        System.out.println("setelah trim  : [" + rapi + "]");
        System.out.println("substring(8)  : " + rapi.substring(8));
        System.out.println("substring(0,5): " + rapi.substring(0, 5));
        System.out.println("replace       : " + rapi.replace("jamaluddin", "itu tamfan."));
        System.out.println("replace spasi : " + rapi.replace(" ", "_"));
    }
}
