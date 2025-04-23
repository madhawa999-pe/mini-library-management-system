
import java.util.Scanner;
class Library_app{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many books do you want to enter :");	
		int Size =  scanner.nextInt();
		scanner.nextLine();
		
	    Library library = new Library(); 
        library.createLibrary(Size);        

		
		for(int i = 0; i< Size ;i++){
		
			System.out.println("Enter your details for the book :" +(i+1));	
			System.out.println("Enter name of the book");
	        String Title = scanner.nextLine();
			
			System.out.println("Enter the name of Author : ");
			String Author = scanner.nextLine();
			
			Book book = new Book();
			book.Title = Title;
			book.Author = Author;
			library.Add_book(book);
		    
			
		}
		 
		 
		 System.out.println("----------------------------------------------------------------");
		 System.out.println("All the books in library");
		 System.out.println("");	
	     library.Display_book();
		 System.out.println("----------------------------------------------------------------");	
		
		
	}
}