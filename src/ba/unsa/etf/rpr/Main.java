package ba.unsa.etf.rpr;



public class Sat {
    private int sati,minute,sekunde;

    Sat(int sati, int minute, int sekunde) { this.Postavi(sati,minute,sekunde); }
    void Postavi(int sati, int minute, int sekunde) { this.sati=sati; this.minute=minute; this.sekunde=sekunde; }
    void Sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) this.Sljedeci();
		else for (int i=0; i<-pomak; i++) this.Prethodni();
    }
    int getSati()  { return this.sati; }
    int getMinute()  { return this.minute; }
    int getSekunde()  { return this.sekunde; }
    void Ispisi()  {
        System.out.println(sati + ":" + minute + ":" + sekunde); }
};



public class Main {


    public static void main(String[] args) {

        Sat s= new Sat(15,30,45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();
    }
}
