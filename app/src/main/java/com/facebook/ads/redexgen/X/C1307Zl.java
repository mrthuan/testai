package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Zl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1307Zl implements AnonymousClass80 {
    public static byte[] A04;
    public Context A00;
    public final InterfaceC06257z A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C06247x A01 = A00();

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{113, 101, 122, 106, 102, 112, 97, 97, 124, 123, 114, 102, 106, 126, 112, 108};
    }

    public C1307Zl(Context context, InterfaceC06257z interfaceC06257z) {
        this.A00 = context;
        this.A02 = interfaceC06257z;
    }

    private C06247x A00() {
        return C06247x.A00(KJ.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    private void A02() {
        this.A02.AAq(new C1308Zm(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C06247x c06247x = new C06247x(strArr, num, num2);
        C06247x newSettings = this.A01;
        if (c06247x.equals(newSettings)) {
            return;
        }
        this.A01 = c06247x;
        this.A03.set(true);
        SharedPreferences.Editor edit = KJ.A00(this.A00).edit();
        C06247x newSettings2 = this.A01;
        edit.putString(A01(0, 16, 100), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass80
    public final C06247x A76() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass80
    public final boolean A9e() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> A0Y = C0877Im.A0Y(this.A00);
        String identifier = this.A01.A07();
        for (String str : A0Y) {
            if (identifier.contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass80
    public final boolean AGj() {
        A02();
        return this.A03.getAndSet(false);
    }
}
