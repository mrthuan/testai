package androidx.lifecycle;

import com.inmobi.commons.core.configs.TelemetryConfig;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: FlowLiveData.kt */
/* loaded from: classes.dex */
public final class h {
    public static CoroutineLiveData a(kotlinx.coroutines.flow.a0 a0Var) {
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        kotlin.jvm.internal.g.e(a0Var, "<this>");
        kotlin.jvm.internal.g.e(context, "context");
        CoroutineLiveData coroutineLiveData = new CoroutineLiveData(context, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL, new FlowLiveDataConversions$asLiveData$1(a0Var, null));
        if (r.b.m().n()) {
            coroutineLiveData.j(a0Var.b());
        } else {
            coroutineLiveData.k(a0Var.b());
        }
        return coroutineLiveData;
    }
}
