package v0;

import android.os.Build;
import android.os.LocaleList;
import android.support.v4.media.session.h;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.activity.r;
import b9.g;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public final class c implements Spannable {
    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            h.i(i10, i11, cls);
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                r.k(obj);
                throw null;
            }
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                a0.a.l(obj, i10, i11, i12);
                throw null;
            }
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f30470a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f30471b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30472d;

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = g.c(textPaint).setBreakStrategy(i10);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                textDirection.build();
            }
            this.f30470a = textPaint;
            this.f30471b = textDirectionHeuristic;
            this.c = i10;
            this.f30472d = i11;
        }

        public final boolean a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i10 = Build.VERSION.SDK_INT;
            if (this.c != aVar.c || this.f30472d != aVar.f30472d) {
                return false;
            }
            TextPaint textPaint = this.f30470a;
            if (textPaint.getTextSize() != aVar.f30470a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = aVar.f30470a;
            if (textScaleX != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                textLocales = textPaint.getTextLocales();
                textLocales2 = textPaint2.getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
                return false;
            }
            if (textPaint.getTypeface() == null) {
                if (textPaint2.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar) && this.f30471b == aVar.f30471b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            LocaleList textLocales;
            int i10 = Build.VERSION.SDK_INT;
            int i11 = this.f30472d;
            int i12 = this.c;
            TextDirectionHeuristic textDirectionHeuristic = this.f30471b;
            TextPaint textPaint = this.f30470a;
            if (i10 >= 24) {
                textLocales = textPaint.getTextLocales();
                return w0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
            }
            return w0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
        }

        public final String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f30470a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            if (i10 >= 24) {
                StringBuilder sb4 = new StringBuilder(", textLocale=");
                textLocales = textPaint.getTextLocales();
                sb4.append(textLocales);
                sb2.append(sb4.toString());
            } else {
                sb2.append(", textLocale=" + textPaint.getTextLocale());
            }
            sb2.append(", typeface=" + textPaint.getTypeface());
            if (i10 >= 26) {
                StringBuilder sb5 = new StringBuilder(", variationSettings=");
                fontVariationSettings = textPaint.getFontVariationSettings();
                sb5.append(fontVariationSettings);
                sb2.append(sb5.toString());
            }
            sb2.append(", textDir=" + this.f30471b);
            sb2.append(", breakStrategy=" + this.c);
            sb2.append(", hyphenationFrequency=" + this.f30472d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f30470a = textPaint;
            textDirection = params.getTextDirection();
            this.f30471b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f30472d = hyphenationFrequency;
        }
    }
}
