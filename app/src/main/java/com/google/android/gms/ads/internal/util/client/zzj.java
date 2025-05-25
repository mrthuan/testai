package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.util.Map;
import n7.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzj implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10363a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f10364b;

    public /* synthetic */ zzj(int i10, Map map) {
        this.f10363a = i10;
        this.f10364b = map;
    }

    @Override // n7.c
    public final void a(JsonWriter jsonWriter) {
        Object obj = zzl.f10365b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(this.f10363a);
        jsonWriter.endObject();
        zzl.e(jsonWriter, this.f10364b);
        jsonWriter.endObject();
    }
}
