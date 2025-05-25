package pdf.pdfreader.viewer.editor.free.ads.standard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.f;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.anim.LangBannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import zd.d;

/* compiled from: LanguageMutableNative.kt */
/* loaded from: classes3.dex */
public final class LanguageMutableNative {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: i  reason: collision with root package name */
    public static LanguageMutableNative f23976i;

    /* renamed from: a  reason: collision with root package name */
    public d f23978a;

    /* renamed from: b  reason: collision with root package name */
    public hl.a f23979b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23980d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23981e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23982f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23983g;

    /* renamed from: j  reason: collision with root package name */
    public static final String f23977j = ea.a.p("I2FfZwxhUGUFYyJvGnMNX15leQ==", "1tbWDEFm");

    /* renamed from: h  reason: collision with root package name */
    public static final a f23975h = new a();

    /* compiled from: LanguageMutableNative.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final synchronized LanguageMutableNative a() {
            LanguageMutableNative languageMutableNative;
            languageMutableNative = LanguageMutableNative.f23976i;
            if (languageMutableNative == null) {
                languageMutableNative = new LanguageMutableNative();
                LanguageMutableNative.f23976i = languageMutableNative;
            }
            return languageMutableNative;
        }
    }

    public static void a(String str) {
        String str2;
        String str3;
        FlutterEncryptConfig.f25878a.getClass();
        if (FlutterEncryptConfig.b()) {
            str2 = "X2ElZwZhBWU_dUBhC2wzTiV0W3YjQQ==";
            str3 = "cTuB0TUz";
        } else {
            str2 = "CWEeZzFhI2UFdRJhVmwyTll0O3Zl";
            str3 = "D9epDD3y";
        }
        String m10 = f.m(ea.a.p(str2, str3), " ", str);
        int i10 = zk.a.f32399a;
        t1.b(m10);
    }

    public static void b(boolean z10) {
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.c(f23977j, z10, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.LanguageMutableNative$sendFlutterResultEvent$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }
            });
        }
    }

    public final void c(Activity context, FrameLayout frameLayout, int i10, boolean z10) {
        boolean z11;
        int i11;
        boolean z12;
        TextView textView;
        int i12;
        int i13;
        int i14;
        g.e(context, "context");
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("Q3IubRp1DyAHc1FyRSAlay1wEmwnbiR1NWdVTRF0DGJfZQVhB2kUZVJsW2Fk", "T0dmQOE2");
            int i15 = zk.a.f32399a;
            t1.b(p10);
            return;
        }
        if (this.f23978a != null && !this.f23980d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            a(ea.a.p("QGgkd1NmA2keZVAgB28iICF4W3MyICJk", "5mWnTXLH"));
            return;
        }
        if (z10) {
            i11 = context.getResources().getDimensionPixelSize(R.dimen.dp_71);
        } else {
            float p02 = t0.p0(context) * 0.62f;
            float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp_300);
            if (p02 > dimensionPixelSize) {
                p02 = dimensionPixelSize;
            }
            i11 = (int) p02;
        }
        try {
            if (this.f23978a != null) {
                frameLayout.removeAllViews();
                frameLayout.setVisibility(0);
                this.f23981e = z10;
                d dVar = this.f23978a;
                if (dVar != null && dVar.i(context, frameLayout, i10, i11)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    this.f23982f = true;
                    hl.a aVar = this.f23979b;
                    if (aVar != null) {
                        aVar.f1(BannerType.Adaptive);
                    }
                    if (z10) {
                        boolean D = c1.D(context);
                        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.ad_icon);
                        if (imageView != null) {
                            if (D) {
                                i14 = R.drawable.ic_lang_native_banner_ad_light;
                            } else {
                                i14 = R.drawable.ic_lang_native_banner_ad_dark;
                            }
                            imageView.setImageResource(i14);
                        }
                        Button button = (Button) frameLayout.findViewById(R.id.ad_action_button);
                        if (button != null) {
                            if (D) {
                                i12 = R.drawable.bg_native_banner_btn;
                            } else {
                                i12 = R.drawable.bg_native_banner_stroke_btn;
                            }
                            button.setBackgroundResource(i12);
                            if (D) {
                                i13 = R.color.white;
                            } else {
                                i13 = R.color.colorAccent;
                            }
                            button.setTextColor(androidx.core.content.a.getColor(context, i13));
                        }
                    } else {
                        no.f.b(context).getClass();
                        if (no.f.f() && (textView = (TextView) frameLayout.findViewById(R.id.ad_action_button)) != null) {
                            textView.setText(context.getResources().getString(R.string.arg_res_0x7f130024));
                            textView.setAllCaps(false);
                        }
                    }
                    a(ea.a.p("QGgkd1NzF2MRZUdz", "GDDLHxra"));
                    return;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(ea.a.p("PGhed1lmVmk2ZWQ=", "bbnTw1FD"));
    }

    public final void d(FrameLayout frameLayout, LangBannerLoadingAnimation langBannerLoadingAnimation) {
        boolean z10;
        ViewGroup viewGroup;
        if (this.f23978a != null && !this.f23980d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        frameLayout.setVisibility(0);
        frameLayout.removeAllViews();
        ViewParent parent = langBannerLoadingAnimation.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(langBannerLoadingAnimation);
        }
        frameLayout.addView(langBannerLoadingAnimation);
        langBannerLoadingAnimation.r();
    }
}
