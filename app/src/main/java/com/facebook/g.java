package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.e;
import com.facebook.internal.p;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: GraphRequestAsyncTask.kt */
/* loaded from: classes.dex */
public final class g extends AsyncTask<Void, Void, List<? extends i>> {

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f9720a;

    /* renamed from: b  reason: collision with root package name */
    public final h f9721b;
    public Exception c;

    public g(h requests) {
        kotlin.jvm.internal.g.e(requests, "requests");
        this.f9720a = null;
        this.f9721b = requests;
    }

    public final void a(List<i> result) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            if (k6.a.b(this)) {
                return;
            }
            kotlin.jvm.internal.g.e(result, "result");
            super.onPostExecute(result);
            Exception exc = this.c;
            if (exc != null) {
                kotlin.jvm.internal.g.d(String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)), "format(format, *args)");
                p pVar = p.f9815a;
                d dVar = d.f9685a;
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final List<? extends i> doInBackground(Void[] voidArr) {
        ArrayList d10;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            if (k6.a.b(this)) {
                return null;
            }
            Void[] params = voidArr;
            if (k6.a.b(this)) {
                return null;
            }
            try {
                if (k6.a.b(this)) {
                    return null;
                }
                kotlin.jvm.internal.g.e(params, "params");
                try {
                    HttpURLConnection httpURLConnection = this.f9720a;
                    h hVar = this.f9721b;
                    if (httpURLConnection == null) {
                        hVar.getClass();
                        String str = e.f9701j;
                        d10 = e.c.c(hVar);
                    } else {
                        String str2 = e.f9701j;
                        d10 = e.c.d(hVar, httpURLConnection);
                    }
                    return d10;
                } catch (Exception e10) {
                    this.c = e10;
                    return null;
                }
            } catch (Throwable th2) {
                k6.a.a(this, th2);
                return null;
            }
        } catch (Throwable th3) {
            k6.a.a(this, th3);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(List<? extends i> list) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            if (k6.a.b(this)) {
                return;
            }
            a(list);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        Handler handler;
        h hVar = this.f9721b;
        if (k6.a.b(this)) {
            return;
        }
        try {
            if (k6.a.b(this)) {
                return;
            }
            super.onPreExecute();
            d dVar = d.f9685a;
            if (hVar.f9723a == null) {
                if (Thread.currentThread() instanceof HandlerThread) {
                    handler = new Handler();
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                hVar.f9723a = handler;
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f9720a + ", requests: " + this.f9721b + "}";
        kotlin.jvm.internal.g.d(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
