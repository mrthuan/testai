package pdf.pdfreader.viewer.editor.free.feature.ocr.vm;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OCRResultViewModel.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel", f = "OCRResultViewModel.kt", l = {126, ShapeTypes.PLUS, ShapeTypes.FLOW_CHART_INPUT_OUTPUT, ShapeTypes.FLOW_CHART_INTERNAL_STORAGE}, m = "uploadImage")
/* loaded from: classes3.dex */
public final class OCRResultViewModel$uploadImage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OCRResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRResultViewModel$uploadImage$1(OCRResultViewModel oCRResultViewModel, kotlin.coroutines.c<? super OCRResultViewModel$uploadImage$1> cVar) {
        super(cVar);
        this.this$0 = oCRResultViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
        return OCRResultViewModel.d(this.this$0, null, null, null, null, this);
    }
}
