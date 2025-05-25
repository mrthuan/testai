package sb;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import cg.p;
import com.google.android.play.core.assetpacks.b1;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.h;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import okhttp3.n;
import okhttp3.r;
import okhttp3.s;
import okhttp3.t;
import okhttp3.v;
import okhttp3.w;
import okhttp3.x;
import okhttp3.z;
import org.json.JSONObject;

/* compiled from: NetworkClient.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<okhttp3.e> f29778a;

    /* renamed from: b  reason: collision with root package name */
    public static int f29779b;
    public static final ExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    public static final s f29780d;

    /* compiled from: NetworkClient.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: NetworkClient.kt */
        /* renamed from: sb.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0374a implements okhttp3.f {

            /* renamed from: a  reason: collision with root package name */
            public final AtomicReference<Boolean> f29781a = new AtomicReference<>(Boolean.FALSE);

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.g<sb.b> f29782b;
            public final /* synthetic */ Context c;

            public C0374a(h hVar, Context context) {
                this.f29782b = hVar;
                this.c = context;
            }

            @Override // okhttp3.f
            public final void a(okhttp3.internal.connection.e eVar, x xVar) {
                String str;
                String a10;
                z zVar = xVar.f23447g;
                if (zVar != null) {
                    str = zVar.h();
                } else {
                    str = null;
                }
                AtomicReference<okhttp3.e> atomicReference = d.f29778a;
                kotlinx.coroutines.g<sb.b> gVar = this.f29782b;
                if (gVar.a() && !this.f29781a.getAndSet(Boolean.TRUE).booleanValue()) {
                    if (str != null) {
                        try {
                            a10 = b5.a.a(this.c, str);
                        } catch (Exception e10) {
                            AtomicReference<okhttp3.e> atomicReference2 = d.f29778a;
                            e10.toString();
                            gVar.resumeWith(Result.m13constructorimpl(new sb.b(-1, "")));
                            return;
                        }
                    } else {
                        a10 = null;
                    }
                    if (a10 != null && xVar.f23444d == 200) {
                        JSONObject jSONObject = new JSONObject(a10);
                        if (jSONObject.getInt("code") == 204) {
                            gVar.resumeWith(Result.m13constructorimpl(new sb.b(200, "[]")));
                            return;
                        }
                        int i10 = jSONObject.getInt("code");
                        String jSONArray = jSONObject.getJSONArray("data").toString();
                        kotlin.jvm.internal.g.d(jSONArray, "responseJsonObject.getJSONArray(\"data\").toString()");
                        gVar.resumeWith(Result.m13constructorimpl(new sb.b(i10, jSONArray)));
                        return;
                    }
                    gVar.resumeWith(Result.m13constructorimpl(null));
                }
            }

            @Override // okhttp3.f
            public final void b(okhttp3.internal.connection.e call, IOException iOException) {
                kotlin.jvm.internal.g.e(call, "call");
                iOException.printStackTrace();
                AtomicReference<okhttp3.e> atomicReference = d.f29778a;
                iOException.toString();
                kotlinx.coroutines.g<sb.b> gVar = this.f29782b;
                if (gVar.a() && !this.f29781a.getAndSet(Boolean.TRUE).booleanValue()) {
                    gVar.resumeWith(Result.m13constructorimpl(androidx.activity.s.v(iOException)));
                }
            }
        }

        /* compiled from: NetworkClient.kt */
        /* loaded from: classes2.dex */
        public static final class b implements okhttp3.f {

            /* renamed from: a  reason: collision with root package name */
            public final AtomicReference<Boolean> f29783a = new AtomicReference<>(Boolean.FALSE);

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.g<sb.b> f29784b;

            public b(h hVar) {
                this.f29784b = hVar;
            }

            @Override // okhttp3.f
            public final void a(okhttp3.internal.connection.e eVar, x xVar) {
                kotlinx.coroutines.g<sb.b> gVar = this.f29784b;
                if (gVar.a() && !this.f29783a.getAndSet(Boolean.TRUE).booleanValue()) {
                    if (xVar.f23444d == 201) {
                        gVar.resumeWith(Result.m13constructorimpl(new sb.b(200, "")));
                    } else {
                        gVar.resumeWith(Result.m13constructorimpl(null));
                    }
                }
            }

            @Override // okhttp3.f
            public final void b(okhttp3.internal.connection.e call, IOException iOException) {
                kotlin.jvm.internal.g.e(call, "call");
                iOException.printStackTrace();
                AtomicReference<okhttp3.e> atomicReference = d.f29778a;
                iOException.toString();
                kotlinx.coroutines.g<sb.b> gVar = this.f29784b;
                if (gVar.a() && !this.f29783a.getAndSet(Boolean.TRUE).booleanValue()) {
                    gVar.resumeWith(Result.m13constructorimpl(androidx.activity.s.v(iOException)));
                }
            }
        }

        public static final JSONObject a(Context context) {
            boolean z10;
            boolean z11;
            int i10;
            Locale locale;
            LocaleList locales;
            AtomicReference<okhttp3.e> atomicReference = d.f29778a;
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder();
            String it = Build.MANUFACTURER;
            kotlin.jvm.internal.g.d(it, "it");
            boolean z12 = true;
            if (it.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Float f10 = null;
            if (!z10) {
                it = null;
            }
            String str = "unKnow";
            if (it == null) {
                it = "unKnow";
            }
            sb2.append(it);
            sb2.append(' ');
            String it2 = Build.MODEL;
            kotlin.jvm.internal.g.d(it2, "it");
            if (it2.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                it2 = null;
            }
            if (it2 != null) {
                str = it2;
            }
            sb2.append(str);
            jSONObject.put("model", sb2.toString());
            int i11 = Build.VERSION.SDK_INT;
            jSONObject.put("os_version", i11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(context.getResources().getDisplayMetrics().widthPixels);
            sb3.append('x');
            sb3.append(context.getResources().getDisplayMetrics().heightPixels);
            jSONObject.put("screen_px", sb3.toString());
            Float valueOf = Float.valueOf(context.getResources().getDisplayMetrics().density);
            if (valueOf.floatValue() <= 0.0f) {
                z12 = false;
            }
            if (z12) {
                f10 = valueOf;
            }
            if (f10 != null) {
                i10 = (int) f10.floatValue();
            } else {
                i10 = 160;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(context.getResources().getDisplayMetrics().widthPixels / i10);
            sb4.append('x');
            sb4.append(context.getResources().getDisplayMetrics().heightPixels / i10);
            jSONObject.put("screen_dp", sb4.toString());
            jSONObject.put("app_lan", kl.a.b(context).getLanguage());
            if (i11 >= 24) {
                locales = Resources.getSystem().getConfiguration().getLocales();
                locale = locales.get(0);
                kotlin.jvm.internal.g.d(locale, ea.a.p("PwpjIGcgdSBoIEYgFCAFZUtvJ3IqZUUuloDXdDhvLC4obyBhK2UmW3hdbCAUIHcgGCByfQ==", "7hDCGUl6"));
            } else {
                locale = Resources.getSystem().getConfiguration().locale;
                kotlin.jvm.internal.g.d(locale, ea.a.p("MAprIFUgSCBoIEYgFCAFZUtvJ3IqZUUuloDXZyRyI3QibyUuGW8LYSRlbCAUIHcgGCByfQ==", "HJKKuhmL"));
            }
            jSONObject.put("device_lan", locale.getLanguage());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("'GMT'Z", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            String format = simpleDateFormat.format(new Date());
            if (format.length() > 6) {
                StringBuilder sb5 = new StringBuilder();
                String substring = format.substring(0, 6);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb5.append(substring);
                sb5.append(':');
                String substring2 = format.substring(6);
                kotlin.jvm.internal.g.d(substring2, "this as java.lang.String).substring(startIndex)");
                sb5.append(substring2);
                format = sb5.toString();
            }
            jSONObject.put("timezone", format);
            return jSONObject;
        }

        public static Object b(Context context, String str, String str2, String str3, kotlin.coroutines.c cVar) {
            h hVar = new h(1, b1.L(cVar));
            hVar.s();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("unique_name", str3);
                jSONObject.put("pre_url", URLDecoder.decode(str2, "UTF-8"));
                AtomicReference<okhttp3.e> atomicReference = d.f29778a;
                jSONObject.put("params", a(context));
                String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.g.d(jSONObject2, "jsonObject.toString()");
                String b10 = b5.a.b(context, jSONObject2);
                kotlin.jvm.internal.g.d(b10, "encryptData(context, data)");
                n.a aVar = new n.a(0);
                aVar.a("modetype", String.valueOf(d.f29779b));
                aVar.a("data", b10);
                String packageName = context.getPackageName();
                kotlin.jvm.internal.g.d(packageName, "context.packageName");
                aVar.a("pkg", packageName);
                n nVar = new n(aVar.f23360b, aVar.c);
                t.a aVar2 = new t.a();
                aVar2.e(str);
                aVar2.a("Content-Type", "multipart/form-data");
                aVar2.d("POST", nVar);
                okhttp3.internal.connection.e a10 = d.f29780d.a(aVar2.b());
                d.f29778a.set(a10);
                a10.e(new C0374a(hVar, context));
                if (d.f29779b != 1) {
                    jSONObject.toString();
                    context.getPackageName();
                }
            } catch (Exception e10) {
                if (hVar.a()) {
                    hVar.resumeWith(Result.m13constructorimpl(androidx.activity.s.v(e10)));
                }
            }
            Object r4 = hVar.r();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return r4;
        }

        public static Object c(Context context, String str, kotlin.coroutines.c cVar) {
            h hVar = new h(1, b1.L(cVar));
            hVar.s();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("unique_name", str);
                AtomicReference<okhttp3.e> atomicReference = d.f29778a;
                jSONObject.put("params", a(context));
                String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.g.d(jSONObject2, "jsonObject.toString()");
                String b10 = b5.a.b(context, jSONObject2);
                kotlin.jvm.internal.g.d(b10, "encryptData(context, data)");
                n.a aVar = new n.a(0);
                aVar.a("modetype", String.valueOf(d.f29779b));
                aVar.a("data", b10);
                String packageName = context.getPackageName();
                kotlin.jvm.internal.g.d(packageName, "context.packageName");
                aVar.a("pkg", packageName);
                n nVar = new n(aVar.f23360b, aVar.c);
                t.a aVar2 = new t.a();
                aVar2.e("https://ocr-api.deepthought.industries/api/v1/file/upload/ms-pre-signed-url");
                aVar2.a("Content-Type", "multipart/form-data");
                aVar2.d("POST", nVar);
                okhttp3.internal.connection.e a10 = d.f29780d.a(aVar2.b());
                d.f29778a.set(a10);
                a10.e(new e(hVar, context));
                if (d.f29779b != 1) {
                    jSONObject.toString();
                    context.getPackageName();
                }
            } catch (Exception e10) {
                if (hVar.a()) {
                    hVar.resumeWith(Result.m13constructorimpl(androidx.activity.s.v(e10)));
                }
            }
            Object r4 = hVar.r();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return r4;
        }

        public static void d(Context context, String str, HashMap hashMap, p pVar) {
            kotlin.jvm.internal.g.e(context, "context");
            d.c.execute(new a7.a(1, hashMap, context, str, pVar));
        }

        public static Object e(String str, File file, byte[] bArr, kotlin.coroutines.c cVar) {
            String str2;
            String str3;
            h hVar = new h(1, b1.L(cVar));
            hVar.s();
            try {
                String encodedURL = URLDecoder.decode(str, "UTF-8");
                String lowerCase = bg.b.A0(file).toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                switch (lowerCase.hashCode()) {
                    case 97669:
                        if (lowerCase.equals("bmp")) {
                            str2 = "image/bmp";
                            break;
                        } else {
                            str2 = ContentTypes.IMAGE_JPEG;
                            break;
                        }
                    case 105441:
                        str3 = ContentTypes.EXTENSION_JPG_1;
                        lowerCase.equals(str3);
                        str2 = ContentTypes.IMAGE_JPEG;
                        break;
                    case 111145:
                        if (lowerCase.equals(ContentTypes.EXTENSION_PNG)) {
                            str2 = ContentTypes.IMAGE_PNG;
                            break;
                        } else {
                            str2 = ContentTypes.IMAGE_JPEG;
                            break;
                        }
                    case 3268712:
                        str3 = ContentTypes.EXTENSION_JPG_2;
                        lowerCase.equals(str3);
                        str2 = ContentTypes.IMAGE_JPEG;
                        break;
                    default:
                        str2 = ContentTypes.IMAGE_JPEG;
                        break;
                }
                Pattern pattern = r.c;
                v a10 = w.a.a(bArr, r.a.b(str2), 6);
                t.a aVar = new t.a();
                kotlin.jvm.internal.g.d(encodedURL, "encodedURL");
                aVar.e(encodedURL);
                aVar.d("PUT", a10);
                aVar.a("x-ms-blob-type", "BlockBlob");
                okhttp3.internal.connection.e a11 = d.f29780d.a(aVar.b());
                d.f29778a.set(a11);
                a11.e(new b(hVar));
            } catch (Exception e10) {
                if (hVar.a()) {
                    hVar.resumeWith(Result.m13constructorimpl(androidx.activity.s.v(e10)));
                }
            }
            Object r4 = hVar.r();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return r4;
        }
    }

    static {
        new a();
        f29778a = new AtomicReference<>();
        f29779b = 1;
        c = Executors.newSingleThreadExecutor();
        s.a aVar = new s.a();
        TimeUnit unit = TimeUnit.SECONDS;
        kotlin.jvm.internal.g.e(unit, "unit");
        aVar.f23425s = ak.b.b(unit);
        aVar.f23426t = ak.b.b(unit);
        aVar.f23427u = ak.b.b(unit);
        aVar.c.add(new sb.a());
        f29780d = new s(aVar);
    }
}
