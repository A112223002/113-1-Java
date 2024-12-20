public class PhysicalBooK extends Book{
    private String shelfLocation;

    public PhysicalBooK(String title, String author, int pages, String shelfLocation) {
        super(title, author, pages);
        this.shelfLocation = shelfLocation;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }
    @Override
    public String toString() {
        return super.toString() + ", 下載連結: " + shelfLocation;
    }
}
