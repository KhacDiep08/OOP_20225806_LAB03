package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    // Danh sách DVD có sẵn trong cửa hàng
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    // Phương thức thêm một DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("Added DVD: " + dvd.getTitle());
    }

    // Phương thức xóa một DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("Removed DVD: " + dvd.getTitle());
        } else {
            System.out.println("DVD not found: " + dvd.getTitle());
        }
    }

    // In ra danh sách tất cả các DVD trong cửa hàng
    public void printStore() {
        System.out.println("***********************STORE***********************");
        if (itemsInStore.isEmpty()) {
            System.out.println("No DVDs available in the store.");
        } else {
            System.out.println("Available DVDs in the store:");
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
            }
        }
        System.out.println("***************************************************");
    }
    
}
