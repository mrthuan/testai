package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import com.google.android.gms.common.util.DefaultClock;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import n7.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzl {
    public static boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f10366d = false;

    /* renamed from: a  reason: collision with root package name */
    public final List f10369a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f10365b = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final DefaultClock f10367e = DefaultClock.f11371a;

    /* renamed from: f  reason: collision with root package name */
    public static final HashSet f10368f = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    public static boolean c() {
        boolean z10;
        synchronized (f10365b) {
            z10 = false;
            if (c && f10366d) {
                z10 = true;
            }
        }
        return z10;
    }

    public static void e(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f10368f.contains(str)) {
                if (entry.getValue() instanceof List) {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(NamingTable.TAG).value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                } else if (entry.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name(NamingTable.TAG).value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    zzm.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (!c()) {
            return;
        }
        if (httpURLConnection.getRequestProperties() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getRequestProperties());
        }
        d("onNetworkRequest", new zzg(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr));
    }

    public final void b(HttpURLConnection httpURLConnection, int i10) {
        HashMap hashMap;
        if (c()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            d("onNetworkResponse", new zzj(i10, hashMap));
            if (i10 >= 200 && i10 < 300) {
                return;
            }
            try {
                str = httpURLConnection.getResponseMessage();
            } catch (IOException e10) {
                zzm.e("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e10.getMessage())));
            }
            d("onNetworkRequestError", new zzi(str));
        }
    }

    public final void d(String str, c cVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            JsonWriter name = jsonWriter.name("timestamp");
            f10367e.getClass();
            name.value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.f10369a) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            cVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException unused) {
            zzm.g(6);
        }
        String stringWriter2 = stringWriter.toString();
        synchronized (zzl.class) {
            zzm.d("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < stringWriter2.length()) {
                int i11 = i10 + 4000;
                zzm.d("GMA Debug CONTENT ".concat(String.valueOf(stringWriter2.substring(i10, Math.min(i11, stringWriter2.length())))));
                i10 = i11;
            }
            zzm.d("GMA Debug FINISH");
        }
    }

    public zzl(int i10) {
        List asList;
        if (!c()) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.f10369a = asList;
    }
}
