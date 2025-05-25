package com.facebook;

import android.content.Intent;
import android.net.Uri;
import com.facebook.internal.p;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.fontbox.ttf.NamingTable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProfileManager.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f9831d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static volatile k f9832e;

    /* renamed from: a  reason: collision with root package name */
    public final p1.a f9833a;

    /* renamed from: b  reason: collision with root package name */
    public final t5.k f9834b;
    public j c;

    /* compiled from: ProfileManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final synchronized k a() {
            k kVar;
            try {
                if (k.f9832e == null) {
                    p1.a a10 = p1.a.a(d.a());
                    kotlin.jvm.internal.g.d(a10, "getInstance(applicationContext)");
                    k.f9832e = new k(a10, new t5.k());
                }
                kVar = k.f9832e;
                if (kVar == null) {
                    kotlin.jvm.internal.g.i("instance");
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return kVar;
        }
    }

    public k(p1.a aVar, t5.k kVar) {
        this.f9833a = aVar;
        this.f9834b = kVar;
    }

    public final void a(j jVar, boolean z10) {
        j jVar2 = this.c;
        this.c = jVar;
        if (z10) {
            t5.k kVar = this.f9834b;
            if (jVar != null) {
                kVar.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(FacebookMediationAdapter.KEY_ID, jVar.f9825a);
                    jSONObject.put("first_name", jVar.f9826b);
                    jSONObject.put("middle_name", jVar.c);
                    jSONObject.put("last_name", jVar.f9827d);
                    jSONObject.put(NamingTable.TAG, jVar.f9828e);
                    Uri uri = jVar.f9829f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = jVar.f9830g;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    kVar.f29941a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                kVar.f29941a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (!p.a(jVar2, jVar)) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", jVar2);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", jVar);
            this.f9833a.c(intent);
        }
    }
}
