package v4;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.a;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import ge.d;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import zd.d;

/* compiled from: PangleNativeCard.kt */
/* loaded from: classes.dex */
public final class q extends be.d {
    public j3.h c;

    /* renamed from: e  reason: collision with root package name */
    public int f30604e;

    /* renamed from: f  reason: collision with root package name */
    public a.InterfaceC0036a f30605f;

    /* renamed from: i  reason: collision with root package name */
    public float f30608i;

    /* renamed from: j  reason: collision with root package name */
    public PAGNativeAd f30609j;

    /* renamed from: b  reason: collision with root package name */
    public final String f30602b = "PangleNativeCard";

    /* renamed from: d  reason: collision with root package name */
    public String f30603d = "";

    /* renamed from: g  reason: collision with root package name */
    public String f30606g = "";

    /* renamed from: h  reason: collision with root package name */
    public int f30607h = R.layout.ad_native_card;

    /* compiled from: PangleNativeCard.kt */
    /* loaded from: classes.dex */
    public static final class a implements d.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ImageView f30611b;

        public a(ImageView imageView) {
            this.f30611b = imageView;
        }

        @Override // ge.d.a
        public final void a(Bitmap bitmap) {
            kotlin.jvm.internal.g.e(bitmap, "bitmap");
            Object lock = q.this.f5405a;
            kotlin.jvm.internal.g.d(lock, "lock");
            ImageView imageView = this.f30611b;
            synchronized (lock) {
                imageView.setImageBitmap(bitmap);
                tf.d dVar = tf.d.f30009a;
            }
        }

        @Override // ge.d.a
        public final void b() {
            Object lock = q.this.f5405a;
            kotlin.jvm.internal.g.d(lock, "lock");
            ImageView imageView = this.f30611b;
            synchronized (lock) {
                imageView.setVisibility(8);
                tf.d dVar = tf.d.f30009a;
            }
        }
    }

    /* compiled from: PangleNativeCard.kt */
    /* loaded from: classes.dex */
    public static final class b implements PAGNativeAdInteractionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f30612a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q f30613b;

        public b(Context context, q qVar) {
            this.f30612a = context;
            this.f30613b = qVar;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdClicked() {
            fe.a a10 = fe.a.a();
            StringBuilder sb2 = new StringBuilder();
            q qVar = this.f30613b;
            a6.h.k(sb2, qVar.f30602b, ":onAdClicked", a10);
            a.InterfaceC0036a interfaceC0036a = qVar.f30605f;
            if (interfaceC0036a != null) {
                interfaceC0036a.b(this.f30612a, new yd.d("PG", "NC", qVar.f30606g));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdDismissed() {
            fe.a a10 = fe.a.a();
            StringBuilder sb2 = new StringBuilder();
            q qVar = this.f30613b;
            a6.h.k(sb2, qVar.f30602b, ":onAdDismissed", a10);
            a.InterfaceC0036a interfaceC0036a = qVar.f30605f;
            if (interfaceC0036a != null) {
                interfaceC0036a.f(this.f30612a);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdShowed() {
            fe.a a10 = fe.a.a();
            StringBuilder sb2 = new StringBuilder();
            q qVar = this.f30613b;
            a6.h.k(sb2, qVar.f30602b, ":onAdShowed", a10);
            a.InterfaceC0036a interfaceC0036a = qVar.f30605f;
            if (interfaceC0036a != null) {
                interfaceC0036a.g(this.f30612a);
            }
        }
    }

    /* compiled from: PangleNativeCard.kt */
    /* loaded from: classes.dex */
    public static final class c implements g {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30615b;
        public final /* synthetic */ a.InterfaceC0036a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f30616d;

        public c(Activity activity, d.a aVar, Context context) {
            this.f30615b = activity;
            this.c = aVar;
            this.f30616d = context;
        }

        @Override // v4.g
        public final void a(boolean z10) {
            q qVar = q.this;
            if (z10) {
                String str = qVar.f30606g;
                Activity activity = this.f30615b;
                Context applicationContext = activity.getApplicationContext();
                try {
                    PAGNativeAd.loadAd(str, new PAGNativeRequest(), new s(qVar, applicationContext, activity));
                    return;
                } catch (Throwable th2) {
                    fe.a.a().c(th2);
                    a.InterfaceC0036a interfaceC0036a = qVar.f30605f;
                    if (interfaceC0036a != null) {
                        interfaceC0036a.a(applicationContext, new yd.a(qVar.f30602b + ":loadAd exception " + th2.getMessage() + '}', 0));
                        return;
                    }
                    return;
                }
            }
            this.c.a(this.f30616d, new yd.a(androidx.activity.r.g(new StringBuilder(), qVar.f30602b, ": init failed"), 0));
            a6.h.k(new StringBuilder(), qVar.f30602b, ": init failed", fe.a.a());
        }
    }

    @Override // be.a
    public final void a(Activity activity) {
        this.f30609j = null;
        this.f30605f = null;
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30602b);
        sb2.append('@');
        return b.a.d(this.f30606g, sb2);
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        kotlin.jvm.internal.g.e(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30602b;
        a6.h.k(sb2, str, ":load", a10);
        if (applicationContext != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f30605f = interfaceC0036a;
            try {
                this.f30608i = applicationContext.getResources().getDisplayMetrics().widthPixels;
                this.c = hVar;
                Bundle bundle = (Bundle) hVar.c;
                kotlin.jvm.internal.g.d(bundle, "adConfig.params");
                String string = bundle.getString("app_id", "");
                kotlin.jvm.internal.g.d(string, "params.getString(KEY_APP_ID, \"\")");
                this.f30603d = string;
                this.f30604e = bundle.getInt("app_icon", this.f30604e);
                this.f30607h = bundle.getInt("layout_id", this.f30607h);
                this.f30608i = bundle.getFloat("cover_width", this.f30608i);
                if (TextUtils.isEmpty(this.f30603d)) {
                    ((d.a) interfaceC0036a).a(applicationContext, new yd.a(str + ":appId is empty", 0));
                    fe.a a11 = fe.a.a();
                    a11.b(str + ":appId is empty");
                    return;
                }
                j3.h hVar2 = this.c;
                if (hVar2 != null) {
                    String str2 = (String) hVar2.f19039b;
                    kotlin.jvm.internal.g.d(str2, "adConfig.id");
                    this.f30606g = str2;
                    String str3 = v4.b.f30540a;
                    v4.b.a(activity, this.f30603d, this.f30604e, new c(activity, (d.a) interfaceC0036a, applicationContext));
                    return;
                }
                kotlin.jvm.internal.g.i("adConfig");
                throw null;
            } catch (Throwable th2) {
                fe.a.a().c(th2);
                StringBuilder g10 = a0.d.g(str, ":loadAd exception ");
                g10.append(th2.getMessage());
                g10.append('}');
                ((d.a) interfaceC0036a).a(applicationContext, new yd.a(g10.toString(), 0));
            }
        } else if (interfaceC0036a != null) {
            ((d.a) interfaceC0036a).a(applicationContext, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
        } else {
            throw new IllegalArgumentException(a6.h.c(str, ":Please check MediationListener is right."));
        }
    }

    @Override // be.d
    public final View j(Activity activity, int i10, int i11) {
        String str;
        PAGNativeAdData nativeAdData;
        kotlin.jvm.internal.g.e(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.f30602b;
        a6.h.k(sb2, str2, ":getAdView", a10);
        try {
            PAGNativeAd pAGNativeAd = this.f30609j;
            if (pAGNativeAd != null && (nativeAdData = pAGNativeAd.getNativeAdData()) != null) {
                View inflate = LayoutInflater.from(activity).inflate(i10, (ViewGroup) null);
                kotlin.jvm.internal.g.c(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) inflate;
                TextView textView = (TextView) viewGroup.findViewById(R.id.ad_title_textview);
                TextView textView2 = (TextView) viewGroup.findViewById(R.id.ad_describe_textview);
                Button button = (Button) viewGroup.findViewById(R.id.ad_action_button);
                ImageView icon = (ImageView) viewGroup.findViewById(R.id.ad_icon_imageview);
                LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.ad_choices_linearLayout);
                LinearLayout linearLayout2 = (LinearLayout) viewGroup.findViewById(R.id.ad_cover_mediaview);
                ((ImageView) viewGroup.findViewById(R.id.ad_cover_imageview)).setVisibility(8);
                linearLayout2.setVisibility(0);
                try {
                    if (i11 != -1) {
                        str = str2;
                        linearLayout2.addView(nativeAdData.getMediaView(), new LinearLayout.LayoutParams(i11, (int) (i11 / 1.91f)));
                    } else {
                        str = str2;
                        PAGMediaView mediaView = nativeAdData.getMediaView();
                        float f10 = this.f30608i;
                        linearLayout2.addView(mediaView, new LinearLayout.LayoutParams((int) f10, (int) (f10 / 1.91f)));
                    }
                    ge.d.b(activity, new a(icon), nativeAdData.getIcon().getImageUrl(), true);
                    View adLogoView = nativeAdData.getAdLogoView();
                    if (adLogoView != null) {
                        linearLayout.setVisibility(0);
                        linearLayout.removeAllViews();
                        linearLayout.addView(adLogoView);
                    }
                    textView.setText(nativeAdData.getTitle());
                    textView2.setText(nativeAdData.getDescription());
                    button.setText(nativeAdData.getButtonText());
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(textView);
                    arrayList.add(textView2);
                    arrayList.add(button);
                    kotlin.jvm.internal.g.d(icon, "icon");
                    arrayList.add(icon);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(button);
                    PAGNativeAd pAGNativeAd2 = this.f30609j;
                    if (pAGNativeAd2 != null) {
                        pAGNativeAd2.registerViewForInteraction(viewGroup, arrayList, arrayList2, (View) null, new b(applicationContext, this));
                        return viewGroup;
                    }
                    return viewGroup;
                } catch (Throwable th2) {
                    th = th2;
                    fe.a.a().c(th);
                    a.InterfaceC0036a interfaceC0036a = this.f30605f;
                    if (interfaceC0036a != null) {
                        StringBuilder g10 = a0.d.g(str, ":getAdView exception ");
                        g10.append(th.getMessage());
                        g10.append('}');
                        interfaceC0036a.a(applicationContext, new yd.a(g10.toString(), 0));
                        return null;
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            str = str2;
