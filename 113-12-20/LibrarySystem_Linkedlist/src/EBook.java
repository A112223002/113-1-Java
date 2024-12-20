public class EBook extends  Book{
    private String downloadUrl;

    public EBook(String title, String author, int pages, String downloadLink) {
        super(title, author, pages);
        this.downloadUrl = downloadLink;
    }

    public String getDownloadLink() {
        return downloadUrl;
    }

    @Override
    public String toString() {
        return super.toString() + ", Download Link: " + downloadUrl;
    }
}
