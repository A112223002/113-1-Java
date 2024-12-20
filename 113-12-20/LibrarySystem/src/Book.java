public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean borrowed;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.borrowed = false;
    }

    public void borrow() {
        if (borrowed) {
            System.out.println("This book is already borrowed.");
        } else {
            borrowed = true;
            System.out.println("You have borrowed the book.");
        }
        @Override
        public void returnItem; {
            if (borrowed) {
                borrowed = false;
                System.out.println("You have returned the book.");
            } else {
                System.out.println("This book is not borrowed.");
            }
        }

    }

    public void returnItem() {
    }

    public boolean isBorrowed() {
        return false;
    }

    public String getTitle() {
        return null;
    }
}
