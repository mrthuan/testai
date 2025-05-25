package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements x0.u, x.a, androidx.activity.result.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ jl.a f26938a;

    public /* synthetic */ h(jl.a aVar) {
        this.f26938a = aVar;
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        ReaderSplitPdfActivity.l2((ReaderSplitPdfActivity) this.f26938a, (Map) obj);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.x.a
    public final void d() {
        ReaderMergePdfActivity readerMergePdfActivity = (ReaderMergePdfActivity) this.f26938a;
        int i10 = ReaderMergePdfActivity.f26780f0;
        kotlin.jvm.internal.g.e(readerMergePdfActivity, ea.a.p("TWgic0Ew", "Pq9KeRlA"));
        readerMergePdfActivity.startActivity(new Intent(readerMergePdfActivity, ReaderHomeActivity.class));
    }

    @Override // x0.u
    public final x0.s0 m(View view, x0.s0 s0Var) {
        LanguageChooseActivity languageChooseActivity = (LanguageChooseActivity) this.f26938a;
        int i10 = LanguageChooseActivity.H;
        kotlin.jvm.internal.g.e(languageChooseActivity, ea.a.p("R2gic1cw", "IxBT3tha"));
        kotlin.jvm.internal.g.e(view, ea.a.p("D2Elbx15D28HcxRwCHI3bSF0V3JmMD4=", "abI9xiga"));
        ea.a.p("Jm5CZQ1z", "JYXWJu3z");
        o0.b a10 = s0Var.a(7);
        kotlin.jvm.internal.g.d(a10, ea.a.p("Jm5CZQ1zGWc_dANuBmUccx1XB24hbxJJj4DtQyRtBGE7LmV5CWUZcyNzPmUYQglyRihHKQ==", "NTbemKKt"));
        boolean hasWindowFocus = languageChooseActivity.hasWindowFocus();
        int i11 = a10.f22640b;
        if (hasWindowFocus || i11 != 0) {
            FrameLayout frameLayout = languageChooseActivity.b2().f950l;
            if (i11 <= 0) {
                i11 = languageChooseActivity.b2().f950l.getPaddingTop();
            }
            int i12 = a10.f22641d;
            if (i12 <= 0) {
                i12 = languageChooseActivity.b2().f950l.getPaddingBottom();
            }
            frameLayout.setPadding(0, i11, 0, i12);
        }
        return s0Var;
    }
}
