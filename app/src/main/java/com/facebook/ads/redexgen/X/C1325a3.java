package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.a3  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1325a3 implements AnonymousClass69 {
    public static byte[] A03;
    public static String[] A04 = {"1hpByTARN6eOnQ", "46DvCO0dFj9d90pc7Bl3Va1pW3afVu0G", "LtfSHnVMNf9jD1VPw2QJdb6akNXb3KRw", "UXeRQ2HNaneiXsHAoGvRBzblNiVPPyfq", "WcHPi3i27m6LdaHLnkH9ENRpFxyJu3g8", "FTcDokCppzFM6olvGfJVNXVubstDZ8VZ", "v3Z7C81p3UBYKX6nY0MAEeka3DNz7RKw", "vwYfKziuTy1RLYscQHjTEDI4uYjWuvBq"};
    public final SF A01;
    public Set<C6C> A00 = new HashSet();
    public final List<C6B> A02 = new ArrayList();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{Field.MERGESEQ, Field.MERGESEQ, 78, 24, Field.ADDIN, Field.MERGESEQ, 78, 24, Field.FILLIN, Field.AUTONUMLGL, Field.AUTONUMLGL, Field.QUOTE, Field.GOTOBUTTON, Field.AUTONUMLGL};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.A9b()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<C6C> A01 = A01(this.A01.A75());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            for (C6B c6b : this.A02) {
                c6b.A3z();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (C6C c6c : this.A00) {
                String.format(Locale.US, A00(0, 8, 58), c6c.A8b(), c6c.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C1325a3(InterfaceC0909Jw interfaceC0909Jw) {
        this.A01 = interfaceC0909Jw.A54(SG.A0B);
        this.A01.A3n(new C1326a4(this));
        A03();
    }

    public static Set<C6C> A01(JSONObject jSONObject) {
        C1324a2 A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 23));
        if (optJSONArray == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            int i11 = optJSONArray.length();
            if (A04[2].charAt(7) != 'M') {
                throw new RuntimeException();
            }
            A04[0] = "HjevAVNXdTQxpc55Yqf8Zim5Y";
            if (i10 < i11) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject == null || (A00 = C1324a2.A00(optJSONObject)) == null) {
                    return null;
                }
                hashSet.add(A00);
                i10++;
            } else {
                return hashSet;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass69
    public final void A3l(C6B c6b) {
        this.A02.add(c6b);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass69
    public final synchronized Set<C6C> A6Q() {
        return new HashSet(this.A00);
    }
}
