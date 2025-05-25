package mb;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import ha.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import nb.i;
import nb.j;
import org.json.JSONObject;

/* compiled from: RemoteConfigComponent.java */
@KeepForSdk
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: j  reason: collision with root package name */
    public static final DefaultClock f21978j = DefaultClock.f11371a;

    /* renamed from: k  reason: collision with root package name */
    public static final Random f21979k = new Random();

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap f21980l = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f21981a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f21982b;
    public final ScheduledExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    public final z9.e f21983d;

    /* renamed from: e  reason: collision with root package name */
    public final eb.e f21984e;

    /* renamed from: f  reason: collision with root package name */
    public final aa.b f21985f;

    /* renamed from: g  reason: collision with root package name */
    public final db.b<da.a> f21986g;

    /* renamed from: h  reason: collision with root package name */
    public final String f21987h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f21988i;

    /* compiled from: RemoteConfigComponent.java */
    /* loaded from: classes2.dex */
    public static class a implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static final AtomicReference<a> f21989a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void a(boolean z10) {
            DefaultClock defaultClock = h.f21978j;
            synchronized (h.class) {
                for (e eVar : h.f21980l.values()) {
                    eVar.e(z10);
                }
            }
        }
    }

    public h() {
        throw null;
    }

    public h(Context context, @fa.b ScheduledExecutorService scheduledExecutorService, z9.e eVar, eb.e eVar2, aa.b bVar, db.b<da.a> bVar2) {
        boolean z10;
        this.f21981a = new HashMap();
        this.f21988i = new HashMap();
        this.f21982b = context;
        this.c = scheduledExecutorService;
        this.f21983d = eVar;
        this.f21984e = eVar2;
        this.f21985f = bVar;
        this.f21986g = bVar2;
        eVar.a();
        this.f21987h = eVar.c.f32320b;
        AtomicReference<a> atomicReference = a.f21989a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference<a> atomicReference2 = a.f21989a;
        if (atomicReference2.get() == null) {
            a aVar = new a();
            while (true) {
                if (!atomicReference2.compareAndSet(null, aVar)) {
                    if (atomicReference2.get() != null) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                BackgroundDetector.b(application);
                BackgroundDetector.f10932e.a(aVar);
            }
        }
        Tasks.c(new bb.b(this, 1), scheduledExecutorService);
    }

    public final synchronized e a(z9.e eVar, eb.e eVar2, aa.b bVar, ScheduledExecutorService scheduledExecutorService, nb.d dVar, nb.d dVar2, nb.d dVar3, ConfigFetchHandler configFetchHandler, nb.h hVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        boolean z10;
        aa.b bVar3;
        if (!this.f21981a.containsKey("firebase")) {
            Context context = this.f21982b;
            eVar.a();
            if (eVar.f32309b.equals("[DEFAULT]")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                bVar3 = bVar;
            } else {
                bVar3 = null;
            }
            e eVar3 = new e(context, eVar2, bVar3, scheduledExecutorService, dVar, dVar2, dVar3, configFetchHandler, hVar, bVar2, e(eVar, eVar2, configFetchHandler, dVar2, this.f21982b, bVar2));
            dVar2.b();
            dVar3.b();
            dVar.b();
            this.f21981a.put("firebase", eVar3);
            f21980l.put("firebase", eVar3);
        }
        return (e) this.f21981a.get("firebase");
    }

    public final nb.d b(String str) {
        j jVar;
        String format = String.format("%s_%s_%s_%s.json", "frc", this.f21987h, "firebase", str);
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.f21982b;
        HashMap hashMap = j.c;
        synchronized (j.class) {
            HashMap hashMap2 = j.c;
            if (!hashMap2.containsKey(format)) {
                hashMap2.put(format, new j(context, format));
            }
            jVar = (j) hashMap2.get(format);
        }
        return nb.d.c(scheduledExecutorService, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [mb.g] */
    public final e c() {
        final j3.h hVar;
        e a10;
        synchronized (this) {
            nb.d b10 = b("fetch");
            nb.d b11 = b("activate");
            nb.d b12 = b("defaults");
            com.google.firebase.remoteconfig.internal.b bVar = new com.google.firebase.remoteconfig.internal.b(this.f21982b.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", this.f21987h, "firebase", "settings"), 0));
            nb.h hVar2 = new nb.h(this.c, b11, b12);
            z9.e eVar = this.f21983d;
            db.b<da.a> bVar2 = this.f21986g;
            eVar.a();
            if (eVar.f32309b.equals("[DEFAULT]")) {
                hVar = new j3.h(bVar2);
            } else {
                hVar = null;
            }
            if (hVar != null) {
                hVar2.a(new BiConsumer() { // from class: mb.g
                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void a(String str, nb.e eVar2) {
                        JSONObject optJSONObject;
                        j3.h hVar3 = j3.h.this;
                        da.a aVar = (da.a) ((db.b) hVar3.f19039b).get();
                        if (aVar != null) {
                            JSONObject jSONObject = eVar2.f22418e;
                            if (jSONObject.length() >= 1) {
                                JSONObject jSONObject2 = eVar2.f22416b;
                                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                                    String optString = optJSONObject.optString("choiceId");
                                    if (!optString.isEmpty()) {
                                        synchronized (((Map) hVar3.c)) {
                                            if (!optString.equals(((Map) hVar3.c).get(str))) {
                                                ((Map) hVar3.c).put(str, optString);
                                                Bundle bundle = new Bundle();
                                                bundle.putString("arm_key", str);
                                                bundle.putString("arm_value", jSONObject2.optString(str));
                                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                                bundle.putString("group", optJSONObject.optString("group"));
                                                aVar.c(bundle, "fp", "personalization_assignment");
                                                Bundle bundle2 = new Bundle();
                                                bundle2.putString("_fpid", optString);
                                                aVar.c(bundle2, "fp", "_fpc");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
            }
            a10 = a(this.f21983d, this.f21984e, this.f21985f, this.c, b10, b11, b12, d(b10, bVar), hVar2, bVar);
        }
        return a10;
    }

    public final synchronized ConfigFetchHandler d(nb.d dVar, com.google.firebase.remoteconfig.internal.b bVar) {
        eb.e eVar;
        db.b lVar;
        db.b bVar2;
        ScheduledExecutorService scheduledExecutorService;
        DefaultClock defaultClock;
        Random random;
        String str;
        z9.e eVar2;
        eVar = this.f21984e;
        z9.e eVar3 = this.f21983d;
        eVar3.a();
        if (eVar3.f32309b.equals("[DEFAULT]")) {
            lVar = this.f21986g;
        } else {
            lVar = new l(1);
        }
        bVar2 = lVar;
        scheduledExecutorService = this.c;
        defaultClock = f21978j;
        random = f21979k;
        z9.e eVar4 = this.f21983d;
        eVar4.a();
        str = eVar4.c.f32319a;
        eVar2 = this.f21983d;
        eVar2.a();
        return new ConfigFetchHandler(eVar, bVar2, scheduledExecutorService, defaultClock, random, dVar, new ConfigFetchHttpClient(this.f21982b, eVar2.c.f32320b, str, bVar.f13723a.getLong("fetch_timeout_in_seconds", 60L), bVar.f13723a.getLong("fetch_timeout_in_seconds", 60L)), bVar, this.f21988i);
    }

    public final synchronized i e(z9.e eVar, eb.e eVar2, ConfigFetchHandler configFetchHandler, nb.d dVar, Context context, com.google.firebase.remoteconfig.internal.b bVar) {
        return new i(eVar, eVar2, configFetchHandler, dVar, context, bVar, this.c);
    }
}
