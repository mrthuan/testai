package am;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;

/* compiled from: ItemImageAdjustThumbBinding.java */
/* loaded from: classes3.dex */
public final class n1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1166a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f1167b;
    public final ViewGroup c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f1168d;

    /* renamed from: e  reason: collision with root package name */
    public final View f1169e;

    /* renamed from: f  reason: collision with root package name */
    public final View f1170f;

    /* renamed from: g  reason: collision with root package name */
    public final View f1171g;

    public n1(FrameLayout frameLayout, FrameLayout frameLayout2, View view, AppCompatImageView appCompatImageView, ProgressBar progressBar, FrameLayout frameLayout3) {
        this.c = frameLayout;
        this.f1168d = frameLayout2;
        this.f1170f = view;
        this.f1167b = appCompatImageView;
        this.f1171g = progressBar;
        this.f1169e = frameLayout3;
    }

    public static n1 a(View view) {
        int i10 = R.id.iv_progress_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(view, R.id.iv_progress_close);
        if (appCompatImageView != null) {
            i10 = R.id.ll_operate_container;
            LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(view, R.id.ll_operate_container);
            if (linearLayout != null) {
                i10 = R.id.progressbar_overlay;
                ReaderRoundProgressBar readerRoundProgressBar = (ReaderRoundProgressBar) com.google.android.play.core.assetpacks.c.u(view, R.id.progressbar_overlay);
                if (readerRoundProgressBar != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(view, R.id.tv_desc);
                    if (textView != null) {
                        return new n1(constraintLayout, appCompatImageView, linearLayout, readerRoundProgressBar, constraintLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("dGkBc1FuDSA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "iK9r8j7y").concat(view.getResources().getResourceName(i10)));
    }

    @Override // i2.a
    public final View b() {
        switch (this.f1166a) {
            case 0:
                return (FrameLayout) this.c;
            case 1:
                return c();
            default:
                return c();
        }
    }

    public final ConstraintLayout c() {
        int i10 = this.f1166a;
        ViewGroup viewGroup = this.c;
        switch (i10) {
            case 1:
                return (ConstraintLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public n1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Space space, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Space space2) {
        this.c = constraintLayout;
        this.f1168d = constraintLayout2;
        this.f1169e = space;
        this.f1167b = appCompatImageView;
        this.f1170f = appCompatTextView;
        this.f1171g = space2;
    }

    public n1(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout, ReaderRoundProgressBar readerRoundProgressBar, ConstraintLayout constraintLayout2, TextView textView) {
        this.c = constraintLayout;
        this.f1167b = appCompatImageView;
        this.f1168d = linearLayout;
        this.f1169e = readerRoundProgressBar;
        this.f1170f = constraintLayout2;
        this.f1171g = textView;
    }
}
