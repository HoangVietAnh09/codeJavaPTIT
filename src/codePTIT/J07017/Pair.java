package codePTIT.J07017;

class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return n > 1;
    }
    public boolean isPrime(){
        return isPrime((Integer) first) && isPrime((Integer) second);
    }

    public String toString(){
        return first + " " + second;
    }

}
