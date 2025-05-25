package rp;

import android.graphics.Matrix;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: LineDrawRunner.java */
/* loaded from: classes3.dex */
public final class c implements qp.a {

    /* renamed from: a  reason: collision with root package name */
    public final float f29647a;

    /* renamed from: b  reason: collision with root package name */
    public final float f29648b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f29649d;

    /* renamed from: e  reason: collision with root package name */
    public final float f29650e;

    /* renamed from: f  reason: collision with root package name */
    public final int f29651f;

    /* renamed from: g  reason: collision with root package name */
    public final Matrix f29652g;

    public c(float f10, float f11, float f12, float f13, float f14, int i10, Matrix matrix) {
        this.f29647a = f10;
        this.f29648b = f11;
        this.c = f12;
        this.f29649d = f13;
        this.f29650e = f14;
        this.f29651f = i10;
        this.f29652g = new Matrix(matrix);
    }

    @Override // qp.a
    public final boolean b(ReaderPDFCore.b bVar) {
        Boolean bool;
        boolean pageWriteLine;
        float f10 = this.f29647a;
        float f11 = this.f29648b;
        float f12 = this.c;
        float f13 = this.f29649d;
        float f14 = this.f29650e;
        int i10 = this.f29651f;
        Matrix matrix = this.f29652g;
        if (bVar.f21371a != 0) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            pageWriteLine = ReaderPDFCore.this.pageWriteLine(bVar.f21371a, f10, f11, f12, f13, f14, i10, fArr);
            bool = Boolean.valueOf(pageWriteLine);
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
