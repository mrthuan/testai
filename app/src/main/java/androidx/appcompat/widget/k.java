package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f2613a;

    /* renamed from: b  reason: collision with root package name */
    public s0 f2614b;
    public int c = 0;

    public k(ImageView imageView) {
        this.f2613a = imageView;
    }

    public final void a() {
        s0 s0Var;
        ImageView imageView = this.f2613a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            a0.a(drawable);
        }
        if (drawable != null && (s0Var = this.f2614b) != null) {
            h.e(drawable, s0Var, imageView.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int i11;
        ImageView imageView = this.f2613a;
        Context context = imageView.getContext();
        int[] iArr = k.a.f19434g;
        u0 m10 = u0.m(context, attributeSet, iArr, i10, 0);
        x0.f0.n(imageView, imageView.getContext(), iArr, attributeSet, m10.f2688b, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (i11 = m10.i(1, -1)) != -1 && (drawable = m.a.a(imageView.getContext(), i11)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                a0.a(drawable);
            }
            if (m10.l(2)) {
                b1.g.c(imageView, m10.b(2));
            }
            if (m10.l(3)) {
                b1.g.d(imageView, a0.c(m10.h(3, -1), null));
            }
        } finally {
            m10.n();
        }
    }

    public final void c(int i10) {
        ImageView imageView = this.f2613a;
        if (i10 != 0) {
            Drawable a10 = m.a.a(imageView.getContext(), i10);
            if (a10 != null) {
                a0.a(a10);
            }
            imageView.setImageDrawable(a10);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
