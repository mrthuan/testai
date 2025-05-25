package wd;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.a;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: AdmobNativeBanner.java */
/* loaded from: classes.dex */
public final class j implements NativeAd.OnNativeAdLoadedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f31133a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f31134b;
    public final /* synthetic */ h c;

    /* compiled from: AdmobNativeBanner.java */
    /* loaded from: classes.dex */
    public class a implements OnPaidEventListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public final void a(AdValue adValue) {
            String str;
            j jVar = j.this;
            Context context = jVar.f31133a;
            h hVar = jVar.c;
            String str2 = hVar.f31126k;
            if (hVar.f31121f.getResponseInfo() != null) {
                str = hVar.f31121f.getResponseInfo().a();
            } else {
                str = "";
            }
            wd.a.d(context, adValue, str2, str, "AdmobNativeBanner", hVar.f31125j);
        }
    }

    public j(h hVar, Context context, Activity activity) {
        this.c = hVar;
        this.f31133a = context;
        this.f31134b = activity;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        View view;
        this.c.f31121f = nativeAd;
        fe.a.a().b("AdmobNativeBanner:onNativeAdLoaded");
        h hVar = this.c;
        Activity activity = this.f31134b;
        int i10 = hVar.f31123h;
        NativeAd nativeAd2 = hVar.f31121f;
        synchronized (hVar) {
            Context applicationContext = activity.getApplicationContext();
            view = null;
            View inflate = LayoutInflater.from(activity).inflate(i10, (ViewGroup) null);
            if (nativeAd2 != null) {
                if (!de.e.k(nativeAd2.getHeadline() + " " + nativeAd2.getBody())) {
                    NativeAdView nativeAdView = new NativeAdView(applicationContext);
                    nativeAdView.addView(inflate, new ViewGroup.LayoutParams(-1, -2));
                    nativeAdView.setHeadlineView(inflate.findViewById(R.id.ad_title_textview));
                    nativeAdView.setBodyView(inflate.findViewById(R.id.ad_describe_textview));
                    nativeAdView.setCallToActionView(inflate.findViewById(R.id.ad_action_button));
                    nativeAdView.setIconView(inflate.findViewById(R.id.ad_icon_imageview));
                    ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd2.getHeadline());
                    ((TextView) nativeAdView.getBodyView()).setText(nativeAd2.getBody());
                    ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd2.getCallToAction());
                    NativeAd.Image icon = nativeAd2.getIcon();
                    if (icon != null) {
                        if (icon.getDrawable() != null) {
                            ((ImageView) nativeAdView.getIconView()).setImageDrawable(icon.getDrawable());
                        } else if (nativeAd2.getIcon().getUri() != null) {
                            ge.d.b(activity, new k(nativeAdView), nativeAd2.getIcon().getUri().toString(), true);
                        } else {
                            ((ImageView) nativeAdView.getIconView()).setVisibility(8);
                        }
                    } else {
                        ((ImageView) nativeAdView.getIconView()).setVisibility(8);
                    }
                    nativeAdView.setNativeAd(nativeAd2);
                    View inflate2 = LayoutInflater.from(activity).inflate(hVar.f31124i, (ViewGroup) null);
                    ((LinearLayout) inflate2.findViewById(R.id.ad_native_banner_root_linearLayout)).addView(nativeAdView);
                    view = inflate2;
                }
            }
        }
        h hVar2 = this.c;
        a.InterfaceC0036a interfaceC0036a = hVar2.f31122g;
        if (interfaceC0036a != null) {
            if (view != null) {
                interfaceC0036a.e(this.f31134b, view, new yd.d("A", "NB", hVar2.f31126k));
                NativeAd nativeAd3 = this.c.f31121f;
                if (nativeAd3 != null) {
                    nativeAd3.setOnPaidEventListener(new a());
                    return;
                }
                return;
            }
            interfaceC0036a.a(this.f31133a, new yd.a("AdmobNativeBanner:getAdView failed", 0));
        }
    }
}
