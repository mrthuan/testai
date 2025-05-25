package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes.dex */
public final class j implements d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final z3.g f6884a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6885b;
    public HttpURLConnection c;

    /* renamed from: d  reason: collision with root package name */
    public InputStream f6886d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f6887e;

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    static {
        new a();
    }

    public j(z3.g gVar, int i10) {
        this.f6884a = gVar;
        this.f6885b = i10;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f6886d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    public final InputStream c(URL url, int i10, URL url2, Map<String, String> map) {
        boolean z10;
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.c = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.c.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.c.setConnectTimeout(this.f6885b);
            this.c.setReadTimeout(this.f6885b);
            boolean z11 = false;
            this.c.setUseCaches(false);
            this.c.setDoInput(true);
            this.c.setInstanceFollowRedirects(false);
            this.c.connect();
            this.f6886d = this.c.getInputStream();
            if (this.f6887e) {
                return null;
            }
            int responseCode = this.c.getResponseCode();
            int i11 = responseCode / 100;
            if (i11 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                HttpURLConnection httpURLConnection = this.c;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f6886d = new p4.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        httpURLConnection.getContentEncoding();
                    }
                    this.f6886d = httpURLConnection.getInputStream();
                }
                return this.f6886d;
            }
            if (i11 == 3) {
                z11 = true;
            }
            if (z11) {
                String headerField = this.c.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    b();
                    return c(url3, i10 + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.c.getResponseMessage(), responseCode);
            }
        }
        throw new HttpException("Too many (> 5) redirects!");
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f6887e = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final DataSource d() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Priority priority, d.a<? super InputStream> aVar) {
        z3.g gVar = this.f6884a;
        int i10 = p4.f.f23697a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.f(c(gVar.d(), 0, null, gVar.f32238b.a()));
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            } catch (IOException e10) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.c(e10);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            }
            SystemClock.elapsedRealtimeNanos();
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th2;
        }
    }
}
