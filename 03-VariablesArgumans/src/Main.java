
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		String yeniMesaj = sehirVer(); // mesaj.substring(0, 2); yazdık sonra değiştirdik 
		System.out.println(yeniMesaj); //substring bir değer return(döndürür) eder. Substring ile 0,2 arasındaki harfleri ekrana yazdık.
		int sayi = topla (9,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6,7,10);
		System.out.println(toplam);
		
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
		return sayi1+sayi2; 
	}
	public static int topla2(int...sayilar) { //Bu parametreyle istediğimiz kadar sayıyı toplarız.
		int toplam = 0; // Birden fazla sayı olduğunu belirtmek için int... yazarız
		for (int sayi:sayilar) { //sayılardaki her bir sayı için for döngüsü 
			toplam+=sayi;
		}
		
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
}

