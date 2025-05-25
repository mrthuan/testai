package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import nb.d;
import z9.e;

/* compiled from: ConfigRealtimeHttpClient.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f13730p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f13731q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Set<mb.c> f13732a;
    public int c;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f13736f;

    /* renamed from: g  reason: collision with root package name */
    public final ConfigFetchHandler f13737g;

    /* renamed from: h  reason: collision with root package name */
    public final e f13738h;

    /* renamed from: i  reason: collision with root package name */
    public final eb.e f13739i;

    /* renamed from: j  reason: collision with root package name */
    public final d f13740j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f13741k;

    /* renamed from: o  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.b f13745o;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13733b = false;

    /* renamed from: m  reason: collision with root package name */
    public final Random f13743m = new Random();

    /* renamed from: n  reason: collision with root package name */
    public final DefaultClock f13744n = DefaultClock.f11371a;

    /* renamed from: l  reason: collision with root package name */
    public final String f13742l = "firebase";

    /* renamed from: d  reason: collision with root package name */
    public boolean f13734d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13735e = false;

    /* compiled from: ConfigRealtimeHttpClient.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Integer num;
            Integer num2;
            byte b10;
            byte b11;
            c cVar = c.this;
            if (cVar.a()) {
                b.C0179b b12 = cVar.f13745o.b();
                cVar.f13744n.getClass();
                if (new Date(System.currentTimeMillis()).before(b12.f13729b)) {
                    cVar.h();
                    return;
                }
                cVar.i(true);
                HttpURLConnection httpURLConnection = null;
                r2 = null;
                Integer num3 = null;
                HttpURLConnection httpURLConnection2 = null;
                try {
                    HttpURLConnection c = cVar.c();
                    try {
                        num3 = Integer.valueOf(c.getResponseCode());
                        if (num3.intValue() == 200) {
                            synchronized (cVar) {
                                cVar.c = 8;
                            }
                            cVar.f13745o.e(0, com.google.firebase.remoteconfig.internal.b.f13722f);
                            com.google.firebase.remoteconfig.internal.a j10 = cVar.j(c);
                            HttpURLConnection httpURLConnection3 = j10.f13714b;
                            if (httpURLConnection3 != null) {
                                try {
                                    InputStream inputStream = httpURLConnection3.getInputStream();
                                    j10.b(inputStream);
                                    inputStream.close();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
                                    httpURLConnection3.disconnect();
                                    throw th2;
                                }
                                httpURLConnection3.disconnect();
                            }
                        }
                        c.b(c);
                        cVar.i(false);
                        boolean d10 = c.d(num3.intValue());
                        if (d10) {
                            cVar.f13744n.getClass();
                            cVar.k(new Date(System.currentTimeMillis()));
                        }
                        if (!d10 && num3.intValue() != 200) {
                            String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num3);
                            if (num3.intValue() == 403) {
                                format = c.f(c.getErrorStream());
                            }
                            cVar.g(new FirebaseRemoteConfigServerException(num3.intValue(), format, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                            return;
                        }
                    } catch (IOException unused2) {
                        num2 = num3;
                        httpURLConnection2 = c;
                        c.b(httpURLConnection2);
                        cVar.i(false);
                        if (num2 != null && !c.d(num2.intValue())) {
                            b11 = 0;
                        } else {
                            b11 = 1;
                        }
                        if (b11 != 0) {
                            cVar.f13744n.getClass();
                            cVar.k(new Date(System.currentTimeMillis()));
                        }
                        if (b11 == 0 && num2.intValue() != 200) {
                            String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                            if (num2.intValue() == 403) {
                                format2 = c.f(httpURLConnection2.getErrorStream());
                            }
                            cVar.g(new FirebaseRemoteConfigServerException(num2.intValue(), format2, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                            return;
                        }
                        cVar.h();
                    } catch (Throwable th3) {
                        th = th3;
                        num = num3;
                        httpURLConnection = c;
                        c.b(httpURLConnection);
                        cVar.i(false);
                        if (num != null && !c.d(num.intValue())) {
                            b10 = 0;
                        } else {
                            b10 = 1;
                        }
                        if (b10 != 0) {
                            cVar.f13744n.getClass();
                            cVar.k(new Date(System.currentTimeMillis()));
                        }
                        if (b10 == 0 && num.intValue() != 200) {
                            String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                            if (num.intValue() == 403) {
                                format3 = c.f(httpURLConnection.getErrorStream());
                            }
                            cVar.g(new FirebaseRemoteConfigServerException(num.intValue(), format3, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                        } else {
                            cVar.h();
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    num2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    num = null;
                }
                cVar.h();
            }
        }
    }

    public c(e eVar, eb.e eVar2, ConfigFetchHandler configFetchHandler, d dVar, Context context, LinkedHashSet linkedHashSet, com.google.firebase.remoteconfig.internal.b bVar, ScheduledExecutorService scheduledExecutorService) {
        this.f13732a = linkedHashSet;
        this.f13736f = scheduledExecutorService;
        this.c = Math.max(8 - bVar.b().f13728a, 1);
        this.f13738h = eVar;
        this.f13737g = configFetchHandler;
        this.f13739i = eVar2;
        this.f13740j = dVar;
        this.f13741k = context;
        this.f13745o = bVar;
    }

    public static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(int i10) {
        if (i10 != 408 && i10 != 429 && i10 != 502 && i10 != 503 && i10 != 504) {
            return false;
        }
        return true;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        boolean z10;
        if (!this.f13732a.isEmpty() && !this.f13733b && !this.f13734d) {
            if (!this.f13735e) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    @android.annotation.SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection c() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.c.c():java.net.HttpURLConnection");
    }

    public final synchronized void e(long j10) {
        if (!a()) {
            return;
        }
        int i10 = this.c;
        if (i10 > 0) {
            this.c = i10 - 1;
            this.f13736f.schedule(new a(), j10, TimeUnit.MILLISECONDS);
        } else if (!this.f13735e) {
            g(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
        }
    }

    public final synchronized void g(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (mb.c cVar : this.f13732a) {
            cVar.b(firebaseRemoteConfigException);
        }
    }

    @SuppressLint({"VisibleForTests"})
    public final synchronized void h() {
        this.f13744n.getClass();
        e(Math.max(0L, this.f13745o.b().f13729b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized void i(boolean z10) {
        this.f13733b = z10;
    }

    @SuppressLint({"VisibleForTests"})
    public final synchronized com.google.firebase.remoteconfig.internal.a j(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.f13737g, this.f13740j, this.f13732a, new b(), this.f13736f);
    }

    public final void k(Date date) {
        com.google.firebase.remoteconfig.internal.b bVar = this.f13745o;
        int i10 = bVar.b().f13728a + 1;
        int i11 = 8;
        if (i10 < 8) {
            i11 = i10;
        }
        long millis = TimeUnit.MINUTES.toMillis(f13730p[i11 - 1]);
        bVar.e(i10, new Date(date.getTime() + (millis / 2) + this.f13743m.nextInt((int) millis)));
    }

    /* compiled from: ConfigRealtimeHttpClient.java */
    /* loaded from: classes2.dex */
    public class b implements mb.c {
        public b() {
        }

        @Override // mb.c
        public final void b(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            c cVar = c.this;
            synchronized (cVar) {
                cVar.f13734d = true;
            }
            c.this.g(firebaseRemoteConfigException);
        }

        @Override // mb.c
        public final void a() {
        }
    }
}
