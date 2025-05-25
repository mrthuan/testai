package pdf.pdfreader.viewer.editor.free.ui.feature.debug;

import am.i;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView;

/* compiled from: ReaderDebugActivity.kt */
/* loaded from: classes3.dex */
public final class c extends Pdf2WordConvertCompletedView.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderDebugActivity f27855b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReaderDebugActivity readerDebugActivity) {
        super(ea.a.p("CVJ-TSZBe0w=", "yzBot6sN"));
        this.f27855b = readerDebugActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
    public final void close() {
        ReaderDebugActivity readerDebugActivity = this.f27855b;
        i iVar = readerDebugActivity.f27845a;
        if (iVar != null) {
            iVar.f965d.removeAllViews();
            i iVar2 = readerDebugActivity.f27845a;
            if (iVar2 != null) {
                iVar2.f965d.setVisibility(8);
                return;
            } else {
                g.i(ea.a.p("KmkWZDFuZw==", "Y8HxXh3w"));
                throw null;
            }
        }
        g.i(ea.a.p("UWklZBpuZw==", "aBdAvH7r"));
        throw null;
    }
}
