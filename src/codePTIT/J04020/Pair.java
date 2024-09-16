package codePTIT.J04020;


class Pair<T1, T2> {
    T1 first;
    T2 second;
    Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
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
