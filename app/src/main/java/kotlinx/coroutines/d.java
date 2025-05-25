package kotlinx.coroutines;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* compiled from: Future.kt */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Future<?> f20045a;

    public d(ScheduledFuture scheduledFuture) {
        this.f20045a = scheduledFuture;
    }

    @Override // kotlinx.coroutines.f
    public final void c(Throwable th2) {
        if (th2 != null) {
            this.f20045a.cancel(false);
        }
    }

    @Override // cg.l
    public final /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
        c(th2);
        return tf.d.f30009a;
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f20045a + ']';
    }
}
