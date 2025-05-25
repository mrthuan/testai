package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes.dex */
public final class t implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3667a = false;

    /* renamed from: b  reason: collision with root package name */
    public Spannable f3668b;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof v0.c;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // androidx.emoji2.text.t.a
        public final boolean a(Spannable spannable) {
            if (!u.h(spannable) && !(spannable instanceof v0.c)) {
                return false;
            }
            return true;
        }
    }

    public t(Spannable spannable) {
        this.f3668b = spannable;
    }

    public final void a() {
        a bVar;
        Spannable spannable = this.f3668b;
        if (!this.f3667a) {
            if (Build.VERSION.SDK_INT < 28) {
                bVar = new a();
            } else {
                bVar = new b();
            }
            if (bVar.a(spannable)) {
                this.f3668b = new SpannableString(spannable);
            }
        }
        this.f3667a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f3668b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.f3668b.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.f3668b.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f3668b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f3668b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f3668b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f3668b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3668b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3668b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f3668b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f3668b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f3668b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f3668b.toString();
    }

    public t(CharSequence charSequence) {
        this.f3668b = new SpannableString(charSequence);
    }
}
