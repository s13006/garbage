class Break02{
	public static void main(String[] args){
	Outer:
	  for(int i = 1; i < 10; i++){
	    for(int j = 1; j < 10; j++){
	      if(i == 5 && j == 5) break Outer;
	      System.out.print(" " + j*i);
	    }
	    System.out.println();
	  }
	}
}
