import java.util.ArrayList;

public class LibraryInformationSystem
{
   public static class Book
   {
       private String title;
       private String publisher;
       private int year;

       public Book(String title, String publisher, int year)
       {
           this.title = title;
           this.publisher = publisher;
           this.year = year;
       }

       public String title()
       {
           return this.title;
       }

       public String publisher()
       {
           return this.publisher;
       }

       public int year()
       {
           return this.year;
       }

       public String toString()
       {
             return this.title + " " + this.publisher + ", " + this.year;
       }
   } // End of Book Class

   public static class StringUtils
   {
      public static String sanitizedString(String word)
      {
          return word.trim().toUpperCase();
      }

       public static boolean included(String word, String searched)
       {
           if(word != null && searched != null)
           {
               word = sanitizedString(word);
               searched = sanitizedString(searched);

               return word.contains(searched);
           } else {
               return false;
           }
       }
   } // End of StringUtils Class

   public static class Library
   {
       private ArrayList<Book> listOfBooks;

       public Library()
       {
           this.listOfBooks = new ArrayList<Book>();
       }

       public void addBook(Book newBook)
       {
           if(!this.listOfBooks.contains(newBook))
           {
               this.listOfBooks.add(newBook);
           }
       }

       public void printBooks()
       {
           for(Book b : this.listOfBooks)
           {
               System.out.println(b);
           }
       }

       public ArrayList<Book> searchByTitle(String title)
       {
           ArrayList<Book> found = new ArrayList<Book>();

           // iterate the list of books and add all the matching books to the list found
           for(Book b : this.listOfBooks)
           {
               if(StringUtils.included(b.title(), title))
               {
                   found.add(b);
               }
           }

           return found;
       }

       public ArrayList<Book> searchByPublisher(String publisher)
       {
           ArrayList<Book> found = new ArrayList<Book>();

           // iterate the list of books and add all the matching books to the list found
           for(Book b : this.listOfBooks)
           {
               if(StringUtils.included(b.publisher(), publisher))
               {
                   found.add(b);
               }
           }

           return found;
       }

       public ArrayList<Book> searchByYear(int year)
       {
           ArrayList<Book> found = new ArrayList<Book>();

           // iterate the list of books and add all the matching books to the list found
           for(Book b : this.listOfBooks)
           {
               if(b.year == year)
               {
                   found.add(b);
               }
           }

           return found;
       }

   } // End of Library Class

   public static void main(String[] args)
   {
       Library Library = new Library();

       Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
       Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
       Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
       Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

       for (Book book: Library.searchByTitle("CHEESE")) {
           System.out.println(book);
       }

       System.out.println("---");
       for (Book book: Library.searchByPublisher("PENGUIN  ")) {
           System.out.println(book);
       }
   }
}
