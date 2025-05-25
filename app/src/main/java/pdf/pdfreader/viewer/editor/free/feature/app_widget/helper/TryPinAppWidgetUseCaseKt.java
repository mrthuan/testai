package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.j0;

/* compiled from: TryPinAppWidgetUseCase.kt */
/* loaded from: classes3.dex */
public final class TryPinAppWidgetUseCaseKt {
    public static final kotlinx.coroutines.flow.c<Lifecycle.Event> a(Lifecycle lifecycle) {
        CallbackFlowBuilder callbackFlowBuilder = new CallbackFlowBuilder(new TryPinAppWidgetUseCaseKt$eventFlow$1(lifecycle, null), EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
        lg.b bVar = j0.f20206a;
        return aj.b.o(callbackFlowBuilder, l.f20194a.v());
    }
}
