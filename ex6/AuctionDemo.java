public class AuctionDemo{
     public static void main(String[] args) {
     Auction auc = new Auction();
    System.out.println("Add lot 5:\"Amazing Fantasy 15\"");
    auc.enterLot(5,"Amazing Fantasy 15");

    System.out.println("Add lot 6:\"FF 1\"");
    auc.enterLot(6,"FF 1");

    System.out.println("Add lot 2:\"Xmen 5\"");
    auc.enterLot(2,"Xmen 5");
    
    System.out.println("Current lots");
    auc.showLots();

    System.out.println("add bids 100 for lot 5");
    auc.bidFor(5,"ad",100);

    System.out.println("add bids 100 for lot 5");
    auc.bidFor(6,"klc",25);

    System.out.println("add bids 100 for lot 5");
    auc.bidFor(6,"ad",10);

    System.out.println("add bids 100 for lot 5");
    auc.bidFor(5,"klc",101);

    System.out.println("Lot 5 info: "+auc.getLot(5));

    System.out.println("Current lots");
    auc.showLots();
    }
}
class Auction{
    private ArrayList<Lot>lots;
    public Auction(){
        lots=new ArrayList<Lot>();
    }   
    public void enterLot(int lotNum,String description){
        lots.add(new Lot(lotNum,description));
    }
    public void showLots(){
        for(Lot lot:lots){
            System.out.println(lot.toString());
        }
    }
    public Lot getLot(int lotNum){
        for(Lot lot :lots)
        if(lot.getidNum()==lotNum)
        return lot;
        System.out.println("Lot number:"+lotNum+"does not exist.");
        return null;
    }
    

}