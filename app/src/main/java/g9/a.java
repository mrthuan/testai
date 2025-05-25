package g9;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: RightSheetDelegate.java */
/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f17697a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f17697a = sideSheetBehavior;
    }

    public final int a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f17697a;
        return Math.max(0, (sideSheetBehavior.f12859m - sideSheetBehavior.f12858l) - sideSheetBehavior.f12860n);
    }
}
