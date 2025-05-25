package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Hb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0840Hb {
    public static String[] A02 = {"1WEATj5Rf8rtbWj2W4p2vpgEaxw2T8HN", "L5R1qCGEqkvVCxYfd", "YDYe9TKl8VD8", "ZFB5zzOBm8TOZxYydKqVDTn4NLBknbux", "rIMvDsWvqMRKWOiP3U7cHeY33TCAV", "UVRJks5dFFSODcDGI66jdmIAqds", "cMa11vJk6adNmjyXCEaOSOhGfY6WoPiz", "C"};
    public final Map<String, Object> A01 = new HashMap();
    public final List<String> A00 = new ArrayList();

    private C0840Hb A00(String str, Object obj) {
        this.A01.put((String) AbstractC0844Hf.A01(str), AbstractC0844Hf.A01(obj));
        this.A00.remove(str);
        return this;
    }

    public final C0840Hb A01(String str) {
        this.A00.add(str);
        this.A01.remove(str);
        return this;
    }

    public final C0840Hb A02(String str, long j10) {
        return A00(str, Long.valueOf(j10));
    }

    public final C0840Hb A03(String str, String str2) {
        return A00(str, str2);
    }

    public final List<String> A04() {
        return Collections.unmodifiableList(new ArrayList(this.A00));
    }

    public final Map<String, Object> A05() {
        HashMap hashMap = new HashMap(this.A01);
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        Map<String, Object> unmodifiableMap = Collections.unmodifiableMap(hashMap);
        if (A02[0].length() != 9) {
            A02[4] = "4TZ1TBs4qvjuT7BcoF6HSVZlpVsWz";
            return unmodifiableMap;
        }
        throw new RuntimeException();
    }
}
