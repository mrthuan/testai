package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import java.util.Map;
import n7.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzg implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10358a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10359b;
    public final /* synthetic */ Map c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ byte[] f10360d;

    public /* synthetic */ zzg(String str, String str2, Map map, byte[] bArr) {
        this.f10358a = str;
        this.f10359b = str2;
        this.c = map;
        this.f10360d = bArr;
    }

    @Override // n7.c
    public final void a(JsonWriter jsonWriter) {
        Object obj = zzl.f10365b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(this.f10358a);
        jsonWriter.name("verb").value(this.f10359b);
        jsonWriter.endObject();
        zzl.e(jsonWriter, this.c);
        byte[] bArr = this.f10360d;
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }
}
