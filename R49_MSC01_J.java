public final int DURATION=10000; // In milliseconds
 
public void nop() throws InterruptedException {
  while (true) {
    // Useful operations
    Thread.sleep(DURATION);
  }
}