package kotlinx.coroutines.flow;

import com.google.android.play.core.assetpacks.b1;
import java.util.Arrays;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.l0;

/* compiled from: SharedFlow.kt */
/* loaded from: classes.dex */
public class v<T> extends kotlinx.coroutines.flow.internal.a<w> implements q<T>, c, kotlinx.coroutines.flow.internal.j<T> {

    /* renamed from: e  reason: collision with root package name */
    public final int f20136e;

    /* renamed from: f  reason: collision with root package name */
    public final int f20137f;

    /* renamed from: g  reason: collision with root package name */
    public final BufferOverflow f20138g;

    /* renamed from: h  reason: collision with root package name */
    public Object[] f20139h;

    /* renamed from: i  reason: collision with root package name */
    public long f20140i;

    /* renamed from: j  reason: collision with root package name */
    public long f20141j;

    /* renamed from: k  reason: collision with root package name */
    public int f20142k;

    /* renamed from: l  reason: collision with root package name */
    public int f20143l;

    /* compiled from: SharedFlow.kt */
    /* loaded from: classes.dex */
    public static final class a implements k0 {

        /* renamed from: a  reason: collision with root package name */
        public final v<?> f20144a;

        /* renamed from: b  reason: collision with root package name */
        public final long f20145b;
        public final Object c;

        /* renamed from: d  reason: collision with root package name */
        public final kotlin.coroutines.c<tf.d> f20146d;

        public a(v vVar, long j10, Object obj, kotlinx.coroutines.h hVar) {
            this.f20144a = vVar;
            this.f20145b = j10;
            this.c = obj;
            this.f20146d = hVar;
        }

        @Override // kotlinx.coroutines.k0
        public final void dispose() {
            v<?> vVar = this.f20144a;
            synchronized (vVar) {
                if (this.f20145b >= vVar.r()) {
                    Object[] objArr = vVar.f20139h;
                    kotlin.jvm.internal.g.b(objArr);
                    int i10 = (int) this.f20145b;
                    if (objArr[(objArr.length - 1) & i10] == this) {
                        objArr[i10 & (objArr.length - 1)] = ea.a.c;
                        vVar.m();
                        tf.d dVar = tf.d.f30009a;
                    }
                }
            }
        }
    }

    /* compiled from: SharedFlow.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20147a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20147a = iArr;
        }
    }

    public v(int i10, int i11, BufferOverflow bufferOverflow) {
        this.f20136e = i10;
        this.f20137f = i11;
        this.f20138g = bufferOverflow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
        throw r8.i();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.coroutines.intrinsics.CoroutineSingletons n(kotlinx.coroutines.flow.v r8, kotlinx.coroutines.flow.d r9, kotlin.coroutines.c r10) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.n(kotlinx.coroutines.flow.v, kotlinx.coroutines.flow.d, kotlin.coroutines.c):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    @Override // kotlinx.coroutines.flow.c
    public final Object a(d<? super T> dVar, kotlin.coroutines.c<?> cVar) {
        return n(this, dVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.q
    public final void d() {
        synchronized (this) {
            w(r() + this.f20142k, this.f20141j, r() + this.f20142k, r() + this.f20142k + this.f20143l);
            tf.d dVar = tf.d.f30009a;
        }
    }

    @Override // kotlinx.coroutines.flow.q
    public final boolean e(T t4) {
        int i10;
        boolean z10;
        kotlin.coroutines.c<tf.d>[] cVarArr = b1.f13189m;
        synchronized (this) {
            if (t(t4)) {
                cVarArr = q(cVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (kotlin.coroutines.c<tf.d> cVar : cVarArr) {
            if (cVar != null) {
                cVar.resumeWith(Result.m13constructorimpl(tf.d.f30009a));
            }
        }
        return z10;
    }

    @Override // kotlinx.coroutines.flow.d
    public final Object emit(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
        kotlin.coroutines.c<tf.d>[] cVarArr;
        a aVar;
        if (e(t4)) {
            return tf.d.f30009a;
        }
        kotlinx.coroutines.h hVar = new kotlinx.coroutines.h(1, b1.L(cVar));
        hVar.s();
        kotlin.coroutines.c<tf.d>[] cVarArr2 = b1.f13189m;
        synchronized (this) {
            if (t(t4)) {
                hVar.resumeWith(Result.m13constructorimpl(tf.d.f30009a));
                cVarArr = q(cVarArr2);
                aVar = null;
            } else {
                a aVar2 = new a(this, this.f20142k + this.f20143l + r(), t4, hVar);
                p(aVar2);
                this.f20143l++;
                if (this.f20137f == 0) {
                    cVarArr2 = q(cVarArr2);
                }
                cVarArr = cVarArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            hVar.u(new l0(aVar));
        }
        for (kotlin.coroutines.c<tf.d> cVar2 : cVarArr) {
            if (cVar2 != null) {
                cVar2.resumeWith(Result.m13constructorimpl(tf.d.f30009a));
            }
        }
        Object r4 = hVar.r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (r4 != coroutineSingletons) {
            r4 = tf.d.f30009a;
        }
        if (r4 != coroutineSingletons) {
            return tf.d.f30009a;
        }
        return r4;
    }

    @Override // kotlinx.coroutines.flow.internal.j
    public final c<T> g(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        if ((i10 == 0 || i10 == -3) && bufferOverflow == BufferOverflow.SUSPEND) {
            return this;
        }
        return new kotlinx.coroutines.flow.internal.e(i10, coroutineContext, bufferOverflow, this);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final w i() {
        return new w();
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.internal.b[] j() {
        return new w[2];
    }

    public final Object l(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        kotlinx.coroutines.h hVar = new kotlinx.coroutines.h(1, b1.L(cVar));
        hVar.s();
        synchronized (this) {
            if (u(wVar) < 0) {
                wVar.f20149b = hVar;
            } else {
                hVar.resumeWith(Result.m13constructorimpl(tf.d.f30009a));
            }
            tf.d dVar = tf.d.f30009a;
        }
        Object r4 = hVar.r();
        if (r4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return r4;
        }
        return tf.d.f30009a;
    }

    public final void m() {
        if (this.f20137f == 0 && this.f20143l <= 1) {
            return;
        }
        Object[] objArr = this.f20139h;
        kotlin.jvm.internal.g.b(objArr);
        while (this.f20143l > 0) {
            long r4 = r();
            int i10 = this.f20142k;
            int i11 = this.f20143l;
            if (objArr[((int) ((r4 + (i10 + i11)) - 1)) & (objArr.length - 1)] == ea.a.c) {
                this.f20143l = i11 - 1;
                objArr[((int) (r() + this.f20142k + this.f20143l)) & (objArr.length - 1)] = null;
            } else {
                return;
            }
        }
    }

    public final void o() {
        Object[] objArr;
        Object[] objArr2 = this.f20139h;
        kotlin.jvm.internal.g.b(objArr2);
        objArr2[((int) r()) & (objArr2.length - 1)] = null;
        this.f20142k--;
        long r4 = r() + 1;
        if (this.f20140i < r4) {
            this.f20140i = r4;
        }
        if (this.f20141j < r4) {
            if (this.f20113b != 0 && (objArr = this.f20112a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        w wVar = (w) obj;
                        long j10 = wVar.f20148a;
                        if (j10 >= 0 && j10 < r4) {
                            wVar.f20148a = r4;
                        }
                    }
                }
            }
            this.f20141j = r4;
        }
    }

    public final void p(Object obj) {
        int i10 = this.f20142k + this.f20143l;
        Object[] objArr = this.f20139h;
        if (objArr == null) {
            objArr = s(null, 0, 2);
        } else if (i10 >= objArr.length) {
            objArr = s(objArr, i10, objArr.length * 2);
        }
        objArr[((int) (r() + i10)) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final kotlin.coroutines.c<tf.d>[] q(kotlin.coroutines.c<tf.d>[] cVarArr) {
        Object[] objArr;
        w wVar;
        kotlinx.coroutines.h hVar;
        int length = cVarArr.length;
        if (this.f20113b != 0 && (objArr = this.f20112a) != null) {
            int length2 = objArr.length;
            int i10 = 0;
            cVarArr = cVarArr;
            while (i10 < length2) {
                Object obj = objArr[i10];
                if (obj != null && (hVar = (wVar = (w) obj).f20149b) != null && u(wVar) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.g.d(copyOf, "copyOf(this, newSize)");
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = hVar;
                    wVar.f20149b = null;
                    length++;
                }
                i10++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long r() {
        return Math.min(this.f20141j, this.f20140i);
    }

    public final Object[] s(Object[] objArr, int i10, int i11) {
        boolean z10;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object[] objArr2 = new Object[i11];
            this.f20139h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long r4 = r();
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (int) (i12 + r4);
                objArr2[i13 & (i11 - 1)] = objArr[(objArr.length - 1) & i13];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean t(T t4) {
        int i10 = this.f20113b;
        int i11 = this.f20136e;
        if (i10 == 0) {
            if (i11 != 0) {
                p(t4);
                int i12 = this.f20142k + 1;
                this.f20142k = i12;
                if (i12 > i11) {
                    o();
                }
                this.f20141j = r() + this.f20142k;
            }
            return true;
        }
        int i13 = this.f20142k;
        int i14 = this.f20137f;
        if (i13 >= i14 && this.f20141j <= this.f20140i) {
            int i15 = b.f20147a[this.f20138g.ordinal()];
            if (i15 != 1) {
                if (i15 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        p(t4);
        int i16 = this.f20142k + 1;
        this.f20142k = i16;
        if (i16 > i14) {
            o();
        }
        long r4 = r() + this.f20142k;
        long j10 = this.f20140i;
        if (((int) (r4 - j10)) > i11) {
            w(j10 + 1, this.f20141j, r() + this.f20142k, r() + this.f20142k + this.f20143l);
        }
        return true;
    }

    public final long u(w wVar) {
        long j10 = wVar.f20148a;
        if (j10 < r() + this.f20142k) {
            return j10;
        }
        if (this.f20137f > 0 || j10 > r() || this.f20143l == 0) {
            return -1L;
        }
        return j10;
    }

    public final Object v(w wVar) {
        Object obj;
        kotlin.coroutines.c<tf.d>[] cVarArr = b1.f13189m;
        synchronized (this) {
            long u7 = u(wVar);
            if (u7 < 0) {
                obj = ea.a.c;
            } else {
                long j10 = wVar.f20148a;
                Object[] objArr = this.f20139h;
                kotlin.jvm.internal.g.b(objArr);
                Object obj2 = objArr[((int) u7) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).c;
                }
                wVar.f20148a = u7 + 1;
                Object obj3 = obj2;
                cVarArr = x(j10);
                obj = obj3;
            }
        }
        for (kotlin.coroutines.c<tf.d> cVar : cVarArr) {
            if (cVar != null) {
                cVar.resumeWith(Result.m13constructorimpl(tf.d.f30009a));
            }
        }
        return obj;
    }

    public final void w(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long r4 = r(); r4 < min; r4++) {
            Object[] objArr = this.f20139h;
            kotlin.jvm.internal.g.b(objArr);
            objArr[((int) r4) & (objArr.length - 1)] = null;
        }
        this.f20140i = j10;
        this.f20141j = j11;
        this.f20142k = (int) (j12 - min);
        this.f20143l = (int) (j13 - j12);
    }

    public final kotlin.coroutines.c<tf.d>[] x(long j10) {
        int i10;
        long j11;
        long j12;
        long j13;
        boolean z10;
        long j14;
        Object[] objArr;
        int i11 = (j10 > this.f20141j ? 1 : (j10 == this.f20141j ? 0 : -1));
        kotlin.coroutines.c<tf.d>[] cVarArr = b1.f13189m;
        if (i11 > 0) {
            return cVarArr;
        }
        long r4 = r();
        long j15 = this.f20142k + r4;
        int i12 = this.f20137f;
        if (i12 == 0 && this.f20143l > 0) {
            j15++;
        }
        if (this.f20113b != 0 && (objArr = this.f20112a) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j16 = ((w) obj).f20148a;
                    if (j16 >= 0 && j16 < j15) {
                        j15 = j16;
                    }
                }
            }
        }
        if (j15 <= this.f20141j) {
            return cVarArr;
        }
        long r10 = r() + this.f20142k;
        if (this.f20113b > 0) {
            i10 = Math.min(this.f20143l, i12 - ((int) (r10 - j15)));
        } else {
            i10 = this.f20143l;
        }
        long j17 = this.f20143l + r10;
        com.android.billingclient.api.a0 a0Var = ea.a.c;
        if (i10 > 0) {
            cVarArr = new kotlin.coroutines.c[i10];
            Object[] objArr2 = this.f20139h;
            kotlin.jvm.internal.g.b(objArr2);
            long j18 = r10;
            int i13 = 0;
            while (true) {
                if (r10 < j17) {
                    j11 = j15;
                    int i14 = (int) r10;
                    Object obj2 = objArr2[(objArr2.length - 1) & i14];
                    if (obj2 != a0Var) {
                        j12 = j17;
                        kotlin.jvm.internal.g.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        a aVar = (a) obj2;
                        int i15 = i13 + 1;
                        cVarArr[i13] = aVar.f20146d;
                        objArr2[i14 & (objArr2.length - 1)] = a0Var;
                        objArr2[((int) j18) & (objArr2.length - 1)] = aVar.c;
                        j14 = 1;
                        j18++;
                        if (i15 >= i10) {
                            break;
                        }
                        i13 = i15;
                    } else {
                        j12 = j17;
                        j14 = 1;
                    }
                    r10 += j14;
                    j15 = j11;
                    j17 = j12;
                } else {
                    j11 = j15;
                    j12 = j17;
                    break;
                }
            }
            r10 = j18;
        } else {
            j11 = j15;
            j12 = j17;
        }
        kotlin.coroutines.c<tf.d>[] cVarArr2 = cVarArr;
        int i16 = (int) (r10 - r4);
        if (this.f20113b == 0) {
            j13 = r10;
        } else {
            j13 = j11;
        }
        long max = Math.max(this.f20140i, r10 - Math.min(this.f20136e, i16));
        if (i12 == 0 && max < j12) {
            Object[] objArr3 = this.f20139h;
            kotlin.jvm.internal.g.b(objArr3);
            if (kotlin.jvm.internal.g.a(objArr3[((int) max) & (objArr3.length - 1)], a0Var)) {
                r10++;
                max++;
            }
        }
        w(max, j13, r10, j12);
        m();
        if (cVarArr2.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return q(cVarArr2);
        }
        return cVarArr2;
    }
}
