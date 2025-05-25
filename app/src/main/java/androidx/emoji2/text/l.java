package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: EmojiSpan.java */
/* loaded from: classes.dex */
public abstract class l extends ReplacementSpan {

    /* renamed from: b  reason: collision with root package name */
    public final j f3648b;

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f3647a = new Paint.FontMetricsInt();
    public float c = 1.0f;

    public l(j jVar) {
        if (jVar != null) {
            this.f3648b = jVar;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        short s4;
        Paint.FontMetricsInt fontMetricsInt2 = this.f3647a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        j jVar = this.f3648b;
        h1.a c = jVar.c();
        int a10 = c.a(14);
        short s10 = 0;
        if (a10 != 0) {
            s4 = c.f17948b.getShort(a10 + c.f17947a);
        } else {
            s4 = 0;
        }
        this.c = abs / s4;
        h1.a c10 = jVar.c();
        int a11 = c10.a(14);
        if (a11 != 0) {
            c10.f17948b.getShort(a11 + c10.f17947a);
        }
        h1.a c11 = jVar.c();
        int a12 = c11.a(12);
        if (a12 != 0) {
            s10 = c11.f17948b.getShort(a12 + c11.f17947a);
        }
        short s11 = (short) (s10 * this.c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s11;
    }
}
