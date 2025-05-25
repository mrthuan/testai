package kotlinx.coroutines.internal;

import com.google.android.play.core.assetpacks.b1;
import kotlin.coroutines.CoroutineContext;

/* compiled from: OnUndeliveredElement.kt */
/* loaded from: classes.dex */
public final class OnUndeliveredElementKt {
    public static final <E> cg.l<Throwable, tf.d> a(final cg.l<? super E, tf.d> lVar, final E e10, final CoroutineContext coroutineContext) {
        return new cg.l<Throwable, tf.d>() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                OnUndeliveredElementKt.b(lVar, e10, coroutineContext);
            }
        };
    }

    public static final <E> void b(cg.l<? super E, tf.d> lVar, E e10, CoroutineContext coroutineContext) {
        UndeliveredElementException c = c(lVar, e10, null);
        if (c != null) {
            kotlinx.coroutines.v.a(coroutineContext, c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException c(cg.l<? super E, tf.d> lVar, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th2) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th2) {
                b1.n(undeliveredElementException, th2);
            } else {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th2);
            }
        }
        return undeliveredElementException;
    }
}
