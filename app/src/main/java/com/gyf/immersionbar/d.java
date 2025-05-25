package com.gyf.immersionbar;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

/* compiled from: FitsKeyboard.java */
/* loaded from: classes2.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final g f13780a;

    /* renamed from: b  reason: collision with root package name */
    public final Window f13781b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final View f13782d;

    /* renamed from: e  reason: collision with root package name */
    public final View f13783e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13784f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13785g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13786h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13787i;

    /* renamed from: j  reason: collision with root package name */
    public int f13788j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f13789k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View] */
    public d(g gVar) {
        this.f13784f = 0;
        this.f13785g = 0;
        this.f13786h = 0;
        this.f13787i = 0;
        this.f13780a = gVar;
        Window window = gVar.f13792d;
        this.f13781b = window;
        View decorView = window.getDecorView();
        this.c = decorView;
        FrameLayout frameLayout = (FrameLayout) decorView.findViewById(16908290);
        if (gVar.f13797i) {
            Fragment fragment = gVar.f13791b;
            if (fragment != null) {
                this.f13783e = fragment.H;
            } else {
                android.app.Fragment fragment2 = gVar.c;
                if (fragment2 != null) {
                    this.f13783e = fragment2.getView();
                }
            }
        } else {
            View childAt = frameLayout.getChildAt(0);
            this.f13783e = childAt;
            if (childAt != null && (childAt instanceof DrawerLayout)) {
                this.f13783e = ((DrawerLayout) childAt).getChildAt(0);
            }
        }
        View view = this.f13783e;
        if (view != null) {
            this.f13784f = view.getPaddingLeft();
            this.f13785g = this.f13783e.getPaddingTop();
            this.f13786h = this.f13783e.getPaddingRight();
            this.f13787i = this.f13783e.getPaddingBottom();
        }
        ?? r4 = this.f13783e;
        this.f13782d = r4 != 0 ? r4 : frameLayout;
    }

    public final void a() {
        if (this.f13789k) {
            View view = this.f13783e;
            View view2 = this.f13782d;
            if (view != null) {
                view2.setPadding(this.f13784f, this.f13785g, this.f13786h, this.f13787i);
                return;
            }
            g gVar = this.f13780a;
            view2.setPadding(gVar.f13807s, gVar.f13808t, gVar.f13809u, gVar.f13810v);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGlobalLayout() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gyf.immersionbar.d.onGlobalLayout():void");
    }
}
