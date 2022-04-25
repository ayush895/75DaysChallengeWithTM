class RandomizedSet {
    private ArrayList<Integer> value;
    private Map<Integer,Integer> index2map;
    public RandomizedSet() {
        value=new ArrayList<>();
        index2map=new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(index2map.containsKey(val))
        {
            return false;
        }
        index2map.put(val,value.size());
        value.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!index2map.containsKey(val))
        {
            return false;
        }
//         last index and last index value
        int lastindex=value.size()-1;
        int lastindexvalue=value.get(lastindex);
        
        //to remove val
        int removeindex=index2map.get(val);
        value.set(removeindex,lastindexvalue);
        value.remove(lastindex);        
        
        //update Map
        index2map.put(lastindexvalue,removeindex);
        index2map.remove(val);

        return true;
    }
    
    public int getRandom() {
        int index=new Random().nextInt(value.size());
        return value.get(index);
        }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
