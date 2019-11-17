package big.work;

public class NewFriendViemItemData {
    int new_friend_item_image;
    String new_friend_item_name;
    String new_friend_item_sexboy;
    String new_friend_item_sexgirl;
    String new_friend_item_from;
    String new_friend_item_common;
    String new_friend_item_constellation;
    String new_friend_item_case;
    public NewFriendViemItemData(int new_friend_item_image,String new_friend_item_name,
                                 String new_friend_item_sexboy,String new_friend_item_sexgirl,
                                 String new_friend_item_from,String new_friend_item_common,
                                 String new_friend_item_constellation,String new_friend_item_case){
        this.new_friend_item_image = new_friend_item_image;
        this.new_friend_item_sexboy = new_friend_item_sexboy;
        this.new_friend_item_sexgirl = new_friend_item_sexgirl;
        this.new_friend_item_name = new_friend_item_name;
        this.new_friend_item_from = new_friend_item_from;
        this.new_friend_item_common = new_friend_item_common;
        this.new_friend_item_constellation = new_friend_item_constellation;
        this.new_friend_item_case = new_friend_item_case;

    }

    public int getNew_friend_item_image() {
        return new_friend_item_image;
    }

    public String getNew_friend_item_from() {
        return new_friend_item_from;
    }

    public String getNew_friend_item_name() {
        return new_friend_item_name;
    }

    public String getNew_friend_item_sexboy() {
        return new_friend_item_sexboy;
    }

    public String getNew_friend_item_sexgirl() {
        return new_friend_item_sexgirl;
    }

    public String getNew_friend_item_common() {
        return new_friend_item_common;
    }

    public String getNew_friend_item_case() {
        return new_friend_item_case;
    }

    public String getNew_friend_item_constellation() {
        return new_friend_item_constellation;
    }
}
