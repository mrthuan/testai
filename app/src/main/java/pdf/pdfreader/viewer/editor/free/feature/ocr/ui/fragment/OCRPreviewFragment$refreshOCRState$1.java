package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import cg.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRStateManager;
import tf.d;

/* compiled from: OCRPreviewFragment.kt */
/* loaded from: classes3.dex */
final class OCRPreviewFragment$refreshOCRState$1 extends Lambda implements l<OCRStateManager.OCRState, d> {
    final /* synthetic */ OCRPreviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRPreviewFragment$refreshOCRState$1(OCRPreviewFragment oCRPreviewFragment) {
        super(1);
        this.this$0 = oCRPreviewFragment;
    }

    @Override // cg.l
    public /* bridge */ /* synthetic */ d invoke(OCRStateManager.OCRState oCRState) {
        invoke2(oCRState);
        return d.f30009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OCRStateManager.OCRState it) {
        g.e(it, "it");
        OCRPreviewFragment.t0(this.this$0, it);
    }
}
