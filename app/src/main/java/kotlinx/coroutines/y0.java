package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Job.kt */
/* loaded from: classes.dex */
public interface y0 extends CoroutineContext.a {

    /* renamed from: d1  reason: collision with root package name */
    public static final /* synthetic */ int f20276d1 = 0;

    /* compiled from: Job.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ k0 a(y0 y0Var, boolean z10, b1 b1Var, int i10) {
            boolean z11 = false;
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return y0Var.r(z10, z11, b1Var);
        }
    }

    /* compiled from: Job.kt */
    /* loaded from: classes.dex */
    public static final class b implements CoroutineContext.b<y0> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f20277a = new b();
    }

    boolean a();

    void b(CancellationException cancellationException);

    y0 getParent();

    Object h(kotlin.coroutines.c<? super tf.d> cVar);

    CancellationException i();

    boolean isCancelled();

    k k(c1 c1Var);

    k0 r(boolean z10, boolean z11, cg.l<? super Throwable, tf.d> lVar);

    boolean start();

    boolean u();
}
