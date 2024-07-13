import java.io.*;


class book implements Serializable
	{
		private String name;
		transient int price;

		public book(String name , int price)
		{
			this.name = name;
			this.price = price;
		}

		public void display()
		{
			System.out.println("name: "+name);
			System.out.println("price: "+price);
		}
		
	}

public class SelectiveSerializationExample {
    public static void main(String[] args) throws Exception{

		
		book b1 = new book("java",500); 

		//serialization 
		FileOutputStream fos = new FileOutputStream("file handling/input.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(b1);

		oos.flush();
		oos.close();

		//Deserialization

		FileInputStream fis = new FileInputStream("file handling/input.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);//optional for efficiency
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(bis);
		book b2 = (book)ois.readObject();
		b2.display();

		// ois.closed();

    }
}



//output

