package big.work;

public class RecyclerViewItemData<T> {

    int dataType;
    public RecyclerViewItemData() {
    }

    public RecyclerViewItemData(int dataType) {

        this.dataType = dataType;
    }


    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

}
