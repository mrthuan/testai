package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: Executors.kt */
/* loaded from: classes.dex */
public abstract class q0 extends CoroutineDispatcher implements Closeable {
    static {
        ExecutorCoroutineDispatcher$Key$1 safeCast = new cg.l<CoroutineContext.a, q0>() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1
            @Override // cg.l
            public final q0 invoke(CoroutineContext.a aVar) {
                if (aVar instanceof q0) {
                    return (q0) aVar;
                }
                return null;
            }
        };
        CoroutineDispatcher.Key baseKey = CoroutineDispatcher.f19979b;
        kotlin.jvm.internal.g.e(baseKey, "baseKey");
        kotlin.jvm.internal.g.e(safeCast, "safeCast");
    }
}
