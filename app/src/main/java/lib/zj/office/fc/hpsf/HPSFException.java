package lib.zj.office.fc.hpsf;

/* loaded from: classes3.dex */
public class HPSFException extends Exception {
    private Throwable reason;

    public HPSFException() {
    }

    public Throwable getReason() {
        return this.reason;
    }

    public HPSFException(String str) {
        super(str);
    }

    public HPSFException(Throwable th2) {
        this.reason = th2;
    }

    public HPSFException(String str, Throwable th2) {
        super(str);
        this.reason = th2;
    }
}
