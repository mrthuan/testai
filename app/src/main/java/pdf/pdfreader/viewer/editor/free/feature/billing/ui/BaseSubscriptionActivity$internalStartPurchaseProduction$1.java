package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity", f = "BaseSubscriptionActivity.kt", l = {TTAdConstant.STYLE_SIZE_RADIO_9_16, 566, 586}, m = "internalStartPurchaseProduction")
/* loaded from: classes3.dex */
public final class BaseSubscriptionActivity$internalStartPurchaseProduction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseSubscriptionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSubscriptionActivity$internalStartPurchaseProduction$1(BaseSubscriptionActivity baseSubscriptionActivity, kotlin.coroutines.c<? super BaseSubscriptionActivity$internalStartPurchaseProduction$1> cVar) {
        super(cVar);
        this.this$0 = baseSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
        return BaseSubscriptionActivity.c2(this.this$0, null, this);
    }
}
