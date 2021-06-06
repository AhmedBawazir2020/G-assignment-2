import java.util.*;
import java.util.Set;
public class main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int num=0;
        int num2=0;
        System.out.println(" chooses your operations \n 1. Relation statement | 2. show the Complementary |" +
                "3. the Inverse | 4. the Union | 5. the Intersection");
        int op =0;
        System.out.print("enter the numbers :");
        op =scan.nextInt();
     if ( op ==1){
         System.out.println("The Relation statement");

     } else if (op == 2){
         System.out.println("Show the Complementary");

     }else if (op == 3){
         System.out.println("the Inverse");

     }else if (op == 4){
         System.out.println("The Union Relation");
         union();
     }else if (op == 5){
         System.out.println("The Intersection Relation");
         Intersection();
     }


    }

    static void union(){

        // create the first set
        Set<Integer> set1 = new HashSet<>();
        System.out.println("Total number in set 1 : ");
        int tnum= scan.nextInt();
        System.out.println("Enter Set 1 numbers: ");
        for (int i = 0; i < tnum; i++) {
            Integer a = scan.nextInt();
            // Integer b = scan.nextInt();

            set1.addAll(Collections.singleton(a));

        }


        System.out.println("Set1: " + set1);

        // create second set
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Total number in set 2 : ");
        int tnum2= scan.nextInt();
        System.out.println("Enter Set 2 numbers: ");

        for (int i = 0; i < tnum2; i++) {
            Integer b = scan.nextInt();
            // Integer b = scan.nextInt();

            set2.addAll(Collections.singleton(b));

        }

        System.out.println("Set2: " + set2);
        System.out.println("\n Set 1 "+set1+" + Set 2: " + set2);


        // Union of two sets
        set2.addAll(set1);
        System.out.println("Union is: " + set2);
    }

    static void Intersection(){
        // create first set
        Set<Integer> set1 = new HashSet<>();
        System.out.println("Total number in set 1 : ");
        int tnum= scan.nextInt();
        System.out.println("Enter Set 1 numbers: ");

        for (int i = 0; i < tnum; i++) {
            Integer a = scan.nextInt();
            // Integer b = scan.nextInt();

            set1.addAll(Collections.singleton(a));

        }
        System.out.println("Set 1: " + set1);

        // create second set
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Total number in set 2 : ");
        int tnum2= scan.nextInt();
        System.out.println("Enter Set 2 numbers: ");

        for (int i = 0; i < tnum2; i++) {
            Integer b = scan.nextInt();
            // Integer b = scan.nextInt();

            set2.addAll(Collections.singleton(b));

        }
        System.out.println("Set 2: " + set1+"\n");

        System.out.println("Set 1 "+set1+" + Set 2: " + set2);

        // Intersection of two sets
        set2.retainAll(set1);
        System.out.println("Intersection: " + set2);
    }
}