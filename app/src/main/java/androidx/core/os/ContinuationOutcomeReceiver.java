package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.activity.s;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.coroutines.c;
import kotlin.jvm.internal.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutcomeReceiver.kt */
/* loaded from: classes.dex */
public final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    private final c<R> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(c<? super R> continuation) {
        super(false);
        g.e(continuation, "continuation");
        this.continuation = continuation;
    }

    public void onError(E error) {
        g.e(error, "error");
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m13constructorimpl(s.v(error)));
        }
    }

    public void onResult(R r4) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m13constructorimpl(r4));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
