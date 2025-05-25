package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.flow.y;
import kotlinx.coroutines.l1;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: Share.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class o {
    public static final s a(FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1, kotlinx.coroutines.internal.d dVar, Boolean bool) {
        x xVar;
        CoroutineStart coroutineStart;
        l1 l1Var;
        kotlinx.coroutines.flow.internal.c cVar;
        c k10;
        StartedLazily startedLazily = y.a.f20154b;
        kotlinx.coroutines.channels.b.f20033e1.getClass();
        int i10 = b.a.f20035b;
        if (1 >= i10) {
            i10 = 1;
        }
        int i11 = i10 - 1;
        if ((flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 instanceof kotlinx.coroutines.flow.internal.c) && (k10 = (cVar = (kotlinx.coroutines.flow.internal.c) flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1).k()) != null) {
            BufferOverflow bufferOverflow = cVar.c;
            int i12 = cVar.f20116b;
            if (i12 != -3 && i12 != -2 && i12 != 0) {
                i11 = i12;
            } else if (bufferOverflow != BufferOverflow.SUSPEND || i12 == 0) {
                i11 = 0;
            }
            xVar = new x(i11, cVar.f20115a, bufferOverflow, k10);
        } else {
            xVar = new x(i11, EmptyCoroutineContext.INSTANCE, BufferOverflow.SUSPEND, flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1);
        }
        StateFlowImpl a10 = t0.a(bool);
        CoroutineContext coroutineContext = (CoroutineContext) xVar.f20152d;
        c cVar2 = (c) xVar.f20151b;
        if (kotlin.jvm.internal.g.a(startedLazily, y.a.f20153a)) {
            coroutineStart = CoroutineStart.DEFAULT;
        } else {
            coroutineStart = CoroutineStart.UNDISPATCHED;
        }
        FlowKt__ShareKt$launchSharing$1 flowKt__ShareKt$launchSharing$1 = new FlowKt__ShareKt$launchSharing$1(startedLazily, cVar2, a10, bool, null);
        CoroutineContext c = CoroutineContextKt.c(dVar, coroutineContext);
        if (coroutineStart.isLazy()) {
            l1Var = new e1(c, flowKt__ShareKt$launchSharing$1);
        } else {
            l1Var = new l1(c, true);
        }
        coroutineStart.invoke(flowKt__ShareKt$launchSharing$1, l1Var, l1Var);
        return new s(a10, l1Var);
    }
}
