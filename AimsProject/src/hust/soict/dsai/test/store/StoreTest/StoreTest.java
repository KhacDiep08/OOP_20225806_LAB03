package hust.soict.dsai.test.store.StoreTest;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {

    public static void main(String[] args) {
        Store store = new Store();

        // Tạo các DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Godfather");

        // Thêm DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Hiển thị danh sách DVD trong cửa hàng
        store.printStore();

        // Xóa DVD khỏi cửa hàng
        store.removeDVD(dvd2);
        store.removeDVD(new DigitalVideoDisc("Avatar")); // DVD không tồn tại

        // Hiển thị danh sách DVD sau khi xóa
        store.printStore();
    }
}