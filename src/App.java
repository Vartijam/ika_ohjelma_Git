public class App {
    public static void main(String[] args) throws Exception {
        
        int ika = 59;

        if (ika >= 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            } if (ika >= 16 && ika < 18) {
                System.out.println("Saat ajaa kevaria");
            }
        } else if (ika >= 65) {
                System.out.println("Olet eläkeläinen");
            } else {
                System.out.println("Olet aikuinen");
            } if (ika == 18) {
                System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa");
        }
        if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60 || ika == 70 || ika == 80 || ika == 90 || ika == 100 || ika == 110) {
            System.out.println("Onneksi olkoon tasavuosikymmenistä!");
        }
        if (ika == 100) {
            System.out.println("Onneksi olkoon!!!!");
        }
        if (ika >= 58 && ika < 65) {
            System.out.println("Voit siirtyä varhaiseläkkeelle");
        }
        if (ika == 65) {
            System.out.println("Hyviä eläkepäiviä!");
        }
        if (ika >= 40 && ika <= 50) {
            System.out.println("Hyvää keski-ikää!");
        }

    }
}
