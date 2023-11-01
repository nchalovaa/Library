package lesson_17.hw_Book;

public class Library {
    private Book[] books;
//    private Book[] books = new Book[50];

    public Library(Book[] books) {
        this.books = books;
    }

    public Library(int booksSize) {
        this.books = new Book[booksSize];
    }

    public void addBook(Book bookToAdd) {
        boolean isAdded = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookToAdd;
                isAdded = true;
            }
        }
        if (!isAdded) {
            System.out.println("Для книги " + bookToAdd.getAuthor() + " " + bookToAdd.getTitle() + " нет места");
        }
    }

    public void removeBook(Book bookToAdd) {
        String title = bookToAdd.getTitle();
        String author = bookToAdd.getAuthor();

        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            //todo проверить является ли currentBook == null
            if (currentBook.getTitle().equals(title) && currentBook.getAuthor().equals(author)) {
                books[i] = null;
            }
        }
    }

    public boolean isBookBorrowed(String title, String author) {
        boolean isBookBorrowed = false;

        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            if (currentBook.getTitle().equals(title) && currentBook.getAuthor().equals(author)) {
                isBookBorrowed = currentBook.isBorrowed();
                break;
            }
        }

        return isBookBorrowed;
    }

    public void borrowBook(String title, String author) {
        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            if (currentBook.getTitle().equals(title) && currentBook.getAuthor().equals(author)) {
                currentBook.setBorrowed(true);
                break;
            }
        }
    }

    public void returnBook(String title, String author) {
        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            if (currentBook.getTitle().equals(title) && currentBook.getAuthor().equals(author)) {
                currentBook.setBorrowed(false);
                break;
            }
        }
    }

    public void getAllBooks() {
        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            //todo проверить является ли currentBook == null
            System.out.println("Author: " + currentBook.getAuthor() +
                            "Title: " + currentBook.getTitle() +
                            "Year: " + currentBook.getYear() +
//                    "Borrowed: " + (currentBook.isBorrowed() ? " is avvaible" : "is not avvaible")
                            "Borrowed: " + currentBook.isBorrowed()
            );
        }
    }
}

