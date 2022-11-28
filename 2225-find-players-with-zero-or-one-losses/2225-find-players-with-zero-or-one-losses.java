class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
    
    Map<Integer, Integer> playerToLosses = new HashMap<>();
    
    for( int[] m : matches ){
        
        playerToLosses.putIfAbsent(m[0],0);
        playerToLosses.put(m[1],playerToLosses.getOrDefault(m[1], 0)+1);
        
    }

    List<List<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>());
    result.add(new ArrayList<>());
    
    for( Map.Entry<Integer, Integer> e: playerToLosses.entrySet() ){
        if( e.getValue() == 0 ){
            result.get(0).add(e.getKey());
        }else if( e.getValue() == 1 ) {
            result.get(1).add(e.getKey());                
        }
    }
    
    Collections.sort(result.get(0));
    Collections.sort(result.get(1));
    
    return result;
}
}