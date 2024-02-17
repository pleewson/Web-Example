package main.web.get;

public class test {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                sum = i * j;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
