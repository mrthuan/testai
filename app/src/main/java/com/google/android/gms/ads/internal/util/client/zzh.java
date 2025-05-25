package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import n7.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzh implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ byte[] f10361a;

    public /* synthetic */ zzh(byte[] bArr) {
        this.f10361a = bArr;
    }

    @Override // n7.c
    public final void a(JsonWriter jsonWriter) {
        Object obj = zzl.f10365b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = this.f10361a;
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(encodeToString);
        } else {
            String a10 = zzf.a(encodeToString, "MD5");
            if (a10 != null) {
                jsonWriter.name("bodydigest").value(a10);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }
}
