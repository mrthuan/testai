package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import b0.a;
import b0.p;
import e0.c;
import f0.n;
import f0.o;
import g0.d;
import java.util.HashMap;
import lib.zj.office.fc.ss.util.CellUtil;

/* loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* renamed from: l  reason: collision with root package name */
    public final Paint f3252l;

    /* renamed from: m  reason: collision with root package name */
    public MotionLayout f3253m;

    /* renamed from: n  reason: collision with root package name */
    public final float[] f3254n;

    /* renamed from: o  reason: collision with root package name */
    public final Matrix f3255o;

    /* renamed from: p  reason: collision with root package name */
    public int f3256p;

    /* renamed from: q  reason: collision with root package name */
    public int f3257q;

    /* renamed from: r  reason: collision with root package name */
    public float f3258r;

    public MotionTelltales(Context context) {
        super(context);
        this.f3252l = new Paint();
        this.f3254n = new float[2];
        this.f3255o = new Matrix();
        this.f3256p = 0;
        this.f3257q = -65281;
        this.f3258r = 0.25f;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f17360w);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f3257q = obtainStyledAttributes.getColor(index, this.f3257q);
                } else if (index == 2) {
                    this.f3256p = obtainStyledAttributes.getInt(index, this.f3256p);
                } else if (index == 1) {
                    this.f3258r = obtainStyledAttributes.getFloat(index, this.f3258r);
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i11 = this.f3257q;
        Paint paint = this.f3252l;
        paint.setColor(i11);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        float[] fArr;
        int i10;
        Matrix matrix;
        int i11;
        float f10;
        int i12;
        int i13;
        float[] fArr2;
        float f11;
        int i14;
        e0.d dVar;
        int i15;
        e0.d dVar2;
        e0.d dVar3;
        e0.d dVar4;
        e0.d dVar5;
        int i16;
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        n nVar;
        c cVar5;
        double[] dArr;
        float[] fArr3;
        int i17;
        p pVar;
        super.onDraw(canvas);
        Matrix matrix2 = getMatrix();
        Matrix matrix3 = this.f3255o;
        matrix2.invert(matrix3);
        if (this.f3253m == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f3253m = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i18 = 5;
        float[] fArr4 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        MotionTelltales motionTelltales = this;
        int i19 = 0;
        while (i19 < i18) {
            float f12 = fArr4[i19];
            int i20 = 0;
            while (i20 < i18) {
                float f13 = fArr4[i20];
                MotionLayout motionLayout = motionTelltales.f3253m;
                float[] fArr5 = motionTelltales.f3254n;
                int i21 = motionTelltales.f3256p;
                float f14 = motionLayout.f3021t;
                float f15 = motionLayout.E;
                if (motionLayout.f3017r != null) {
                    float signum = Math.signum(motionLayout.G - f15);
                    float interpolation = motionLayout.f3017r.getInterpolation(motionLayout.E + 1.0E-5f);
                    fArr = fArr4;
                    float interpolation2 = motionLayout.f3017r.getInterpolation(motionLayout.E);
                    f14 = (((interpolation - interpolation2) / 1.0E-5f) * signum) / motionLayout.C;
                    f15 = interpolation2;
                } else {
                    fArr = fArr4;
                }
                o oVar = motionLayout.f3017r;
                if (oVar instanceof o) {
                    f14 = oVar.a();
                }
                float f16 = f14;
                n nVar2 = motionLayout.A.get(motionTelltales);
                if ((i21 & 1) == 0) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float[] fArr6 = nVar2.f16964v;
                    float b10 = nVar2.b(fArr6, f15);
                    HashMap<String, e0.d> hashMap = nVar2.f16967y;
                    c cVar6 = null;
                    if (hashMap == null) {
                        i15 = i20;
                        dVar = null;
                    } else {
                        dVar = hashMap.get("translationX");
                        i15 = i20;
                    }
                    HashMap<String, e0.d> hashMap2 = nVar2.f16967y;
                    i12 = i19;
                    if (hashMap2 == null) {
                        i11 = height;
                        dVar2 = null;
                    } else {
                        dVar2 = hashMap2.get("translationY");
                        i11 = height;
                    }
                    HashMap<String, e0.d> hashMap3 = nVar2.f16967y;
                    i10 = width;
                    if (hashMap3 == null) {
                        matrix = matrix3;
                        dVar3 = null;
                    } else {
                        dVar3 = hashMap3.get(CellUtil.ROTATION);
                        matrix = matrix3;
                    }
                    HashMap<String, e0.d> hashMap4 = nVar2.f16967y;
                    if (hashMap4 == null) {
                        f10 = f16;
                        dVar4 = null;
                    } else {
                        dVar4 = hashMap4.get("scaleX");
                        f10 = f16;
                    }
                    HashMap<String, e0.d> hashMap5 = nVar2.f16967y;
                    if (hashMap5 == null) {
                        i16 = width2;
                        dVar5 = null;
                    } else {
                        dVar5 = hashMap5.get("scaleY");
                        i16 = width2;
                    }
                    HashMap<String, c> hashMap6 = nVar2.f16968z;
                    if (hashMap6 == null) {
                        cVar = null;
                    } else {
                        cVar = hashMap6.get("translationX");
                    }
                    HashMap<String, c> hashMap7 = nVar2.f16968z;
                    if (hashMap7 == null) {
                        cVar2 = null;
                    } else {
                        cVar2 = hashMap7.get("translationY");
                    }
                    HashMap<String, c> hashMap8 = nVar2.f16968z;
                    if (hashMap8 == null) {
                        cVar3 = null;
                    } else {
                        cVar3 = hashMap8.get(CellUtil.ROTATION);
                    }
                    HashMap<String, c> hashMap9 = nVar2.f16968z;
                    if (hashMap9 == null) {
                        cVar4 = null;
                    } else {
                        cVar4 = hashMap9.get("scaleX");
                    }
                    HashMap<String, c> hashMap10 = nVar2.f16968z;
                    if (hashMap10 != null) {
                        cVar6 = hashMap10.get("scaleY");
                    }
                    c cVar7 = cVar6;
                    p pVar2 = new p();
                    pVar2.f5270e = 0.0f;
                    pVar2.f5269d = 0.0f;
                    pVar2.c = 0.0f;
                    pVar2.f5268b = 0.0f;
                    pVar2.f5267a = 0.0f;
                    if (dVar3 != null) {
                        nVar = nVar2;
                        cVar5 = cVar2;
                        pVar2.f5270e = (float) dVar3.f5233a.e(b10);
                        pVar2.f5271f = dVar3.a(b10);
                    } else {
                        nVar = nVar2;
                        cVar5 = cVar2;
                    }
                    if (dVar != null) {
                        f11 = f13;
                        pVar2.c = (float) dVar.f5233a.e(b10);
                    } else {
                        f11 = f13;
                    }
                    if (dVar2 != null) {
                        pVar2.f5269d = (float) dVar2.f5233a.e(b10);
                    }
                    if (dVar4 != null) {
                        pVar2.f5267a = (float) dVar4.f5233a.e(b10);
                    }
                    if (dVar5 != null) {
                        pVar2.f5268b = (float) dVar5.f5233a.e(b10);
                    }
                    if (cVar3 != null) {
                        pVar2.f5270e = cVar3.b(b10);
                    }
                    if (cVar != null) {
                        pVar2.c = cVar.b(b10);
                    }
                    c cVar8 = cVar5;
                    if (cVar5 != null) {
                        pVar2.f5269d = cVar8.b(b10);
                    }
                    if (cVar4 != null) {
                        pVar2.f5267a = cVar4.b(b10);
                    }
                    if (cVar7 != null) {
                        pVar2.f5268b = cVar7.b(b10);
                    }
                    n nVar3 = nVar;
                    a aVar = nVar3.f16953k;
                    f0.p pVar3 = nVar3.f16948f;
                    if (aVar != null) {
                        double[] dArr2 = nVar3.f16958p;
                        if (dArr2.length > 0) {
                            double d10 = b10;
                            aVar.c(d10, dArr2);
                            nVar3.f16953k.f(d10, nVar3.f16959q);
                            int[] iArr = nVar3.f16957o;
                            double[] dArr3 = nVar3.f16959q;
                            double[] dArr4 = nVar3.f16958p;
                            pVar3.getClass();
                            i17 = i21;
                            pVar = pVar2;
                            fArr3 = fArr5;
                            i14 = i15;
                            f0.p.e(f11, f12, fArr5, iArr, dArr3, dArr4);
                        } else {
                            fArr3 = fArr5;
                            i17 = i21;
                            i14 = i15;
                            pVar = pVar2;
                        }
                        pVar.a(f11, f12, i16, height2, fArr3);
                        i13 = i17;
                        fArr2 = fArr3;
                    } else {
                        i13 = i21;
                        i14 = i15;
                        if (nVar3.f16952j != null) {
                            double b11 = nVar3.b(fArr6, b10);
                            nVar3.f16952j[0].f(b11, nVar3.f16959q);
                            nVar3.f16952j[0].c(b11, nVar3.f16958p);
                            float f17 = fArr6[0];
                            int i22 = 0;
                            while (true) {
                                dArr = nVar3.f16959q;
                                if (i22 >= dArr.length) {
                                    break;
                                }
                                dArr[i22] = dArr[i22] * f17;
                                i22++;
                            }
                            int[] iArr2 = nVar3.f16957o;
                            double[] dArr5 = nVar3.f16958p;
                            pVar3.getClass();
                            fArr2 = fArr5;
                            f0.p.e(f11, f12, fArr5, iArr2, dArr, dArr5);
                            pVar2.a(f11, f12, i16, height2, fArr2);
                        } else {
                            f0.p pVar4 = nVar3.f16949g;
                            c cVar9 = cVar4;
                            float f18 = pVar4.f16973e - pVar3.f16973e;
                            float f19 = pVar4.f16974f - pVar3.f16974f;
                            c cVar10 = cVar;
                            fArr5[0] = (((pVar4.f16975g - pVar3.f16975g) + f18) * f11) + ((1.0f - f11) * f18);
                            fArr5[1] = (((pVar4.f16976h - pVar3.f16976h) + f19) * f12) + ((1.0f - f12) * f19);
                            pVar2.f5270e = 0.0f;
                            pVar2.f5269d = 0.0f;
                            pVar2.c = 0.0f;
                            pVar2.f5268b = 0.0f;
                            pVar2.f5267a = 0.0f;
                            if (dVar3 != null) {
                                pVar2.f5270e = (float) dVar3.f5233a.e(b10);
                                pVar2.f5271f = dVar3.a(b10);
                            }
                            if (dVar != null) {
                                pVar2.c = (float) dVar.f5233a.e(b10);
                            }
                            if (dVar2 != null) {
                                pVar2.f5269d = (float) dVar2.f5233a.e(b10);
                            }
                            if (dVar4 != null) {
                                pVar2.f5267a = (float) dVar4.f5233a.e(b10);
                            }
                            if (dVar5 != null) {
                                pVar2.f5268b = (float) dVar5.f5233a.e(b10);
                            }
                            if (cVar3 != null) {
                                pVar2.f5270e = cVar3.b(b10);
                            }
                            if (cVar10 != null) {
                                pVar2.c = cVar10.b(b10);
                            }
                            if (cVar8 != null) {
                                pVar2.f5269d = cVar8.b(b10);
                            }
                            if (cVar9 != null) {
                                pVar2.f5267a = cVar9.b(b10);
                            }
                            if (cVar7 != null) {
                                pVar2.f5268b = cVar7.b(b10);
                            }
                            fArr2 = fArr5;
                            pVar2.a(f11, f12, i16, height2, fArr2);
                        }
                    }
                } else {
                    i10 = width;
                    matrix = matrix3;
                    i11 = height;
                    f10 = f16;
                    i12 = i19;
                    i13 = i21;
                    fArr2 = fArr5;
                    f11 = f13;
                    i14 = i20;
                    nVar2.d(f15, f11, f12, fArr2);
                }
                if (i13 < 2) {
                    fArr2[0] = fArr2[0] * f10;
                    fArr2[1] = fArr2[1] * f10;
                }
                float[] fArr7 = this.f3254n;
                matrix3 = matrix;
                matrix3.mapVectors(fArr7);
                int i23 = i10;
                float f20 = i23 * f11;
                int i24 = i11;
                float f21 = i24 * f12;
                float f22 = fArr7[0];
                float f23 = this.f3258r;
                matrix3.mapVectors(fArr7);
                canvas.drawLine(f20, f21, f20 - (f22 * f23), f21 - (fArr7[1] * f23), this.f3252l);
                i20 = i14 + 1;
                motionTelltales = this;
                width = i23;
                height = i24;
                fArr4 = fArr;
                i19 = i12;
                i18 = 5;
            }
            i19++;
            height = height;
            fArr4 = fArr4;
            i18 = 5;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f3212f = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3252l = new Paint();
        this.f3254n = new float[2];
        this.f3255o = new Matrix();
        this.f3256p = 0;
        this.f3257q = -65281;
        this.f3258r = 0.25f;
        a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3252l = new Paint();
        this.f3254n = new float[2];
        this.f3255o = new Matrix();
        this.f3256p = 0;
        this.f3257q = -65281;
        this.f3258r = 0.25f;
        a(context, attributeSet);
    }
}
