package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* loaded from: classes.dex */
public class ListPopupWindow implements androidx.appcompat.view.menu.q {
    public static final Method A;
    public static final Method B;
    public static final Method C;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2313a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f2314b;
    public b0 c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2315d;

    /* renamed from: e  reason: collision with root package name */
    public int f2316e;

    /* renamed from: f  reason: collision with root package name */
    public int f2317f;

    /* renamed from: g  reason: collision with root package name */
    public int f2318g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2319h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2320i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2321j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2322k;

    /* renamed from: l  reason: collision with root package name */
    public int f2323l;

    /* renamed from: m  reason: collision with root package name */
    public final int f2324m;

    /* renamed from: n  reason: collision with root package name */
    public d f2325n;

    /* renamed from: o  reason: collision with root package name */
    public View f2326o;

    /* renamed from: p  reason: collision with root package name */
    public AdapterView.OnItemClickListener f2327p;

    /* renamed from: q  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2328q;

    /* renamed from: r  reason: collision with root package name */
    public final g f2329r;

    /* renamed from: s  reason: collision with root package name */
    public final f f2330s;

    /* renamed from: t  reason: collision with root package name */
    public final e f2331t;

    /* renamed from: u  reason: collision with root package name */
    public final c f2332u;

    /* renamed from: v  reason: collision with root package name */
    public final Handler f2333v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f2334w;

    /* renamed from: x  reason: collision with root package name */
    public Rect f2335x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2336y;

    /* renamed from: z  reason: collision with root package name */
    public final l f2337z;

    /* loaded from: classes.dex */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b0 b0Var = ListPopupWindow.this.c;
            if (b0Var != null) {
                b0Var.setListSelectionHidden(true);
                b0Var.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (listPopupWindow.a()) {
                listPopupWindow.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l lVar;
            int action = motionEvent.getAction();
            int x4 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (action == 0 && (lVar = listPopupWindow.f2337z) != null && lVar.isShowing() && x4 >= 0) {
                l lVar2 = listPopupWindow.f2337z;
                if (x4 < lVar2.getWidth() && y10 >= 0 && y10 < lVar2.getHeight()) {
                    listPopupWindow.f2333v.postDelayed(listPopupWindow.f2329r, 250L);
                    return false;
                }
            }
            if (action == 1) {
                listPopupWindow.f2333v.removeCallbacks(listPopupWindow.f2329r);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            b0 b0Var = listPopupWindow.c;
            if (b0Var != null) {
                WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
                if (f0.g.b(b0Var) && listPopupWindow.c.getCount() > listPopupWindow.c.getChildCount() && listPopupWindow.c.getChildCount() <= listPopupWindow.f2324m) {
                    listPopupWindow.f2337z.setInputMethodMode(2);
                    listPopupWindow.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    @Override // androidx.appcompat.view.menu.q
    public final boolean a() {
        return this.f2337z.isShowing();
    }

    public final int b() {
        return this.f2317f;
    }

    public final void d(int i10) {
        this.f2317f = i10;
    }

    @Override // androidx.appcompat.view.menu.q
    public final void dismiss() {
        l lVar = this.f2337z;
        lVar.dismiss();
        lVar.setContentView(null);
        this.c = null;
        this.f2333v.removeCallbacks(this.f2329r);
    }

    public final Drawable getBackground() {
        return this.f2337z.getBackground();
    }

    public final void h(Drawable drawable) {
        this.f2337z.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.q
    public final b0 i() {
        return this.c;
    }

    public final void j(int i10) {
        this.f2318g = i10;
        this.f2320i = true;
    }

    public final int m() {
        if (!this.f2320i) {
            return 0;
        }
        return this.f2318g;
    }

    public void n(ListAdapter listAdapter) {
        d dVar = this.f2325n;
        if (dVar == null) {
            this.f2325n = new d();
        } else {
            ListAdapter listAdapter2 = this.f2314b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f2314b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2325n);
        }
        b0 b0Var = this.c;
        if (b0Var != null) {
            b0Var.setAdapter(this.f2314b);
        }
    }

    public b0 o(Context context, boolean z10) {
        return new b0(context, z10);
    }

    public final void p(int i10) {
        Drawable background = this.f2337z.getBackground();
        if (background != null) {
            Rect rect = this.f2334w;
            background.getPadding(rect);
            this.f2316e = rect.left + rect.right + i10;
            return;
        }
        this.f2316e = i10;
    }

    @Override // androidx.appcompat.view.menu.q
    public final void show() {
        int i10;
        boolean z10;
        int a10;
        int makeMeasureSpec;
        int i11;
        int i12;
        boolean z11;
        b0 b0Var;
        int i13;
        int i14;
        b0 b0Var2 = this.c;
        l lVar = this.f2337z;
        Context context = this.f2313a;
        if (b0Var2 == null) {
            b0 o10 = o(context, !this.f2336y);
            this.c = o10;
            o10.setAdapter(this.f2314b);
            this.c.setOnItemClickListener(this.f2327p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new e0(this));
            this.c.setOnScrollListener(this.f2331t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2328q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            lVar.setContentView(this.c);
        } else {
            ViewGroup viewGroup = (ViewGroup) lVar.getContentView();
        }
        Drawable background = lVar.getBackground();
        int i15 = 0;
        Rect rect = this.f2334w;
        if (background != null) {
            background.getPadding(rect);
            int i16 = rect.top;
            i10 = rect.bottom + i16;
            if (!this.f2320i) {
                this.f2318g = -i16;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (lVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.f2326o;
        int i17 = this.f2318g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = B;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(lVar, view, Integer.valueOf(i17), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                }
            }
            a10 = lVar.getMaxAvailableHeight(view, i17);
        } else {
            a10 = a.a(lVar, view, i17, z10);
        }
        int i18 = this.f2315d;
        if (i18 == -1) {
            i12 = a10 + i10;
        } else {
            int i19 = this.f2316e;
            if (i19 != -2) {
                if (i19 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), SlideAtom.USES_MASTER_SLIDE_ID);
            }
            int a11 = this.c.a(makeMeasureSpec, a10 + 0);
            if (a11 > 0) {
                i11 = this.c.getPaddingBottom() + this.c.getPaddingTop() + i10 + 0;
            } else {
                i11 = 0;
            }
            i12 = a11 + i11;
        }
        if (lVar.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        b1.k.d(lVar, this.f2319h);
        if (lVar.isShowing()) {
            View view2 = this.f2326o;
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            if (!f0.g.b(view2)) {
                return;
            }
            int i20 = this.f2316e;
            if (i20 == -1) {
                i20 = -1;
            } else if (i20 == -2) {
                i20 = this.f2326o.getWidth();
            }
            if (i18 == -1) {
                if (z11) {
                    i18 = i12;
                } else {
                    i18 = -1;
                }
                if (z11) {
                    if (this.f2316e == -1) {
                        i14 = -1;
                    } else {
                        i14 = 0;
                    }
                    lVar.setWidth(i14);
                    lVar.setHeight(0);
                } else {
                    if (this.f2316e == -1) {
                        i15 = -1;
                    }
                    lVar.setWidth(i15);
                    lVar.setHeight(-1);
                }
            } else if (i18 == -2) {
                i18 = i12;
            }
            lVar.setOutsideTouchable(true);
            View view3 = this.f2326o;
            int i21 = this.f2317f;
            int i22 = this.f2318g;
            if (i20 < 0) {
                i20 = -1;
            }
            if (i18 < 0) {
                i13 = -1;
            } else {
                i13 = i18;
            }
            lVar.update(view3, i21, i22, i20, i13);
            return;
        }
        int i23 = this.f2316e;
        if (i23 == -1) {
            i23 = -1;
        } else if (i23 == -2) {
            i23 = this.f2326o.getWidth();
        }
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = i12;
        }
        lVar.setWidth(i23);
        lVar.setHeight(i18);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = A;
            if (method2 != null) {
                try {
                    method2.invoke(lVar, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            b.b(lVar, true);
        }
        lVar.setOutsideTouchable(true);
        lVar.setTouchInterceptor(this.f2330s);
        if (this.f2322k) {
            b1.k.c(lVar, this.f2321j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = C;
            if (method3 != null) {
                try {
                    method3.invoke(lVar, this.f2335x);
                } catch (Exception unused3) {
                }
            }
        } else {
            b.a(lVar, this.f2335x);
        }
        b1.j.a(lVar, this.f2326o, this.f2317f, this.f2318g, this.f2323l);
        this.c.setSelection(-1);
        if ((!this.f2336y || this.c.isInTouchMode()) && (b0Var = this.c) != null) {
            b0Var.setListSelectionHidden(true);
            b0Var.requestLayout();
        }
        if (!this.f2336y) {
            this.f2333v.post(this.f2332u);
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2315d = -2;
        this.f2316e = -2;
        this.f2319h = 1002;
        this.f2323l = 0;
        this.f2324m = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2329r = new g();
        this.f2330s = new f();
        this.f2331t = new e();
        this.f2332u = new c();
        this.f2334w = new Rect();
        this.f2313a = context;
        this.f2333v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f19444q, i10, i11);
        this.f2317f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2318g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2320i = true;
        }
        obtainStyledAttributes.recycle();
        l lVar = new l(context, attributeSet, i10, i11);
        this.f2337z = lVar;
        lVar.setInputMethodMode(1);
    }

    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z10 = true;
            if (i10 == 1) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (listPopupWindow.f2337z.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (!z10 && listPopupWindow.f2337z.getContentView() != null) {
                    Handler handler = listPopupWindow.f2333v;
                    g gVar = listPopupWindow.f2329r;
                    handler.removeCallbacks(gVar);
                    gVar.run();
                }
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
