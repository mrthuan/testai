package a7;

import a6.h;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import be.a;
import com.google.android.gms.ads.nativead.NativeAd;
import d7.a;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustCropViewHolder;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import ud.m;
import v6.n;
import v6.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements a.InterfaceC0194a, NativeAd.OnNativeAdLoadedListener, CropImageView.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f89a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f90b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3) {
        this.f89a = obj;
        this.f90b = obj2;
        this.c = obj3;
    }

    @Override // pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView.c
    public final void a(List list) {
        ImageAdjustCropViewHolder.l((ul.b) this.f89a, (ImageAdjustCropViewHolder) this.f90b, (Context) this.c, list);
    }

    @Override // d7.a.InterfaceC0194a
    public final Object l() {
        c cVar = (c) this.f89a;
        s sVar = (s) this.f90b;
        cVar.f94d.i0(sVar, (n) this.c);
        cVar.f92a.a(sVar, 1);
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        m this$0 = (m) this.f89a;
        Context context = (Context) this.f90b;
        Activity activity = (Activity) this.c;
        g.e(this$0, "this$0");
        g.e(activity, "$activity");
        this$0.f30335e = nativeAd;
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this$0.f30333b;
        h.k(sb2, str, ":onNativeAdLoaded", a10);
        a.InterfaceC0036a interfaceC0036a = this$0.c;
        if (interfaceC0036a != null) {
            if (interfaceC0036a.d()) {
                View j10 = this$0.j(activity, this$0.f30337g, -1);
                if (j10 != null) {
                    interfaceC0036a.e(context, j10, new yd.d("AM", "NC", this$0.f30341k));
                } else {
                    interfaceC0036a.a(context, new yd.a(h.c(str, ":getAdView return null"), 0));
                }
            } else {
                interfaceC0036a.e(context, null, new yd.d("AM", "NC", this$0.f30341k));
            }
            NativeAd nativeAd2 = this$0.f30335e;
            if (nativeAd2 != null) {
                nativeAd2.setOnPaidEventListener(new androidx.privacysandbox.ads.adservices.java.internal.a(context, this$0));
                return;
            }
            return;
        }
        g.i("listener");
        throw null;
    }
}
