package f8;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty.java */
/* loaded from: classes2.dex */
public final class e extends Property<Drawable, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f17147a = new e();

    public e() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    @Override // android.util.Property
    public final Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
