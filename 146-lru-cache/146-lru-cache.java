class LRUCache {
    int capacity = 0;
    HashMap<Integer, Integer> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }
    
    public int get(int key) {
        if( !map.containsKey(key) ) return -1;
        int val = map.get(key);
        map.remove(key);
        map.put(key, val);
        return val;
    }
    
    public void put(int key, int value) {
        if( map.containsKey(key) ) {
            map.remove(key);
        }else if( map.size() == capacity) {
            map.remove(map.entrySet().iterator().next().getKey());
        }
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */