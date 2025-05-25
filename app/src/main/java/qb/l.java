package qb;

import com.inmobi.media.Q7;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29236a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f29237b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i10, Object obj, boolean z10) {
        this.f29236a = i10;
        this.c = obj;
        this.f29237b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29236a;
        boolean z10 = this.f29237b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                Q7.a((Q7) obj, z10);
                return;
            default:
                Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = (Pdf2ImageLongPicPreviewActivity) obj;
                int i11 = Pdf2ImageLongPicPreviewActivity.f25506w0;
                kotlin.jvm.internal.g.e(pdf2ImageLongPicPreviewActivity, ea.a.p("R2gic1cw", "SsS0mtsi"));
                pdf2ImageLongPicPreviewActivity.Z2().c.setChecked(z10);
                pdf2ImageLongPicPreviewActivity.Z2().f1080b.setChecked(!z10);
                pdf2ImageLongPicPreviewActivity.a3().f25464i = z10;
                if (pdf2ImageLongPicPreviewActivity.a3().getItemCount() > 0) {
                    pdf2ImageLongPicPreviewActivity.a3().notifyItemRangeChanged(0, pdf2ImageLongPicPreviewActivity.a3().getItemCount(), (ArrayList) pdf2ImageLongPicPreviewActivity.f25508p0.getValue());
                    return;
                }
                return;
        }
    }
}
