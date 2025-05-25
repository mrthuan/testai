package yb;

import android.view.View;
import bc.f;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* compiled from: RefreshComponent.java */
/* loaded from: classes2.dex */
public interface a extends f {
    void b(float f10, int i10, int i11);

    void c(float f10, int i10, int i11, int i12, boolean z10);

    boolean d();

    void e(e eVar, int i10, int i11);

    void f(e eVar, int i10, int i11);

    zb.b getSpinnerStyle();

    View getView();

    void h(SmartRefreshLayout.h hVar, int i10, int i11);

    int i(e eVar, boolean z10);

    void setPrimaryColors(int... iArr);
}
