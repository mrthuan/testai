package oo;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: BaseConvertDialog.java */
/* loaded from: classes3.dex */
public abstract class i extends Dialog {
    public static void b(final Window window) {
        window.getDecorView().setSystemUiVisibility(2);
        window.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: oo.h
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i10) {
                window.getDecorView().setSystemUiVisibility(5894);
            }
        });
    }

    public final void a() {
        WindowInsetsController windowInsetsController;
        int i10;
        int statusBars;
        int navigationBars;
        Window window = getWindow();
        if (window != null) {
            int i11 = wn.e.f31402a;
            int i12 = Build.VERSION.SDK_INT;
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(SlideAtom.USES_MASTER_SLIDE_ID);
            window.setStatusBarColor(0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (i12 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            if (i12 >= 30) {
                try {
                    windowInsetsController = window.getDecorView().getWindowInsetsController();
                    if (windowInsetsController != null) {
                        statusBars = WindowInsets.Type.statusBars();
                        windowInsetsController.hide(statusBars);
                        navigationBars = WindowInsets.Type.navigationBars();
                        windowInsetsController.hide(navigationBars);
                        windowInsetsController.setSystemBarsBehavior(2);
                    }
                    i10 = 256;
                } catch (Throwable unused) {
                    return;
                }
            } else {
                i10 = 4870;
            }
            window.getDecorView().setSystemUiVisibility(i10 | 4096 | 4 | 1024);
        }
    }
}
