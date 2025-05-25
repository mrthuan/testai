package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.adquality.models.AdQualityControl;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public final class V implements InterfaceC1790r9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ W f14743a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC1886z1 f14744b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ M9 f14745d;

    public V(W w7, AbstractC1886z1 abstractC1886z1, boolean z10, M9 m92) {
        this.f14743a = w7;
        this.f14744b = abstractC1886z1;
        this.c = z10;
        this.f14745d = m92;
    }

    @Override // com.inmobi.media.InterfaceC1790r9
    public final void a(Object obj) {
        String beacon;
        Bitmap bitmap = (Bitmap) obj;
        W w7 = this.f14743a;
        AbstractC1886z1 process = this.f14744b;
        boolean z10 = this.c;
        M9 m92 = this.f14745d;
        w7.getClass();
        kotlin.jvm.internal.g.e(process, "process");
        w7.a("Screen shot result received - isReporting - " + z10);
        w7.f14764f.remove(process);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (bitmap != null && m92 != null) {
            m92.f14487a.b("window.mraidview.broadcastEvent('ScreenshotSuccess')");
        }
        if (!z10) {
            AdQualityControl adQualityControl = w7.f14765g;
            if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                w7.a("saving to file - beacon - ".concat(beacon));
                kotlin.jvm.internal.g.b(byteArray);
                w7.a(beacon, byteArray, false);
            }
        } else {
            String str = w7.f14767i;
            kotlin.jvm.internal.g.b(byteArray);
            w7.a(str, byteArray, true);
        }
        w7.f14769k.set(false);
    }

    @Override // com.inmobi.media.InterfaceC1790r9
    public final void onError(Exception exc) {
        W w7 = this.f14743a;
        AbstractC1886z1 process = this.f14744b;
        w7.getClass();
        kotlin.jvm.internal.g.e(process, "process");
        w7.a(exc, "error in running process - ".concat(process.getClass().getSimpleName()));
        w7.f14764f.remove(process);
        w7.a(true);
    }
}
