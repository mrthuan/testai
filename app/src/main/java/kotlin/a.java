package kotlin;

import kotlin.jvm.internal.g;
import tf.c;

/* compiled from: LazyJVM.kt */
/* loaded from: classes.dex */
public class a {

    /* compiled from: LazyJVM.kt */
    /* renamed from: kotlin.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0268a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19912a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19912a = iArr;
        }
    }

    public static final <T> c<T> a(cg.a<? extends T> initializer) {
        g.e(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, null, 2, null);
    }

    public static final <T> c<T> b(LazyThreadSafetyMode mode, cg.a<? extends T> initializer) {
        g.e(mode, "mode");
        g.e(initializer, "initializer");
        int i10 = C0268a.f19912a[mode.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return new UnsafeLazyImpl(initializer);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new SafePublicationLazyImpl(initializer);
        }
        return new SynchronizedLazyImpl(initializer, null, 2, null);
    }
}
