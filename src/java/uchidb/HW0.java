package uchidb;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
/**
 * @author kzen
 */
public class HW0<T,S> implements Containers<T,S>{

    private Map<S,T> m;    
    
    public HW0(){}

    public Set<T> initSet(T[] tArray){
        Set<T> s = new HashSet<T>(Arrays.asList(tArray)); 
        return s;
    }
    public List<T> initList(T[] tArray){
        List<T> l = new ArrayList<T>(Arrays.asList(tArray));
        return l;
    }
    public Map<S,T> initEmptyMap(){
        m = new HashMap<S,T>();
        return m;
    }

    public void storeMap(Map<S,T> mapToStoreInClass){
        m = mapToStoreInClass;
    }
   
    public boolean addToMap(S key, T value, boolean overwriteExistingKey){
        if(overwriteExistingKey){
            m.put(key,value);
            return true;    
        } 
        else if(m.containsKey(key)){
            return false;
        }
        else{
            m.put(key,value);
            return true;
        }
    }

    public T getValueFromMap(S key){
        return m.get(key);
    }
    
    public T getValueFromMap(S key, T defaultValue){
        T tmp = m.get(key);
        if(tmp == null){
            return defaultValue;
        }
        return tmp;
    }

}


