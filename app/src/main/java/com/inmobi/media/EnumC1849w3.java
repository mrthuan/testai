package com.inmobi.media;

import android.util.SparseArray;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.w3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1849w3 {

    /* renamed from: b  reason: collision with root package name */
    public static final C1836v3 f15552b;
    public static final SparseArray c;

    /* renamed from: d  reason: collision with root package name */
    public static final EnumC1849w3 f15553d;

    /* renamed from: e  reason: collision with root package name */
    public static final EnumC1849w3 f15554e;

    /* renamed from: f  reason: collision with root package name */
    public static final EnumC1849w3 f15555f;

    /* renamed from: g  reason: collision with root package name */
    public static final EnumC1849w3 f15556g;

    /* renamed from: h  reason: collision with root package name */
    public static final EnumC1849w3 f15557h;

    /* renamed from: i  reason: collision with root package name */
    public static final EnumC1849w3 f15558i;

    /* renamed from: j  reason: collision with root package name */
    public static final EnumC1849w3 f15559j;

    /* renamed from: k  reason: collision with root package name */
    public static final EnumC1849w3 f15560k;

    /* renamed from: l  reason: collision with root package name */
    public static final EnumC1849w3 f15561l;

    /* renamed from: m  reason: collision with root package name */
    public static final EnumC1849w3 f15562m;

    /* renamed from: n  reason: collision with root package name */
    public static final EnumC1849w3 f15563n;

    /* renamed from: o  reason: collision with root package name */
    public static final EnumC1849w3 f15564o;

    /* renamed from: p  reason: collision with root package name */
    public static final EnumC1849w3 f15565p;

    /* renamed from: q  reason: collision with root package name */
    public static final EnumC1849w3 f15566q;

    /* renamed from: r  reason: collision with root package name */
    public static final EnumC1849w3 f15567r;

    /* renamed from: s  reason: collision with root package name */
    public static final EnumC1849w3 f15568s;

    /* renamed from: t  reason: collision with root package name */
    public static final EnumC1849w3 f15569t;

    /* renamed from: u  reason: collision with root package name */
    public static final EnumC1849w3 f15570u;

    /* renamed from: v  reason: collision with root package name */
    public static final EnumC1849w3 f15571v;

    /* renamed from: w  reason: collision with root package name */
    public static final EnumC1849w3 f15572w;

    /* renamed from: x  reason: collision with root package name */
    public static final EnumC1849w3 f15573x;

    /* renamed from: y  reason: collision with root package name */
    public static final EnumC1849w3 f15574y;

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ EnumC1849w3[] f15575z;

    /* renamed from: a  reason: collision with root package name */
    public final int f15576a;

    static {
        EnumC1849w3[] values;
        EnumC1849w3 enumC1849w3 = new EnumC1849w3(0, 0, "NETWORK_UNAVAILABLE_ERROR");
        f15553d = enumC1849w3;
        EnumC1849w3 enumC1849w32 = new EnumC1849w3(1, -1, "UNKNOWN_ERROR");
        f15554e = enumC1849w32;
        EnumC1849w3 enumC1849w33 = new EnumC1849w3(2, -2, "NETWORK_IO_ERROR");
        f15555f = enumC1849w33;
        EnumC1849w3 enumC1849w34 = new EnumC1849w3(3, -3, "OUT_OF_MEMORY_ERROR");
        f15556g = enumC1849w34;
        EnumC1849w3 enumC1849w35 = new EnumC1849w3(4, -4, "INVALID_ENCRYPTED_RESPONSE_RECEIVED");
        EnumC1849w3 enumC1849w36 = new EnumC1849w3(5, -5, "RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT");
        EnumC1849w3 enumC1849w37 = new EnumC1849w3(6, -6, "GZIP_DECOMPRESSION_FAILED");
        f15557h = enumC1849w37;
        EnumC1849w3 enumC1849w38 = new EnumC1849w3(7, -7, "BAD_REQUEST");
        f15558i = enumC1849w38;
        EnumC1849w3 enumC1849w39 = new EnumC1849w3(8, -8, "GDPR_COMPLIANCE_ENFORCED");
        f15559j = enumC1849w39;
        EnumC1849w3 enumC1849w310 = new EnumC1849w3(9, -9, "GENERIC_HTTP_2XX");
        f15560k = enumC1849w310;
        EnumC1849w3 enumC1849w311 = new EnumC1849w3(10, -10, "RESPONSE_PARSING_ERROR");
        f15561l = enumC1849w311;
        EnumC1849w3 enumC1849w312 = new EnumC1849w3(11, -11, "RETRY_ATTEMPTED");
        f15562m = enumC1849w312;
        EnumC1849w3 enumC1849w313 = new EnumC1849w3(12, -12, "NETWORK_UNAVAILABLE_CONTEXT_LOSS");
        f15563n = enumC1849w313;
        EnumC1849w3 enumC1849w314 = new EnumC1849w3(13, -13, "NETWORK_UNAVAILABLE_IDLE_MODE");
        f15564o = enumC1849w314;
        EnumC1849w3 enumC1849w315 = new EnumC1849w3(14, -14, "NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE");
        f15565p = enumC1849w315;
        EnumC1849w3 enumC1849w316 = new EnumC1849w3(15, -15, "NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M");
        f15566q = enumC1849w316;
        EnumC1849w3 enumC1849w317 = new EnumC1849w3(16, -16, "NETWORK_UNAVAILABLE_EXCEPTION");
        f15567r = enumC1849w317;
        EnumC1849w3 enumC1849w318 = new EnumC1849w3(17, -17, "NETWORK_PREPARE_FAIL");
        f15568s = enumC1849w318;
        EnumC1849w3 enumC1849w319 = new EnumC1849w3(18, 204, "HTTP_NO_CONTENT");
        EnumC1849w3 enumC1849w320 = new EnumC1849w3(19, 304, "HTTP_NOT_MODIFIED");
        EnumC1849w3 enumC1849w321 = new EnumC1849w3(20, 303, "HTTP_SEE_OTHER");
        f15569t = enumC1849w321;
        EnumC1849w3 enumC1849w322 = new EnumC1849w3(21, TTAdConstant.DEEPLINK_FALLBACK_CODE, "HTTP_SERVER_NOT_FOUND");
        f15570u = enumC1849w322;
        EnumC1849w3 enumC1849w323 = new EnumC1849w3(22, 302, "HTTP_MOVED_TEMP");
        f15571v = enumC1849w323;
        EnumC1849w3 enumC1849w324 = new EnumC1849w3(23, OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM, "HTTP_INTERNAL_SERVER_ERROR");
        EnumC1849w3 enumC1849w325 = new EnumC1849w3(24, PglCryptUtils.LOAD_SO_FAILED, "HTTP_NOT_IMPLEMENTED");
        EnumC1849w3 enumC1849w326 = new EnumC1849w3(25, PglCryptUtils.INPUT_INVALID, "HTTP_BAD_GATEWAY");
        f15572w = enumC1849w326;
        EnumC1849w3 enumC1849w327 = new EnumC1849w3(26, PglCryptUtils.COMPRESS_FAILED, "HTTP_SERVER_NOT_AVAILABLE");
        f15573x = enumC1849w327;
        EnumC1849w3 enumC1849w328 = new EnumC1849w3(27, PglCryptUtils.BASE64_FAILED, "HTTP_GATEWAY_TIMEOUT");
        f15574y = enumC1849w328;
        EnumC1849w3[] enumC1849w3Arr = {enumC1849w3, enumC1849w32, enumC1849w33, enumC1849w34, enumC1849w35, enumC1849w36, enumC1849w37, enumC1849w38, enumC1849w39, enumC1849w310, enumC1849w311, enumC1849w312, enumC1849w313, enumC1849w314, enumC1849w315, enumC1849w316, enumC1849w317, enumC1849w318, enumC1849w319, enumC1849w320, enumC1849w321, enumC1849w322, enumC1849w323, enumC1849w324, enumC1849w325, enumC1849w326, enumC1849w327, enumC1849w328, new EnumC1849w3(28, PglCryptUtils.ENCRYPT_FAILED, "HTTP_VERSION_NOT_SUPPORTED")};
        f15575z = enumC1849w3Arr;
        kotlin.enums.a.a(enumC1849w3Arr);
        f15552b = new C1836v3();
        c = new SparseArray();
        for (EnumC1849w3 enumC1849w329 : values()) {
            c.put(enumC1849w329.f15576a, enumC1849w329);
        }
    }

    public EnumC1849w3(int i10, int i11, String str) {
        this.f15576a = i11;
    }

    public static EnumC1849w3 valueOf(String str) {
        return (EnumC1849w3) Enum.valueOf(EnumC1849w3.class, str);
    }

    public static EnumC1849w3[] values() {
        return (EnumC1849w3[]) f15575z.clone();
    }
}
