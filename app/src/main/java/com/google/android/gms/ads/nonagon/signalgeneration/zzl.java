package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzdsf;
import com.google.android.gms.internal.ads.zzdsp;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzl {

    /* renamed from: a  reason: collision with root package name */
    public final int f10735a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10736b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10737d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f10738e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f10739f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f10740g = new ArrayDeque();

    /* renamed from: h  reason: collision with root package name */
    public final zzdsp f10741h;

    /* renamed from: i  reason: collision with root package name */
    public ConcurrentHashMap f10742i;

    public zzl(zzdsp zzdspVar) {
        this.f10741h = zzdspVar;
        zzbbn zzbbnVar = zzbbw.zzgm;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        this.f10735a = ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue();
        this.f10736b = ((Long) zzbaVar.c.zza(zzbbw.zzgn)).longValue();
        this.c = ((Boolean) zzbaVar.c.zza(zzbbw.zzgr)).booleanValue();
        this.f10737d = ((Boolean) zzbaVar.c.zza(zzbbw.zzgq)).booleanValue();
        this.f10738e = Collections.synchronizedMap(new zzj(this));
    }

    public final synchronized String a(String str, zzdsf zzdsfVar) {
        zzk zzkVar = (zzk) this.f10738e.get(str);
        zzdsfVar.zzb().put("request_id", str);
        if (zzkVar != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgL)).booleanValue()) {
                this.f10738e.remove(str);
            }
            String str2 = zzkVar.f10734b;
            zzdsfVar.zzb().put("mhit", "true");
            return str2;
        }
        zzdsfVar.zzb().put("mhit", "false");
        return null;
    }

    public final synchronized void b(String str) {
        this.f10738e.remove(str);
    }

    public final synchronized boolean c(int i10, String str, String str2) {
        zzk zzkVar = (zzk) this.f10738e.get(str);
        if (zzkVar == null) {
            return false;
        }
        zzkVar.c.add(str2);
        if (zzkVar.c.size() >= i10) {
            return false;
        }
        return true;
    }

    public final synchronized boolean d(String str, String str2) {
        zzk zzkVar = (zzk) this.f10738e.get(str);
        if (zzkVar != null) {
            if (zzkVar.c.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void e(final zzdsf zzdsfVar) {
        if (!this.c) {
            return;
        }
        ArrayDeque arrayDeque = this.f10740g;
        final ArrayDeque clone = arrayDeque.clone();
        arrayDeque.clear();
        ArrayDeque arrayDeque2 = this.f10739f;
        final ArrayDeque clone2 = arrayDeque2.clone();
        arrayDeque2.clear();
        zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzl zzlVar = zzl.this;
                zzdsf zzdsfVar2 = zzdsfVar;
                zzlVar.f(zzdsfVar2, clone, "to");
                zzlVar.f(zzdsfVar2, clone2, "of");
            }
        });
    }

    public final void f(zzdsf zzdsfVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdsfVar.zzb());
            this.f10742i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f10742i.put("e_r", str);
            this.f10742i.put("e_id", (String) pair2.first);
            if (this.f10737d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzq.b(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.f10742i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f10742i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f10741h.zzf(this.f10742i);
        }
    }

    public final synchronized void g() {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f10738e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((zzk) entry.getValue()).f10733a.longValue() <= this.f10736b) {
                    break;
                }
                this.f10740g.add(new Pair((String) entry.getKey(), ((zzk) entry.getValue()).f10734b));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }
}
