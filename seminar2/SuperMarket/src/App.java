import Classes.*;
import Interfaces.*;

public class App {
    public static void main(String[] args) throws Exception {
       Market market = new Market();
       iActorBehaviour item1 = new OrdinaryClient("Boris");
       iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
       iActorBehaviour item3 = new OrdinaryClient("Dasha");
       iActorBehaviour item4 = new TaxService();
       

       market.acceptToMarket(item1);
       market.acceptToMarket(item2);
       market.acceptToMarket(item3);
       market.acceptToMarket(item4);
       market.update();
       
    }
}