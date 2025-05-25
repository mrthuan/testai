package c4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import c4.v;

/* compiled from: TransformationUtils.java */
/* loaded from: classes.dex */
public final class t implements v.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5547a;

    public t(int i10) {
        this.f5547a = i10;
    }

    @Override // c4.v.a
    public final void a(Canvas canvas, RectF rectF, Paint paint) {
        float f10 = this.f5547a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }
}
