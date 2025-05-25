package lg;

import kotlinx.coroutines.y;

/* compiled from: Tasks.kt */
/* loaded from: classes.dex */
public final class i extends f {
    public final Runnable c;

    public i(Runnable runnable, long j10, g gVar) {
        super(j10, gVar);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.run();
        } finally {
            this.f20587b.a();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(y.b(runnable));
        sb2.append(", ");
        sb2.append(this.f20586a);
        sb2.append(", ");
        sb2.append(this.f20587b);
        sb2.append(']');
        return sb2.toString();
    }
}
