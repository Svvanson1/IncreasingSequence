boolean almostIncreasingSequence(int[] sequence) {
    if (sequence.length == 2 && sequence[0] < sequence[1]) {
        return true;
    }

    ArrayList<Integer> myList = new ArrayList<Integer>();
     for (int x = 0; x < sequence.length; x++) {
         myList.add(sequence[x]);
        }
    
    Arrays.sort(sequence);
    int matches = 0;
    for(int i = 1; i < sequence.length; i++) {
    if(sequence[i] == sequence[i - 1]) {
        System.out.println("match!");
        matches++;
        }
        if (matches > 1) {
        return false;
        }
    }
    
    for (int i = 0; i < myList.size(); i++) {
        boolean isTrue = checkIncreasing(myList, i);
            if (isTrue) {
                return true;
                }
             }
    
    return false;
}

boolean checkIncreasing(ArrayList<Integer> a, int removalNum) {
    a.remove(removalNum);
    for(int i=1; i<a.size();i++)
    {
        if(a.get(i-1) >= a.get(i)) {
            return false;
        }
    }
    return true;
}
