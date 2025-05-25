package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y9.a;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzj implements zzg {

    /* renamed from: b  reason: collision with root package name */
    public boolean f10465b;

    /* renamed from: d  reason: collision with root package name */
    public a f10466d;

    /* renamed from: f  reason: collision with root package name */
    public SharedPreferences f10468f;

    /* renamed from: g  reason: collision with root package name */
    public SharedPreferences.Editor f10469g;

    /* renamed from: i  reason: collision with root package name */
    public String f10471i;

    /* renamed from: j  reason: collision with root package name */
    public String f10472j;

    /* renamed from: a  reason: collision with root package name */
    public final Object f10464a = new Object();
    public final ArrayList c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public zzayv f10467e = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10470h = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10473k = true;

    /* renamed from: l  reason: collision with root package name */
    public String f10474l = "-1";

    /* renamed from: m  reason: collision with root package name */
    public int f10475m = -1;

    /* renamed from: n  reason: collision with root package name */
    public zzbyy f10476n = new zzbyy("", 0);

    /* renamed from: o  reason: collision with root package name */
    public long f10477o = 0;

    /* renamed from: p  reason: collision with root package name */
    public long f10478p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f10479q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f10480r = 0;

    /* renamed from: s  reason: collision with root package name */
    public Set f10481s = Collections.emptySet();

    /* renamed from: t  reason: collision with root package name */
    public JSONObject f10482t = new JSONObject();

    /* renamed from: u  reason: collision with root package name */
    public boolean f10483u = true;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10484v = true;

    /* renamed from: w  reason: collision with root package name */
    public String f10485w = null;

    /* renamed from: x  reason: collision with root package name */
    public String f10486x = "";

    /* renamed from: y  reason: collision with root package name */
    public boolean f10487y = false;

    /* renamed from: z  reason: collision with root package name */
    public String f10488z = "";
    public String A = "{}";
    public int B = -1;
    public int C = -1;
    public long D = 0;

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void a(boolean z10) {
        u();
        synchronized (this.f10464a) {
            long currentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjC)).longValue();
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z10);
                this.f10469g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void b(int i10) {
        u();
        synchronized (this.f10464a) {
            if (this.f10479q == i10) {
                return;
            }
            this.f10479q = i10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i10);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void c(boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzip)).booleanValue()) {
            return;
        }
        u();
        synchronized (this.f10464a) {
            if (this.f10487y == z10) {
                return;
            }
            this.f10487y = z10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putBoolean("linked_device", z10);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void d(String str) {
        u();
        synchronized (this.f10464a) {
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (str != null && !str.equals(this.f10476n.zzc())) {
                this.f10476n = new zzbyy(str, currentTimeMillis);
                SharedPreferences.Editor editor = this.f10469g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f10469g.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.f10469g.apply();
                }
                v();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            this.f10476n.zzg(currentTimeMillis);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void e(boolean z10) {
        u();
        synchronized (this.f10464a) {
            if (z10 == this.f10473k) {
                return;
            }
            this.f10473k = z10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z10);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void f(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzip)).booleanValue()) {
            return;
        }
        u();
        synchronized (this.f10464a) {
            if (this.f10488z.equals(str)) {
                return;
            }
            this.f10488z = str;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putString("linked_ad_unit", str);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void g(boolean z10) {
        u();
        synchronized (this.f10464a) {
            if (this.f10484v == z10) {
                return;
            }
            this.f10484v = z10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z10);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void h(long j10) {
        u();
        synchronized (this.f10464a) {
            if (this.f10477o == j10) {
                return;
            }
            this.f10477o = j10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j10);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void i(boolean z10) {
        u();
        synchronized (this.f10464a) {
            if (this.f10483u == z10) {
                return;
            }
            this.f10483u = z10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z10);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void j(String str, String str2, boolean z10) {
        u();
        synchronized (this.f10464a) {
            JSONArray optJSONArray = this.f10482t.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z10 && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i10;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                jSONObject.put("timestamp_ms", System.currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.f10482t.put(str, optJSONArray);
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
            }
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f10482t.toString());
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void k(final Context context) {
        synchronized (this.f10464a) {
            if (this.f10468f != null) {
                return;
            }
            this.f10466d = zzbzo.zza.zza(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    zzj zzjVar = zzj.this;
                    Context context2 = context;
                    zzjVar.getClass();
                    SharedPreferences sharedPreferences = context2.getSharedPreferences("admob", 0);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    try {
                        synchronized (zzjVar.f10464a) {
                            zzjVar.f10468f = sharedPreferences;
                            zzjVar.f10469g = edit;
                            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                            zzjVar.f10470h = zzjVar.f10468f.getBoolean("use_https", zzjVar.f10470h);
                            zzjVar.f10483u = zzjVar.f10468f.getBoolean("content_url_opted_out", zzjVar.f10483u);
                            zzjVar.f10471i = zzjVar.f10468f.getString("content_url_hashes", zzjVar.f10471i);
                            zzjVar.f10473k = zzjVar.f10468f.getBoolean("gad_idless", zzjVar.f10473k);
                            zzjVar.f10484v = zzjVar.f10468f.getBoolean("content_vertical_opted_out", zzjVar.f10484v);
                            zzjVar.f10472j = zzjVar.f10468f.getString("content_vertical_hashes", zzjVar.f10472j);
                            zzjVar.f10480r = zzjVar.f10468f.getInt("version_code", zzjVar.f10480r);
                            if (((Boolean) zzbdk.zzg.zze()).booleanValue() && com.google.android.gms.ads.internal.client.zzba.f10115d.c.zze()) {
                                zzjVar.f10476n = new zzbyy("", 0L);
                            } else {
                                zzjVar.f10476n = new zzbyy(zzjVar.f10468f.getString("app_settings_json", zzjVar.f10476n.zzc()), zzjVar.f10468f.getLong("app_settings_last_update_ms", zzjVar.f10476n.zza()));
                            }
                            zzjVar.f10477o = zzjVar.f10468f.getLong("app_last_background_time_ms", zzjVar.f10477o);
                            zzjVar.f10479q = zzjVar.f10468f.getInt("request_in_session_count", zzjVar.f10479q);
                            zzjVar.f10478p = zzjVar.f10468f.getLong("first_ad_req_time_ms", zzjVar.f10478p);
                            zzjVar.f10481s = zzjVar.f10468f.getStringSet("never_pool_slots", zzjVar.f10481s);
                            zzjVar.f10485w = zzjVar.f10468f.getString("display_cutout", zzjVar.f10485w);
                            zzjVar.B = zzjVar.f10468f.getInt("app_measurement_npa", zzjVar.B);
                            zzjVar.C = zzjVar.f10468f.getInt("sd_app_measure_npa", zzjVar.C);
                            zzjVar.D = zzjVar.f10468f.getLong("sd_app_measure_npa_ts", zzjVar.D);
                            zzjVar.f10486x = zzjVar.f10468f.getString("inspector_info", zzjVar.f10486x);
                            zzjVar.f10487y = zzjVar.f10468f.getBoolean("linked_device", zzjVar.f10487y);
                            zzjVar.f10488z = zzjVar.f10468f.getString("linked_ad_unit", zzjVar.f10488z);
                            zzjVar.A = zzjVar.f10468f.getString("inspector_ui_storage", zzjVar.A);
                            zzjVar.f10474l = zzjVar.f10468f.getString("IABTCF_TCString", zzjVar.f10474l);
                            zzjVar.f10475m = zzjVar.f10468f.getInt("gad_has_consent_for_cookies", zzjVar.f10475m);
                            try {
                                zzjVar.f10482t = new JSONObject(zzjVar.f10468f.getString("native_advanced_settings", "{}"));
                            } catch (JSONException unused) {
                                com.google.android.gms.ads.internal.util.client.zzm.g(5);
                            }
                            zzjVar.v();
                        }
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
                        zze.i();
                    }
                }
            });
            this.f10465b = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void l(String str) {
        u();
        synchronized (this.f10464a) {
            if (TextUtils.equals(this.f10485w, str)) {
                return;
            }
            this.f10485w = str;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void m(int i10) {
        u();
        synchronized (this.f10464a) {
            if (this.C == i10) {
                return;
            }
            this.C = i10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i10);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void n(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziC)).booleanValue()) {
            return;
        }
        u();
        synchronized (this.f10464a) {
            if (this.A.equals(str)) {
                return;
            }
            this.A = str;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putString("inspector_ui_storage", str);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void o(long j10) {
        u();
        synchronized (this.f10464a) {
            if (this.f10478p == j10) {
                return;
            }
            this.f10478p = j10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j10);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void p(String str) {
        u();
        synchronized (this.f10464a) {
            this.f10474l = str;
            if (this.f10469g != null) {
                if (str.equals("-1")) {
                    this.f10469g.remove("IABTCF_TCString");
                } else {
                    this.f10469g.putString("IABTCF_TCString", str);
                }
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void q(Runnable runnable) {
        this.c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void r(long j10) {
        u();
        synchronized (this.f10464a) {
            if (this.D == j10) {
                return;
            }
            this.D = j10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j10);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void s(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzia)).booleanValue()) {
            return;
        }
        u();
        synchronized (this.f10464a) {
            if (this.f10486x.equals(str)) {
                return;
            }
            this.f10486x = str;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putString("inspector_info", str);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void t(String str) {
        u();
        synchronized (this.f10464a) {
            if (str.equals(this.f10472j)) {
                return;
            }
            this.f10472j = str;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.f10469g.apply();
            }
            v();
        }
    }

    public final void u() {
        a aVar = this.f10466d;
        if (aVar != null && !aVar.isDone()) {
            try {
                this.f10466d.get(1L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
            } catch (CancellationException | ExecutionException | TimeoutException unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
        }
    }

    public final void v() {
        zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(int i10) {
        u();
        synchronized (this.f10464a) {
            this.f10475m = i10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                if (i10 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i10);
                }
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z10;
        u();
        synchronized (this.f10464a) {
            z10 = this.f10483u;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzQ() {
        boolean z10;
        u();
        synchronized (this.f10464a) {
            z10 = this.f10484v;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzR() {
        boolean z10;
        u();
        synchronized (this.f10464a) {
            z10 = this.f10487y;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzS() {
        boolean z10;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzao)).booleanValue()) {
            return false;
        }
        u();
        synchronized (this.f10464a) {
            z10 = this.f10473k;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzT() {
        u();
        synchronized (this.f10464a) {
            SharedPreferences sharedPreferences = this.f10468f;
            boolean z10 = false;
            if (sharedPreferences == null) {
                return false;
            }
            if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                return false;
            }
            if (this.f10468f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f10473k) {
                z10 = true;
            }
            return z10;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i10;
        u();
        synchronized (this.f10464a) {
            i10 = this.f10480r;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        u();
        return this.f10475m;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i10;
        u();
        synchronized (this.f10464a) {
            i10 = this.f10479q;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j10;
        u();
        synchronized (this.f10464a) {
            j10 = this.f10477o;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j10;
        u();
        synchronized (this.f10464a) {
            j10 = this.f10478p;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j10;
        u();
        synchronized (this.f10464a) {
            j10 = this.D;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzayv zzg() {
        if (!this.f10465b) {
            return null;
        }
        if ((zzP() && zzQ()) || !((Boolean) zzbdj.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.f10464a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f10467e == null) {
                this.f10467e = new zzayv();
            }
            this.f10467e.zze();
            com.google.android.gms.ads.internal.util.client.zzm.d("start fetching content...");
            return this.f10467e;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbyy zzh() {
        zzbyy zzbyyVar;
        u();
        synchronized (this.f10464a) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkN)).booleanValue() && this.f10476n.zzj()) {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
            zzbyyVar = this.f10476n;
        }
        return zzbyyVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbyy zzi() {
        zzbyy zzbyyVar;
        synchronized (this.f10464a) {
            zzbyyVar = this.f10476n;
        }
        return zzbyyVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        u();
        synchronized (this.f10464a) {
            str = this.f10471i;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        u();
        synchronized (this.f10464a) {
            str = this.f10472j;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        u();
        synchronized (this.f10464a) {
            str = this.f10488z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        u();
        synchronized (this.f10464a) {
            str = this.f10485w;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzn() {
        String str;
        u();
        synchronized (this.f10464a) {
            str = this.f10486x;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        u();
        synchronized (this.f10464a) {
            str = this.A;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzp() {
        u();
        return this.f10474l;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzq() {
        JSONObject jSONObject;
        u();
        synchronized (this.f10464a) {
            jSONObject = this.f10482t;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt() {
        u();
        synchronized (this.f10464a) {
            this.f10482t = new JSONObject();
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(int i10) {
        u();
        synchronized (this.f10464a) {
            if (this.f10480r == i10) {
                return;
            }
            this.f10480r = i10;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putInt("version_code", i10);
                this.f10469g.apply();
            }
            v();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(String str) {
        u();
        synchronized (this.f10464a) {
            if (str.equals(this.f10471i)) {
                return;
            }
            this.f10471i = str;
            SharedPreferences.Editor editor = this.f10469g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.f10469g.apply();
            }
            v();
        }
    }
}
