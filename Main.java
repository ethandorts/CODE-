class Main {
  public static void main(String[] args) {
    Method1(12);
}
    public static void Method1(int x) {
        int num = x;
        String [] word = {"C", "O", "D", "E"};

        while (x >= 1) {
            for(int i = 0; i < word.length; i++) {
            System.out.println(word[i] + x);
            x = x -1;
            }
        } 
        
    }
}