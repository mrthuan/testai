package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.ui.widget.ReflowOpenGuideView;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: ReflowOpenGuideView.java */
/* loaded from: classes3.dex */
public final class f extends l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReflowOpenGuideView f28385b;

    public f(ReflowOpenGuideView reflowOpenGuideView) {
        this.f28385b = reflowOpenGuideView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        ReflowOpenGuideView reflowOpenGuideView = this.f28385b;
        ReflowOpenGuideView.a aVar = reflowOpenGuideView.f28283r;
        if (aVar != null) {
            aVar.a();
        }
        reflowOpenGuideView.setVisibility(8);
    }
}
