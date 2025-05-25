package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class InputInfo {

    /* renamed from: a  reason: collision with root package name */
    private static int f15849a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static int f15850b = 0;
    private static int c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static int f15851d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static int f15852e = 0;

    /* renamed from: f  reason: collision with root package name */
    private static int f15853f = 0;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f15854g = false;

    /* renamed from: h  reason: collision with root package name */
    private static InputManager f15855h;

    /* compiled from: InputInfo.java */
    /* renamed from: com.pgl.ssdk.u$a */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f15856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15857b;

        public a(Context context, int i10) {
            this.f15856a = context;
            this.f15857b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean isExternal;
            InputManager a10 = InputInfo.a(this.f15856a);
            if (a10 == null) {
                return;
            }
            InputDevice inputDevice = a10.getInputDevice(this.f15857b);
            InputInfo.g();
            if (inputDevice == null) {
                InputInfo.a();
                InputInfo.b();
                InputInfo.a("nihc");
            } else if (inputDevice.isVirtual()) {
                InputInfo.c();
                InputInfo.d();
                InputInfo.a("vihc");
            } else if (Build.VERSION.SDK_INT >= 29) {
                isExternal = inputDevice.isExternal();
                if (isExternal) {
                    InputInfo.e();
                    InputInfo.f();
                    InputInfo.a("eihc");
                }
            }
        }
    }

    public static /* synthetic */ int a() {
        int i10 = c;
        c = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int b() {
        int i10 = f15853f;
        f15853f = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int c() {
        int i10 = f15849a;
        f15849a = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int d() {
        int i10 = f15851d;
        f15851d = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int e() {
        int i10 = f15850b;
        f15850b = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f() {
        int i10 = f15852e;
        f15852e = i10 + 1;
        return i10;
    }

    public static void g() {
        if (f15854g) {
            return;
        }
        try {
            SharedPreferences a10 = L.a(PglArmorCallApi.b());
            if (a10 != null) {
                f15853f = a10.getInt("nihc", 0);
                f15852e = a10.getInt("eihc", 0);
                f15851d = a10.getInt("vihc", 0);
                f15854g = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(MotionEvent motionEvent, Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        if (motionEvent.getRawX() > 0.0f || motionEvent.getRawY() > 0.0f) {
            ApkUtils.a(new a(context, motionEvent.getDeviceId()));
        }
    }

    public static void a(String str) {
        try {
            SharedPreferences a10 = L.a(PglArmorCallApi.b());
            if (a10 != null) {
                a10.edit().putInt(str, a10.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(JSONObject jSONObject) {
        try {
            jSONObject.put("vihc", f15851d);
            jSONObject.put("eihc", f15852e);
            jSONObject.put("nihc", f15853f);
            jSONObject.put("vic", f15849a);
            jSONObject.put("nic", c);
            jSONObject.put("eic", f15850b);
        } catch (JSONException unused) {
        }
    }

    public static InputManager a(Context context) {
        if (f15855h == null) {
            f15855h = (InputManager) context.getSystemService("input");
        }
        return f15855h;
    }
}
