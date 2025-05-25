package kotlinx.coroutines.internal;

import com.android.billingclient.api.a0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.n1;

/* compiled from: ThreadContext.kt */
/* loaded from: classes.dex */
public final class ThreadContextKt {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f20165a = new a0("NO_THREAD_ELEMENTS", 8);

    /* renamed from: b  reason: collision with root package name */
    public static final cg.p<Object, CoroutineContext.a, Object> f20166b = new cg.p<Object, CoroutineContext.a, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // cg.p
        public final Object invoke(Object obj, CoroutineContext.a aVar) {
            if (aVar instanceof n1) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    };
    public static final cg.p<n1<?>, CoroutineContext.a, n1<?>> c = new cg.p<n1<?>, CoroutineContext.a, n1<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // cg.p
        public final n1<?> invoke(n1<?> n1Var, CoroutineContext.a aVar) {
            if (n1Var != null) {
                return n1Var;
            }
            if (aVar instanceof n1) {
                return (n1) aVar;
            }
            return null;
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public static final cg.p<v, CoroutineContext.a, v> f20167d = new cg.p<v, CoroutineContext.a, v>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // cg.p
        public final v invoke(v vVar, CoroutineContext.a aVar) {
            if (aVar instanceof n1) {
                n1<Object> n1Var = (n1) aVar;
                String T = n1Var.T(vVar.f20202a);
                int i10 = vVar.f20204d;
                vVar.f20203b[i10] = T;
                vVar.f20204d = i10 + 1;
                vVar.c[i10] = n1Var;
            }
            return vVar;
        }
    };

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f20165a) {
            return;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            n1<Object>[] n1VarArr = vVar.c;
            int length = n1VarArr.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i10 = length - 1;
                n1<Object> n1Var = n1VarArr[length];
                kotlin.jvm.internal.g.b(n1Var);
                n1Var.s(vVar.f20203b[length]);
                if (i10 >= 0) {
                    length = i10;
                } else {
                    return;
                }
            }
        } else {
            Object fold = coroutineContext.fold(null, c);
            kotlin.jvm.internal.g.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((n1) fold).s(obj);
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f20166b);
        kotlin.jvm.internal.g.b(fold);
        return fold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f20165a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new v(coroutineContext, ((Number) obj).intValue()), f20167d);
        }
        return ((n1) obj).T(coroutineContext);
    }
}
