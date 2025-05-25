package com.google.android.gms.ads.identifier;

import android.net.Uri;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f10100a;

    public a(HashMap hashMap) {
        this.f10100a = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Map map = this.f10100a;
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            try {
                zzi.zzb(263);
                httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            } catch (IOException e10) {
                e = e10;
                new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(e.getMessage()).length());
            } catch (IndexOutOfBoundsException e11) {
                new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(e11.getMessage()).length());
            } catch (RuntimeException e12) {
                e = e12;
                new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(e.getMessage()).length());
            }
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    new StringBuilder(String.valueOf(uri).length() + 65);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } finally {
            zzi.zza();
        }
    }
}
