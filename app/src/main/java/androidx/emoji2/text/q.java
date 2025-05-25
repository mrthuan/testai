package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: TypefaceEmojiSpan.java */
/* loaded from: classes.dex */
public final class q extends l {
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        g.a().getClass();
        j jVar = this.f3648b;
        o oVar = jVar.f3639b;
        Typeface typeface = oVar.f3660d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i15 = jVar.f3638a * 2;
        canvas.drawText(oVar.f3659b, i15, 2, f10, i13, paint);
        paint.setTypeface(typeface2);
    }
}
