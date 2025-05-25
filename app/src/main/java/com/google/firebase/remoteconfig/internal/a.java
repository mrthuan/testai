package com.google.firebase.remoteconfig.internal;

import a6.h;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import nb.d;
import nb.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigAutoFetch.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Set<mb.c> f13713a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpURLConnection f13714b;
    public final ConfigFetchHandler c;

    /* renamed from: d  reason: collision with root package name */
    public final d f13715d;

    /* renamed from: e  reason: collision with root package name */
    public final mb.c f13716e;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f13717f;

    /* renamed from: g  reason: collision with root package name */
    public final Random f13718g = new Random();

    /* compiled from: ConfigAutoFetch.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0178a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13719a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f13720b;

        public RunnableC0178a(int i10, long j10) {
            this.f13719a = i10;
            this.f13720b = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final a aVar = a.this;
            int i10 = this.f13719a;
            final long j10 = this.f13720b;
            synchronized (aVar) {
                final int i11 = i10 - 1;
                final Task<ConfigFetchHandler.a> c = aVar.c.c(ConfigFetchHandler.FetchType.REALTIME, 3 - i11);
                final Task<e> b10 = aVar.f13715d.b();
                Tasks.g(c, b10).i(aVar.f13717f, new Continuation() { // from class: nb.a
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        Boolean valueOf;
                        JSONObject jSONObject;
                        com.google.firebase.remoteconfig.internal.a aVar2 = com.google.firebase.remoteconfig.internal.a.this;
                        Task task2 = c;
                        Task task3 = b10;
                        long j11 = j10;
                        int i12 = i11;
                        aVar2.getClass();
                        if (!task2.o()) {
                            return Tasks.d(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task2.j()));
                        }
                        if (!task3.o()) {
                            return Tasks.d(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task3.j()));
                        }
                        ConfigFetchHandler.a aVar3 = (ConfigFetchHandler.a) task2.k();
                        e eVar = (e) task3.k();
                        e eVar2 = aVar3.f13705b;
                        boolean z10 = false;
                        if (eVar2 != null) {
                            if (eVar2.f22419f >= j11) {
                                z10 = true;
                            }
                            valueOf = Boolean.valueOf(z10);
                        } else {
                            if (aVar3.f13704a == 1) {
                                z10 = true;
                            }
                            valueOf = Boolean.valueOf(z10);
                        }
                        if (!valueOf.booleanValue()) {
                            aVar2.a(i12, j11);
                            return Tasks.e(null);
                        } else if (aVar3.f13705b == null) {
                            return Tasks.e(null);
                        } else {
                            if (eVar == null) {
                                Date date = e.f22414g;
                                eVar = new e(new JSONObject(), e.f22414g, new JSONArray(), new JSONObject(), 0L);
                            }
                            e eVar3 = aVar3.f13705b;
                            e a10 = e.a(new JSONObject(eVar3.f22415a.toString()));
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject2 = eVar.f22416b;
                            Iterator<String> keys = jSONObject2.keys();
                            while (true) {
                                boolean hasNext = keys.hasNext();
                                jSONObject = a10.f22416b;
                                if (!hasNext) {
                                    break;
                                }
                                String next = keys.next();
                                JSONObject jSONObject3 = eVar3.f22416b;
                                if (!jSONObject3.has(next)) {
                                    hashSet.add(next);
                                } else if (!jSONObject2.get(next).equals(jSONObject3.get(next))) {
                                    hashSet.add(next);
                                } else {
                                    JSONObject jSONObject4 = eVar.f22418e;
                                    boolean has = jSONObject4.has(next);
                                    JSONObject jSONObject5 = eVar3.f22418e;
                                    if ((has && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                        hashSet.add(next);
                                    } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                        hashSet.add(next);
                                    } else {
                                        jSONObject.remove(next);
                                    }
                                }
                            }
                            Iterator<String> keys2 = jSONObject.keys();
                            while (keys2.hasNext()) {
                                hashSet.add(keys2.next());
                            }
                            if (hashSet.isEmpty()) {
                                return Tasks.e(null);
                            }
                            new mb.a(hashSet);
                            synchronized (aVar2) {
                                for (mb.c cVar : aVar2.f13713a) {
                                    cVar.a();
                                }
                            }
                            return Tasks.e(null);
                        }
                    }
                });
            }
        }
    }

    public a(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, d dVar, Set set, c.b bVar, ScheduledExecutorService scheduledExecutorService) {
        this.f13714b = httpURLConnection;
        this.c = configFetchHandler;
        this.f13715d = dVar;
        this.f13713a = set;
        this.f13716e = bVar;
        this.f13717f = scheduledExecutorService;
    }

    public final void a(int i10, long j10) {
        if (i10 == 0) {
            c(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        int nextInt = this.f13718g.nextInt(4);
        this.f13717f.schedule(new RunnableC0178a(i10, j10), nextInt, TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = h.c(str, readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
                    str = "";
                } else {
                    str = str.substring(indexOf, lastIndexOf + 1);
                }
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e10) {
                        c(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e10.getCause(), FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID));
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        this.f13716e.b(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
                        break;
                    }
                    synchronized (this) {
                        isEmpty = this.f13713a.isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j10 = this.c.f13701h.f13723a.getLong("last_template_version", 0L);
                        long j11 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j11 > j10) {
                            a(3, j11);
                        }
                    }
                    str = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public final synchronized void c(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (mb.c cVar : this.f13713a) {
            cVar.b(firebaseRemoteConfigException);
        }
    }
