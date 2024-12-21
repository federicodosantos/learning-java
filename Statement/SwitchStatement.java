package Statement;

public class SwitchStatement {
    public static void main(String[] args) {
        var nilaiAkhir = 'K';
        var nilai = 80;

        switch (nilai) {
            case 80:
                nilaiAkhir = 'A';
                System.out.printf("keren kamu dapat %s", nilaiAkhir);
                break;
            case 60:
                nilaiAkhir = 'E';
                System.out.printf("yahhhh :( kamu dapat %s", nilaiAkhir);
                break;    
            default:
                System.out.println("Kamu tidak keren wooooo......");
                break;
        }

        // switch lambda tanpa penggunaan break
        switch (nilai) {
            case 80 -> System.out.println("Wow kerennn");
            case 75 -> System.out.println("mayan keren sih");            
            default -> System.out.println("Kamu gk sekolah ya");
        }

        // swith lambda dengan yield
        String ucapan = switch (nilai) {
            case 80: 
                yield  "Wow kerennn";
            case 75: 
                yield "mayan keren sih";            
            default: 
                yield "Kamu gk sekolah ya";
        };

        System.out.println(ucapan);
    }
}