package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] arrayIteam = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int numberDisc = 0;

    // Phương thức thêm 1 đĩa DVD
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (numberDisc < MAX_NUMBERS_ORDERED) {
            arrayIteam[numberDisc] = disc;
            numberDisc++;
            System.out.println("+1");
        } else {
            System.out.println("Cart is full, cannot add: " + disc.getTitle());
        }
    }

    // Nạp chồng phương thức: thêm danh sách DVD (mảng)
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (numberDisc < MAX_NUMBERS_ORDERED) {
                arrayIteam[numberDisc] = disc;
                numberDisc++;
                System.out.println("+1");
            } else {
                System.out.println("Cart is full, cannot add: " + disc.getTitle());
                break;
            }
        }
    }

    // Nạp chồng phương thức: thêm hai DVD 
    public void addTwoDigitalVideoDiscs(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (numberDisc < MAX_NUMBERS_ORDERED) {
            arrayIteam[numberDisc] = dvd1;
            numberDisc++;
            System.out.println("+1");
        } else {
            System.out.println("Cart is full, cannot add: " + dvd1.getTitle());
        }

        if (numberDisc < MAX_NUMBERS_ORDERED) {
            arrayIteam[numberDisc] = dvd2;
            numberDisc++;
            System.out.println("+1");
        } else {
            System.out.println("Cart is full, cannot add: " + dvd2.getTitle());
        }
    }

    // Phương thức xóa 1 đĩa DVD
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < numberDisc; i++) {
            if (arrayIteam[i] == disc) {
                for (int j = i; j < numberDisc - 1; j++) {
                    arrayIteam[j] = arrayIteam[j + 1];
                }
                arrayIteam[numberDisc - 1] = null;
                numberDisc--;
                System.out.println("-1");
                return;
            }
        }
        System.out.println("404");
    }

    // Tính tổng chi phí của giỏ hàng
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < numberDisc; i++) {
            total += arrayIteam[i].getCost();
        }
        return total;
    }

    // In giỏ hàng
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (int i = 0; i < numberDisc; i++) {
            DigitalVideoDisc dvd = arrayIteam[i];
            System.out.println((i + 1) + ". " + dvd.toString());
            totalCost += dvd.getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    // Tìm kiếm DVD theo ID
    public DigitalVideoDisc searchById(int id) {
        for (DigitalVideoDisc dvd : arrayIteam) {
            if (dvd != null && dvd.getId() == id) {
                return dvd;
            }
        }
        return null;  // Không tìm thấy DVD với ID đó
    }

    // Tìm kiếm DVD theo tiêu đề
    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc dvd : arrayIteam) {
            if (dvd != null && dvd.isMatch(title)) {
                System.out.println(dvd);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with the title: " + title);
        }
    }
}
