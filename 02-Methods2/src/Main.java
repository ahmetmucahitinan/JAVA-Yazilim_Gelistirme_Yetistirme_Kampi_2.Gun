
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		String yeniMesaj = sehirVer(); // mesaj.substring(0, 2); yazdık sonra değiştirdik 
		System.out.println(yeniMesaj); //substring bir değer return(döndürür) eder. Substring ile 0,2 arasındaki harfleri ekrana yazdık.
		int sayi = topla (15,7);
		System.out.println(sayi);
		
	}
	  
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2; //return bitir demektir. Burada bitir ama 5 kez döndür demektir.
	}
	public static String sehirVer() {
		return "Ankara";
	}
}
