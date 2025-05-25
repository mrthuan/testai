package rp;

import android.graphics.Matrix;
import lib.zj.office.PathHolder;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: PathDrawRunner.java */
/* loaded from: classes3.dex */
public final class e implements qp.a {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f29655a;

    /* renamed from: b  reason: collision with root package name */
    public final float f29656b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29657d;

    /* renamed from: e  reason: collision with root package name */
    public final Matrix f29658e;

    public e(PathHolder pathHolder, int i10, float f10, int i11, Matrix matrix) {
        this.f29655a = pathHolder.a();
        this.f29656b = f10;
        this.c = i10;
        this.f29657d = i11;
        this.f29658e = new Matrix(matrix);
    }

    @Override // qp.a
    public final boolean b(ReaderPDFCore.b bVar) {
        Boolean bool;
        float[] holderPathToPdfPath;
        boolean pageWritePath;
        int i10 = this.c;
        float f10 = this.f29656b;
        int i11 = this.f29657d;
        Matrix matrix = this.f29658e;
        if (bVar.f21371a != 0) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            holderPathToPdfPath = ReaderPDFCore.holderPathToPdfPath(this.f29655a);
            pageWritePath = ReaderPDFCore.this.pageWritePath(bVar.f21371a, holderPathToPdfPath, i10, f10, i11, fArr);
            bool = Boolean.valueOf(pageWritePath);
        } else {
            bool = null;
        }
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // qp.a
    public final /* synthetic */ void a() {
    }
}
