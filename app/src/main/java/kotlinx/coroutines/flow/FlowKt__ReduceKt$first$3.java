package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
@wf.c(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {ShapeTypes.SQUARE_TABS}, m = "first")
/* loaded from: classes.dex */
public final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ReduceKt$first$3(kotlin.coroutines.c<? super FlowKt__ReduceKt$first$3> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
        return n.b(null, null, this);
    }
}
