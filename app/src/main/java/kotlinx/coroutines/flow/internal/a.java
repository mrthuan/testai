package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlinx.coroutines.flow.internal.b;

/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes.dex */
public abstract class a<S extends b<?>> {

    /* renamed from: a  reason: collision with root package name */
    public S[] f20112a;

    /* renamed from: b  reason: collision with root package name */
    public int f20113b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public o f20114d;

    public final o f() {
        o oVar;
        synchronized (this) {
            oVar = this.f20114d;
            if (oVar == null) {
                oVar = new o(this.f20113b);
                this.f20114d = oVar;
            }
        }
        return oVar;
    }

    public final S h() {
        S s4;
        o oVar;
        synchronized (this) {
            S[] sArr = this.f20112a;
            if (sArr == null) {
                sArr = (S[]) j();
                this.f20112a = sArr;
            } else if (this.f20113b >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                kotlin.jvm.internal.g.d(copyOf, "copyOf(this, newSize)");
                this.f20112a = (S[]) ((b[]) copyOf);
                sArr = (S[]) ((b[]) copyOf);
            }
            int i10 = this.c;
            do {
                s4 = sArr[i10];
                if (s4 == null) {
                    s4 = i();
                    sArr[i10] = s4;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                kotlin.jvm.internal.g.c(s4, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s4.a(this));
            this.c = i10;
            this.f20113b++;
            oVar = this.f20114d;
        }
        if (oVar != null) {
            oVar.y(1);
        }
        return s4;
    }

    public abstract S i();

    public abstract b[] j();

    public final void k(S s4) {
        o oVar;
        int i10;
        kotlin.coroutines.c[] b10;
        synchronized (this) {
            int i11 = this.f20113b - 1;
            this.f20113b = i11;
            oVar = this.f20114d;
            if (i11 == 0) {
                this.c = 0;
            }
            kotlin.jvm.internal.g.c(s4, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b10 = s4.b(this);
        }
        for (kotlin.coroutines.c cVar : b10) {
            if (cVar != null) {
                cVar.resumeWith(Result.m13constructorimpl(tf.d.f30009a));
            }
        }
        if (oVar != null) {
            oVar.y(-1);
        }
    }
}
