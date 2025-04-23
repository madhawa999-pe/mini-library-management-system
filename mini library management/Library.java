class Library{
	Book[] books;
	int Count = 0;

void createLibrary(int size){
	
		books = new Book[size];
			
		}
		
void Add_book(Book b){
	if(Count<books.length){
		
		books[Count] = b;
		Count++;
	}
}
void Display_book(){
	for(int i = 0; i<Count;i++){
	
		books[i].Display_book();
	 }
	}
}
