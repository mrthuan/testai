package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.n;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2112a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2113b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2114d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2115e;

    /* renamed from: f  reason: collision with root package name */
    public View f2116f;

    /* renamed from: g  reason: collision with root package name */
    public int f2117g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2118h;

    /* renamed from: i  reason: collision with root package name */
    public n.a f2119i;

    /* renamed from: j  reason: collision with root package name */
    public l f2120j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f2121k;

    /* renamed from: l  reason: collision with root package name */
    public final a f2122l;

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            m.this.c();
        }
    }

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public m(Context context, h hVar, View view, boolean z10) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, hVar, z10);
    }

    public final l a() {
        boolean z10;
        l rVar;
        if (this.f2120j == null) {
            Context context = this.f2112a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                rVar = new e(this.f2112a, this.f2116f, this.f2114d, this.f2115e, this.c);
            } else {
                Context context2 = this.f2112a;
                h hVar = this.f2113b;
                rVar = new r(this.f2114d, this.f2115e, context2, this.f2116f, hVar, this.c);
            }
            rVar.m(this.f2113b);
            rVar.s(this.f2122l);
            rVar.o(this.f2116f);
            rVar.e(this.f2119i);
            rVar.p(this.f2118h);
            rVar.q(this.f2117g);
            this.f2120j = rVar;
        }
        return this.f2120j;
    }

    public final boolean b() {
        l lVar = this.f2120j;
        if (lVar != null && lVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f2120j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2121k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        l a10 = a();
        a10.t(z11);
        if (z10) {
            int i12 = this.f2117g;
            View view = this.f2116f;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if ((Gravity.getAbsoluteGravity(i12, f0.e.d(view)) & 7) == 5) {
                i10 -= this.f2116f.getWidth();
            }
            a10.r(i10);
            a10.u(i11);
            int i13 = (int) ((this.f2112a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f2111a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.show();
    }

    public m(int i10, int i11, Context context, View view, h hVar, boolean z10) {
        this.f2117g = 8388611;
        this.f2122l = new a();
        this.f2112a = context;
        this.f2113b = hVar;
        this.f2116f = view;
        this.c = z10;
        this.f2114d = i10;
        this.f2115e = i11;
    }
}
