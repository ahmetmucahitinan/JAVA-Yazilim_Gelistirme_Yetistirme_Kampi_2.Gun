
public class ProductManager {
	public void Add(Product product) {
		//JDBC
		System.out.println("Ürün Eklendi"  + product.getName());
	}
	
	//public void Add2(int id, String name, String description, int stockAmount, double price) 
	// Bu yanlış bir kullanım olurdu. Yeni bir özellik eklendiği zaman bu kodun tamamı hata verir.
		
}
