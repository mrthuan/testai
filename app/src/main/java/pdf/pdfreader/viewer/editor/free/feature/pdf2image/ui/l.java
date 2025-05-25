package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import java.util.ArrayList;

/* compiled from: BasePdf2ImageActivity.kt */
/* loaded from: classes3.dex */
public final class l implements sn.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePdf2ImageActivity f25557a;

    public l(BasePdf2ImageActivity basePdf2ImageActivity) {
        this.f25557a = basePdf2ImageActivity;
    }

    @Override // sn.b
    public final void a() {
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25557a;
        basePdf2ImageActivity.H.post(new i(basePdf2ImageActivity, 1));
    }

    public final void b(ArrayList arrayList, Exception exc) {
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25557a;
        basePdf2ImageActivity.H.post(new v4.a(6, basePdf2ImageActivity, arrayList, exc));
    }
}
