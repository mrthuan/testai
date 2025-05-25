package pdf.pdfreader.viewer.editor.free.office;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: OfficeReaderActivity.kt */
/* loaded from: classes3.dex */
public final class t extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26138a;

    public t(OfficeReaderActivity officeReaderActivity) {
        this.f26138a = officeReaderActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        View view;
        kotlin.jvm.internal.g.e(animation, "animation");
        super.onAnimationEnd(animation);
        OfficeReaderActivity officeReaderActivity = this.f26138a;
        ImageView imageView = officeReaderActivity.K1;
        if (imageView != null && (view = officeReaderActivity.L1) != null) {
            view.setTranslationX(imageView.getTranslationX());
        }
        officeReaderActivity.j3();
        if (officeReaderActivity.f25960r2 == 0) {
            officeReaderActivity.f25960r2 = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        }
    }
}
