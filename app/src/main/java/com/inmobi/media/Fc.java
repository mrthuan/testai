package com.inmobi.media;

import android.content.Context;
import android.webkit.WebViewClient;

/* loaded from: classes2.dex */
public final class Fc {

    /* renamed from: a  reason: collision with root package name */
    public final G8 f14257a;

    /* renamed from: b  reason: collision with root package name */
    public final WebViewClient f14258b;
    public Ec c;

    public Fc(G8 mNetworkRequest, S1 mWebViewClient) {
        kotlin.jvm.internal.g.e(mNetworkRequest, "mNetworkRequest");
        kotlin.jvm.internal.g.e(mWebViewClient, "mWebViewClient");
        this.f14257a = mNetworkRequest;
        this.f14258b = mWebViewClient;
    }

    public final void a() {
        try {
            Context d10 = Ha.d();
            if (d10 != null) {
                Ec ec2 = new Ec(d10);
                ec2.setWebViewClient(this.f14258b);
                ec2.getSettings().setJavaScriptEnabled(true);
                ec2.getSettings().setCacheMode(2);
                this.c = ec2;
            }
            Ec ec3 = this.c;
            if (ec3 != null) {
                String d11 = this.f14257a.d();
                G8 g82 = this.f14257a;
                g82.getClass();
                K8.a(g82.f14282i);
                ec3.loadUrl(d11, g82.f14282i);
            }
        } catch (Exception unused) {
        }
    }
}
