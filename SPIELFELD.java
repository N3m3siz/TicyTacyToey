public class SPIELFELD{
    
    private Quadrat[] feld;
    private Kreis[] kreis,kreis1;
    private Dreieck[] dreieck,dreieck1;
    protected int[] feld1;
    
    
    private Dreieck start1;
    private Quadrat[] start2;
    
    
    public SPIELFELD() {
        feld = new Quadrat[10];
        kreis = new Kreis[9];
        dreieck = new Dreieck[9];
        kreis1 = new Kreis[9];
        dreieck1 = new Dreieck[9];
        feld1 = new int[9];
        
        feld[9] = new Quadrat(400, 0, 0, "schwarz");
        
        
        start2 = new Quadrat[12];
    }
    
    public void spielbrettZeichnen() {
        feld[9].sichtbarMachen();
        for (int i=0; i<3; i++) {
            feld[i] = new Quadrat(100, 125 * i + 25, 25, "pink");
        }
        for (int i=3; i<6; i++) {
            feld[i] = new Quadrat(100, 125 * (i-3) + 25, 150, "pink");
        }
        for (int i=6; i<9; i++) {
            feld[i] = new Quadrat(100, 125 * (i-6) + 25, 275, "pink");
        }
    }
    
    //0 = hei?t nicht besetzt, 1 = von kreis besetzt, 2 = von dreieck besetzt
    public void steinSetzten(int Figur, int Spielfeldnummer) {
        //das erste spielfeld mit der spielfeldnummer 1 angegeben werden kann und nicht mit dem Index 0
        Spielfeldnummer = Spielfeldnummer - 1;
        if(Figur == 1){
            feld1[Spielfeldnummer]=1;
            if(Spielfeldnummer < 3) {
                kreis[Spielfeldnummer] = new Kreis(100,125 * Spielfeldnummer + 25, 25, "schwarz");
                kreis1[Spielfeldnummer] = new Kreis(90,125 * Spielfeldnummer + 30, 30, "zyan");
            }
            if(3 <= Spielfeldnummer && Spielfeldnummer < 6) {
                kreis[Spielfeldnummer] = new Kreis(100, 125 * (Spielfeldnummer-3) + 25, 150, "schwarz");
                kreis1[Spielfeldnummer] = new Kreis(90,125 * (Spielfeldnummer-3) + 30, 155, "zyan");
            }
            if(6 <= Spielfeldnummer && Spielfeldnummer < 9) {
                kreis[Spielfeldnummer] = new Kreis(100, 125 * (Spielfeldnummer-6) + 25, 275, "schwarz");
                kreis1[Spielfeldnummer] = new Kreis(90,125 * (Spielfeldnummer-6) + 30, 280, "zyan");
            }
        } else if(Figur == 2){
            feld1[Spielfeldnummer]=2;
           if(Spielfeldnummer < 3) {
                dreieck[Spielfeldnummer] = new Dreieck(97, 100, 125 * Spielfeldnummer + 75, 25, "schwarz");
                dreieck1[Spielfeldnummer] = new Dreieck(90, 90, 125 * Spielfeldnummer + 75, 30, "gruen");
            }
           if(3 <= Spielfeldnummer && Spielfeldnummer < 6) {
                dreieck[Spielfeldnummer] = new Dreieck(97, 100, 125 * (Spielfeldnummer-3) + 75, 150, "schwarz");
                dreieck1[Spielfeldnummer] = new Dreieck(90, 90, 125 * (Spielfeldnummer-3) + 75, 155, "gruen");
            }
           if(6 <= Spielfeldnummer && Spielfeldnummer < 9) {
                dreieck[Spielfeldnummer] = new Dreieck(97, 100, 125 * (Spielfeldnummer-6) + 75, 275, "schwarz");
                dreieck1[Spielfeldnummer] = new Dreieck(90, 90, 125 * (Spielfeldnummer-6) + 75, 280, "gruen");
            }
        } 
    }
    
    public void makeAT(int i) {
        start2[0] = new Quadrat (30, i + 25, 150, "zyan");
        start2[0] = new Quadrat (30, i + 55, 150, "zyan");
        start2[0] = new Quadrat (30, i + 85, 150, "zyan");
        start2[0] = new Quadrat (30, i + 55, 170, "zyan");
        start2[0] = new Quadrat (30, i + 55, 200, "zyan");
    }
    
    public void warte() {
        try {
            Thread.sleep(1000);//200 Millisekunden larm gelegt
        }catch(InterruptedException ie){
        }
    }
    
    public void openGame() {
        makeAT(0);
        start1 = new Dreieck(90, 90, 210, 150, "gruen");
        makeAT(275);
        warte();
        feld[9] = new Quadrat(400, 0, 0, "schwarz");
        warte();
        spielbrettZeichnen();
    }
    
}