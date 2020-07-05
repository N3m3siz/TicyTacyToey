public class SPIELER {
    private String name;
    private int spielsymbol;
    
                             //SPIEL spiel
    public void  spielBekanntmachen( ) {
        
    }
    
    public void spielsymbolSetzen(int symbol) {
        // ich bin ein spieler bekomm vom Spiel de nummer vom spieler zugeteilt
        //name = (1 oder 2) woas i nu ned
        if(symbol == 1){
            symbol = 1;
            }
        
        if (symbol == 2){
            symbol = 2;
        }
    }
    
    public String nameGeben() {
        return name;
    }
    
    public int spielsymbolGeben() {
        return spielsymbol;
    }
    
    public void spielzugAusfuehren(int feldnummer) {
        
        if (feldnummer == 1){
            //draw.symbol;
        }else if (feldnummer == 2){
            //draw.symbol;
        }else if (feldnummer == 3){
            //draw.symbol;
        }else if(feldnummer == 4){
            //draw.symbol;
        }else if (feldnummer== 5){
            //draw.symbol;
        }else if (feldnummer == 6){
            //draw.symbol;
        }else if(feldnummer == 7){
            //draw.symbol;
        }else if(feldnummer == 8) {
            //draw.symbol;
        }else if(feldnummer == 9){
            //draw.symbol;
        }
    }
}