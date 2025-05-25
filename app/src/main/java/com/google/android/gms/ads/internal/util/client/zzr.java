package com.google.android.gms.ads.internal.util.client;

import com.google.android.gms.ads.internal.client.zzay;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzr implements zze {

    /* renamed from: a  reason: collision with root package name */
    public final String f10371a;

    public zzr() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final boolean zza(String str) {
        HttpURLConnection httpURLConnection;
        boolean z10 = false;
        try {
            zzm.b("Pinging URL: " + str);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (IOException e10) {
            e = e10;
            zzm.e("Error while pinging URL: " + str + ". " + e.getMessage());
        } catch (IndexOutOfBoundsException e11) {
            zzm.e("Error while parsing ping URL: " + str + ". " + e11.getMessage());
        } catch (RuntimeException e12) {
            e = e12;
            zzm.e("Error while pinging URL: " + str + ". " + e.getMessage());
        }
        try {
            zzf zzfVar = zzay.f10107f.f10108a;
            String str2 = this.f10371a;
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setReadTimeout(60000);
            if (str2 != null) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            httpURLConnection.setUseCaches(false);
            zzl zzlVar = new zzl(0);
            zzlVar.a(httpURLConnection, null);
            int responseCode = httpURLConnection.getResponseCode();
            zzlVar.b(httpURLConnection, responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                z10 = true;
                httpURLConnection.disconnect();
                return z10;
            }
            zzm.e("Received non-success response code " + responseCode + " from pinging URL: " + str);
            httpURLConnection.disconnect();
            return z10;
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            throw th2;
        }
    }

    public zzr(String str) {
        this.f10371a = str;
    }
}
