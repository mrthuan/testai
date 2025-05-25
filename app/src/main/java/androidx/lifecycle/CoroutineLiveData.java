package androidx.lifecycle;

import androidx.lifecycle.u;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.y0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import s.b;

/* compiled from: CoroutineLiveData.kt */
/* loaded from: classes.dex */
public final class CoroutineLiveData<T> extends u<T> {

    /* renamed from: m  reason: collision with root package name */
    public b<T> f3972m;

    public CoroutineLiveData(CoroutineContext coroutineContext, long j10, cg.p<? super t<T>, ? super kotlin.coroutines.c<? super tf.d>, ? extends Object> pVar) {
        m1 m1Var = new m1((y0) coroutineContext.get(y0.b.f20277a));
        lg.b bVar = kotlinx.coroutines.j0.f20206a;
        f1 v10 = kotlinx.coroutines.internal.l.f20194a.v();
        v10.getClass();
        this.f3972m = new b<>(this, pVar, j10, kotlinx.coroutines.x.a(CoroutineContext.DefaultImpls.a(v10, coroutineContext).plus(m1Var)), new cg.a<tf.d>(this) { // from class: androidx.lifecycle.CoroutineLiveData.1
            final /* synthetic */ CoroutineLiveData<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.f3972m = null;
            }
        });
    }

    @Override // androidx.lifecycle.LiveData
    public final void g() {
        b.e eVar = (b.e) this.f4081l.iterator();
        if (!eVar.hasNext()) {
            b<T> bVar = this.f3972m;
            if (bVar != null) {
                l1 l1Var = bVar.f4027g;
                if (l1Var != null) {
                    l1Var.b(null);
                }
                bVar.f4027g = null;
                if (bVar.f4026f == null) {
                    bVar.f4026f = t0.d0(bVar.f4024d, null, null, new BlockRunner$maybeRun$1(bVar, null), 3);
                    return;
                }
                return;
            }
            return;
        }
        ((u.a) ((Map.Entry) eVar.next()).getValue()).getClass();
        throw null;
    }

    @Override // androidx.lifecycle.LiveData
    public final void h() {
        b.e eVar = (b.e) this.f4081l.iterator();
        if (!eVar.hasNext()) {
            b<T> bVar = this.f3972m;
            if (bVar != null) {
                if (bVar.f4027g == null) {
                    lg.b bVar2 = kotlinx.coroutines.j0.f20206a;
                    bVar.f4027g = t0.d0(bVar.f4024d, kotlinx.coroutines.internal.l.f20194a.v(), null, new BlockRunner$cancel$1(bVar, null), 2);
                    return;
                }
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
            }
            return;
        }
        ((u.a) ((Map.Entry) eVar.next()).getValue()).getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tf.d l(kotlin.coroutines.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            if (r1 == 0) goto L33
            r2 = 1
            if (r1 != r2) goto L2b
            java.lang.Object r0 = r0.L$0
            androidx.lifecycle.CoroutineLiveData r0 = (androidx.lifecycle.CoroutineLiveData) r0
            androidx.activity.s.u0(r5)
            goto L37
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            androidx.activity.s.u0(r5)
            r0 = r4
        L37:
            r0.getClass()
            tf.d r5 = tf.d.f30009a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.l(kotlin.coroutines.c):tf.d");
    }
}
