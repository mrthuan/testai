package com.iab.omid.library.inmobi.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.iab.omid.library.inmobi.adsession.OutputDeviceStatus;
import com.iab.omid.library.inmobi.walking.a;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static WindowManager f14000a;

    /* renamed from: b  reason: collision with root package name */
    private static String[] f14001b = {"x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, InMobiNetworkValues.WIDTH, InMobiNetworkValues.HEIGHT};
    static float c = Resources.getSystem().getDisplayMetrics().density;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14002a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f14002a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final float f14003a;

        /* renamed from: b  reason: collision with root package name */
        final float f14004b;

        public b(float f10, float f11) {
            this.f14003a = f10;
            this.f14004b = f11;
        }
    }

    public static float a(int i10) {
        return i10 / c;
    }

    public static void b(JSONObject jSONObject) {
        b a10 = a(jSONObject);
        try {
            jSONObject.put(InMobiNetworkValues.WIDTH, a10.f14003a);
            jSONObject.put(InMobiNetworkValues.HEIGHT, a10.f14004b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            if (!optJSONArray.optString(i10, "").equals(optJSONArray2.optString(i10, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f14001b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        if (f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2)) {
            return true;
        }
        return false;
    }

    private static b a(JSONObject jSONObject) {
        float f10;
        float f11;
        if (f14000a != null) {
            Point point = new Point(0, 0);
            f14000a.getDefaultDisplay().getRealSize(point);
            f10 = a(point.x);
            f11 = a(point.y);
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        return new b(f10, f11);
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            d.a("Error with setting not visible reason", e10);
        }
    }

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i10));
            jSONObject.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, a(i11));
            jSONObject.put(InMobiNetworkValues.WIDTH, a(i12));
            jSONObject.put(InMobiNetworkValues.HEIGHT, a(i13));
        } catch (JSONException e10) {
            d.a("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (a(optJSONArray, optJSONArray2)) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                if (!h(optJSONArray.optJSONObject(i10), optJSONArray2.optJSONObject(i10))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void a(Context context) {
        if (context != null) {
            c = context.getResources().getDisplayMetrics().density;
            f14000a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e10) {
            d.a("Error with setting output device status", e10);
        }
    }

    public static void a(JSONObject jSONObject, a.C0185a c0185a) {
        com.iab.omid.library.inmobi.internal.e a10 = c0185a.a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c0185a.b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a10.d());
            jSONObject.put("friendlyObstructionPurpose", a10.b());
            jSONObject.put("friendlyObstructionReason", a10.a());
        } catch (JSONException e10) {
            d.a("Error with setting friendly obstruction", e10);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e10) {
            d.a("Error with setting has window focus", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            d.a("Error with setting ad session id", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            d.a("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f14002a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
