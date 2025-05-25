package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25565a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pdf2ImagePicPreviewActivity f25566b;

    public /* synthetic */ q(Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity, int i10) {
        this.f25565a = i10;
        this.f25566b = pdf2ImagePicPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f25565a;
        Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = this.f25566b;
        switch (i10) {
            case 0:
                int i11 = Pdf2ImagePicPreviewActivity.I0;
                kotlin.jvm.internal.g.e(pdf2ImagePicPreviewActivity, ea.a.p("R2gic1cw", "WqUvBYya"));
                pdf2ImagePicPreviewActivity.onBackPressed();
                return;
            default:
                int i12 = Pdf2ImagePicPreviewActivity.I0;
                kotlin.jvm.internal.g.e(pdf2ImagePicPreviewActivity, ea.a.p("Q2gNc34w", "uO7dZ4uj"));
                pdf2ImagePicPreviewActivity.a3(false);
                return;
        }
    }
}
