package w8;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;
import x0.s0;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public final class w {

    /* compiled from: ViewUtils.java */
    /* loaded from: classes2.dex */
    public class a implements x0.u {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f31061a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f31062b;

        public a(b bVar, c cVar) {
            this.f31061a = bVar;
            this.f31062b = cVar;
        }

        @Override // x0.u
        public final s0 m(View view, s0 s0Var) {
            return this.f31061a.b(view, s0Var, new c(this.f31062b));
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes2.dex */
    public interface b {
        s0 b(View view, s0 s0Var, c cVar);
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.u(view, new a(bVar, new c(f0.e.f(view), view.getPaddingTop(), f0.e.e(view), view.getPaddingBottom())));
        if (f0.g.b(view)) {
            f0.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new x());
        }
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup c(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static f2.v d(View view) {
        ViewGroup c10 = c(view);
        if (c10 == null) {
            return null;
        }
        return new f2.v(c10, 1);
    }

    public static boolean e(View view) {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.e.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f31063a;

        /* renamed from: b  reason: collision with root package name */
        public int f31064b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f31065d;

        public c(int i10, int i11, int i12, int i13) {
            this.f31063a = i10;
            this.f31064b = i11;
            this.c = i12;
            this.f31065d = i13;
        }

        public c(c cVar) {
            this.f31063a = cVar.f31063a;
            this.f31064b = cVar.f31064b;
            this.c = cVar.c;
            this.f31065d = cVar.f31065d;
        }
    }
}
