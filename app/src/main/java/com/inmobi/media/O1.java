package com.inmobi.media;

import android.content.ContentValues;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class O1 extends AbstractC1860x1 {
    public O1() {
        super(C1646h.CLICK_BEACON, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )");
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.g.e(contentValues, "contentValues");
        Integer asInteger = contentValues.getAsInteger(FacebookMediationAdapter.KEY_ID);
        Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
        String asString = contentValues.getAsString(InMobiNetworkValues.URL);
        Long asLong = contentValues.getAsLong("ts");
        Long asLong2 = contentValues.getAsLong("created_ts");
        Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
        Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
        String asString2 = contentValues.getAsString("track_extras");
        HashMap hashMap = new HashMap();
        if (asString2 != null) {
            try {
                hashMap.putAll(a(new JSONObject(asString2)));
            } catch (JSONException | Exception unused) {
            }
        }
        kotlin.jvm.internal.g.b(asInteger);
        int intValue = asInteger.intValue();
        kotlin.jvm.internal.g.b(asString);
        kotlin.jvm.internal.g.b(asBoolean);
        boolean booleanValue = asBoolean.booleanValue();
        kotlin.jvm.internal.g.b(asBoolean2);
        boolean booleanValue2 = asBoolean2.booleanValue();
        kotlin.jvm.internal.g.b(asInteger2);
        int intValue2 = asInteger2.intValue();
        kotlin.jvm.internal.g.b(asLong);
        long longValue = asLong.longValue();
        kotlin.jvm.internal.g.b(asLong2);
        return new N1(intValue, asString, hashMap, booleanValue, booleanValue2, intValue2, longValue, asLong2.longValue());
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final ContentValues b(Object obj) {
        N1 click = (N1) obj;
        kotlin.jvm.internal.g.e(click, "click");
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, Integer.valueOf(click.f14506a));
        contentValues.put(InMobiNetworkValues.URL, click.f14507b);
        contentValues.put("pending_attempts", Integer.valueOf(click.f14510f));
        contentValues.put("ts", Long.valueOf(click.f14511g));
        contentValues.put("created_ts", Long.valueOf(click.f14512h));
        contentValues.put("follow_redirect", Boolean.valueOf(click.f14508d));
        contentValues.put("ping_in_webview", Boolean.valueOf(click.f14509e));
        Map map = click.c;
        if (map != null && !map.isEmpty()) {
            Map map2 = click.c;
            kotlin.jvm.internal.g.c(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            contentValues.put("track_extras", new JSONObject(map2).toString());
        }
        return contentValues;
    }

    public final ArrayList a(int i10, int i11) {
        if (AbstractC1860x1.a((AbstractC1860x1) this) == 0) {
            return new ArrayList();
        }
        Integer valueOf = -1 == i10 ? null : Integer.valueOf(i10);
        ArrayList<N1> a10 = AbstractC1860x1.a(this, null, null, "ts", "ts < " + (System.currentTimeMillis() - i11), "ts ASC ", valueOf, 3);
        ArrayList arrayList = new ArrayList();
        for (N1 n12 : a10) {
            if (n12 != null) {
                arrayList.add(n12);
            }
        }
        return arrayList;
    }

    public static HashMap a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            kotlin.jvm.internal.g.b(next);
            Object obj = jSONObject.get(next);
            kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.String");
            hashMap.put(next, (String) obj);
        }
        return hashMap;
    }
}
