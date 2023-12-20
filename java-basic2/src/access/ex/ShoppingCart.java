package access.ex;


public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
        } else {
            items[itemCount] = item;
            itemCount ++;
        }
    }

    private int getTotal() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getTotalPrice();
        }
        return total;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명 : " + items[i].getName() + ", 합계:"  + items[i].getTotalPrice());        }
        System.out.println("전체 가격 합: " + getTotal());
    }


}
