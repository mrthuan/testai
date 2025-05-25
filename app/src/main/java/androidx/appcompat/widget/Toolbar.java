package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import l.a;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements x0.i {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList<View> D;
    public final ArrayList<View> E;
    public final int[] F;
    public final x0.l G;
    public ArrayList<MenuItem> H;
    public h I;
    public final a J;
    public w0 K;
    public androidx.appcompat.widget.c L;
    public f M;
    public n.a N;
    public h.a O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final b T;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f2443a;

    /* renamed from: b  reason: collision with root package name */
    public AppCompatTextView f2444b;
    public AppCompatTextView c;

    /* renamed from: d  reason: collision with root package name */
    public AppCompatImageButton f2445d;

    /* renamed from: e  reason: collision with root package name */
    public AppCompatImageView f2446e;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable f2447f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f2448g;

    /* renamed from: h  reason: collision with root package name */
    public AppCompatImageButton f2449h;

    /* renamed from: i  reason: collision with root package name */
    public View f2450i;

    /* renamed from: j  reason: collision with root package name */
    public Context f2451j;

    /* renamed from: k  reason: collision with root package name */
    public int f2452k;

    /* renamed from: l  reason: collision with root package name */
    public int f2453l;

    /* renamed from: m  reason: collision with root package name */
    public int f2454m;

    /* renamed from: n  reason: collision with root package name */
    public final int f2455n;

    /* renamed from: o  reason: collision with root package name */
    public final int f2456o;

    /* renamed from: p  reason: collision with root package name */
    public int f2457p;

    /* renamed from: q  reason: collision with root package name */
    public int f2458q;

    /* renamed from: r  reason: collision with root package name */
    public int f2459r;

    /* renamed from: s  reason: collision with root package name */
    public int f2460s;

    /* renamed from: t  reason: collision with root package name */
    public i0 f2461t;

    /* renamed from: u  reason: collision with root package name */
    public int f2462u;

    /* renamed from: v  reason: collision with root package name */
    public int f2463v;

    /* renamed from: w  reason: collision with root package name */
    public final int f2464w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f2465x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f2466y;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f2467z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.widget.c cVar;
            ActionMenuView actionMenuView = Toolbar.this.f2443a;
            if (actionMenuView != null && (cVar = actionMenuView.f2202t) != null) {
                cVar.o();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements h.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            h.a aVar = Toolbar.this.O;
            if (aVar != null && aVar.a(hVar, menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public final void b(androidx.appcompat.view.menu.h hVar) {
            boolean z10;
            Toolbar toolbar = Toolbar.this;
            androidx.appcompat.widget.c cVar = toolbar.f2443a.f2202t;
            if (cVar != null && cVar.m()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                Iterator<x0.n> it = toolbar.G.f31462b.iterator();
                while (it.hasNext()) {
                    it.next().d(hVar);
                }
            }
            h.a aVar = toolbar.O;
            if (aVar != null) {
                aVar.b(hVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.view.menu.j jVar;
            f fVar = Toolbar.this.M;
            if (fVar == null) {
                jVar = null;
            } else {
                jVar = fVar.f2473b;
            }
            if (jVar != null) {
                jVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new androidx.activity.o(runnable, 1);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
    }

    /* loaded from: classes.dex */
    public static class i extends c1.a {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2475d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new i[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z10;
            this.c = parcel.readInt();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2475d = z10;
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeInt(this.c);
            parcel.writeInt(this.f2475d ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public static g g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof a.C0274a) {
            return new g((a.C0274a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new q.f(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return x0.h.b(marginLayoutParams) + x0.h.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10;
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        if (f0.e.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, f0.e.d(this));
        arrayList.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f2474b == 0 && r(childAt)) {
                    int i12 = gVar.f20280a;
                    WeakHashMap<View, x0.n0> weakHashMap2 = x0.f0.f31435a;
                    int d10 = f0.e.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, d10) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = d10 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f2474b == 0 && r(childAt2)) {
                int i14 = gVar2.f20280a;
                WeakHashMap<View, x0.n0> weakHashMap3 = x0.f0.f31435a;
                int d11 = f0.e.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, d11) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = d11 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // x0.i
    public final void addMenuProvider(x0.n nVar) {
        x0.l lVar = this.G;
        lVar.f31462b.add(nVar);
        lVar.f31461a.run();
    }

    public final void b(View view, boolean z10) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = new g();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = g(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f2474b = 1;
        if (z10 && this.f2450i != null) {
            view.setLayoutParams(gVar);
            this.E.add(view);
            return;
        }
        addView(view, gVar);
    }

    public final void c() {
        if (this.f2449h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f2449h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f2447f);
            this.f2449h.setContentDescription(this.f2448g);
            g gVar = new g();
            gVar.f20280a = (this.f2455n & 112) | 8388611;
            gVar.f2474b = 2;
            this.f2449h.setLayoutParams(gVar);
            this.f2449h.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof g)) {
            return true;
        }
        return false;
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f2443a;
        if (actionMenuView.f2198p == null) {
            androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new f();
            }
            this.f2443a.setExpandedActionViewsExclusive(true);
            hVar.b(this.M, this.f2451j);
            s();
        }
    }

    public final void e() {
        if (this.f2443a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f2443a = actionMenuView;
            actionMenuView.setPopupTheme(this.f2452k);
            this.f2443a.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f2443a;
            n.a aVar = this.N;
            c cVar = new c();
            actionMenuView2.f2203u = aVar;
            actionMenuView2.f2204v = cVar;
            g gVar = new g();
            gVar.f20280a = (this.f2455n & 112) | 8388613;
            this.f2443a.setLayoutParams(gVar);
            b(this.f2443a, false);
        }
    }

    public final void f() {
        if (this.f2445d == null) {
            this.f2445d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVar = new g();
            gVar.f20280a = (this.f2455n & 112) | 8388611;
            this.f2445d.setLayoutParams(gVar);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f2449h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f2449h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        i0 i0Var = this.f2461t;
        if (i0Var != null) {
            if (i0Var.f2607g) {
                return i0Var.f2602a;
            }
            return i0Var.f2603b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f2463v;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i10;
    }

    public int getContentInsetLeft() {
        i0 i0Var = this.f2461t;
        if (i0Var != null) {
            return i0Var.f2602a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        i0 i0Var = this.f2461t;
        if (i0Var != null) {
            return i0Var.f2603b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        i0 i0Var = this.f2461t;
        if (i0Var != null) {
            if (i0Var.f2607g) {
                return i0Var.f2603b;
            }
            return i0Var.f2602a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f2462u;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i10;
    }

    public int getCurrentContentInsetEnd() {
        boolean z10;
        androidx.appcompat.view.menu.h hVar;
        ActionMenuView actionMenuView = this.f2443a;
        if (actionMenuView != null && (hVar = actionMenuView.f2198p) != null && hVar.hasVisibleItems()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.max(getContentInsetEnd(), Math.max(this.f2463v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        if (f0.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        if (f0.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f2462u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f2446e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f2446e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f2443a.getMenu();
    }

    public View getNavButtonView() {
        return this.f2445d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f2445d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f2445d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f2443a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f2451j;
    }

    public int getPopupTheme() {
        return this.f2452k;
    }

    public CharSequence getSubtitle() {
        return this.f2466y;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.f2465x;
    }

    public int getTitleMarginBottom() {
        return this.f2460s;
    }

    public int getTitleMarginEnd() {
        return this.f2458q;
    }

    public int getTitleMarginStart() {
        return this.f2457p;
    }

    public int getTitleMarginTop() {
        return this.f2459r;
    }

    public final TextView getTitleTextView() {
        return this.f2444b;
    }

    public x getWrapper() {
        if (this.K == null) {
            this.K = new w0(this, true);
        }
        return this.K;
    }

    public final int h(View view, int i10) {
        int i11;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = gVar.f20280a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f2464w & 112;
        }
        if (i12 != 48) {
            if (i12 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    public void k(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void l() {
        Iterator<MenuItem> it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<x0.n> it2 = this.G.f31462b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean m(View view) {
        if (view.getParent() != this && !this.E.contains(view)) {
            return false;
        }
        return true;
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + max;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0292 A[LOOP:0: B:102:0x0290->B:103:0x0292, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ae A[LOOP:1: B:105:0x02ac->B:106:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cd A[LOOP:2: B:108:0x02cb->B:109:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031b A[LOOP:3: B:117:0x0319->B:118:0x031b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.h hVar;
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f5506a);
        ActionMenuView actionMenuView = this.f2443a;
        if (actionMenuView != null) {
            hVar = actionMenuView.f2198p;
        } else {
            hVar = null;
        }
        int i10 = iVar.c;
        if (i10 != 0 && this.M != null && hVar != null && (findItem = hVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f2475d) {
            b bVar = this.T;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f2461t == null) {
            this.f2461t = new i0();
        }
        i0 i0Var = this.f2461t;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != i0Var.f2607g) {
            i0Var.f2607g = z10;
            if (i0Var.f2608h) {
                if (z10) {
                    int i11 = i0Var.f2604d;
                    if (i11 == Integer.MIN_VALUE) {
                        i11 = i0Var.f2605e;
                    }
                    i0Var.f2602a = i11;
                    int i12 = i0Var.c;
                    if (i12 == Integer.MIN_VALUE) {
                        i12 = i0Var.f2606f;
                    }
                    i0Var.f2603b = i12;
                    return;
                }
                int i13 = i0Var.c;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = i0Var.f2605e;
                }
                i0Var.f2602a = i13;
                int i14 = i0Var.f2604d;
                if (i14 == Integer.MIN_VALUE) {
                    i14 = i0Var.f2606f;
                }
                i0Var.f2603b = i14;
                return;
            }
            i0Var.f2602a = i0Var.f2605e;
            i0Var.f2603b = i0Var.f2606f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z10;
        androidx.appcompat.view.menu.j jVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.M;
        if (fVar != null && (jVar = fVar.f2473b) != null) {
            iVar.c = jVar.f2076a;
        }
        ActionMenuView actionMenuView = this.f2443a;
        boolean z11 = false;
        if (actionMenuView != null) {
            androidx.appcompat.widget.c cVar = actionMenuView.f2202t;
            if (cVar != null && cVar.m()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        iVar.f2475d = z11;
        return iVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // x0.i
    public final void removeMenuProvider(x0.n nVar) {
        this.G.a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r4.S != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L55
            android.window.OnBackInvokedDispatcher r0 = androidx.appcompat.widget.Toolbar.e.a(r4)
            androidx.appcompat.widget.Toolbar$f r1 = r4.M
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            androidx.appcompat.view.menu.j r1 = r1.f2473b
            if (r1 == 0) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r3
        L17:
            if (r1 == 0) goto L28
            if (r0 == 0) goto L28
            java.util.WeakHashMap<android.view.View, x0.n0> r1 = x0.f0.f31435a
            boolean r1 = x0.f0.g.b(r4)
            if (r1 == 0) goto L28
            boolean r1 = r4.S
            if (r1 == 0) goto L28
            goto L29
        L28:
            r2 = r3
        L29:
            if (r2 == 0) goto L47
            android.window.OnBackInvokedDispatcher r1 = r4.R
            if (r1 != 0) goto L47
            android.window.OnBackInvokedCallback r1 = r4.Q
            if (r1 != 0) goto L3f
            androidx.activity.b r1 = new androidx.activity.b
            r2 = 2
            r1.<init>(r4, r2)
            android.window.OnBackInvokedCallback r1 = androidx.appcompat.widget.Toolbar.e.b(r1)
            r4.Q = r1
        L3f:
            android.window.OnBackInvokedCallback r1 = r4.Q
            androidx.appcompat.widget.Toolbar.e.c(r0, r1)
            r4.R = r0
            goto L55
        L47:
            if (r2 != 0) goto L55
            android.window.OnBackInvokedDispatcher r0 = r4.R
            if (r0 == 0) goto L55
            android.window.OnBackInvokedCallback r1 = r4.Q
            androidx.appcompat.widget.Toolbar.e.d(r0, r1)
            r0 = 0
            r4.R = r0
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.s():void");
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            s();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(m.a.a(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = SlideAtom.USES_MASTER_SLIDE_ID;
        }
        if (i10 != this.f2463v) {
            this.f2463v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = SlideAtom.USES_MASTER_SLIDE_ID;
        }
        if (i10 != this.f2462u) {
            this.f2462u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(m.a.a(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(m.a.a(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f2445d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f2443a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f2452k != i10) {
            this.f2452k = i10;
            if (i10 == 0) {
                this.f2451j = getContext();
            } else {
                this.f2451j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f2460s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f2458q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f2457p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f2459r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    /* loaded from: classes.dex */
    public static class g extends a.C0274a {

        /* renamed from: b  reason: collision with root package name */
        public int f2474b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2474b = 0;
        }

        public g() {
            this.f2474b = 0;
            this.f20280a = 8388627;
        }

        public g(g gVar) {
            super((a.C0274a) gVar);
            this.f2474b = 0;
            this.f2474b = gVar.f2474b;
        }

        public g(a.C0274a c0274a) {
            super(c0274a);
            this.f2474b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2474b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2474b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f2449h;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f2449h.setImageDrawable(drawable);
            return;
        }
        AppCompatImageButton appCompatImageButton = this.f2449h;
        if (appCompatImageButton != null) {
            appCompatImageButton.setImageDrawable(this.f2447f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2446e == null) {
                this.f2446e = new AppCompatImageView(getContext());
            }
            if (!m(this.f2446e)) {
                b(this.f2446e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f2446e;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.f2446e);
                this.E.remove(this.f2446e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f2446e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2446e == null) {
            this.f2446e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f2446e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        AppCompatImageButton appCompatImageButton = this.f2445d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            x0.a(this.f2445d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f2445d)) {
                b(this.f2445d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f2445d;
            if (appCompatImageButton != null && m(appCompatImageButton)) {
                removeView(this.f2445d);
                this.E.remove(this.f2445d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f2445d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f2454m;
                if (i10 != 0) {
                    this.c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!m(this.c)) {
                b(this.c, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.c;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.c);
                this.E.remove(this.c);
            }
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f2466y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2444b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f2444b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f2444b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f2453l;
                if (i10 != 0) {
                    this.f2444b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f2467z;
                if (colorStateList != null) {
                    this.f2444b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2444b)) {
                b(this.f2444b, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f2444b;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.f2444b);
                this.E.remove(this.f2444b);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f2444b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f2465x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2467z = colorStateList;
        AppCompatTextView appCompatTextView = this.f2444b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2464w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new x0.l(new androidx.activity.k(this, 1));
        this.H = new ArrayList<>();
        this.J = new a();
        this.T = new b();
        Context context2 = getContext();
        int[] iArr = k.a.A;
        u0 m10 = u0.m(context2, attributeSet, iArr, i10, 0);
        x0.f0.n(this, context, iArr, attributeSet, m10.f2688b, i10);
        this.f2453l = m10.i(28, 0);
        this.f2454m = m10.i(19, 0);
        TypedArray typedArray = m10.f2688b;
        this.f2464w = typedArray.getInteger(0, 8388627);
        this.f2455n = typedArray.getInteger(2, 48);
        int c10 = m10.c(22, 0);
        c10 = m10.l(27) ? m10.c(27, c10) : c10;
        this.f2460s = c10;
        this.f2459r = c10;
        this.f2458q = c10;
        this.f2457p = c10;
        int c11 = m10.c(25, -1);
        if (c11 >= 0) {
            this.f2457p = c11;
        }
        int c12 = m10.c(24, -1);
        if (c12 >= 0) {
            this.f2458q = c12;
        }
        int c13 = m10.c(26, -1);
        if (c13 >= 0) {
            this.f2459r = c13;
        }
        int c14 = m10.c(23, -1);
        if (c14 >= 0) {
            this.f2460s = c14;
        }
        this.f2456o = m10.d(13, -1);
        int c15 = m10.c(9, SlideAtom.USES_MASTER_SLIDE_ID);
        int c16 = m10.c(5, SlideAtom.USES_MASTER_SLIDE_ID);
        int d10 = m10.d(7, 0);
        int d11 = m10.d(8, 0);
        if (this.f2461t == null) {
            this.f2461t = new i0();
        }
        i0 i0Var = this.f2461t;
        i0Var.f2608h = false;
        if (d10 != Integer.MIN_VALUE) {
            i0Var.f2605e = d10;
            i0Var.f2602a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            i0Var.f2606f = d11;
            i0Var.f2603b = d11;
        }
        if (c15 != Integer.MIN_VALUE || c16 != Integer.MIN_VALUE) {
            i0Var.a(c15, c16);
        }
        this.f2462u = m10.c(10, SlideAtom.USES_MASTER_SLIDE_ID);
        this.f2463v = m10.c(6, SlideAtom.USES_MASTER_SLIDE_ID);
        this.f2447f = m10.e(4);
        this.f2448g = m10.k(3);
        CharSequence k10 = m10.k(21);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m10.k(18);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.f2451j = getContext();
        setPopupTheme(m10.i(17, 0));
        Drawable e10 = m10.e(16);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k12 = m10.k(15);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e11 = m10.e(11);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k13 = m10.k(12);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        if (m10.l(29)) {
            setTitleTextColor(m10.b(29));
        }
        if (m10.l(20)) {
            setSubtitleTextColor(m10.b(20));
        }
        if (m10.l(14)) {
            k(m10.i(14, 0));
        }
        m10.n();
    }

    /* loaded from: classes.dex */
    public class f implements androidx.appcompat.view.menu.n {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f2472a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.j f2473b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.n
        public final void c(boolean z10) {
            if (this.f2473b != null) {
                androidx.appcompat.view.menu.h hVar = this.f2472a;
                boolean z11 = false;
                if (hVar != null) {
                    int size = hVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f2472a.getItem(i10) == this.f2473b) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z11) {
                    f(this.f2473b);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.n
        public final boolean d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public final boolean f(androidx.appcompat.view.menu.j jVar) {
            Toolbar toolbar = Toolbar.this;
            View view = toolbar.f2450i;
            if (view instanceof q.b) {
                ((q.b) view).d();
            }
            toolbar.removeView(toolbar.f2450i);
            toolbar.removeView(toolbar.f2449h);
            toolbar.f2450i = null;
            ArrayList<View> arrayList = toolbar.E;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar.addView(arrayList.get(size));
                } else {
                    arrayList.clear();
                    this.f2473b = null;
                    toolbar.requestLayout();
                    jVar.C = false;
                    jVar.f2088n.p(false);
                    toolbar.s();
                    return true;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.n
        public final void g(Context context, androidx.appcompat.view.menu.h hVar) {
            androidx.appcompat.view.menu.j jVar;
            androidx.appcompat.view.menu.h hVar2 = this.f2472a;
            if (hVar2 != null && (jVar = this.f2473b) != null) {
                hVar2.d(jVar);
            }
            this.f2472a = hVar;
        }

        @Override // androidx.appcompat.view.menu.n
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.n
        public final boolean j(androidx.appcompat.view.menu.s sVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public final Parcelable k() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.n
        public final boolean l(androidx.appcompat.view.menu.j jVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.f2449h.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f2449h);
                }
                toolbar.addView(toolbar.f2449h);
            }
            View actionView = jVar.getActionView();
            toolbar.f2450i = actionView;
            this.f2473b = jVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f2450i);
                }
                g gVar = new g();
                gVar.f20280a = (toolbar.f2455n & 112) | 8388611;
                gVar.f2474b = 2;
                toolbar.f2450i.setLayoutParams(gVar);
                toolbar.addView(toolbar.f2450i);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).f2474b != 2 && childAt != toolbar.f2443a) {
                    toolbar.removeViewAt(childCount);
                    toolbar.E.add(childAt);
                }
            }
            toolbar.requestLayout();
            jVar.C = true;
            jVar.f2088n.p(false);
            View view = toolbar.f2450i;
            if (view instanceof q.b) {
                ((q.b) view).b();
            }
            toolbar.s();
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public final void h(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.n
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
        }
    }
}
