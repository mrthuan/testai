package com.inmobi.media;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Vb {

    /* renamed from: a  reason: collision with root package name */
    public static final ScheduledExecutorService f14759a = Executors.newSingleThreadScheduledExecutor();

    public static final String a(Thread thread, Throwable error) {
        kotlin.jvm.internal.g.e(error, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NamingTable.TAG, error.getClass().getSimpleName());
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, error.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(error));
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (JSONException e10) {
            e10.toString();
            return "";
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        kotlin.jvm.internal.g.e(stackTraceElementArr, "<this>");
        Regex regex = new Regex("com\\.inmobi\\.(media|ads|commons|unification|sdk|unifiedId|adquality|compliance)");
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (a(stackTraceElement, InMobiInterstitial.a.class.getSuperclass()) || a(stackTraceElement, InMobiInterstitial.a.class) || a(stackTraceElement, InMobiNative.NativeCallbacks.class) || a(stackTraceElement, InMobiBanner.a.class) || a(stackTraceElement, InMobiBanner.a.class.getSuperclass()) || (kotlin.jvm.internal.g.a(stackTraceElement.getClassName(), InMobiSdk.class.getName()) && kotlin.jvm.internal.g.a(stackTraceElement.getMethodName(), InMobiSdk.class.getDeclaredMethod("a", SdkInitializationListener.class, String.class).getName()))) {
                break;
            }
            String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.g.d(className, "getClassName(...)");
            if (kotlin.text.k.O(className, H2.class.getName(), false)) {
                break;
            }
            String className2 = stackTraceElement.getClassName();
            kotlin.jvm.internal.g.d(className2, "getClassName(...)");
            if (regex.containsMatchIn(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a(StackTraceElement[] stackTraceElementArr) {
        kotlin.jvm.internal.g.e(stackTraceElementArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb2.append(stackTraceElement.toString());
            sb2.append('\n');
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "toString(...)");
        return sb3;
    }

    public static final boolean a(R4 r4) {
        kotlin.jvm.internal.g.e(r4, "<this>");
        if (r4 instanceof I2) {
            StackTraceElement[] stackTraceElementArr = ((I2) r4).f14339g;
            if (stackTraceElementArr != null) {
                return b(stackTraceElementArr);
            }
            kotlin.jvm.internal.g.i("stackTrace");
            throw null;
        }
        if (r4 instanceof H0) {
            H0 h02 = (H0) r4;
            if (h02.f14308g == 6) {
                return new Regex("com\\.inmobi\\.(media|ads|commons|unification|sdk|unifiedId|adquality|compliance)").containsMatchIn(h02.f14309h);
            }
        } else if (r4 instanceof xc) {
            return b(((xc) r4).f15660g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        kotlin.jvm.internal.g.e(stackTraceElement, "<this>");
        if (cls != null && kotlin.jvm.internal.g.a(stackTraceElement.getClassName(), cls.getName())) {
            Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
            kotlin.jvm.internal.g.d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.g.a(stackTraceElement.getMethodName(), method.getName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
