package f2;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f17090a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f17091b;

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(w.f17090a.g0(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            float floatValue = f10.floatValue();
            w.f17090a.h0(view, floatValue);
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            return f0.f.a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            f0.f.c(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f17090a = new b0();
        } else {
            f17090a = new a0();
        }
        f17091b = new a();
        new b();
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f17090a.k0(view, i10, i11, i12, i13);
    }
}
