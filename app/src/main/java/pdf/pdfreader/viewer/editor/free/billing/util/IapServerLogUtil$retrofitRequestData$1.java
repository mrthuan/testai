package pdf.pdfreader.viewer.editor.free.billing.util;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IapServerLogUtil.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.billing.util.IapServerLogUtil", f = "IapServerLogUtil.kt", l = {94}, m = "retrofitRequestData")
/* loaded from: classes3.dex */
public final class IapServerLogUtil$retrofitRequestData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IapServerLogUtil$retrofitRequestData$1(b bVar, kotlin.coroutines.c<? super IapServerLogUtil$retrofitRequestData$1> cVar) {
        super(cVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
        b bVar = this.this$0;
        b bVar2 = b.f24064a;
        return bVar.d(null, null, null, null, this);
    }
}
