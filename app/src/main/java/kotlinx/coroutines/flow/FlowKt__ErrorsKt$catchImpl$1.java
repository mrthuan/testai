package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Errors.kt */
@wf.c(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {ShapeTypes.FLOW_CHART_MAGNETIC_DRUM}, m = "catchImpl")
/* loaded from: classes.dex */
public final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ErrorsKt$catchImpl$1(kotlin.coroutines.c<? super FlowKt__ErrorsKt$catchImpl$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
        return h.a(this, null, null);
    }
}
