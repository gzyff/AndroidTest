package big.work;

import android.media.Image;

public class FriendsViewItemData {
    int frineds_item_type;
    String friends_item1_text;
    int friends_item2_image;
    String friends_item2_name;
    String friends_item2_signature;
    public  FriendsViewItemData(int frineds_item_type,String friends_item1_text){
        this.frineds_item_type = frineds_item_type;
        this.friends_item1_text = friends_item1_text;

    }
    public FriendsViewItemData(int frineds_item_type,int friends_item2_image,
                               String friends_item2_name,String friends_item2_signature){
        this.frineds_item_type = frineds_item_type;
        this.friends_item2_image = friends_item2_image;
        this.friends_item2_name = friends_item2_name;
        this.friends_item2_signature = friends_item2_signature;

    }
    public int getFrineds_item_type() {
        return frineds_item_type;
    }
    public String getFriends_item1_text() {
        return friends_item1_text;
    }

    public int getFriends_item2_image() {
        return friends_item2_image;
    }

    public String getFriends_item2_name() {
        return friends_item2_name;
    }

    public String getFriends_item2_signature() {
        return friends_item2_signature;
    }


}
