package com.pgl.ssdk;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.Arrays;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class PglArmorCallApi {

    /* renamed from: a  reason: collision with root package name */
    private static Context f15858a;

    /* compiled from: PglArmorCallApi.java */
    /* renamed from: com.pgl.ssdk.v$a */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            w.b(PglArmorCallApi.b());
            com.pgl.ssdk.ces.a.meta(226, PglArmorCallApi.b(), null);
        }
    }

    @DungeonFlag
    public static String a(Context context) {
        TelephonyManager telephonyManager;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 0);
            jSONObject.put("envcode", ((Long) com.pgl.ssdk.ces.a.meta(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, context, null)).longValue());
            jSONObject.put("bootcount", DeviceInfo.a(context));
            Object meta = com.pgl.ssdk.ces.a.meta(ShapeTypes.FLOW_CHART_MAGNETIC_DISK, context, null);
            jSONObject.put("usb_debug", meta instanceof Boolean ? ((Boolean) meta).booleanValue() : false);
            JSONArray[] b10 = DeviceInfo.b(context);
            if (b10 != null) {
                jSONObject.put("sdata", b10[0]);
                jSONObject.put("sdmta", b10[1]);
                jSONObject.put("curtime", System.currentTimeMillis() / 1000);
            }
            jSONObject.put("camera_count", HardwareDetectForSec.a());
            if (HardwareDetectForSec.f15847a == -1 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                HardwareDetectForSec.f15847a = telephonyManager.getSimState();
            }
            jSONObject.put("sim", HardwareDetectForSec.f15847a);
            jSONObject.put("virtual_display", w.a(context));
            jSONObject.put("acbs", AcbInfo.a(context));
            Object meta2 = com.pgl.ssdk.ces.a.meta(ShapeTypes.FLOW_CHART_MAGNETIC_DRUM, context, null);
            jSONObject.put("bl_unlock", meta2 instanceof Boolean ? ((Boolean) meta2).booleanValue() : false);
            InputInfo.g();
            InputInfo.a(jSONObject);
            String d10 = r.d();
            jSONObject.put("romtype", DeviceInfo.c());
            if (!TextUtils.isEmpty(d10)) {
                jSONObject.put("sign", d10);
            }
            return (String) com.pgl.ssdk.ces.a.meta(227, context, jSONObject.toString());
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("status", 3);
                jSONObject2.put("exception", th2.toString());
                jSONObject2.put("stacktrace", Arrays.toString(th2.getStackTrace()));
                jSONObject2.put("cause", String.valueOf(th2.getCause()));
                return Base64.encodeToString(jSONObject2.toString().getBytes("UTF-8"), 0);
            } catch (Throwable unused) {
                return "eyJzdGF0dXMiOjN9";
            }
        }
    }

    public static void b(Context context) {
        f15858a = context;
    }

    public static String c() {
        String a10 = a(f15858a);
        a();
        return a10;
    }

    public static Context b() {
        return f15858a;
    }

    @DungeonFlag
    public static void a() {
        ApkUtils.a(new a());
    }
}
