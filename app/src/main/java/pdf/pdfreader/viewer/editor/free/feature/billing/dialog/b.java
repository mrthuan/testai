package pdf.pdfreader.viewer.editor.free.feature.billing.dialog;

import am.k0;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import d9.f;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import kotlin.text.k;
import oo.l;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.extension.i;
import qb.j0;

/* compiled from: SubscribeRetainDialog.kt */
/* loaded from: classes3.dex */
public final class b extends l<k0> {
    public static final /* synthetic */ int B = 0;
    public final String A;

    /* renamed from: z  reason: collision with root package name */
    public final String f24874z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, String str2) {
        super(context);
        g.e(context, ea.a.p("LG9fdBx4dA==", "c8jh6ge2"));
        g.e(str, ea.a.p("R3IiYR9EA3k=", "3MX2BSIt"));
        g.e(str2, ea.a.p("SmUqciNyC2Nl", "V5c6LrgF"));
        this.f24874z = str;
        this.A = str2;
    }

    @Override // oo.g
    public final boolean A() {
        return false;
    }

    @Override // oo.g
    public final boolean B() {
        return false;
    }

    @Override // oo.g
    public final boolean D() {
        return false;
    }

    @Override // oo.l
    public final k0 H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_subscription_retain, viewGroup, false);
        int i10 = R.id.continue_anim;
        if (((LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continue_anim)) != null) {
            i10 = R.id.continue_tv;
            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continue_tv);
            if (textView != null) {
                i10 = R.id.retain_cancel;
                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_cancel);
                if (textView2 != null) {
                    i10 = R.id.retain_desc_tv;
                    TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_desc_tv);
                    if (textView3 != null) {
                        i10 = R.id.retain_right1_tv;
                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_right1_tv)) != null) {
                            i10 = R.id.retain_right2_tv;
                            TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_right2_tv);
                            if (textView4 != null) {
                                i10 = R.id.retain_right3_tv;
                                TextView textView5 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_right3_tv);
                                if (textView5 != null) {
                                    i10 = R.id.retain_rights1_img;
                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_rights1_img)) != null) {
                                        i10 = R.id.retain_rights2_img;
                                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_rights2_img)) != null) {
                                            i10 = R.id.retain_rights3_img;
                                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_rights3_img)) != null) {
                                                i10 = R.id.retain_top_bg;
                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_top_bg)) != null) {
                                                    i10 = R.id.rights1_ll;
                                                    if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rights1_ll)) != null) {
                                                        i10 = R.id.rights2_ll;
                                                        if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rights2_ll)) != null) {
                                                            i10 = R.id.rights3_ll;
                                                            if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rights3_ll)) != null) {
                                                                i10 = R.id.title_tv;
                                                                TextView textView6 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.title_tv);
                                                                if (textView6 != null) {
                                                                    k0 k0Var = new k0((ConstraintLayout) inflate, textView, textView2, textView3, textView4, textView5, textView6);
                                                                    ea.a.p("HG4JbBB0FyghbgBsVXQychQgMW8ndFdpGmUDLHFmI2wGZSk=", "o9uoqrP7");
                                                                    return k0Var;
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
                }
            }
        }
        throw new NullPointerException(ea.a.p("AWkLc1BuKyA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "MiLx9LRV").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // oo.g, com.google.android.material.bottomsheet.b, l.p, androidx.activity.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            i.a(window, true);
            window.setNavigationBarColor(-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo.g
    public final void z() {
        VB vb2 = this.f23550y;
        g.b(vb2);
        ((k0) vb2).c.setOnClickListener(new f(this, 3));
        VB vb3 = this.f23550y;
        g.b(vb3);
        ((k0) vb3).f1025b.setOnClickListener(new j0(this, 3));
        Context context = getContext();
        String str = this.f24874z;
        String string = context.getString(R.string.arg_res_0x7f130175, str);
        g.d(string, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFptoDDXwthNF9HciJhH18FcAYsFHQbaTdsAGFLKQ==", "TeoMLNl5"));
        VB vb4 = this.f23550y;
        g.b(vb4);
        k0 k0Var = (k0) vb4;
        Context context2 = getContext();
        g.d(context2, ea.a.p("UG8ldBZ4dA==", "JNbD0zkE"));
        String obj = string.toString();
        if (k.O(obj, ea.a.p("f2I-", "EeCqIG1O"), false)) {
            try {
                int V = k.V(obj, ea.a.p("BGI-", "YA8DuHyX"), 0, false, 6);
                int V2 = k.V(obj, ea.a.p("ZC8PPg==", "IdXm2M7e"), 0, false, 6) - 3;
                SpannableString spannableString = new SpannableString(j.K(j.K(obj, ea.a.p("c2I-", "bDxEOXlV"), ""), ea.a.p("RC8sPg==", "JhxNBCU7"), ""));
                spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(context2, R.color.colorAccent)), V, V2, 18);
                spannableString.setSpan(new RelativeSizeSpan(1.2f), V, V2, 18);
                string = spannableString;
            } catch (Throwable unused) {
            }
        }
        k0Var.f1029g.setText(string);
        if (g.a(str, ea.a.p("Nw==", "Za0ctowY"))) {
            VB vb5 = this.f23550y;
            g.b(vb5);
            ((k0) vb5).f1027e.setText(R.string.arg_res_0x7f13004f);
            VB vb6 = this.f23550y;
            g.b(vb6);
            ((k0) vb6).f1028f.setText(R.string.arg_res_0x7f130193);
        } else {
            VB vb7 = this.f23550y;
            g.b(vb7);
            ((k0) vb7).f1027e.setText(R.string.arg_res_0x7f13001f);
            VB vb8 = this.f23550y;
            g.b(vb8);
            ((k0) vb8).f1028f.setText(R.string.arg_res_0x7f13007e);
        }
        VB vb9 = this.f23550y;
        g.b(vb9);
        ((k0) vb9).f1026d.setText(androidx.activity.f.m(getContext().getString(R.string.arg_res_0x7f13016d, str, this.A), "\n", getContext().getString(R.string.arg_res_0x7f130098)));
    }
}
