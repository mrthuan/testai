package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfnf {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, InMobiNetworkValues.WIDTH, InMobiNetworkValues.HEIGHT};
    static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject zza(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / zza);
            jSONObject.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, i11 / zza);
            jSONObject.put(InMobiNetworkValues.WIDTH, i12 / zza);
            jSONObject.put(InMobiNetworkValues.HEIGHT, i13 / zza);
        } catch (JSONException e10) {
            zzfng.zza("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void zzb(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            zzfng.zza("Error with setting ad session id", e10);
        }
    }

    public static void zzc(JSONObject jSONObject, JSONObject jSONObject2) {
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

    public static void zzd(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zze(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            zzfng.zza("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void zzf(JSONObject jSONObject) {
        float f10;
        float f11;
        Point point;
        if (zzb != null) {
            zzb.getDefaultDisplay().getRealSize(new Point(0, 0));
            float f12 = zza;
            f10 = point.x / f12;
            f11 = point.y / f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        try {
            jSONObject.put(InMobiNetworkValues.WIDTH, f10);
            jSONObject.put(InMobiNetworkValues.HEIGHT, f11);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean zzg(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            int i10 = 0;
            while (true) {
                if (i10 < 4) {
                    String str = strArr[i10];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i10++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (zzh(optJSONArray, optJSONArray2)) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                if (!optJSONArray.optString(i11, "").equals(optJSONArray2.optString(i11, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (zzh(optJSONArray3, optJSONArray4)) {
                            for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                                if (zzg(optJSONArray3.optJSONObject(i12), optJSONArray4.optJSONObject(i12))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzh(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray != null && jSONArray2 != null && jSONArray.length() == jSONArray2.length()) {
            return true;
        }
        return false;
    }
}
