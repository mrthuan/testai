package pdf.pdfreader.viewer.editor.free.feature.billing.dialog;

import a6.h;
import am.l0;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import java.text.DecimalFormat;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.r;
import oo.l;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.billing.BillingRepository;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.extension.i;
import u4.j;

/* compiled from: SubscribeRetainCoffeeDialog.kt */
/* loaded from: classes3.dex */
public final class a extends l<l0> {
    public static final /* synthetic */ int C = 0;
    public final String A;
    public final long B;

    /* renamed from: z  reason: collision with root package name */
    public final String f24873z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, String str2, long j10) {
        super(context);
        g.e(context, ea.a.p("DW8kdC14dA==", "vEnJHYAh"));
        g.e(str, ea.a.p("R3IiYR9EA3k=", "XjylLh0d"));
        g.e(str2, ea.a.p("SmUqciNyC2Nl", "Jb5DIIPe"));
        this.f24873z = str;
        this.A = str2;
        this.B = j10;
    }

    @Override // oo.g
    public final boolean A() {
        return false;
    }

    @Override // oo.l
    public final l0 H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_subscription_retain_coffee, viewGroup, false);
        int i10 = R.id.continue_anim;
        if (((LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continue_anim)) != null) {
            i10 = R.id.continue_tv;
            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continue_tv);
            if (textView != null) {
                i10 = R.id.guideline1;
                if (((Guideline) com.google.android.play.core.assetpacks.c.u(inflate, R.id.guideline1)) != null) {
                    i10 = R.id.guideline2;
                    if (((Guideline) com.google.android.play.core.assetpacks.c.u(inflate, R.id.guideline2)) != null) {
                        i10 = R.id.iv_circle_approximately_equal;
                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_circle_approximately_equal)) != null) {
                            i10 = R.id.iv_coffee_cup;
                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_coffee_cup)) != null) {
                                i10 = R.id.iv_icon_approximately_equal;
                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_icon_approximately_equal)) != null) {
                                    i10 = R.id.iv_icon_coffee;
                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_icon_coffee)) != null) {
                                        i10 = R.id.iv_sub_bg_orange;
                                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_sub_bg_orange)) != null) {
                                            i10 = R.id.iv_sub_bg_purple;
                                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_sub_bg_purple)) != null) {
                                                i10 = R.id.iv_sub_v;
                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_sub_v)) != null) {
                                                    i10 = R.id.ll_coffee_title_container;
                                                    if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_coffee_title_container)) != null) {
                                                        i10 = R.id.retain_cancel;
                                                        TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_cancel);
                                                        if (textView2 != null) {
                                                            i10 = R.id.retain_desc_tv;
                                                            TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_desc_tv);
                                                            if (textView3 != null) {
                                                                i10 = R.id.retain_top_bg;
                                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retain_top_bg)) != null) {
                                                                    i10 = R.id.sub_title_con;
                                                                    if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.sub_title_con)) != null) {
                                                                        i10 = R.id.title_tv;
                                                                        TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.title_tv);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.tv_coffee_price;
                                                                            TextView textView5 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_coffee_price);
                                                                            if (textView5 != null) {
                                                                                i10 = R.id.tv_coffee_title;
                                                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_coffee_title)) != null) {
                                                                                    i10 = R.id.tv_sub_price_month;
                                                                                    TextView textView6 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_sub_price_month);
                                                                                    if (textView6 != null) {
                                                                                        i10 = R.id.tv_sub_pro;
                                                                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_sub_pro)) != null) {
                                                                                            i10 = R.id.tv_sub_title;
                                                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_sub_title)) != null) {
                                                                                                i10 = R.id.tv_title_des;
                                                                                                TextView textView7 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_title_des);
                                                                                                if (textView7 != null) {
                                                                                                    l0 l0Var = new l0((ConstraintLayout) inflate, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                                                                    ea.a.p("LG5RbBt0USghbgBsVXQychQgMW8ndFdpGmUDLHFmI2w2ZSk=", "sHE7z41T");
                                                                                                    return l0Var;
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpE2hOSQI6IA==", "DLvlgnFC").concat(inflate.getResources().getResourceName(i10)));
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

    @Override // oo.g
    public final void z() {
        String c;
        VB vb2 = this.f23550y;
        g.b(vb2);
        ((l0) vb2).c.setOnClickListener(new u4.g(this, 2));
        VB vb3 = this.f23550y;
        g.b(vb3);
        ((l0) vb3).f1060b.setOnClickListener(new j(this, 4));
        VB vb4 = this.f23550y;
        g.b(vb4);
        TextPaint paint = ((l0) vb4).f1062e.getPaint();
        g.d(paint, ea.a.p("LWlfZBBuUC4uaT5sEFQeLkVhB250", "dvx88Igo"));
        VB vb5 = this.f23550y;
        g.b(vb5);
        paint.setShader(new LinearGradient(0.0f, 0.0f, paint.measureText(((l0) vb5).f1062e.getText().toString()), 0.0f, new int[]{androidx.core.content.a.getColor(getContext(), R.color.color_100_FF7D0A), androidx.core.content.a.getColor(getContext(), R.color.color_100_FF3233), androidx.core.content.a.getColor(getContext(), R.color.color_100_FF3093)}, (float[]) null, Shader.TileMode.CLAMP));
        VB vb6 = this.f23550y;
        g.b(vb6);
        ((l0) vb6).f1062e.invalidate();
        VB vb7 = this.f23550y;
        g.b(vb7);
        ((l0) vb7).f1065h.setText(getContext().getString(R.string.arg_res_0x7f1302e8, getContext().getString(R.string.arg_res_0x7f13036c)));
        VB vb8 = this.f23550y;
        g.b(vb8);
        Context context = getContext();
        BillingConfigImpl.c.getClass();
        ((l0) vb8).f1063f.setText(context.getString(R.string.arg_res_0x7f1300b3, ((ol.a) ((r) BillingConfigImpl.f24863q.getValue()).b()).f23472a));
        VB vb9 = this.f23550y;
        g.b(vb9);
        l0 l0Var = (l0) vb9;
        Context context2 = getContext();
        Object[] objArr = new Object[1];
        BillingRepository billingRepository = BillingRepository.f24041a;
        String formattedPrice = this.A;
        g.e(formattedPrice, "formattedPrice");
        String b10 = pdf.pdfreader.viewer.editor.free.billing.util.c.b(formattedPrice);
        float f10 = (((float) this.B) / 12.0f) / 1000000.0f;
        if (f10 <= 0.0f) {
            c = h.c(b10, "0.01");
        } else {
            StringBuilder sb2 = new StringBuilder(ea.a.p("Ay57MA==", "53qEYe5Q"));
            float f11 = 100 * f10;
            while (f11 < 1.0f) {
                f11 *= 10;
                sb2.append(ea.a.p("MA==", "w7wLtBGr"));
            }
            c = h.c(b10, new DecimalFormat(sb2.toString()).format(Float.valueOf(f10)));
        }
        objArr[0] = c;
        l0Var.f1064g.setText(context2.getString(R.string.arg_res_0x7f130195, objArr));
        VB vb10 = this.f23550y;
        g.b(vb10);
        ((l0) vb10).f1061d.setText(getContext().getString(R.string.arg_res_0x7f130263, formattedPrice));
        VB vb11 = this.f23550y;
        g.b(vb11);
        ((l0) vb11).f1060b.setText(getContext().getString(R.string.arg_res_0x7f1304ea, this.f24873z));
    }
}
