package wd;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.gms.ads.nativead.NativeAdView;
import ge.d;

/* compiled from: AdmobNativeBanner.java */
/* loaded from: classes.dex */
public final class k implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NativeAdView f31136a;

    public k(NativeAdView nativeAdView) {
        this.f31136a = nativeAdView;
    }

    @Override // ge.d.a
    public final void a(Bitmap bitmap) {
        ((ImageView) this.f31136a.getIconView()).setImageBitmap(bitmap);
    }

    @Override // ge.d.a
    public final void b() {
        ((ImageView) this.f31136a.getIconView()).setVisibility(8);
    }
}
