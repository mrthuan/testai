package m4;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import n4.d;

/* compiled from: ImageViewTarget.java */
/* loaded from: classes.dex */
public abstract class e<Z> extends h<ImageView, Z> implements d.a {
    public Animatable c;

    public e(ImageView imageView) {
        super(imageView);
    }

    public abstract void a(Z z10);

    @Override // m4.g
    public final void c(Z z10, n4.d<? super Z> dVar) {
        if (dVar != null && dVar.a(z10, this)) {
            if (z10 instanceof Animatable) {
                Animatable animatable = (Animatable) z10;
                this.c = animatable;
                animatable.start();
                return;
            }
            this.c = null;
            return;
        }
        a(z10);
        if (z10 instanceof Animatable) {
            Animatable animatable2 = (Animatable) z10;
            this.c = animatable2;
            animatable2.start();
            return;
        }
        this.c = null;
    }

    @Override // m4.g
    public final void f(Drawable drawable) {
        a(null);
        this.c = null;
        ((ImageView) this.f21813a).setImageDrawable(drawable);
    }

    @Override // m4.g
    public final void g(Drawable drawable) {
        a(null);
        this.c = null;
        ((ImageView) this.f21813a).setImageDrawable(drawable);
    }

    @Override // m4.h, m4.g
    public final void i(Drawable drawable) {
        super.i(drawable);
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        a(null);
        this.c = null;
        ((ImageView) this.f21813a).setImageDrawable(drawable);
    }

    @Override // i4.g
    public final void onStart() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // i4.g
    public final void onStop() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
