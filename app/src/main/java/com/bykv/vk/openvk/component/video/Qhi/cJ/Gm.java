package com.bykv.vk.openvk.component.video.Qhi.cJ;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* compiled from: SkipProxySelector.java */
/* loaded from: classes.dex */
class Gm extends ProxySelector {
    private static final List<Proxy> Qhi = Collections.singletonList(Proxy.NO_PROXY);
    private final int CJ;

    /* renamed from: ac  reason: collision with root package name */
    private final String f7129ac;
    private final ProxySelector cJ = ProxySelector.getDefault();

    private Gm(String str, int i10) {
        this.f7129ac = str;
        this.CJ = i10;
    }

    public static void Qhi(String str, int i10) {
        ProxySelector.setDefault(new Gm(str, i10));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.cJ.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            if (this.f7129ac.equalsIgnoreCase(uri.getHost()) && this.CJ == uri.getPort()) {
                return Qhi;
            }
            return this.cJ.select(uri);
        }
        throw new IllegalArgumentException("URI can't be null");
    }
}
