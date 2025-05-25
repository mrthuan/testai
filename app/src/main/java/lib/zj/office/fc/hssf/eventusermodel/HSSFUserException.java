package lib.zj.office.fc.hssf.eventusermodel;

/* loaded from: classes3.dex */
public class HSSFUserException extends Exception {
    private Throwable reason;

    public HSSFUserException() {
    }

    public Throwable getReason() {
        return this.reason;
    }

    public HSSFUserException(String str) {
        super(str);
    }

    public HSSFUserException(Throwable th2) {
        this.reason = th2;
    }

    public HSSFUserException(String str, Throwable th2) {
        super(str);
        this.reason = th2;
    }
}
