package Operation;

public class BooleanOperation {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;

        System.out.println(lulus);
    }
}