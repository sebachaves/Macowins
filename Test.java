package tp.macowins;

public class Test {

	public static void main(String[] args) {
		
		Pantalon pantalon = new Pantalon();
		Camisa camisa = new Camisa();
		Saco saco = new Saco();
				
		Prenda unPantalon = new Prenda (pantalon);
		Prenda unSaco = new Prenda (saco);
		Prenda unaCamisa = new Prenda (camisa);
	
		PrendaInt unPantalonInt = new PrendaInt(pantalon);
		
		System.out.println("El pantalon nacional vale: " + unPantalon.precioFinal());
		System.out.println("El pantalon internacional vale: " + unPantalonInt.precioFinal());
		
		Venta unaVenta = new Venta(unPantalon, 25, 3, 2016, 3);

	}

}
