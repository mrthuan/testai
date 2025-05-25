package pdf.pdfreader.viewer.editor.free.utils;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: ReaderPDFThumb.java */
/* loaded from: classes3.dex */
public final class y0 extends ReaderPDFCore {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f28797a;

    public final Bitmap t(int i10, int i11) {
        PointF pageSize = getPageSize(0);
        float max = Math.max(i10 / pageSize.x, i11 / pageSize.y);
        Point point = new Point((int) (pageSize.x * max), (int) (pageSize.y * max));
        Bitmap createBitmap = Bitmap.createBitmap(point.x, point.y, Bitmap.Config.ARGB_8888);
        this.f28797a = createBitmap;
        int i12 = point.x;
        int i13 = point.y;
        drawPage(createBitmap, 0, i12, i13, 0, 0, i12, i13, new ReaderPDFCore.Cookie());
        return this.f28797a;
    }

    public final Bitmap u(int i10, int i11, int i12) {
        PointF pageSize = getPageSize(i12);
        float max = Math.max(i10 / pageSize.x, i11 / pageSize.y);
        Point point = new Point((int) (pageSize.x * max), (int) (pageSize.y * max));
        Bitmap e10 = com.bumptech.glide.b.b(ReaderPdfApplication.m()).f6833a.e(point.x, point.y, Bitmap.Config.ARGB_8888);
        int i13 = point.x;
        int i14 = point.y;
        drawPage(e10, i12, i13, i14, 0, 0, i13, i14, new ReaderPDFCore.Cookie());
        return e10;
    }
}
