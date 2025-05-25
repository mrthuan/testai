package l;

import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.play.core.assetpacks.s2;
import com.google.android.play.core.assetpacks.w1;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.inmobi.commons.core.configs.CrashConfig;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: LayoutIncludeDetector.java */
/* loaded from: classes.dex */
public final class t implements x6.b, zabz, a8.p, q9.l {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20374a;

    public /* synthetic */ t(com.google.android.gms.common.api.internal.a aVar) {
        this.f20374a = aVar;
    }

    @Override // q9.m
    public final /* bridge */ /* synthetic */ Object a() {
        return new w1(((s2) ((q9.m) this.f20374a)).b());
    }

    @Override // a8.p
    public final void b(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        ((zzlg) this.f20374a).g(str, i10, th2, bArr, map);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void c(int i10, boolean z10) {
        Object obj = this.f20374a;
        com.google.android.gms.common.api.internal.a aVar = (com.google.android.gms.common.api.internal.a) obj;
        aVar.f10977l.lock();
        try {
            com.google.android.gms.common.api.internal.a aVar2 = (com.google.android.gms.common.api.internal.a) obj;
            if (aVar2.f10976k) {
                aVar2.f10976k = false;
                com.google.android.gms.common.api.internal.a.k((com.google.android.gms.common.api.internal.a) obj, i10, z10);
            } else {
                aVar2.f10976k = true;
                ((com.google.android.gms.common.api.internal.a) obj).c.onConnectionSuspended(i10);
            }
        } finally {
            aVar.f10977l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void d(ConnectionResult connectionResult) {
        Object obj = this.f20374a;
        ((com.google.android.gms.common.api.internal.a) obj).f10977l.lock();
        try {
            ((com.google.android.gms.common.api.internal.a) obj).f10975j = connectionResult;
            com.google.android.gms.common.api.internal.a.l((com.google.android.gms.common.api.internal.a) obj);
        } finally {
            ((com.google.android.gms.common.api.internal.a) obj).f10977l.unlock();
        }
    }

    public final float e(Object obj, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = (HashMap) this.f20374a;
        if (!hashMap2.containsKey(obj) || (hashMap = (HashMap) hashMap2.get(obj)) == null || !hashMap.containsKey(str) || (fArr = (float[]) hashMap.get(str)) == null || fArr.length <= 0) {
            return Float.NaN;
        }
        return fArr[0];
    }

    public final JSONObject f() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Log.isLoggable("FirebaseCrashlytics", 3);
        FileInputStream fileInputStream2 = null;
        try {
            File file = (File) this.f20374a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(CommonUtils.k(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception unused) {
                    CommonUtils.a(fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.a(fileInputStream2);
                    throw th;
                }
            } else {
                Log.isLoggable("FirebaseCrashlytics", 2);
                jSONObject = null;
            }
            CommonUtils.a(fileInputStream2);
            return jSONObject;
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // pf.a
    public final Object get() {
        e7.a aVar = (e7.a) ((pf.a) this.f20374a).get();
        HashMap hashMap = new HashMap();
        Priority priority = Priority.DEFAULT;
        b.a aVar2 = new b.a();
        Set<SchedulerConfig.Flag> emptySet = Collections.emptySet();
        if (emptySet != null) {
            aVar2.c = emptySet;
            aVar2.f9930a = Long.valueOf((long) CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            aVar2.f9931b = 86400000L;
            hashMap.put(priority, aVar2.a());
            Priority priority2 = Priority.HIGHEST;
            b.a aVar3 = new b.a();
            Set<SchedulerConfig.Flag> emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                aVar3.c = emptySet2;
                aVar3.f9930a = 1000L;
                aVar3.f9931b = 86400000L;
                hashMap.put(priority2, aVar3.a());
                Priority priority3 = Priority.VERY_LOW;
                b.a aVar4 = new b.a();
                Set<SchedulerConfig.Flag> emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    aVar4.c = emptySet3;
                    aVar4.f9930a = 86400000L;
                    aVar4.f9931b = 86400000L;
                    Set<SchedulerConfig.Flag> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.DEVICE_IDLE)));
                    if (unmodifiableSet != null) {
                        aVar4.c = unmodifiableSet;
                        hashMap.put(priority3, aVar4.a());
                        if (aVar != null) {
                            if (hashMap.keySet().size() >= Priority.values().length) {
                                new HashMap();
                                return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(aVar, hashMap);
                            }
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                        throw new NullPointerException("missing required property: clock");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }

    public /* synthetic */ t(Object obj) {
        this.f20374a = obj;
    }

    public t(ra.d dVar) {
        this.f20374a = new File(dVar.f29496b, "com.crashlytics.settings.json");
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void a(Bundle bundle) {
        Object obj = this.f20374a;
        ((com.google.android.gms.common.api.internal.a) obj).f10977l.lock();
        try {
            ((com.google.android.gms.common.api.internal.a) obj).f10975j = ConnectionResult.f10874e;
            com.google.android.gms.common.api.internal.a.l((com.google.android.gms.common.api.internal.a) obj);
        } finally {
            ((com.google.android.gms.common.api.internal.a) obj).f10977l.unlock();
        }
    }

    public t(int i10) {
        if (i10 == 1) {
            this.f20374a = new HashMap();
        } else if (i10 != 8) {
            this.f20374a = new ArrayDeque();
        } else {
            this.f20374a = new ArrayList();
        }
    }
}
