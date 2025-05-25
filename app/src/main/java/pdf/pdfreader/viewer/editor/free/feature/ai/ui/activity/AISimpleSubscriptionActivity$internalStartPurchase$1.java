package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AISimpleSubscriptionActivity.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity", f = "AISimpleSubscriptionActivity.kt", l = {ShapeTypes.ACTION_BUTTON_DOCUMENT, ShapeTypes.GEAR_9, ShapeTypes.CHART_X, 215, 228}, m = "internalStartPurchase")
/* loaded from: classes3.dex */
public final class AISimpleSubscriptionActivity$internalStartPurchase$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AISimpleSubscriptionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AISimpleSubscriptionActivity$internalStartPurchase$1(AISimpleSubscriptionActivity aISimpleSubscriptionActivity, kotlin.coroutines.c<? super AISimpleSubscriptionActivity$internalStartPurchase$1> cVar) {
        super(cVar);
        this.this$0 = aISimpleSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
        return AISimpleSubscriptionActivity.b2(this.this$0, null, null, this);
    }
}
