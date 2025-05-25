package f0;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.e;
import e0.c;
import e0.d;
import e0.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import lib.zj.office.fc.ss.util.CellUtil;

/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public final class n {
    public k[] A;

    /* renamed from: b  reason: collision with root package name */
    public View f16945b;
    public int c;

    /* renamed from: j  reason: collision with root package name */
    public b0.b[] f16952j;

    /* renamed from: k  reason: collision with root package name */
    public b0.a f16953k;

    /* renamed from: o  reason: collision with root package name */
    public int[] f16957o;

    /* renamed from: p  reason: collision with root package name */
    public double[] f16958p;

    /* renamed from: q  reason: collision with root package name */
    public double[] f16959q;

    /* renamed from: r  reason: collision with root package name */
    public String[] f16960r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f16961s;

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, e0.e> f16966x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap<String, e0.d> f16967y;

    /* renamed from: z  reason: collision with root package name */
    public HashMap<String, e0.c> f16968z;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f16944a = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public boolean f16946d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f16947e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final p f16948f = new p();

    /* renamed from: g  reason: collision with root package name */
    public final p f16949g = new p();

    /* renamed from: h  reason: collision with root package name */
    public final l f16950h = new l();

    /* renamed from: i  reason: collision with root package name */
    public final l f16951i = new l();

    /* renamed from: l  reason: collision with root package name */
    public float f16954l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f16955m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f16956n = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public final float[] f16962t = new float[4];

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<p> f16963u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public final float[] f16964v = new float[1];

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<d> f16965w = new ArrayList<>();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public n(View view) {
        this.f16945b = view;
        this.c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).getClass();
        }
    }

    public static void g(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        int i13 = rect.left + rect.right;
                        rect2.left = i11 - ((rect.width() + (rect.bottom + rect.top)) / 2);
                        rect2.top = (i13 - rect.height()) / 2;
                        rect2.right = rect.width() + rect2.left;
                        rect2.bottom = rect.height() + rect2.top;
                        return;
                    }
                    return;
                }
                int i14 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i14 / 2);
                rect2.top = i12 - ((rect.height() + i14) / 2);
                rect2.right = rect.width() + rect2.left;
                rect2.bottom = rect.height() + rect2.top;
                return;
            }
            int i15 = rect.left + rect.right;
            rect2.left = i11 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i15 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        int i16 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i12 - ((rect.height() + i16) / 2);
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(d dVar) {
        this.f16965w.add(dVar);
    }

    public final float b(float[] fArr, float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f16956n;
            if (f13 != 1.0d) {
                float f14 = this.f16955m;
                if (f10 < f14) {
                    f10 = 0.0f;
                }
                if (f10 > f14 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f14) * f13, 1.0f);
                }
            }
        }
        b0.c cVar = this.f16948f.f16970a;
        Iterator<p> it = this.f16963u.iterator();
        float f15 = Float.NaN;
        while (it.hasNext()) {
            p next = it.next();
            b0.c cVar2 = next.f16970a;
            if (cVar2 != null) {
                float f16 = next.c;
                if (f16 < f10) {
                    cVar = cVar2;
                    f11 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = next.c;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f15)) {
                f12 = f15;
            }
            float f17 = f12 - f11;
            double d10 = (f10 - f11) / f17;
            f10 = (((float) cVar.a(d10)) * f17) + f11;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d10);
            }
        }
        return f10;
    }

    public final void c(double d10, float[] fArr, float[] fArr2) {
        float f10;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f16952j[0].c(d10, dArr);
        this.f16952j[0].f(d10, dArr2);
        float f11 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f16957o;
        p pVar = this.f16948f;
        float f12 = pVar.f16973e;
        float f13 = pVar.f16974f;
        float f14 = pVar.f16975g;
        float f15 = pVar.f16976h;
        float f16 = 0.0f;
        int i10 = 0;
        float f17 = f12;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (i10 < iArr.length) {
            float f20 = f13;
            float f21 = f14;
            float f22 = (float) dArr[i10];
            float f23 = (float) dArr2[i10];
            int i11 = iArr[i10];
            double[] dArr3 = dArr2;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            f13 = f20;
                            f14 = f21;
                        } else {
                            f19 = f23;
                            f14 = f21;
                            f15 = f22;
                        }
                    } else {
                        f11 = f23;
                        f14 = f22;
                    }
                } else {
                    f16 = f23;
                    f14 = f21;
                    f13 = f22;
                }
                i10++;
                dArr2 = dArr3;
            } else {
                f18 = f23;
                f14 = f21;
                f17 = f22;
            }
            f13 = f20;
            i10++;
            dArr2 = dArr3;
        }
        float f24 = f13;
        float f25 = f14;
        float f26 = 2.0f;
        float f27 = (f11 / 2.0f) + f18;
        float f28 = (f19 / 2.0f) + f16;
        n nVar = pVar.f16981m;
        if (nVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            nVar.c(d10, fArr3, fArr4);
            float f29 = fArr3[0];
            float f30 = fArr3[1];
            float f31 = fArr4[0];
            float f32 = fArr4[1];
            double d11 = f17;
            double d12 = f24;
            float cos = (float) ((f30 - (Math.cos(d12) * d11)) - (f15 / 2.0f));
            double d13 = f18;
            double d14 = f16;
            float cos2 = (float) ((Math.cos(d12) * d14) + android.support.v4.media.session.h.a(d12, d13, f31));
            f28 = (float) android.support.v4.media.session.h.a(d12, d14, f32 - (Math.cos(d12) * d13));
            f26 = 2.0f;
            f17 = (float) (android.support.v4.media.session.h.a(d12, d11, f29) - (f25 / 2.0f));
            f27 = cos2;
            f10 = cos;
        } else {
            f10 = f24;
        }
        fArr[0] = (f25 / f26) + f17 + 0.0f;
        fArr[1] = (f15 / f26) + f10 + 0.0f;
        fArr2[0] = f27;
        fArr2[1] = f28;
    }

    public final void d(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f16964v;
        float b10 = b(fArr2, f10);
        b0.b[] bVarArr = this.f16952j;
        p pVar = this.f16948f;
        int i10 = 0;
        if (bVarArr != null) {
            double d10 = b10;
            bVarArr[0].f(d10, this.f16959q);
            this.f16952j[0].c(d10, this.f16958p);
            float f13 = fArr2[0];
            while (true) {
                dArr = this.f16959q;
                if (i10 >= dArr.length) {
                    break;
                }
                dArr[i10] = dArr[i10] * f13;
                i10++;
            }
            b0.a aVar = this.f16953k;
            if (aVar != null) {
                double[] dArr2 = this.f16958p;
                if (dArr2.length > 0) {
                    aVar.c(d10, dArr2);
                    this.f16953k.f(d10, this.f16959q);
                    int[] iArr = this.f16957o;
                    double[] dArr3 = this.f16959q;
                    double[] dArr4 = this.f16958p;
                    pVar.getClass();
                    p.e(f11, f12, fArr, iArr, dArr3, dArr4);
                    return;
                }
                return;
            }
            int[] iArr2 = this.f16957o;
            double[] dArr5 = this.f16958p;
            pVar.getClass();
            p.e(f11, f12, fArr, iArr2, dArr, dArr5);
            return;
        }
        p pVar2 = this.f16949g;
        float f14 = pVar2.f16973e - pVar.f16973e;
        float f15 = pVar2.f16974f - pVar.f16974f;
        fArr[0] = (((pVar2.f16975g - pVar.f16975g) + f14) * f11) + ((1.0f - f11) * f14);
        fArr[1] = (((pVar2.f16976h - pVar.f16976h) + f15) * f12) + ((1.0f - f12) * f15);
    }

    public final boolean e(float f10, long j10, View view, l.t tVar) {
        e.d dVar;
        boolean z10;
        float f11;
        n nVar;
        boolean z11;
        float f12;
        p pVar;
        e.d dVar2;
        boolean z12;
        double d10;
        float f13;
        View view2;
        float f14;
        boolean z13;
        float f15;
        boolean z14;
        float f16;
        float b10 = b(null, f10);
        int i10 = this.E;
        float f17 = 1.0f;
        if (i10 != -1) {
            float f18 = 1.0f / i10;
            float floor = ((float) Math.floor(b10 / f18)) * f18;
            float f19 = (b10 % f18) / f18;
            if (!Float.isNaN(this.F)) {
                f19 = (f19 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            if (interpolator != null) {
                f17 = interpolator.getInterpolation(f19);
            } else if (f19 <= 0.5d) {
                f17 = 0.0f;
            }
            b10 = (f17 * f18) + floor;
        }
        float f20 = b10;
        HashMap<String, e0.d> hashMap = this.f16967y;
        if (hashMap != null) {
            for (e0.d dVar3 : hashMap.values()) {
                dVar3.d(view, f20);
            }
        }
        HashMap<String, e0.e> hashMap2 = this.f16966x;
        if (hashMap2 != null) {
            dVar = null;
            z10 = false;
            for (e0.e eVar : hashMap2.values()) {
                if (eVar instanceof e.d) {
                    dVar = (e.d) eVar;
                } else {
                    z10 |= eVar.e(f20, j10, view, tVar);
                }
            }
        } else {
            dVar = null;
            z10 = false;
        }
        b0.b[] bVarArr = this.f16952j;
        p pVar2 = this.f16948f;
        if (bVarArr != null) {
            double d11 = f20;
            bVarArr[0].c(d11, this.f16958p);
            this.f16952j[0].f(d11, this.f16959q);
            b0.a aVar = this.f16953k;
            if (aVar != null) {
                double[] dArr = this.f16958p;
                if (dArr.length > 0) {
                    aVar.c(d11, dArr);
                    this.f16953k.f(d11, this.f16959q);
                }
            }
            if (!this.H) {
                int[] iArr = this.f16957o;
                double[] dArr2 = this.f16958p;
                double[] dArr3 = this.f16959q;
                boolean z15 = this.f16946d;
                float f21 = pVar2.f16973e;
                float f22 = pVar2.f16974f;
                float f23 = pVar2.f16975g;
                float f24 = pVar2.f16976h;
                if (iArr.length != 0) {
                    f14 = f22;
                    if (pVar2.f16984p.length <= iArr[iArr.length - 1]) {
                        int i11 = iArr[iArr.length - 1] + 1;
                        pVar2.f16984p = new double[i11];
                        pVar2.f16985q = new double[i11];
                    }
                } else {
                    f14 = f22;
                }
                dVar2 = dVar;
                z12 = z10;
                Arrays.fill(pVar2.f16984p, Double.NaN);
                for (int i12 = 0; i12 < iArr.length; i12++) {
                    double[] dArr4 = pVar2.f16984p;
                    int i13 = iArr[i12];
                    dArr4[i13] = dArr2[i12];
                    pVar2.f16985q[i13] = dArr3[i12];
                }
                float f25 = Float.NaN;
                float f26 = 0.0f;
                int i14 = 0;
                float f27 = f24;
                float f28 = 0.0f;
                float f29 = 0.0f;
                float f30 = f21;
                float f31 = f14;
                f12 = f20;
                float f32 = 0.0f;
                float f33 = f23;
                float f34 = f31;
                while (true) {
                    double[] dArr5 = pVar2.f16984p;
                    z13 = z15;
                    if (i14 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i14])) {
                        f16 = f25;
                    } else {
                        double d12 = 0.0d;
                        if (!Double.isNaN(pVar2.f16984p[i14])) {
                            d12 = pVar2.f16984p[i14] + 0.0d;
                        }
                        f16 = f25;
                        float f35 = (float) d12;
                        float f36 = (float) pVar2.f16985q[i14];
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3) {
                                    if (i14 != 4) {
                                        if (i14 == 5) {
                                            f25 = f35;
                                        }
                                    } else {
                                        f28 = f36;
                                        f27 = f35;
                                    }
                                } else {
                                    f29 = f36;
                                    f33 = f35;
                                }
                            } else {
                                f32 = f36;
                                f34 = f35;
                            }
                        } else {
                            f25 = f16;
                            f26 = f36;
                            f30 = f35;
                        }
                        i14++;
                        z15 = z13;
                    }
                    f25 = f16;
                    i14++;
                    z15 = z13;
                }
                float f37 = f25;
                n nVar2 = pVar2.f16981m;
                if (nVar2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar2.c(d11, fArr, fArr2);
                    float f38 = fArr[0];
                    float f39 = fArr[1];
                    float f40 = fArr2[0];
                    float f41 = fArr2[1];
                    pVar = pVar2;
                    double d13 = f38;
                    double d14 = f30;
                    d10 = d11;
                    double d15 = f34;
                    f15 = f33;
                    float a10 = (float) (android.support.v4.media.session.h.a(d15, d14, d13) - (f33 / 2.0f));
                    float cos = (float) ((f39 - (Math.cos(d15) * d14)) - (f27 / 2.0f));
                    double d16 = f26;
                    double d17 = f32;
                    float cos2 = (float) ((Math.cos(d15) * d14 * d17) + android.support.v4.media.session.h.a(d15, d16, f40));
                    float sin = (float) ((Math.sin(d15) * d14 * d17) + (f41 - (Math.cos(d15) * d16)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos2;
                        dArr3[1] = sin;
                    }
                    if (!Float.isNaN(f37)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(sin, cos2)) + f37));
                    }
                    f30 = a10;
                    f34 = cos;
                } else {
                    pVar = pVar2;
                    f15 = f33;
                    d10 = d11;
                    if (!Float.isNaN(f37)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2((f28 / 2.0f) + f32, (f29 / 2.0f) + f26)) + f37 + 0.0f));
                    }
                }
                if (view instanceof c) {
                    ((c) view).a(f30, f34, f15 + f30, f34 + f27);
                } else {
                    float f42 = f30 + 0.5f;
                    int i15 = (int) f42;
                    float f43 = f34 + 0.5f;
                    int i16 = (int) f43;
                    int i17 = (int) (f42 + f15);
                    int i18 = (int) (f43 + f27);
                    int i19 = i17 - i15;
                    int i20 = i18 - i16;
                    if (i19 == view.getMeasuredWidth() && i20 == view.getMeasuredHeight()) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z14 || z13) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                    }
                    view.layout(i15, i16, i17, i18);
                }
                nVar = this;
                nVar.f16946d = false;
            } else {
                f12 = f20;
                pVar = pVar2;
                dVar2 = dVar;
                z12 = z10;
                d10 = d11;
                nVar = this;
            }
            if (nVar.C != -1) {
                if (nVar.D == null) {
                    nVar.D = ((View) view.getParent()).findViewById(nVar.C);
                }
                if (nVar.D != null) {
                    float bottom = (nVar.D.getBottom() + view2.getTop()) / 2.0f;
                    float right = (nVar.D.getRight() + nVar.D.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap<String, e0.d> hashMap3 = nVar.f16967y;
            if (hashMap3 != null) {
                for (e0.d dVar4 : hashMap3.values()) {
                    if (dVar4 instanceof d.C0206d) {
                        double[] dArr6 = nVar.f16959q;
                        if (dArr6.length > 1) {
                            f13 = f12;
                            view.setRotation(((d.C0206d) dVar4).a(f13) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                            f12 = f13;
                        }
                    }
                    f13 = f12;
                    f12 = f13;
                }
            }
            f11 = f12;
            if (dVar2 != null) {
                double[] dArr7 = nVar.f16959q;
                view.setRotation(dVar2.d(f11, j10, view, tVar) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                z11 = z12 | dVar2.f5264h;
            } else {
                z11 = z12;
            }
            int i21 = 1;
            while (true) {
                b0.b[] bVarArr2 = nVar.f16952j;
                if (i21 >= bVarArr2.length) {
                    break;
                }
                b0.b bVar = bVarArr2[i21];
                float[] fArr3 = nVar.f16962t;
                bVar.d(d10, fArr3);
                e0.a.b(pVar.f16982n.get(nVar.f16960r[i21 - 1]), view, fArr3);
                i21++;
            }
            l lVar = nVar.f16950h;
            if (lVar.f16928b == 0) {
                if (f11 <= 0.0f) {
                    view.setVisibility(lVar.c);
                } else {
                    int i22 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                    l lVar2 = nVar.f16951i;
                    if (i22 >= 0) {
                        view.setVisibility(lVar2.c);
                    } else if (lVar2.c != lVar.c) {
                        view.setVisibility(0);
                    }
                }
            }
            if (nVar.A != null) {
                int i23 = 0;
                while (true) {
                    k[] kVarArr = nVar.A;
                    if (i23 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i23].h(view, f11);
                    i23++;
                }
            }
        } else {
            f11 = f20;
            boolean z16 = z10;
            nVar = this;
            float f44 = pVar2.f16973e;
            p pVar3 = nVar.f16949g;
            float l10 = androidx.activity.r.l(pVar3.f16973e, f44, f11, f44);
            float f45 = pVar2.f16974f;
            float l11 = androidx.activity.r.l(pVar3.f16974f, f45, f11, f45);
            float f46 = pVar2.f16975g;
            float f47 = pVar3.f16975g;
            float l12 = androidx.activity.r.l(f47, f46, f11, f46);
            float f48 = pVar2.f16976h;
            float f49 = pVar3.f16976h;
            float f50 = l10 + 0.5f;
            int i24 = (int) f50;
            float f51 = l11 + 0.5f;
            int i25 = (int) f51;
            int i26 = (int) (f50 + l12);
            int l13 = (int) (f51 + androidx.activity.r.l(f49, f48, f11, f48));
            int i27 = i26 - i24;
            int i28 = l13 - i25;
            if (f47 != f46 || f49 != f48 || nVar.f16946d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(i28, 1073741824));
                nVar.f16946d = false;
            }
            view.layout(i24, i25, i26, l13);
            z11 = z16;
        }
        HashMap<String, e0.c> hashMap4 = nVar.f16968z;
        if (hashMap4 != null) {
            for (e0.c cVar : hashMap4.values()) {
                if (cVar instanceof c.d) {
                    double[] dArr8 = nVar.f16959q;
                    view.setRotation(((c.d) cVar).a(f11) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    cVar.e(view, f11);
                }
            }
        }
        return z11;
    }

    public final void f(p pVar) {
        pVar.d((int) this.f16945b.getX(), (int) this.f16945b.getY(), this.f16945b.getWidth(), this.f16945b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void h(int i10, int i11, long j10) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        ArrayList<p> arrayList2;
        String str5;
        String str6;
        String str7;
        String str8;
        Object obj;
        String str9;
        Object obj2;
        Object obj3;
        n nVar;
        String str10;
        ArrayList<d> arrayList3;
        String str11;
        String str12;
        Object obj4;
        Object obj5;
        Object obj6;
        String str13;
        Iterator<d> it;
        HashMap<String, e0.c> hashMap;
        String str14;
        String str15;
        String str16;
        Iterator<String> it2;
        String str17;
        Object obj7;
        String str18;
        Object obj8;
        String str19;
        String str20;
        Object obj9;
        String str21;
        f fVar;
        String str22;
        e0.c cVar;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        char c;
        char c10;
        char c11;
        float f10;
        float f11;
        HashMap<String, e0.c> hashMap2;
        Iterator<String> it3;
        Object obj10;
        Object obj11;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        Object obj12;
        char c12;
        char c13;
        char c14;
        char c15;
        e0.c gVar;
        c.b bVar;
        String str37;
        String str38;
        String str39;
        String str40;
        p pVar;
        String str41;
        String str42;
        double d10;
        float f12;
        p pVar2;
        String str43;
        String str44;
        double[] dArr;
        double[][] dArr2;
        ConstraintAttribute constraintAttribute;
        HashSet<String> hashSet3;
        j jVar;
        ArrayList<d> arrayList4;
        HashMap<String, e0.e> hashMap3;
        String str45;
        Iterator<String> it4;
        String str46;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        char c16;
        char c17;
        Iterator<String> it5;
        HashMap<String, Integer> hashMap4;
        String str47;
        String str48;
        Object obj17;
        Object obj18;
        Object obj19;
        char c18;
        char c19;
        char c20;
        char c21;
        e0.e gVar2;
        Object obj20;
        e.b bVar2;
        String str49;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        HashSet<String> hashSet4;
        HashSet<String> hashSet5;
        ArrayList<p> arrayList5;
        Iterator<String> it6;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        Object obj21;
        Object obj22;
        Object obj23;
        char c22;
        char c23;
        e0.d iVar;
        Object obj24;
        d.b bVar3;
        ConstraintAttribute constraintAttribute3;
        String str55;
        String str56;
        p pVar3;
        n nVar2 = this;
        new HashSet();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashSet<String> hashSet8 = new HashSet<>();
        HashMap<String, Integer> hashMap5 = new HashMap<>();
        int i12 = nVar2.B;
        p pVar4 = nVar2.f16948f;
        if (i12 != -1) {
            pVar4.f16978j = i12;
        }
        l lVar = nVar2.f16950h;
        float f13 = lVar.f16927a;
        l lVar2 = nVar2.f16951i;
        String str57 = "alpha";
        if (l.c(f13, lVar2.f16927a)) {
            hashSet7.add("alpha");
        }
        String str58 = "elevation";
        if (l.c(lVar.f16929d, lVar2.f16929d)) {
            hashSet7.add("elevation");
        }
        int i13 = lVar.c;
        int i14 = lVar2.c;
        if (i13 != i14 && lVar.f16928b == 0 && (i13 == 0 || i14 == 0)) {
            hashSet7.add("alpha");
        }
        boolean c24 = l.c(lVar.f16930e, lVar2.f16930e);
        String str59 = CellUtil.ROTATION;
        if (c24) {
            hashSet7.add(CellUtil.ROTATION);
        }
        if (!Float.isNaN(lVar.f16940o) || !Float.isNaN(lVar2.f16940o)) {
            hashSet7.add("transitionPathRotate");
        }
        String str60 = "progress";
        if (!Float.isNaN(lVar.f16941p) || !Float.isNaN(lVar2.f16941p)) {
            hashSet7.add("progress");
        }
        if (l.c(lVar.f16931f, lVar2.f16931f)) {
            hashSet7.add("rotationX");
        }
        if (l.c(lVar.f16932g, lVar2.f16932g)) {
            hashSet7.add("rotationY");
        }
        p pVar5 = pVar4;
        if (l.c(lVar.f16935j, lVar2.f16935j)) {
            hashSet7.add("transformPivotX");
        }
        if (l.c(lVar.f16936k, lVar2.f16936k)) {
            hashSet7.add("transformPivotY");
        }
        String str61 = "scaleX";
        if (l.c(lVar.f16933h, lVar2.f16933h)) {
            hashSet7.add("scaleX");
        }
        Object obj25 = "rotationX";
        String str62 = "scaleY";
        if (l.c(lVar.f16934i, lVar2.f16934i)) {
            hashSet7.add("scaleY");
        }
        Object obj26 = "rotationY";
        if (l.c(lVar.f16937l, lVar2.f16937l)) {
            hashSet7.add("translationX");
        }
        Object obj27 = "translationX";
        String str63 = "translationY";
        if (l.c(lVar.f16938m, lVar2.f16938m)) {
            hashSet7.add("translationY");
        }
        boolean c25 = l.c(lVar.f16939n, lVar2.f16939n);
        String str64 = "translationZ";
        if (c25) {
            hashSet7.add("translationZ");
        }
        ArrayList<d> arrayList6 = nVar2.f16965w;
        ArrayList<p> arrayList7 = nVar2.f16963u;
        if (arrayList6 != null) {
            Iterator<d> it7 = arrayList6.iterator();
            ArrayList arrayList8 = null;
            while (it7.hasNext()) {
                String str65 = str63;
                d next = it7.next();
                String str66 = str64;
                if (next instanceof h) {
                    h hVar = (h) next;
                    str56 = str60;
                    str55 = str61;
                    arrayList7.add((-Collections.binarySearch(arrayList7, pVar3)) - 1, new p(i10, i11, hVar, nVar2.f16948f, nVar2.f16949g));
                    int i15 = hVar.f16888e;
                    if (i15 != -1) {
                        nVar2.f16947e = i15;
                    }
                } else {
                    str55 = str61;
                    str56 = str60;
                    if (next instanceof f) {
                        next.d(hashSet8);
                    } else if (next instanceof j) {
                        next.d(hashSet6);
                    } else if (next instanceof k) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        ArrayList arrayList9 = arrayList8;
                        arrayList9.add((k) next);
                        arrayList8 = arrayList9;
                    } else {
                        next.f(hashMap5);
                        next.d(hashSet7);
                    }
                }
                str64 = str66;
                str63 = str65;
                str60 = str56;
                str61 = str55;
            }
            str = str61;
            str2 = str64;
            str3 = str60;
            str4 = str63;
            arrayList = arrayList8;
        } else {
            str = "scaleX";
            str2 = "translationZ";
            str3 = "progress";
            str4 = "translationY";
            arrayList = null;
        }
        if (arrayList != null) {
            nVar2.A = (k[]) arrayList.toArray(new k[0]);
        }
        String str67 = "waveOffset";
        String str68 = "CUSTOM,";
        if (hashSet7.isEmpty()) {
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            arrayList2 = arrayList7;
            str5 = str2;
            str6 = str3;
            str7 = str;
            str8 = "waveOffset";
            obj = obj25;
            str9 = str4;
            obj2 = obj27;
            obj3 = obj26;
        } else {
            nVar2.f16967y = new HashMap<>();
            Iterator<String> it8 = hashSet7.iterator();
            while (it8.hasNext()) {
                String next2 = it8.next();
                if (next2.startsWith("CUSTOM,")) {
                    it6 = it8;
                    SparseArray sparseArray = new SparseArray();
                    hashSet5 = hashSet8;
                    String str69 = next2.split(",")[1];
                    Iterator<d> it9 = arrayList6.iterator();
                    while (it9.hasNext()) {
                        HashSet<String> hashSet9 = hashSet7;
                        d next3 = it9.next();
                        ArrayList<p> arrayList10 = arrayList7;
                        HashMap<String, ConstraintAttribute> hashMap6 = next3.f16838d;
                        if (hashMap6 != null && (constraintAttribute3 = hashMap6.get(str69)) != null) {
                            sparseArray.append(next3.f16836a, constraintAttribute3);
                        }
                        arrayList7 = arrayList10;
                        hashSet7 = hashSet9;
                    }
                    hashSet4 = hashSet7;
                    arrayList5 = arrayList7;
                    d.b bVar4 = new d.b(next2, sparseArray);
                    str50 = str2;
                    str51 = str4;
                    str52 = str3;
                    str54 = str67;
                    obj22 = obj27;
                    bVar3 = bVar4;
                    obj23 = obj26;
                    str53 = str;
                    obj24 = obj25;
                } else {
                    hashSet4 = hashSet7;
                    hashSet5 = hashSet8;
                    arrayList5 = arrayList7;
                    it6 = it8;
                    switch (next2.hashCode()) {
                        case -1249320806:
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            if (next2.equals(obj21)) {
                                c22 = 0;
                                break;
                            }
                            c22 = 65535;
                            break;
                        case -1249320805:
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            Object obj28 = obj26;
                            obj22 = obj27;
                            if (next2.equals(obj28)) {
                                obj23 = obj28;
                                obj21 = obj25;
                                c22 = 1;
                                break;
                            } else {
                                obj23 = obj28;
                                obj21 = obj25;
                                c22 = 65535;
                                break;
                            }
                        case -1225497657:
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            Object obj29 = obj27;
                            if (next2.equals(obj29)) {
                                obj22 = obj29;
                                obj21 = obj25;
                                c22 = 2;
                                obj23 = obj26;
                                break;
                            } else {
                                obj22 = obj29;
                                obj21 = obj25;
                                obj23 = obj26;
                                c22 = 65535;
                                break;
                            }
                        case -1225497656:
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            if (next2.equals(str51)) {
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = 3;
                                obj23 = obj26;
                                break;
                            }
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                        case -1225497655:
                            str50 = str2;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            if (next2.equals(str50)) {
                                str51 = str4;
                                c22 = 4;
                                obj22 = obj27;
                                obj23 = obj26;
                                break;
                            } else {
                                str51 = str4;
                                obj22 = obj27;
                                obj23 = obj26;
                                c22 = 65535;
                                break;
                            }
                        case -1001078227:
                            str52 = str3;
                            str53 = str;
                            if (next2.equals(str52)) {
                                str50 = str2;
                                str51 = str4;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = 5;
                                obj23 = obj26;
                                break;
                            } else {
                                str50 = str2;
                                str51 = str4;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                obj23 = obj26;
                                c22 = 65535;
                                break;
                            }
                        case -908189618:
                            str53 = str;
                            if (next2.equals(str53)) {
                                str50 = str2;
                                str51 = str4;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = 6;
                                obj23 = obj26;
                                str52 = str3;
                                break;
                            } else {
                                str50 = str2;
                                str51 = str4;
                                str52 = str3;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                obj23 = obj26;
                                c22 = 65535;
                                break;
                            }
                        case -908189617:
                            if (next2.equals("scaleY")) {
                                c23 = 7;
                                str50 = str2;
                                str51 = str4;
                                str52 = str3;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = c23;
                                obj23 = obj26;
                                str53 = str;
                                break;
                            }
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                        case -797520672:
                            if (next2.equals("waveVariesBy")) {
                                c23 = '\b';
                                str50 = str2;
                                str51 = str4;
                                str52 = str3;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = c23;
                                obj23 = obj26;
                                str53 = str;
                                break;
                            }
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                        case -760884510:
                            if (next2.equals("transformPivotX")) {
                                c23 = '\t';
                                str50 = str2;
                                str51 = str4;
                                str52 = str3;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = c23;
                                obj23 = obj26;
                                str53 = str;
                                break;
                            }
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                        case -760884509:
                            if (next2.equals("transformPivotY")) {
                                c23 = '\n';
                                str50 = str2;
                                str51 = str4;
                                str52 = str3;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = c23;
                                obj23 = obj26;
                                str53 = str;
                                break;
                            }
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                        case -40300674:
                            if (next2.equals(CellUtil.ROTATION)) {
                                c23 = 11;
                                str50 = str2;
                                str51 = str4;
                                str52 = str3;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = c23;
                                obj23 = obj26;
                                str53 = str;
                                break;
                            }
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                        case -4379043:
                            if (next2.equals("elevation")) {
                                c23 = '\f';
                                str50 = str2;
                                str51 = str4;
                                str52 = str3;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = c23;
                                obj23 = obj26;
                                str53 = str;
                                break;
                            }
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                        case 37232917:
                            if (next2.equals("transitionPathRotate")) {
                                c23 = '\r';
                                str50 = str2;
                                str51 = str4;
                                str52 = str3;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = c23;
                                obj23 = obj26;
                                str53 = str;
                                break;
                            }
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                        case 92909918:
                            if (next2.equals("alpha")) {
                                c23 = 14;
                                str50 = str2;
                                str51 = str4;
                                str52 = str3;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = c23;
                                obj23 = obj26;
                                str53 = str;
                                break;
                            }
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                        case 156108012:
                            if (next2.equals(str67)) {
                                c23 = 15;
                                str50 = str2;
                                str51 = str4;
                                str52 = str3;
                                str54 = str67;
                                obj21 = obj25;
                                obj22 = obj27;
                                c22 = c23;
                                obj23 = obj26;
                                str53 = str;
                                break;
                            }
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                        default:
                            str50 = str2;
                            str51 = str4;
                            str52 = str3;
                            str53 = str;
                            str54 = str67;
                            obj21 = obj25;
                            obj22 = obj27;
                            obj23 = obj26;
                            c22 = 65535;
                            break;
                    }
                    switch (c22) {
                        case 0:
                            iVar = new d.i();
                            break;
                        case 1:
                            iVar = new d.j();
                            break;
                        case 2:
                            iVar = new d.m();
                            break;
                        case 3:
                            iVar = new d.n();
                            break;
                        case 4:
                            iVar = new d.o();
                            break;
                        case 5:
                            iVar = new d.g();
                            break;
                        case 6:
                            iVar = new d.k();
                            break;
                        case 7:
                            iVar = new d.l();
                            break;
                        case '\b':
                            iVar = new d.a();
                            break;
                        case '\t':
                            iVar = new d.e();
                            break;
                        case '\n':
                            iVar = new d.f();
                            break;
                        case 11:
                            iVar = new d.h();
                            break;
                        case '\f':
                            iVar = new d.c();
                            break;
                        case '\r':
                            iVar = new d.C0206d();
                            break;
                        case 14:
                            iVar = new d.a();
                            break;
                        case 15:
                            iVar = new d.a();
                            break;
                        default:
                            iVar = null;
                            break;
                    }
                    obj24 = obj21;
                    bVar3 = iVar;
                }
                if (bVar3 == null) {
                    str = str53;
                    str3 = str52;
                    obj25 = obj24;
                    obj26 = obj23;
                    str67 = str54;
                    obj27 = obj22;
                    hashSet8 = hashSet5;
                    hashSet7 = hashSet4;
                    str2 = str50;
                    str4 = str51;
                    arrayList7 = arrayList5;
                    it8 = it6;
                } else {
                    bVar3.f5236e = next2;
                    String str70 = str51;
                    nVar2.f16967y.put(next2, bVar3);
                    it8 = it6;
                    str = str53;
                    str3 = str52;
                    str67 = str54;
                    hashSet8 = hashSet5;
                    hashSet7 = hashSet4;
                    str2 = str50;
                    arrayList7 = arrayList5;
                    Object obj30 = obj22;
                    str4 = str70;
                    obj25 = obj24;
                    obj26 = obj23;
                    obj27 = obj30;
                }
            }
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            arrayList2 = arrayList7;
            str5 = str2;
            str6 = str3;
            str7 = str;
            str8 = str67;
            Object obj31 = obj26;
            obj = obj25;
            str9 = str4;
            obj2 = obj27;
            obj3 = obj31;
            if (arrayList6 != null) {
                Iterator<d> it10 = arrayList6.iterator();
                while (it10.hasNext()) {
                    d next4 = it10.next();
                    if (next4 instanceof e) {
                        next4.a(nVar2.f16967y);
                    }
                }
            }
            lVar.a(0, nVar2.f16967y);
            nVar2.f16951i.a(100, nVar2.f16967y);
            Iterator<String> it11 = nVar2.f16967y.keySet().iterator();
            while (it11.hasNext()) {
                String next5 = it11.next();
                int intValue = (!hashMap5.containsKey(next5) || (num = hashMap5.get(next5)) == null) ? 0 : num.intValue();
                Iterator<String> it12 = it11;
                e0.d dVar = nVar2.f16967y.get(next5);
                if (dVar != null) {
                    dVar.c(intValue);
                }
                it11 = it12;
            }
        }
        String str71 = "CUSTOM";
        if (hashSet6.isEmpty()) {
            nVar = nVar2;
            str10 = str5;
            arrayList3 = arrayList6;
            str11 = "CUSTOM,";
            str12 = str9;
            obj4 = obj;
            obj5 = obj3;
            obj6 = obj2;
            str13 = "CUSTOM";
        } else {
            if (nVar2.f16966x == null) {
                nVar2.f16966x = new HashMap<>();
            }
            Iterator<String> it13 = hashSet6.iterator();
            while (it13.hasNext()) {
                String next6 = it13.next();
                if (!nVar2.f16966x.containsKey(next6)) {
                    if (next6.startsWith(str68)) {
                        SparseArray sparseArray2 = new SparseArray();
                        it5 = it13;
                        String str72 = next6.split(",")[1];
                        Iterator<d> it14 = arrayList6.iterator();
                        while (it14.hasNext()) {
                            String str73 = str68;
                            d next7 = it14.next();
                            HashMap<String, Integer> hashMap7 = hashMap5;
                            HashMap<String, ConstraintAttribute> hashMap8 = next7.f16838d;
                            if (hashMap8 != null && (constraintAttribute2 = hashMap8.get(str72)) != null) {
                                sparseArray2.append(next7.f16836a, constraintAttribute2);
                            }
                            hashMap5 = hashMap7;
                            str68 = str73;
                        }
                        hashMap4 = hashMap5;
                        str47 = str68;
                        bVar2 = new e.b(next6, sparseArray2);
                        str48 = str9;
                        obj18 = obj3;
                        obj20 = obj2;
                        str49 = str5;
                    } else {
                        it5 = it13;
                        hashMap4 = hashMap5;
                        str47 = str68;
                        switch (next6.hashCode()) {
                            case -1249320806:
                                str48 = str9;
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                if (next6.equals(obj17)) {
                                    c18 = 0;
                                    break;
                                }
                                c18 = 65535;
                                break;
                            case -1249320805:
                                str48 = str9;
                                obj18 = obj3;
                                obj19 = obj2;
                                if (next6.equals(obj18)) {
                                    c18 = 1;
                                    obj17 = obj;
                                    break;
                                } else {
                                    obj17 = obj;
                                    c18 = 65535;
                                    break;
                                }
                            case -1225497657:
                                str48 = str9;
                                obj19 = obj2;
                                if (next6.equals(obj19)) {
                                    c18 = 2;
                                    obj17 = obj;
                                    obj18 = obj3;
                                    break;
                                } else {
                                    obj17 = obj;
                                    obj18 = obj3;
                                    c18 = 65535;
                                    break;
                                }
                            case -1225497656:
                                str48 = str9;
                                if (next6.equals(str48)) {
                                    c19 = 3;
                                    c18 = c19;
                                    obj17 = obj;
                                    obj18 = obj3;
                                    obj19 = obj2;
                                    break;
                                }
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                c18 = 65535;
                                break;
                            case -1225497655:
                                if (next6.equals(str5)) {
                                    str48 = str9;
                                    obj17 = obj;
                                    obj18 = obj3;
                                    obj19 = obj2;
                                    c18 = 4;
                                    break;
                                }
                                str48 = str9;
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                c18 = 65535;
                                break;
                            case -1001078227:
                                if (next6.equals(str6)) {
                                    c20 = 5;
                                    c19 = c20;
                                    str48 = str9;
                                    c18 = c19;
                                    obj17 = obj;
                                    obj18 = obj3;
                                    obj19 = obj2;
                                    break;
                                }
                                str48 = str9;
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                c18 = 65535;
                                break;
                            case -908189618:
                                if (next6.equals(str7)) {
                                    c21 = 6;
                                    obj17 = obj;
                                    obj18 = obj3;
                                    obj19 = obj2;
                                    String str74 = str9;
                                    c18 = c21;
                                    str48 = str74;
                                    break;
                                }
                                str48 = str9;
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                c18 = 65535;
                                break;
                            case -908189617:
                                if (next6.equals("scaleY")) {
                                    c21 = 7;
                                    obj17 = obj;
                                    obj18 = obj3;
                                    obj19 = obj2;
                                    String str742 = str9;
                                    c18 = c21;
                                    str48 = str742;
                                    break;
                                }
                                str48 = str9;
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                c18 = 65535;
                                break;
                            case -40300674:
                                if (next6.equals(CellUtil.ROTATION)) {
                                    c20 = '\b';
                                    c19 = c20;
                                    str48 = str9;
                                    c18 = c19;
                                    obj17 = obj;
                                    obj18 = obj3;
                                    obj19 = obj2;
                                    break;
                                }
                                str48 = str9;
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                c18 = 65535;
                                break;
                            case -4379043:
                                if (next6.equals("elevation")) {
                                    c20 = '\t';
                                    c19 = c20;
                                    str48 = str9;
                                    c18 = c19;
                                    obj17 = obj;
                                    obj18 = obj3;
                                    obj19 = obj2;
                                    break;
                                }
                                str48 = str9;
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                c18 = 65535;
                                break;
                            case 37232917:
                                if (next6.equals("transitionPathRotate")) {
                                    c20 = '\n';
                                    c19 = c20;
                                    str48 = str9;
                                    c18 = c19;
                                    obj17 = obj;
                                    obj18 = obj3;
                                    obj19 = obj2;
                                    break;
                                }
                                str48 = str9;
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                c18 = 65535;
                                break;
                            case 92909918:
                                if (next6.equals("alpha")) {
                                    c20 = 11;
                                    c19 = c20;
                                    str48 = str9;
                                    c18 = c19;
                                    obj17 = obj;
                                    obj18 = obj3;
                                    obj19 = obj2;
                                    break;
                                }
                                str48 = str9;
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                c18 = 65535;
                                break;
                            default:
                                str48 = str9;
                                obj17 = obj;
                                obj18 = obj3;
                                obj19 = obj2;
                                c18 = 65535;
                                break;
                        }
                        switch (c18) {
                            case 0:
                                gVar2 = new e.g();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case 1:
                                gVar2 = new e.h();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case 2:
                                gVar2 = new e.k();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case 3:
                                gVar2 = new e.l();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case 4:
                                gVar2 = new e.m();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case 5:
                                gVar2 = new e.C0207e();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case 6:
                                gVar2 = new e.i();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case 7:
                                gVar2 = new e.j();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case '\b':
                                gVar2 = new e.f();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case '\t':
                                gVar2 = new e.c();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case '\n':
                                gVar2 = new e.d();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            case 11:
                                gVar2 = new e.a();
                                obj20 = obj19;
                                obj = obj17;
                                bVar2 = gVar2;
                                str49 = str5;
                                bVar2.f5265i = j10;
                                break;
                            default:
                                obj20 = obj19;
                                str49 = str5;
                                obj = obj17;
                                bVar2 = null;
                                break;
                        }
                    }
                    if (bVar2 != null) {
                        bVar2.f5262f = next6;
                        nVar2.f16966x.put(next6, bVar2);
                    }
                    str5 = str49;
                    obj2 = obj20;
                    hashMap5 = hashMap4;
                    str9 = str48;
                    obj3 = obj18;
                    str68 = str47;
                    it13 = it5;
                }
            }
            HashMap<String, Integer> hashMap9 = hashMap5;
            str11 = str68;
            str12 = str9;
            Object obj32 = obj3;
            Object obj33 = obj2;
            String str75 = str5;
            if (arrayList6 != null) {
                Iterator<d> it15 = arrayList6.iterator();
                while (it15.hasNext()) {
                    d next8 = it15.next();
                    if (next8 instanceof j) {
                        j jVar2 = (j) next8;
                        HashMap<String, e0.e> hashMap10 = nVar2.f16966x;
                        jVar2.getClass();
                        Iterator<String> it16 = hashMap10.keySet().iterator();
                        while (it16.hasNext()) {
                            Iterator<d> it17 = it15;
                            String next9 = it16.next();
                            e0.e eVar = hashMap10.get(next9);
                            if (eVar == null) {
                                jVar = jVar2;
                                arrayList4 = arrayList6;
                                hashMap3 = hashMap10;
                                str45 = str71;
                                it4 = it16;
                                str46 = str75;
                                obj13 = obj;
                                obj14 = obj33;
                            } else if (next9.startsWith(str71)) {
                                HashMap<String, e0.e> hashMap11 = hashMap10;
                                ConstraintAttribute constraintAttribute4 = jVar2.f16838d.get(next9.substring(7));
                                if (constraintAttribute4 != null) {
                                    e.b bVar5 = (e.b) eVar;
                                    Iterator<String> it18 = it16;
                                    int i16 = jVar2.f16836a;
                                    String str76 = str71;
                                    float f14 = jVar2.f16903s;
                                    ArrayList<d> arrayList11 = arrayList6;
                                    int i17 = jVar2.f16902r;
                                    float f15 = jVar2.f16904t;
                                    bVar5.f16327l.append(i16, constraintAttribute4);
                                    bVar5.f16328m.append(i16, new float[]{f14, f15});
                                    bVar5.f5259b = Math.max(bVar5.f5259b, i17);
                                    it15 = it17;
                                    it16 = it18;
                                    jVar2 = jVar2;
                                    hashMap10 = hashMap11;
                                    str71 = str76;
                                    arrayList6 = arrayList11;
                                } else {
                                    it15 = it17;
                                    hashMap10 = hashMap11;
                                }
                            } else {
                                j jVar3 = jVar2;
                                arrayList4 = arrayList6;
                                hashMap3 = hashMap10;
                                str45 = str71;
                                it4 = it16;
                                switch (next9.hashCode()) {
                                    case -1249320806:
                                        str46 = str75;
                                        obj16 = obj;
                                        obj14 = obj33;
                                        if (next9.equals(obj16)) {
                                            c16 = 0;
                                            break;
                                        }
                                        c16 = 65535;
                                        break;
                                    case -1249320805:
                                        str46 = str75;
                                        obj14 = obj33;
                                        if (next9.equals(obj32)) {
                                            c16 = 1;
                                            obj16 = obj;
                                            break;
                                        }
                                        obj16 = obj;
                                        c16 = 65535;
                                        break;
                                    case -1225497657:
                                        str46 = str75;
                                        obj14 = obj33;
                                        if (next9.equals(obj14)) {
                                            c16 = 2;
                                            obj16 = obj;
                                            break;
                                        }
                                        obj16 = obj;
                                        c16 = 65535;
                                        break;
                                    case -1225497656:
                                        str46 = str75;
                                        if (next9.equals(str12)) {
                                            c16 = 3;
                                            obj16 = obj;
                                            obj14 = obj33;
                                            break;
                                        }
                                        obj16 = obj;
                                        obj14 = obj33;
                                        c16 = 65535;
                                        break;
                                    case -1225497655:
                                        str46 = str75;
                                        if (next9.equals(str46)) {
                                            c16 = 4;
                                            obj16 = obj;
                                            obj14 = obj33;
                                            break;
                                        }
                                        obj16 = obj;
                                        obj14 = obj33;
                                        c16 = 65535;
                                        break;
                                    case -1001078227:
                                        if (next9.equals(str6)) {
                                            c17 = 5;
                                            c16 = c17;
                                            str46 = str75;
                                            obj16 = obj;
                                            obj14 = obj33;
                                            break;
                                        }
                                        str46 = str75;
                                        obj16 = obj;
                                        obj14 = obj33;
                                        c16 = 65535;
                                        break;
                                    case -908189618:
                                        if (next9.equals(str7)) {
                                            c17 = 6;
                                            c16 = c17;
                                            str46 = str75;
                                            obj16 = obj;
                                            obj14 = obj33;
                                            break;
                                        }
                                        str46 = str75;
                                        obj16 = obj;
                                        obj14 = obj33;
                                        c16 = 65535;
                                        break;
                                    case -908189617:
                                        if (next9.equals("scaleY")) {
                                            c17 = 7;
                                            c16 = c17;
                                            str46 = str75;
                                            obj16 = obj;
                                            obj14 = obj33;
                                            break;
                                        }
                                        str46 = str75;
                                        obj16 = obj;
                                        obj14 = obj33;
                                        c16 = 65535;
                                        break;
                                    case -40300674:
                                        if (next9.equals(CellUtil.ROTATION)) {
                                            c17 = '\b';
                                            c16 = c17;
                                            str46 = str75;
                                            obj16 = obj;
                                            obj14 = obj33;
                                            break;
                                        }
                                        str46 = str75;
                                        obj16 = obj;
                                        obj14 = obj33;
                                        c16 = 65535;
                                        break;
                                    case -4379043:
                                        if (next9.equals("elevation")) {
                                            c17 = '\t';
                                            c16 = c17;
                                            str46 = str75;
                                            obj16 = obj;
                                            obj14 = obj33;
                                            break;
                                        }
                                        str46 = str75;
                                        obj16 = obj;
                                        obj14 = obj33;
                                        c16 = 65535;
                                        break;
                                    case 37232917:
                                        if (next9.equals("transitionPathRotate")) {
                                            c17 = '\n';
                                            c16 = c17;
                                            str46 = str75;
                                            obj16 = obj;
                                            obj14 = obj33;
                                            break;
                                        }
                                        str46 = str75;
                                        obj16 = obj;
                                        obj14 = obj33;
                                        c16 = 65535;
                                        break;
                                    case 92909918:
                                        if (next9.equals("alpha")) {
                                            c17 = 11;
                                            c16 = c17;
                                            str46 = str75;
                                            obj16 = obj;
                                            obj14 = obj33;
                                            break;
                                        }
                                        str46 = str75;
                                        obj16 = obj;
                                        obj14 = obj33;
                                        c16 = 65535;
                                        break;
                                    default:
                                        str46 = str75;
                                        obj16 = obj;
                                        obj14 = obj33;
                                        c16 = 65535;
                                        break;
                                }
                                switch (c16) {
                                    case 0:
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16893i)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16893i, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case 1:
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16894j)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16894j, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case 2:
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16898n)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16898n, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case 3:
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16899o)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16899o, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case 4:
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16900p)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16900p, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case 5:
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16901q)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16901q, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case 6:
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16896l)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16896l, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case 7:
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16897m)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16897m, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case '\b':
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16892h)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16892h, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case '\t':
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16891g)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16891g, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case '\n':
                                        jVar = jVar3;
                                        obj13 = obj16;
                                        obj15 = obj32;
                                        if (!Float.isNaN(jVar.f16895k)) {
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16895k, jVar.f16903s, jVar.f16904t);
                                        }
                                        it16 = it4;
                                        obj33 = obj14;
                                        obj32 = obj15;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar;
                                        obj = obj13;
                                        it15 = it17;
                                        str75 = str46;
                                        break;
                                    case 11:
                                        jVar = jVar3;
                                        if (Float.isNaN(jVar.f16890f)) {
                                            obj13 = obj16;
                                            break;
                                        } else {
                                            obj13 = obj16;
                                            obj15 = obj32;
                                            eVar.b(jVar.f16836a, jVar.f16902r, jVar.f16890f, jVar.f16903s, jVar.f16904t);
                                            it16 = it4;
                                            obj33 = obj14;
                                            obj32 = obj15;
                                            hashMap10 = hashMap3;
                                            str71 = str45;
                                            arrayList6 = arrayList4;
                                            jVar2 = jVar;
                                            obj = obj13;
                                            it15 = it17;
                                            str75 = str46;
                                            break;
                                        }
                                    default:
                                        it15 = it17;
                                        it16 = it4;
                                        str75 = str46;
                                        obj33 = obj14;
                                        obj = obj16;
                                        hashMap10 = hashMap3;
                                        str71 = str45;
                                        arrayList6 = arrayList4;
                                        jVar2 = jVar3;
                                        break;
                                }
                            }
                            obj15 = obj32;
                            it16 = it4;
                            obj33 = obj14;
                            obj32 = obj15;
                            hashMap10 = hashMap3;
                            str71 = str45;
                            arrayList6 = arrayList4;
                            jVar2 = jVar;
                            obj = obj13;
                            it15 = it17;
                            str75 = str46;
                        }
                    }
                    it15 = it15;
                    obj33 = obj33;
                    obj32 = obj32;
                    str71 = str71;
                    arrayList6 = arrayList6;
                    obj = obj;
                    str75 = str75;
                    nVar2 = this;
                }
            }
            arrayList3 = arrayList6;
            str13 = str71;
            str10 = str75;
            obj4 = obj;
            obj6 = obj33;
            obj5 = obj32;
            nVar = this;
            for (String str77 : nVar.f16966x.keySet()) {
                HashMap<String, Integer> hashMap12 = hashMap9;
                nVar.f16966x.get(str77).c(hashMap12.containsKey(str77) ? hashMap12.get(str77).intValue() : 0);
                hashMap9 = hashMap12;
            }
        }
        int size = arrayList2.size() + 2;
        p[] pVarArr = new p[size];
        pVarArr[0] = pVar5;
        pVarArr[size - 1] = nVar.f16949g;
        if (arrayList2.size() > 0 && nVar.f16947e == -1) {
            nVar.f16947e = 0;
        }
        Iterator<p> it19 = arrayList2.iterator();
        int i18 = 1;
        while (it19.hasNext()) {
            pVarArr[i18] = it19.next();
            i18++;
        }
        HashSet hashSet10 = new HashSet();
        Iterator<String> it20 = nVar.f16949g.f16982n.keySet().iterator();
        while (it20.hasNext()) {
            String next10 = it20.next();
            Object obj34 = obj6;
            Iterator<String> it21 = it20;
            p pVar6 = pVar5;
            if (pVar6.f16982n.containsKey(next10)) {
                pVar5 = pVar6;
                hashSet3 = hashSet;
                if (!hashSet3.contains(str11 + next10)) {
                    hashSet10.add(next10);
                }
            } else {
                pVar5 = pVar6;
                hashSet3 = hashSet;
            }
            hashSet = hashSet3;
            obj6 = obj34;
            it20 = it21;
        }
        Object obj35 = obj6;
        String[] strArr = (String[]) hashSet10.toArray(new String[0]);
        nVar.f16960r = strArr;
        nVar.f16961s = new int[strArr.length];
        int i19 = 0;
        while (true) {
            String[] strArr2 = nVar.f16960r;
            if (i19 < strArr2.length) {
                String str78 = strArr2[i19];
                nVar.f16961s[i19] = 0;
                int i20 = 0;
                while (true) {
                    if (i20 >= size) {
                        break;
                    } else if (!pVarArr[i20].f16982n.containsKey(str78) || (constraintAttribute = pVarArr[i20].f16982n.get(str78)) == null) {
                        i20++;
                    } else {
                        int[] iArr = nVar.f16961s;
                        iArr[i19] = constraintAttribute.c() + iArr[i19];
                    }
                }
                i19++;
            } else {
                boolean z10 = pVarArr[0].f16978j != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i21 = 1;
                while (i21 < size) {
                    String str79 = str12;
                    p pVar7 = pVarArr[i21];
                    String str80 = str10;
                    p pVar8 = pVarArr[i21 - 1];
                    String str81 = str6;
                    String str82 = str7;
                    boolean b10 = p.b(pVar7.f16973e, pVar8.f16973e);
                    boolean b11 = p.b(pVar7.f16974f, pVar8.f16974f);
                    zArr[0] = p.b(pVar7.f16972d, pVar8.f16972d) | zArr[0];
                    boolean z11 = b10 | b11 | z10;
                    zArr[1] = zArr[1] | z11;
                    zArr[2] = z11 | zArr[2];
                    zArr[3] = zArr[3] | p.b(pVar7.f16975g, pVar8.f16975g);
                    zArr[4] = p.b(pVar7.f16976h, pVar8.f16976h) | zArr[4];
                    i21++;
                    str12 = str79;
                    str6 = str81;
                    str10 = str80;
                    str7 = str82;
                    str62 = str62;
                    str59 = str59;
                    str58 = str58;
                }
                String str83 = str10;
                String str84 = str12;
                String str85 = str7;
                String str86 = str6;
                String str87 = str58;
                String str88 = str59;
                String str89 = str62;
                int i22 = 0;
                for (int i23 = 1; i23 < length; i23++) {
                    if (zArr[i23]) {
                        i22++;
                    }
                }
                nVar.f16957o = new int[i22];
                int max = Math.max(2, i22);
                nVar.f16958p = new double[max];
                nVar.f16959q = new double[max];
                int i24 = 0;
                for (int i25 = 1; i25 < length; i25++) {
                    if (zArr[i25]) {
                        nVar.f16957o[i24] = i25;
                        i24++;
                    }
                }
                double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, size, nVar.f16957o.length);
                double[] dArr4 = new double[size];
                for (int i26 = 0; i26 < size; i26++) {
                    p pVar9 = pVarArr[i26];
                    double[] dArr5 = dArr3[i26];
                    int[] iArr2 = nVar.f16957o;
                    float[] fArr = {pVar9.f16972d, pVar9.f16973e, pVar9.f16974f, pVar9.f16975g, pVar9.f16976h, pVar9.f16977i};
                    int i27 = 0;
                    for (int i28 : iArr2) {
                        if (i28 < 6) {
                            dArr5[i27] = fArr[i28];
                            i27++;
                        }
                    }
                    dArr4[i26] = pVarArr[i26].c;
                }
                int i29 = 0;
                while (true) {
                    int[] iArr3 = nVar.f16957o;
                    if (i29 < iArr3.length) {
                        if (iArr3[i29] < 6) {
                            String g10 = androidx.activity.r.g(new StringBuilder(), p.f16969r[nVar.f16957o[i29]], " [");
                            for (int i30 = 0; i30 < size; i30++) {
                                StringBuilder k10 = a0.a.k(g10);
                                k10.append(dArr3[i30][i29]);
                                g10 = k10.toString();
                            }
                        }
                        i29++;
                    } else {
                        nVar.f16952j = new b0.b[nVar.f16960r.length + 1];
                        int i31 = 0;
                        while (true) {
                            String[] strArr3 = nVar.f16960r;
                            if (i31 < strArr3.length) {
                                String str90 = strArr3[i31];
                                int i32 = 0;
                                int i33 = 0;
                                double[] dArr6 = null;
                                double[][] dArr7 = null;
                                while (i32 < size) {
                                    if (pVarArr[i32].f16982n.containsKey(str90)) {
                                        if (dArr7 == null) {
                                            dArr6 = new double[size];
                                            ConstraintAttribute constraintAttribute5 = pVarArr[i32].f16982n.get(str90);
                                            dArr7 = (double[][]) Array.newInstance(Double.TYPE, size, constraintAttribute5 == null ? 0 : constraintAttribute5.c());
                                        }
                                        p pVar10 = pVarArr[i32];
                                        dArr6[i33] = pVar10.c;
                                        double[] dArr8 = dArr7[i33];
                                        ConstraintAttribute constraintAttribute6 = pVar10.f16982n.get(str90);
                                        if (constraintAttribute6 == null) {
                                            str43 = str90;
                                            str44 = str57;
                                            dArr = dArr6;
                                            dArr2 = dArr7;
                                        } else {
                                            str43 = str90;
                                            if (constraintAttribute6.c() == 1) {
                                                dArr = dArr6;
                                                dArr2 = dArr7;
                                                dArr8[0] = constraintAttribute6.a();
                                            } else {
                                                dArr = dArr6;
                                                dArr2 = dArr7;
                                                int c26 = constraintAttribute6.c();
                                                float[] fArr2 = new float[c26];
                                                constraintAttribute6.b(fArr2);
                                                int i34 = 0;
                                                int i35 = 0;
                                                while (i34 < c26) {
                                                    dArr8[i35] = fArr2[i34];
                                                    i34++;
                                                    i35++;
                                                    c26 = c26;
                                                    str57 = str57;
                                                    fArr2 = fArr2;
                                                }
                                            }
                                            str44 = str57;
                                        }
                                        i33++;
                                        dArr6 = dArr;
                                        dArr7 = dArr2;
                                    } else {
                                        str43 = str90;
                                        str44 = str57;
                                    }
                                    i32++;
                                    str90 = str43;
                                    str57 = str44;
                                }
                                i31++;
                                nVar.f16952j[i31] = b0.b.a(nVar.f16947e, Arrays.copyOf(dArr6, i33), (double[][]) Arrays.copyOf(dArr7, i33));
                                str57 = str57;
                            } else {
                                String str91 = str57;
                                nVar.f16952j[0] = b0.b.a(nVar.f16947e, dArr4, dArr3);
                                if (pVarArr[0].f16978j != -1) {
                                    int[] iArr4 = new int[size];
                                    double[] dArr9 = new double[size];
                                    double[][] dArr10 = (double[][]) Array.newInstance(Double.TYPE, size, 2);
                                    for (int i36 = 0; i36 < size; i36++) {
                                        iArr4[i36] = pVarArr[i36].f16978j;
                                        dArr9[i36] = pVar2.c;
                                        double[] dArr11 = dArr10[i36];
                                        dArr11[0] = pVar2.f16973e;
                                        dArr11[1] = pVar2.f16974f;
                                    }
                                    nVar.f16953k = new b0.a(iArr4, dArr9, dArr10);
                                }
                                nVar.f16968z = new HashMap<>();
                                if (arrayList3 != null) {
                                    Iterator<String> it22 = hashSet2.iterator();
                                    float f16 = Float.NaN;
                                    while (it22.hasNext()) {
                                        String next11 = it22.next();
                                        String str92 = str13;
                                        if (next11.startsWith(str92)) {
                                            it3 = it22;
                                            bVar = new c.b();
                                            obj11 = obj35;
                                            str28 = str84;
                                            str29 = str8;
                                            str30 = str86;
                                            str31 = str83;
                                            str32 = str85;
                                            str33 = str89;
                                            str34 = str88;
                                            str35 = str87;
                                            str36 = str91;
                                            obj12 = obj5;
                                        } else {
                                            switch (next11.hashCode()) {
                                                case -1249320806:
                                                    it3 = it22;
                                                    obj10 = obj4;
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str29 = str8;
                                                    str30 = str86;
                                                    str31 = str83;
                                                    str32 = str85;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    obj12 = obj5;
                                                    if (next11.equals(obj10)) {
                                                        c12 = 0;
                                                        break;
                                                    }
                                                    c12 = 65535;
                                                    break;
                                                case -1249320805:
                                                    it3 = it22;
                                                    Object obj36 = obj5;
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str29 = str8;
                                                    str30 = str86;
                                                    str31 = str83;
                                                    str32 = str85;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    if (next11.equals(obj36)) {
                                                        obj12 = obj36;
                                                        obj10 = obj4;
                                                        c12 = 1;
                                                        break;
                                                    } else {
                                                        obj12 = obj36;
                                                        obj10 = obj4;
                                                        c12 = 65535;
                                                        break;
                                                    }
                                                case -1225497657:
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str29 = str8;
                                                    str30 = str86;
                                                    str31 = str83;
                                                    str32 = str85;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    if (next11.equals(obj11)) {
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        c12 = 2;
                                                        obj12 = obj5;
                                                        break;
                                                    } else {
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj12 = obj5;
                                                        c12 = 65535;
                                                        break;
                                                    }
                                                case -1225497656:
                                                    str28 = str84;
                                                    str29 = str8;
                                                    str30 = str86;
                                                    str31 = str83;
                                                    str32 = str85;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    if (next11.equals(str28)) {
                                                        c13 = 3;
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        c12 = c13;
                                                        obj11 = obj35;
                                                        obj12 = obj5;
                                                        break;
                                                    } else {
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        obj12 = obj5;
                                                        c12 = 65535;
                                                        break;
                                                    }
                                                case -1225497655:
                                                    str29 = str8;
                                                    str30 = str86;
                                                    str31 = str83;
                                                    str32 = str85;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    if (next11.equals(str31)) {
                                                        str28 = str84;
                                                        c13 = 4;
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        c12 = c13;
                                                        obj11 = obj35;
                                                        obj12 = obj5;
                                                        break;
                                                    } else {
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        str28 = str84;
                                                        obj12 = obj5;
                                                        c12 = 65535;
                                                        break;
                                                    }
                                                case -1001078227:
                                                    str29 = str8;
                                                    str30 = str86;
                                                    str32 = str85;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    if (next11.equals(str30)) {
                                                        str28 = str84;
                                                        c13 = 5;
                                                        str31 = str83;
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        c12 = c13;
                                                        obj11 = obj35;
                                                        obj12 = obj5;
                                                        break;
                                                    }
                                                    it3 = it22;
                                                    obj10 = obj4;
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str31 = str83;
                                                    obj12 = obj5;
                                                    c12 = 65535;
                                                    break;
                                                case -908189618:
                                                    str29 = str8;
                                                    str32 = str85;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    if (next11.equals(str32)) {
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        str28 = str84;
                                                        str31 = str83;
                                                        c12 = 6;
                                                        obj12 = obj5;
                                                        str30 = str86;
                                                        break;
                                                    }
                                                    str30 = str86;
                                                    it3 = it22;
                                                    obj10 = obj4;
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str31 = str83;
                                                    obj12 = obj5;
                                                    c12 = 65535;
                                                    break;
                                                case -908189617:
                                                    str29 = str8;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    if (next11.equals(str33)) {
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        str28 = str84;
                                                        str30 = str86;
                                                        str31 = str83;
                                                        c12 = 7;
                                                        obj12 = obj5;
                                                        str32 = str85;
                                                        break;
                                                    }
                                                    str32 = str85;
                                                    str30 = str86;
                                                    it3 = it22;
                                                    obj10 = obj4;
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str31 = str83;
                                                    obj12 = obj5;
                                                    c12 = 65535;
                                                    break;
                                                case -797520672:
                                                    str29 = str8;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    if (next11.equals("waveVariesBy")) {
                                                        c14 = '\b';
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        str28 = str84;
                                                        str30 = str86;
                                                        str31 = str83;
                                                        str32 = str85;
                                                        c12 = c14;
                                                        obj12 = obj5;
                                                        str33 = str89;
                                                        break;
                                                    }
                                                    str33 = str89;
                                                    str32 = str85;
                                                    str30 = str86;
                                                    it3 = it22;
                                                    obj10 = obj4;
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str31 = str83;
                                                    obj12 = obj5;
                                                    c12 = 65535;
                                                    break;
                                                case -40300674:
                                                    str29 = str8;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    if (next11.equals(str34)) {
                                                        c14 = '\t';
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        str28 = str84;
                                                        str30 = str86;
                                                        str31 = str83;
                                                        str32 = str85;
                                                        c12 = c14;
                                                        obj12 = obj5;
                                                        str33 = str89;
                                                        break;
                                                    }
                                                    str33 = str89;
                                                    str32 = str85;
                                                    str30 = str86;
                                                    it3 = it22;
                                                    obj10 = obj4;
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str31 = str83;
                                                    obj12 = obj5;
                                                    c12 = 65535;
                                                    break;
                                                case -4379043:
                                                    str29 = str8;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    if (next11.equals(str35)) {
                                                        str28 = str84;
                                                        c13 = '\n';
                                                        str30 = str86;
                                                        str31 = str83;
                                                        str32 = str85;
                                                        str33 = str89;
                                                        str34 = str88;
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        c12 = c13;
                                                        obj11 = obj35;
                                                        obj12 = obj5;
                                                        break;
                                                    } else {
                                                        str33 = str89;
                                                        str34 = str88;
                                                        str32 = str85;
                                                        str30 = str86;
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        str28 = str84;
                                                        str31 = str83;
                                                        obj12 = obj5;
                                                        c12 = 65535;
                                                        break;
                                                    }
                                                case 37232917:
                                                    str29 = str8;
                                                    str36 = str91;
                                                    if (next11.equals("transitionPathRotate")) {
                                                        c15 = 11;
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        str28 = str84;
                                                        str30 = str86;
                                                        str31 = str83;
                                                        str32 = str85;
                                                        str33 = str89;
                                                        str34 = str88;
                                                        c12 = c15;
                                                        obj12 = obj5;
                                                        str35 = str87;
                                                        break;
                                                    }
                                                    it3 = it22;
                                                    obj10 = obj4;
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str30 = str86;
                                                    str31 = str83;
                                                    str32 = str85;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    obj12 = obj5;
                                                    c12 = 65535;
                                                    break;
                                                case 92909918:
                                                    str29 = str8;
                                                    str36 = str91;
                                                    if (next11.equals(str36)) {
                                                        c15 = '\f';
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        str28 = str84;
                                                        str30 = str86;
                                                        str31 = str83;
                                                        str32 = str85;
                                                        str33 = str89;
                                                        str34 = str88;
                                                        c12 = c15;
                                                        obj12 = obj5;
                                                        str35 = str87;
                                                        break;
                                                    }
                                                    it3 = it22;
                                                    obj10 = obj4;
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str30 = str86;
                                                    str31 = str83;
                                                    str32 = str85;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    obj12 = obj5;
                                                    c12 = 65535;
                                                    break;
                                                case 156108012:
                                                    str29 = str8;
                                                    if (next11.equals(str29)) {
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        str28 = str84;
                                                        str30 = str86;
                                                        str31 = str83;
                                                        str32 = str85;
                                                        str33 = str89;
                                                        str34 = str88;
                                                        str35 = str87;
                                                        c12 = '\r';
                                                        obj12 = obj5;
                                                        str36 = str91;
                                                        break;
                                                    } else {
                                                        it3 = it22;
                                                        obj10 = obj4;
                                                        obj11 = obj35;
                                                        str28 = str84;
                                                        str30 = str86;
                                                        str31 = str83;
                                                        str32 = str85;
                                                        str33 = str89;
                                                        str34 = str88;
                                                        str35 = str87;
                                                        str36 = str91;
                                                        obj12 = obj5;
                                                        c12 = 65535;
                                                        break;
                                                    }
                                                default:
                                                    it3 = it22;
                                                    obj10 = obj4;
                                                    obj11 = obj35;
                                                    str28 = str84;
                                                    str29 = str8;
                                                    str30 = str86;
                                                    str31 = str83;
                                                    str32 = str85;
                                                    str33 = str89;
                                                    str34 = str88;
                                                    str35 = str87;
                                                    str36 = str91;
                                                    obj12 = obj5;
                                                    c12 = 65535;
                                                    break;
                                            }
                                            switch (c12) {
                                                case 0:
                                                    gVar = new c.g();
                                                    e0.c cVar2 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar2;
                                                    break;
                                                case 1:
                                                    gVar = new c.h();
                                                    e0.c cVar22 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar22;
                                                    break;
                                                case 2:
                                                    gVar = new c.k();
                                                    e0.c cVar222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar222;
                                                    break;
                                                case 3:
                                                    gVar = new c.l();
                                                    e0.c cVar2222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar2222;
                                                    break;
                                                case 4:
                                                    gVar = new c.m();
                                                    e0.c cVar22222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar22222;
                                                    break;
                                                case 5:
                                                    gVar = new c.e();
                                                    e0.c cVar222222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar222222;
                                                    break;
                                                case 6:
                                                    gVar = new c.i();
                                                    e0.c cVar2222222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar2222222;
                                                    break;
                                                case 7:
                                                    gVar = new c.j();
                                                    e0.c cVar22222222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar22222222;
                                                    break;
                                                case '\b':
                                                    gVar = new c.a();
                                                    e0.c cVar222222222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar222222222;
                                                    break;
                                                case '\t':
                                                    gVar = new c.f();
                                                    e0.c cVar2222222222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar2222222222;
                                                    break;
                                                case '\n':
                                                    gVar = new c.C0205c();
                                                    e0.c cVar22222222222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar22222222222;
                                                    break;
                                                case 11:
                                                    gVar = new c.d();
                                                    e0.c cVar222222222222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar222222222222;
                                                    break;
                                                case '\f':
                                                    gVar = new c.a();
                                                    e0.c cVar2222222222222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar2222222222222;
                                                    break;
                                                case '\r':
                                                    gVar = new c.a();
                                                    e0.c cVar22222222222222 = gVar;
                                                    obj4 = obj10;
                                                    bVar = cVar22222222222222;
                                                    break;
                                                default:
                                                    obj4 = obj10;
                                                    bVar = null;
                                                    break;
                                            }
                                        }
                                        if (bVar == null) {
                                            it22 = it3;
                                            str13 = str92;
                                            str8 = str29;
                                            str91 = str36;
                                            str87 = str35;
                                            str88 = str34;
                                            str89 = str33;
                                            str85 = str32;
                                            str86 = str30;
                                            str83 = str31;
                                            str84 = str28;
                                            obj5 = obj12;
                                            obj35 = obj11;
                                        } else {
                                            Object obj37 = obj11;
                                            str84 = str28;
                                            if ((bVar.f5208e == 1) && Float.isNaN(f16)) {
                                                float[] fArr3 = new float[2];
                                                float f17 = 1.0f / 99;
                                                double d11 = 0.0d;
                                                float f18 = 0.0f;
                                                str39 = str30;
                                                str40 = str31;
                                                int i37 = 0;
                                                double d12 = 0.0d;
                                                while (i37 < 100) {
                                                    float f19 = i37 * f17;
                                                    String str93 = str33;
                                                    String str94 = str32;
                                                    double d13 = f19;
                                                    p pVar11 = pVar5;
                                                    b0.c cVar3 = pVar11.f16970a;
                                                    Iterator<p> it23 = arrayList2.iterator();
                                                    float f20 = 0.0f;
                                                    float f21 = Float.NaN;
                                                    while (it23.hasNext()) {
                                                        p pVar12 = pVar11;
                                                        p next12 = it23.next();
                                                        float f22 = f17;
                                                        b0.c cVar4 = next12.f16970a;
                                                        if (cVar4 != null) {
                                                            float f23 = next12.c;
                                                            if (f23 < f19) {
                                                                f20 = f23;
                                                                cVar3 = cVar4;
                                                            } else if (Float.isNaN(f21)) {
                                                                f21 = next12.c;
                                                            }
                                                        }
                                                        pVar11 = pVar12;
                                                        f17 = f22;
                                                    }
                                                    p pVar13 = pVar11;
                                                    float f24 = f17;
                                                    if (cVar3 != null) {
                                                        if (Float.isNaN(f21)) {
                                                            f21 = 1.0f;
                                                        }
                                                        str42 = str34;
                                                        d10 = (((float) cVar3.a((f19 - f20) / f12)) * (f21 - f20)) + f20;
                                                    } else {
                                                        str42 = str34;
                                                        d10 = d13;
                                                    }
                                                    nVar.f16952j[0].c(d10, nVar.f16958p);
                                                    String str95 = str42;
                                                    nVar.f16948f.c(d10, nVar.f16957o, nVar.f16958p, fArr3, 0);
                                                    if (i37 > 0) {
                                                        f18 = (float) (Math.hypot(d11 - fArr3[1], d12 - fArr3[0]) + f18);
                                                    }
                                                    i37++;
                                                    d12 = fArr3[0];
                                                    d11 = fArr3[1];
                                                    str34 = str95;
                                                    str33 = str93;
                                                    f17 = f24;
                                                    str32 = str94;
                                                    pVar5 = pVar13;
                                                }
                                                str37 = str33;
                                                str38 = str32;
                                                pVar = pVar5;
                                                str41 = str34;
                                                f16 = f18;
                                            } else {
                                                str37 = str33;
                                                str38 = str32;
                                                str39 = str30;
                                                str40 = str31;
                                                pVar = pVar5;
                                                str41 = str34;
                                            }
                                            bVar.f5206b = next11;
                                            nVar.f16968z.put(next11, bVar);
                                            it22 = it3;
                                            str85 = str38;
                                            str91 = str36;
                                            str87 = str35;
                                            str88 = str41;
                                            str89 = str37;
                                            obj5 = obj12;
                                            obj35 = obj37;
                                            str86 = str39;
                                            pVar5 = pVar;
                                            str13 = str92;
                                            str83 = str40;
                                            str8 = str29;
                                        }
                                    }
                                    String str96 = str8;
                                    String str97 = str13;
                                    String str98 = str83;
                                    String str99 = str85;
                                    String str100 = str88;
                                    String str101 = str87;
                                    String str102 = str91;
                                    Object obj38 = obj35;
                                    String str103 = str86;
                                    Object obj39 = obj5;
                                    String str104 = str89;
                                    Iterator<d> it24 = arrayList3.iterator();
                                    while (it24.hasNext()) {
                                        d next13 = it24.next();
                                        if (next13 instanceof f) {
                                            f fVar2 = (f) next13;
                                            HashMap<String, e0.c> hashMap13 = nVar.f16968z;
                                            fVar2.getClass();
                                            Iterator<String> it25 = hashMap13.keySet().iterator();
                                            while (it25.hasNext()) {
                                                String next14 = it25.next();
                                                if (next14.startsWith(str97)) {
                                                    ConstraintAttribute constraintAttribute7 = fVar2.f16838d.get(next14.substring(7));
                                                    if (constraintAttribute7 != null) {
                                                        if (constraintAttribute7.c == ConstraintAttribute.AttributeType.FLOAT_TYPE && (cVar = hashMap13.get(next14)) != null) {
                                                            int i38 = fVar2.f16836a;
                                                            int i39 = fVar2.f16856f;
                                                            String str105 = fVar2.f16857g;
                                                            int i40 = fVar2.f16862l;
                                                            it = it24;
                                                            it2 = it25;
                                                            hashMap = hashMap13;
                                                            String str106 = str97;
                                                            cVar.f5209f.add(new e.b(fVar2.f16858h, fVar2.f16859i, fVar2.f16860j, constraintAttribute7.a(), i38));
                                                            if (i40 != -1) {
                                                                cVar.f5208e = i40;
                                                            }
                                                            cVar.c = i39;
                                                            cVar.c(constraintAttribute7);
                                                            cVar.f5207d = str105;
                                                            str15 = str102;
                                                            str16 = str101;
                                                            str17 = str100;
                                                            obj7 = obj4;
                                                            str18 = str104;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str20 = str98;
                                                            obj9 = obj38;
                                                            str14 = str106;
                                                        } else {
                                                            it = it24;
                                                            hashMap = hashMap13;
                                                            str14 = str97;
                                                            str15 = str102;
                                                            str16 = str101;
                                                            it2 = it25;
                                                            str17 = str100;
                                                            obj7 = obj4;
                                                            str18 = str104;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str20 = str98;
                                                            obj9 = obj38;
                                                        }
                                                        str21 = str103;
                                                        fVar = fVar2;
                                                        str22 = str96;
                                                        it24 = it;
                                                        it25 = it2;
                                                        str84 = str19;
                                                        obj38 = obj9;
                                                        obj39 = obj8;
                                                        str97 = str14;
                                                        str103 = str21;
                                                        fVar2 = fVar;
                                                        hashMap13 = hashMap;
                                                        str96 = str22;
                                                        str100 = str17;
                                                        str101 = str16;
                                                        str102 = str15;
                                                        obj4 = obj7;
                                                        str98 = str20;
                                                        str104 = str18;
                                                    }
                                                } else {
                                                    it = it24;
                                                    HashMap<String, e0.c> hashMap14 = hashMap13;
                                                    String str107 = str97;
                                                    it2 = it25;
                                                    switch (next14.hashCode()) {
                                                        case -1249320806:
                                                            str23 = str99;
                                                            str24 = str100;
                                                            obj7 = obj4;
                                                            str25 = str104;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            obj9 = obj38;
                                                            str27 = str103;
                                                            if (next14.equals(obj7)) {
                                                                c = 0;
                                                                break;
                                                            }
                                                            c = 65535;
                                                            break;
                                                        case -1249320805:
                                                            str23 = str99;
                                                            str24 = str100;
                                                            str25 = str104;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            obj9 = obj38;
                                                            str27 = str103;
                                                            if (next14.equals(obj8)) {
                                                                c = 1;
                                                                obj7 = obj4;
                                                                break;
                                                            } else {
                                                                obj7 = obj4;
                                                                c = 65535;
                                                                break;
                                                            }
                                                        case -1225497657:
                                                            str23 = str99;
                                                            str24 = str100;
                                                            str25 = str104;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            obj9 = obj38;
                                                            str27 = str103;
                                                            if (next14.equals(obj9)) {
                                                                c = 2;
                                                                obj7 = obj4;
                                                                obj8 = obj39;
                                                                break;
                                                            } else {
                                                                obj7 = obj4;
                                                                obj8 = obj39;
                                                                c = 65535;
                                                                break;
                                                            }
                                                        case -1225497656:
                                                            str23 = str99;
                                                            str24 = str100;
                                                            str25 = str104;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            str27 = str103;
                                                            obj7 = obj4;
                                                            obj8 = obj39;
                                                            if (next14.equals(str19)) {
                                                                obj9 = obj38;
                                                                c = 3;
                                                                break;
                                                            }
                                                            obj9 = obj38;
                                                            c = 65535;
                                                            break;
                                                        case -1225497655:
                                                            str23 = str99;
                                                            str24 = str100;
                                                            str25 = str104;
                                                            str26 = str98;
                                                            str27 = str103;
                                                            if (next14.equals(str26)) {
                                                                obj7 = obj4;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                obj9 = obj38;
                                                                c = 4;
                                                                break;
                                                            }
                                                            obj7 = obj4;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            obj9 = obj38;
                                                            c = 65535;
                                                            break;
                                                        case -1001078227:
                                                            str23 = str99;
                                                            str24 = str100;
                                                            str25 = str104;
                                                            str27 = str103;
                                                            if (next14.equals(str27)) {
                                                                obj7 = obj4;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                c = 5;
                                                                break;
                                                            } else {
                                                                str26 = str98;
                                                                obj7 = obj4;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                obj9 = obj38;
                                                                c = 65535;
                                                                break;
                                                            }
                                                        case -908189618:
                                                            str23 = str99;
                                                            str24 = str100;
                                                            str25 = str104;
                                                            if (next14.equals(str23)) {
                                                                c = 6;
                                                                obj7 = obj4;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                str27 = str103;
                                                                break;
                                                            }
                                                            obj7 = obj4;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            obj9 = obj38;
                                                            str27 = str103;
                                                            c = 65535;
                                                            break;
                                                        case -908189617:
                                                            str24 = str100;
                                                            str25 = str104;
                                                            if (next14.equals(str25)) {
                                                                c = 7;
                                                                obj7 = obj4;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                str27 = str103;
                                                                str23 = str99;
                                                                break;
                                                            } else {
                                                                str23 = str99;
                                                                obj7 = obj4;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                str27 = str103;
                                                                c = 65535;
                                                                break;
                                                            }
                                                        case -40300674:
                                                            str24 = str100;
                                                            if (next14.equals(str24)) {
                                                                c10 = '\b';
                                                                str23 = str99;
                                                                c = c10;
                                                                obj7 = obj4;
                                                                str25 = str104;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                str27 = str103;
                                                                break;
                                                            } else {
                                                                str23 = str99;
                                                                obj7 = obj4;
                                                                str25 = str104;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                str27 = str103;
                                                                c = 65535;
                                                                break;
                                                            }
                                                        case -4379043:
                                                            if (next14.equals(str101)) {
                                                                str24 = str100;
                                                                c10 = '\t';
                                                                str23 = str99;
                                                                c = c10;
                                                                obj7 = obj4;
                                                                str25 = str104;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                str27 = str103;
                                                                break;
                                                            }
                                                            str23 = str99;
                                                            str24 = str100;
                                                            obj7 = obj4;
                                                            str25 = str104;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            obj9 = obj38;
                                                            str27 = str103;
                                                            c = 65535;
                                                            break;
                                                        case 37232917:
                                                            if (next14.equals("transitionPathRotate")) {
                                                                str24 = str100;
                                                                c10 = '\n';
                                                                str23 = str99;
                                                                c = c10;
                                                                obj7 = obj4;
                                                                str25 = str104;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                str27 = str103;
                                                                break;
                                                            }
                                                            str23 = str99;
                                                            str24 = str100;
                                                            obj7 = obj4;
                                                            str25 = str104;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            obj9 = obj38;
                                                            str27 = str103;
                                                            c = 65535;
                                                            break;
                                                        case 92909918:
                                                            if (next14.equals(str102)) {
                                                                str24 = str100;
                                                                c10 = 11;
                                                                str23 = str99;
                                                                c = c10;
                                                                obj7 = obj4;
                                                                str25 = str104;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                str27 = str103;
                                                                break;
                                                            }
                                                            str23 = str99;
                                                            str24 = str100;
                                                            obj7 = obj4;
                                                            str25 = str104;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            obj9 = obj38;
                                                            str27 = str103;
                                                            c = 65535;
                                                            break;
                                                        case 156108012:
                                                            if (next14.equals(str96)) {
                                                                c11 = '\f';
                                                                c10 = c11;
                                                                str24 = str100;
                                                                str23 = str99;
                                                                c = c10;
                                                                obj7 = obj4;
                                                                str25 = str104;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                str27 = str103;
                                                                break;
                                                            }
                                                            str23 = str99;
                                                            str24 = str100;
                                                            obj7 = obj4;
                                                            str25 = str104;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            obj9 = obj38;
                                                            str27 = str103;
                                                            c = 65535;
                                                            break;
                                                        case 1530034690:
                                                            if (next14.equals("wavePhase")) {
                                                                c11 = '\r';
                                                                c10 = c11;
                                                                str24 = str100;
                                                                str23 = str99;
                                                                c = c10;
                                                                obj7 = obj4;
                                                                str25 = str104;
                                                                obj8 = obj39;
                                                                str19 = str84;
                                                                str26 = str98;
                                                                obj9 = obj38;
                                                                str27 = str103;
                                                                break;
                                                            }
                                                            str23 = str99;
                                                            str24 = str100;
                                                            obj7 = obj4;
                                                            str25 = str104;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            obj9 = obj38;
                                                            str27 = str103;
                                                            c = 65535;
                                                            break;
                                                        default:
                                                            str23 = str99;
                                                            str24 = str100;
                                                            obj7 = obj4;
                                                            str25 = str104;
                                                            obj8 = obj39;
                                                            str19 = str84;
                                                            str26 = str98;
                                                            obj9 = obj38;
                                                            str27 = str103;
                                                            c = 65535;
                                                            break;
                                                    }
                                                    switch (c) {
                                                        case 0:
                                                            f10 = fVar2.f16867q;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case 1:
                                                            f10 = fVar2.f16868r;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case 2:
                                                            f10 = fVar2.f16871u;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case 3:
                                                            f10 = fVar2.f16872v;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case 4:
                                                            f10 = fVar2.f16873w;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case 5:
                                                            f10 = fVar2.f16861k;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case 6:
                                                            f10 = fVar2.f16869s;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case 7:
                                                            f10 = fVar2.f16870t;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case '\b':
                                                            f10 = fVar2.f16865o;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case '\t':
                                                            f10 = fVar2.f16864n;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case '\n':
                                                            f10 = fVar2.f16866p;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case 11:
                                                            f10 = fVar2.f16863m;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case '\f':
                                                            f10 = fVar2.f16859i;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        case '\r':
                                                            f10 = fVar2.f16860j;
                                                            f11 = f10;
                                                            str14 = str107;
                                                            break;
                                                        default:
                                                            str14 = str107;
                                                            next14.startsWith(str14);
                                                            f11 = Float.NaN;
                                                            break;
                                                    }
                                                    if (Float.isNaN(f11)) {
                                                        str17 = str24;
                                                        hashMap2 = hashMap14;
                                                    } else {
                                                        str17 = str24;
                                                        hashMap2 = hashMap14;
                                                        e0.c cVar5 = hashMap2.get(next14);
                                                        if (cVar5 != null) {
                                                            hashMap = hashMap2;
                                                            int i41 = fVar2.f16836a;
                                                            str18 = str25;
                                                            int i42 = fVar2.f16856f;
                                                            str99 = str23;
                                                            String str108 = fVar2.f16857g;
                                                            str21 = str27;
                                                            int i43 = fVar2.f16862l;
                                                            str22 = str96;
                                                            str15 = str102;
                                                            str16 = str101;
                                                            fVar = fVar2;
                                                            str20 = str26;
                                                            cVar5.f5209f.add(new e.b(fVar2.f16858h, fVar2.f16859i, fVar2.f16860j, f11, i41));
                                                            if (i43 != -1) {
                                                                cVar5.f5208e = i43;
                                                            }
                                                            cVar5.c = i42;
                                                            cVar5.f5207d = str108;
                                                            it24 = it;
                                                            it25 = it2;
                                                            str84 = str19;
                                                            obj38 = obj9;
                                                            obj39 = obj8;
                                                            str97 = str14;
                                                            str103 = str21;
                                                            fVar2 = fVar;
                                                            hashMap13 = hashMap;
                                                            str96 = str22;
                                                            str100 = str17;
                                                            str101 = str16;
                                                            str102 = str15;
                                                            obj4 = obj7;
                                                            str98 = str20;
                                                            str104 = str18;
                                                        }
                                                    }
                                                    str104 = str25;
                                                    str99 = str23;
                                                    str103 = str27;
                                                    str98 = str26;
                                                    str84 = str19;
                                                    obj38 = obj9;
                                                    obj39 = obj8;
                                                    obj4 = obj7;
                                                    str97 = str14;
                                                    str100 = str17;
                                                    it25 = it2;
                                                    hashMap13 = hashMap2;
                                                    it24 = it;
                                                }
                                            }
                                        }
                                        nVar = this;
                                        it24 = it24;
                                        str84 = str84;
                                        obj38 = obj38;
                                        obj39 = obj39;
                                        obj4 = obj4;
                                        str97 = str97;
                                        str103 = str103;
                                        str96 = str96;
                                        str100 = str100;
                                        str101 = str101;
                                        str102 = str102;
                                        str98 = str98;
                                        str104 = str104;
                                    }
                                    for (e0.c cVar6 : nVar.f16968z.values()) {
                                        cVar6.d();
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        p pVar = this.f16948f;
        sb2.append(pVar.f16973e);
        sb2.append(" y: ");
        sb2.append(pVar.f16974f);
        sb2.append(" end: x: ");
        p pVar2 = this.f16949g;
        sb2.append(pVar2.f16973e);
        sb2.append(" y: ");
        sb2.append(pVar2.f16974f);
        return sb2.toString();
    }
}
