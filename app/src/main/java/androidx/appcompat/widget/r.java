package androidx.appcompat.widget;

import a1.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b1.m;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import n0.f;
import x0.f0;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f2654a;

    /* renamed from: b  reason: collision with root package name */
    public s0 f2655b;
    public s0 c;

    /* renamed from: d  reason: collision with root package name */
    public s0 f2656d;

    /* renamed from: e  reason: collision with root package name */
    public s0 f2657e;

    /* renamed from: f  reason: collision with root package name */
    public s0 f2658f;

    /* renamed from: g  reason: collision with root package name */
    public s0 f2659g;

    /* renamed from: h  reason: collision with root package name */
    public s0 f2660h;

    /* renamed from: i  reason: collision with root package name */
    public final t f2661i;

    /* renamed from: j  reason: collision with root package name */
    public int f2662j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f2663k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f2664l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2665m;

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class c {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class d {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class e {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class f {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public r(TextView textView) {
        this.f2654a = textView;
        this.f2661i = new t(textView);
    }

    public static s0 c(Context context, h hVar, int i10) {
        ColorStateList i11;
        synchronized (hVar) {
            i11 = hVar.f2594a.i(context, i10);
        }
        if (i11 != null) {
            s0 s0Var = new s0();
            s0Var.f2674d = true;
            s0Var.f2672a = i11;
            return s0Var;
        }
        return null;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        CharSequence subSequence;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i13 >= 30) {
                c.a.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i13 >= 30) {
                c.a.a(editorInfo, text);
                return;
            }
            int i14 = editorInfo.initialSelStart;
            int i15 = editorInfo.initialSelEnd;
            if (i14 > i15) {
                i10 = i15 + 0;
            } else {
                i10 = i14 + 0;
            }
            if (i14 > i15) {
                i11 = i14 - 0;
            } else {
                i11 = i15 + 0;
            }
            int length = text.length();
            if (i10 >= 0 && i11 <= length) {
                int i16 = editorInfo.inputType & 4095;
                if (i16 != 129 && i16 != 225 && i16 != 18) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    a1.c.b(editorInfo, null, 0, 0);
                    return;
                } else if (length <= 2048) {
                    a1.c.b(editorInfo, text, i10, i11);
                    return;
                } else {
                    int i17 = i11 - i10;
                    if (i17 > 1024) {
                        i12 = 0;
                    } else {
                        i12 = i17;
                    }
                    int i18 = 2048 - i12;
                    int min = Math.min(text.length() - i11, i18 - Math.min(i10, (int) (i18 * 0.8d)));
                    int min2 = Math.min(i10, i18 - min);
                    int i19 = i10 - min2;
                    if (Character.isLowSurrogate(text.charAt(i19))) {
                        i19++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                        min--;
                    }
                    int i20 = min2 + i12 + min;
                    if (i12 != i17) {
                        subSequence = TextUtils.concat(text.subSequence(i19, i19 + min2), text.subSequence(i11, min + i11));
                    } else {
                        subSequence = text.subSequence(i19, i20 + i19);
                    }
                    int i21 = min2 + 0;
                    a1.c.b(editorInfo, subSequence, i21, i12 + i21);
                    return;
                }
            }
            a1.c.b(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, s0 s0Var) {
        if (drawable != null && s0Var != null) {
            h.e(drawable, s0Var, this.f2654a.getDrawableState());
        }
    }

    public final void b() {
        s0 s0Var = this.f2655b;
        TextView textView = this.f2654a;
        if (s0Var != null || this.c != null || this.f2656d != null || this.f2657e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2655b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.f2656d);
            a(compoundDrawables[3], this.f2657e);
        }
        if (this.f2658f != null || this.f2659g != null) {
            Drawable[] a10 = b.a(textView);
            a(a10[0], this.f2658f);
            a(a10[2], this.f2659g);
        }
    }

    public final ColorStateList d() {
        s0 s0Var = this.f2660h;
        if (s0Var != null) {
            return s0Var.f2672a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        s0 s0Var = this.f2660h;
        if (s0Var != null) {
            return s0Var.f2673b;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        float f10;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Paint.FontMetricsInt fontMetricsInt;
        int fontMetricsInt2;
        int i11;
        int resourceId;
        int i12;
        TextView textView = this.f2654a;
        Context context = textView.getContext();
        h a10 = h.a();
        int[] iArr = k.a.f19436i;
        u0 m10 = u0.m(context, attributeSet, iArr, i10, 0);
        x0.f0.n(textView, textView.getContext(), iArr, attributeSet, m10.f2688b, i10);
        int i13 = m10.i(0, -1);
        if (m10.l(3)) {
            this.f2655b = c(context, a10, m10.i(3, 0));
        }
        if (m10.l(1)) {
            this.c = c(context, a10, m10.i(1, 0));
        }
        if (m10.l(4)) {
            this.f2656d = c(context, a10, m10.i(4, 0));
        }
        if (m10.l(2)) {
            this.f2657e = c(context, a10, m10.i(2, 0));
        }
        int i14 = Build.VERSION.SDK_INT;
        if (m10.l(5)) {
            this.f2658f = c(context, a10, m10.i(5, 0));
        }
        if (m10.l(6)) {
            this.f2659g = c(context, a10, m10.i(6, 0));
        }
        m10.n();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = k.a.f19453z;
        if (i13 != -1) {
            u0 u0Var = new u0(context, context.obtainStyledAttributes(i13, iArr2));
            if (!z12 && u0Var.l(14)) {
                z10 = u0Var.a(14, false);
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            n(context, u0Var);
            if (u0Var.l(15)) {
                str = u0Var.j(15);
                i12 = 26;
            } else {
                i12 = 26;
                str = null;
            }
            if (i14 >= i12 && u0Var.l(13)) {
                str2 = u0Var.j(13);
            } else {
                str2 = null;
            }
            u0Var.n();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        u0 u0Var2 = new u0(context, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (!z12 && u0Var2.l(14)) {
            z10 = u0Var2.a(14, false);
            z11 = true;
        }
        if (u0Var2.l(15)) {
            str = u0Var2.j(15);
        }
        String str3 = str;
        if (i14 >= 26 && u0Var2.l(13)) {
            str2 = u0Var2.j(13);
        }
        String str4 = str2;
        if (i14 >= 28 && u0Var2.l(0) && u0Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, u0Var2);
        u0Var2.n();
        if (!z12 && z11) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.f2664l;
        if (typeface != null) {
            if (this.f2663k == -1) {
                textView.setTypeface(typeface, this.f2662j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            e.d(textView, str4);
        }
        if (str3 != null) {
            if (i14 >= 24) {
                d.b(textView, d.a(str3));
            } else {
                b.c(textView, c.a(str3.split(",")[0]));
            }
        }
        int[] iArr3 = k.a.f19437j;
        t tVar = this.f2661i;
        Context context2 = tVar.f2685j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = tVar.f2684i;
        x0.f0.n(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i10);
        if (obtainStyledAttributes.hasValue(5)) {
            tVar.f2677a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f10 = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f11 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f12 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f12 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i15 = 0; i15 < length; i15++) {
                    iArr4[i15] = obtainTypedArray.getDimensionPixelSize(i15, -1);
                }
                tVar.f2681f = t.b(iArr4);
                tVar.g();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (tVar.h()) {
            if (tVar.f2677a == 1) {
                if (!tVar.f2682g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f11 == -1.0f) {
                        i11 = 2;
                        f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i11 = 2;
                    }
                    if (f12 == -1.0f) {
                        f12 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                    }
                    if (f10 == -1.0f) {
                        f10 = 1.0f;
                    }
                    tVar.i(f11, f12, f10);
                }
                tVar.f();
            }
        } else {
            tVar.f2677a = 0;
        }
        if (d1.f2567b && tVar.f2677a != 0) {
            int[] iArr5 = tVar.f2681f;
            if (iArr5.length > 0) {
                if (e.a(textView) != -1.0f) {
                    e.b(textView, Math.round(tVar.f2679d), Math.round(tVar.f2680e), Math.round(tVar.c), 0);
                } else {
                    e.c(textView, iArr5, 0);
                }
            }
        }
        u0 u0Var3 = new u0(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int i16 = u0Var3.i(8, -1);
        if (i16 != -1) {
            drawable = a10.b(context, i16);
        } else {
            drawable = null;
        }
        int i17 = u0Var3.i(13, -1);
        if (i17 != -1) {
            drawable2 = a10.b(context, i17);
        } else {
            drawable2 = null;
        }
        int i18 = u0Var3.i(9, -1);
        if (i18 != -1) {
            drawable3 = a10.b(context, i18);
        } else {
            drawable3 = null;
        }
        int i19 = u0Var3.i(6, -1);
        if (i19 != -1) {
            drawable4 = a10.b(context, i19);
        } else {
            drawable4 = null;
        }
        int i20 = u0Var3.i(10, -1);
        if (i20 != -1) {
            drawable5 = a10.b(context, i20);
        } else {
            drawable5 = null;
        }
        int i21 = u0Var3.i(7, -1);
        if (i21 != -1) {
            drawable6 = a10.b(context, i21);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a11 = b.a(textView);
                Drawable drawable7 = a11[0];
                if (drawable7 == null && a11[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a11[1];
                    }
                    Drawable drawable8 = a11[2];
                    if (drawable4 == null) {
                        drawable4 = a11[3];
                    }
                    b.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a12 = b.a(textView);
            if (drawable5 == null) {
                drawable5 = a12[0];
            }
            if (drawable2 == null) {
                drawable2 = a12[1];
            }
            if (drawable6 == null) {
                drawable6 = a12[2];
            }
            if (drawable4 == null) {
                drawable4 = a12[3];
            }
            b.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (u0Var3.l(11)) {
            ColorStateList b10 = u0Var3.b(11);
            if (Build.VERSION.SDK_INT >= 24) {
                m.c.f(textView, b10);
            } else if (textView instanceof b1.p) {
                ((b1.p) textView).setSupportCompoundDrawablesTintList(b10);
            }
        }
        if (u0Var3.l(12)) {
            fontMetricsInt = null;
            PorterDuff.Mode c10 = a0.c(u0Var3.h(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                m.c.g(textView, c10);
            } else if (textView instanceof b1.p) {
                ((b1.p) textView).setSupportCompoundDrawablesTintMode(c10);
            }
        } else {
            fontMetricsInt = null;
        }
        int d10 = u0Var3.d(15, -1);
        int d11 = u0Var3.d(18, -1);
        int d12 = u0Var3.d(19, -1);
        u0Var3.n();
        if (d10 != -1) {
            b1.m.d(textView, d10);
        }
        if (d11 != -1) {
            b1.m.e(textView, d11);
        }
        if (d12 != -1) {
            pdf.pdfreader.viewer.editor.free.utils.t0.t(d12);
            if (d12 != textView.getPaint().getFontMetricsInt(fontMetricsInt)) {
                textView.setLineSpacing(d12 - fontMetricsInt2, 1.0f);
            }
        }
    }

    public final void g(Context context, int i10) {
        String j10;
        u0 u0Var = new u0(context, context.obtainStyledAttributes(i10, k.a.f19453z));
        boolean l10 = u0Var.l(14);
        TextView textView = this.f2654a;
        if (l10) {
            textView.setAllCaps(u0Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (u0Var.l(0) && u0Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, u0Var);
        if (i11 >= 26 && u0Var.l(13) && (j10 = u0Var.j(13)) != null) {
            e.d(textView, j10);
        }
        u0Var.n();
        Typeface typeface = this.f2664l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2662j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        t tVar = this.f2661i;
        if (tVar.h()) {
            DisplayMetrics displayMetrics = tVar.f2685j.getResources().getDisplayMetrics();
            tVar.i(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (tVar.f()) {
                tVar.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        t tVar = this.f2661i;
        if (tVar.h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = tVar.f2685j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                tVar.f2681f = t.b(iArr2);
                if (!tVar.g()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                tVar.f2682g = false;
            }
            if (tVar.f()) {
                tVar.a();
            }
        }
    }

    public final void k(int i10) {
        t tVar = this.f2661i;
        if (tVar.h()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = tVar.f2685j.getResources().getDisplayMetrics();
                    tVar.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (tVar.f()) {
                        tVar.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(b.a.c("Unknown auto-size text type: ", i10));
            }
            tVar.f2677a = 0;
            tVar.f2679d = -1.0f;
            tVar.f2680e = -1.0f;
            tVar.c = -1.0f;
            tVar.f2681f = new int[0];
            tVar.f2678b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z10;
        if (this.f2660h == null) {
            this.f2660h = new s0();
        }
        s0 s0Var = this.f2660h;
        s0Var.f2672a = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        s0Var.f2674d = z10;
        this.f2655b = s0Var;
        this.c = s0Var;
        this.f2656d = s0Var;
        this.f2657e = s0Var;
        this.f2658f = s0Var;
        this.f2659g = s0Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z10;
        if (this.f2660h == null) {
            this.f2660h = new s0();
        }
        s0 s0Var = this.f2660h;
        s0Var.f2673b = mode;
        if (mode != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        s0Var.c = z10;
        this.f2655b = s0Var;
        this.c = s0Var;
        this.f2656d = s0Var;
        this.f2657e = s0Var;
        this.f2658f = s0Var;
        this.f2659g = s0Var;
    }

    public final void n(Context context, u0 u0Var) {
        String j10;
        boolean z10;
        boolean z11;
        this.f2662j = u0Var.h(2, this.f2662j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        if (i10 >= 28) {
            int h10 = u0Var.h(11, -1);
            this.f2663k = h10;
            if (h10 != -1) {
                this.f2662j = (this.f2662j & 2) | 0;
            }
        }
        int i11 = 10;
        if (!u0Var.l(10) && !u0Var.l(12)) {
            if (u0Var.l(1)) {
                this.f2665m = false;
                int h11 = u0Var.h(1, 1);
                if (h11 != 1) {
                    if (h11 != 2) {
                        if (h11 == 3) {
                            this.f2664l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f2664l = Typeface.SERIF;
                    return;
                }
                this.f2664l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f2664l = null;
        if (u0Var.l(12)) {
            i11 = 12;
        }
        int i12 = this.f2663k;
        int i13 = this.f2662j;
        if (!context.isRestricted()) {
            try {
                Typeface g10 = u0Var.g(i11, this.f2662j, new a(i12, i13, new WeakReference(this.f2654a)));
                if (g10 != null) {
                    if (i10 >= 28 && this.f2663k != -1) {
                        Typeface create = Typeface.create(g10, 0);
                        int i14 = this.f2663k;
                        if ((this.f2662j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f2664l = f.a(create, i14, z11);
                    } else {
                        this.f2664l = g10;
                    }
                }
                if (this.f2664l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f2665m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2664l == null && (j10 = u0Var.j(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f2663k != -1) {
                Typeface create2 = Typeface.create(j10, 0);
                int i15 = this.f2663k;
                if ((this.f2662j & 2) != 0) {
                    z12 = true;
                }
                this.f2664l = f.a(create2, i15, z12);
                return;
            }
            this.f2664l = Typeface.create(j10, this.f2662j);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f2666a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f2667b;
        public final /* synthetic */ WeakReference c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f2666a = i10;
            this.f2667b = i11;
            this.c = weakReference;
        }

        @Override // n0.f.e
        public final void d(Typeface typeface) {
            int i10;
            boolean z10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f2666a) != -1) {
                if ((this.f2667b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                typeface = f.a(typeface, i10, z10);
            }
            r rVar = r.this;
            if (rVar.f2665m) {
                rVar.f2664l = typeface;
                TextView textView = (TextView) this.c.get();
                if (textView != null) {
                    WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
                    if (f0.g.b(textView)) {
                        textView.post(new s(textView, typeface, rVar.f2662j));
                    } else {
                        textView.setTypeface(typeface, rVar.f2662j);
                    }
                }
            }
        }

        @Override // n0.f.e
        public final void c(int i10) {
        }
    }
}
