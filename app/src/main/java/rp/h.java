package rp;

import android.graphics.Matrix;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: TextDrawRunner.java */
/* loaded from: classes3.dex */
public final class h implements qp.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f29670a;

    /* renamed from: b  reason: collision with root package name */
    public final float f29671b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f29672d;

    /* renamed from: e  reason: collision with root package name */
    public final int f29673e;

    /* renamed from: f  reason: collision with root package name */
    public final String f29674f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f29675g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f29676h;

    /* renamed from: i  reason: collision with root package name */
    public final Matrix f29677i;

    public h(String str, float f10, float f11, float f12, int i10, String str2, boolean z10, boolean z11, Matrix matrix) {
        this.f29670a = str;
        this.f29671b = f10;
        this.c = f11;
        this.f29672d = f12;
        this.f29673e = i10;
        this.f29674f = str2;
        this.f29675g = z10;
        this.f29676h = z11;
        this.f29677i = new Matrix(matrix);
    }

    @Override // qp.a
    public final boolean b(ReaderPDFCore.b bVar) {
        Boolean bool;
        boolean pageWriteText;
        String str = this.f29670a;
        float f10 = this.f29671b;
        float f11 = this.c;
        float f12 = this.f29672d;
        int i10 = this.f29673e;
        boolean z10 = this.f29675g;
        boolean z11 = this.f29676h;
        Matrix matrix = this.f29677i;
        if (bVar.f21371a != 0) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            pageWriteText = ReaderPDFCore.this.pageWriteText(bVar.f21371a, str, f10, f11, f12, i10, this.f29674f.replace(" ", ""), z10, z11, fArr);
            bool = Boolean.valueOf(pageWriteText);
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
