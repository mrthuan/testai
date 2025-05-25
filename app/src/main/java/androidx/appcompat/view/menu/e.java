package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class e extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2011b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2012d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2013e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2014f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f2015g;

    /* renamed from: o  reason: collision with root package name */
    public View f2023o;

    /* renamed from: p  reason: collision with root package name */
    public View f2024p;

    /* renamed from: q  reason: collision with root package name */
    public int f2025q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2026r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2027s;

    /* renamed from: t  reason: collision with root package name */
    public int f2028t;

    /* renamed from: u  reason: collision with root package name */
    public int f2029u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2031w;

    /* renamed from: x  reason: collision with root package name */
    public n.a f2032x;

    /* renamed from: y  reason: collision with root package name */
    public ViewTreeObserver f2033y;

    /* renamed from: z  reason: collision with root package name */
    public PopupWindow.OnDismissListener f2034z;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f2016h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f2017i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final a f2018j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final b f2019k = new b();

    /* renamed from: l  reason: collision with root package name */
    public final c f2020l = new c();

    /* renamed from: m  reason: collision with root package name */
    public int f2021m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f2022n = 0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2030v = false;

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            e eVar = e.this;
            if (eVar.a()) {
                ArrayList arrayList = eVar.f2017i;
                if (arrayList.size() > 0 && !((d) arrayList.get(0)).f2038a.f2336y) {
                    View view = eVar.f2024p;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((d) it.next()).f2038a.show();
                        }
                        return;
                    }
                    eVar.dismiss();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class c implements f0 {
        public c() {
        }

        @Override // androidx.appcompat.widget.f0
        public final void c(h hVar, j jVar) {
            e eVar = e.this;
            d dVar = null;
            eVar.f2015g.removeCallbacksAndMessages(null);
            ArrayList arrayList = eVar.f2017i;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (hVar == ((d) arrayList.get(i10)).f2039b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            if (i11 < arrayList.size()) {
                dVar = (d) arrayList.get(i11);
            }
            eVar.f2015g.postAtTime(new f(this, dVar, jVar, hVar), hVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.f0
        public final void f(h hVar, MenuItem menuItem) {
            e.this.f2015g.removeCallbacksAndMessages(hVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final MenuPopupWindow f2038a;

        /* renamed from: b  reason: collision with root package name */
        public final h f2039b;
        public final int c;

        public d(MenuPopupWindow menuPopupWindow, h hVar, int i10) {
            this.f2038a = menuPopupWindow;
            this.f2039b = hVar;
            this.c = i10;
        }
    }

    public e(Context context, View view, int i10, int i11, boolean z10) {
        this.f2011b = context;
        this.f2023o = view;
        this.f2012d = i10;
        this.f2013e = i11;
        this.f2014f = z10;
        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
        this.f2025q = f0.e.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2015g = new Handler();
    }

    @Override // androidx.appcompat.view.menu.q
    public final boolean a() {
        ArrayList arrayList = this.f2017i;
        if (arrayList.size() <= 0 || !((d) arrayList.get(0)).f2038a.a()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void b(h hVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.f2017i;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (hVar == ((d) arrayList.get(i11)).f2039b) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < arrayList.size()) {
            ((d) arrayList.get(i12)).f2039b.c(false);
        }
        d dVar = (d) arrayList.remove(i11);
        dVar.f2039b.r(this);
        boolean z11 = this.A;
        MenuPopupWindow menuPopupWindow = dVar.f2038a;
        if (z11) {
            MenuPopupWindow.a.b(menuPopupWindow.f2337z, null);
            menuPopupWindow.f2337z.setAnimationStyle(0);
        }
        menuPopupWindow.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2025q = ((d) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.f2023o;
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            if (f0.e.d(view) == 1) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f2025q = i10;
        }
        if (size2 == 0) {
            dismiss();
            n.a aVar = this.f2032x;
            if (aVar != null) {
                aVar.b(hVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.f2033y;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f2033y.removeGlobalOnLayoutListener(this.f2018j);
                }
                this.f2033y = null;
            }
            this.f2024p.removeOnAttachStateChangeListener(this.f2019k);
            this.f2034z.onDismiss();
        } else if (z10) {
            ((d) arrayList.get(0)).f2039b.c(false);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void c(boolean z10) {
        Iterator it = this.f2017i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f2038a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((MenuAdapter) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.q
    public final void dismiss() {
        ArrayList arrayList = this.f2017i;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    d dVar = dVarArr[size];
                    if (dVar.f2038a.a()) {
                        dVar.f2038a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void e(n.a aVar) {
        this.f2032x = aVar;
    }

    @Override // androidx.appcompat.view.menu.q
    public final b0 i() {
        ArrayList arrayList = this.f2017i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f2038a.c;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean j(s sVar) {
        Iterator it = this.f2017i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (sVar == dVar.f2039b) {
                dVar.f2038a.c.requestFocus();
                return true;
            }
        }
        if (sVar.hasVisibleItems()) {
            m(sVar);
            n.a aVar = this.f2032x;
            if (aVar != null) {
                aVar.c(sVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final Parcelable k() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void m(h hVar) {
        hVar.b(this, this.f2011b);
        if (a()) {
            w(hVar);
        } else {
            this.f2016h.add(hVar);
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public final void o(View view) {
        if (this.f2023o != view) {
            this.f2023o = view;
            int i10 = this.f2021m;
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            this.f2022n = Gravity.getAbsoluteGravity(i10, f0.e.d(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f2017i;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                dVar = (d) arrayList.get(i10);
                if (!dVar.f2038a.a()) {
                    break;
                }
                i10++;
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f2039b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void p(boolean z10) {
        this.f2030v = z10;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void q(int i10) {
        if (this.f2021m != i10) {
            this.f2021m = i10;
            View view = this.f2023o;
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            this.f2022n = Gravity.getAbsoluteGravity(i10, f0.e.d(view));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public final void r(int i10) {
        this.f2026r = true;
        this.f2028t = i10;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f2034z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.q
    public final void show() {
        boolean z10;
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2016h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w((h) it.next());
        }
        arrayList.clear();
        View view = this.f2023o;
        this.f2024p = view;
        if (view != null) {
            if (this.f2033y == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2033y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2018j);
            }
            this.f2024p.addOnAttachStateChangeListener(this.f2019k);
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public final void t(boolean z10) {
        this.f2031w = z10;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void u(int i10) {
        this.f2027s = true;
        this.f2029u = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (((r0.getWidth() + r7[0]) + r3) > r8.right) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(androidx.appcompat.view.menu.h r15) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.w(androidx.appcompat.view.menu.h):void");
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            e eVar = e.this;
            ViewTreeObserver viewTreeObserver = eVar.f2033y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    eVar.f2033y = view.getViewTreeObserver();
                }
                eVar.f2033y.removeGlobalOnLayoutListener(eVar.f2018j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void h(Parcelable parcelable) {
    }
}
