package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.AccessTokenSource;
import com.facebook.a;
import com.facebook.c;
import com.facebook.e;
import com.facebook.h;
import com.facebook.internal.p;
import com.facebook.internal.q;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccessTokenManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f9675f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static c f9676g;

    /* renamed from: a  reason: collision with root package name */
    public final p1.a f9677a;

    /* renamed from: b  reason: collision with root package name */
    public final com.facebook.b f9678b;
    public com.facebook.a c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f9679d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public Date f9680e = new Date(0);

    /* compiled from: AccessTokenManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final c a() {
            c cVar;
            c cVar2 = c.f9676g;
            if (cVar2 == null) {
                synchronized (this) {
                    cVar = c.f9676g;
                    if (cVar == null) {
                        p1.a a10 = p1.a.a(com.facebook.d.a());
                        kotlin.jvm.internal.g.d(a10, "getInstance(applicationContext)");
                        c cVar3 = new c(a10, new com.facebook.b());
                        c.f9676g = cVar3;
                        cVar = cVar3;
                    }
                }
                return cVar;
            }
            return cVar2;
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* loaded from: classes.dex */
    public static final class b implements e {
        @Override // com.facebook.c.e
        public final String a() {
            return "fb_extend_sso_token";
        }

        @Override // com.facebook.c.e
        public final String b() {
            return "oauth/access_token";
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* renamed from: com.facebook.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0144c implements e {
        @Override // com.facebook.c.e
        public final String a() {
            return "ig_refresh_token";
        }

        @Override // com.facebook.c.e
        public final String b() {
            return "refresh_access_token";
        }
    }

    /* compiled from: AccessTokenManager.kt */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public String f9681a;

        /* renamed from: b  reason: collision with root package name */
        public int f9682b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public Long f9683d;

        /* renamed from: e  reason: collision with root package name */
        public String f9684e;
    }

    /* compiled from: AccessTokenManager.kt */
    /* loaded from: classes.dex */
    public interface e {
        String a();

        String b();
    }

    public c(p1.a aVar, com.facebook.b bVar) {
        this.f9677a = aVar;
        this.f9678b = bVar;
    }

    public final void a() {
        e bVar;
        final com.facebook.a aVar = this.c;
        if (aVar == null || !this.f9679d.compareAndSet(false, true)) {
            return;
        }
        this.f9680e = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        com.facebook.e[] eVarArr = new com.facebook.e[2];
        e.b bVar2 = new e.b() { // from class: t5.a
            @Override // com.facebook.e.b
            public final void b(com.facebook.i iVar) {
                JSONArray optJSONArray;
                AtomicBoolean permissionsCallSucceeded = atomicBoolean;
                kotlin.jvm.internal.g.e(permissionsCallSucceeded, "$permissionsCallSucceeded");
                Set permissions = hashSet;
                kotlin.jvm.internal.g.e(permissions, "$permissions");
                Set declinedPermissions = hashSet2;
                kotlin.jvm.internal.g.e(declinedPermissions, "$declinedPermissions");
                Set expiredPermissions = hashSet3;
                kotlin.jvm.internal.g.e(expiredPermissions, "$expiredPermissions");
                JSONObject jSONObject = iVar.f9729d;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    permissionsCallSucceeded.set(true);
                    int length = optJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("permission");
                            String status = optJSONObject.optString("status");
                            if (!p.v(optString) && !p.v(status)) {
                                kotlin.jvm.internal.g.d(status, "status");
                                Locale locale = Locale.US;
                                String e10 = a0.d.e(locale, "US", status, locale, "this as java.lang.String).toLowerCase(locale)");
                                int hashCode = e10.hashCode();
                                if (hashCode != -1309235419) {
                                    if (hashCode != 280295099) {
                                        if (hashCode == 568196142 && e10.equals("declined")) {
                                            declinedPermissions.add(optString);
                                        }
                                    } else if (e10.equals("granted")) {
                                        permissions.add(optString);
                                    }
                                } else if (e10.equals("expired")) {
                                    expiredPermissions.add(optString);
                                }
                            }
                        }
                    }
                }
            }
        };
        Bundle bundle = new Bundle();
        bundle.putString("fields", "permission,status");
        String str = com.facebook.e.f9701j;
        com.facebook.e g10 = e.c.g(aVar, "me/permissions", bVar2);
        g10.f9706d = bundle;
        HttpMethod httpMethod = HttpMethod.GET;
        g10.f9710h = httpMethod;
        eVarArr[0] = g10;
        t5.b bVar3 = new t5.b(dVar, 0);
        String str2 = aVar.f9432k;
        if (str2 == null) {
            str2 = "facebook";
        }
        if (kotlin.jvm.internal.g.a(str2, "instagram")) {
            bVar = new C0144c();
        } else {
            bVar = new b();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("grant_type", bVar.a());
        bundle2.putString("client_id", aVar.f9429h);
        bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
        com.facebook.e g11 = e.c.g(aVar, bVar.b(), bVar3);
        g11.f9706d = bundle2;
        g11.f9710h = httpMethod;
        eVarArr[1] = g11;
        h hVar = new h(eVarArr);
        h.a aVar2 = new h.a() { // from class: t5.c
            @Override // com.facebook.h.a
            public final void b(com.facebook.h hVar2) {
                boolean z10;
                String str3;
                c.a aVar3;
                Date date;
                com.facebook.a aVar4 = aVar;
                c.d refreshResult = c.d.this;
                kotlin.jvm.internal.g.e(refreshResult, "$refreshResult");
                AtomicBoolean permissionsCallSucceeded = atomicBoolean;
                kotlin.jvm.internal.g.e(permissionsCallSucceeded, "$permissionsCallSucceeded");
                Set<String> permissions = hashSet;
                kotlin.jvm.internal.g.e(permissions, "$permissions");
                Set<String> declinedPermissions = hashSet2;
                kotlin.jvm.internal.g.e(declinedPermissions, "$declinedPermissions");
                Set<String> expiredPermissions = hashSet3;
                kotlin.jvm.internal.g.e(expiredPermissions, "$expiredPermissions");
                com.facebook.c this$0 = this;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                AtomicBoolean atomicBoolean2 = this$0.f9679d;
                String str4 = refreshResult.f9681a;
                int i10 = refreshResult.f9682b;
                Long l10 = refreshResult.f9683d;
                String str5 = refreshResult.f9684e;
                try {
                    c.a aVar5 = com.facebook.c.f9675f;
                    if (aVar5.a().c != null) {
                        try {
                            com.facebook.a aVar6 = aVar5.a().c;
                            if (aVar6 != null) {
                                str3 = aVar6.f9430i;
                            } else {
                                str3 = null;
                            }
                            if (str3 == aVar4.f9430i) {
                                if (!permissionsCallSucceeded.get() && str4 == null && i10 == 0) {
                                    atomicBoolean2.set(false);
                                    return;
                                }
                                Date date2 = aVar4.f9423a;
                                if (refreshResult.f9682b != 0) {
                                    aVar3 = aVar5;
                                    date2 = new Date(refreshResult.f9682b * 1000);
                                } else {
                                    aVar3 = aVar5;
                                    if (refreshResult.c != 0) {
                                        date2 = new Date((refreshResult.c * 1000) + new Date().getTime());
                                    }
                                }
                                Date date3 = date2;
                                if (str4 == null) {
                                    str4 = aVar4.f9426e;
                                }
                                String str6 = str4;
                                String str7 = aVar4.f9429h;
                                String str8 = aVar4.f9430i;
                                if (!permissionsCallSucceeded.get()) {
                                    permissions = aVar4.f9424b;
                                }
                                Set<String> set = permissions;
                                if (!permissionsCallSucceeded.get()) {
                                    declinedPermissions = aVar4.c;
                                }
                                Set<String> set2 = declinedPermissions;
                                if (!permissionsCallSucceeded.get()) {
                                    expiredPermissions = aVar4.f9425d;
                                }
                                Set<String> set3 = expiredPermissions;
                                AccessTokenSource accessTokenSource = aVar4.f9427f;
                                Date date4 = new Date();
                                if (l10 != null) {
                                    date = new Date(l10.longValue() * 1000);
                                } else {
                                    date = aVar4.f9431j;
                                }
                                Date date5 = date;
                                if (str5 == null) {
                                    str5 = aVar4.f9432k;
                                }
                                aVar3.a().c(new com.facebook.a(str6, str7, str8, set, set2, set3, accessTokenSource, date3, date4, date5, str5), true);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            atomicBoolean2.set(z10);
                            throw th;
                        }
                    }
                    atomicBoolean2.set(false);
                } catch (Throwable th3) {
                    th = th3;
                    z10 = false;
                }
            }
        };
        ArrayList arrayList = hVar.f9725d;
        if (!arrayList.contains(aVar2)) {
            arrayList.add(aVar2);
        }
        q.b(hVar);
        new g(hVar).executeOnExecutor(com.facebook.d.c(), new Void[0]);
    }

    public final void b(com.facebook.a aVar, com.facebook.a aVar2) {
        Intent intent = new Intent(com.facebook.d.a(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f9677a.c(intent);
    }

    public final void c(com.facebook.a aVar, boolean z10) {
        Date date;
        com.facebook.a aVar2 = this.c;
        this.c = aVar;
        this.f9679d.set(false);
        this.f9680e = new Date(0L);
        if (z10) {
            com.facebook.b bVar = this.f9678b;
            if (aVar != null) {
                bVar.getClass();
                try {
                    bVar.f9674a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.b().toString()).apply();
                } catch (JSONException | Exception unused) {
                }
            } else {
                bVar.f9674a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                Context a10 = com.facebook.d.a();
                p.f9815a.getClass();
                p.b(a10, "facebook.com");
                p.b(a10, ".facebook.com");
                p.b(a10, "https://facebook.com");
                p.b(a10, "https://.facebook.com");
            }
        }
        if (!p.a(aVar2, aVar)) {
            b(aVar2, aVar);
            Context a11 = com.facebook.d.a();
            Date date2 = com.facebook.a.f9420l;
            com.facebook.a b10 = a.b.b();
            AlarmManager alarmManager = (AlarmManager) a11.getSystemService("alarm");
            if (a.b.c()) {
                if (b10 != null) {
                    date = b10.f9423a;
                } else {
                    date = null;
                }
                if (date != null && alarmManager != null) {
                    Intent intent = new Intent(a11, CurrentAccessTokenExpirationBroadcastReceiver.class);
                    intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    try {
                        alarmManager.set(1, b10.f9423a.getTime(), PendingIntent.getBroadcast(a11, 0, intent, 67108864));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }
}
