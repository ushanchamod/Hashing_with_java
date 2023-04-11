package AdvancedArray;

public class AdvancedArray<T> {
    private T[] list;

    public AdvancedArray(T[] list){
        this.list = list;
    } 

    // Return index of data
    public int indexOf(T data){
        int index = -1;
        for(int i=0; i < list.length; i++){
            if(list[i].equals(data)){
                index = i;
                break;
            }
        }
        return index;
    }

    // Return List
    public T[] getList(){
        return list;
    }
}
