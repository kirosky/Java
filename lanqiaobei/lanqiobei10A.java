package lanqiaobei;

public class lanqiobei10A {
    public static void main(String[] args) {
        int n = 0;
        int j;
        for (int i = 1; i <= 2019; i++) {
            if (i % 10 == 2 || i % 10 == 1 || i % 10 == 0 || i % 10 == 9) {
                n = n + i * i * i;
                continue;
            }
            if(i<10){
                continue;
            }
            j=(i/10)%10;
            if (j== 2 || j== 1 || j == 0 || j== 9) {
                n = n + i * i * i;
                continue;
            }
            if(i<100){
                continue;
            }
            j=(i/100)%10;
            if (j== 2 || j== 1 || j == 0 || j== 9) {
                n = n + i * i * i;
                continue;
            }
            if(i<1000){
                continue;
            }
            j=(i/1000)%10;
            if (j== 2 || j== 1 || j == 0 || j== 9) {
                n = n + i * i * i;
                continue;
            }
        }
        System.out.println(n);
    }
}
