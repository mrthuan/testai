package f5;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BaseUpgradeDialog.kt */
/* loaded from: classes.dex */
public abstract class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: p  reason: collision with root package name */
    public final Activity f17097p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity) {
        super(activity, R.style.UpgradeBottomDialogStyle);
        kotlin.jvm.internal.g.e(activity, "activity");
        this.f17097p = activity;
    }

    @Override // l.p, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Dialog, f5.b
    public void show() {
        Activity activity = this.f17097p;
        if (activity.isFinishing()) {
            return;
        }
        try {
            super.show();
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior x4 = BottomSheetBehavior.x(frameLayout);
                kotlin.jvm.internal.g.d(x4, "from(it)");
                x4.E(3);
            }
            u();
            if (activity.getResources().getConfiguration().orientation != 1) {
                v();
            }
        } catch (Error e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void u() {
        WindowInsetsController windowInsetsController;
        WindowInsetsController windowInsetsController2;
        Activity activity = this.f17097p;
        try {
            if (activity.getResources().getConfiguration().orientation != 1) {
                Window window = getWindow();
                if (window != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        windowInsetsController2 = window.getDecorView().getWindowInsetsController();
                        if (windowInsetsController2 != null) {
                            windowInsetsController2.setSystemBarsAppearance(0, 16);
                        }
                    } else {
                        View decorView = window.getDecorView();
                        int systemUiVisibility = decorView.getSystemUiVisibility();
                        if (i10 >= 26) {
                            systemUiVisibility &= -17;
                        }
                        decorView.setSystemUiVisibility(systemUiVisibility);
                    }
                    window.setNavigationBarColor(androidx.core.content.a.getColor(activity, R.color.lib_upgrade_dialog_navigation_landscape));
                    return;
                }
                return;
            }
            Window window2 = getWindow();
            if (window2 != null) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    windowInsetsController = window2.getDecorView().getWindowInsetsController();
                    if (windowInsetsController != null) {
                        windowInsetsController.setSystemBarsAppearance(16, 16);
                    }
                } else {
                    View decorView2 = window2.getDecorView();
                    int systemUiVisibility2 = decorView2.getSystemUiVisibility();
                    if (i11 >= 26) {
                        systemUiVisibility2 |= 16;
                    }
                    decorView2.setSystemUiVisibility(systemUiVisibility2);
                }
                window2.setNavigationBarColor(androidx.core.content.a.getColor(activity, R.color.lib_upgrade_dialog_navigation_protraint));
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void v() {
        ViewGroup.LayoutParams layoutParams;
        try {
            u();
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.design_bottom_sheet);
            if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
                Context context = frameLayout.getContext();
                kotlin.jvm.internal.g.d(context, "it.context");
                int i10 = context.getResources().getDisplayMetrics().widthPixels;
                Context context2 = frameLayout.getContext();
                kotlin.jvm.internal.g.d(context2, "it.context");
                int i11 = context2.getResources().getDisplayMetrics().heightPixels;
                if (i10 > i11) {
                    i10 = i11;
                }
                layoutParams.width = i10;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
