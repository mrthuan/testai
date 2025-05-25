package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13834a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f13835b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f13836d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f13834a = z10;
        this.f13835b = f10;
        this.c = z11;
        this.f13836d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f13834a);
            if (this.f13834a) {
                jSONObject.put("skipOffset", this.f13835b);
            }
            jSONObject.put("autoPlay", this.c);
            jSONObject.put("position", this.f13836d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f13836d;
    }

    public Float getSkipOffset() {
        return this.f13835b;
    }

    public boolean isAutoPlay() {
        return this.c;
    }

    public boolean isSkippable() {
        return this.f13834a;
    }
}
