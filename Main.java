//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //task1
//        Scanner scanner = new Scanner(System.in);
//               System.out.println("Please enter your name?");
//               var name = scanner.nextLine();
//               System.out.println("Please enter your surname?");
//               var surname = scanner.nextLine();
//               System.out.println("How old are you?");
//               var old = scanner.nextInt();
//               var result = 2022 - old;
//               var n = name.charAt(0);
//               var s = surname.charAt(0);
//               System.out.println(n + "." + s + ". " + result );

//               scanner.close();
//    }

//}
        //task2
//        Scanner scanner = new Scanner(System.in);
//           System.out.println("Input x");
//           int x = scanner.nextInt();
//           double y = 0;

//           if (((x >= -49) && (x < -10)) || ((x > 0) && (x <= 10))) {
//              System.out.println("y = " + (10 * x * x * x + (7 * x) / 5 + 2));
//
//           } else if (x > 20) {
//               System.out.println("y = " + (-x + 9));
//          } else {
//               System.out.println("No such function y");
//           }

//           scanner.close();
//   }
//}


        //task 3
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Enter a ");
//      int a = scanner.nextInt();
//      System.out.println("Enter b ");
//      int b = scanner.nextInt();
//      scanner.nextLine();

//      System.out.println("Enter operation (+, -, *, or /)");
//      String operation = scanner.next();

//      switch (operation) {
//          case "+":
//          System.out.println(a + b);
//          break;

//         case "-":
//          System.out.println(a - b);
//          break;

//          case "*":
//              System.out.println(a * b);
//              break;

//          case "/":
//              System.out.println(((float)(a)) / b);
//              break;

//          default:
//          System.out.println("Unknown operation");
//          break;

//      }
//      scanner.close();
//    }
//}


        //task4
//        int i = 0;
//        while (i < 11) {
//            if (i %2 == 0) {
//                System.out.print(i + ", ");
//           }
//            i++;
//        }
//       int j = 0;
//      do {
//            if (j % 2 != 0) {
//                System.out.print(j + ", ");
//           }
//               j++;
//           } while (j < 11) ;
//           System.out.println("doWhile cycle ended.");
//       }
//    }
        //

//homework0
         int n = 3;
         double sum = 0;
         double mul = 1;
         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j + Math.sin(j);
            }
                mul = mul * (i * i + 1) / sum;
                sum = 0;
        }
        System.out.println("Solution in the first way  - "+ mul);


        double sum2 = 0;
        double mult2 = 1;
        int j2 = 1;

        for (int i2 = 1; i2 <= n; i2++) {
            sum2 = sum2 + j2 + Math.sin(j2);
            j2++;
            mult2 = mult2 * (i2 * i2 + 1) / sum2;
        }
        System.out.println("Solution in the second way - " + mult2);
    }
}