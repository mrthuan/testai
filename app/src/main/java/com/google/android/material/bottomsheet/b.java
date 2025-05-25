package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f9.h;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.p;
import l8.d;
import l8.e;
import l8.f;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import x0.f0;
import x0.n0;
import x0.q0;
import x0.s0;
import x0.t0;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes2.dex */
public class b extends p {

    /* renamed from: f  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f12170f;

    /* renamed from: g  reason: collision with root package name */
    public FrameLayout f12171g;

    /* renamed from: h  reason: collision with root package name */
    public CoordinatorLayout f12172h;

    /* renamed from: i  reason: collision with root package name */
    public FrameLayout f12173i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12174j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12175k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12176l;

    /* renamed from: m  reason: collision with root package name */
    public C0163b f12177m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f12178n;

    /* renamed from: o  reason: collision with root package name */
    public final a f12179o;

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0163b extends BottomSheetBehavior.c {

        /* renamed from: a  reason: collision with root package name */
        public final Boolean f12181a;

        /* renamed from: b  reason: collision with root package name */
        public final s0 f12182b;
        public Window c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f12183d;

        public C0163b(FrameLayout frameLayout, s0 s0Var) {
            ColorStateList g10;
            this.f12182b = s0Var;
            h hVar = BottomSheetBehavior.x(frameLayout).f12128i;
            if (hVar != null) {
                g10 = hVar.f17164a.c;
            } else {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                g10 = f0.i.g(frameLayout);
            }
            if (g10 != null) {
                this.f12181a = Boolean.valueOf(t0.a0(g10.getDefaultColor()));
            } else if (frameLayout.getBackground() instanceof ColorDrawable) {
                this.f12181a = Boolean.valueOf(t0.a0(((ColorDrawable) frameLayout.getBackground()).getColor()));
            } else {
                this.f12181a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void c(View view, int i10) {
            d(view);
        }

        public final void d(View view) {
            t0.e bVar;
            t0.e eVar;
            boolean booleanValue;
            t0.e bVar2;
            int top = view.getTop();
            s0 s0Var = this.f12182b;
            if (top < s0Var.e()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.f12181a;
                    if (bool == null) {
                        booleanValue = this.f12183d;
                    } else {
                        booleanValue = bool.booleanValue();
                    }
                    View decorView = window.getDecorView();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        bVar2 = new t0.d(window);
                    } else if (i10 >= 26) {
                        bVar2 = new t0.c(window, decorView);
                    } else {
                        bVar2 = new t0.b(window, decorView);
                    }
                    bVar2.d(booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), s0Var.e() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    boolean z10 = this.f12183d;
                    View decorView2 = window2.getDecorView();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30) {
                        eVar = new t0.d(window2);
                    } else {
                        if (i11 >= 26) {
                            bVar = new t0.c(window2, decorView2);
                        } else {
                            bVar = new t0.b(window2, decorView2);
                        }
                        eVar = bVar;
                    }
                    eVar.d(z10);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            if (this.c == window) {
                return;
            }
            this.c = window;
            if (window != null) {
                this.f12183d = new x0.t0(window, window.getDecorView()).f31527a.b();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968707(0x7f040083, float:1.7546075E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132017757(0x7f14025d, float:1.9673801E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f12174j = r0
            r3.f12175k = r0
            com.google.android.material.bottomsheet.b$a r4 = new com.google.android.material.bottomsheet.b$a
            r4.<init>()
            r3.f12179o = r4
            l.e r4 = r3.p()
            r4.x(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2130969037(0x7f0401cd, float:1.7546745E38)
            int[] r5 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            r5 = 0
            boolean r4 = r4.getBoolean(r5, r5)
            r3.f12178n = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.b.<init>(android.content.Context, int):void");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        s();
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f12178n && Color.alpha(window.getNavigationBarColor()) < 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            FrameLayout frameLayout = this.f12171g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f12172h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            q0.a(window, !z10);
            C0163b c0163b = this.f12177m;
            if (c0163b != null) {
                c0163b.e(window);
            }
        }
    }

    @Override // l.p, androidx.activity.l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(SlideAtom.USES_MASTER_SLIDE_ID);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        C0163b c0163b = this.f12177m;
        if (c0163b != null) {
            c0163b.e(null);
        }
    }

    @Override // androidx.activity.l, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f12170f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.L == 5) {
            bottomSheetBehavior.E(4);
        }
    }

    public final void r() {
        if (this.f12171g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f12171g = frameLayout;
            this.f12172h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f12171g.findViewById(R.id.design_bottom_sheet);
            this.f12173i = frameLayout2;
            BottomSheetBehavior<FrameLayout> x4 = BottomSheetBehavior.x(frameLayout2);
            this.f12170f = x4;
            ArrayList<BottomSheetBehavior.c> arrayList = x4.X;
            a aVar = this.f12179o;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            this.f12170f.C(this.f12174j);
        }
    }

    public final BottomSheetBehavior<FrameLayout> s() {
        if (this.f12170f == null) {
            r();
        }
        return this.f12170f;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f12174j != z10) {
            this.f12174j = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f12170f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.C(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f12174j) {
            this.f12174j = true;
        }
        this.f12175k = z10;
        this.f12176l = true;
    }

    @Override // l.p, androidx.activity.l, android.app.Dialog
    public final void setContentView(int i10) {
        super.setContentView(t(null, i10, null));
    }

    public final FrameLayout t(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        r();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f12171g.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f12178n) {
            FrameLayout frameLayout = this.f12173i;
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.i.u(frameLayout, aVar);
        }
        this.f12173i.removeAllViews();
        if (layoutParams == null) {
            this.f12173i.addView(view);
        } else {
            this.f12173i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new d(this));
        f0.o(this.f12173i, new e(this));
        this.f12173i.setOnTouchListener(new f());
        return this.f12171g;
    }

    @Override // l.p, androidx.activity.l, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(t(view, 0, null));
    }

    @Override // l.p, androidx.activity.l, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(t(view, 0, layoutParams));
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void c(View view, int i10) {
            if (i10 == 5) {
                b.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view) {
        }
    }
}
