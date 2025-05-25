package com.inmobi.media;

import android.net.Uri;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1702l {
    public static String a(C1674j asset, File file, long j10, long j11) {
        kotlin.jvm.internal.g.e(asset, "asset");
        kotlin.jvm.internal.g.e(file, "file");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InMobiNetworkValues.URL, asset.f15197b);
            jSONObject.put("saved_url", Uri.fromFile(file));
            jSONObject.put("size_in_bytes", file.length());
            jSONObject.put("download_started_at", j10);
            jSONObject.put("download_ended_at", j11);
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
        return kotlin.text.j.K(jSONObject2, OperatorName.SHOW_TEXT_LINE_AND_SPACE, "\\\"");
    }
}
