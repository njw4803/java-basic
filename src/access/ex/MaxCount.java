package access.ex;

public class MaxCount {
    private int count;
    private int max;

    public MaxCount(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초가할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
