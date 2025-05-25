package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* compiled from: FlowExceptions.kt */
/* loaded from: classes.dex */
public final class AbortFlowException extends CancellationException {
    public final transient kotlinx.coroutines.flow.d<?> owner;

    public AbortFlowException(kotlinx.coroutines.flow.d<?> dVar) {
        super("Flow was aborted, no more elements needed");
        this.owner = dVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
