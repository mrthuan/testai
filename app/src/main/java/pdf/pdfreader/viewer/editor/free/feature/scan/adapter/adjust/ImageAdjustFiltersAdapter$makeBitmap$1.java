package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageAdjustFiltersAdapter.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter", f = "ImageAdjustFiltersAdapter.kt", l = {86}, m = "makeBitmap-0E7RQCE")
/* loaded from: classes3.dex */
public final class ImageAdjustFiltersAdapter$makeBitmap$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageAdjustFiltersAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAdjustFiltersAdapter$makeBitmap$1(ImageAdjustFiltersAdapter imageAdjustFiltersAdapter, kotlin.coroutines.c<? super ImageAdjustFiltersAdapter$makeBitmap$1> cVar) {
        super(cVar);
        this.this$0 = imageAdjustFiltersAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
        Object h10 = ImageAdjustFiltersAdapter.h(this.this$0, null, null, this);
        if (h10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return h10;
        }
        return Result.m12boximpl(h10);
    }
}
