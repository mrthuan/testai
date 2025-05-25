package oo;

import am.e0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import i2.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity;

/* compiled from: BaseVMBottomInputDialog.kt */
/* loaded from: classes3.dex */
public abstract class k<VB extends i2.a> extends f {

    /* renamed from: n  reason: collision with root package name */
    public e0 f23549n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PDFCreatorActivity pDFCreatorActivity) {
        super(pDFCreatorActivity, (int) R.style.BaseBottomInputDialog);
        kotlin.jvm.internal.g.e(pDFCreatorActivity, ea.a.p("Cm8odD94dA==", "qoiFZXnn"));
    }

    @Override // oo.f
    public final View p(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        View inflate = layoutInflater.inflate(R.layout.dialog_page_count_set, (ViewGroup) frameLayout, false);
        int i10 = R.id.bottom_layout;
        if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottom_layout)) != null) {
            i10 = R.id.bottom_space;
            if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottom_space)) != null) {
                i10 = R.id.dia_clear_content;
                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.dia_clear_content);
                if (appCompatImageView != null) {
                    i10 = R.id.dia_enter_page_count_cancel;
                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.dia_enter_page_count_cancel);
                    if (textView != null) {
                        i10 = R.id.dia_enter_page_count_et;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.dia_enter_page_count_et);
                        if (appCompatEditText != null) {
                            i10 = R.id.dia_enter_page_count_ok;
                            TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.dia_enter_page_count_ok);
                            if (textView2 != null) {
                                i10 = R.id.iv_icon;
                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_icon)) != null) {
                                    i10 = R.id.pwd_rl;
                                    if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pwd_rl)) != null) {
                                        i10 = R.id.title_tv;
                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.title_tv)) != null) {
                                            i10 = R.id.wrong_ll;
                                            if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.wrong_ll)) != null) {
                                                i10 = R.id.wrong_space;
                                                if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.wrong_space)) != null) {
                                                    i10 = R.id.wrong_tv;
                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.wrong_tv)) != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                        e0 e0Var = new e0(constraintLayout, appCompatImageView, textView, appCompatEditText, textView2);
                                                        ea.a.p("Wm4tbBJ0BygbblJsCHQzcmggUW8odCJpC2UcLHNmKmxAZSk=", "enSKsVMz");
                                                        this.f23549n = e0Var;
                                                        return constraintLayout;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpMGhDSSA6IA==", "DcdpAj5W").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // oo.f
    public final int r() {
        return 0;
    }
}
