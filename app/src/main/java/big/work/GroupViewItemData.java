package big.work;

public class GroupViewItemData {
    int friends_item2_image;
    String friends_item2_name;
    String friends_item2_signature;
    String group_name;
    String group_number;

    public GroupViewItemData(int friends_item2_image,
                               String friends_item2_name,String friends_item2_signature){
        this.friends_item2_image = friends_item2_image;
        this.friends_item2_name = friends_item2_name;
        this.friends_item2_signature = friends_item2_signature;

    }
    public GroupViewItemData(String group_name,String group_number){
        this.group_name = group_name;
        this.group_number = group_number;
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

    public String getGroup_name() { return group_name; }

    public String getGroup_number() { return group_number; }
}
