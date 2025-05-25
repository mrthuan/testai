package g9;

import am.l2;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderDecryptAndCopyExecutor;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.preview.GraffitiBottomSheetView;
import v4.r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17700a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f17701b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, AIChatRecyclerView aIChatRecyclerView) {
        this.f17700a = 2;
        this.f17701b = i10;
        this.c = aIChatRecyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, android.view.View] */
    @Override // java.lang.Runnable
    public final void run() {
        LinearLayoutManager linearLayoutManager;
        boolean z10;
        int i10 = this.f17701b;
        int i11 = this.f17700a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f12861o.get();
                if (view != null) {
                    sideSheetBehavior.t(view, false, i10);
                    return;
                }
                return;
            case 1:
                ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor = (ReaderDecryptAndCopyExecutor) obj;
                g.e(readerDecryptAndCopyExecutor, ea.a.p("R2gic1cw", "QMSPdxXo"));
                readerDecryptAndCopyExecutor.f24228b.b(i10, 100);
                return;
            case 2:
                AIChatRecyclerView aIChatRecyclerView = (AIChatRecyclerView) obj;
                int i12 = AIChatRecyclerView.L0;
                g.e(aIChatRecyclerView, ea.a.p("O2hYc10w", "LeVrvZ2e"));
                if (i10 >= 0) {
                    RecyclerView.m layoutManager = aIChatRecyclerView.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    } else {
                        linearLayoutManager = null;
                    }
                    LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                    if (linearLayoutManager2 != null) {
                        int Y0 = linearLayoutManager2.Y0();
                        int Z0 = linearLayoutManager2.Z0();
                        if (Y0 <= i10 && i10 < Z0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            aIChatRecyclerView.z0();
                            return;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ?? C = linearLayoutManager2.C(i10);
                        ref$ObjectRef.element = C;
                        if (C == 0) {
                            linearLayoutManager2.o1(i10, 0);
                            aIChatRecyclerView.z0();
                            ref$ObjectRef.element = linearLayoutManager2.C(i10);
                        }
                        View view2 = (View) ref$ObjectRef.element;
                        if (view2 != null) {
                            view2.post(new r(ref$ObjectRef, aIChatRecyclerView, i10, linearLayoutManager2, 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) obj;
                int i13 = SubscriptionDarkTestFActivity.f24900a0;
                g.e(subscriptionDarkTestFActivity, ea.a.p("R2gic1cw", "sMwB5Nmw"));
                if (subscriptionDarkTestFActivity.C2().f1520k.getMeasuredHeight() != i10) {
                    subscriptionDarkTestFActivity.C2().f1520k.requestLayout();
                    return;
                }
                return;
            default:
                GraffitiBottomSheetView graffitiBottomSheetView = (GraffitiBottomSheetView) obj;
                if (i10 >= 0) {
                    if (i10 < graffitiBottomSheetView.C.getItemCount()) {
                        ((l2) graffitiBottomSheetView.f28172y).c.u0(i10);
                        return;
                    }
                    return;
                }
                int i14 = GraffitiBottomSheetView.E;
                graffitiBottomSheetView.getClass();
                return;
        }
    }

    public /* synthetic */ e(Object obj, int i10, int i11) {
        this.f17700a = i11;
        this.c = obj;
        this.f17701b = i10;
    }
}
