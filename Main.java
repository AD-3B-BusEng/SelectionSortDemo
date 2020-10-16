class Main {
  public static void main(String[] args) {
    int[] getallen = {5,6,3,78,1};
    print(getallen);
    ArraySorter.selectionSort(getallen);
    print(getallen);
  }

  public static void print(int[] getallen){
    for(int x : getallen)
      System.out.print(x + " ");
    System.out.println();
  }
}