public class Main {
    public static int İkiliArama(int dizi[], int a) {
        int DiziBaş = 0; // Dizinin 1. elemanını belirlemesi için DiziBaş diye bir değişken yaratık
        int DiziSon = dizi.length - 1; // Dizinin son elemanını belirlemesi için DiziSon diye bir değişken yaratık

        while (DiziBaş <= DiziSon) { // Diziniin elemanlarını gezmek için döngü yaratık
            int Ortanca = (DiziBaş + DiziSon) / 2; // dizinin Orta elemanını bulmak için Ortanca diye değer yaratıldı

            if (dizi[Ortanca] == a) return Ortanca; // Dizideki orta elemanın aranan eleman olup olmadığına bakılıyor

            if (dizi[Ortanca] < a) DiziBaş = Ortanca + 1; // Aranan değer sıralı dizide ortanca indisten büyük ise
            else DiziSon = Ortanca - 1; // eğer aranan sayı dizinin Ortanca indisinden küçük ise
        }
        return -1; // aranan değer dizide bulunmuyorsa -1 döndür
    }

    public static void main(String[] args) {
        int dizi[] = {1, 2, 3, 4, 5, 7, 8, 9, 11, 12, 13, 18};

        int sonuç = İkiliArama(dizi, 8); // Metotumuzu yazdık ve indislerini verdik

        if (sonuç == -1) { // aranan eleman yok ise
            System.out.println("Aranan sayı dizide yok");
        } else {
            System.out.println("Aranan sayı dizide " + sonuç + ". İndiste"); // dizide kaçıncı indiste olduğunu yazdırdık
        }
    }
}
