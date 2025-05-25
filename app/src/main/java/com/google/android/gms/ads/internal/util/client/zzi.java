package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import n7.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzi implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10362a;

    @Override // n7.c
    public final void a(JsonWriter jsonWriter) {
        Object obj = zzl.f10365b;
        jsonWriter.name("params").beginObject();
        String str = this.f10362a;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
