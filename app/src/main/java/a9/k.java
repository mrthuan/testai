package a9;

import a9.b;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: DrawingDelegate.java */
/* loaded from: classes2.dex */
public abstract class k<S extends b> {

    /* renamed from: a  reason: collision with root package name */
    public final S f438a;

    /* renamed from: b  reason: collision with root package name */
    public j f439b;

    public k(S s4) {
        this.f438a = s4;
    }

    public abstract void a(Canvas canvas, Rect rect, float f10);

    public abstract void b(int i10, Paint paint, Canvas canvas, float f10, float f11);

    public abstract void c(Canvas canvas, Paint paint);

    public abstract int d();

    public abstract int e();
}
