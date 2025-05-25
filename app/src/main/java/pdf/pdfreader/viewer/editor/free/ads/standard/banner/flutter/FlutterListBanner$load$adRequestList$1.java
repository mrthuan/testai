package pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.z0;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import gl.n;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import tf.d;

/* compiled from: FlutterListBanner.kt */
/* loaded from: classes3.dex */
public final class FlutterListBanner$load$adRequestList$1 implements ae.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlutterListBanner f24016a;

    /* compiled from: FlutterListBanner.kt */
    /* loaded from: classes3.dex */
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public int f24017a;

        /* renamed from: b  reason: collision with root package name */
        public int f24018b;
        public final /* synthetic */ FlutterListBanner c;

        public a(FlutterListBanner flutterListBanner) {
            this.c = flutterListBanner;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (view == null) {
                return;
            }
            if ((view.getMeasuredWidth() != this.f24017a || view.getMeasuredHeight() != this.f24018b) && view.getParent() != null) {
                this.f24017a = view.getMeasuredWidth();
                this.f24018b = view.getMeasuredHeight();
                Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                g.d(createBitmap, ea.a.p("LHJUYQ1ldWkubStwXXZGbVBhHXU3ZQFXpoDzIDZpHG0ucB9DFm5RaT0uC1IyQjc4DThWKQ==", "kOkEDUth"));
                view.draw(new Canvas(createBitmap));
                FlutterListBanner flutterListBanner = this.c;
                flutterListBanner.f24015o = createBitmap;
                for (n nVar : flutterListBanner.e()) {
                    nVar.g();
                }
            }
        }
    }

    public FlutterListBanner$load$adRequestList$1(BaseHomeListBanner baseHomeListBanner) {
        this.f24016a = baseHomeListBanner;
    }

    public static void f(FlutterListBanner flutterListBanner) {
        g.e(flutterListBanner, ea.a.p("A2gqc3Yw", "FIwCR9uG"));
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.c(flutterListBanner.f(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner$load$adRequestList$1$onAdLoadFailed$3$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ d invoke() {
                    invoke2();
                    return d.f30009a;
                }
            });
        }
    }

    @Override // ae.a
    public final void a(Context context, View view, yd.d dVar) {
        BannerType bannerType;
        int i10;
        int i11;
        int i12;
        int i13;
        g.e(context, "context");
        FlutterListBanner flutterListBanner = this.f24016a;
        flutterListBanner.f24010j = false;
        if (view != null) {
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setDescendantFocusability(393216);
            }
            if (AdUtils.a(context)) {
                boolean D = c1.D(context);
                if (a0.i(context)) {
                    ImageView imageView = (ImageView) view.findViewById(R.id.ad_icon);
                    if (imageView != null) {
                        if (D) {
                            i13 = R.drawable.ic_native_banner_ad_light_rtl;
                        } else {
                            i13 = R.drawable.ic_native_banner_ad_dark_rtl;
                        }
                        imageView.setImageResource(i13);
                    }
                } else {
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.ad_icon);
                    if (imageView2 != null) {
                        if (D) {
                            i10 = R.drawable.ic_native_banner_ad_light;
                        } else {
                            i10 = R.drawable.ic_native_banner_ad_dark;
                        }
                        imageView2.setImageResource(i10);
                    }
                }
                Button button = (Button) view.findViewById(R.id.ad_action_button);
                if (button != null) {
                    if (D) {
                        i11 = R.drawable.bg_native_banner_btn;
                    } else {
                        i11 = R.drawable.bg_native_banner_stroke_btn;
                    }
                    button.setBackgroundResource(i11);
                    if (D) {
                        i12 = R.color.white;
                    } else {
                        i12 = R.color.colorAccent;
                    }
                    button.setTextColor(androidx.core.content.a.getColor(context, i12));
                }
            } else if (a0.i(context)) {
                ImageView imageView3 = (ImageView) view.findViewById(R.id.ad_icon);
                if (imageView3 != null) {
                    imageView3.setImageResource(R.drawable.ic_native_card_ad_rtl);
                }
            } else {
                ImageView imageView4 = (ImageView) view.findViewById(R.id.ad_icon);
                if (imageView4 != null) {
                    imageView4.setImageResource(R.drawable.ic_native_card_ad);
                }
            }
            flutterListBanner.f24003b = view;
            flutterListBanner.f24012l = true;
            view.addOnLayoutChangeListener(new a(flutterListBanner));
        }
        flutterListBanner.a(ea.a.p("IG5wZDVvVmQ=", "COZElGQP"));
        String p10 = ea.a.p("LEI=", "3obOw7hr");
        String str = dVar.f32120b;
        if (g.a(str, p10)) {
            bannerType = BannerType.Native;
        } else if (g.a(str, ea.a.p("Qg==", "7tQu9YJA"))) {
            bannerType = BannerType.Adaptive;
        } else {
            bannerType = BannerType.None;
        }
        flutterListBanner.c = bannerType;
        flutterListBanner.c();
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.c(flutterListBanner.f(), true, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner$load$adRequestList$1$onAdLoad$2
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ d invoke() {
                    invoke2();
                    return d.f30009a;
                }
            });
        }
    }

    @Override // ae.c
    public final void b(Context context, yd.d dVar) {
        g.e(context, "context");
        AppOpenManager.c().f23907g = false;
        this.f24016a.a(ea.a.p("LG43ZHpsUWNr", "knCv981C"));
    }

    @Override // ae.c
    public final void c(yd.a aVar) {
        FlutterListBanner flutterListBanner = this.f24016a;
        flutterListBanner.f24010j = false;
        flutterListBanner.f24009i = true;
        flutterListBanner.a("onAdLoadFailed " + aVar);
        flutterListBanner.c = BannerType.Native;
        flutterListBanner.k();
        for (n nVar : flutterListBanner.e()) {
            nVar.f();
        }
        if (g.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.c(flutterListBanner.f(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner$load$adRequestList$1$onAdLoadFailed$2
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ d invoke() {
                        invoke2();
                        return d.f30009a;
                    }
                });
                return;
            }
            return;
        }
        w0.a().f28791b.execute(new z0(flutterListBanner, 21));
    }

    @Override // ae.a
    public final void d() {
    }
}
