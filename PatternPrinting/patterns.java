package PatternPrinting;

public class patterns {
    public static void main(String[] args) {
        patterns.printStar();
        patterns.printNumber();
        patterns.printNumberIncrement2();
        patterns.printStarInPattern();
        patterns.printNumberInPattern();
        patterns.printNumberInPattern2();
        patterns.printNumberInPattern3();
        patterns.printNumberInPattern4();
    }
    static void printStar() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
    static void printNumber(){
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }
    static void printNumberIncrement2(){
        int k=1;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+k+" ");
                k+=3;
            }k=1;
            System.out.println();
        }
    }
    static void printStarInPattern(){
        for (int i = 1; i < 4; i++) {
            for (int j = i; j < 4; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <=i; j++) System.out.print("*");
            System.out.println();
        }
        int n=6;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("*");
            System.out.println();
        }
    }
    static void printNumberInPattern(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print(k+n-i);
            System.out.println();
        }
    }
    static void printNumberInPattern2(){
        int n=6;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print("  ");
            for (int k = i; k >= 1; k--) System.out.print(k + " ");
            for (int l = 1; l <= i; l++) System.out.print(l + " ");
            System.out.println();
        }
    }

    static void printNumberInPattern3(){
        int n =6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }

    }
    static void printNumberInPattern4(){
        int inc =2;
        int n=3;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print("   ");
            for (int k = i; k >= 1; k--) System.out.print((k*inc)-(inc-1) + "  ");
            for (int l = 1; l <= i; l++) System.out.print((l *inc)-(inc-1) + "  ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j < n; j++) System.out.print("   ");
            for (int k = i; k >= 1; k--) System.out.print((k*inc)-(inc-1)+"  ");
            for (int l = 1; l <= i; l++) System.out.print((l *inc)-(inc-1)+ "  ");
            System.out.println();
        }
    }
}
