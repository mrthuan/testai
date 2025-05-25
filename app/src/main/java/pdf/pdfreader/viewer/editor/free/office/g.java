package pdf.pdfreader.viewer.editor.free.office;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import x0.s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements x0.u, ro.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26101a;

    public /* synthetic */ g(OfficeReaderActivity officeReaderActivity) {
        this.f26101a = officeReaderActivity;
    }

    @Override // ro.d
    public final void g(MotionEvent motionEvent) {
        String str = OfficeReaderActivity.D2;
        String p10 = ea.a.p("R2gic1cw", "LXg5W0FL");
        OfficeReaderActivity officeReaderActivity = this.f26101a;
        kotlin.jvm.internal.g.e(officeReaderActivity, p10);
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            officeReaderActivity.K2();
        }
    }

    @Override // x0.u
    public final s0 m(View view, s0 s0Var) {
        String str = OfficeReaderActivity.D2;
        String p10 = ea.a.p("O2hYc10w", "K6WKlIj3");
        OfficeReaderActivity officeReaderActivity = this.f26101a;
        kotlin.jvm.internal.g.e(officeReaderActivity, p10);
        kotlin.jvm.internal.g.e(view, ea.a.p("cmEbbwd5HG89c0ZwVXI2bV10N3JpMD4=", "wlNuiqte"));
        ea.a.p("Pm4WZTtz", "fsWeOxqr");
        o0.b a10 = s0Var.a(7);
        kotlin.jvm.internal.g.d(a10, ea.a.p("IW4QZSZzRmctdC9uR2UjcxBXO24tb0FJloDXQz5tMmE8Ljd5ImVGczFzEmVZQjZySyh7KQ==", "QpHcRhHU"));
        boolean z10 = officeReaderActivity.D1;
        int i10 = a10.f22640b;
        if ((z10 || i10 != 0) && officeReaderActivity.R1) {
            FrameLayout frameLayout = officeReaderActivity.V;
            if (frameLayout != null) {
                if (i10 <= 0) {
                    i10 = frameLayout.getPaddingTop();
                }
                int i11 = a10.f22641d;
                if (i11 <= 0) {
                    FrameLayout frameLayout2 = officeReaderActivity.V;
                    if (frameLayout2 != null) {
                        i11 = frameLayout2.getPaddingBottom();
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("QHAnYQBoMG8ddA==", "WWQRaZxJ"));
                        throw null;
                    }
                }
                frameLayout.setPadding(0, i10, 0, i11);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("PHBdYQpoZW81dA==", "i6ULUKOl"));
                throw null;
            }
        }
        return s0Var;
    }
}
