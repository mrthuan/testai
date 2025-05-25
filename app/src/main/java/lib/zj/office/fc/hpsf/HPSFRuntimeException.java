package lib.zj.office.fc.hpsf;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class HPSFRuntimeException extends RuntimeException {
    private Throwable reason;

    public HPSFRuntimeException() {
    }

    public Throwable getReason() {
        return this.reason;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public HPSFRuntimeException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        Throwable reason = getReason();
        super.printStackTrace(printStream);
        if (reason != null) {
            printStream.println("Caused by:");
            reason.printStackTrace(printStream);
        }
    }

    public HPSFRuntimeException(Throwable th2) {
        this.reason = th2;
    }

    public HPSFRuntimeException(String str, Throwable th2) {
        super(str);
        this.reason = th2;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        Throwable reason = getReason();
        super.printStackTrace(printWriter);
        if (reason != null) {
            printWriter.println("Caused by:");
            reason.printStackTrace(printWriter);
        }
    }
}
