package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.c2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1579c2 {
    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final boolean a(JSONArray jSONArray) {
        kotlin.jvm.internal.g.e(jSONArray, "<this>");
        return jSONArray.length() == 0;
    }

    public static final int a(float f10) {
        try {
            return (int) (f10 / AbstractC1692k3.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int a(int i10) {
        try {
            return (int) (i10 / AbstractC1692k3.b());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter filter) {
        Intent registerReceiver;
        kotlin.jvm.internal.g.e(context, "<this>");
        kotlin.jvm.internal.g.e(filter, "filter");
        if (C1566b3.f14952a.G()) {
            registerReceiver = context.registerReceiver(broadcastReceiver, filter, 2);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, filter);
    }

    public static final WebResourceResponse a(InputStream inputStream, String mimeType) {
        kotlin.jvm.internal.g.e(inputStream, "<this>");
        kotlin.jvm.internal.g.e(mimeType, "mimeType");
        Map h02 = pdf.pdfreader.viewer.editor.free.utils.t0.h0(new Pair("Access-Control-Allow-Origin", "*"));
        if (C1566b3.y()) {
            return new WebResourceResponse(mimeType, "UTF-8", 200, "OK", h02, inputStream);
        }
        return new WebResourceResponse(mimeType, "UTF-8", inputStream);
    }
}
