package pdf.pdfreader.viewer.editor.free.utils.extension;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p;
import kotlinx.coroutines.flow.r;
import pdf.pdfreader.viewer.editor.free.ui.act.a1;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: Flow.kt */
/* loaded from: classes3.dex */
public final class d {
    public static final void a(androidx.appcompat.app.c cVar, r flow, a1 a1Var) {
        kotlin.jvm.internal.g.e(cVar, "<this>");
        kotlin.jvm.internal.g.e(flow, "flow");
        Lifecycle.State minActiveState = Lifecycle.State.STARTED;
        kotlin.jvm.internal.g.e(minActiveState, "minActiveState");
        t0.d0(b.b.x(cVar), null, null, new FlowKt$collect$2(cVar, minActiveState, flow, a1Var, null), 3);
    }

    public static final void b(p pVar, r flow, Lifecycle lifecycle, e eVar) {
        kotlin.jvm.internal.g.e(pVar, "<this>");
        kotlin.jvm.internal.g.e(flow, "flow");
        kotlin.jvm.internal.g.e(lifecycle, "lifecycle");
        Lifecycle.State minActiveState = Lifecycle.State.STARTED;
        kotlin.jvm.internal.g.e(minActiveState, "minActiveState");
        t0.d0(b.b.x(pVar), null, null, new FlowKt$collect$1(lifecycle, minActiveState, flow, eVar, null), 3);
    }
}
