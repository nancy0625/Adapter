package cn.edu.gdmec.android.testapplication;

import java.security.PublicKey;

/**
 * Created by asus on 2017/11/19.
 */

public class ItemBean {
    public int ItemImage;
    public String ItemTitle;
    public String ItemContent;

    public ItemBean(int itemImage, String itemTitle, String itemContent) {
        ItemImage = itemImage;
        ItemTitle = itemTitle;
        ItemContent = itemContent;
    }
}
