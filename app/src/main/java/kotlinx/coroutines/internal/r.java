package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* compiled from: StackTraceRecovery.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f20198a = 0;

    static {
        Object m13constructorimpl;
        Object m13constructorimpl2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            m13constructorimpl = Result.m13constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th2) {
            m13constructorimpl = Result.m13constructorimpl(androidx.activity.s.v(th2));
        }
        if (Result.m16exceptionOrNullimpl(m13constructorimpl) != null) {
            m13constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) m13constructorimpl;
        try {
            m13constructorimpl2 = Result.m13constructorimpl(r.class.getCanonicalName());
        } catch (Throwable th3) {
            m13constructorimpl2 = Result.m13constructorimpl(androidx.activity.s.v(th3));
        }
        if (Result.m16exceptionOrNullimpl(m13constructorimpl2) != null) {
            m13constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) m13constructorimpl2;
    }
}
