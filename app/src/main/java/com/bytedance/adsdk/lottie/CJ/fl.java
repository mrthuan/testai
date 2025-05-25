package com.bytedance.adsdk.lottie.CJ;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DefaultLottieNetworkFetcher.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class fl implements hm {
    @Override // com.bytedance.adsdk.lottie.CJ.hm
    public ROR Qhi(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new ac(httpURLConnection);
    }
}
