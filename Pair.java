public class Pair <k,v> {
    private k first;
    private v second;
    public Pair(k first,v second){
        this.first = first;
        this.second = second;
    }
    public k getFirst(){
        return this.first;
    }
    public v getSecond(){
        return this.second;
    }
    public void setFirst(k first){
        this.first = first;
    }
    public void setSecond(v second){
        this.second = second;
    }
    public void merge(k first){
        this.first = first;
    }
}
