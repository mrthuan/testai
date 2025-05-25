package rp;

import android.graphics.Matrix;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: RectDrawRunner.java */
/* loaded from: classes3.dex */
public final class g implements qp.a {

    /* renamed from: a  reason: collision with root package name */
    public final float f29663a;

    /* renamed from: b  reason: collision with root package name */
    public final float f29664b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f29665d;

    /* renamed from: e  reason: collision with root package name */
    public final float f29666e;

    /* renamed from: f  reason: collision with root package name */
    public final int f29667f;

    /* renamed from: g  reason: collision with root package name */
    public final int f29668g;

    /* renamed from: h  reason: collision with root package name */
    public final Matrix f29669h;

    public g(float f10, float f11, float f12, float f13, int i10, float f14, int i11, Matrix matrix) {
        this.f29663a = f10;
        this.f29664b = f11;
        this.c = f12;
        this.f29665d = f13;
        this.f29666e = f14;
        this.f29667f = i10;
        this.f29668g = i11;
        this.f29669h = new Matrix(matrix);
    }

    @Override // qp.a
    public final boolean b(ReaderPDFCore.b bVar) {
        Boolean bool;
        boolean pageWriteRect;
        float f10 = this.f29663a;
        float f11 = this.f29664b;
        float f12 = this.c;
        float f13 = this.f29665d;
        int i10 = this.f29667f;
        float f14 = this.f29666e;
        int i11 = this.f29668g;
        Matrix matrix = this.f29669h;
        if (bVar.f21371a != 0) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            pageWriteRect = ReaderPDFCore.this.pageWriteRect(bVar.f21371a, f10, f11, f12, f13, i10, f14, i11, fArr);
            bool = Boolean.valueOf(pageWriteRect);
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
