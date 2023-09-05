/*Write a Java program in a class named Window that produces the preceding figure as output. Use nested for loops to print the repeated parts of the figure. 
Once you get it to work, add one class constant to your program so that the size of the figure can be changed simply by 
changing that constant's value. The example output shown is at a constant size of 3, but if you change the constant, the figure
should grow larger and wider proportionally.

+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+

(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used
in the way described in this problem.)*/
public class Window {

    public static final int size = 3;
    public static void main(String[] args) {
        

        for (int i=1; i<=3; i++) {

            for (int h=1; h<=3; h++) {
                System.out.print("+");
                if (h<3) {
                    for (int u=1; u<=size; u++) {
                        System.out.print("=");
                    }
                }
            }
            System.out.println();

            if (i<3){
                for (int o=1; o<=size;o++) {
                    for (int j=1; j<=3; j++) { 
                        System.out.print("|");
                        if (j<3) {
                            for (int k=1; k<=size; k++) {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
