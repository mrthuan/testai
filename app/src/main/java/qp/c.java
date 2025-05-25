package qp;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.LinkedList;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import rp.e;
import rp.f;
import rp.g;
import rp.h;

/* compiled from: PDFPage.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final float f29421a;

    /* renamed from: b  reason: collision with root package name */
    public final float f29422b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<a> f29423d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedList<Integer> f29424e = new LinkedList<>();

    static {
        ea.a.p("H0R3UBhnZQ==", "BCiOUo6F");
    }

    public c(b bVar, float f10, float f11) {
        ea.a.p("IEQ2UBNnZQ==", "9FpprwwX");
        ea.a.p("AkQkUFlnXTog", "YuRb88Oq");
        ea.a.p("HyA=", "ap7wVwjS");
        ea.a.p("YyA=", "rIuNOvfN");
        this.c = bVar;
        this.f29421a = f10;
        this.f29422b = f11;
    }

    public final void a(float f10, float f11, float f12, float f13, Matrix matrix) {
        try {
            this.f29423d.add(new f(f10, f11, f12, f13, matrix));
        } catch (Exception e10) {
            ea.a.p("LGxYcCtlVHRgIA==", "y41BPpLB");
            e10.getMessage();
        }
    }

    public final void b(Bitmap bitmap, RectF rectF, Paint paint, Matrix matrix) {
        int alpha;
        if (paint != null) {
            try {
                alpha = paint.getAlpha();
            } catch (Exception e10) {
                ea.a.p("K3JQdztpQ207cHAg", "8nmFwZUL");
                e10.getMessage();
                return;
            }
        } else {
            alpha = FunctionEval.FunctionID.EXTERNAL_FUNC;
        }
        this.f29423d.add(new rp.a(this.c, bitmap, rectF, alpha, matrix));
    }

    public final void c(PathHolder pathHolder, Paint paint, Matrix matrix) {
        int i10;
        try {
            float strokeWidth = paint.getStrokeWidth();
            Paint.Style style = paint.getStyle();
            if (style == Paint.Style.STROKE) {
                i10 = 1;
            } else if (style == Paint.Style.FILL) {
                i10 = 2;
            } else {
                i10 = 3;
            }
            int i11 = i10;
            this.f29423d.add(new e(pathHolder, i11, strokeWidth, paint.getColor(), matrix));
        } catch (Exception e10) {
            ea.a.p("V3IqdyNhFmhIIA==", "95IHKANg");
            e10.getMessage();
        }
    }

    public final void d(float f10, float f11, float f12, float f13, Paint paint, Matrix matrix) {
        float strokeWidth;
        int i10;
        try {
            strokeWidth = paint.getStrokeWidth();
            Paint.Style style = paint.getStyle();
            if (style == Paint.Style.STROKE) {
                i10 = 1;
            } else if (style == Paint.Style.FILL) {
                i10 = 2;
            } else {
                i10 = 3;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            this.f29423d.add(new g(f10, f11, f12, f13, i10, strokeWidth, paint.getColor(), matrix));
        } catch (Exception e11) {
            e = e11;
            ea.a.p("V3IqdyFlAXRIIA==", "JM8swKak");
            e.getMessage();
        }
    }

    public final void e(String str, float f10, float f11, Paint paint, Matrix matrix) {
        try {
            f(str, f10, f11, paint, matrix);
        } catch (Exception e10) {
            ea.a.p("K3JQdy1lT3RgIA==", "8fFRFXFD");
            e10.getMessage();
        }
    }

    public final void f(String str, float f10, float f11, Paint paint, Matrix matrix) {
        String p10;
        boolean z10;
        boolean z11;
        float textSize = paint.getTextSize();
        Typeface typeface = paint.getTypeface();
        if (typeface == Typeface.SANS_SERIF) {
            p10 = ea.a.p("fW8_b1NTA25z", "c67RP5GQ");
        } else if (typeface == Typeface.SERIF) {
            p10 = ea.a.p("F28Wb3RTPXIhZg==", "FjYbTXHd");
        } else if (typeface == Typeface.MONOSPACE) {
            p10 = ea.a.p("em8Hb3BTOG47ICtvWm8=", "oC4sPYqH");
        } else {
            p10 = ea.a.p("AW9Fb1lTVm5z", "Bej4jVsZ");
        }
        String str2 = p10;
        if (typeface != null && typeface.isBold()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (typeface != null && typeface.isItalic()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29423d.add(new h(str, f10, f11, textSize, paint.getColor(), str2, z10, z11, matrix));
    }
}
