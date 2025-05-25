package x0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.y0;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f31527a;

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Window f31528a;

        /* renamed from: b  reason: collision with root package name */
        public final View f31529b;

        public a(Window window, View view) {
            this.f31528a = window;
            this.f31529b = view;
        }

        @Override // x0.t0.e
        public final void a(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 8) {
                                Window window = this.f31528a;
                                ((InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                            }
                        } else {
                            g(2);
                        }
                    } else {
                        g(4);
                    }
                }
            }
        }

        @Override // x0.t0.e
        public final void e(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        h(2048);
                        g(4096);
                        return;
                    }
                    return;
                }
                h(4096);
                g(2048);
                return;
            }
            h(6144);
        }

        @Override // x0.t0.e
        public final void f(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    Window window = this.f31528a;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 8) {
                                View view = this.f31529b;
                                if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                                    view = window.getCurrentFocus();
                                } else {
                                    view.requestFocus();
                                }
                                if (view == null) {
                                    view = window.findViewById(16908290);
                                }
                                if (view != null && view.hasWindowFocus()) {
                                    view.post(new y0(view, 1));
                                }
                            }
                        } else {
                            h(2);
                        }
                    } else {
                        h(4);
                        window.clearFlags(1024);
                    }
                }
            }
        }

        public final void g(int i10) {
            View decorView = this.f31528a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public final void h(int i10) {
            View decorView = this.f31528a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // x0.t0.e
        public final boolean b() {
            if ((this.f31528a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // x0.t0.e
        public final void d(boolean z10) {
            if (z10) {
                Window window = this.f31528a;
                window.clearFlags(67108864);
                window.addFlags(SlideAtom.USES_MASTER_SLIDE_ID);
                g(8192);
                return;
            }
            h(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // x0.t0.e
        public final void c(boolean z10) {
            if (z10) {
                Window window = this.f31528a;
                window.clearFlags(134217728);
                window.addFlags(SlideAtom.USES_MASTER_SLIDE_ID);
                g(16);
                return;
            }
            h(16);
        }
    }

    @Deprecated
    public t0(WindowInsetsController windowInsetsController) {
        this.f31527a = new d(windowInsetsController);
    }

    public final void a(int i10) {
        this.f31527a.a(i10);
    }

    public final void b(boolean z10) {
        this.f31527a.c(z10);
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsController f31530a;

        /* renamed from: b  reason: collision with root package name */
        public final Window f31531b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.view.Window r2) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.window.layout.b.f(r2)
                r1.<init>(r0)
                r1.f31531b = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.t0.d.<init>(android.view.Window):void");
        }

        @Override // x0.t0.e
        public final void a(int i10) {
            this.f31530a.hide(i10);
        }

        @Override // x0.t0.e
        public final boolean b() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f31530a.getSystemBarsAppearance();
            if ((systemBarsAppearance & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // x0.t0.e
        public final void c(boolean z10) {
            WindowInsetsController windowInsetsController = this.f31530a;
            Window window = this.f31531b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }

        @Override // x0.t0.e
        public final void d(boolean z10) {
            WindowInsetsController windowInsetsController = this.f31530a;
            Window window = this.f31531b;
            if (z10) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }

        @Override // x0.t0.e
        public final void e(int i10) {
            this.f31530a.setSystemBarsBehavior(i10);
        }

        @Override // x0.t0.e
        public final void f(int i10) {
            Window window = this.f31531b;
            if (window != null && (i10 & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f31530a.show(i10);
        }

        public d(WindowInsetsController windowInsetsController) {
            new y.i();
            this.f31530a = windowInsetsController;
        }
    }

    public t0(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f31527a = new d(window);
        } else if (i10 >= 26) {
            this.f31527a = new c(window, view);
        } else {
            this.f31527a = new b(window, view);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public void a(int i10) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public void e(int i10) {
            throw null;
        }

        public void f(int i10) {
            throw null;
        }

        public void c(boolean z10) {
        }
    }
}
