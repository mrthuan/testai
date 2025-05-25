package v5;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import com.facebook.LoggingBehavior;
import com.facebook.e;
import com.facebook.i;
import com.facebook.internal.j;
import f0.s;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewIndexer.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final String f30674e;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f30675a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Activity> f30676b;
    public Timer c;

    /* renamed from: d  reason: collision with root package name */
    public String f30677d;

    /* compiled from: ViewIndexer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static com.facebook.e a(String str, com.facebook.a aVar, String str2) {
            String str3;
            String str4 = com.facebook.e.f9701j;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
            com.facebook.e h10 = e.c.h(aVar, format, null, null);
            Bundle bundle = h10.f9706d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("tree", str);
            int i10 = c6.f.f5607a;
            Context a10 = com.facebook.d.a();
            try {
                str3 = a10.getPackageManager().getPackageInfo(a10.getPackageName(), 0).versionName;
                kotlin.jvm.internal.g.d(str3, "{\n      val packageInfo …ageInfo.versionName\n    }");
            } catch (PackageManager.NameNotFoundException unused) {
                str3 = "";
            }
            bundle.putString("app_version", str3);
            bundle.putString("platform", "android");
            bundle.putString("request_type", "app_indexing");
            if (kotlin.jvm.internal.g.a("app_indexing", "app_indexing")) {
                bundle.putString("device_session_id", v5.b.a());
            }
            h10.f9706d = bundle;
            h10.j(new e());
            return h10;
        }
    }

    /* compiled from: ViewIndexer.kt */
    /* loaded from: classes.dex */
    public static final class b implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f30678a;

        public b(View view) {
            this.f30678a = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            View view = this.f30678a.get();
            if (view != null && view.getWidth() != 0 && view.getHeight() != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                kotlin.jvm.internal.g.d(createBitmap, "createBitmap(view.width,…t, Bitmap.Config.RGB_565)");
                view.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                kotlin.jvm.internal.g.d(encodeToString, "encodeToString(outputStr…eArray(), Base64.NO_WRAP)");
                return encodeToString;
            }
            return "";
        }
    }

    /* compiled from: ViewIndexer.kt */
    /* loaded from: classes.dex */
    public static final class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            WeakReference<Activity> weakReference;
            try {
                boolean b10 = k6.a.b(f.class);
                Handler handler = null;
                f fVar = f.this;
                if (b10) {
                    weakReference = null;
                } else {
                    weakReference = fVar.f30676b;
                }
                Activity activity = weakReference.get();
                View b11 = c6.f.b(activity);
                if (activity != null && b11 != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    v5.b bVar = v5.b.f30651a;
                    boolean z10 = false;
                    if (!k6.a.b(v5.b.class)) {
                        z10 = v5.b.f30656g.get();
                    }
                    if (!z10) {
                        return;
                    }
                    FutureTask futureTask = new FutureTask(new b(b11));
                    if (!k6.a.b(f.class)) {
                        handler = fVar.f30675a;
                    }
                    handler.post(futureTask);
                    String str = "";
                    try {
                        str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                    } catch (Exception unused) {
                        f.a();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("screenname", simpleName);
                        jSONObject.put("screenshot", str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(w5.c.d(b11));
                        jSONObject.put("view", jSONArray);
                    } catch (JSONException unused2) {
                        f.a();
                    }
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.g.d(jSONObject2, "viewTree.toString()");
                    if (!k6.a.b(f.class)) {
                        fVar.getClass();
                        if (!k6.a.b(fVar)) {
                            com.facebook.d.c().execute(new n0.g(5, jSONObject2, fVar));
                        }
                    }
                }
            } catch (Exception unused3) {
                f.a();
            }
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f30674e = canonicalName;
    }

    public f(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        this.f30676b = new WeakReference<>(activity);
        this.f30677d = null;
        this.f30675a = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ String a() {
        if (k6.a.b(f.class)) {
            return null;
        }
        try {
            return f30674e;
        } catch (Throwable th2) {
            k6.a.a(f.class, th2);
            return null;
        }
    }

    public final void b(com.facebook.e eVar, String str) {
        if (k6.a.b(this) || eVar == null) {
            return;
        }
        try {
            i c10 = eVar.c();
            try {
                JSONObject jSONObject = c10.f9728b;
                if (jSONObject != null) {
                    if (kotlin.jvm.internal.g.a("true", jSONObject.optString("success"))) {
                        j.a aVar = j.f9803d;
                        j.a.a(LoggingBehavior.APP_EVENTS, f30674e, "Successfully send UI component tree to server");
                        this.f30677d = str;
                    }
                    if (jSONObject.has("is_app_indexing_enabled")) {
                        boolean z10 = jSONObject.getBoolean("is_app_indexing_enabled");
                        v5.b bVar = v5.b.f30651a;
                        if (!k6.a.b(v5.b.class)) {
                            try {
                                v5.b.f30656g.set(z10);
                                return;
                            } catch (Throwable th2) {
                                k6.a.a(v5.b.class, th2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Objects.toString(c10.c);
            } catch (JSONException unused) {
            }
        } catch (Throwable th3) {
            k6.a.a(this, th3);
        }
    }

    public final void c() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            try {
                com.facebook.d.c().execute(new s(4, this, new c()));
            } catch (RejectedExecutionException unused) {
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
