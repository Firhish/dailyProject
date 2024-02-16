package lessons.lesson7.generic.genericPairClass;

public class PairClass<A,B> {
    A firstData;
    B secondData;

    public PairClass(A firstData, B secondData){
        this.firstData = firstData;
        this.secondData = secondData;
    }

    public void setFirstData(A firstData) {
        this.firstData = firstData;
    }

    public A getFirstData() {
        return firstData;
    }

    public void setSecondData(B secondData) {
        this.secondData = secondData;
    }

    public B getSecondData() {
        return secondData;
    }

    @Override
    public String toString() {
        return String.format("first data: %s, second data: %s", firstData,secondData);
    }
    
}
