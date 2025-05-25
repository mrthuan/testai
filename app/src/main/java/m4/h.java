package m4;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class h<T extends View, Z> extends m4.a<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final T f21813a;

    /* renamed from: b  reason: collision with root package name */
    public final a f21814b;

    /* compiled from: ViewTarget.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static Integer f21815d;

        /* renamed from: a  reason: collision with root package name */
        public final View f21816a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f21817b = new ArrayList();
        public ViewTreeObserver$OnPreDrawListenerC0289a c;

        /* compiled from: ViewTarget.java */
        /* renamed from: m4.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0289a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference<a> f21818a;

            public ViewTreeObserver$OnPreDrawListenerC0289a(a aVar) {
                this.f21818a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean z10;
                boolean z11;
                Log.isLoggable("ViewTarget", 2);
                a aVar = this.f21818a.get();
                if (aVar != null) {
                    ArrayList arrayList = aVar.f21817b;
                    if (!arrayList.isEmpty()) {
                        int c = aVar.c();
                        int b10 = aVar.b();
                        boolean z12 = false;
                        if (c <= 0 && c != Integer.MIN_VALUE) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                z12 = true;
                            }
                        }
                        if (z12) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((f) it.next()).b(c, b10);
                            }
                            ViewTreeObserver viewTreeObserver = aVar.f21816a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(aVar.c);
                            }
                            aVar.c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f21816a = view;
        }

        public final int a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            View view = this.f21816a;
            if (!view.isLayoutRequested() && i11 == -2) {
                Log.isLoggable("ViewTarget", 4);
                Context context = view.getContext();
                if (f21815d == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    com.google.android.play.core.assetpacks.c.l(windowManager);
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    f21815d = Integer.valueOf(Math.max(point.x, point.y));
                }
                return f21815d.intValue();
            }
            return 0;
        }

        public final int b() {
            int i10;
            View view = this.f21816a;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.height;
            } else {
                i10 = 0;
            }
            return a(view.getHeight(), i10, paddingBottom);
        }

        public final int c() {
            int i10;
            View view = this.f21816a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.width;
            } else {
                i10 = 0;
            }
            return a(view.getWidth(), i10, paddingRight);
        }
    }

    public h(T t4) {
        com.google.android.play.core.assetpacks.c.l(t4);
        this.f21813a = t4;
        this.f21814b = new a(t4);
    }

    @Override // m4.g
    public final void d(f fVar) {
        this.f21814b.f21817b.remove(fVar);
    }

    @Override // m4.g
    public final void e(l4.b bVar) {
        this.f21813a.setTag(R.id.glide_custom_view_target_tag, bVar);
    }

    @Override // m4.g
    public final l4.b h() {
        Object tag = this.f21813a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof l4.b) {
                return (l4.b) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // m4.g
    public void i(Drawable drawable) {
        a aVar = this.f21814b;
        ViewTreeObserver viewTreeObserver = aVar.f21816a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.c);
        }
        aVar.c = null;
        aVar.f21817b.clear();
    }

    @Override // m4.g
    public final void j(f fVar) {
        boolean z10;
        boolean z11;
        a aVar = this.f21814b;
        int c = aVar.c();
        int b10 = aVar.b();
        boolean z12 = false;
        if (c <= 0 && c != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                z12 = true;
            }
        }
        if (z12) {
            fVar.b(c, b10);
            return;
        }
        ArrayList arrayList = aVar.f21817b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f21816a.getViewTreeObserver();
            a.ViewTreeObserver$OnPreDrawListenerC0289a viewTreeObserver$OnPreDrawListenerC0289a = new a.ViewTreeObserver$OnPreDrawListenerC0289a(aVar);
            aVar.c = viewTreeObserver$OnPreDrawListenerC0289a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0289a);
        }
    }

    public final String toString() {
        return "Target for: " + this.f21813a;
    }
}
