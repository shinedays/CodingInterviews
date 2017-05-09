package MinInStack_21;

/**
 * Created by bupt on 5/8/17.
 */
public class Data implements Comparable<Data>{
    private int data;

    public Data(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int compareTo(Data o) {
        if(this.data > o.getData())
            return 1;
        else if(this.data == o.getData())
            return 0;
        else
            return -1;
    }
}
