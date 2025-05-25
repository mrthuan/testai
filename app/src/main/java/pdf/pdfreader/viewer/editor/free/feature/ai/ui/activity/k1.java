package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.text.TextUtils;
import android.widget.ImageView;
import java.util.Objects;
import lib.zj.pdfeditor.PDFPageAdapter;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: ReaderAIPreviewActivity.java */
/* loaded from: classes3.dex */
public final class k1 implements lo.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderAIPreviewActivity f24615a;

    public k1(ReaderAIPreviewActivity readerAIPreviewActivity) {
        this.f24615a = readerAIPreviewActivity;
    }

    @Override // lo.b
    public final void a(int i10, int i11, int i12, ImageView imageView, lo.c cVar, boolean z10) {
        int i13;
        float f10;
        ReaderAIPreviewActivity readerAIPreviewActivity = this.f24615a;
        if (readerAIPreviewActivity.f24479c0 != null && readerAIPreviewActivity.f24483f0 != null && !readerAIPreviewActivity.isFinishing() && !readerAIPreviewActivity.isDestroyed()) {
            try {
                if (TextUtils.isEmpty(readerAIPreviewActivity.C0)) {
                    return;
                }
                if (!z10 && lo.d.d(i10, readerAIPreviewActivity.C0)) {
                    return;
                }
                if (z10) {
                    lo.d.c(i10, readerAIPreviewActivity.C0);
                }
                ij.c b10 = ((PDFPageAdapter) readerAIPreviewActivity.f24483f0.getAdapter()).getRepository().b(i10);
                if (b10 == null) {
                    PointF pageSize = readerAIPreviewActivity.f24479c0.getPageSize(i10);
                    ((PDFPageAdapter) readerAIPreviewActivity.f24483f0.getAdapter()).getRepository().c(i10, pageSize);
                    i13 = (int) pageSize.x;
                    f10 = pageSize.y;
                } else {
                    i13 = (int) b10.f18529a;
                    f10 = b10.f18530b;
                }
                int i14 = (int) (((int) f10) * ((i11 * 1.0f) / i13));
                Bitmap createBitmap = Bitmap.createBitmap(i11, i14, Bitmap.Config.ARGB_8888);
                ReaderPDFCore readerPDFCore = readerAIPreviewActivity.f24479c0;
                Objects.requireNonNull(readerPDFCore);
                readerPDFCore.drawPage(createBitmap, i10, i11, i14, 0, 0, i11, i14, new ReaderPDFCore.Cookie());
                lo.d.f(readerAIPreviewActivity.C0, createBitmap, i10);
                readerAIPreviewActivity.M.post(new j1(imageView, i10, createBitmap, cVar, z10));
            } catch (Exception e10) {
                cVar.e(e10);
            }
        }
    }
}
