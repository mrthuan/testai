package rp;

import android.graphics.Matrix;
import lib.zj.office.PathHolder;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: PathClipRunner.java */
/* loaded from: classes3.dex */
public final class d implements qp.a {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f29653a;

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f29654b;

    public d(PathHolder pathHolder, Matrix matrix) {
        this.f29653a = pathHolder.a();
        this.f29654b = new Matrix(matrix);
    }

    @Override // qp.a
    public final boolean b(ReaderPDFCore.b bVar) {
        Boolean bool;
        float[] holderPathToPdfPath;
        boolean pageClipPath;
        Matrix matrix = this.f29654b;
        if (bVar.f21371a != 0) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            holderPathToPdfPath = ReaderPDFCore.holderPathToPdfPath(this.f29653a);
            pageClipPath = ReaderPDFCore.this.pageClipPath(bVar.f21371a, holderPathToPdfPath, fArr);
            bool = Boolean.valueOf(pageClipPath);
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
