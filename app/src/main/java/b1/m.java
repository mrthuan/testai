package b1;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Method;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import v0.c;

/* compiled from: TextViewCompat.java */
/* loaded from: classes.dex */
public final class m {

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static int b(View view) {
            return view.getLayoutDirection();
        }

        public static int c(View view) {
            return view.getTextDirection();
        }

        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        public static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        public static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        public static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void g(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static void h(TextView textView, int i10) {
            textView.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class f {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* compiled from: TextViewCompat.java */
    /* loaded from: classes.dex */
    public static class g implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f5301a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f5302b;
        public Class<?> c;

        /* renamed from: d  reason: collision with root package name */
        public Method f5303d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5304e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5305f = false;

        public g(ActionMode.Callback callback, TextView textView) {
            this.f5301a = callback;
            this.f5302b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f5301a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f5301a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f5301a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: b1.m.g.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    public static c.a a(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new c.a(f.b(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a10 = c.a(textView);
        int d10 = c.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z10 = true;
            if (i10 >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(f.a(d.a(b.d(textView)))[0].codePointAt(0));
                if (directionality != 1 && directionality != 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
            } else {
                if (b.b(textView) != 1) {
                    z10 = false;
                }
                switch (b.c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        }
                }
            }
        }
        return new c.a(textPaint, textDirectionHeuristic, a10, d10);
    }

    public static void b(AppCompatTextView appCompatTextView, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 27) {
            e.f(appCompatTextView, i10, i11, 1, 0);
        } else {
            appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, 1, 0);
        }
    }

    public static void c(AppCompatTextView appCompatTextView) {
        if (Build.VERSION.SDK_INT >= 27) {
            e.h(appCompatTextView, 1);
        } else {
            appCompatTextView.setAutoSizeTextTypeWithDefaults(1);
        }
    }

    public static void d(TextView textView, int i10) {
        int i11;
        t0.t(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            f.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void e(TextView textView, int i10) {
        int i11;
        t0.t(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void f(TextView textView, v0.c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            cVar.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        c.a a10 = a(textView);
        cVar.getClass();
        a10.a(null);
        throw null;
    }

    public static ActionMode.Callback g(ActionMode.Callback callback) {
        if ((callback instanceof g) && Build.VERSION.SDK_INT >= 26) {
            return ((g) callback).f5301a;
        }
        return callback;
    }

    public static ActionMode.Callback h(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27 && !(callback instanceof g) && callback != null) {
            return new g(callback, textView);
        }
        return callback;
    }
}
