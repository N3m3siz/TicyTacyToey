public class SPIEL{
   //? private SPIELER [] aktueller Spieler;
    
    public SPIEL (SPIELER spieler1, SPIELER spieler2){
        //zuweisen an Referenzattribute
        spieler1 = Kreis;
        spieler2 = Dreieck;
        // Spielfeld erzeugen
    }
    
    public void spielStarten(int spieler){
        spieler = 1;
        //Helena SPIELFELD.spielbrettZeichnen;
        System.out.println ("Spiel beginnt!");
        System.out.println(spieler1.name );//wie ausdrücken, dass begonnen wird?!)
    }



    public void spielEndeTesten(int feldnummer){
        if (feldnummer ==1 && feldnummer ==3 && feldnummer ==6) {}//=1; dann andere 3 =2
        //spiel beende
    }


    public void spielzugVerarbeiten(){
        //Feld mit gewümschter Nummer mit Symbpl des aktuellen Spielers zu belegen:
            if (spielEndeTesten() = true){}
   
            //  else if aktueller spieler = spieler 1, dann Spieler 2, dann aufforderung zu neuer Feldauswahl
            //           else aktueller Spieler = spieler 1,dann aufforderung zu neuer Feldauswahl
    }
}