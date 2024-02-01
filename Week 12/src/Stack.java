
class Stack {

  
  private int arr[];
  private int top;
  private int capacity;

  Stack(int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
  }

  public void push(int x) {
    if (isFull()==true) {
      System.out.println("Stack OverFlow");

      System.exit(1);
    }

    System.out.println("Inserting " + x);
    arr[++top] = x;
  }

  public int pop() {
    if (isEmpty()==true) {
      System.out.println("STACK EMPTY");

      System.exit(1);
    }

    return arr[top--];
  }

  public int getSize() {
    return top + 1;
  }

  public Boolean isEmpty() {
    if (top==-1)
	  return true;
    else 
    	return false;
  }

  public Boolean isFull() {
    if(top == capacity - 1)
	  return true;
    else
    	return false;
  }

  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.print(arr[i] + ", ");
    }
  }
  public boolean isPrime(int n) {
		for (int d = 2; d <= n / 2; d++) {
			if (n % d == 0) 
				return false;
		}
		return true;
	}

}
