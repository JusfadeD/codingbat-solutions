package logic1;

public class answerCall {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }

        if (isMorning) {
            if (isMom) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
