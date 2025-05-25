package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzdvi;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m7.a;
import m7.c;
import m7.f;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzay {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10410a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public String f10411b = "";
    public String c = "";

    /* renamed from: d  reason: collision with root package name */
    public boolean f10412d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10413e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f10414f = "";

    /* renamed from: g  reason: collision with root package name */
    public zzdvi f10415g;

    public static void e(String str, Context context, boolean z10, boolean z11) {
        if (!(context instanceof Activity)) {
            com.google.android.gms.ads.internal.util.client.zzm.d("Can not create dialog without Activity Context");
        } else {
            zzt.f10496l.post(new c(context, str, z10, z11));
        }
    }

    public static final String j(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzu.B.c.v(context, str2));
        new zzbo(context);
        f a10 = zzbo.a(0, str, hashMap, null);
        try {
            return (String) a10.get(((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzel)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            "Interrupted while retrieving a response from: ".concat(String.valueOf(str));
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            a10.cancel(true);
            return null;
        } catch (TimeoutException unused2) {
            "Timeout while retrieving a response from: ".concat(String.valueOf(str));
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            a10.cancel(true);
            return null;
        } catch (Exception unused3) {
            "Error retrieving a response from: ".concat(String.valueOf(str));
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    public final void a(Context context) {
        zzdvi zzdviVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzip)).booleanValue() && (zzdviVar = this.f10415g) != null) {
            zzdviVar.zzh(new a(this, context), zzdvh.DEBUG_MENU);
        }
    }

    public final void b(Context context, String str, String str2) {
        zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        zzt.p(context, k(context, (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeh), str, str2));
    }

    public final void c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = k(context, (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzek), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        zzt.j(context, str, buildUpon.build().toString());
    }

    public final void d(boolean z10) {
        synchronized (this.f10410a) {
            try {
                this.f10413e = z10;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzip)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().c(z10);
                    zzdvi zzdviVar = this.f10415g;
                    if (zzdviVar != null) {
                        zzdviVar.zzl(z10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f(Context context, String str, String str2) {
        zzbbn zzbbnVar = zzbbw.zzej;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        String j10 = j(context, k(context, (String) zzbaVar.c.zza(zzbbnVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(j10)) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(j10.trim()).optString("debug_mode"));
            d(equals);
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzip)).booleanValue()) {
                zzg zzi = com.google.android.gms.ads.internal.zzu.B.f10557g.zzi();
                if (true != equals) {
                    str = "";
                }
                zzi.f(str);
            }
            return equals;
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return false;
        }
    }

    public final boolean g() {
        boolean z10;
        synchronized (this.f10410a) {
            z10 = this.f10413e;
        }
        return z10;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f10410a) {
            z10 = this.f10412d;
        }
        return z10;
    }

    public final boolean i(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && h()) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Sending troubleshooting signals to the server.");
            c(context, str, str2, str3);
            return true;
        }
        return false;
    }

    public final Uri k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f10410a) {
            if (TextUtils.isEmpty(this.f10411b)) {
                zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    IOUtils.b(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f10411b = str5;
                if (TextUtils.isEmpty(str5)) {
                    zzt zztVar2 = com.google.android.gms.ads.internal.zzu.B.c;
                    String uuid = UUID.randomUUID().toString();
                    this.f10411b = uuid;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(uuid.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception unused2) {
                        com.google.android.gms.ads.internal.util.client.zzm.g(6);
                    }
                }
            }
            str4 = this.f10411b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }
}
