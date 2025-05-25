package n0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import n0.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22301a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22302b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(Object obj, int i10, int i11) {
        this.f22301a = i11;
        this.c = obj;
        this.f22302b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22301a;
        View view = null;
        LinearLayoutManager linearLayoutManager = null;
        int i11 = this.f22302b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ((f.e) obj).c(i11);
                return;
            case 1:
                AIChatRecyclerView aIChatRecyclerView = (AIChatRecyclerView) obj;
                int i12 = AIChatRecyclerView.L0;
                kotlin.jvm.internal.g.e(aIChatRecyclerView, ea.a.p("O2hYc10w", "cIigCjJ6"));
                RecyclerView.m layoutManager = aIChatRecyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                }
                if (linearLayoutManager != null) {
                    int min = Math.min(i11, linearLayoutManager.M() - 1);
                    if (linearLayoutManager.Z0() == min) {
                        aIChatRecyclerView.u0(min);
                        aIChatRecyclerView.z0();
                        return;
                    }
                    aIChatRecyclerView.z0();
                    return;
                }
                return;
            default:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj;
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("MWglc0Ew", "qoELe1mW"));
                int dimensionPixelSize = (imageAdjustActivity.getResources().getDisplayMetrics().widthPixels / 2) - imageAdjustActivity.getResources().getDimensionPixelSize(R.dimen.dp_20);
                RecyclerView.m layoutManager2 = imageAdjustActivity.y2().f688s.getLayoutManager();
                if (layoutManager2 != null) {
                    view = layoutManager2.C(i11);
                }
                if (view != null) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    imageAdjustActivity.y2().f688s.t0(iArr[0] - dimensionPixelSize, 0, false);
                    return;
                }
                return;
        }
    }
}
