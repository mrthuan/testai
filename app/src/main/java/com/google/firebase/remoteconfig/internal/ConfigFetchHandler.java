package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.fragment.app.h;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.b;
import d8.o;
import eb.e;
import h5.f;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import nb.d;

/* loaded from: classes2.dex */
public final class ConfigFetchHandler {

    /* renamed from: j  reason: collision with root package name */
    public static final long f13693j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f13694k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final e f13695a;

    /* renamed from: b  reason: collision with root package name */
    public final db.b<da.a> f13696b;
    public final Executor c;

    /* renamed from: d  reason: collision with root package name */
    public final Clock f13697d;

    /* renamed from: e  reason: collision with root package name */
    public final Random f13698e;

    /* renamed from: f  reason: collision with root package name */
    public final d f13699f;

    /* renamed from: g  reason: collision with root package name */
    public final ConfigFetchHttpClient f13700g;

    /* renamed from: h  reason: collision with root package name */
    public final b f13701h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, String> f13702i;

    /* loaded from: classes2.dex */
    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");
        
        private final String value;

        FetchType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13704a;

        /* renamed from: b  reason: collision with root package name */
        public final nb.e f13705b;
        public final String c;

        public a(int i10, nb.e eVar, String str) {
            this.f13704a = i10;
            this.f13705b = eVar;
            this.c = str;
        }
    }

    public ConfigFetchHandler(e eVar, db.b bVar, ScheduledExecutorService scheduledExecutorService, DefaultClock defaultClock, Random random, d dVar, ConfigFetchHttpClient configFetchHttpClient, b bVar2, HashMap hashMap) {
        this.f13695a = eVar;
        this.f13696b = bVar;
        this.c = scheduledExecutorService;
        this.f13697d = defaultClock;
        this.f13698e = random;
        this.f13699f = dVar;
        this.f13700g = configFetchHttpClient;
        this.f13701h = bVar2;
        this.f13702i = hashMap;
    }

    public final a a(String str, String str2, Date date, Map<String, String> map) {
        boolean z10;
        String str3;
        long millis;
        Long l10;
        boolean z11 = false;
        try {
            HttpURLConnection b10 = this.f13700g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f13700g;
            HashMap d10 = d();
            String string = this.f13701h.f13723a.getString("last_fetch_etag", null);
            da.a aVar = this.f13696b.get();
            if (aVar == null) {
                l10 = null;
            } else {
                l10 = (Long) aVar.a(true).get("_fot");
            }
            a fetch = configFetchHttpClient.fetch(b10, str, str2, d10, string, map, l10, date);
            nb.e eVar = fetch.f13705b;
            if (eVar != null) {
                b bVar = this.f13701h;
                long j10 = eVar.f22419f;
                synchronized (bVar.f13724b) {
                    bVar.f13723a.edit().putLong("last_template_version", j10).apply();
                }
            }
            String str4 = fetch.c;
            if (str4 != null) {
                this.f13701h.d(str4);
            }
            this.f13701h.c(0, b.f13722f);
            return fetch;
        } catch (FirebaseRemoteConfigServerException e10) {
            int httpStatusCode = e10.getHttpStatusCode();
            if (httpStatusCode != 429 && httpStatusCode != 502 && httpStatusCode != 503 && httpStatusCode != 504) {
                z10 = false;
            } else {
                z10 = true;
            }
            b bVar2 = this.f13701h;
            if (z10) {
                int i10 = bVar2.a().f13726a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f13694k;
                bVar2.c(i10, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f13698e.nextInt((int) millis)));
            }
            b.a a10 = bVar2.a();
            int httpStatusCode2 = e10.getHttpStatusCode();
            if (a10.f13726a > 1 || httpStatusCode2 == 429) {
                z11 = true;
            }
            if (!z11) {
                int httpStatusCode3 = e10.getHttpStatusCode();
                if (httpStatusCode3 != 401) {
                    if (httpStatusCode3 != 403) {
                        if (httpStatusCode3 != 429) {
                            if (httpStatusCode3 != 500) {
                                switch (httpStatusCode3) {
                                    case PglCryptUtils.INPUT_INVALID /* 502 */:
                                    case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                                    case PglCryptUtils.BASE64_FAILED /* 504 */:
                                        str3 = "The server is unavailable. Please try again later.";
                                        break;
                                    default:
                                        str3 = "The server returned an unexpected error.";
                                        break;
                                }
                            } else {
                                str3 = "There was an internal server error.";
                            }
                        } else {
                            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                        }
                    } else {
                        str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                    }
                } else {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                }
                throw new FirebaseRemoteConfigServerException(e10.getHttpStatusCode(), "Fetch failed: ".concat(str3), e10);
            }
            throw new FirebaseRemoteConfigFetchThrottledException(a10.f13727b.getTime());
        }
    }

    public final Task b(long j10, Task task, final Map map) {
        Task i10;
        boolean before;
        final Date date = new Date(this.f13697d.a());
        boolean o10 = task.o();
        Date date2 = null;
        b bVar = this.f13701h;
        if (o10) {
            bVar.getClass();
            Date date3 = new Date(bVar.f13723a.getLong("last_fetch_time_in_millis", -1L));
            if (date3.equals(b.f13721e)) {
                before = false;
            } else {
                before = date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date3.getTime()));
            }
            if (before) {
                return Tasks.e(new a(2, null, null));
            }
        }
        Date date4 = bVar.a().f13727b;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = this.c;
        if (date2 != null) {
            i10 = Tasks.d(new FirebaseRemoteConfigFetchThrottledException(String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()))), date2.getTime()));
        } else {
            e eVar = this.f13695a;
            final o id2 = eVar.getId();
            final o a10 = eVar.a();
            i10 = Tasks.g(id2, a10).i(executor, new Continuation() { // from class: nb.g
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Object p10;
                    Date date5 = date;
                    Map<String, String> map2 = map;
                    ConfigFetchHandler configFetchHandler = ConfigFetchHandler.this;
                    configFetchHandler.getClass();
                    Task task3 = id2;
                    if (!task3.o()) {
                        return Tasks.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task3.j()));
                    }
                    Task task4 = a10;
                    if (!task4.o()) {
                        return Tasks.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task4.j()));
                    }
                    try {
                        ConfigFetchHandler.a a11 = configFetchHandler.a((String) task3.k(), ((eb.h) task4.k()).a(), date5, map2);
                        if (a11.f13704a != 0) {
                            p10 = Tasks.e(a11);
                        } else {
                            d dVar = configFetchHandler.f13699f;
                            e eVar2 = a11.f13705b;
                            dVar.getClass();
                            b bVar2 = new b(dVar, eVar2);
                            Executor executor2 = dVar.f22411a;
                            p10 = Tasks.c(bVar2, executor2).p(executor2, new c(dVar, eVar2)).p(configFetchHandler.c, new com.google.android.tools.d(a11, 7));
                        }
                        return p10;
                    } catch (FirebaseRemoteConfigException e10) {
                        return Tasks.d(e10);
                    }
                }
            });
        }
        return i10.i(executor, new f(4, this, date));
    }

    public final Task<a> c(FetchType fetchType, int i10) {
        HashMap hashMap = new HashMap(this.f13702i);
        hashMap.put("X-Firebase-RC-Fetch-Type", fetchType.getValue() + PackagingURIHelper.FORWARD_SLASH_STRING + i10);
        return this.f13699f.b().i(this.c, new h(3, this, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        da.a aVar = this.f13696b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}
