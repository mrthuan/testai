package u4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.a;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: InmobiNativeBanner.kt */
/* loaded from: classes.dex */
public final class i extends NativeAdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f30199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f30200b;
    public final /* synthetic */ Activity c;

    public i(Context context, h hVar, Activity activity) {
        this.f30199a = context;
        this.f30200b = hVar;
        this.c = activity;
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdClicked(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        h hVar = this.f30200b;
        a6.h.k(sb2, hVar.f30188b, ":onAdClicked", a10);
        a.InterfaceC0036a interfaceC0036a = hVar.f30190e;
        if (interfaceC0036a != null) {
            interfaceC0036a.b(this.f30199a, new yd.d("IM", "NB", hVar.f30191f));
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public final void onAdFetchSuccessful(InMobiNative inMobiNative, AdMetaInfo p12) {
        InMobiNative p02 = inMobiNative;
        kotlin.jvm.internal.g.e(p02, "p0");
        kotlin.jvm.internal.g.e(p12, "p1");
        a6.h.k(new StringBuilder(), this.f30200b.f30188b, ":onAdFetchSuccessful", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdFullScreenDismissed(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        a6.h.k(new StringBuilder(), this.f30200b.f30188b, ":onAdFullScreenDismissed", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdFullScreenDisplayed(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        a6.h.k(new StringBuilder(), this.f30200b.f30188b, ":onAdFullScreenDisplayed", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdFullScreenWillDisplay(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        a6.h.k(new StringBuilder(), this.f30200b.f30188b, ":onAdFullScreenWillDisplay", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdImpressed(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        h hVar = this.f30200b;
        a6.h.k(sb2, hVar.f30188b, ":onAdImpressed", a10);
        a.InterfaceC0036a interfaceC0036a = hVar.f30190e;
        if (interfaceC0036a != null) {
            interfaceC0036a.g(this.f30199a);
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus status) {
        InMobiNative ad2 = inMobiNative;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(status, "status");
        h hVar = this.f30200b;
        a.InterfaceC0036a interfaceC0036a = hVar.f30190e;
        String str = hVar.f30188b;
        if (interfaceC0036a != null) {
            StringBuilder g10 = a0.d.g(str, ":onAdLoadFailed, errorCode: ");
            g10.append(status.getStatusCode());
            g10.append(' ');
            g10.append(status.getMessage());
            interfaceC0036a.a(this.f30199a, new yd.a(g10.toString(), 0));
        }
        fe.a a10 = fe.a.a();
        StringBuilder g11 = a0.d.g(str, ":onAdLoadFailed, errorCode: ");
        g11.append(status.getStatusCode());
        g11.append(' ');
        g11.append(status.getMessage());
        a10.b(g11.toString());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener, com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiNative inMobiNative, AdMetaInfo p12) {
        InMobiNative ad2 = inMobiNative;
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(p12, "p1");
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        h hVar = this.f30200b;
        String str = hVar.f30188b;
        a6.h.k(sb2, str, ":onAdLoadSucceeded", a10);
        Activity activity = this.c;
        Context applicationContext = activity.getApplicationContext();
        View view = null;
        try {
            View inflate = LayoutInflater.from(applicationContext).inflate(hVar.f30194i, (ViewGroup) null);
            kotlin.jvm.internal.g.c(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            Button button = (Button) viewGroup.findViewById(R.id.ad_action_button);
            ((ImageView) viewGroup.findViewById(R.id.ad_icon_imageview)).setVisibility(8);
            View findViewById = viewGroup.findViewById(R.id.ad_icon_container);
            kotlin.jvm.internal.g.c(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            viewGroup2.setVisibility(0);
            ((TextView) viewGroup.findViewById(R.id.ad_title_textview)).setText(ad2.getAdTitle());
            ((TextView) viewGroup.findViewById(R.id.ad_describe_textview)).setText(ad2.getAdDescription());
            button.setText(ad2.getAdCtaText());
            viewGroup2.addView(ad2.getPrimaryViewOfWidth(applicationContext, viewGroup2, viewGroup2, hVar.f30192g));
            viewGroup.setOnClickListener(new g(ad2, 0));
            button.setClickable(false);
            View inflate2 = LayoutInflater.from(activity).inflate(hVar.f30195j, (ViewGroup) null);
            kotlin.jvm.internal.g.d(inflate2, "from(activity).inflate(rootLayoutId, null)");
            View findViewById2 = inflate2.findViewById(R.id.ad_native_banner_root_linearLayout);
            kotlin.jvm.internal.g.c(findViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
            ((LinearLayout) findViewById2).addView(viewGroup);
            view = inflate2;
        } catch (Throwable th2) {
            fe.a.a().c(th2);
            a.InterfaceC0036a interfaceC0036a = hVar.f30190e;
            if (interfaceC0036a != null) {
                StringBuilder g10 = a0.d.g(str, ":loadAd exception ");
                g10.append(th2.getMessage());
                g10.append('}');
                interfaceC0036a.a(applicationContext, new yd.a(g10.toString(), 0));
            }
        }
        if (view != null) {
            a.InterfaceC0036a interfaceC0036a2 = hVar.f30190e;
            if (interfaceC0036a2 != null) {
                interfaceC0036a2.e(activity, view, new yd.d("IM", "NB", hVar.f30191f));
                return;
            }
            return;
        }
        a.InterfaceC0036a interfaceC0036a3 = hVar.f30190e;
        if (interfaceC0036a3 != null) {
            interfaceC0036a3.a(this.f30199a, new yd.a(a6.h.c(str, ":onAdLoadFailed view == null"), 0));
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onAdStatusChanged(InMobiNative nativeAd) {
        kotlin.jvm.internal.g.e(nativeAd, "nativeAd");
        a6.h.k(new StringBuilder(), this.f30200b.f30188b, ":onAdStatusChanged", fe.a.a());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public final void onUserWillLeaveApplication(InMobiNative ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        a6.h.k(new StringBuilder(), this.f30200b.f30188b, ":onUserWillLeaveApplication", fe.a.a());
    }
