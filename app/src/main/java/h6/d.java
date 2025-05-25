package h6;

import com.facebook.e;
import com.facebook.internal.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstrumentUtility.kt */
/* loaded from: classes.dex */
public final class d {
    public static final void a(String str) {
        File b10 = b();
        if (b10 != null && str != null) {
            new File(b10, str).delete();
        }
    }

    public static final File b() {
        File file = new File(com.facebook.d.a().getCacheDir(), "instrument");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static final boolean c(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        g.d(className, "element.className");
        if (!j.M(className, "com.facebook", false)) {
            String className2 = stackTraceElement.getClassName();
            g.d(className2, "element.className");
            if (!j.M(className2, "com.meta", false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement element : stackTrace) {
                g.d(element, "element");
                if (c(element)) {
                    String className = element.getClassName();
                    g.d(className, "element.className");
                    if (!j.M(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = element.getClassName();
                        g.d(className2, "element.className");
                        if (!j.M(className2, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    g.d(methodName, "element.methodName");
                    if (j.M(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        g.d(methodName2, "element.methodName");
                        if (j.M(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            g.d(methodName3, "element.methodName");
                            if (!j.M(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final JSONObject e(String str) {
        File b10 = b();
        if (b10 != null) {
            try {
                return new JSONObject(p.z(new FileInputStream(new File(b10, str))));
            } catch (Exception unused) {
                a(str);
                return null;
            }
        }
        return null;
    }

    public static final void f(String str, JSONArray jSONArray, e.b bVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject m10 = p.m();
            if (m10 != null) {
                Iterator<String> keys = m10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, m10.get(next));
                }
            }
            String str2 = e.f9701j;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{com.facebook.d.b()}, 1));
            g.d(format, "format(format, *args)");
            e.c.h(null, format, jSONObject, bVar).d();
        } catch (JSONException unused) {
        }
    }

    public static final void g(String str, String str2) {
        File b10 = b();
        if (b10 != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(b10, str));
                byte[] bytes = str2.getBytes(kotlin.text.a.f19966b);
                g.d(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
