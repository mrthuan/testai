package com.bytedance.sdk.openadsdk.hpZ;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PlayableJsBridge.java */
/* loaded from: classes.dex */
public class ROR {
    private Context Qhi;
    private WeakReference<hm> cJ;

    /* renamed from: ac  reason: collision with root package name */
    private Map<String, Qhi> f9312ac = new HashMap();
    private SensorEventListener CJ = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.1
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            hm CJ;
            if (sensorEvent.sensor.getType() != 1 || (CJ = ROR.this.CJ()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, f11);
                jSONObject.put("z", f12);
                CJ.Qhi("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };

    /* renamed from: fl  reason: collision with root package name */
    private SensorEventListener f9313fl = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.12
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            hm CJ;
            if (sensorEvent.sensor.getType() != 4 || (CJ = ROR.this.CJ()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, degrees2);
                jSONObject.put("z", degrees3);
                CJ.Qhi("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };
    private SensorEventListener Tgh = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.23
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            hm CJ;
            if (sensorEvent.sensor.getType() != 10 || (CJ = ROR.this.CJ()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, f11);
                jSONObject.put("z", f12);
                CJ.Qhi("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };
    private SensorEventListener ROR = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.34
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = Gm.cJ;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = Gm.f9310ac;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = Gm.CJ;
            SensorManager.getRotationMatrix(fArr5, null, Gm.cJ, Gm.f9310ac);
            float[] fArr6 = Gm.f9311fl;
            SensorManager.getOrientation(fArr5, fArr6);
            hm CJ = ROR.this.CJ();
            if (CJ == null) {
                return;
            }
            float f10 = fArr6[0];
            float f11 = fArr6[1];
            float f12 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f10);
                jSONObject.put("beta", f11);
                jSONObject.put("gamma", f12);
                CJ.Qhi("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };

    /* compiled from: PlayableJsBridge.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        JSONObject Qhi(JSONObject jSONObject);
    }

    public ROR(hm hmVar) {
        this.Qhi = hmVar.Qhi();
        this.cJ = new WeakReference<>(hmVar);
        ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public hm CJ() {
        WeakReference<hm> weakReference = this.cJ;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void ac() {
        this.f9312ac.put("adInfo", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.45
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                if (CJ != null) {
                    JSONObject tP = CJ.tP();
                    if (tP != null) {
                        tP.put("code", 1);
                        return tP;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.f9312ac.put("appInfo", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.56
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                for (String str : ROR.this.Qhi()) {
                    jSONArray.put(str);
                }
                jSONObject2.put("supportList", jSONArray);
                hm CJ = ROR.this.CJ();
                if (CJ != null) {
                    jSONObject2.put("deviceId", CJ.ROR());
                    jSONObject2.put("netType", CJ.hpZ());
                    jSONObject2.put("innerAppName", CJ.CJ());
                    jSONObject2.put("appName", CJ.fl());
                    jSONObject2.put("appVersion", CJ.Tgh());
                    Map<String, String> cJ = CJ.cJ();
                    for (String str2 : cJ.keySet()) {
                        jSONObject2.put(str2, cJ.get(str2));
                    }
                }
                return jSONObject2;
            }
        });
        this.f9312ac.put("playableSDKInfo", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.61
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.f9312ac.put("subscribe_app_ad", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.62
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.hpZ.Qhi fl2 = ROR.this.fl();
                JSONObject jSONObject2 = new JSONObject();
                if (fl2 == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("download_app_ad", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.63
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.hpZ.Qhi fl2 = ROR.this.fl();
                JSONObject jSONObject2 = new JSONObject();
                if (fl2 == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("isViewable", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.2
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                if (CJ == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", CJ.hm());
                return jSONObject3;
            }
        });
        this.f9312ac.put("getVolume", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.3
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                if (CJ == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", CJ.Sf());
                return jSONObject3;
            }
        });
        this.f9312ac.put("getScreenSize", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.4
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                if (CJ == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject kYc = CJ.kYc();
                kYc.put("code", 1);
                return kYc;
            }
        });
        this.f9312ac.put("start_accelerometer_observer", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.5
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                int i10 = 2;
                if (jSONObject != null) {
                    try {
                        i10 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        Sf.Qhi("PlayableJsBridge", "invoke start_accelerometer_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                Gm.Qhi(ROR.this.Qhi, ROR.this.CJ, i10);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("close_accelerometer_observer", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.6
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Gm.Qhi(ROR.this.Qhi, ROR.this.CJ);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    Sf.Qhi("PlayableJsBridge", "invoke close_accelerometer_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9312ac.put("start_gyro_observer", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.7
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                int i10 = 2;
                if (jSONObject != null) {
                    try {
                        i10 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        Sf.Qhi("PlayableJsBridge", "invoke start_gyro_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                Gm.cJ(ROR.this.Qhi, ROR.this.f9313fl, i10);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("close_gyro_observer", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.8
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Gm.Qhi(ROR.this.Qhi, ROR.this.f9313fl);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    Sf.Qhi("PlayableJsBridge", "invoke close_gyro_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9312ac.put("start_accelerometer_grativityless_observer", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.9
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                int i10 = 2;
                if (jSONObject != null) {
                    try {
                        i10 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        Sf.Qhi("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                Gm.ac(ROR.this.Qhi, ROR.this.Tgh, i10);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("close_accelerometer_grativityless_observer", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.10
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Gm.Qhi(ROR.this.Qhi, ROR.this.Tgh);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    Sf.Qhi("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9312ac.put("start_rotation_vector_observer", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.11
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                int i10 = 2;
                if (jSONObject != null) {
                    try {
                        i10 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        Sf.Qhi("PlayableJsBridge", "invoke start_rotation_vector_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                Gm.CJ(ROR.this.Qhi, ROR.this.ROR, i10);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("close_rotation_vector_observer", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.13
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Gm.Qhi(ROR.this.Qhi, ROR.this.ROR);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    Sf.Qhi("PlayableJsBridge", "invoke close_rotation_vector_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9312ac.put("device_shake", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.14
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Gm.Qhi(ROR.this.Qhi, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    Sf.Qhi("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9312ac.put("device_shake_short", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.15
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    Gm.Qhi(ROR.this.Qhi, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    Sf.Qhi("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9312ac.put("playable_style", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.16
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ != null) {
                    JSONObject ac2 = CJ.ac();
                    ac2.put("code", 1);
                    return ac2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("sendReward", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.17
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ != null) {
                    CJ.qMt();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("webview_time_track", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.18
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                return new JSONObject();
            }
        });
        this.f9312ac.put("playable_event", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.19
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ != null && jSONObject != null) {
                    CJ.cJ(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("reportAd", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.20
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("close", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.21
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("openAdLandPageLinks", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.22
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("get_viewport", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.24
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject MQ = CJ.MQ();
                MQ.put("code", 1);
                return MQ;
            }
        });
        this.f9312ac.put("jssdk_load_finish", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.25
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.sDy();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_material_render_result", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.26
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.hm(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("detect_change_playable_click", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.27
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject WAv = CJ.WAv();
                WAv.put("code", 1);
                return WAv;
            }
        });
        this.f9312ac.put("check_camera_permission", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.28
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject ABk = CJ.ABk();
                ABk.put("code", 1);
                return ABk;
            }
        });
        this.f9312ac.put("check_external_storage", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.29
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject iMK = CJ.iMK();
                if (iMK.isNull("result")) {
                    iMK.put("code", -1);
                } else {
                    iMK.put("code", 1);
                }
                return iMK;
            }
        });
        this.f9312ac.put("playable_open_camera", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.30
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_pick_photo", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.31
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_download_media_in_photos", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.32
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.Qhi(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_preventTouchEvent", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.33
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.cJ(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_settings_info", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.35
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject pA = CJ.pA();
                pA.put("code", 1);
                return pA;
            }
        });
        this.f9312ac.put("playable_load_main_scene", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.36
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.EBS();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_enter_section", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.37
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.CJ(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_end", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.38
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.bxS();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_finish_play_playable", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.39
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.Dww();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_transfrom_module_show", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.40
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.CQU();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_transfrom_module_change_color", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.41
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.pM();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_set_scroll_rect", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.42
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_click_area", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.43
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.fl(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_real_play_start", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.44
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_material_first_frame_show", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.46
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.Eh();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_stuck_check_pong", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.47
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.aP();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_material_adnormal_mask", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.48
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                CJ.Tgh(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_long_press_panel", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.49
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_alpha_player_play", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.50
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_transfrom_module_highlight", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.51
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_send_click_event", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.52
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_query_media_permission_declare", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.53
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject ROR = CJ.ROR(jSONObject);
                ROR.put("code", 1);
                return ROR;
            }
        });
        this.f9312ac.put("playable_query_media_permission_enable", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.54
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                hm CJ = ROR.this.CJ();
                JSONObject jSONObject2 = new JSONObject();
                if (CJ == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject Sf = CJ.Sf(jSONObject);
                Sf.put("code", 1);
                return Sf;
            }
        });
        this.f9312ac.put("playable_apply_media_permission", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.55
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.hpZ.Qhi fl2 = ROR.this.fl();
                JSONObject jSONObject2 = new JSONObject();
                if (fl2 == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_start_kws", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.57
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.hpZ.Qhi fl2 = ROR.this.fl();
                JSONObject jSONObject2 = new JSONObject();
                if (fl2 == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_close_kws", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.58
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.hpZ.Qhi fl2 = ROR.this.fl();
                JSONObject jSONObject2 = new JSONObject();
                if (fl2 == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_video_preload_task_add", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.59
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.hpZ.Qhi fl2 = ROR.this.fl();
                JSONObject jSONObject2 = new JSONObject();
                if (fl2 == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.f9312ac.put("playable_video_preload_task_cancel", new Qhi() { // from class: com.bytedance.sdk.openadsdk.hpZ.ROR.60
            @Override // com.bytedance.sdk.openadsdk.hpZ.ROR.Qhi
            public JSONObject Qhi(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.hpZ.Qhi fl2 = ROR.this.fl();
                JSONObject jSONObject2 = new JSONObject();
                if (fl2 == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.hpZ.Qhi fl() {
        hm CJ = CJ();
        if (CJ == null) {
            return null;
        }
        return CJ.HzH();
    }

    public Set<String> Qhi() {
        return this.f9312ac.keySet();
    }

    public void cJ() {
        Gm.Qhi(this.Qhi, this.CJ);
        Gm.Qhi(this.Qhi, this.f9313fl);
        Gm.Qhi(this.Qhi, this.Tgh);
        Gm.Qhi(this.Qhi, this.ROR);
    }

    public JSONObject Qhi(String str, JSONObject jSONObject) {
        try {
            Qhi qhi = this.f9312ac.get(str);
            if (qhi == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return qhi.Qhi(jSONObject);
        } catch (Throwable th2) {
            Sf.Qhi("PlayableJsBridge", "invoke error", th2);
            return null;
        }
    }
}
