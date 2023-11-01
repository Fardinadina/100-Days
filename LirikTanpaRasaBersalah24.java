package liriktanparasabersalah24;

public class LirikTanpaRasaBersalah24 {
    public static void main(String[] args) {
        String [] Lyric = {
            "tanpa rasa bersalah by fardina ",
            "andai sejak awal ku tahu akhirnya begini",
            "ku tak akan mau mencintaimu tlah sedalam ini",
            "entah apa salah dan dosaku hingga Tuhan ",
            "pertemukanku denganmu",
            "hancurkan diriku",
    };
        for (String baris : Lyric ){
            System.out.println(baris);
        
            try {
                Thread.sleep(3980);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
        
        
        
        
        
        
        
        
        
        
   
