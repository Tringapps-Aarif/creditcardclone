package maincard;

import java.util.Scanner;
import java.util.logging.Logger;
import card.*;

class CreditCard {
    public static void main(String[] args) throws CloneNotSupportedException {
        final  Scanner sc = new Scanner(System.in);
        final Scanner sc1 = new Scanner(System.in);
        final  Scanner sc3 = new Scanner(System.in);
        final  Logger print = Logger.getLogger("card");
        print.info("Enter Original card details this details will be cloned ");
        print.info("Enter Card Holder Name : ");
        String ogName = sc.nextLine();
        print.info("Enter Card Number : ");
        int ogCardNo = sc.nextInt();
        print.info("Enter Expiry Date :");
        String ogExpDate = sc1.nextLine();
        CardDetails obj1 = new CardDetails(ogName, ogCardNo, ogExpDate);
        CardDetails obj2 = (CardDetails) obj1.clone();
        print.info("Enter Card Details to check: \n");
        print.info("Enter Card Holder Name : ");
        String name = sc1.nextLine();
        print.info("Enter Card Number : ");
        int cardNo = sc1.nextInt();
        print.info("Enter Expiry Date : ");
        String expDate = sc3.nextLine();
        CardDetails obj3 = new CardDetails(name, cardNo, expDate);
        print.info("\nThe original card details\n");
        obj1.display();
        print.info("\nCloned card details\n");
        obj2.display();
        print.info("\nThe card details we checked\n");
        obj3.display();
        boolean ans = obj2.equals(cardNo);
        if (ans) {
            print.info("\nBoth card details are same\n");
        } else {
            print.info("\nBoth card details are not same\n");
        }
       
    }
}
