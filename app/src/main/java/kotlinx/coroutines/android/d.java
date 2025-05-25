package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import cg.l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.h;
import kotlinx.coroutines.j0;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes.dex */
public final class d extends e {
    private volatile d _immediate;
    public final Handler c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19985d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f19986e;

    /* renamed from: f  reason: collision with root package name */
    public final d f19987f;

    public d(Handler handler, String str, boolean z10) {
        this.c = handler;
        this.f19985d = str;
        this.f19986e = z10;
        this._immediate = z10 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f19987f = dVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d) && ((d) obj).c == this.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // kotlinx.coroutines.d0
    public final void j(long j10, h hVar) {
        final c cVar = new c(hVar, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(cVar, j10)) {
            hVar.u(new l<Throwable, tf.d>() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
                    invoke2(th2);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    d.this.c.removeCallbacks(cVar);
                }
            });
        } else {
            x(hVar.f20159e, cVar);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void n(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.c.post(runnable)) {
            x(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean p() {
        if (this.f19986e && g.a(Looper.myLooper(), this.c.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.f1, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        f1 f1Var;
        String str;
        lg.b bVar = j0.f20206a;
        f1 f1Var2 = kotlinx.coroutines.internal.l.f20194a;
        if (this == f1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                f1Var = f1Var2.v();
            } catch (UnsupportedOperationException unused) {
                f1Var = null;
            }
            if (this == f1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f19985d;
            if (str2 == null) {
                str2 = this.c.toString();
            }
            if (this.f19986e) {
                return a6.h.c(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    @Override // kotlinx.coroutines.f1
    public final f1 v() {
        return this.f19987f;
    }

    public final void x(CoroutineContext coroutineContext, Runnable runnable) {
        b.b.l(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        j0.f20207b.n(coroutineContext, runnable);
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
