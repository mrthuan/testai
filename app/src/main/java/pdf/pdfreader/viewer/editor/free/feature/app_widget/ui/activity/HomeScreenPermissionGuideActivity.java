package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.activity;

import am.j;
import android.content.Context;
import android.content.Intent;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cg.l;
import com.airbnb.lottie.LottieAnimationView;
import ea.a;
import java.io.Serializable;
import kl.e;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.ShortcutType;
import pdf.pdfreader.viewer.editor.free.utils.event.WidgetEventCenter;
import tf.c;
import tf.d;

/* compiled from: HomeScreenPermissionGuideActivity.kt */
/* loaded from: classes3.dex */
public final class HomeScreenPermissionGuideActivity extends jl.a {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f24827v = 0;

    /* renamed from: t  reason: collision with root package name */
    public final c f24828t = kotlin.a.a(new cg.a<j>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.activity.HomeScreenPermissionGuideActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final j invoke() {
            View inflate = HomeScreenPermissionGuideActivity.this.getLayoutInflater().inflate(R.layout.activity_home_screen_permission_guide, (ViewGroup) null, false);
            int i10 = R.id.home_screen_guide_cl_bg;
            if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_screen_guide_cl_bg)) != null) {
                i10 = R.id.home_screen_guide_iv_back;
                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_screen_guide_iv_back)) != null) {
                    i10 = R.id.home_screen_guide_ll_item01;
                    if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_screen_guide_ll_item01)) != null) {
                        i10 = R.id.home_screen_guide_lottie_view;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_screen_guide_lottie_view);
                        if (lottieAnimationView != null) {
                            i10 = R.id.home_screen_guide_tv_got_it;
                            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_screen_guide_tv_got_it);
                            if (textView != null) {
                                i10 = R.id.home_screen_guide_tv_item02_1;
                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_screen_guide_tv_item02_1)) != null) {
                                    i10 = R.id.home_screen_guide_tv_item02_2;
                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_screen_guide_tv_item02_2)) != null) {
                                        i10 = R.id.home_screen_guide_tv_title;
                                        TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_screen_guide_tv_title);
                                        if (textView2 != null) {
                                            i10 = R.id.home_screen_guide_v_bg;
                                            View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_screen_guide_v_bg);
                                            if (u7 != null) {
                                                return new j((FrameLayout) inflate, lottieAnimationView, textView, textView2, u7);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpG2hCST46IA==", "obz8u5K4").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public ShortcutType f24829u;

    /* compiled from: HomeScreenPermissionGuideActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, ShortcutType shortcutType) {
            g.e(context, "context");
            g.e(shortcutType, "shortcutType");
            Intent intent = new Intent(context, HomeScreenPermissionGuideActivity.class);
            intent.putExtra(ea.a.p("QGgkcgdjF3QmeURl", "5WRUEJhU"), shortcutType);
            context.startActivity(intent);
        }
    }

    @Override // jl.a
    public final void C1() {
        ShortcutType shortcutType;
        int dimensionPixelSize;
        pdf.pdfreader.viewer.editor.free.utils.extension.a.d(this);
        Serializable serializableExtra = getIntent().getSerializableExtra(ea.a.p("QGgkcgdjF3QmeURl", "HNPsoHD5"));
        if (serializableExtra instanceof ShortcutType) {
            shortcutType = (ShortcutType) serializableExtra;
        } else {
            shortcutType = null;
        }
        this.f24829u = shortcutType;
        c cVar = this.f24828t;
        LottieAnimationView lottieAnimationView = ((j) cVar.getValue()).f996b;
        g.d(lottieAnimationView, ea.a.p("UWklZBpuBS4ab1llOmMkZSFudXUvZCZMP3QkaSxWGWV3", "PPIp9P5c"));
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_84);
            } else {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_49);
            }
            bVar.setMarginEnd(dimensionPixelSize);
            lottieAnimationView.setLayoutParams(bVar);
            TextView textView = ((j) cVar.getValue()).c;
            g.d(textView, ea.a.p("LWlfZBBuUC4ybydlJmMaZVBuKXUsZABULEcIdCx0", "bDzQZgeD"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.activity.HomeScreenPermissionGuideActivity$findView$2
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    g.e(it, "it");
                    HomeScreenPermissionGuideActivity homeScreenPermissionGuideActivity = HomeScreenPermissionGuideActivity.this;
                    String p10 = a.p("Q2U5bRpzEWkdbg==", "0hDPJCqe");
                    String p11 = a.p("UHU_cwNlEG0VdV1kDF8xbzBfUWwvY2s=", "b2TL0Ct5");
                    c cVar2 = WidgetEventCenter.f28682a;
                    tn.a.d(homeScreenPermissionGuideActivity, p10, p11, WidgetEventCenter.a(HomeScreenPermissionGuideActivity.this.f24829u), false);
                    HomeScreenPermissionGuideActivity.this.finish();
                }
            });
            TextView textView2 = ((j) cVar.getValue()).f997d;
            String string = getString(R.string.arg_res_0x7f13058a);
            g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHcsZAJlsoDxaDVyNXU7c25wHHJaaSlzI28bXw91XGQLKQ==", "vUs1PWZV"));
            textView2.setText(e.b(string, new ForegroundColorSpan(androidx.core.content.a.getColor(this, R.color.color_100_DD202A))));
            return;
        }
        throw new NullPointerException(ea.a.p("GHUZbEpjFW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiACeQVlSmEaZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdx9kEmUeLjdvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyF21z", "14vujte9"));
    }

    @Override // jl.a
    public final View D1() {
        FrameLayout frameLayout = ((j) this.f24828t.getValue()).f995a;
        g.d(frameLayout, ea.a.p("E2kIZDluDy46bwl0", "tmqfPhzq"));
        return frameLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        String p10 = ea.a.p("Q2U5bRpzEWkdbg==", "wkwafgd3");
        String p11 = ea.a.p("FXUsczFlNm0vdQ9kUV8wb0xfMWwgY2s=", "P4vXADJq");
        c cVar = WidgetEventCenter.f28682a;
        tn.a.d(this, p10, p11, WidgetEventCenter.a(this.f24829u), false);
    }

    @Override // jl.a
    public final void K1() {
    }
}
