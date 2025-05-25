package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: Exceptions.kt */
/* loaded from: classes.dex */
public final class JobCancellationException extends CancellationException {
    public final transient y0 job;

    public JobCancellationException(String str, Throwable th2, y0 y0Var) {
        super(str);
        this.job = y0Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public JobCancellationException createCopy() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!kotlin.jvm.internal.g.a(jobCancellationException.getMessage(), getMessage()) || !kotlin.jvm.internal.g.a(jobCancellationException.job, this.job) || !kotlin.jvm.internal.g.a(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i10;
        String message = getMessage();
        kotlin.jvm.internal.g.b(message);
        int hashCode = (this.job.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
