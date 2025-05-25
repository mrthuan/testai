package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.g;

/* compiled from: DefaultGlyphChecker.java */
/* loaded from: classes.dex */
public final class e implements g.d {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f3614b = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f3615a;

    public e() {
        TextPaint textPaint = new TextPaint();
        this.f3615a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
