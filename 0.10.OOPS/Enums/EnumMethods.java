enum Laptop{
	Mackbook(2000) , XPS(2000) , Surface(1500) , Thinkpad(1000);

	private int price;


    // defining constructors 
    private Laptop(int price) {
        this.price = price;
        System.out.println("Created the Laptop  "+ this.name() + ": "+ this.price);

    }


    //defining setter and getters 

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }   
}


public class EnumMethods{
	public static void main(String args[]){

		Laptop s = Laptop.XPS;

		System.out.println(s.getClass());
		System.out.println(s.getClass().getSuperclass());

        System.out.println(s.getPrice());

	}
}