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
    	boolean vegetrian = false;
    	
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, vegetrian);
        waitress.printMenu();
    }
}
