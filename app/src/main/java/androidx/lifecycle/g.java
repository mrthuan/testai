package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CallbackFlowBuilder;

/* compiled from: FlowExt.kt */
/* loaded from: classes.dex */
public final class g {
    public static final CallbackFlowBuilder a(kotlinx.coroutines.flow.u uVar, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        kotlin.jvm.internal.g.e(uVar, "<this>");
        kotlin.jvm.internal.g.e(minActiveState, "minActiveState");
        return new CallbackFlowBuilder(new FlowExtKt$flowWithLifecycle$1(lifecycle, minActiveState, uVar, null), EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }
}
