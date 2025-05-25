package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes.dex */
public abstract class g0<T> extends lg.f {
    public int c;

    public g0(int i10) {
        this.c = i10;
    }

    public abstract kotlin.coroutines.c<T> d();

    public Throwable e(Object obj) {
        p pVar;
        if (obj instanceof p) {
            pVar = (p) obj;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            return null;
        }
        return pVar.f20226a;
    }

    public final void h(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            com.google.android.play.core.assetpacks.b1.n(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.g.b(th2);
        v.a(d().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        r6 = (kotlinx.coroutines.y0) r6.get(kotlinx.coroutines.y0.b.f20277a);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
            lg.g r0 = r12.f20587b
            kotlin.coroutines.c r1 = r12.d()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.g.c(r1, r2)     // Catch: java.lang.Throwable -> Lb2
            kotlinx.coroutines.internal.f r1 = (kotlinx.coroutines.internal.f) r1     // Catch: java.lang.Throwable -> Lb2
            kotlin.coroutines.c<T> r2 = r1.f20176e     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r1 = r1.f20178g     // Catch: java.lang.Throwable -> Lb2
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.c(r3, r1)     // Catch: java.lang.Throwable -> Lb2
            com.android.billingclient.api.a0 r4 = kotlinx.coroutines.internal.ThreadContextKt.f20165a     // Catch: java.lang.Throwable -> Lb2
            r5 = 0
            if (r1 == r4) goto L23
            kotlinx.coroutines.q1 r4 = kotlinx.coroutines.CoroutineContextKt.d(r2, r3, r1)     // Catch: java.lang.Throwable -> Lb2
            goto L24
        L23:
            r4 = r5
        L24:
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r12.i()     // Catch: java.lang.Throwable -> L63
            java.lang.Throwable r8 = r12.e(r7)     // Catch: java.lang.Throwable -> L63
            if (r8 != 0) goto L47
            int r9 = r12.c     // Catch: java.lang.Throwable -> L63
            r10 = 1
            if (r9 == r10) goto L3c
            r11 = 2
            if (r9 != r11) goto L3b
            goto L3c
        L3b:
            r10 = 0
        L3c:
            if (r10 == 0) goto L47
            kotlinx.coroutines.y0$b r9 = kotlinx.coroutines.y0.b.f20277a     // Catch: java.lang.Throwable -> L63
            kotlin.coroutines.CoroutineContext$a r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L63
            kotlinx.coroutines.y0 r6 = (kotlinx.coroutines.y0) r6     // Catch: java.lang.Throwable -> L63
            goto L48
        L47:
            r6 = r5
        L48:
            if (r6 == 0) goto L65
            boolean r9 = r6.a()     // Catch: java.lang.Throwable -> L63
            if (r9 != 0) goto L65
            java.util.concurrent.CancellationException r6 = r6.i()     // Catch: java.lang.Throwable -> L63
            r12.c(r7, r6)     // Catch: java.lang.Throwable -> L63
            kotlin.Result$Failure r6 = androidx.activity.s.v(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = kotlin.Result.m13constructorimpl(r6)     // Catch: java.lang.Throwable -> L63
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L63
            goto L7e
        L63:
            r2 = move-exception
            goto La6
        L65:
            if (r8 == 0) goto L73
            kotlin.Result$Failure r6 = androidx.activity.s.v(r8)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = kotlin.Result.m13constructorimpl(r6)     // Catch: java.lang.Throwable -> L63
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L63
            goto L7e
        L73:
            java.lang.Object r6 = r12.f(r7)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = kotlin.Result.m13constructorimpl(r6)     // Catch: java.lang.Throwable -> L63
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L63
        L7e:
            tf.d r2 = tf.d.f30009a     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L88
            boolean r2 = r4.m0()     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto L8b
        L88:
            kotlinx.coroutines.internal.ThreadContextKt.a(r3, r1)     // Catch: java.lang.Throwable -> Lb2
        L8b:
            r0.a()     // Catch: java.lang.Throwable -> L95
            tf.d r0 = tf.d.f30009a     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = kotlin.Result.m13constructorimpl(r0)     // Catch: java.lang.Throwable -> L95
            goto L9e
        L95:
            r0 = move-exception
            kotlin.Result$Failure r0 = androidx.activity.s.v(r0)
            java.lang.Object r0 = kotlin.Result.m13constructorimpl(r0)
        L9e:
            java.lang.Throwable r0 = kotlin.Result.m16exceptionOrNullimpl(r0)
            r12.h(r5, r0)
            goto Lcd
        La6:
            if (r4 == 0) goto Lae
            boolean r4 = r4.m0()     // Catch: java.lang.Throwable -> Lb2
            if (r4 == 0) goto Lb1
        Lae:
            kotlinx.coroutines.internal.ThreadContextKt.a(r3, r1)     // Catch: java.lang.Throwable -> Lb2
        Lb1:
            throw r2     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r1 = move-exception
            r0.a()     // Catch: java.lang.Throwable -> Lbd
            tf.d r0 = tf.d.f30009a     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = kotlin.Result.m13constructorimpl(r0)     // Catch: java.lang.Throwable -> Lbd
            goto Lc6
        Lbd:
            r0 = move-exception
            kotlin.Result$Failure r0 = androidx.activity.s.v(r0)
            java.lang.Object r0 = kotlin.Result.m13constructorimpl(r0)
        Lc6:
            java.lang.Throwable r0 = kotlin.Result.m16exceptionOrNullimpl(r0)
            r12.h(r1, r0)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.g0.run():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public void c(Object obj, CancellationException cancellationException) {
    }
}
