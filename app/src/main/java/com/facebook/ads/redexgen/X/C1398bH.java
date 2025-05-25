package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.bH  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1398bH implements C2Y {
    public final SharedPreferences A00;

    public C1398bH(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final C1399bI A5o() {
        return new C1399bI(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final long A7i(String str, long j10) {
        return this.A00.getLong(str, j10);
    }

    @Override // com.facebook.ads.redexgen.X.C2Y
    public final String A8T(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
