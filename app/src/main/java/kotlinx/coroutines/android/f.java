package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.activity.s;
import kotlin.Result;
import kotlin.jvm.internal.g;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes.dex */
public final class f {
    private static volatile Choreographer choreographer;

    static {
        Object m13constructorimpl;
        try {
            m13constructorimpl = Result.m13constructorimpl(new d(a(Looper.getMainLooper())));
        } catch (Throwable th2) {
            m13constructorimpl = Result.m13constructorimpl(s.v(th2));
        }
        if (Result.m18isFailureimpl(m13constructorimpl)) {
            m13constructorimpl = null;
        }
        e eVar = (e) m13constructorimpl;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            g.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
