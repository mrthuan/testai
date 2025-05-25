package kotlinx.coroutines.flow;

import com.google.android.play.core.assetpacks.b1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: StateFlow.kt */
/* loaded from: classes.dex */
public final class b0 extends kotlinx.coroutines.flow.internal.b<StateFlowImpl<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20093a = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_state");
    private volatile Object _state;

    @Override // kotlinx.coroutines.flow.internal.b
    public final boolean a(kotlinx.coroutines.flow.internal.a aVar) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) aVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20093a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, t0.f28771d);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.b
    public final kotlin.coroutines.c[] b(kotlinx.coroutines.flow.internal.a aVar) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) aVar;
        f20093a.set(this, null);
        return b1.f13189m;
    }
}
