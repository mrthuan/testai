package com.facebook.ads.redexgen.X;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class S4 implements Map<String, String> {
    public static byte[] A01;
    public static String[] A02 = {"Cy9Ol7puM0ud9B1M8hlJlb0", "qBLGxoigf1fC", "mxspOl2wXxp96xi", "1GotRAtMtk4n0Ye4yuR0usUojP3tB7kg", "Q5cfUKUjlAvrOqac2Z528PAxhBhncEkS", "XGB7", "HNCS9EbNXrRkXrCNXemSKzc47T2AJZ", "NeqKP8obYXci"};
    public Map<String, String> A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-90, -42, 18, 17, 3, -22, -11};
    }

    static {
        A03();
    }

    public S4() {
        this.A00 = new HashMap();
    }

    public S4(Map<String, String> map) {
        this.A00 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Map
    /* renamed from: A01 */
    public final String get(Object obj) {
        return this.A00.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Map
    /* renamed from: A02 */
    public final String remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final S4 A04(String str, String str2) {
        this.A00.put(str, str2);
        return this;
    }

    public final S4 A05(Map<? extends String, ? extends String> arg) {
        putAll(arg);
        return this;
    }

    public final String A06() {
        if (this.A00 == null) {
            return A00(0, 0, 123);
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.A00.keySet()) {
            String[] strArr = A02;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A02[3] = "zd0VkDByyj8QSiyKJuZO82g8n4nVkMDg";
            String str2 = str;
            if (sb2.length() > 0) {
                sb2.append(A00(0, 1, 60));
            }
            sb2.append(str2);
            String str3 = this.A00.get(str2);
            if (str3 != null) {
                sb2.append(A00(1, 1, 85));
                try {
                    sb2.append(URLEncoder.encode(str3, A00(2, 5, 121)));
                } catch (UnsupportedEncodingException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return sb2.toString();
    }

    @Override // java.util.Map
    /* renamed from: A07 */
    public final String put(String str, String str2) {
        return this.A00.put(str, str2);
    }

    public final byte[] A08() {
        byte[] bArr = null;
        try {
            bArr = A06().getBytes(A00(2, 5, 121));
            return bArr;
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return bArr;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, String>> entrySet() {
        return this.A00.entrySet();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.A00.keySet();
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends String> arg) {
        this.A00.putAll(arg);
    }

    @Override // java.util.Map
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.Map
    public final Collection<String> values() {
        return this.A00.values();
    }
}
