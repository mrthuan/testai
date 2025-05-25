package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: EventBinding.kt */
/* loaded from: classes.dex */
public final class EventBinding {

    /* renamed from: a  reason: collision with root package name */
    public final String f9503a;

    /* renamed from: b  reason: collision with root package name */
    public final List<PathComponent> f9504b;
    public final List<w5.a> c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9505d;

    /* compiled from: EventBinding.kt */
    /* loaded from: classes.dex */
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* compiled from: EventBinding.kt */
    /* loaded from: classes.dex */
    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    /* compiled from: EventBinding.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static EventBinding a(JSONObject jSONObject) {
            String eventName = jSONObject.getString("event_name");
            String string = jSONObject.getString("method");
            g.d(string, "mapping.getString(\"method\")");
            Locale ENGLISH = Locale.ENGLISH;
            g.d(ENGLISH, "ENGLISH");
            String upperCase = string.toUpperCase(ENGLISH);
            g.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            MappingMethod valueOf = MappingMethod.valueOf(upperCase);
            String string2 = jSONObject.getString("event_type");
            g.d(string2, "mapping.getString(\"event_type\")");
            String upperCase2 = string2.toUpperCase(ENGLISH);
            g.d(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            ActionType valueOf2 = ActionType.valueOf(upperCase2);
            String appVersion = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jsonPath = jSONArray.getJSONObject(i10);
                g.d(jsonPath, "jsonPath");
                arrayList.add(new PathComponent(jsonPath));
            }
            String pathType = jSONObject.optString("path_type", "absolute");
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null) {
                int length2 = optJSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jsonParameter = optJSONArray.getJSONObject(i11);
                    g.d(jsonParameter, "jsonParameter");
                    arrayList2.add(new w5.a(jsonParameter));
                }
            }
            String componentId = jSONObject.optString("component_id");
            String activityName = jSONObject.optString("activity_name");
            g.d(eventName, "eventName");
            g.d(appVersion, "appVersion");
            g.d(componentId, "componentId");
            g.d(pathType, "pathType");
            g.d(activityName, "activityName");
            return new EventBinding(eventName, valueOf, valueOf2, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
        }
    }

    public EventBinding(String str, MappingMethod method, ActionType type, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5) {
        g.e(method, "method");
        g.e(type, "type");
        this.f9503a = str;
        this.f9504b = arrayList;
        this.c = arrayList2;
        this.f9505d = str5;
    }
}
