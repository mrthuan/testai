package pdf.pdfreader.viewer.editor.free.utils.extension;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import x0.q0;
import x0.t0;

/* compiled from: Window.kt */
/* loaded from: classes3.dex */
public final class i {
    public static final void a(Window window, boolean z10) {
        t0.e bVar;
        t0.e eVar;
        View decorView = window.getDecorView();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            eVar = new t0.d(window);
        } else {
            if (i10 >= 26) {
                bVar = new t0.c(window, decorView);
            } else {
                bVar = new t0.b(window, decorView);
            }
            eVar = bVar;
        }
        eVar.c(z10);
    }

    public static final void b(Window window, boolean z10) {
        t0.e bVar;
        t0.e eVar;
        View decorView = window.getDecorView();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            eVar = new t0.d(window);
        } else {
            if (i10 >= 26) {
                bVar = new t0.c(window, decorView);
            } else {
                bVar = new t0.b(window, decorView);
            }
            eVar = bVar;
        }
        eVar.d(z10);
    }

    public static final void c(Window window, boolean z10) {
        if (z10) {
            View decorView = window.getDecorView();
            kotlin.jvm.internal.g.d(decorView, ea.a.p("V2UobwFWC2V3", "sTKKCSr3"));
            k(window, decorView, 2);
            return;
        }
        View decorView2 = window.getDecorView();
        kotlin.jvm.internal.g.d(decorView2, ea.a.p("V2UobwFWC2V3", "HLK5gO99"));
        f(window, decorView2, 2);
    }

    public static final void d(Window window, View view, Integer[] numArr, Integer[] numArr2) {
        t0.e bVar;
        t0.e eVar;
        t0.e bVar2;
        t0.e eVar2;
        boolean z10;
        kotlin.jvm.internal.g.e(view, "view");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            eVar = new t0.d(window);
        } else {
            if (i10 >= 26) {
                bVar = new t0.c(window, view);
            } else {
                bVar = new t0.b(window, view);
            }
            eVar = bVar;
        }
        ea.a.p("VGU_SR1zB3QBQ1tuHXI5bChlQCgyaCpzeiAmaQR3KQ==", "VPajqi4X");
        if (f.a(30)) {
            j(window, 4096);
        }
        View decorView = window.getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            eVar2 = new t0.d(window);
        } else {
            if (i11 >= 26) {
                bVar2 = new t0.c(window, decorView);
            } else {
                bVar2 = new t0.b(window, decorView);
            }
            eVar2 = bVar2;
        }
        eVar2.e(2);
        if (kotlin.collections.f.w(2, numArr2)) {
            if (Build.VERSION.SDK_INT < 27) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                window.clearFlags(134217728);
            }
        }
        for (Integer num : numArr) {
            eVar.f(num.intValue());
        }
        for (Integer num2 : numArr2) {
            eVar.a(num2.intValue());
        }
    }

    public static final void e(Window window) {
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 0;
            window.setAttributes(attributes);
        }
        window.getDecorView().setSystemUiVisibility(0);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.g.d(decorView, ea.a.p("DGUhbwhWDWV3", "CqhBzdzA"));
        k(window, decorView, 1, 2);
    }

    public static final void f(Window window, View view, int... iArr) {
        t0.e bVar;
        t0.e eVar;
        t0.e bVar2;
        t0.e eVar2;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            eVar = new t0.d(window);
        } else {
            if (i10 >= 26) {
                bVar = new t0.c(window, view);
            } else {
                bVar = new t0.b(window, view);
            }
            eVar = bVar;
        }
        ea.a.p("NmVFSRtzKHQ7QwluQHI4bFRlICg9aF9zWCAHaTR3KQ==", "cpQ1uM9V");
        if (f.a(30)) {
            j(window, 4096);
        }
        View decorView = window.getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            eVar2 = new t0.d(window);
        } else {
            if (i11 >= 26) {
                bVar2 = new t0.c(window, decorView);
            } else {
                bVar2 = new t0.b(window, decorView);
            }
            eVar2 = bVar2;
        }
        eVar2.e(2);
        for (int i12 : iArr) {
            if (i12 == 2) {
                int i13 = Build.VERSION.SDK_INT;
                boolean z11 = true;
                if (i13 < 27) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    window.clearFlags(134217728);
                }
                if (i13 >= 26) {
                    z11 = false;
                }
                if (z11 && window.getDecorView().findViewById(16908336) == null) {
                }
            }
            eVar.a(i12);
        }
    }

    public static final void g(Window window, int i10, int i11) {
        if (window.getDecorView() == null) {
            return;
        }
        if (f.a(23)) {
            window.setStatusBarColor(i10);
        } else {
            window.setStatusBarColor(SlideAtom.USES_MASTER_SLIDE_ID);
        }
        if (f.a(27)) {
            window.setNavigationBarColor(i11);
        } else {
            window.addFlags(134217728);
        }
        q0.a(window, true);
    }

    public static final void h(Window window, boolean z10) {
        t0.e bVar;
        t0.e eVar;
        View decorView = window.getDecorView();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            eVar = new t0.d(window);
        } else {
            if (i10 >= 26) {
                bVar = new t0.c(window, decorView);
            } else {
                bVar = new t0.b(window, decorView);
            }
            eVar = bVar;
        }
        eVar.d(z10);
        eVar.c(z10);
    }

    public static final void i(Window window) {
        String str;
        View decorView = window.getDecorView();
        kotlin.jvm.internal.g.c(decorView, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuWm55bhpsNiBHeTtlU2EMZABvXWRHdj9lMy5kaSN3BHJadXA=", "5ToZY4Pp"));
        ViewGroup viewGroup = (ViewGroup) decorView;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            int id2 = childAt.getId();
            if (id2 != -1) {
                Context m10 = ReaderPdfApplication.m();
                kotlin.jvm.internal.g.d(m10, ea.a.p("KWUkSTRzJGEmYwMoKQ==", "kHNPZPbD"));
                try {
                    str = m10.getResources().getResourceEntryName(id2);
                    kotlin.jvm.internal.g.d(str, ea.a.p("KwpSIE4gUCBoIAVvWnQyeEwuIGU6b0NyloDXcz51MGM1RRx0HHk-YSVlTmlQKV0gGCByfQ==", "79PrnpFJ"));
                } catch (Exception unused) {
                    str = "";
                }
                if (kotlin.jvm.internal.g.a(ea.a.p("XWE9aRRhFmkdbnZhG0I3Yy9nQG8zbmQ=", "v8cs0icf"), str)) {
                    childAt.setVisibility(4);
                }
            }
        }
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 4610);
    }

    public static final void j(Window window, int i10) {
        if (window.getDecorView() == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | i10);
    }

    public static final void k(Window window, View view, int... iArr) {
        t0.e bVar;
        t0.e eVar;
        t0.e bVar2;
        t0.e eVar2;
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            eVar = new t0.d(window);
        } else {
            if (i10 >= 26) {
                bVar = new t0.c(window, view);
            } else {
                bVar = new t0.b(window, view);
            }
            eVar = bVar;
        }
        ea.a.p("KGVFSRdzUnQpQyVuAXIHbFllHCgxaAxzZSAEaSh3KQ==", "MeYDIrMv");
        if (f.a(30)) {
            j(window, 4096);
        }
        View decorView = window.getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            eVar2 = new t0.d(window);
        } else {
            if (i11 >= 26) {
                bVar2 = new t0.c(window, decorView);
            } else {
                bVar2 = new t0.b(window, decorView);
            }
            eVar2 = bVar2;
        }
        eVar2.e(2);
        for (int i12 : iArr) {
            if (i12 == 2) {
                if (Build.VERSION.SDK_INT < 26) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && window.getDecorView().findViewById(16908336) == null) {
                    window.clearFlags(134217728);
                }
            }
            eVar.f(i12);
        }
    }
}
