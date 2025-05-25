package rp;

import android.graphics.Matrix;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: RectClipRunner.java */
/* loaded from: classes3.dex */
public final class f implements qp.a {

    /* renamed from: a  reason: collision with root package name */
    public final float f29659a;

    /* renamed from: b  reason: collision with root package name */
    public final float f29660b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f29661d;

    /* renamed from: e  reason: collision with root package name */
    public final Matrix f29662e;

    public f(float f10, float f11, float f12, float f13, Matrix matrix) {
        this.f29659a = f10;
        this.f29660b = f11;
        this.c = f12;
        this.f29661d = f13;
        this.f29662e = new Matrix(matrix);
    }

    @Override // qp.a
    public final boolean b(ReaderPDFCore.b bVar) {
        Boolean bool;
        boolean pageClipRect;
        float f10 = this.f29659a;
        float f11 = this.f29660b;
        float f12 = this.c;
        float f13 = this.f29661d;
        Matrix matrix = this.f29662e;
        if (bVar.f21371a != 0) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            pageClipRect = ReaderPDFCore.this.pageClipRect(bVar.f21371a, f10, f11, f12, f13, fArr);
            bool = Boolean.valueOf(pageClipRect);
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
