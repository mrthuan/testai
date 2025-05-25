package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.activity.r;
import b9.a;
import b9.d;
import b9.h;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.play.core.assetpacks.c;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import v0.e;
import x0.f0;
import x0.n0;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes2.dex */
public final class a {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public b9.a D;
    public b9.a E;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f12631a;

    /* renamed from: a0  reason: collision with root package name */
    public ColorStateList f12632a0;

    /* renamed from: b  reason: collision with root package name */
    public float f12633b;

    /* renamed from: b0  reason: collision with root package name */
    public float f12634b0;
    public boolean c;

    /* renamed from: c0  reason: collision with root package name */
    public float f12635c0;

    /* renamed from: d  reason: collision with root package name */
    public float f12636d;

    /* renamed from: d0  reason: collision with root package name */
    public float f12637d0;

    /* renamed from: e  reason: collision with root package name */
    public float f12638e;

    /* renamed from: e0  reason: collision with root package name */
    public ColorStateList f12639e0;

    /* renamed from: f  reason: collision with root package name */
    public int f12640f;

    /* renamed from: f0  reason: collision with root package name */
    public float f12641f0;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f12642g;

    /* renamed from: g0  reason: collision with root package name */
    public float f12643g0;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f12644h;

    /* renamed from: h0  reason: collision with root package name */
    public float f12645h0;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f12646i;

    /* renamed from: i0  reason: collision with root package name */
    public StaticLayout f12647i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f12649j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f12651k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f12653l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f12655m0;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f12656n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f12658o;

    /* renamed from: p  reason: collision with root package name */
    public int f12660p;

    /* renamed from: q  reason: collision with root package name */
    public float f12662q;

    /* renamed from: r  reason: collision with root package name */
    public float f12664r;

    /* renamed from: s  reason: collision with root package name */
    public float f12665s;

    /* renamed from: t  reason: collision with root package name */
    public float f12666t;

    /* renamed from: u  reason: collision with root package name */
    public float f12667u;

    /* renamed from: v  reason: collision with root package name */
    public float f12668v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f12669w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f12670x;

    /* renamed from: y  reason: collision with root package name */
    public Typeface f12671y;

    /* renamed from: z  reason: collision with root package name */
    public Typeface f12672z;

    /* renamed from: j  reason: collision with root package name */
    public int f12648j = 16;

    /* renamed from: k  reason: collision with root package name */
    public int f12650k = 16;

    /* renamed from: l  reason: collision with root package name */
    public float f12652l = 15.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f12654m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;

    /* renamed from: n0  reason: collision with root package name */
    public int f12657n0 = 1;

    /* renamed from: o0  reason: collision with root package name */
    public float f12659o0 = 0.0f;

    /* renamed from: p0  reason: collision with root package name */
    public float f12661p0 = 1.0f;

    /* renamed from: q0  reason: collision with root package name */
    public int f12663q0 = 1;

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0169a implements a.InterfaceC0035a {
        public C0169a() {
        }

        @Override // b9.a.InterfaceC0035a
        public final void a(Typeface typeface) {
            a aVar = a.this;
            if (aVar.m(typeface)) {
                aVar.i(false);
            }
        }
    }

    /* compiled from: CollapsingTextHelper.java */
    /* loaded from: classes2.dex */
    public class b implements a.InterfaceC0035a {
        public b() {
        }

        @Override // b9.a.InterfaceC0035a
        public final void a(Typeface typeface) {
            a aVar = a.this;
            if (aVar.o(typeface)) {
                aVar.i(false);
            }
        }
    }

    public a(View view) {
        this.f12631a = view;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.f12644h = new Rect();
        this.f12642g = new Rect();
        this.f12646i = new RectF();
        float f10 = this.f12636d;
        this.f12638e = r.l(1.0f, f10, 0.5f, f10);
        h(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float g(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = f8.b.f17141a;
        return r.l(f11, f10, f12, f10);
    }

    public final boolean b(CharSequence charSequence) {
        e.d dVar;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        boolean z10 = true;
        if (f0.e.d(this.f12631a) != 1) {
            z10 = false;
        }
        if (this.J) {
            if (z10) {
                dVar = e.f30475d;
            } else {
                dVar = e.c;
            }
            return dVar.b(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void c(float f10, boolean z10) {
        boolean z11;
        boolean z12;
        float f11;
        float f12;
        Typeface typeface;
        boolean z13;
        boolean z14;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z15;
        boolean z16;
        boolean z17;
        StaticLayout staticLayout2;
        boolean z18;
        boolean z19;
        boolean z20;
        if (this.G == null) {
            return;
        }
        float width = this.f12644h.width();
        float width2 = this.f12642g.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f11 = this.f12654m;
            f12 = this.f12641f0;
            this.L = 1.0f;
            typeface = this.f12669w;
        } else {
            float f13 = this.f12652l;
            float f14 = this.f12643g0;
            Typeface typeface2 = this.f12672z;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                this.L = 1.0f;
            } else {
                this.L = g(this.f12652l, this.f12654m, f10, this.W) / this.f12652l;
            }
            float f15 = this.f12654m / this.f12652l;
            float f16 = width2 * f15;
            if (!z10 && f16 > width) {
                width = Math.min(width / f15, width2);
            } else {
                width = width2;
            }
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        int i10 = (width > 0.0f ? 1 : (width == 0.0f ? 0 : -1));
        TextPaint textPaint = this.T;
        if (i10 > 0) {
            if (this.M != f11) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.f12645h0 != f12) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (this.C != typeface) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.f12647i0 != null && width != staticLayout2.getWidth()) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z15 && !z16 && !z18 && !z17 && !this.S) {
                z19 = false;
            } else {
                z19 = true;
            }
            this.M = f11;
            this.f12645h0 = f12;
            this.C = typeface;
            this.S = false;
            if (this.L != 1.0f) {
                z20 = true;
            } else {
                z20 = false;
            }
            textPaint.setLinearText(z20);
            z13 = z19;
        } else {
            z13 = false;
        }
        if (this.H == null || z13) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.C);
            textPaint.setLetterSpacing(this.f12645h0);
            boolean b10 = b(this.G);
            this.I = b10;
            int i11 = this.f12657n0;
            if (i11 > 1 && (!b10 || this.c)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                i11 = 1;
            }
            try {
                if (i11 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f12648j, b10 ? 1 : 0) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            if (this.I) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            }
                        } else if (this.I) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                }
                StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(this.G, textPaint, (int) width);
                staticLayoutBuilderCompat.f12628l = this.F;
                staticLayoutBuilderCompat.f12627k = b10;
                staticLayoutBuilderCompat.f12621e = alignment;
                staticLayoutBuilderCompat.f12626j = false;
                staticLayoutBuilderCompat.f12622f = i11;
                float f17 = this.f12659o0;
                float f18 = this.f12661p0;
                staticLayoutBuilderCompat.f12623g = f17;
                staticLayoutBuilderCompat.f12624h = f18;
                staticLayoutBuilderCompat.f12625i = this.f12663q0;
                staticLayout = staticLayoutBuilderCompat.a();
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e10) {
                e10.getCause().getMessage();
                staticLayout = null;
            }
            staticLayout.getClass();
            this.f12647i0 = staticLayout;
            this.H = staticLayout.getText();
        }
    }

    public final void d(Canvas canvas) {
        int save = canvas.save();
        if (this.H != null) {
            RectF rectF = this.f12646i;
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                TextPaint textPaint = this.T;
                textPaint.setTextSize(this.M);
                float f10 = this.f12667u;
                float f11 = this.f12668v;
                float f12 = this.L;
                if (f12 != 1.0f && !this.c) {
                    canvas.scale(f12, f12, f10, f11);
                }
                boolean z10 = true;
                if (this.f12657n0 <= 1 || (this.I && !this.c)) {
                    z10 = false;
                }
                if (z10 && (!this.c || this.f12633b > this.f12638e)) {
                    int alpha = textPaint.getAlpha();
                    canvas.translate(this.f12667u - this.f12647i0.getLineStart(0), f11);
                    if (!this.c) {
                        textPaint.setAlpha((int) (this.f12653l0 * alpha));
                        if (Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(this.N, this.O, this.P, t0.x(this.Q, textPaint.getAlpha()));
                        }
                        this.f12647i0.draw(canvas);
                    }
                    if (!this.c) {
                        textPaint.setAlpha((int) (this.f12651k0 * alpha));
                    }
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, t0.x(this.Q, textPaint.getAlpha()));
                    }
                    int lineBaseline = this.f12647i0.getLineBaseline(0);
                    CharSequence charSequence = this.f12655m0;
                    float f13 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, textPaint);
                    if (i10 >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                    }
                    if (!this.c) {
                        String trim = this.f12655m0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(this.f12647i0.getLineEnd(0), str.length()), 0.0f, f13, (Paint) textPaint);
                    }
                } else {
                    canvas.translate(f10, f11);
                    this.f12647i0.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public final float e() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.f12654m);
        textPaint.setTypeface(this.f12669w);
        textPaint.setLetterSpacing(this.f12641f0);
        return -textPaint.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f12671y;
            if (typeface != null) {
                this.f12670x = h.a(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = h.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f12670x;
            if (typeface3 == null) {
                typeface3 = this.f12671y;
            }
            this.f12669w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f12672z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z10) {
        float f10;
        float f11;
        int i10;
        float f12;
        float a10;
        StaticLayout staticLayout;
        View view = this.f12631a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z10) {
            c(1.0f, z10);
            CharSequence charSequence = this.H;
            TextPaint textPaint = this.T;
            if (charSequence != null && (staticLayout = this.f12647i0) != null) {
                this.f12655m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.F);
            }
            CharSequence charSequence2 = this.f12655m0;
            if (charSequence2 != null) {
                this.f12649j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f12649j0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f12650k, this.I ? 1 : 0);
            int i11 = absoluteGravity & 112;
            Rect rect = this.f12644h;
            if (i11 != 48) {
                if (i11 != 80) {
                    this.f12664r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f12664r = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f12664r = rect.top;
            }
            int i12 = absoluteGravity & 8388615;
            if (i12 != 1) {
                if (i12 != 5) {
                    this.f12666t = rect.left;
                } else {
                    this.f12666t = rect.right - this.f12649j0;
                }
            } else {
                this.f12666t = rect.centerX() - (this.f12649j0 / 2.0f);
            }
            c(0.0f, z10);
            StaticLayout staticLayout2 = this.f12647i0;
            if (staticLayout2 != null) {
                f10 = staticLayout2.getHeight();
            } else {
                f10 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f12647i0;
            if (staticLayout3 != null && this.f12657n0 > 1) {
                f11 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.H;
                if (charSequence3 != null) {
                    f11 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f11 = 0.0f;
                }
            }
            StaticLayout staticLayout4 = this.f12647i0;
            if (staticLayout4 != null) {
                i10 = staticLayout4.getLineCount();
            } else {
                i10 = 0;
            }
            this.f12660p = i10;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f12648j, this.I ? 1 : 0);
            int i13 = absoluteGravity2 & 112;
            Rect rect2 = this.f12642g;
            if (i13 != 48) {
                if (i13 != 80) {
                    this.f12662q = rect2.centerY() - (f10 / 2.0f);
                } else {
                    this.f12662q = textPaint.descent() + (rect2.bottom - f10);
                }
            } else {
                this.f12662q = rect2.top;
            }
            int i14 = absoluteGravity2 & 8388615;
            if (i14 != 1) {
                if (i14 != 5) {
                    this.f12665s = rect2.left;
                } else {
                    this.f12665s = rect2.right - f11;
                }
            } else {
                this.f12665s = rect2.centerX() - (f11 / 2.0f);
            }
            Bitmap bitmap = this.K;
            if (bitmap != null) {
                bitmap.recycle();
                this.K = null;
            }
            q(this.f12633b);
            float f13 = this.f12633b;
            boolean z11 = this.c;
            RectF rectF = this.f12646i;
            if (z11) {
                if (f13 < this.f12638e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, f13, this.V);
                rectF.top = g(this.f12662q, this.f12664r, f13, this.V);
                rectF.right = g(rect2.right, rect.right, f13, this.V);
                rectF.bottom = g(rect2.bottom, rect.bottom, f13, this.V);
            }
            if (this.c) {
                if (f13 < this.f12638e) {
                    this.f12667u = this.f12665s;
                    this.f12668v = this.f12662q;
                    q(0.0f);
                    f12 = 0.0f;
                } else {
                    this.f12667u = this.f12666t;
                    this.f12668v = this.f12664r - Math.max(0, this.f12640f);
                    q(1.0f);
                    f12 = 1.0f;
                }
            } else {
                this.f12667u = g(this.f12665s, this.f12666t, f13, this.V);
                this.f12668v = g(this.f12662q, this.f12664r, f13, this.V);
                q(f13);
                f12 = f13;
            }
            m1.b bVar = f8.b.f17142b;
            this.f12651k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f13, bVar);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(view);
            this.f12653l0 = g(1.0f, 0.0f, f13, bVar);
            f0.d.k(view);
            ColorStateList colorStateList = this.f12658o;
            ColorStateList colorStateList2 = this.f12656n;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f12, f(colorStateList2), f(this.f12658o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            float f14 = this.f12641f0;
            float f15 = this.f12643g0;
            if (f14 != f15) {
                textPaint.setLetterSpacing(g(f15, f14, f13, bVar));
            } else {
                textPaint.setLetterSpacing(f14);
            }
            this.N = g(this.f12634b0, this.X, f13, null);
            this.O = g(this.f12635c0, this.Y, f13, null);
            this.P = g(this.f12637d0, this.Z, f13, null);
            int a11 = a(f13, f(this.f12639e0), f(this.f12632a0));
            this.Q = a11;
            textPaint.setShadowLayer(this.N, this.O, this.P, a11);
            if (this.c) {
                int alpha = textPaint.getAlpha();
                float f16 = this.f12638e;
                if (f13 <= f16) {
                    a10 = f8.b.a(1.0f, 0.0f, this.f12636d, f16, f13);
                } else {
                    a10 = f8.b.a(0.0f, 1.0f, f16, 1.0f, f13);
                }
                textPaint.setAlpha((int) (a10 * alpha));
            }
            f0.d.k(view);
        }
    }

    public final void j(ColorStateList colorStateList) {
        if (this.f12658o != colorStateList || this.f12656n != colorStateList) {
            this.f12658o = colorStateList;
            this.f12656n = colorStateList;
            i(false);
        }
    }

    public final void k(int i10) {
        View view = this.f12631a;
        d dVar = new d(view.getContext(), i10);
        ColorStateList colorStateList = dVar.f5383j;
        if (colorStateList != null) {
            this.f12658o = colorStateList;
        }
        float f10 = dVar.f5384k;
        if (f10 != 0.0f) {
            this.f12654m = f10;
        }
        ColorStateList colorStateList2 = dVar.f5375a;
        if (colorStateList2 != null) {
            this.f12632a0 = colorStateList2;
        }
        this.Y = dVar.f5378e;
        this.Z = dVar.f5379f;
        this.X = dVar.f5380g;
        this.f12641f0 = dVar.f5382i;
        b9.a aVar = this.E;
        if (aVar != null) {
            aVar.c = true;
        }
        C0169a c0169a = new C0169a();
        dVar.a();
        this.E = new b9.a(c0169a, dVar.f5387n);
        dVar.c(view.getContext(), this.E);
        i(false);
    }

    public final void l(int i10) {
        if (this.f12650k != i10) {
            this.f12650k = i10;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        b9.a aVar = this.E;
        if (aVar != null) {
            aVar.c = true;
        }
        if (this.f12671y != typeface) {
            this.f12671y = typeface;
            Typeface a10 = h.a(this.f12631a.getContext().getResources().getConfiguration(), typeface);
            this.f12670x = a10;
            if (a10 == null) {
                a10 = this.f12671y;
            }
            this.f12669w = a10;
            return true;
        }
        return false;
    }

    public final void n(int i10) {
        View view = this.f12631a;
        d dVar = new d(view.getContext(), i10);
        ColorStateList colorStateList = dVar.f5383j;
        if (colorStateList != null) {
            this.f12656n = colorStateList;
        }
        float f10 = dVar.f5384k;
        if (f10 != 0.0f) {
            this.f12652l = f10;
        }
        ColorStateList colorStateList2 = dVar.f5375a;
        if (colorStateList2 != null) {
            this.f12639e0 = colorStateList2;
        }
        this.f12635c0 = dVar.f5378e;
        this.f12637d0 = dVar.f5379f;
        this.f12634b0 = dVar.f5380g;
        this.f12643g0 = dVar.f5382i;
        b9.a aVar = this.D;
        if (aVar != null) {
            aVar.c = true;
        }
        b bVar = new b();
        dVar.a();
        this.D = new b9.a(bVar, dVar.f5387n);
        dVar.c(view.getContext(), this.D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        b9.a aVar = this.D;
        if (aVar != null) {
            aVar.c = true;
        }
        if (this.B != typeface) {
            this.B = typeface;
            Typeface a10 = h.a(this.f12631a.getContext().getResources().getConfiguration(), typeface);
            this.A = a10;
            if (a10 == null) {
                a10 = this.B;
            }
            this.f12672z = a10;
            return true;
        }
        return false;
    }

    public final void p(float f10) {
        float f11;
        float a10;
        float m10 = c.m(f10, 0.0f, 1.0f);
        if (m10 != this.f12633b) {
            this.f12633b = m10;
            boolean z10 = this.c;
            RectF rectF = this.f12646i;
            Rect rect = this.f12644h;
            Rect rect2 = this.f12642g;
            if (z10) {
                if (m10 < this.f12638e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, m10, this.V);
                rectF.top = g(this.f12662q, this.f12664r, m10, this.V);
                rectF.right = g(rect2.right, rect.right, m10, this.V);
                rectF.bottom = g(rect2.bottom, rect.bottom, m10, this.V);
            }
            if (this.c) {
                if (m10 < this.f12638e) {
                    this.f12667u = this.f12665s;
                    this.f12668v = this.f12662q;
                    q(0.0f);
                    f11 = 0.0f;
                } else {
                    this.f12667u = this.f12666t;
                    this.f12668v = this.f12664r - Math.max(0, this.f12640f);
                    q(1.0f);
                    f11 = 1.0f;
                }
            } else {
                this.f12667u = g(this.f12665s, this.f12666t, m10, this.V);
                this.f12668v = g(this.f12662q, this.f12664r, m10, this.V);
                q(m10);
                f11 = m10;
            }
            m1.b bVar = f8.b.f17142b;
            this.f12651k0 = 1.0f - g(0.0f, 1.0f, 1.0f - m10, bVar);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            View view = this.f12631a;
            f0.d.k(view);
            this.f12653l0 = g(1.0f, 0.0f, m10, bVar);
            f0.d.k(view);
            ColorStateList colorStateList = this.f12658o;
            ColorStateList colorStateList2 = this.f12656n;
            TextPaint textPaint = this.T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f11, f(colorStateList2), f(this.f12658o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            float f12 = this.f12641f0;
            float f13 = this.f12643g0;
            if (f12 != f13) {
                textPaint.setLetterSpacing(g(f13, f12, m10, bVar));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.N = g(this.f12634b0, this.X, m10, null);
            this.O = g(this.f12635c0, this.Y, m10, null);
            this.P = g(this.f12637d0, this.Z, m10, null);
            int a11 = a(m10, f(this.f12639e0), f(this.f12632a0));
            this.Q = a11;
            textPaint.setShadowLayer(this.N, this.O, this.P, a11);
            if (this.c) {
                int alpha = textPaint.getAlpha();
                float f14 = this.f12638e;
                if (m10 <= f14) {
                    a10 = f8.b.a(1.0f, 0.0f, this.f12636d, f14, m10);
                } else {
                    a10 = f8.b.a(0.0f, 1.0f, f14, 1.0f, m10);
                }
                textPaint.setAlpha((int) (a10 * alpha));
            }
            f0.d.k(view);
        }
    }

    public final void q(float f10) {
        c(f10, false);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.k(this.f12631a);
    }

    public final boolean r(int[] iArr) {
        ColorStateList colorStateList;
        boolean z10;
        this.R = iArr;
        ColorStateList colorStateList2 = this.f12658o;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f12656n) != null && colorStateList.isStateful())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        i(false);
        return true;
    }
}
