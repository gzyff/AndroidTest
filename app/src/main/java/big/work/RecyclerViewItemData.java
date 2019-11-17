package big.work;

public class RecyclerViewItemData{

    int dataType;
    public String search;
    public int domestic_image;
    public String user_name;
    public String chat_context;
    public String chat_time;
    public int member_image;
    public String member_user_name;
    public String member_user_level;
    public String member_chat_context;
    public String member_chat_time;

    public RecyclerViewItemData(int dataType,String search) {
        this.search = search;
        this.dataType = dataType;
    }
    public RecyclerViewItemData(int dataType,int domestic_image,
                                String user_name,String chat_context,String chat_time) {
        this.dataType = dataType;
        this.domestic_image = domestic_image;
        this.user_name = user_name;
        this.chat_context = chat_context;
        this.chat_time = chat_time;
    }
    public RecyclerViewItemData(int dataType,int member_image, String member_user_name,
                                String member_chat_context,String member_chat_time,String member_user_level) {
        this.dataType = dataType;
        this.member_image = member_image;
        this.member_user_name = member_user_name;
        this.member_chat_context = member_chat_context;
        this.member_chat_time = member_chat_time;
        this.member_user_level = member_user_level;
    }

    public int getDataType() {
        return dataType;
    }
    public String getSearch() { return search; }

    public int getDomestic_image() {
        return domestic_image;
    }

    public String getChat_context() {
        return chat_context;
    }

    public String getChat_time() {
        return chat_time;
    }

    public String getUser_name() {
        return user_name;
    }

    public int getMember_image() {
        return member_image;
    }

    public String getMember_chat_context() {
        return member_chat_context;
    }

    public String getMember_chat_time() {
        return member_chat_time;
    }

    public String getMember_user_level() {
        return member_user_level;
    }

    public String getMember_user_name() {
        return member_user_name;
    }
}
