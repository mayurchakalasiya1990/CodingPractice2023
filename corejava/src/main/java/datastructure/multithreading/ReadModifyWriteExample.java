package datastructure.multithreading;

/*
       this.count = 0;
   A:  Reads this.count into a register (0)
   B:  Reads this.count into a register (0)
   B:  Adds value 2 to register
   B:  Writes register value (2) back to memory. this.count now equals 2
   A:  Adds value 3 to register
   A:  Writes register value (3) back to memory. this.count now equals 3
 */
public class ReadModifyWriteExample {
    protected long count = 0;

    public void add(long value) {
        this.count = this.count + value;
    }
}
