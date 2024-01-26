package algorithm;

import java.util.ArrayList;
import java.util.List;

public class ItemManager<T> {
    private List<T> lista;

    public ItemManager() {
        this.lista = new ArrayList<>();
    }

    public void addItem(T item){
        lista.add(item);
    }

    public T getItem(int index){
        if(index >= 0 && index < lista.size()){
            return lista.get(index);
        } else {
            throw new IllegalArgumentException("index out of bounds");
        }
    }
    public int getItemCount(){
        return lista.size();
    }

}
