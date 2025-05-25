package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.k3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1692k3 {
    public static String c;

    /* renamed from: f  reason: collision with root package name */
    public static JSONObject f15254f;

    /* renamed from: g  reason: collision with root package name */
    public static Integer f15255g;

    /* renamed from: h  reason: collision with root package name */
    public static Float f15256h;

    /* renamed from: a  reason: collision with root package name */
    public static final C1706l3 f15250a = new C1706l3(0, 2.0f, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final C1678j3 f15251b = new C1678j3(0, 0);

    /* renamed from: d  reason: collision with root package name */
    public static float f15252d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f15253e = true;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f15257i = C1566b3.f14952a.x();

    public static String a() {
        Display a10;
        Context d10 = Ha.d();
        if (d10 == null || (a10 = a(d10)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a10.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append('x');
        sb2.append(i11);
        return sb2.toString();
    }

    public static float b() {
        Display a10;
        if (f15252d == -1.0f) {
            Context d10 = Ha.d();
            if (d10 == null || (a10 = a(d10)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            a10.getMetrics(displayMetrics);
            float f10 = displayMetrics.density;
            if (f10 == 0.0f) {
                return 2.0f;
            }
            f15252d = f10;
        }
        return f15252d;
    }

    public static HashMap c() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("d-device-screen-density", String.valueOf(b()));
            C1706l3 d10 = d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d10.f15274a);
            sb2.append('X');
            sb2.append(d10.f15275b);
            hashMap.put("d-device-screen-size", sb2.toString());
            hashMap.put("d-density-dependent-screen-size", a());
            hashMap.put("d-orientation", String.valueOf((int) g()));
            Float f10 = f15256h;
            hashMap.put("d-textsize", String.valueOf(f10 != null ? f10.floatValue() : 37.0f));
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static C1706l3 d() {
        Context d10 = Ha.d();
        if (d10 == null) {
            return f15250a;
        }
        Display a10 = a(d10);
        if (a10 == null) {
            return f15250a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a10.getMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new C1706l3((int) (displayMetrics.widthPixels / f10), f10, (int) (displayMetrics.heightPixels / f10));
    }

    public static String e() {
        String str = null;
        if (f15253e) {
            return null;
        }
        String str2 = c;
        if (str2 != null) {
            return str2;
        }
        Context d10 = Ha.d();
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            str = AbstractC1838v5.a(d10, "display_info_store").f15579a.getString("gesture_margin", null);
        }
        c = str;
        return str;
    }

    public static Integer f() {
        Context d10 = Ha.d();
        if (d10 == null) {
            return null;
        }
        int i10 = Settings.Secure.getInt(d10.getContentResolver(), "navigation_mode", -1);
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return 1;
        }
        return 0;
    }

    public static byte g() {
        Display a10;
        Context d10 = Ha.d();
        if (d10 == null || (a10 = a(d10)) == null) {
            return (byte) 1;
        }
        int rotation = a10.getRotation();
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation == 2) {
            return (byte) 2;
        }
        if (rotation != 3) {
            return (byte) 1;
        }
        return (byte) 4;
    }

    public static C1706l3 h() {
        Context d10 = Ha.d();
        if (d10 == null) {
            return f15250a;
        }
        Display a10 = a(d10);
        if (a10 == null) {
            return f15250a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a10.getRealMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new C1706l3((int) (displayMetrics.widthPixels / f10), f10, (int) (displayMetrics.heightPixels / f10));
    }

    public static final void b(WindowInsets insets, Context context) {
        Insets systemGestureInsets;
        String insets2;
        kotlin.jvm.internal.g.e(insets, "$insets");
        try {
            systemGestureInsets = insets.getSystemGestureInsets();
            insets2 = systemGestureInsets.toString();
            kotlin.jvm.internal.g.d(insets2, "toString(...)");
            String[] strArr = (String[]) new Regex("Insets").split(insets2, 0).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new Regex(",").split(new Regex("[^0-9,=a-zA-Z]*").replace(strArr[1], ""), 0).toArray(new String[0]);
                stringBuffer.append("{");
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String[] strArr3 = (String[]) new Regex("=").split(strArr2[i10], 0).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append('\"' + strArr3[0] + '\"');
                        stringBuffer.append(":");
                        stringBuffer.append(a(Integer.parseInt(strArr3[1])));
                        if (i10 < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append("}");
            }
            if (stringBuffer.length() > 0) {
                c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                kotlin.jvm.internal.g.b(context);
                C1851w5 a10 = AbstractC1838v5.a(context, "display_info_store");
                String stringBuffer2 = stringBuffer.toString();
                SharedPreferences.Editor edit = a10.f15579a.edit();
                edit.putString("gesture_margin", stringBuffer2);
                edit.apply();
            }
        } catch (Exception unused) {
        }
    }

    public static final int a(int i10) {
        try {
            return pdf.pdfreader.viewer.editor.free.utils.t0.o0(i10 / b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void a(WindowInsets insets, Context context) {
        kotlin.jvm.internal.g.e(insets, "insets");
        if (f15253e) {
            return;
        }
        Ha.a(new androidx.fragment.app.g(9, insets, context));
    }

    public static Display a(Context context) {
        if (C1566b3.f14952a.w()) {
            Object systemService = context.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                return displayManager.getDisplay(0);
            }
            return null;
        }
        Object systemService2 = context.getSystemService("window");
        WindowManager windowManager = systemService2 instanceof WindowManager ? (WindowManager) systemService2 : null;
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    public static final void c(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (f15253e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    public static int a(WindowInsets insets) {
        Insets insets2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.g.e(insets, "insets");
        if (C1566b3.f14952a.E()) {
            EnumC1586c9 a10 = AbstractC1600d9.a(g());
            insets2 = insets.getInsets(16);
            kotlin.jvm.internal.g.d(insets2, "getInsets(...)");
            int ordinal = a10.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i12 = insets2.left;
                    if (i12 != 0) {
                        return 1;
                    }
                    i13 = insets2.bottom;
                    if (i13 != 0) {
                        return 1;
                    }
                } else if (ordinal != 2) {
                    if (ordinal == 3) {
                        i14 = insets2.right;
                        if (i14 != 0) {
                            return 1;
                        }
                        i15 = insets2.bottom;
                        if (i15 != 0) {
                            return 1;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            i10 = insets2.left;
            if (i10 != 0) {
                return 1;
            }
            i11 = insets2.right;
            if (i11 != 0) {
                return 1;
            }
        }
        return 0;
    }

    public static void a(Map value) {
        kotlin.jvm.internal.g.e(value, "value");
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        Ha.a(new f0.s(11, value, d10));
    }

    public static final void a(Map value, Context context) {
        kotlin.jvm.internal.g.e(value, "$value");
        kotlin.jvm.internal.g.e(context, "$context");
        Objects.toString(value);
        if (f15254f == null) {
            f15254f = new JSONObject();
        }
        for (Number number : value.keySet()) {
            int intValue = number.intValue();
            JSONObject jSONObject = f15254f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(intValue), value.get(Integer.valueOf(intValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        C1851w5 a10 = AbstractC1838v5.a(context, "display_info_store");
        JSONObject jSONObject2 = f15254f;
        a10.a("safe_area", jSONObject2 != null ? jSONObject2.toString() : null);
    }

    public static C1678j3 b(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        Display a10 = a(context);
        if (a10 == null) {
            return f15251b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a10.getRealMetrics(displayMetrics);
        return new C1678j3(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static void a(Integer num) {
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        Ha.a(new n0.g(15, num, d10));
    }

    public static final void a(Integer num, Context context) {
        kotlin.jvm.internal.g.e(context, "$context");
        f15255g = num;
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        AbstractC1838v5.a(context, "display_info_store").a("nav_bar_type", num != null ? num.intValue() : -1);
    }
}
