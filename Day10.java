public class Day10 {
    public static void main(String[] args) {
        int a = 10;//membuat variabel a dengan nilai 10
                        int b = 25;//membuat variabel b dengan nilai 25
                                int c = 10;//membuat variabel c dengan nilai 10

int minimum = Math.min (a, Math.min(b, c));//mencari nilai terkecil dari a,b, dan c
                                            //math.min(b,c)> membandinhgkan 25 dan 5
                                            //hasilnya 5
                                            //kemudian Math.min (a,5)>membandingkan 10 dan 5
                                            //hasil akhirnya 5
int Maksimum = Math.max(a, Math.max(b, c));//mencari nilai terbesar dari a,b,dan c
                                            //math.max(a,25)>membandingkan 25 dan 5
                                            //hasilnya 25
                                            //kemudian math.max(a,25)>membanddingkan 10 dan 
                                            //hasil akhirnya 25 

System.out.println("nilai minimum :"+ minimum);        //menampilkan nilai minimum
System.out.println("nilai maksimum :"+Maksimum);       //menampilkan nilai maksimum         


    }
                   }
