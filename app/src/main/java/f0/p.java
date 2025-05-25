package f0;

import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.a;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.LinkedHashMap;

/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
public final class p implements Comparable<p> {

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f16969r = {"position", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, InMobiNetworkValues.WIDTH, InMobiNetworkValues.HEIGHT, "pathRotate"};

    /* renamed from: a  reason: collision with root package name */
    public b0.c f16970a;

    /* renamed from: b  reason: collision with root package name */
    public int f16971b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f16972d;

    /* renamed from: e  reason: collision with root package name */
    public float f16973e;

    /* renamed from: f  reason: collision with root package name */
    public float f16974f;

    /* renamed from: g  reason: collision with root package name */
    public float f16975g;

    /* renamed from: h  reason: collision with root package name */
    public float f16976h;

    /* renamed from: i  reason: collision with root package name */
    public float f16977i;

    /* renamed from: j  reason: collision with root package name */
    public int f16978j;

    /* renamed from: k  reason: collision with root package name */
    public int f16979k;

    /* renamed from: l  reason: collision with root package name */
    public float f16980l;

    /* renamed from: m  reason: collision with root package name */
    public n f16981m;

    /* renamed from: n  reason: collision with root package name */
    public final LinkedHashMap<String, ConstraintAttribute> f16982n;

    /* renamed from: o  reason: collision with root package name */
    public int f16983o;

    /* renamed from: p  reason: collision with root package name */
    public double[] f16984p;

    /* renamed from: q  reason: collision with root package name */
    public double[] f16985q;

    public p() {
        this.f16971b = 0;
        this.f16977i = Float.NaN;
        this.f16978j = -1;
        this.f16979k = -1;
        this.f16980l = Float.NaN;
        this.f16981m = null;
        this.f16982n = new LinkedHashMap<>();
        this.f16983o = 0;
        this.f16984p = new double[18];
        this.f16985q = new double[18];
    }

    public static boolean b(float f10, float f11) {
        if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
            if (Math.abs(f10 - f11) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f10) != Float.isNaN(f11)) {
            return true;
        } else {
            return false;
        }
    }

    public static void e(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            f14 = f16;
                        }
                    } else {
                        f12 = f16;
                    }
                } else {
                    f15 = f16;
                }
            } else {
                f13 = f16;
            }
        }
        float f17 = f13 - ((0.0f * f12) / 2.0f);
        float f18 = f15 - ((0.0f * f14) / 2.0f);
        fArr[0] = (((f12 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
        fArr[1] = (((f14 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + 0.0f;
    }

    public final void a(a.C0012a c0012a) {
        this.f16970a = b0.c.c(c0012a.f3372d.f3433d);
        a.c cVar = c0012a.f3372d;
        this.f16978j = cVar.f3434e;
        this.f16979k = cVar.f3432b;
        this.f16977i = cVar.f3437h;
        this.f16971b = cVar.f3435f;
        float f10 = c0012a.c.f3446e;
        this.f16980l = c0012a.f3373e.C;
        for (String str : c0012a.f3375g.keySet()) {
            ConstraintAttribute constraintAttribute = c0012a.f3375g.get(str);
            if (constraintAttribute != null) {
                int i10 = ConstraintAttribute.a.f3270a[constraintAttribute.c.ordinal()];
                boolean z10 = true;
                if ((i10 == 1 || i10 == 2 || i10 == 3) ? false : false) {
                    this.f16982n.put(str, constraintAttribute);
                }
            }
        }
    }

    public final void c(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f16973e;
        float f11 = this.f16974f;
        float f12 = this.f16975g;
        float f13 = this.f16976h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f14 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            f13 = f14;
                        }
                    } else {
                        f12 = f14;
                    }
                } else {
                    f11 = f14;
                }
            } else {
                f10 = f14;
            }
        }
        n nVar = this.f16981m;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.c(d10, fArr2, new float[2]);
            float f15 = fArr2[0];
            float f16 = fArr2[1];
            double d11 = f15;
            double d12 = f10;
            double d13 = f11;
            f10 = (float) (android.support.v4.media.session.h.a(d13, d12, d11) - (f12 / 2.0f));
            f11 = (float) ((f16 - (Math.cos(d13) * d12)) - (f13 / 2.0f));
        }
        fArr[i10] = (f12 / 2.0f) + f10 + 0.0f;
        fArr[i10 + 1] = (f13 / 2.0f) + f11 + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(p pVar) {
        return Float.compare(this.f16972d, pVar.f16972d);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f16973e = f10;
        this.f16974f = f11;
        this.f16975g = f12;
        this.f16976h = f13;
    }

    public final void f(n nVar, p pVar) {
        double d10 = (((this.f16975g / 2.0f) + this.f16973e) - pVar.f16973e) - (pVar.f16975g / 2.0f);
        double d11 = (((this.f16976h / 2.0f) + this.f16974f) - pVar.f16974f) - (pVar.f16976h / 2.0f);
        this.f16981m = nVar;
        this.f16973e = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f16980l)) {
            this.f16974f = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f16974f = (float) Math.toRadians(this.f16980l);
        }
    }

    public p(int i10, int i11, h hVar, p pVar, p pVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i12;
        float min;
        float f17;
        this.f16971b = 0;
        this.f16977i = Float.NaN;
        this.f16978j = -1;
        this.f16979k = -1;
        this.f16980l = Float.NaN;
        this.f16981m = null;
        this.f16982n = new LinkedHashMap<>();
        this.f16983o = 0;
        this.f16984p = new double[18];
        this.f16985q = new double[18];
        if (pVar.f16979k != -1) {
            float f18 = hVar.f16836a / 100.0f;
            this.c = f18;
            this.f16971b = hVar.f16879h;
            this.f16983o = hVar.f16886o;
            float f19 = Float.isNaN(hVar.f16880i) ? f18 : hVar.f16880i;
            float f20 = Float.isNaN(hVar.f16881j) ? f18 : hVar.f16881j;
            float f21 = pVar2.f16975g;
            float f22 = pVar.f16975g;
            float f23 = pVar2.f16976h;
            float f24 = pVar.f16976h;
            this.f16972d = this.c;
            this.f16975g = (int) (((f21 - f22) * f19) + f22);
            this.f16976h = (int) (((f23 - f24) * f20) + f24);
            int i13 = hVar.f16886o;
            if (i13 == 1) {
                float f25 = Float.isNaN(hVar.f16882k) ? f18 : hVar.f16882k;
                float f26 = pVar2.f16973e;
                float f27 = pVar.f16973e;
                this.f16973e = androidx.activity.r.l(f26, f27, f25, f27);
                f18 = Float.isNaN(hVar.f16883l) ? f18 : hVar.f16883l;
                float f28 = pVar2.f16974f;
                float f29 = pVar.f16974f;
                this.f16974f = androidx.activity.r.l(f28, f29, f18, f29);
            } else if (i13 != 2) {
                float f30 = Float.isNaN(hVar.f16882k) ? f18 : hVar.f16882k;
                float f31 = pVar2.f16973e;
                float f32 = pVar.f16973e;
                this.f16973e = androidx.activity.r.l(f31, f32, f30, f32);
                f18 = Float.isNaN(hVar.f16883l) ? f18 : hVar.f16883l;
                float f33 = pVar2.f16974f;
                float f34 = pVar.f16974f;
                this.f16974f = androidx.activity.r.l(f33, f34, f18, f34);
            } else {
                if (Float.isNaN(hVar.f16882k)) {
                    float f35 = pVar2.f16973e;
                    float f36 = pVar.f16973e;
                    min = androidx.activity.r.l(f35, f36, f18, f36);
                } else {
                    min = hVar.f16882k * Math.min(f20, f19);
                }
                this.f16973e = min;
                if (Float.isNaN(hVar.f16883l)) {
                    float f37 = pVar2.f16974f;
                    float f38 = pVar.f16974f;
                    f17 = androidx.activity.r.l(f37, f38, f18, f38);
                } else {
                    f17 = hVar.f16883l;
                }
                this.f16974f = f17;
            }
            this.f16979k = pVar.f16979k;
            this.f16970a = b0.c.c(hVar.f16877f);
            this.f16978j = hVar.f16878g;
            return;
        }
        int i14 = hVar.f16886o;
        if (i14 == 1) {
            float f39 = hVar.f16836a / 100.0f;
            this.c = f39;
            this.f16971b = hVar.f16879h;
            float f40 = Float.isNaN(hVar.f16880i) ? f39 : hVar.f16880i;
            float f41 = Float.isNaN(hVar.f16881j) ? f39 : hVar.f16881j;
            float f42 = pVar2.f16975g - pVar.f16975g;
            float f43 = pVar2.f16976h - pVar.f16976h;
            this.f16972d = this.c;
            f39 = Float.isNaN(hVar.f16882k) ? f39 : hVar.f16882k;
            float f44 = pVar.f16973e;
            float f45 = pVar.f16975g;
            float f46 = pVar.f16974f;
            float f47 = pVar.f16976h;
            float f48 = ((pVar2.f16975g / 2.0f) + pVar2.f16973e) - ((f45 / 2.0f) + f44);
            float f49 = ((pVar2.f16976h / 2.0f) + pVar2.f16974f) - ((f47 / 2.0f) + f46);
            float f50 = f48 * f39;
            float f51 = (f42 * f40) / 2.0f;
            this.f16973e = (int) ((f44 + f50) - f51);
            float f52 = f39 * f49;
            float f53 = (f43 * f41) / 2.0f;
            this.f16974f = (int) ((f46 + f52) - f53);
            this.f16975g = (int) (f45 + f10);
            this.f16976h = (int) (f47 + f11);
            float f54 = Float.isNaN(hVar.f16883l) ? 0.0f : hVar.f16883l;
            this.f16983o = 1;
            float f55 = (int) ((pVar.f16973e + f50) - f51);
            float f56 = (int) ((pVar.f16974f + f52) - f53);
            this.f16973e = f55 + ((-f49) * f54);
            this.f16974f = f56 + (f48 * f54);
            this.f16979k = this.f16979k;
            this.f16970a = b0.c.c(hVar.f16877f);
            this.f16978j = hVar.f16878g;
        } else if (i14 != 2) {
            float f57 = hVar.f16836a / 100.0f;
            this.c = f57;
            this.f16971b = hVar.f16879h;
            float f58 = Float.isNaN(hVar.f16880i) ? f57 : hVar.f16880i;
            float f59 = Float.isNaN(hVar.f16881j) ? f57 : hVar.f16881j;
            float f60 = pVar2.f16975g;
            float f61 = pVar.f16975g;
            float f62 = f60 - f61;
            float f63 = pVar2.f16976h;
            float f64 = pVar.f16976h;
            float f65 = f63 - f64;
            this.f16972d = this.c;
            float f66 = pVar.f16973e;
            float f67 = pVar.f16974f;
            float f68 = ((f60 / 2.0f) + pVar2.f16973e) - ((f61 / 2.0f) + f66);
            float f69 = ((f63 / 2.0f) + pVar2.f16974f) - ((f64 / 2.0f) + f67);
            float f70 = (f62 * f58) / 2.0f;
            this.f16973e = (int) (((f68 * f57) + f66) - f70);
            float f71 = (f69 * f57) + f67;
            float f72 = (f65 * f59) / 2.0f;
            this.f16974f = (int) (f71 - f72);
            this.f16975g = (int) (f61 + f14);
            this.f16976h = (int) (f64 + f15);
            float f73 = Float.isNaN(hVar.f16882k) ? f57 : hVar.f16882k;
            float f74 = Float.isNaN(hVar.f16885n) ? 0.0f : hVar.f16885n;
            f57 = Float.isNaN(hVar.f16883l) ? f57 : hVar.f16883l;
            if (Float.isNaN(hVar.f16884m)) {
                i12 = 0;
                f16 = 0.0f;
            } else {
                f16 = hVar.f16884m;
                i12 = 0;
            }
            this.f16983o = i12;
            this.f16973e = (int) (((f16 * f69) + ((f73 * f68) + pVar.f16973e)) - f70);
            this.f16974f = (int) (((f69 * f57) + ((f68 * f74) + pVar.f16974f)) - f72);
            this.f16970a = b0.c.c(hVar.f16877f);
            this.f16978j = hVar.f16878g;
        } else {
            float f75 = hVar.f16836a / 100.0f;
            this.c = f75;
            this.f16971b = hVar.f16879h;
            float f76 = Float.isNaN(hVar.f16880i) ? f75 : hVar.f16880i;
            float f77 = Float.isNaN(hVar.f16881j) ? f75 : hVar.f16881j;
            float f78 = pVar2.f16975g;
            float f79 = f78 - pVar.f16975g;
            float f80 = pVar2.f16976h;
            float f81 = f80 - pVar.f16976h;
            this.f16972d = this.c;
            float f82 = pVar.f16973e;
            float f83 = pVar.f16974f;
            float f84 = (f78 / 2.0f) + pVar2.f16973e;
            float f85 = (f80 / 2.0f) + pVar2.f16974f;
            float f86 = f79 * f76;
            this.f16973e = (int) ((((f84 - ((f12 / 2.0f) + f82)) * f75) + f82) - (f86 / 2.0f));
            float f87 = f81 * f77;
            this.f16974f = (int) ((((f85 - ((f13 / 2.0f) + f83)) * f75) + f83) - (f87 / 2.0f));
            this.f16975g = (int) (f12 + f86);
            this.f16976h = (int) (f13 + f87);
            this.f16983o = 2;
            if (!Float.isNaN(hVar.f16882k)) {
                this.f16973e = (int) (hVar.f16882k * ((int) (i10 - this.f16975g)));
            }
            if (!Float.isNaN(hVar.f16883l)) {
                this.f16974f = (int) (hVar.f16883l * ((int) (i11 - this.f16976h)));
            }
            this.f16979k = this.f16979k;
            this.f16970a = b0.c.c(hVar.f16877f);
            this.f16978j = hVar.f16878g;
        }
    }
}
