package my.designpatterns.iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    	DinerMenu dinerMenu = new DinerMenu();
    	CafeMenu cafeMenu = new CafeMenu();
    	boolean vegetrian = false;
    	
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu, vegetrian);
        System.out.println(">>>전체 메뉴<<<");
        waitress.printMenu();
//        System.out.println(">>>채식 메뉴<<<");
//        waitress.printVegetarianMenu();
    }
}
