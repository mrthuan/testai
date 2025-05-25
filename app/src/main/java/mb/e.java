package mb;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import nb.i;
import nb.k;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21964a;

    /* renamed from: b  reason: collision with root package name */
    public final aa.b f21965b;
    public final Executor c;

    /* renamed from: d  reason: collision with root package name */
    public final nb.d f21966d;

    /* renamed from: e  reason: collision with root package name */
    public final nb.d f21967e;

    /* renamed from: f  reason: collision with root package name */
    public final ConfigFetchHandler f21968f;

    /* renamed from: g  reason: collision with root package name */
    public final nb.h f21969g;

    /* renamed from: h  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.b f21970h;

    /* renamed from: i  reason: collision with root package name */
    public final eb.e f21971i;

    /* renamed from: j  reason: collision with root package name */
    public final i f21972j;

    public e(Context context, eb.e eVar, aa.b bVar, ScheduledExecutorService scheduledExecutorService, nb.d dVar, nb.d dVar2, nb.d dVar3, ConfigFetchHandler configFetchHandler, nb.h hVar, com.google.firebase.remoteconfig.internal.b bVar2, i iVar) {
        this.f21964a = context;
        this.f21971i = eVar;
        this.f21965b = bVar;
        this.c = scheduledExecutorService;
        this.f21966d = dVar;
        this.f21967e = dVar2;
        this.f21968f = configFetchHandler;
        this.f21969g = hVar;
        this.f21970h = bVar2;
        this.f21972j = iVar;
    }

    public static e c() {
        return ((h) z9.e.c().b(h.class)).c();
    }

    public static ArrayList f(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final Task<Boolean> a() {
        final ConfigFetchHandler configFetchHandler = this.f21968f;
        com.google.firebase.remoteconfig.internal.b bVar = configFetchHandler.f13701h;
        bVar.getClass();
        final long j10 = bVar.f13723a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f13693j);
        final HashMap hashMap = new HashMap(configFetchHandler.f13702i);
        hashMap.put("X-Firebase-RC-Fetch-Type", ConfigFetchHandler.FetchType.BASE.getValue() + "/1");
        return configFetchHandler.f13699f.b().i(configFetchHandler.c, new Continuation() { // from class: nb.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return ConfigFetchHandler.this.b(j10, task, hashMap);
            }
        }).p(FirebaseExecutors.a(), new t5.g(9)).p(this.c, new h5.a(this, 5));
    }

    public final k b() {
        k kVar;
        com.google.firebase.remoteconfig.internal.b bVar = this.f21970h;
        synchronized (bVar.f13724b) {
            long j10 = bVar.f13723a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = bVar.f13723a.getInt("last_fetch_status", 0);
            int[] iArr = ConfigFetchHandler.f13694k;
            long j11 = bVar.f13723a.getLong("fetch_timeout_in_seconds", 60L);
            if (j11 >= 0) {
                long j12 = bVar.f13723a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f13693j);
                if (j12 >= 0) {
                    kVar = new k(j10, i10);
                } else {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j12 + " is an invalid argument");
                }
            } else {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j11)));
            }
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.play.core.assetpacks.h1 d(java.lang.String r11) {
        /*
            r10 = this;
            nb.h r0 = r10.f21969g
            nb.d r1 = r0.c
            nb.e r1 = nb.h.b(r1)
            r2 = 0
            if (r1 != 0) goto Ld
        Lb:
            r1 = r2
            goto L13
        Ld:
            org.json.JSONObject r1 = r1.f22416b     // Catch: org.json.JSONException -> Lb
            java.lang.String r1 = r1.getString(r11)     // Catch: org.json.JSONException -> Lb
        L13:
            r3 = 2
            if (r1 == 0) goto L4a
            nb.d r2 = r0.c
            nb.e r2 = nb.h.b(r2)
            if (r2 != 0) goto L1f
            goto L41
        L1f:
            java.util.HashSet r4 = r0.f22427a
            monitor-enter(r4)
            java.util.HashSet r5 = r0.f22427a     // Catch: java.lang.Throwable -> L47
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L47
        L28:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L40
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.common.util.BiConsumer r6 = (com.google.android.gms.common.util.BiConsumer) r6     // Catch: java.lang.Throwable -> L47
            java.util.concurrent.Executor r7 = r0.f22428b     // Catch: java.lang.Throwable -> L47
            androidx.fragment.app.f r8 = new androidx.fragment.app.f     // Catch: java.lang.Throwable -> L47
            r9 = 4
            r8.<init>(r9, r6, r11, r2)     // Catch: java.lang.Throwable -> L47
            r7.execute(r8)     // Catch: java.lang.Throwable -> L47
            goto L28
        L40:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
        L41:
            com.google.android.play.core.assetpacks.h1 r11 = new com.google.android.play.core.assetpacks.h1
            r11.<init>(r1, r3)
            goto L77
        L47:
            r11 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
            throw r11
        L4a:
            nb.d r0 = r0.f22429d
            nb.e r0 = nb.h.b(r0)
            if (r0 != 0) goto L53
            goto L59
        L53:
            org.json.JSONObject r0 = r0.f22416b     // Catch: org.json.JSONException -> L59
            java.lang.String r2 = r0.getString(r11)     // Catch: org.json.JSONException -> L59
        L59:
            r0 = 1
            if (r2 == 0) goto L62
            com.google.android.play.core.assetpacks.h1 r11 = new com.google.android.play.core.assetpacks.h1
            r11.<init>(r2, r0)
            goto L77
        L62:
            java.lang.String r1 = "FirebaseRemoteConfigValue"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r3 = 0
            r2[r3] = r1
            r2[r0] = r11
            java.lang.String r11 = "No value of type '%s' exists for parameter key '%s'."
            java.lang.String.format(r11, r2)
            com.google.android.play.core.assetpacks.h1 r11 = new com.google.android.play.core.assetpacks.h1
            java.lang.String r0 = ""
            r11.<init>(r0, r3)
        L77:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.e.d(java.lang.String):com.google.android.play.core.assetpacks.h1");
    }

    public final void e(boolean z10) {
        i iVar = this.f21972j;
        synchronized (iVar) {
            iVar.f22431b.f13735e = z10;
            if (!z10) {
                iVar.a();
            }
        }
    }
}
