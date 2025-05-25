package com.facebook.appevents.codeless.internal;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

/* compiled from: PathComponent.kt */
/* loaded from: classes.dex */
public final class PathComponent {

    /* renamed from: a  reason: collision with root package name */
    public final String f9508a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9509b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9510d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9511e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9512f;

    /* renamed from: g  reason: collision with root package name */
    public final String f9513g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9514h;

    /* compiled from: PathComponent.kt */
    /* loaded from: classes.dex */
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int value;

        MatchBitmaskType(int i10) {
            this.value = i10;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(JSONObject jSONObject) {
        String string = jSONObject.getString("class_name");
        g.d(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f9508a = string;
        this.f9509b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt(FacebookMediationAdapter.KEY_ID);
        String optString = jSONObject.optString("text");
        g.d(optString, "component.optString(PATH_TEXT_KEY)");
        this.f9510d = optString;
        String optString2 = jSONObject.optString("tag");
        g.d(optString2, "component.optString(PATH_TAG_KEY)");
        this.f9511e = optString2;
        String optString3 = jSONObject.optString(InMobiNetworkValues.DESCRIPTION);
        g.d(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f9512f = optString3;
        String optString4 = jSONObject.optString("hint");
        g.d(optString4, "component.optString(PATH_HINT_KEY)");
        this.f9513g = optString4;
        this.f9514h = jSONObject.optInt("match_bitmask");
    }
}
