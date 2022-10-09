
public class Main {

	public static void main(String[] args) { //Javada kodlar Mainden başlar.
		sayiBulmaca(); //SayiBulmacayı çağırmak için Main'in içerisinde yazarız.
		sayiBulmaca(); //4 farklı yerde ayrı ayrı döngü yazmak yerine fonksiyon yazarak kendimizi tekrarlamayarak kodun hem kalitesi artar hem de kısalır.
		sayiBulmaca(); 
		sayiBulmaca();	
	}
		//camelCasing: Deve yazımı. Fonksiyon isimleri böyle yazılır.
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 3;
		boolean varMi=false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = ""; //Burada mesajı tanımlamazsak fonksiyon hata verir.
		if(varMi) {
			mesaj = "Sayı Mevcuttur: "+aranacak;
			mesajVer(mesaj); // Böyle veya else durumu gibi 2 şekilde yazımı olabilir.
			
		}else {
			mesajVer("Sayı Mevcut Değildir: "+aranacak);
		}
	}
	public static void mesajVer(String mesaj) { //"int aranacak" yerine "String mesaj" yazarız. mesajı isteriz ve ekrana yansıtırız.
		System.out.println(mesaj);//Değişkeni tanımladığımızda bu blokta değilse hata verir. Bu yüzden içerisindeki fonksiyona tanımlamalıyız.
	}
}
