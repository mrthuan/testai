package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.V8;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes2.dex */
public abstract class V8 {
    public static final void a(AdConfig.OmidConfig omidConfig, int i10, G8 mNetworkRequest, int i11) {
        byte[] bArr;
        kotlin.jvm.internal.g.e(omidConfig, "$omidConfig");
        kotlin.jvm.internal.g.e(mNetworkRequest, "$mNetworkRequest");
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        if ((System.currentTimeMillis() / 1000) - new C1752o9(d10, "omid_js_store").b() > omidConfig.getExpiry()) {
            int i12 = 0;
            while (i12 <= i10) {
                H8 b10 = mNetworkRequest.b();
                Context d11 = Ha.d();
                if (b10.b()) {
                    i12++;
                    if (i12 > i10) {
                        return;
                    }
                    try {
                        Thread.sleep(i11 * 1000);
                    } catch (InterruptedException unused) {
                    }
                } else if (d11 != null) {
                    C1752o9 c1752o9 = new C1752o9(d11, "omid_js_store");
                    Map map = b10.f14323e;
                    String str = null;
                    List list = map != null ? (List) map.get("Content-Encoding") : null;
                    if (kotlin.jvm.internal.g.a(list != null ? (String) list.get(0) : null, "gzip")) {
                        byte[] bArr2 = b10.f14321b;
                        if (bArr2 == null || bArr2.length == 0) {
                            bArr = new byte[0];
                        } else {
                            bArr = new byte[bArr2.length];
                            kotlin.jvm.internal.g.b(bArr2);
                            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                        }
                        byte[] a10 = K8.a(bArr);
                        if (a10 != null) {
                            try {
                                str = new String(a10, kotlin.text.a.f19966b);
                            } catch (UnsupportedEncodingException unused2) {
                            }
                        }
                    } else {
                        str = b10.a();
                    }
                    if (str != null) {
                        c1752o9.b("omid_js_string", str);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static void a(final AdConfig.OmidConfig omidConfig) {
        kotlin.jvm.internal.g.e(omidConfig, "omidConfig");
        String url = omidConfig.getUrl();
        final int maxRetries = omidConfig.getMaxRetries();
        final int retryInterval = omidConfig.getRetryInterval();
        if (url == null) {
            return;
        }
        final G8 g82 = new G8(url, null);
        g82.f14297x = false;
        g82.f14293t = false;
        g82.f14294u = false;
        ((ScheduledThreadPoolExecutor) G3.f14268b.getValue()).submit(new Runnable() { // from class: qb.a0
            @Override // java.lang.Runnable
            public final void run() {
                V8.a(AdConfig.OmidConfig.this, maxRetries, g82, retryInterval);
            }
        });
    }
}
