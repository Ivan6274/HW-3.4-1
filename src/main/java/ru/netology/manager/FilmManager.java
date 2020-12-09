package ru.netology.manager;

import ru.netology.domain.PurchaseItem;

class FilmManager {
    private PurchaseItem[] items = new PurchaseItem[0];

    public void add(PurchaseItem item) {

        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] getAll() {
        PurchaseItem[] result = new PurchaseItem[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public PurchaseItem[] getAnyItem() {

        PurchaseItem[] getAny = new PurchaseItem[items.length];
        int any = 5;
        if (items.length <= any) {
            for (int i = 0; i < items.length; i++) {
                int index = items.length - i - 1;
                getAny[i] = items[index];
            }
            return getAny;
        } else {
            PurchaseItem[] getAny1 = new PurchaseItem[any];
            for (int i = 0; i < any; i++) {
                int index = items.length - i - 1;
                getAny1[i] = items[index];
            }

            return getAny1;

        }
    }

   
}
