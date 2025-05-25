package gj;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: BNView.java */
/* loaded from: classes3.dex */
public final class a extends ai.a {

    /* renamed from: p  reason: collision with root package name */
    public String f17808p;

    /* renamed from: q  reason: collision with root package name */
    public final Paint f17809q;

    /* renamed from: r  reason: collision with root package name */
    public final ai.b f17810r = new ai.b();

    /* renamed from: s  reason: collision with root package name */
    public hh.b f17811s;

    public a() {
        Paint paint = new Paint();
        this.f17809q = paint;
        paint.setFlags(1);
        sg.d.b(paint);
    }

    @Override // ai.a, ai.e
    public final synchronized void dispose() {
        hh.b bVar;
        if (this.f17811s != null) {
            bVar.f18341g--;
        }
    }

    @Override // ai.a, ai.e
    public final void g(Canvas canvas, int i10, int i11, float f10) {
        float f11;
        int i12 = ((int) (this.f480b * f10)) + i10;
        int i13 = ((int) (this.c * f10)) + i11;
        String str = this.f17808p;
        if (str != null) {
            Paint paint = this.f17809q;
            float textSize = paint.getTextSize();
            if (this.f17810r.f503l > 0) {
                f11 = textSize / 2.0f;
            } else {
                f11 = textSize;
            }
            paint.setTextSize(f11 * f10);
            canvas.drawText(str, 0, str.length(), i12, i13 - paint.ascent(), paint);
            paint.setTextSize(textSize);
        }
    }

    @Override // ai.e
    public final short getType() {
        return (short) 13;
    }
}
