package card;

import java.util.logging.Logger;

public class CardDetails implements Cloneable {
   private final String ogName;
    private final int ogCardNo;
   private final String ogExpDate;
   final Logger print = Logger.getLogger("card");
   public CardDetails(String ogName, int ogCardNo, String ogExpDate) {
        this.ogName = ogName;
        this.ogCardNo = ogCardNo;
        this.ogExpDate = ogExpDate;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

  public  boolean equals(int cardNo) {

      return ogCardNo == cardNo;
    }

  public  void display() {
      print.info(
                "Card holder name : " + ogName + "\nCard number : " + ogCardNo + "\nCard Expiry date : " + ogExpDate);
    }
}
