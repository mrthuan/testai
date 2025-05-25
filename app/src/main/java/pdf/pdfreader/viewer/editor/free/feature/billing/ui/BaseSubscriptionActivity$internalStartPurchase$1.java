package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity", f = "BaseSubscriptionActivity.kt", l = {399, TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, 438, 480, 494}, m = "internalStartPurchase")
/* loaded from: classes3.dex */
public final class BaseSubscriptionActivity$internalStartPurchase$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseSubscriptionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSubscriptionActivity$internalStartPurchase$1(BaseSubscriptionActivity baseSubscriptionActivity, kotlin.coroutines.c<? super BaseSubscriptionActivity$internalStartPurchase$1> cVar) {
        super(cVar);
        this.this$0 = baseSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
        return BaseSubscriptionActivity.b2(this.this$0, null, null, this);
    }
}
