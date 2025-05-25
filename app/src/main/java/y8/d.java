package y8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import w8.i;
import w8.y;

/* compiled from: NavigationView.java */
/* loaded from: classes2.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NavigationView f32097a;

    public d(NavigationView navigationView) {
        this.f32097a = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z10;
        boolean z11;
        boolean z12;
        Activity activity;
        Rect rect;
        boolean z13;
        boolean z14;
        boolean z15;
        WindowMetrics currentWindowMetrics;
        int i10;
        NavigationView navigationView = this.f32097a;
        navigationView.getLocationOnScreen(navigationView.f12748k);
        int[] iArr = navigationView.f12748k;
        boolean z16 = true;
        if (iArr[1] == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i iVar = navigationView.f12746i;
        if (iVar.f31025w != z10) {
            iVar.f31025w = z10;
            if (iVar.f31005b.getChildCount() == 0 && iVar.f31025w) {
                i10 = iVar.f31027y;
            } else {
                i10 = 0;
            }
            NavigationMenuView navigationMenuView = iVar.f31004a;
            navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
        }
        if (z10 && navigationView.f12751n) {
            z11 = true;
        } else {
            z11 = false;
        }
        navigationView.setDrawTopInsetForeground(z11);
        int i11 = iArr[0];
        if (i11 != 0 && navigationView.getWidth() + i11 != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        navigationView.setDrawLeftInsetForeground(z12);
        Context context = navigationView.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity != null) {
            int i12 = Build.VERSION.SDK_INT;
            int i13 = y.f31066a;
            WindowManager windowManager = (WindowManager) activity.getSystemService("window");
            if (i12 >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                rect = currentWindowMetrics.getBounds();
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect();
                rect.right = point.x;
                rect.bottom = point.y;
            }
            if (rect.height() - navigationView.getHeight() == iArr[1]) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z13 && z14 && navigationView.f12752o) {
                z15 = true;
            } else {
                z15 = false;
            }
            navigationView.setDrawBottomInsetForeground(z15);
            if (rect.width() != iArr[0] && rect.width() - navigationView.getWidth() != iArr[0]) {
                z16 = false;
            }
            navigationView.setDrawRightInsetForeground(z16);
        }
    }
}
