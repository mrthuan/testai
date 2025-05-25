package com.squareup.picasso;

import android.net.NetworkInfo;
import b.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import okhttp3.d;
import okhttp3.t;
import okhttp3.x;
import okhttp3.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class NetworkRequestHandler extends RequestHandler {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    /* loaded from: classes2.dex */
    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        public ResponseException(int i10, int i11) {
            super(a.c("HTTP ", i10));
            this.code = i10;
            this.networkPolicy = i11;
        }
    }

    public NetworkRequestHandler(Downloader downloader, Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    private static t createRequest(Request request, int i10) {
        d dVar;
        boolean z10 = true;
        if (i10 != 0) {
            if (NetworkPolicy.isOfflineOnly(i10)) {
                dVar = d.f23157n;
            } else {
                d.a aVar = new d.a();
                if (!NetworkPolicy.shouldReadFromDiskCache(i10)) {
                    aVar.f23170a = true;
                }
                if (!NetworkPolicy.shouldWriteToDiskCache(i10)) {
                    aVar.f23171b = true;
                }
                dVar = aVar.a();
            }
        } else {
            dVar = null;
        }
        t.a aVar2 = new t.a();
        aVar2.e(request.uri.toString());
        if (dVar != null) {
            String dVar2 = dVar.toString();
            if (dVar2.length() != 0) {
                z10 = false;
            }
            if (z10) {
                aVar2.c.f("Cache-Control");
            } else {
                aVar2.c("Cache-Control", dVar2);
            }
        }
        return aVar2.b();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        if (!SCHEME_HTTP.equals(scheme) && !"https".equals(scheme)) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.RequestHandler
    public int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) {
        boolean z10;
        Picasso.LoadedFrom loadedFrom;
        x load = this.downloader.load(createRequest(request, i10));
        z zVar = load.f23447g;
        int i11 = load.f23444d;
        if (200 <= i11 && i11 < 300) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (load.f23449i == null) {
                loadedFrom = Picasso.LoadedFrom.NETWORK;
            } else {
                loadedFrom = Picasso.LoadedFrom.DISK;
            }
            if (loadedFrom == Picasso.LoadedFrom.DISK && zVar.c() == 0) {
                zVar.close();
                throw new ContentLengthException("Received response with 0 content-length header.");
            }
            if (loadedFrom == Picasso.LoadedFrom.NETWORK && zVar.c() > 0) {
                this.stats.dispatchDownloadFinished(zVar.c());
            }
            return new RequestHandler.Result(zVar.f(), loadedFrom);
        }
        zVar.close();
        throw new ResponseException(i11, request.networkPolicy);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        if (networkInfo != null && !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean supportsReplay() {
        return true;
    }
}
