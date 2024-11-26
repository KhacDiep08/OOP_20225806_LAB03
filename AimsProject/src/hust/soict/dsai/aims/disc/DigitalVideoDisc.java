package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    // Biến lớp để lưu trữ số lượng DVD đã tạo
    private static int nbDigitalVideoDiscs = 0;

    // Biến thể hiện để lưu id của mỗi DVD
    private final int id;

    // Các thuộc tính thể hiện của lớp
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor: Tạo đối tượng DigitalVideoDisc với tiêu đề
    public DigitalVideoDisc(String title) {
        this(title, "", "", 0, 0.0f); // Gọi Constructor đầy đủ
    }

    // Constructor: Tạo đối tượng với tiêu đề, thể loại và chi phí
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, "", 0, cost); // Gọi Constructor đầy đủ
    }

    // Constructor: Tạo đối tượng với đầy đủ các thông tin
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        // Cập nhật số lượng DVD đã tạo và gán id duy nhất
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Getter cho các thuộc tính
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    // Setter cho tiêu đề
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Title cannot be empty or null.");
        } else {
            this.title = title;
            System.out.println("Title updated to: " + title);
        }
    }

    // Phương thức lấy số lượng DVD đã tạo
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // Phương thức isMatch: kiểm tra tiêu đề có khớp không
    public boolean isMatch(String title) {
        if (title == null || title.trim().isEmpty()) {
            return false; // Tiêu đề tìm kiếm không hợp lệ
        }
        // Kiểm tra tiêu đề hiện tại có chứa tiêu đề cần kiểm tra (bỏ qua chữ hoa/chữ thường)
        return this.title.toLowerCase().contains(title.toLowerCase());
    }

    // Phương thức toString để in thông tin DVD
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " mins: " + cost + " $";
    }
}
