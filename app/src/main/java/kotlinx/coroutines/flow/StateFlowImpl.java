package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: StateFlow.kt */
/* loaded from: classes.dex */
public final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.a<b0> implements r<T>, c, kotlinx.coroutines.flow.internal.j<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20087f = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: e  reason: collision with root package name */
    public int f20088e;

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
        if (kotlin.jvm.internal.g.a(r0, r2) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:14:0x0042, B:34:0x00aa, B:36:0x00b2, B:39:0x00b9, B:40:0x00bd, B:42:0x00c0, B:52:0x00e1, B:57:0x00f9, B:58:0x0111, B:64:0x0123, B:65:0x012c, B:68:0x0135, B:61:0x011b, B:44:0x00c6, B:48:0x00cd, B:19:0x0060, B:22:0x0073, B:33:0x009b), top: B:76:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:14:0x0042, B:34:0x00aa, B:36:0x00b2, B:39:0x00b9, B:40:0x00bd, B:42:0x00c0, B:52:0x00e1, B:57:0x00f9, B:58:0x0111, B:64:0x0123, B:65:0x012c, B:68:0x0135, B:61:0x011b, B:44:0x00c6, B:48:0x00cd, B:19:0x0060, B:22:0x0073, B:33:0x009b), top: B:76:0x0028 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00f7 -> B:34:0x00aa). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0137 -> B:34:0x00aa). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.d<? super T> r18, kotlin.coroutines.c<?> r19) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.a(kotlinx.coroutines.flow.d, kotlin.coroutines.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.r, kotlinx.coroutines.flow.a0
    public final T b() {
        com.android.billingclient.api.a0 a0Var = ea.a.f16519d;
        T t4 = (T) f20087f.get(this);
        if (t4 == a0Var) {
            return null;
        }
        return t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.android.billingclient.api.a0] */
    @Override // kotlinx.coroutines.flow.r
    public final boolean c(T t4, T t10) {
        ?? r02 = ea.a.f16519d;
        if (t4 == null) {
            t4 = r02;
        }
        if (t10 == null) {
            t10 = r02;
        }
        return l(t4, t10);
    }

    @Override // kotlinx.coroutines.flow.q
    public final void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.q
    public final boolean e(T t4) {
        setValue(t4);
        return true;
    }

    @Override // kotlinx.coroutines.flow.d
    public final Object emit(T t4, kotlin.coroutines.c<? super tf.d> cVar) {
        setValue(t4);
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.flow.internal.j
    public final c<T> g(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        boolean z10;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((z10 || i10 == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) || ((i10 == 0 || i10 == -3) && bufferOverflow == BufferOverflow.SUSPEND)) {
            return this;
        }
        return new kotlinx.coroutines.flow.internal.e(i10, coroutineContext, bufferOverflow, this);
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final b0 i() {
        return new b0();
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final kotlinx.coroutines.flow.internal.b[] j() {
        return new b0[2];
    }

    public final boolean l(Object obj, Object obj2) {
        int i10;
        Object obj3;
        com.android.billingclient.api.a0 a0Var;
        boolean z10;
        boolean z11;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20087f;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.g.a(obj4, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.g.a(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f20088e;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.f20088e = i12;
                Object obj5 = this.f20112a;
                tf.d dVar = tf.d.f30009a;
                while (true) {
                    b0[] b0VarArr = (b0[]) obj5;
                    if (b0VarArr != null) {
                        for (b0 b0Var : b0VarArr) {
                            if (b0Var != null) {
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b0.f20093a;
                                    Object obj6 = atomicReferenceFieldUpdater2.get(b0Var);
                                    if (obj6 != null && obj6 != (a0Var = t0.f28772e)) {
                                        com.android.billingclient.api.a0 a0Var2 = t0.f28771d;
                                        if (obj6 == a0Var2) {
                                            while (true) {
                                                if (atomicReferenceFieldUpdater2.compareAndSet(b0Var, obj6, a0Var)) {
                                                    z10 = true;
                                                    break;
                                                } else if (atomicReferenceFieldUpdater2.get(b0Var) != obj6) {
                                                    z10 = false;
                                                    break;
                                                }
                                            }
                                            if (z10) {
                                                break;
                                            }
                                        } else {
                                            while (true) {
                                                if (atomicReferenceFieldUpdater2.compareAndSet(b0Var, obj6, a0Var2)) {
                                                    z11 = true;
                                                    break;
                                                } else if (atomicReferenceFieldUpdater2.get(b0Var) != obj6) {
                                                    z11 = false;
                                                    break;
                                                }
                                            }
                                            if (z11) {
                                                ((kotlinx.coroutines.h) obj6).resumeWith(Result.m13constructorimpl(tf.d.f30009a));
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.f20088e;
                        if (i10 == i12) {
                            this.f20088e = i12 + 1;
                            return true;
                        }
                        obj3 = this.f20112a;
                        tf.d dVar2 = tf.d.f30009a;
                    }
                    obj5 = obj3;
                    i12 = i10;
                }
            } else {
                this.f20088e = i11 + 2;
                return true;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.r
    public final void setValue(T t4) {
        if (t4 == null) {
            t4 = (T) ea.a.f16519d;
        }
        l(null, t4);
    }
}
