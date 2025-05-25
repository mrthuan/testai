package e4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import v3.i;
import v3.l;

/* compiled from: DrawableResource.java */
/* loaded from: classes.dex */
public abstract class b<T extends Drawable> implements l<T>, i {

    /* renamed from: a  reason: collision with root package name */
    public final T f16451a;

    public b(T t4) {
        com.google.android.play.core.assetpacks.c.l(t4);
        this.f16451a = t4;
    }

    @Override // v3.l
    public final Object get() {
        T t4 = this.f16451a;
        Drawable.ConstantState constantState = t4.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return t4;
    }

    @Override // v3.i
    public void initialize() {
        T t4 = this.f16451a;
        if (t4 instanceof BitmapDrawable) {
            ((BitmapDrawable) t4).getBitmap().prepareToDraw();
        } else if (t4 instanceof g4.c) {
            ((g4.c) t4).f17630a.f17639a.f17651l.prepareToDraw();
        }
    }
}
