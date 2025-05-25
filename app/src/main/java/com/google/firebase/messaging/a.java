package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Store.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f13659a;

    /* compiled from: Store.java */
    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0177a {

        /* renamed from: d  reason: collision with root package name */
        public static final long f13660d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int f13661e = 0;

        /* renamed from: a  reason: collision with root package name */
        public final String f13662a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13663b;
        public final long c;

        public C0177a(String str, String str2, long j10) {
            this.f13662a = str;
            this.f13663b = str2;
            this.c = j10;
        }

        public static C0177a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C0177a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e10) {
                    e10.toString();
                    return null;
                }
            }
            return new C0177a(str, null, 0L);
        }
    }

    public a(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f13659a = sharedPreferences;
        File file = new File(androidx.core.content.a.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        a();
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    e10.getMessage();
                }
            }
        }
    }

    public final synchronized void a() {
        this.f13659a.edit().clear().commit();
    }
}
}
