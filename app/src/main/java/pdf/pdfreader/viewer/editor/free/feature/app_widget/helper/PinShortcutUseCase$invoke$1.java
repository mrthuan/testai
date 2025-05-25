package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: PinShortcutUseCase.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PinShortcutUseCase", f = "PinShortcutUseCase.kt", l = {103}, m = "invoke")
/* loaded from: classes3.dex */
public final class PinShortcutUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PinShortcutUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinShortcutUseCase$invoke$1(PinShortcutUseCase pinShortcutUseCase, kotlin.coroutines.c<? super PinShortcutUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = pinShortcutUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
        return this.this$0.a(null, null, null, null, null, this);
    }
}
