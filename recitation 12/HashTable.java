import java.util.*;
public class HashTable<K,V> implements HashMap<K, V>{
	private Entry<K, V>[] table;
	private int table_size = 10;
	private int N = 0;

	@SuppressWarnings("unchecked")
	public HashTable(){
		this.table = new Entry[table_size];
	}

	/** Contains key-value pairs for a hash table. */
    public static class Entry<K, V> implements Map.Entry<K, V> {

        /** The key */
        private K key;
        /** The value */
        private V value;

        /**
         * Creates a new key-value pair.
         * @param key The key
         * @param value The value
         */
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        /**
         * Retrieves the key.
         * @return The key
         */
        @Override
        public K getKey() {
            return key;
        }

        /**
         * Retrieves the value.
         * @return The value
         */
        @Override
        public V getValue() {
            return value;
        }

        /**
         * Sets the value.
         * @param val The new value
         * @return The old value
         */
        @Override
        public V setValue(V val) {
            V oldVal = value;
            value = val;
            return oldVal;
        }
	/**
         * Return a String representation of the Entry
         * @return a String representation of the Entry
         *         in the form key = value
         */
        @Override
        public String toString() {
            return key.toString() + "," + value.toString();
        }
        
    }

    public int getHash(Object key){
    	int  index =  key.hashCode() % this.table_size;
    	if(index < 0 ){
	       index += this.table_size;
	       return index;
	   }else{
	   	return index;
	   }
    }


    public V put(K key, V value){
    	int first_index = -1;
    	if(N == this.table_size){
    		return null;
    	}
    	int hash = getHash(key);
    	for(int i = 0; i < this.table_size; i++){
    		int new_hash = (hash+i)%this.table_size;
    		if(this.table[new_hash] == null){
    			if(first_index == -1){
    				first_index = new_hash;
    			}
    		}else if (this.table[new_hash].getKey().equals(key)){
    			this.table[new_hash].setValue(value);
    			return null;
    		}
    	}
    	if(first_index == -1){
    		System.out.println("Could not insert");
    		return null;
    	}
    	this.table[first_index] = new Entry<K, V>(key, value);
    	N++;
    	return null;
    
    }

    public V remove(Object key){
    	V res = null;
    	int hash = getHash(key);
    	for(int i = 0; i < this.table_size; i++){
    		int new_hash = (hash+i)%this.table_size;
    		if(this.table[new_hash] != null){
    			if(this.table[new_hash].getKey().equals(key)){
    				res = this.table[new_hash].getValue();
    				this.table[new_hash] = null;
    				N--;
    				System.out.println("Removed: " + res);
    				return res;
    			}
    		}
    	}
    	System.out.println("Key: " + key + " not in table");
    	return res;
    }

    public V get(Object key){
    	int hash = getHash(key);
    	for(int i = 0; i < this.table_size; i++){
    		int new_hash = (hash+i)%this.table_size;
    		if(this.table[new_hash] != null){
    			if(this.table[new_hash].getKey().equals(key)){
    				System.out.println("Got: " + this.table[new_hash].getValue());
    				return this.table[new_hash].getValue();
    			}
    		}
    	}
    	System.out.println("Key: " + key + " not in table");
    	return null;
    }


	public int size(){
		return this.N;
	}

	public boolean isEmpty(){
		if(this.N == 0){
			return true;
		}else{
			return false;
		}
	}

	public void tooString(){
		System.out.println(Arrays.toString(this.table));
	}


	public static void main(String[] args){
		HashTable ht = new HashTable();
		ht.put(2, "Hello");
		ht.put(12, "Hey");
		ht.remove(2);
		ht.put(12, "Cheese");
		ht.tooString();
		

	}


}