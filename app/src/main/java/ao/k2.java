package ao;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.text.TextUtils;
import android.widget.ImageView;
import java.util.Objects;
import lib.zj.pdfeditor.PDFPageAdapter;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class k2 implements lo.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5094a;

    public k2(ReaderPreviewActivity readerPreviewActivity) {
        this.f5094a = readerPreviewActivity;
    }

    @Override // lo.b
    public final void a(int i10, int i11, int i12, ImageView imageView, lo.c cVar, boolean z10) {
        int i13;
        float f10;
        ReaderPreviewActivity readerPreviewActivity = this.f5094a;
        if (readerPreviewActivity.f26256t1 != null && readerPreviewActivity.f26276w1 != null && !readerPreviewActivity.isFinishing() && !readerPreviewActivity.isDestroyed()) {
            try {
                if (TextUtils.isEmpty(readerPreviewActivity.E2)) {
                    return;
                }
                if (!z10 && lo.d.d(i10, readerPreviewActivity.E2)) {
                    return;
                }
                if (z10) {
                    lo.d.c(i10, readerPreviewActivity.E2);
                }
                ij.c b10 = ((PDFPageAdapter) readerPreviewActivity.f26276w1.getAdapter()).getRepository().b(i10);
                if (b10 == null) {
                    PointF pageSize = readerPreviewActivity.f26256t1.getPageSize(i10);
                    ((PDFPageAdapter) readerPreviewActivity.f26276w1.getAdapter()).getRepository().c(i10, pageSize);
                    i13 = (int) pageSize.x;
                    f10 = pageSize.y;
                } else {
                    i13 = (int) b10.f18529a;
                    f10 = b10.f18530b;
                }
                int i14 = (int) (((int) f10) * ((i11 * 1.0f) / i13));
                Bitmap createBitmap = Bitmap.createBitmap(i11, i14, Bitmap.Config.ARGB_8888);
                ReaderPDFCore readerPDFCore = readerPreviewActivity.f26256t1;
                Objects.requireNonNull(readerPDFCore);
                readerPDFCore.drawPage(createBitmap, i10, i11, i14, 0, 0, i11, i14, new ReaderPDFCore.Cookie());
                lo.d.f(readerPreviewActivity.E2, createBitmap, i10);
                readerPreviewActivity.D.post(new j2(imageView, i10, createBitmap, cVar, z10));
            } catch (Exception e10) {
                cVar.e(e10);
            }
        }
    }
}
