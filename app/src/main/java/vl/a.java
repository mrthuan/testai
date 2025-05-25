package vl;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptRecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30843a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f30844b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i10, int i11) {
        this.f30843a = i11;
        this.c = obj;
        this.f30844b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.m layoutManager;
        int i10 = this.f30843a;
        int i11 = this.f30844b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ((b) obj).c.b(i11);
                return;
            case 1:
                AIChatRecyclerView aIChatRecyclerView = (AIChatRecyclerView) obj;
                int i12 = AIChatRecyclerView.L0;
                g.e(aIChatRecyclerView, ea.a.p("JWhfc1cw", "OHQ6sDuk"));
                RecyclerView.m layoutManager2 = aIChatRecyclerView.getLayoutManager();
                if (layoutManager2 instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager2;
                } else {
                    linearLayoutManager = null;
                }
                if (linearLayoutManager != null) {
                    int min = Math.min(i11, linearLayoutManager.M() - 1);
                    if (aIChatRecyclerView.F0) {
                        aIChatRecyclerView.K0 = min;
                        return;
                    }
                    int Z0 = linearLayoutManager.Z0();
                    if (Z0 != min - 1 && Z0 != min) {
                        aIChatRecyclerView.z0();
                        return;
                    }
                    aIChatRecyclerView.u0(min);
                    aIChatRecyclerView.z0();
                    return;
                }
                return;
            case 2:
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                InterceptRecyclerView interceptRecyclerView = readerPreviewActivity.Z3;
                if (interceptRecyclerView != null && (layoutManager = interceptRecyclerView.getLayoutManager()) != null) {
                    layoutManager.B0(i11);
                }
                ThumbnailAdapter thumbnailAdapter = readerPreviewActivity.D2;
                if (thumbnailAdapter != null) {
                    thumbnailAdapter.h(i11 + 1);
                    return;
                }
                return;
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                int i13 = ap.d.G;
                g.e(lottieAnimationView, ea.a.p("F2l0", "Zrq6tf0e"));
                ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    ((ViewGroup.MarginLayoutParams) bVar).height = i11;
                    lottieAnimationView.setLayoutParams(bVar);
                    return;
                }
                throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuKW4cbg1sOSA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3QqYUhvDXR7dyZkVmUNLnRvNHM-chRpBnR5YRdvMHRLTCd5XnUMUDRyLm1z", "RkVfF1xU"));
        }
    }
}
