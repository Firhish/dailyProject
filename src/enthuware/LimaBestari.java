package enthuware;

public class LimaBestari {

    static String guruKelas = "Cg Ramli";
    static String papan = "White Board";
    static LimaBestari murid;

    String botolAir;

    LimaBestari(String botolAir){
        this.botolAir = botolAir;
    }

    public static void setMurid(LimaBestari murid) {
        LimaBestari.murid = murid;
    }

    static void tukarBotolAir(String botolAirBaru){
        murid.botolAir = botolAirBaru;
    }

    public static void main(String[] args) {

    }
    
}
