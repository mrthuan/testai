package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ThreadContextKt;

/* compiled from: CoroutineStart.kt */
/* loaded from: classes.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19981a;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19981a = iArr;
        }
    }

    public final <T> void invoke(cg.l<? super kotlin.coroutines.c<? super T>, ? extends Object> lVar, kotlin.coroutines.c<? super T> completion) {
        int i10 = a.f19981a[ordinal()];
        if (i10 == 1) {
            try {
                ge.a.O(com.google.android.play.core.assetpacks.b1.L(com.google.android.play.core.assetpacks.b1.s(lVar, completion)), Result.m13constructorimpl(tf.d.f30009a), null);
            } finally {
                completion.resumeWith(Result.m13constructorimpl(androidx.activity.s.v(th)));
            }
        } else if (i10 == 2) {
            kotlin.jvm.internal.g.e(lVar, "<this>");
            kotlin.jvm.internal.g.e(completion, "completion");
            com.google.android.play.core.assetpacks.b1.L(com.google.android.play.core.assetpacks.b1.s(lVar, completion)).resumeWith(Result.m13constructorimpl(tf.d.f30009a));
        } else if (i10 != 3) {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            kotlin.jvm.internal.g.e(completion, "completion");
            try {
                CoroutineContext context = completion.getContext();
                Object c = ThreadContextKt.c(context, null);
                kotlin.jvm.internal.k.c(1, lVar);
                Object invoke = lVar.invoke(completion);
                ThreadContextKt.a(context, c);
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    completion.resumeWith(Result.m13constructorimpl(invoke));
                }
            } catch (Throwable th2) {
            }
        }
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R, T> void invoke(cg.p<? super R, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, R r4, kotlin.coroutines.c<? super T> completion) {
        int i10 = a.f19981a[ordinal()];
        if (i10 == 1) {
            kg.a.a(pVar, r4, completion);
        } else if (i10 == 2) {
            kotlin.jvm.internal.g.e(pVar, "<this>");
            kotlin.jvm.internal.g.e(completion, "completion");
            com.google.android.play.core.assetpacks.b1.L(com.google.android.play.core.assetpacks.b1.t(pVar, r4, completion)).resumeWith(Result.m13constructorimpl(tf.d.f30009a));
        } else if (i10 != 3) {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            kotlin.jvm.internal.g.e(completion, "completion");
            try {
                CoroutineContext context = completion.getContext();
                Object c = ThreadContextKt.c(context, null);
                kotlin.jvm.internal.k.c(2, pVar);
                Object invoke = pVar.invoke(r4, completion);
                ThreadContextKt.a(context, c);
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    completion.resumeWith(Result.m13constructorimpl(invoke));
                }
            } catch (Throwable th2) {
                completion.resumeWith(Result.m13constructorimpl(androidx.activity.s.v(th2)));
            }
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
