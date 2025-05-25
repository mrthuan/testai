package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: Timeout.kt */
/* loaded from: classes.dex */
public final class TimeoutCancellationException extends CancellationException {
    public final transient y0 coroutine;

    public TimeoutCancellationException(String str, y0 y0Var) {
        super(str);
        this.coroutine = y0Var;
    }

    public TimeoutCancellationException createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }
}
