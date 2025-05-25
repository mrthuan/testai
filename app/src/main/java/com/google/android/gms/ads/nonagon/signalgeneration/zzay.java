package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzdrt;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzay {

    /* renamed from: a  reason: collision with root package name */
    public final String f10693a;

    /* renamed from: b  reason: collision with root package name */
    public String f10694b;
    public final zzbvb c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f10695d = new Bundle();

    /* renamed from: e  reason: collision with root package name */
    public final long f10696e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10697f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzay(JsonReader jsonReader, zzbvb zzbvbVar) {
        zzbvb zzbvbVar2;
        Bundle bundle;
        char c;
        this.f10696e = -1L;
        this.f10697f = -1L;
        this.c = zzbvbVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -995427962:
                    if (nextName.equals("params")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1725551537:
                    if (nextName.equals("end_time")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            jsonReader.skipValue();
                        } else {
                            this.f10697f = jsonReader.nextLong();
                        }
                    } else {
                        this.f10696e = jsonReader.nextLong();
                    }
                } else {
                    hashMap = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                    }
                    jsonReader.endObject();
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        this.f10693a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f10695d.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbS)).booleanValue() && (zzbvbVar2 = this.c) != null && (bundle = zzbvbVar2.zzm) != null) {
            bundle.putLong(zzdrt.GET_SIGNALS_SDKCORE_START.zza(), this.f10696e);
            this.c.zzm.putLong(zzdrt.GET_SIGNALS_SDKCORE_END.zza(), this.f10697f);
        }
    }
}
