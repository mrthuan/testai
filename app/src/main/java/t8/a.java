package t8;

import android.content.Context;
import android.graphics.Color;
import b9.b;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f29970f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29971a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29972b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29973d;

    /* renamed from: e  reason: collision with root package name */
    public final float f29974e;

    public a(Context context) {
        boolean b10 = b.b(context, false, R.attr.elevationOverlayEnabled);
        int J = t0.J(context, R.attr.elevationOverlayColor, 0);
        int J2 = t0.J(context, R.attr.elevationOverlayAccentColor, 0);
        int J3 = t0.J(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f29971a = b10;
        this.f29972b = J;
        this.c = J2;
        this.f29973d = J3;
        this.f29974e = f10;
    }

    public final int a(float f10, int i10) {
        boolean z10;
        float f11;
        float f12;
        int i11;
        if (this.f29971a) {
            if (o0.a.d(i10, FunctionEval.FunctionID.EXTERNAL_FUNC) == this.f29973d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f29974e > 0.0f && f10 > 0.0f) {
                    f12 = Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f12 = 0.0f;
                }
                int alpha = Color.alpha(i10);
                int e02 = t0.e0(f12, o0.a.d(i10, FunctionEval.FunctionID.EXTERNAL_FUNC), this.f29972b);
                if (f12 > 0.0f && (i11 = this.c) != 0) {
                    e02 = o0.a.c(o0.a.d(i11, f29970f), e02);
                }
                return o0.a.d(e02, alpha);
            }
        }
        return i10;
    }
}
