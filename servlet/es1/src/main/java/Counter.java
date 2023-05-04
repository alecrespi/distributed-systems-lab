
class Counter {
    private int count;
    public Counter(){
        this.count = 0;
    }
    
    public int increase() { return this.count++; }

    public int get() { return this.count; }

}