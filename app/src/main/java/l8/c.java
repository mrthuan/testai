package l8;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import y0.j;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes2.dex */
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20529a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f20530b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f20530b = bottomSheetBehavior;
        this.f20529a = i10;
    }

    @Override // y0.j
    public final boolean a(View view) {
        this.f20530b.E(this.f20529a);
        return true;
    }
}
