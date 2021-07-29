import java.util.Arrays;

public class MyList<T>{

    Object[] list;
    private int capacity;


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public MyList() {

        this.setCapacity(10);
        list =  new Object[capacity];

    }

    public MyList(int capacity) {

        this.capacity = capacity;
        list = new Object[capacity];

    }

    public int size(){

        int counter = 0;
        capacity = list.length;

        for (Object o : this.list) {

            if (o != null) {

                counter++;

            }

        }

        return counter;

    }

    public void growSize(){

        capacity = list.length;
        Object[] tempArray =  new Object[capacity*2];

        for (int i=0;i<this.size();i++){

            tempArray[i] =  list[i];

        }

        list = tempArray;

    }

    public void add(Object data){

        capacity = list.length;

        if (this.size() == list.length){

            growSize();

        }

        if (this.size() == 0){


            list = new Object[this.capacity];

        }

        list[this.size()] = data;




    }

    public Object get(int index){

        capacity = list.length;

        if (index>=0 && index<this.size()){

            return (this.list[index]);

        }else{

            return null;

        }

    }

    public void remove(int index){

        capacity = list.length;
        Object[] temp;
        int tempSize = this.size()-1;
        temp = new Object[tempSize];

        if (index>=0 && index<this.size()){

            //  0 1  2  3  4  5  6
            // [5,15,25,35,45,55,65]

            for (int i=0;i<index;i++){

                temp[i] = list[i];

            }

            for (int i=index;i<temp.length;i++){

                temp[i] = list[i+1];
            }

            list = temp;

        }else{


            System.out.println("Index is invalid.");

        }

    }

    public void set(int index, Object data){

        capacity = list.length;

        if (index>=0 && index<this.size()){

            list[index] = data;

        }else{

            System.out.println("Index is invalid.");

        }


    }

    @Override
    public String toString() {

        capacity = list.length;
        Object[] temp = new Object[this.size()];

        for (int i=0;i<temp.length;i++){

            temp[i] = list[i];

        }

        list = temp;

        return Arrays.toString(this.list);

    }

    public int indexOf(Object data){

        capacity = list.length;
        int index;

        for (int i=0;i<this.size();i++){

            if (this.get(i) == data){

                index = i;
                return index;

            }

        }

        return -1;

    }

    public int lastIndexOf(Object data){

        capacity = list.length;
        int index;

        for (int i=this.size();i>0;i--){

            if (this.get(i) == data){

                index = i;
                return index;
            }

        }

        return -1;

    }

    public boolean isEmpty(){

        return this.size() == 0;

    }

    public Object[] toArray(){

        Object[] temp = new Object[this.size()];

        System.arraycopy(list,0,temp,0, temp.length);

        return temp;
    }

    public void clear(){

        list = new Object[list.length];

    }

    public MyList<T> subList(int start,int finish){

        MyList<T> temp = new MyList<>();
        int size = finish-start+1;

        for (int i=0;i<size;i++){

            temp.add(list[start]);
            start++;

        }

        return temp;

    }

    public boolean contains(Object data){

        capacity = list.length;

        for (int i=0;i<this.size();i++){

            if (list[i].toString().equals(data.toString())){

                return true;
            }

        }

        return false;

    }

}
