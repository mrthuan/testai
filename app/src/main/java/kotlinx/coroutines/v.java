package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.u;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes.dex */
public final class v {
    public static final void a(CoroutineContext coroutineContext, Throwable th2) {
        try {
            u uVar = (u) coroutineContext.get(u.a.f20269a);
            if (uVar != null) {
                uVar.R(coroutineContext, th2);
            } else {
                b.b.G(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                com.google.android.play.core.assetpacks.b1.n(runtimeException, th2);
                th2 = runtimeException;
            }
            b.b.G(coroutineContext, th2);
        }
    }
}
