package pdf.pdfreader.viewer.editor.free.ui.act;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import pdf.pdfreader.viewer.editor.free.ui.act.ClearDefaultReaderStep2Activity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements x0.u, androidx.activity.result.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26889a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.c f26890b;

    public /* synthetic */ b(androidx.appcompat.app.c cVar, int i10) {
        this.f26889a = i10;
        this.f26890b = cVar;
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        int i10 = this.f26889a;
        androidx.appcompat.app.c cVar = this.f26890b;
        switch (i10) {
            case 1:
                ReaderFeedbackActivity readerFeedbackActivity = (ReaderFeedbackActivity) cVar;
                Boolean bool = (Boolean) obj;
                int i11 = ReaderFeedbackActivity.F;
                kotlin.jvm.internal.g.e(readerFeedbackActivity, ea.a.p("Qmglc3ww", "yQ6LXbN7"));
                kotlin.jvm.internal.g.d(bool, ea.a.p("QWU4dR90", "04FgEqSt"));
                if (!bool.booleanValue() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.a(readerFeedbackActivity)) {
                    if (k0.b.b(readerFeedbackActivity, ea.a.p("DW4ucg1pFS44ZRRtXXMkaVdufEMITXNSQQ==", "sUlJbqYV"))) {
                        readerFeedbackActivity.H1(false);
                        return;
                    } else {
                        readerFeedbackActivity.H1(true);
                        return;
                    }
                }
                readerFeedbackActivity.D1();
                return;
            default:
                ReaderMergePdfActivity.n2((ReaderMergePdfActivity) cVar, (Map) obj);
                return;
        }
    }

    @Override // x0.u
    public final x0.s0 m(View view, x0.s0 s0Var) {
        Space space;
        ClearDefaultReaderStep2Activity clearDefaultReaderStep2Activity = (ClearDefaultReaderStep2Activity) this.f26890b;
        ClearDefaultReaderStep2Activity.a aVar = ClearDefaultReaderStep2Activity.C;
        kotlin.jvm.internal.g.e(clearDefaultReaderStep2Activity, ea.a.p("R2gic1cw", "D75gKMPE"));
        kotlin.jvm.internal.g.e(view, ea.a.p("c2Ffbxd5Wm8vc2pwFHIJbVB0C3JlMD4=", "cLRrAB12"));
        ea.a.p("Wm44ZQdz", "CaOo1dTa");
        o0.b a10 = s0Var.a(1);
        kotlin.jvm.internal.g.d(a10, ea.a.p("Wm44ZQdzTGcXdH1uGmUic2xXW24ibzRJj4DQQwZtE2FHLh95A2VMcwZhQHUaQjdyNygbKQ==", "mvic0Ds5"));
        int i10 = a10.f22640b;
        if (i10 > 0 && (space = clearDefaultReaderStep2Activity.f26607z) != null) {
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                ((ViewGroup.MarginLayoutParams) bVar).height = i10;
                space.setLayoutParams(bVar);
            } else {
                throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuWW5MbjpsHSBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXRaYRhvOnRfd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTFd5DnU7UBByUm1z", "6aOqpf6b"));
            }
        }
        return s0Var;
    }
}
