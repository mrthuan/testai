package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Dc {

    /* renamed from: a  reason: collision with root package name */
    public static final Dc f14205a = new Dc();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f14206b = new ConcurrentHashMap();
    public static final AdConfig.WebAssetCacheConfig c;

    /* renamed from: d  reason: collision with root package name */
    public static final Ac f14207d;

    static {
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        Ac ac2 = null;
        AdConfig.WebAssetCacheConfig webAssetCache = ((AdConfig) AbstractC1773q4.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getWebAssetCache();
        c = webAssetCache;
        Context d10 = Ha.d();
        if (d10 != null) {
            ac2 = new Ac(d10, webAssetCache);
        }
        f14207d = ac2;
    }

    /* JADX WARN: Not initialized variable reg: 18, insn: 0x020b: MOVE  (r6 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:105:0x0209 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x020d: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:105:0x0209 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse a(final java.lang.String r21, final com.inmobi.media.A4 r22) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Dc.a(java.lang.String, com.inmobi.media.A4):android.webkit.WebResourceResponse");
    }

    public static final C1727ma a(Dc this_run, String url, A4 a42) {
        C1727ma a10;
        D8 d82;
        kotlin.jvm.internal.g.e(this_run, "$this_run");
        kotlin.jvm.internal.g.e(url, "$url");
        if (a42 != null) {
            ((B4) a42).c("WebResourceHandler", "downloadResourceFile(): ".concat(url));
        }
        EnumC1601da method = EnumC1601da.f15018a;
        kotlin.jvm.internal.g.e(method, "method");
        C1587ca c1587ca = new C1587ca(url, method);
        AdConfig.WebAssetCacheConfig webAssetCacheConfig = c;
        c1587ca.f14999h = Integer.valueOf(webAssetCacheConfig.getTimeout());
        c1587ca.f15000i = Integer.valueOf(webAssetCacheConfig.getTimeout());
        c1587ca.f14998g = new C1629fa(webAssetCacheConfig.getMaxRetries(), OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
        C1643ga c1643ga = new C1643ga(c1587ca);
        do {
            a10 = C8.a(c1643ga, (cg.p) null);
            d82 = a10.f15319a;
        } while ((d82 != null ? d82.f14201a : null) == EnumC1849w3.f15562m);
        byte[] bArr = a10.c;
        Integer num = a10.f15321d;
        if (num != null && num.intValue() == 200 && bArr != null) {
            if (!(bArr.length == 0)) {
                if (a42 != null) {
                    ((B4) a42).c("WebResourceHandler", "onSuccessfulResponse: ".concat(url));
                }
                Ac ac2 = f14207d;
                if (ac2 != null) {
                    String data = E8.a(a10.c);
                    kotlin.jvm.internal.g.e(data, "data");
                    if (ac2.f14133a != null) {
                        try {
                            String valueOf = String.valueOf(url.hashCode());
                            C1664i3 c1664i3 = ac2.f14133a;
                            if (c1664i3 == null) {
                                kotlin.jvm.internal.g.i("diskLruCache");
                                throw null;
                            }
                            C1622f3 a11 = c1664i3.a(valueOf);
                            if (a11 != null) {
                                a11.a(url, 0);
                                a11.a(data, 1);
                                if (a11.c) {
                                    C1664i3.a(a11.f15047d, a11, false);
                                    a11.f15047d.d(a11.f15045a.f15088a);
                                } else {
                                    C1664i3.a(a11.f15047d, a11, true);
                                }
                            } else if (a42 != null) {
                                ((B4) a42).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for ".concat(url));
                            }
                        } catch (Exception e10) {
                            if (a42 != null) {
                                ((B4) a42).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e10.getMessage() + " for " + url);
                            }
                        }
                    } else if (a42 != null) {
                        ((B4) a42).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: ".concat(url));
                    }
                }
            }
        }
        return a10;
    }
}
