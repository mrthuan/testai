package pdf.pdfreader.viewer.editor.free.office;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptRecyclerView;

/* compiled from: OfficeReaderActivity.kt */
/* loaded from: classes3.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26130a;

    public p(OfficeReaderActivity officeReaderActivity) {
        this.f26130a = officeReaderActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int visibility;
        View view;
        kotlin.jvm.internal.g.e(animation, "animation");
        super.onAnimationEnd(animation);
        OfficeReaderActivity officeReaderActivity = this.f26130a;
        ImageView imageView = officeReaderActivity.K1;
        if (imageView != null && (view = officeReaderActivity.L1) != null) {
            view.setTranslationX(imageView.getTranslationX());
        }
        View view2 = officeReaderActivity.Y;
        if (view2 != null) {
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(officeReaderActivity)) {
                visibility = 8;
            } else {
                InterceptRecyclerView interceptRecyclerView = officeReaderActivity.X;
                if (interceptRecyclerView != null) {
                    visibility = interceptRecyclerView.getVisibility();
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "x3ExGPrJ"));
                    throw null;
                }
            }
            view2.setVisibility(visibility);
            officeReaderActivity.j3();
            if (officeReaderActivity.f25960r2 == 0) {
                officeReaderActivity.f25960r2 = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
                return;
            }
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtMXm5l", "8ln4evkU"));
        throw null;
    }
}
