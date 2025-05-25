package pdf.pdfreader.viewer.editor.free.widget.ticker;

import android.graphics.Paint;
import android.text.TextPaint;
import java.util.HashMap;
import pdf.pdfreader.viewer.editor.free.widget.ticker.TickerView;

/* compiled from: TickerDrawMetrics.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f28923a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f28924b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f28925d;

    /* renamed from: e  reason: collision with root package name */
    public TickerView.ScrollingDirection f28926e;

    public c(TextPaint textPaint) {
        HashMap hashMap = new HashMap(256);
        this.f28924b = hashMap;
        this.f28926e = TickerView.ScrollingDirection.ANY;
        this.f28923a = textPaint;
        hashMap.clear();
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f10 = fontMetrics.bottom;
        float f11 = fontMetrics.top;
        this.c = f10 - f11;
        this.f28925d = -f11;
    }

    public final float a(char c) {
        if (c == 0) {
            return 0.0f;
        }
        HashMap hashMap = this.f28924b;
        Float f10 = (Float) hashMap.get(Character.valueOf(c));
        if (f10 != null) {
            return f10.floatValue();
        }
        float measureText = this.f28923a.measureText(Character.toString(c));
        hashMap.put(Character.valueOf(c), Float.valueOf(measureText));
        return measureText;
    }
}
