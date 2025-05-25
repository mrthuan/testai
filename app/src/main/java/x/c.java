package x;

import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: classes.dex */
public final class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static final double f31414a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f31415b = 0;

    public static float a(float f10, float f11, boolean z10) {
        if (z10) {
            return (float) (((1.0d - f31414a) * f11) + (f10 * 1.5f));
        }
        return f10 * 1.5f;
    }
}
