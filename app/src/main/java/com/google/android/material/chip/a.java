package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import b9.d;
import f9.h;
import f9.n;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import p0.a;
import w8.p;
import w8.w;

/* compiled from: ChipDrawable.java */
/* loaded from: classes2.dex */
public final class a extends h implements Drawable.Callback, p.b {
    public static final int[] G0 = {16842910};
    public static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());
    public float A;
    public ColorStateList A0;
    public ColorStateList B;
    public WeakReference<InterfaceC0165a> B0;
    public float C;
    public TextUtils.TruncateAt C0;
    public ColorStateList D;
    public boolean D0;
    public CharSequence E;
    public int E0;
    public boolean F;
    public boolean F0;
    public Drawable G;
    public ColorStateList H;
    public float I;
    public boolean J;
    public boolean K;
    public Drawable L;
    public RippleDrawable M;
    public ColorStateList N;
    public float O;
    public SpannableStringBuilder P;
    public boolean Q;
    public boolean R;
    public Drawable S;
    public ColorStateList T;
    public f8.h U;
    public f8.h V;
    public float W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f12334a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f12335b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f12336c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f12337d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Context f12338e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Paint f12339f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Paint.FontMetrics f12340g0;

    /* renamed from: h0  reason: collision with root package name */
    public final RectF f12341h0;

    /* renamed from: i0  reason: collision with root package name */
    public final PointF f12342i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Path f12343j0;

    /* renamed from: k0  reason: collision with root package name */
    public final p f12344k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f12345l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f12346m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f12347n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f12348o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f12349p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f12350q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f12351r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f12352s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f12353t0;

    /* renamed from: u0  reason: collision with root package name */
    public ColorFilter f12354u0;

    /* renamed from: v0  reason: collision with root package name */
    public PorterDuffColorFilter f12355v0;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f12356w0;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f12357x;

    /* renamed from: x0  reason: collision with root package name */
    public PorterDuff.Mode f12358x0;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f12359y;

    /* renamed from: y0  reason: collision with root package name */
    public int[] f12360y0;

    /* renamed from: z  reason: collision with root package name */
    public float f12361z;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f12362z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0165a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018241);
        this.A = -1.0f;
        this.f12339f0 = new Paint(1);
        this.f12340g0 = new Paint.FontMetrics();
        this.f12341h0 = new RectF();
        this.f12342i0 = new PointF();
        this.f12343j0 = new Path();
        this.f12353t0 = FunctionEval.FunctionID.EXTERNAL_FUNC;
        this.f12358x0 = PorterDuff.Mode.SRC_IN;
        this.B0 = new WeakReference<>(null);
        k(context);
        this.f12338e0 = context;
        p pVar = new p(this);
        this.f12344k0 = pVar;
        this.E = "";
        pVar.f31047a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = G0;
        setState(iArr);
        if (!Arrays.equals(this.f12360y0, iArr)) {
            this.f12360y0 = iArr;
            if (c0()) {
                F(getState(), iArr);
            }
        }
        this.D0 = true;
        H0.setTint(-1);
    }

    public static boolean C(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean D(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public static void d0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (c0()) {
            return this.f12335b0 + this.O + this.f12336c0;
        }
        return 0.0f;
    }

    public final float B() {
        if (this.F0) {
            return j();
        }
        return this.A;
    }

    public final void E() {
        InterfaceC0165a interfaceC0165a = this.B0.get();
        if (interfaceC0165a != null) {
            interfaceC0165a.a();
        }
    }

    public final boolean F(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f12357x;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(iArr, this.f12345l0);
        } else {
            i10 = 0;
        }
        int d10 = d(i10);
        boolean z15 = true;
        if (this.f12345l0 != d10) {
            this.f12345l0 = d10;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f12359y;
        if (colorStateList3 != null) {
            i11 = colorStateList3.getColorForState(iArr, this.f12346m0);
        } else {
            i11 = 0;
        }
        int d11 = d(i11);
        if (this.f12346m0 != d11) {
            this.f12346m0 = d11;
            onStateChange = true;
        }
        int c = o0.a.c(d11, d10);
        if (this.f12347n0 != c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f17164a.c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 | z11) {
            this.f12347n0 = c;
            n(ColorStateList.valueOf(c));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.B;
        if (colorStateList4 != null) {
            i12 = colorStateList4.getColorForState(iArr, this.f12348o0);
        } else {
            i12 = 0;
        }
        if (this.f12348o0 != i12) {
            this.f12348o0 = i12;
            onStateChange = true;
        }
        if (this.A0 != null && c9.a.d(iArr)) {
            i13 = this.A0.getColorForState(iArr, this.f12349p0);
        } else {
            i13 = 0;
        }
        if (this.f12349p0 != i13) {
            this.f12349p0 = i13;
            if (this.f12362z0) {
                onStateChange = true;
            }
        }
        d dVar = this.f12344k0.f31051f;
        if (dVar != null && (colorStateList = dVar.f5383j) != null) {
            i14 = colorStateList.getColorForState(iArr, this.f12350q0);
        } else {
            i14 = 0;
        }
        if (this.f12350q0 != i14) {
            this.f12350q0 = i14;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i16 : state) {
                if (i16 == 16842912) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (z12 && this.Q) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f12351r0 != z13 && this.S != null) {
            float z16 = z();
            this.f12351r0 = z13;
            if (z16 != z()) {
                onStateChange = true;
                z14 = true;
            } else {
                z14 = false;
                onStateChange = true;
            }
        } else {
            z14 = false;
        }
        ColorStateList colorStateList5 = this.f12356w0;
        if (colorStateList5 != null) {
            i15 = colorStateList5.getColorForState(iArr, this.f12352s0);
        } else {
            i15 = 0;
        }
        if (this.f12352s0 != i15) {
            this.f12352s0 = i15;
            ColorStateList colorStateList6 = this.f12356w0;
            PorterDuff.Mode mode = this.f12358x0;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f12355v0 = porterDuffColorFilter;
        } else {
            z15 = onStateChange;
        }
        if (D(this.G)) {
            z15 |= this.G.setState(iArr);
        }
        if (D(this.S)) {
            z15 |= this.S.setState(iArr);
        }
        if (D(this.L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z15 |= this.L.setState(iArr3);
        }
        if (D(this.M)) {
            z15 |= this.M.setState(iArr2);
        }
        if (z15) {
            invalidateSelf();
        }
        if (z14) {
            E();
        }
        return z15;
    }

    public final void G(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            float z11 = z();
            if (!z10 && this.f12351r0) {
                this.f12351r0 = false;
            }
            float z12 = z();
            invalidateSelf();
            if (z11 != z12) {
                E();
            }
        }
    }

    public final void H(Drawable drawable) {
        if (this.S != drawable) {
            float z10 = z();
            this.S = drawable;
            float z11 = z();
            d0(this.S);
            x(this.S);
            invalidateSelf();
            if (z10 != z11) {
                E();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        boolean z10;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (this.R && this.S != null && this.Q) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a.b.h(this.S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z10) {
        boolean z11;
        if (this.R != z10) {
            boolean a02 = a0();
            this.R = z10;
            boolean a03 = a0();
            if (a02 != a03) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (a03) {
                    x(this.S);
                } else {
                    d0(this.S);
                }
                invalidateSelf();
                E();
            }
        }
    }

    @Deprecated
    public final void K(float f10) {
        if (this.A != f10) {
            this.A = f10;
            setShapeAppearanceModel(this.f17164a.f17186a.g(f10));
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.G;
        Drawable drawable4 = null;
        if (drawable3 != null) {
            drawable2 = p0.a.d(drawable3);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float z10 = z();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.G = drawable4;
            float z11 = z();
            d0(drawable2);
            if (b0()) {
                x(this.G);
            }
            invalidateSelf();
            if (z10 != z11) {
                E();
            }
        }
    }

    public final void M(float f10) {
        if (this.I != f10) {
            float z10 = z();
            this.I = f10;
            float z11 = z();
            invalidateSelf();
            if (z10 != z11) {
                E();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (b0()) {
                a.b.h(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z10) {
        boolean z11;
        if (this.F != z10) {
            boolean b02 = b0();
            this.F = z10;
            boolean b03 = b0();
            if (b02 != b03) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (b03) {
                    x(this.G);
                } else {
                    d0(this.G);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (this.F0) {
                s(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(float f10) {
        if (this.C != f10) {
            this.C = f10;
            this.f12339f0.setStrokeWidth(f10);
            if (this.F0) {
                t(f10);
            }
            invalidateSelf();
        }
    }

    public final void R(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.L;
        Drawable drawable4 = null;
        if (drawable3 != null) {
            drawable2 = p0.a.d(drawable3);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float A = A();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.L = drawable4;
            this.M = new RippleDrawable(c9.a.c(this.D), this.L, H0);
            float A2 = A();
            d0(drawable2);
            if (c0()) {
                x(this.L);
            }
            invalidateSelf();
            if (A != A2) {
                E();
            }
        }
    }

    public final void S(float f10) {
        if (this.f12336c0 != f10) {
            this.f12336c0 = f10;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void T(float f10) {
        if (this.O != f10) {
            this.O = f10;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void U(float f10) {
        if (this.f12335b0 != f10) {
            this.f12335b0 = f10;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void V(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (c0()) {
                a.b.h(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void W(boolean z10) {
        boolean z11;
        if (this.K != z10) {
            boolean c02 = c0();
            this.K = z10;
            boolean c03 = c0();
            if (c02 != c03) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (c03) {
                    x(this.L);
                } else {
                    d0(this.L);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void X(float f10) {
        if (this.Y != f10) {
            float z10 = z();
            this.Y = f10;
            float z11 = z();
            invalidateSelf();
            if (z10 != z11) {
                E();
            }
        }
    }

    public final void Y(float f10) {
        if (this.X != f10) {
            float z10 = z();
            this.X = f10;
            float z11 = z();
            invalidateSelf();
            if (z10 != z11) {
                E();
            }
        }
    }

    public final void Z(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.f12362z0) {
                colorStateList2 = c9.a.c(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.A0 = colorStateList2;
            onStateChange(getState());
        }
    }

    @Override // f9.h, w8.p.b
    public final void a() {
        E();
        invalidateSelf();
    }

    public final boolean a0() {
        if (this.R && this.S != null && this.f12351r0) {
            return true;
        }
        return false;
    }

    public final boolean b0() {
        if (this.F && this.G != null) {
            return true;
        }
        return false;
    }

    public final boolean c0() {
        if (this.K && this.L != null) {
            return true;
        }
        return false;
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        int i14;
        RectF rectF2;
        boolean z10;
        int i15;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.f12353t0) != 0) {
            if (i10 < 255) {
                i11 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
            } else {
                i11 = 0;
            }
            boolean z11 = this.F0;
            Paint paint = this.f12339f0;
            RectF rectF3 = this.f12341h0;
            if (!z11) {
                paint.setColor(this.f12345l0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, B(), B(), paint);
            }
            if (!this.F0) {
                paint.setColor(this.f12346m0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f12354u0;
                if (colorFilter == null) {
                    colorFilter = this.f12355v0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, B(), B(), paint);
            }
            if (this.F0) {
                super.draw(canvas);
            }
            if (this.C > 0.0f && !this.F0) {
                paint.setColor(this.f12348o0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.F0) {
                    ColorFilter colorFilter2 = this.f12354u0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f12355v0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f10 = this.C / 2.0f;
                rectF3.set(bounds.left + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
                float f11 = this.A - (this.C / 2.0f);
                canvas.drawRoundRect(rectF3, f11, f11, paint);
            }
            paint.setColor(this.f12349p0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.F0) {
                canvas.drawRoundRect(rectF3, B(), B(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.f12343j0;
                n nVar = this.f17180r;
                h.b bVar = this.f17164a;
                nVar.a(bVar.f17186a, bVar.f17194j, rectF4, this.f17179q, path);
                f(canvas, paint, path, this.f17164a.f17186a, h());
            }
            if (b0()) {
                y(bounds, rectF3);
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                canvas.translate(f12, f13);
                this.G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.G.draw(canvas);
                canvas.translate(-f12, -f13);
            }
            if (a0()) {
                y(bounds, rectF3);
                float f14 = rectF3.left;
                float f15 = rectF3.top;
                canvas.translate(f14, f15);
                this.S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.S.draw(canvas);
                canvas.translate(-f14, -f15);
            }
            if (this.D0 && this.E != null) {
                PointF pointF = this.f12342i0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.E;
                p pVar = this.f12344k0;
                if (charSequence != null) {
                    float z12 = z() + this.W + this.Z;
                    if (a.c.a(this) == 0) {
                        pointF.x = bounds.left + z12;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - z12;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = pVar.f31047a;
                    Paint.FontMetrics fontMetrics = this.f12340g0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.E != null) {
                    float z13 = z() + this.W + this.Z;
                    float A = A() + this.f12337d0 + this.f12334a0;
                    if (a.c.a(this) == 0) {
                        rectF3.left = bounds.left + z13;
                        rectF3.right = bounds.right - A;
                    } else {
                        rectF3.left = bounds.left + A;
                        rectF3.right = bounds.right - z13;
                    }
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                d dVar = pVar.f31051f;
                TextPaint textPaint2 = pVar.f31047a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    pVar.f31051f.e(this.f12338e0, textPaint2, pVar.f31048b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(pVar.a(this.E.toString())) > Math.round(rectF3.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i15 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i15 = 0;
                }
                CharSequence charSequence2 = this.E;
                if (z10 && this.C0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.C0);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                float f16 = pointF.x;
                float f17 = pointF.y;
                rectF = rectF3;
                i12 = i11;
                i13 = 0;
                i14 = 255;
                canvas.drawText(charSequence3, 0, length, f16, f17, textPaint2);
                if (z10) {
                    canvas.restoreToCount(i15);
                }
            } else {
                rectF = rectF3;
                i12 = i11;
                i13 = 0;
                i14 = 255;
            }
            if (c0()) {
                rectF.setEmpty();
                if (c0()) {
                    float f18 = this.f12337d0 + this.f12336c0;
                    if (a.c.a(this) == 0) {
                        float f19 = bounds.right - f18;
                        rectF2 = rectF;
                        rectF2.right = f19;
                        rectF2.left = f19 - this.O;
                    } else {
                        rectF2 = rectF;
                        float f20 = bounds.left + f18;
                        rectF2.left = f20;
                        rectF2.right = f20 + this.O;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f21 = this.O;
                    float f22 = exactCenterY - (f21 / 2.0f);
                    rectF2.top = f22;
                    rectF2.bottom = f22 + f21;
                } else {
                    rectF2 = rectF;
                }
                float f23 = rectF2.left;
                float f24 = rectF2.top;
                canvas.translate(f23, f24);
                this.L.setBounds(i13, i13, (int) rectF2.width(), (int) rectF2.height());
                this.M.setBounds(this.L.getBounds());
                this.M.jumpToCurrentState();
                this.M.draw(canvas);
                canvas.translate(-f23, -f24);
            }
            if (this.f12353t0 < i14) {
                canvas.restoreToCount(i12);
            }
        }
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f12353t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f12354u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f12361z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(A() + this.f12344k0.a(this.E.toString()) + z() + this.W + this.Z + this.f12334a0 + this.f12337d0), this.E0);
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f12361z, this.A);
        }
        outline.setAlpha(this.f12353t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        if (C(this.f12357x) || C(this.f12359y) || C(this.B)) {
            return true;
        }
        if (this.f12362z0 && C(this.A0)) {
            return true;
        }
        d dVar = this.f12344k0.f31051f;
        if (dVar != null && (colorStateList = dVar.f5383j) != null && colorStateList.isStateful()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.R && this.S != null && this.Q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || D(this.G) || D(this.S) || C(this.f12356w0)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (b0()) {
            onLayoutDirectionChanged |= a.c.b(this.G, i10);
        }
        if (a0()) {
            onLayoutDirectionChanged |= a.c.b(this.S, i10);
        }
        if (c0()) {
            onLayoutDirectionChanged |= a.c.b(this.L, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (b0()) {
            onLevelChange |= this.G.setLevel(i10);
        }
        if (a0()) {
            onLevelChange |= this.S.setLevel(i10);
        }
        if (c0()) {
            onLevelChange |= this.L.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // f9.h, android.graphics.drawable.Drawable, w8.p.b
    public final boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return F(iArr, this.f12360y0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f12353t0 != i10) {
            this.f12353t0 = i10;
            invalidateSelf();
        }
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f12354u0 != colorFilter) {
            this.f12354u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f12356w0 != colorStateList) {
            this.f12356w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f12358x0 != mode) {
            this.f12358x0 = mode;
            ColorStateList colorStateList = this.f12356w0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f12355v0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (b0()) {
            visible |= this.G.setVisible(z10, z11);
        }
        if (a0()) {
            visible |= this.S.setVisible(z10, z11);
        }
        if (c0()) {
            visible |= this.L.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        a.c.b(drawable, a.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f12360y0);
            }
            a.b.h(drawable, this.N);
            return;
        }
        Drawable drawable2 = this.G;
        if (drawable == drawable2 && this.J) {
            a.b.h(drawable2, this.H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void y(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f10;
        rectF.setEmpty();
        if (b0() || a0()) {
            float f11 = this.W + this.X;
            if (this.f12351r0) {
                drawable = this.S;
            } else {
                drawable = this.G;
            }
            float f12 = this.I;
            if (f12 <= 0.0f && drawable != null) {
                f12 = drawable.getIntrinsicWidth();
            }
            if (a.c.a(this) == 0) {
                float f13 = rect.left + f11;
                rectF.left = f13;
                rectF.right = f13 + f12;
            } else {
                float f14 = rect.right - f11;
                rectF.right = f14;
                rectF.left = f14 - f12;
            }
            if (this.f12351r0) {
                drawable2 = this.S;
            } else {
                drawable2 = this.G;
            }
            float f15 = this.I;
            if (f15 <= 0.0f && drawable2 != null) {
                f15 = (float) Math.ceil(w.b(this.f12338e0, 24));
                if (drawable2.getIntrinsicHeight() <= f15) {
                    f10 = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f15;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public final float z() {
        Drawable drawable;
        if (!b0() && !a0()) {
            return 0.0f;
        }
        float f10 = this.X;
        if (this.f12351r0) {
            drawable = this.S;
        } else {
            drawable = this.G;
        }
        float f11 = this.I;
        if (f11 <= 0.0f && drawable != null) {
            f11 = drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.Y;
    }
}
