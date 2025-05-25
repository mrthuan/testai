package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;

/* loaded from: classes2.dex */
public final class U implements InterfaceC1790r9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ W f14720a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f14721b;
    public final /* synthetic */ Sa c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f14722d;

    public U(W w7, boolean z10, Sa sa2, String str) {
        this.f14720a = w7;
        this.f14721b = z10;
        this.c = sa2;
        this.f14722d = str;
    }

    @Override // com.inmobi.media.InterfaceC1790r9
    public final void a(Object obj) {
        String result = (String) obj;
        kotlin.jvm.internal.g.e(result, "result");
        W w7 = this.f14720a;
        StringBuilder g10 = b.a.g("file saved - ", result, " , isReporting - ");
        g10.append(this.f14721b);
        w7.a(g10.toString());
        W w10 = this.f14720a;
        Sa process = this.c;
        String beacon = this.f14722d;
        boolean z10 = this.f14721b;
        w10.getClass();
        kotlin.jvm.internal.g.e(process, "process");
        kotlin.jvm.internal.g.e(beacon, "beacon");
        tf.d dVar = null;
        if (z10) {
            w10.a(new AdQualityResult(result, null, beacon, w10.f14768j.toString()), false);
            return;
        }
        w10.f14764f.remove(process);
        AdQualityResult adQualityResult = w10.f14766h;
        if (adQualityResult != null) {
            adQualityResult.setImageLocation(result);
            dVar = tf.d.f30009a;
        }
        if (dVar == null) {
            w10.f14766h = new AdQualityResult(result, null, beacon, null, 8, null);
        }
        w10.a("file is saved. result - " + w10.f14766h);
        w10.a(true);
    }

    @Override // com.inmobi.media.InterfaceC1790r9
    public final void onError(Exception exc) {
        W w7 = this.f14720a;
        Sa process = this.c;
        w7.getClass();
        kotlin.jvm.internal.g.e(process, "process");
        w7.a(exc, "error in running process - ".concat("Sa"));
        w7.f14764f.remove(process);
        w7.a(true);
    }
}
