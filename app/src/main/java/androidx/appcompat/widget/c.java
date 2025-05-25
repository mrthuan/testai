package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import x0.b;

/* compiled from: ActionMenuPresenter.java */
/* loaded from: classes.dex */
public final class c extends androidx.appcompat.view.menu.b implements b.a {

    /* renamed from: j  reason: collision with root package name */
    public d f2530j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f2531k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2532l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2533m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2534n;

    /* renamed from: o  reason: collision with root package name */
    public int f2535o;

    /* renamed from: p  reason: collision with root package name */
    public int f2536p;

    /* renamed from: q  reason: collision with root package name */
    public int f2537q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2538r;

    /* renamed from: s  reason: collision with root package name */
    public final SparseBooleanArray f2539s;

    /* renamed from: t  reason: collision with root package name */
    public e f2540t;

    /* renamed from: u  reason: collision with root package name */
    public a f2541u;

    /* renamed from: v  reason: collision with root package name */
    public RunnableC0009c f2542v;

    /* renamed from: w  reason: collision with root package name */
    public b f2543w;

    /* renamed from: x  reason: collision with root package name */
    public final f f2544x;

    /* renamed from: y  reason: collision with root package name */
    public int f2545y;

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.m {
        public a(Context context, androidx.appcompat.view.menu.s sVar, View view) {
            super(context, sVar, view, false);
            if (!((sVar.A.f2098x & 32) == 32)) {
                View view2 = c.this.f2530j;
                this.f2116f = view2 == null ? (View) c.this.f2007h : view2;
            }
            f fVar = c.this.f2544x;
            this.f2119i = fVar;
            androidx.appcompat.view.menu.l lVar = this.f2120j;
            if (lVar != null) {
                lVar.e(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public final void c() {
            c cVar = c.this;
            cVar.f2541u = null;
            cVar.f2545y = 0;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0009c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final e f2548a;

        public RunnableC0009c(e eVar) {
            this.f2548a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.a aVar;
            c cVar = c.this;
            androidx.appcompat.view.menu.h hVar = cVar.c;
            if (hVar != null && (aVar = hVar.f2054e) != null) {
                aVar.b(hVar);
            }
            View view = (View) cVar.f2007h;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f2548a;
                boolean z10 = true;
                if (!eVar.b()) {
                    if (eVar.f2116f == null) {
                        z10 = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z10) {
                    cVar.f2540t = eVar;
                }
            }
            cVar.f2542v = null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter.java */
        /* loaded from: classes.dex */
        public class a extends d0 {
            public a(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.d0
            public final androidx.appcompat.view.menu.q b() {
                e eVar = c.this.f2540t;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // androidx.appcompat.widget.d0
            public final boolean c() {
                c.this.o();
                return true;
            }

            @Override // androidx.appcompat.widget.d0
            public final boolean d() {
                c cVar = c.this;
                if (cVar.f2542v != null) {
                    return false;
                }
                cVar.i();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            x0.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.o();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.m {
        public e(Context context, androidx.appcompat.view.menu.h hVar, d dVar) {
            super(context, hVar, dVar, true);
            this.f2117g = 8388613;
            f fVar = c.this.f2544x;
            this.f2119i = fVar;
            androidx.appcompat.view.menu.l lVar = this.f2120j;
            if (lVar != null) {
                lVar.e(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public final void c() {
            c cVar = c.this;
            androidx.appcompat.view.menu.h hVar = cVar.c;
            if (hVar != null) {
                hVar.c(true);
            }
            cVar.f2540t = null;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class f implements n.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
            if (hVar instanceof androidx.appcompat.view.menu.s) {
                hVar.k().c(false);
            }
            n.a aVar = c.this.f2004e;
            if (aVar != null) {
                aVar.b(hVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            c cVar = c.this;
            if (hVar == cVar.c) {
                return false;
            }
            cVar.f2545y = ((androidx.appcompat.view.menu.s) hVar).A.f2076a;
            n.a aVar = cVar.f2004e;
            if (aVar == null) {
                return false;
            }
            return aVar.c(hVar);
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2554a;

        /* compiled from: ActionMenuPresenter.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2554a);
        }

        public g(Parcel parcel) {
            this.f2554a = parcel.readInt();
        }
    }

    public c(Context context) {
        super(context);
        this.f2539s = new SparseBooleanArray();
        this.f2544x = new f();
    }

    public final View a(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        o.a aVar;
        View actionView = jVar.getActionView();
        int i10 = 0;
        if (actionView == null || jVar.e()) {
            if (view instanceof o.a) {
                aVar = (o.a) view;
            } else {
                aVar = (o.a) this.f2003d.inflate(this.f2006g, viewGroup, false);
            }
            aVar.c(jVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f2007h);
            if (this.f2543w == null) {
                this.f2543w = new b();
            }
            actionMenuItemView.setPopupCallback(this.f2543w);
            actionView = (View) aVar;
        }
        if (jVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
        i();
        a aVar = this.f2541u;
        if (aVar != null && aVar.b()) {
            aVar.f2120j.dismiss();
        }
        n.a aVar2 = this.f2004e;
        if (aVar2 != null) {
            aVar2.b(hVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void c(boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        androidx.appcompat.view.menu.j jVar;
        ViewGroup viewGroup = (ViewGroup) this.f2007h;
        ArrayList<androidx.appcompat.view.menu.j> arrayList = null;
        boolean z13 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.h hVar = this.c;
            if (hVar != null) {
                hVar.i();
                ArrayList<androidx.appcompat.view.menu.j> l10 = this.c.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    androidx.appcompat.view.menu.j jVar2 = l10.get(i11);
                    if ((jVar2.f2098x & 32) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof o.a) {
                            jVar = ((o.a) childAt).getItemData();
                        } else {
                            jVar = null;
                        }
                        View a10 = a(jVar2, childAt, viewGroup);
                        if (jVar2 != jVar) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.f2007h).addView(a10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f2530j) {
                    z11 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z11 = true;
                }
                if (!z11) {
                    i10++;
                }
            }
        }
        ((View) this.f2007h).requestLayout();
        androidx.appcompat.view.menu.h hVar2 = this.c;
        if (hVar2 != null) {
            hVar2.i();
            ArrayList<androidx.appcompat.view.menu.j> arrayList2 = hVar2.f2058i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                x0.b bVar = arrayList2.get(i12).A;
                if (bVar != null) {
                    bVar.f31420b = this;
                }
            }
        }
        androidx.appcompat.view.menu.h hVar3 = this.c;
        if (hVar3 != null) {
            hVar3.i();
            arrayList = hVar3.f2059j;
        }
        if (this.f2533m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z13 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z13 = true;
            }
        }
        if (z13) {
            if (this.f2530j == null) {
                this.f2530j = new d(this.f2001a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2530j.getParent();
            if (viewGroup3 != this.f2007h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2530j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2007h;
                d dVar = this.f2530j;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
                cVar.f2209a = true;
                actionMenuView.addView(dVar, cVar);
            }
        } else {
            d dVar2 = this.f2530j;
            if (dVar2 != null) {
                ViewParent parent = dVar2.getParent();
                androidx.appcompat.view.menu.o oVar = this.f2007h;
                if (parent == oVar) {
                    ((ViewGroup) oVar).removeView(this.f2530j);
                }
            }
        }
        ((ActionMenuView) this.f2007h).setOverflowReserved(this.f2533m);
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean d() {
        int i10;
        ArrayList<androidx.appcompat.view.menu.j> arrayList;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        c cVar = this;
        androidx.appcompat.view.menu.h hVar = cVar.c;
        if (hVar != null) {
            arrayList = hVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = cVar.f2537q;
        int i13 = cVar.f2536p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f2007h;
        int i14 = 0;
        boolean z18 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            androidx.appcompat.view.menu.j jVar = arrayList.get(i14);
            int i17 = jVar.f2099y;
            if ((i17 & 2) == 2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                i15++;
            } else {
                if ((i17 & 1) == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i16++;
                } else {
                    z18 = true;
                }
            }
            if (cVar.f2538r && jVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (cVar.f2533m && (z18 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = cVar.f2539s;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            androidx.appcompat.view.menu.j jVar2 = arrayList.get(i19);
            int i21 = jVar2.f2099y;
            if ((i21 & 2) == i11) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i22 = jVar2.f2077b;
            if (z11) {
                View a10 = cVar.a(jVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                jVar2.g(z10);
            } else {
                if ((i21 & 1) == z10) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    boolean z19 = sparseBooleanArray.get(i22);
                    if ((i18 > 0 || z19) && i13 > 0) {
                        z13 = z10;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        View a11 = cVar.a(jVar2, null, viewGroup);
                        a11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a11.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i20 == 0) {
                            i20 = measuredWidth2;
                        }
                        if (i13 + i20 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 &= z15;
                    }
                    if (z13 && i22 != 0) {
                        sparseBooleanArray.put(i22, true);
                    } else if (z19) {
                        sparseBooleanArray.put(i22, false);
                        for (int i23 = 0; i23 < i19; i23++) {
                            androidx.appcompat.view.menu.j jVar3 = arrayList.get(i23);
                            if (jVar3.f2077b == i22) {
                                if ((jVar3.f2098x & 32) == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i18++;
                                }
                                jVar3.g(false);
                            }
                        }
                    }
                    if (z13) {
                        i18--;
                    }
                    jVar2.g(z13);
                } else {
                    jVar2.g(false);
                    i19++;
                    i11 = 2;
                    cVar = this;
                    z10 = true;
                }
            }
            i19++;
            i11 = 2;
            cVar = this;
            z10 = true;
        }
        return z10;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void g(Context context, androidx.appcompat.view.menu.h hVar) {
        this.f2002b = context;
        LayoutInflater.from(context);
        this.c = hVar;
        Resources resources = context.getResources();
        if (!this.f2534n) {
            this.f2533m = true;
        }
        int i10 = 2;
        this.f2535o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
            if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                if (i11 >= 360) {
                    i10 = 3;
                }
            } else {
                i10 = 4;
            }
        } else {
            i10 = 5;
        }
        this.f2537q = i10;
        int i13 = this.f2535o;
        if (this.f2533m) {
            if (this.f2530j == null) {
                d dVar = new d(this.f2001a);
                this.f2530j = dVar;
                if (this.f2532l) {
                    dVar.setImageDrawable(this.f2531k);
                    this.f2531k = null;
                    this.f2532l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2530j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f2530j.getMeasuredWidth();
        } else {
            this.f2530j = null;
        }
        this.f2536p = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void h(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i10 = ((g) parcelable).f2554a) > 0 && (findItem = this.c.findItem(i10)) != null) {
            j((androidx.appcompat.view.menu.s) findItem.getSubMenu());
        }
    }

    public final boolean i() {
        androidx.appcompat.view.menu.o oVar;
        RunnableC0009c runnableC0009c = this.f2542v;
        if (runnableC0009c != null && (oVar = this.f2007h) != null) {
            ((View) oVar).removeCallbacks(runnableC0009c);
            this.f2542v = null;
            return true;
        }
        e eVar = this.f2540t;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f2120j.dismiss();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    @Override // androidx.appcompat.view.menu.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(androidx.appcompat.view.menu.s r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            androidx.appcompat.view.menu.h r2 = r0.f2146z
            androidx.appcompat.view.menu.h r3 = r8.c
            if (r2 == r3) goto L13
            r0 = r2
            androidx.appcompat.view.menu.s r0 = (androidx.appcompat.view.menu.s) r0
            goto L9
        L13:
            androidx.appcompat.view.menu.o r2 = r8.f2007h
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = r1
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.o.a
            if (r6 == 0) goto L35
            r6 = r5
            androidx.appcompat.view.menu.o$a r6 = (androidx.appcompat.view.menu.o.a) r6
            androidx.appcompat.view.menu.j r6 = r6.getItemData()
            androidx.appcompat.view.menu.j r7 = r0.A
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            androidx.appcompat.view.menu.j r0 = r9.A
            int r0 = r0.f2076a
            r8.f2545y = r0
            int r0 = r9.size()
            r2 = r1
        L47:
            r3 = 1
            if (r2 >= r0) goto L5f
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5c
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5c
            r0 = r3
            goto L60
        L5c:
            int r2 = r2 + 1
            goto L47
        L5f:
            r0 = r1
        L60:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r4 = r8.f2002b
            r2.<init>(r4, r9, r5)
            r8.f2541u = r2
            r2.f2118h = r0
            androidx.appcompat.view.menu.l r2 = r2.f2120j
            if (r2 == 0) goto L72
            r2.p(r0)
        L72:
            androidx.appcompat.widget.c$a r0 = r8.f2541u
            boolean r2 = r0.b()
            if (r2 == 0) goto L7c
        L7a:
            r1 = r3
            goto L85
        L7c:
            android.view.View r2 = r0.f2116f
            if (r2 != 0) goto L81
            goto L85
        L81:
            r0.d(r1, r1, r1, r1)
            goto L7a
        L85:
            if (r1 == 0) goto L8f
            androidx.appcompat.view.menu.n$a r0 = r8.f2004e
            if (r0 == 0) goto L8e
            r0.c(r9)
        L8e:
            return r3
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.j(androidx.appcompat.view.menu.s):boolean");
    }

    @Override // androidx.appcompat.view.menu.n
    public final Parcelable k() {
        g gVar = new g();
        gVar.f2554a = this.f2545y;
        return gVar;
    }

    public final boolean m() {
        e eVar = this.f2540t;
        if (eVar != null && eVar.b()) {
            return true;
        }
        return false;
    }

    public final void n(boolean z10) {
        if (z10) {
            n.a aVar = this.f2004e;
            if (aVar != null) {
                aVar.c(this.c);
                return;
            }
            return;
        }
        androidx.appcompat.view.menu.h hVar = this.c;
        if (hVar != null) {
            hVar.c(false);
        }
    }

    public final boolean o() {
        androidx.appcompat.view.menu.h hVar;
        if (this.f2533m && !m() && (hVar = this.c) != null && this.f2007h != null && this.f2542v == null) {
            hVar.i();
            if (!hVar.f2059j.isEmpty()) {
                RunnableC0009c runnableC0009c = new RunnableC0009c(new e(this.f2002b, this.c, this.f2530j));
                this.f2542v = runnableC0009c;
                ((View) this.f2007h).post(runnableC0009c);
                return true;
            }
            return false;
        }
        return false;
    }
}
