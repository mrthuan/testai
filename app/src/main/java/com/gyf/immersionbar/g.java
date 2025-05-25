package com.gyf.immersionbar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.fragment.app.u;
import com.gyf.immersionbar.c;
import com.gyf.immersionbar.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ImmersionBar.java */
@TargetApi(19)
/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f13790a;

    /* renamed from: b  reason: collision with root package name */
    public final Fragment f13791b;
    public final android.app.Fragment c;

    /* renamed from: d  reason: collision with root package name */
    public Window f13792d;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f13793e;

    /* renamed from: f  reason: collision with root package name */
    public ViewGroup f13794f;

    /* renamed from: g  reason: collision with root package name */
    public g f13795g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13796h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f13797i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f13798j;

    /* renamed from: k  reason: collision with root package name */
    public b f13799k;

    /* renamed from: l  reason: collision with root package name */
    public com.gyf.immersionbar.a f13800l;

    /* renamed from: m  reason: collision with root package name */
    public int f13801m;

    /* renamed from: n  reason: collision with root package name */
    public int f13802n;

    /* renamed from: o  reason: collision with root package name */
    public d f13803o;

    /* renamed from: p  reason: collision with root package name */
    public int f13804p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f13805q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f13806r;

    /* renamed from: s  reason: collision with root package name */
    public int f13807s;

    /* renamed from: t  reason: collision with root package name */
    public int f13808t;

    /* renamed from: u  reason: collision with root package name */
    public int f13809u;

    /* renamed from: v  reason: collision with root package name */
    public int f13810v;

    /* compiled from: ImmersionBar.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13811a;

        static {
            int[] iArr = new int[BarHide.values().length];
            f13811a = iArr;
            try {
                iArr[BarHide.FLAG_HIDE_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13811a[BarHide.FLAG_HIDE_STATUS_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13811a[BarHide.FLAG_HIDE_NAVIGATION_BAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13811a[BarHide.FLAG_SHOW_BAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(Activity activity) {
        this.f13796h = false;
        this.f13797i = false;
        this.f13798j = false;
        this.f13801m = 0;
        this.f13802n = 0;
        this.f13803o = null;
        new HashMap();
        this.f13804p = 0;
        this.f13805q = false;
        this.f13806r = false;
        this.f13807s = 0;
        this.f13808t = 0;
        this.f13809u = 0;
        this.f13810v = 0;
        this.f13790a = activity;
        g(activity.getWindow());
    }

    public static boolean b(View view) {
        if (view == null) {
            return false;
        }
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (((childAt instanceof DrawerLayout) && b(childAt)) || childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static g r(Activity activity) {
        List<android.app.Fragment> fragments;
        n nVar = n.a.f13821a;
        if (activity != null) {
            StringBuilder k10 = a0.a.k(nVar.f13816a + activity.getClass().getName());
            k10.append(System.identityHashCode(activity));
            k10.append(".tag.notOnly.");
            String sb2 = k10.toString();
            boolean z10 = activity instanceof u;
            Handler handler = nVar.f13817b;
            if (z10) {
                g0 supportFragmentManager = ((u) activity).getSupportFragmentManager();
                o oVar = (o) supportFragmentManager.D(sb2);
                if (oVar == null) {
                    HashMap hashMap = nVar.f13818d;
                    oVar = (o) hashMap.get(supportFragmentManager);
                    if (oVar == null) {
                        for (Fragment fragment : supportFragmentManager.H()) {
                            if (fragment instanceof o) {
                                String str = fragment.f3692y;
                                if (str == null) {
                                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                    aVar.m(fragment);
                                    aVar.g();
                                } else if (str.contains(".tag.notOnly.")) {
                                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                                    aVar2.m(fragment);
                                    aVar2.g();
                                }
                            }
                        }
                        oVar = new o();
                        hashMap.put(supportFragmentManager, oVar);
                        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar3.c(0, oVar, sb2, 1);
                        aVar3.g();
                        handler.obtainMessage(2, supportFragmentManager).sendToTarget();
                    }
                }
                if (oVar.Y == null) {
                    oVar.Y = new i(activity);
                }
                return oVar.Y.f13812a;
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            m mVar = (m) fragmentManager.findFragmentByTag(sb2);
            if (mVar == null) {
                HashMap hashMap2 = nVar.c;
                mVar = (m) hashMap2.get(fragmentManager);
                if (mVar == null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        fragments = fragmentManager.getFragments();
                        for (android.app.Fragment fragment2 : fragments) {
                            if (fragment2 instanceof m) {
                                String tag = fragment2.getTag();
                                if (tag == null) {
                                    fragmentManager.beginTransaction().remove(fragment2).commitAllowingStateLoss();
                                } else if (tag.contains(".tag.notOnly.")) {
                                    fragmentManager.beginTransaction().remove(fragment2).commitAllowingStateLoss();
                                }
                            }
                        }
                    }
                    mVar = new m();
                    hashMap2.put(fragmentManager, mVar);
                    fragmentManager.beginTransaction().add(mVar, sb2).commitAllowingStateLoss();
                    handler.obtainMessage(1, fragmentManager).sendToTarget();
                }
            }
            if (mVar.f13815a == null) {
                mVar.f13815a = new i(activity);
            }
            return mVar.f13815a.f13812a;
        }
        nVar.getClass();
        throw new NullPointerException("activity is null");
    }

    @Override // com.gyf.immersionbar.l
    public final void a(boolean z10) {
        View findViewById = this.f13793e.findViewById(R.id.immersion_navigation_bar_view);
        if (findViewById != null) {
            this.f13800l = new com.gyf.immersionbar.a(this.f13790a);
            int paddingBottom = this.f13794f.getPaddingBottom();
            int paddingRight = this.f13794f.getPaddingRight();
            if (!z10) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
                if (!b(this.f13793e.findViewById(16908290))) {
                    if (this.f13801m == 0) {
                        this.f13801m = this.f13800l.c;
                    }
                    if (this.f13802n == 0) {
                        this.f13802n = this.f13800l.f13752d;
                    }
                    if (!this.f13799k.f13758e) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                        if (this.f13800l.c()) {
                            layoutParams.gravity = 80;
                            paddingBottom = this.f13801m;
                            layoutParams.height = paddingBottom;
                            if (this.f13799k.f13757d) {
                                paddingBottom = 0;
                            }
                            paddingRight = 0;
                        } else {
                            layoutParams.gravity = 8388613;
                            int i10 = this.f13802n;
                            layoutParams.width = i10;
                            if (this.f13799k.f13757d) {
                                i10 = 0;
                            }
                            paddingRight = i10;
                            paddingBottom = 0;
                        }
                        findViewById.setLayoutParams(layoutParams);
                    }
                    n(this.f13794f.getPaddingTop(), paddingRight, paddingBottom);
                }
            }
            paddingBottom = 0;
            paddingRight = 0;
            n(this.f13794f.getPaddingTop(), paddingRight, paddingBottom);
        }
    }

    public final void c() {
        if (this.f13795g == null) {
            this.f13795g = r(this.f13790a);
        }
        g gVar = this.f13795g;
        if (gVar != null && !gVar.f13805q) {
            gVar.f();
        }
    }

    public final void d() {
        int i10;
        int i11;
        if (!OSUtils.isEMUI3_x()) {
            if (b(this.f13793e.findViewById(16908290))) {
                n(0, 0, 0);
            } else {
                if (this.f13799k.f13766m && this.f13804p == 4) {
                    i11 = this.f13800l.f13750a;
                } else {
                    i11 = 0;
                }
                n(i11, 0, 0);
            }
        } else {
            this.f13799k.getClass();
            k();
        }
        b bVar = this.f13799k;
        if (bVar.f13768o) {
            i10 = this.f13800l.f13750a;
        } else {
            i10 = 0;
        }
        int i12 = this.f13804p;
        if (i12 != 1 && i12 != 2 && i12 == 3) {
            View view = bVar.f13767n;
            if (this.f13790a != null) {
                if (i10 < 0) {
                    i10 = 0;
                }
                if (view != null) {
                    Integer num = (Integer) view.getTag(R.id.immersion_fits_layout_overlap);
                    if (num == null) {
                        num = 0;
                    }
                    if (num.intValue() != i10) {
                        view.setTag(R.id.immersion_fits_layout_overlap, Integer.valueOf(i10));
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new ViewGroup.LayoutParams(-1, 0);
                        }
                        layoutParams.height = i10;
                        view.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public final void e(BarHide barHide) {
        boolean z10;
        this.f13799k.f13759f = barHide;
        if (OSUtils.isEMUI3_x()) {
            b bVar = this.f13799k;
            BarHide barHide2 = bVar.f13759f;
            if (barHide2 != BarHide.FLAG_HIDE_NAVIGATION_BAR && barHide2 != BarHide.FLAG_HIDE_BAR) {
                z10 = false;
            } else {
                z10 = true;
            }
            bVar.f13758e = z10;
        }
    }

    public final void f() {
        b bVar = this.f13799k;
        if (bVar.f13774u) {
            o0.a.b(0.0f, 0, bVar.f13763j);
            this.f13799k.getClass();
            b bVar2 = this.f13799k;
            o0.a.b(bVar2.c, bVar2.f13755a, bVar2.f13764k);
            this.f13799k.getClass();
            boolean z10 = this.f13805q;
            boolean z11 = this.f13796h;
            if (!z10 || z11) {
                q();
            }
            g gVar = this.f13795g;
            if (gVar != null) {
                if (z11) {
                    gVar.f13799k = this.f13799k;
                }
                if (this.f13798j && gVar.f13806r) {
                    gVar.f13799k.f13769p = false;
                }
            }
            m();
            d();
            if (!z11) {
                if (this.f13799k.f13769p) {
                    if (this.f13803o == null) {
                        this.f13803o = new d(this);
                    }
                    d dVar = this.f13803o;
                    dVar.f13781b.setSoftInputMode(this.f13799k.f13770q);
                    if (!dVar.f13789k) {
                        dVar.c.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
                        dVar.f13789k = true;
                    }
                } else {
                    d dVar2 = this.f13803o;
                    if (dVar2 != null) {
                        dVar2.a();
                    }
                }
            } else {
                g gVar2 = this.f13795g;
                if (gVar2 != null) {
                    if (gVar2.f13799k.f13769p) {
                        if (gVar2.f13803o == null) {
                            gVar2.f13803o = new d(gVar2);
                        }
                        g gVar3 = this.f13795g;
                        d dVar3 = gVar3.f13803o;
                        dVar3.f13781b.setSoftInputMode(gVar3.f13799k.f13770q);
                        if (!dVar3.f13789k) {
                            dVar3.c.getViewTreeObserver().addOnGlobalLayoutListener(dVar3);
                            dVar3.f13789k = true;
                        }
                    } else {
                        d dVar4 = gVar2.f13803o;
                        if (dVar4 != null) {
                            dVar4.a();
                        }
                    }
                }
            }
            if (!this.f13799k.f13765l.isEmpty()) {
                for (Map.Entry entry : this.f13799k.f13765l.entrySet()) {
                    View view = (View) entry.getKey();
                    this.f13799k.getClass();
                    Integer num = 0;
                    Integer valueOf = Integer.valueOf(this.f13799k.f13763j);
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        Integer num2 = (Integer) entry2.getKey();
                        valueOf = (Integer) entry2.getValue();
                        num = num2;
                    }
                    if (view != null) {
                        this.f13799k.getClass();
                        if (Math.abs(0.0f) == 0.0f) {
                            int intValue = num.intValue();
                            int intValue2 = valueOf.intValue();
                            this.f13799k.getClass();
                            view.setBackgroundColor(o0.a.b(0.0f, intValue, intValue2));
                        } else {
                            int intValue3 = num.intValue();
                            int intValue4 = valueOf.intValue();
                            this.f13799k.getClass();
                            view.setBackgroundColor(o0.a.b(0.0f, intValue3, intValue4));
                        }
                    }
                }
            }
            this.f13805q = true;
        }
    }

    public final void g(Window window) {
        this.f13792d = window;
        this.f13799k = new b();
        ViewGroup viewGroup = (ViewGroup) this.f13792d.getDecorView();
        this.f13793e = viewGroup;
        this.f13794f = (ViewGroup) viewGroup.findViewById(16908290);
    }

    public final void h() {
        b bVar = this.f13799k;
        int i10 = bVar.f13770q;
        bVar.f13769p = true;
        bVar.f13770q = i10;
        this.f13806r = true;
    }

    public final void i(int i10) {
        this.f13799k.f13755a = androidx.core.content.a.getColor(this.f13790a, i10);
    }

    public final void j(boolean z10) {
        boolean z11;
        this.f13799k.f13761h = z10;
        if (z10) {
            if (!OSUtils.isMIUI6Later() && Build.VERSION.SDK_INT < 26) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                this.f13799k.c = 0.2f;
                return;
            }
        }
        b bVar = this.f13799k;
        bVar.getClass();
        bVar.c = 0.0f;
    }

    public final void k() {
        int i10;
        int i11;
        int i12;
        Uri uriFor;
        int i13 = 0;
        if (b(this.f13793e.findViewById(16908290))) {
            n(0, 0, 0);
        } else {
            b bVar = this.f13799k;
            if (bVar.f13766m && this.f13804p == 4) {
                i10 = this.f13800l.f13750a;
            } else {
                i10 = 0;
            }
            com.gyf.immersionbar.a aVar = this.f13800l;
            if (aVar.f13751b && bVar.f13771r && bVar.f13772s) {
                if (!bVar.f13757d) {
                    if (aVar.c()) {
                        i11 = this.f13800l.c;
                        i12 = 0;
                    } else {
                        i12 = this.f13800l.f13752d;
                        i11 = 0;
                    }
                } else {
                    i12 = 0;
                    i11 = 0;
                }
                if (this.f13799k.f13758e) {
                    if (this.f13800l.c()) {
                        i11 = 0;
                        i13 = i12;
                    }
                } else {
                    if (!this.f13800l.c()) {
                        i13 = this.f13800l.f13752d;
                    }
                    i13 = i12;
                }
            } else {
                i11 = 0;
            }
            n(i10, i13, i11);
        }
        if (!this.f13796h && OSUtils.isEMUI3_x()) {
            View findViewById = this.f13793e.findViewById(R.id.immersion_navigation_bar_view);
            b bVar2 = this.f13799k;
            if (bVar2.f13771r && bVar2.f13772s) {
                if (findViewById != null) {
                    int i14 = c.f13776d;
                    c cVar = c.a.f13779a;
                    if (cVar.f13777a == null) {
                        cVar.f13777a = new ArrayList<>();
                    }
                    if (!cVar.f13777a.contains(this)) {
                        cVar.f13777a.add(this);
                    }
                    Application application = this.f13790a.getApplication();
                    cVar.f13778b = application;
                    if (application != null && application.getContentResolver() != null && !cVar.c.booleanValue() && (uriFor = Settings.System.getUriFor("navigationbar_is_min")) != null) {
                        cVar.f13778b.getContentResolver().registerContentObserver(uriFor, true, cVar);
                        cVar.c = Boolean.TRUE;
                        return;
                    }
                    return;
                }
                return;
            }
            int i15 = c.f13776d;
            ArrayList<h> arrayList = c.a.f13779a.f13777a;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            findViewById.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0249, code lost:
        r0 = r10.f13794f.getWindowInsetsController();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.immersionbar.g.m():void");
    }

    public final void n(int i10, int i11, int i12) {
        ViewGroup viewGroup = this.f13794f;
        if (viewGroup != null) {
            viewGroup.setPadding(0, i10, i11, i12);
        }
        this.f13807s = 0;
        this.f13808t = i10;
        this.f13809u = i11;
        this.f13810v = i12;
    }

    public final void o(boolean z10) {
        this.f13799k.f13760g = z10;
        if (z10 && !OSUtils.isMIUI6Later()) {
            OSUtils.isFlymeOS4Later();
        }
        this.f13799k.getClass();
        this.f13799k.getClass();
    }

    public final void p(View view) {
        if (view == null) {
            return;
        }
        this.f13799k.f13767n = view;
        if (this.f13804p == 0) {
            this.f13804p = 3;
        }
    }

    public final void q() {
        this.f13800l = new com.gyf.immersionbar.a(this.f13790a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k();
    }

    public g(Fragment fragment) {
        this.f13796h = false;
        this.f13797i = false;
        this.f13798j = false;
        this.f13801m = 0;
        this.f13802n = 0;
        this.f13803o = null;
        new HashMap();
        this.f13804p = 0;
        this.f13805q = false;
        this.f13806r = false;
        this.f13807s = 0;
        this.f13808t = 0;
        this.f13809u = 0;
        this.f13810v = 0;
        this.f13796h = true;
        u i10 = fragment.i();
        this.f13790a = i10;
        this.f13791b = fragment;
        c();
        if (i10 != null) {
            g(i10.getWindow());
        }
    }

    public g(android.app.Fragment fragment) {
        this.f13796h = false;
        this.f13797i = false;
        this.f13798j = false;
        this.f13801m = 0;
        this.f13802n = 0;
        this.f13803o = null;
        new HashMap();
        this.f13804p = 0;
        this.f13805q = false;
        this.f13806r = false;
        this.f13807s = 0;
        this.f13808t = 0;
        this.f13809u = 0;
        this.f13810v = 0;
        this.f13796h = true;
        Activity activity = fragment.getActivity();
        this.f13790a = activity;
        this.c = fragment;
        c();
        g(activity.getWindow());
    }

    public g(androidx.fragment.app.m mVar) {
        this.f13796h = false;
        this.f13797i = false;
        this.f13798j = false;
        this.f13801m = 0;
        this.f13802n = 0;
        this.f13803o = null;
        new HashMap();
        this.f13804p = 0;
        this.f13805q = false;
        this.f13806r = false;
        this.f13807s = 0;
        this.f13808t = 0;
        this.f13809u = 0;
        this.f13810v = 0;
        this.f13798j = true;
        this.f13797i = true;
        this.f13790a = mVar.i();
        this.f13791b = mVar;
        Dialog dialog = mVar.f3859j0;
        c();
        g(dialog.getWindow());
    }

    public g(DialogFragment dialogFragment) {
        this.f13796h = false;
        this.f13797i = false;
        this.f13798j = false;
        this.f13801m = 0;
        this.f13802n = 0;
        this.f13803o = null;
        new HashMap();
        this.f13804p = 0;
        this.f13805q = false;
        this.f13806r = false;
        this.f13807s = 0;
        this.f13808t = 0;
        this.f13809u = 0;
        this.f13810v = 0;
        this.f13798j = true;
        this.f13797i = true;
        this.f13790a = dialogFragment.getActivity();
        this.c = dialogFragment;
        Dialog dialog = dialogFragment.getDialog();
        c();
        g(dialog.getWindow());
    }
}
