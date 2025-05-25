package b;

import a6.h;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.e1;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.p;
import c4.f;
import c4.s;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.play.core.assetpacks.b1;
import com.lib.flutter.encrypt.FlutterError;
import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.fontbox.ttf.WGL4Names;
import e5.d;
import f9.h;
import gj.l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.u;
import kotlinx.coroutines.y0;
import l4.e;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperty;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.system.r;
import lib.zj.office.wp.control.Word;
import n2.a;
import n2.j;
import o3.d0;
import org.json.JSONArray;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;
import yd.c;
import zh.m;
import zh.n;

/* compiled from: AdTechIdentifier.java */
/* loaded from: classes.dex */
public class b implements d0, ce.a {

    /* renamed from: a  reason: collision with root package name */
    public static zzab f5169a;
    public static Field c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f5171d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f5172e;

    /* renamed from: b  reason: collision with root package name */
    public static final b f5170b = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final b f5173f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f5174g = new int[0];

    /* renamed from: h  reason: collision with root package name */
    public static final long[] f5175h = new long[0];

    /* renamed from: i  reason: collision with root package name */
    public static final Object[] f5176i = new Object[0];

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kh.b A(lib.zj.office.fc.dom4j.Element r9) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.A(lib.zj.office.fc.dom4j.Element):kh.b");
    }

    public static kh.b B(Element element) {
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        float parseFloat;
        float parseFloat2;
        kh.b bVar = new kh.b();
        String attributeValue = element.attributeValue("cropleft");
        if (attributeValue != null) {
            f10 = Float.parseFloat(attributeValue) / 65535.0f;
        } else {
            f10 = 0.0f;
        }
        String attributeValue2 = element.attributeValue("croptop");
        if (attributeValue2 != null) {
            f11 = Float.parseFloat(attributeValue2) / 65535.0f;
        } else {
            f11 = 0.0f;
        }
        String attributeValue3 = element.attributeValue("cropright");
        if (attributeValue3 != null) {
            f12 = Float.parseFloat(attributeValue3) / 65535.0f;
        } else {
            f12 = 0.0f;
        }
        String attributeValue4 = element.attributeValue("cropbottom");
        if (attributeValue4 != null) {
            f13 = Float.parseFloat(attributeValue4) / 65535.0f;
        } else {
            f13 = 0.0f;
        }
        boolean z11 = true;
        if (f10 == 0.0f && f11 == 0.0f && f12 == 0.0f && f13 == 0.0f) {
            z10 = false;
        } else {
            bVar.f19753a = new kh.a(f10, f11, f12, f13);
            z10 = true;
        }
        String attributeValue5 = element.attributeValue("blacklevel");
        if (attributeValue5 != null) {
            if (attributeValue5.contains("f")) {
                parseFloat2 = Float.parseFloat(attributeValue5) / 65535.0f;
            } else {
                parseFloat2 = Float.parseFloat(attributeValue5);
            }
            bVar.f19755d = Float.valueOf(parseFloat2 * 2.0f * 255.0f);
            z10 = true;
        }
        String attributeValue6 = element.attributeValue("gain");
        if (attributeValue6 != null) {
            if (attributeValue6.contains("f")) {
                parseFloat = Float.parseFloat(attributeValue6) / 65535.0f;
            } else {
                parseFloat = Float.parseFloat(attributeValue6);
            }
            bVar.f19756e = Float.valueOf(parseFloat);
            z10 = true;
        }
        String attributeValue7 = element.attributeValue("grayscale");
        if (attributeValue7 != null && (attributeValue7.equalsIgnoreCase("t") || attributeValue7.equalsIgnoreCase("true"))) {
            String attributeValue8 = element.attributeValue("bilevel");
            if (attributeValue8 != null && (attributeValue8.equalsIgnoreCase("t") || attributeValue8.equalsIgnoreCase("true"))) {
                bVar.c = Float.valueOf(128.0f);
            } else {
                bVar.f19754b = Boolean.TRUE;
            }
            z10 = true;
        }
        String attributeValue9 = element.attributeValue("chromakey");
        if (attributeValue9 != null) {
            try {
                bVar.f19757f = Integer.valueOf(Color.parseColor(attributeValue9));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            z11 = z10;
        }
        if (z11) {
            return bVar;
        }
        return null;
    }

    public static e C(Context context) {
        e A = new e().A(new f(), new s(context.getResources().getDimensionPixelSize(R.dimen.dp_4)));
        g.d(A, ea.a.p("HWVAdRxzQ08qdCNvG3NAKRt0HGErcwNvtYDoLiRvKmUQMwY1V1IZZDNtL25bZBhfASlHKQ==", "bCZnWNgX"));
        return A;
    }

    public static c D(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f32117a.equals(str)) {
                boolean isEmpty = TextUtils.isEmpty(str2);
                String str3 = cVar.c;
                if (isEmpty && TextUtils.isEmpty(str3)) {
                    return cVar;
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && (str2.equals(str3) || "n".equals(str3))) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public static SpannableString E(Context context, int i10, String str) {
        if (context != null && !TextUtils.isEmpty(str) && i10 != -1) {
            SpannableString spannableString = new SpannableString(h.c(str, " "));
            int length = spannableString.length();
            Drawable drawable = context.getResources().getDrawable(i10);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            spannableString.setSpan(new ImageSpan(drawable, 2), length - 1, length, 18);
            return spannableString;
        }
        return new SpannableString(str);
    }

    public static d F(String str) {
        String str2;
        JSONArray jSONArray;
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String name = jSONObject2.optString(NamingTable.TAG);
            String plan = jSONObject2.optString("plan");
            JSONObject optJSONObject = jSONObject2.optJSONObject("planA");
            if (optJSONObject != null) {
                str2 = optJSONObject.optString(InMobiNetworkValues.TITLE);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray("list");
            } else {
                jSONArray = null;
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject optJSONObject2 = jSONArray.optJSONObject(i10);
                    int optInt = optJSONObject2.optInt(FacebookMediationAdapter.KEY_ID);
                    String content = optJSONObject2.optString("content");
                    g.d(content, "content");
                    arrayList.add(new e5.g(optInt, content));
                }
            }
            e5.b bVar = new e5.b(str2, arrayList);
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("planB");
            if (optJSONObject3 != null) {
                jSONObject = optJSONObject3.optJSONObject("lan");
            } else {
                jSONObject = null;
            }
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(key);
                    ArrayList arrayList2 = new ArrayList();
                    if (optJSONArray != null) {
                        int length2 = optJSONArray.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            arrayList2.add(optJSONArray.optString(i11));
                        }
                    }
                    g.d(key, "key");
                    hashMap.put(key, arrayList2);
                }
            }
            e5.c cVar = new e5.c(new e5.a(hashMap));
            g.d(name, "name");
            g.d(plan, "plan");
            return new d(name, plan, bVar, cVar);
        } catch (Throwable th2) {
            c5.a b10 = c5.a.b();
            b10.a();
            b10.c.f5583e.k("", th2);
            return null;
        }
    }

    public static final void G(CoroutineContext coroutineContext, Throwable th2) {
        Throwable runtimeException;
        for (u uVar : kotlinx.coroutines.internal.e.f20173a) {
            try {
                uVar.R(coroutineContext, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    b1.n(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            b1.n(th2, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static boolean H(int i10, ei.c cVar) {
        short s4 = cVar.f16610k;
        if (s4 == 1) {
            return true;
        }
        if (s4 == 2) {
            if (cVar.f16604e == i10) {
                return true;
            }
            return false;
        }
        ei.a aVar = cVar.f16613n;
        if (aVar != null && aVar.g() >= 0) {
            ci.a f10 = cVar.f(aVar.g());
            if (f10.f5691b <= i10 && f10.f5692d >= i10) {
                return true;
            }
        } else if (cVar.f16604e == i10) {
            return true;
        }
        return false;
    }

    public static boolean I(String str) {
        a.d dVar = j.f22326a;
        Set<n2.d> unmodifiableSet = Collections.unmodifiableSet(n2.a.c);
        HashSet hashSet = new HashSet();
        for (n2.d dVar2 : unmodifiableSet) {
            if (dVar2.b().equals(str)) {
                hashSet.add(dVar2);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((n2.d) it.next()).a()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature ".concat(str));
    }

    public static boolean J(Context context) {
        String p10 = ea.a.p("JnNubwllWV8pYytuKmFk", "fOitvCRU");
        if (context == null) {
            return true;
        }
        String h10 = de.e.h(p10, ea.a.p("MQ==", "tmxlHulX"));
        if (TextUtils.isEmpty(h10)) {
            h10 = ea.a.p("MQ==", "nVKvwJWY");
        }
        return h10.equals(ea.a.p("MQ==", "rKPAi9vf"));
    }

    public static void K(gj.j jVar, float f10) {
        ai.e eVar;
        int i10;
        int i11;
        if (jVar != null && (eVar = jVar.f490m) != null) {
            Word word = jVar.f17853r;
            int i12 = 0;
            if (word.P) {
                int i13 = androidx.activity.s.f1868w;
                int width = eVar.getWidth();
                int width2 = word.getWidth();
                if (width2 == 0) {
                    width2 = word.getWordWidth();
                }
                float f11 = width2;
                float f12 = width;
                if (f11 > f12 * f10) {
                    i12 = 0 + (((int) ((f11 / f10) - f12)) / 2);
                }
                if (jVar.H() == 1) {
                    float measuredHeight = (word.getMeasuredHeight() / f10) - eVar.getHeight();
                    if (measuredHeight - (androidx.activity.s.f1868w * 2) > 0.0f) {
                        float f13 = measuredHeight / 2.0f;
                        eVar.p(i12, (int) f13);
                        i11 = (int) (f13 + eVar.getHeight());
                    } else {
                        eVar.p(i12, i13);
                        i11 = eVar.getHeight() + androidx.activity.s.f1868w + i13;
                    }
                } else {
                    while (eVar != null) {
                        eVar.p(i12, i13);
                        i13 += eVar.getHeight() + androidx.activity.s.f1868w;
                        eVar = eVar.o();
                    }
                    i11 = i13;
                }
                jVar.f481d = width;
                jVar.f482e = i11;
                word.l(width, i11);
                return;
            }
            int i14 = androidx.activity.s.f1868w;
            int height = eVar.getHeight();
            int height2 = word.getHeight();
            if (height2 == 0) {
                height2 = word.getWordHeight();
            }
            float f14 = height2;
            float f15 = height;
            if (f14 > f15 * f10) {
                i12 = 0 + (((int) ((f14 / f10) - f15)) / 2);
            }
            if (jVar.H() == 1) {
                float measuredWidth = (word.getMeasuredWidth() / f10) - eVar.getWidth();
                if (measuredWidth - (androidx.activity.s.f1868w * 2) > 0.0f) {
                    float f16 = measuredWidth / 2.0f;
                    eVar.p((int) f16, i12);
                    i10 = (int) (f16 + eVar.getWidth());
                } else {
                    eVar.p(i14, i12);
                    i10 = eVar.getWidth() + androidx.activity.s.f1868w + i14;
                }
            } else {
                while (eVar != null) {
                    eVar.p(i14, i12);
                    i14 += eVar.getWidth() + androidx.activity.s.f1868w;
                    eVar = eVar.o();
                }
                i10 = i14;
            }
            jVar.f481d = i10;
            jVar.f482e = height;
            word.l(i10, height);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x022e, code lost:
        r11 = r32;
        r2 = r40;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02d8, code lost:
        r8 = r34;
        r2 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ab, code lost:
        r40 = r2;
        r42 = r9;
        r11 = r32;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int L(lib.zj.office.system.f r44, zh.g r45, ai.c r46, ai.f r47, ai.g r48, gj.l r49, long r50, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.L(lib.zj.office.system.f, zh.g, ai.c, ai.f, ai.g, gj.l, long, int, int, int):int");
    }

    public static String N(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static void O(Activity activity, boolean z10) {
        ea.a.p("ak1U", "qFHXdd0d");
        ea.a.p("fzMANUc-CT5kPnQ-Sz5WPgs-UD57awBlHk84PQ==", "yMmsnVfk");
        if (z10) {
            activity.getWindow().addFlags(128);
        } else {
            activity.getWindow().clearFlags(128);
        }
        no.f.b(activity).f22628a = z10;
        no.f.b(activity).i(activity);
    }

    public static void P(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof e1) {
                    editorInfo.hintText = ((e1) parent).a();
                    return;
                }
            }
        }
    }

    public static String Q(String str, double d10) {
        String[] split = str.split(";");
        int indexOf = str.indexOf("*");
        if (Math.abs(d10) < 1.0E-6d && split.length == 1) {
            String substring = str.substring(0, indexOf + 1);
            int indexOf2 = str.indexOf(45);
            String replace = str.replace("#", "").replace("?", " ");
            StringBuilder k10 = a0.a.k(substring);
            k10.append(replace.substring(indexOf2 - 1, replace.length()));
            return k10.toString();
        }
        DecimalFormat decimalFormat = new DecimalFormat(str.replace("*", ""), DecimalFormatSymbols.getInstance(Locale.US));
        decimalFormat.format(Double.valueOf(d10));
        if (d10 > 0.0d) {
            d10 += 1.0E-9d;
        } else if (d10 < 0.0d) {
            d10 -= 1.0E-9d;
        }
        String format = decimalFormat.format(Double.valueOf(d10));
        return format.substring(0, indexOf) + "*" + format.substring(indexOf, format.length());
    }

    public static byte[] R(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new IllegalStateException(a.c("Not enough bytes to read: ", i10));
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] S(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L88
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L88
            if (r6 < 0) goto L39
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L88
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L88
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L39:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L55:
            if (r4 != r9) goto L69
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L69:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L88
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L88
            r8.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L88
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L88
            throw r9     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.S(java.io.FileInputStream, int, int):byte[]");
    }

    public static long T(InputStream inputStream, int i10) {
        byte[] R = R(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += (R[i11] & 255) << (i11 * 8);
        }
        return j10;
    }

    public static int U(InputStream inputStream) {
        return (int) T(inputStream, 2);
    }

    public static void V(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof f9.h) {
            ((f9.h) background).m(f10);
        }
    }

    public static void X(View view) {
        Drawable background = view.getBackground();
        if (background instanceof f9.h) {
            Y(view, (f9.h) background);
        }
    }

    public static void Y(View view, f9.h hVar) {
        boolean z10;
        t8.a aVar = hVar.f17164a.f17187b;
        if (aVar != null && aVar.f29971a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f10 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f10 += f0.i.i((View) parent);
            }
            h.b bVar = hVar.f17164a;
            if (bVar.f17197m != f10) {
                bVar.f17197m = f10;
                hVar.w();
            }
        }
    }

    public static void Z(Activity activity) {
        O(activity, no.f.b(activity).f22628a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long b0(java.lang.String r21, long r22, long r24, long r26) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.b0(java.lang.String, long, long, long):long");
    }

    public static int c0(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return (int) b0(str, i10, i11, i12);
    }

    public static String e(List list) {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static void e0(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void f(bk.a aVar, bk.c cVar, String str) {
        bk.d.f5451h.getClass();
        Logger logger = bk.d.f5453j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f5447b);
        sb2.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        g.d(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.f5442a);
        logger.fine(sb2.toString());
    }

    public static void f0(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        e0(byteArrayOutputStream, i10, 2);
    }

    public static final List h(Throwable th2) {
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            List I = ge.a.I(flutterError.getCode(), th2.getMessage(), flutterError.getDetails());
            String msg = flutterError.getCode() + ' ' + th2.getMessage();
            g.e(msg, "msg");
            ea.a.p("IGgnbh5lVV8tchRvcg==", "QgCFp9Wj");
            return I;
        }
        List I2 = ge.a.I(th2.getClass().getSimpleName(), th2.toString(), ea.a.p("cGE-cxY6IA==", "eGpeXNhS") + th2.getCause() + ea.a.p("YyBidBhjXHQoYSllTyA=", "dmnbBwug") + Log.getStackTraceString(th2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th2.getClass().getSimpleName());
        sb2.append(' ');
        sb2.append(th2);
        String msg2 = sb2.toString();
        g.e(msg2, "msg");
        ea.a.p("IGgnbh5lVV8tchRvcg==", "QgCFp9Wj");
        return I2;
    }

    public static void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("?");
            if (i11 < i10 - 1) {
                sb2.append(",");
            }
        }
    }

    public static int j(int i10, int[] iArr, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 > i11) {
                i12 = i14 - 1;
            } else {
                return i14;
            }
        }
        return ~i13;
    }

    public static int k(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j10 ? 1 : (jArr[i13] == j10 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 > 0) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static final void l(CoroutineContext coroutineContext, CancellationException cancellationException) {
        int i10 = y0.f20276d1;
        y0 y0Var = (y0) coroutineContext.get(y0.b.f20277a);
        if (y0Var != null) {
            y0Var.b(cancellationException);
        }
    }

    public static final void m(int i10) {
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(a.c("Expected positive parallelism level, but got ", i10).toString());
    }

    public static byte[] n(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    public static gj.a o(lib.zj.office.system.f fVar, zh.g gVar, ai.c cVar, ai.g gVar2, l lVar, int i10, int i11) {
        byte b10;
        m a10;
        zh.h hVar = null;
        r1 = null;
        String str = null;
        if ((gVar2.f527i < 0 || gVar2.f528j < 0) && gVar2.f530l < 0) {
            return null;
        }
        gj.a aVar = (gj.a) com.google.android.play.core.assetpacks.c.t(fVar, null, null, 13);
        synchronized (aVar) {
            aVar.f480b = gVar2.f529k + i10;
            aVar.c = i11;
            zh.h hVar2 = lVar.f479a;
            String str2 = "";
            if (gVar2.f527i >= 0) {
                hh.a aVar2 = (hh.a) ((LinkedHashMap) lVar.getControl().o().e().f26b).get(Integer.valueOf(gVar2.f527i));
                if (aVar2 != null) {
                    short s4 = aVar2.f18333b;
                    if (s4 >= 0 && (a10 = n.f32394b.a(s4)) != null) {
                        zh.b bVar = zh.b.f32374b;
                        zh.c cVar2 = a10.c;
                        bVar.getClass();
                        aVar2 = (hh.a) ((LinkedHashMap) lVar.getControl().o().e().f26b).get(Integer.valueOf(zh.b.s(cVar2)));
                        if (aVar2 == null || aVar2.c.length == 0) {
                        }
                    }
                    hVar = gVar.f(hVar2.a() - 1);
                    hh.b a11 = aVar2.a(gVar2.f528j);
                    if (a11 != null) {
                        String w7 = b1.w(aVar2, a11, cVar, gVar2.f528j);
                        if (cVar.f508a == 1) {
                            b10 = aVar2.f18335e;
                        } else {
                            b10 = aVar2.f18334d;
                        }
                        byte b11 = gVar2.f528j;
                        if (b11 < b10) {
                            for (int i12 = b11 + 1; i12 < 9; i12++) {
                                if (cVar.f508a == 1) {
                                    aVar2.a(i12).f18342h = 0;
                                } else {
                                    aVar2.a(i12).f18341g = 0;
                                }
                            }
                        } else if (b11 > b10) {
                            for (int i13 = b10 + 1; i13 < gVar2.f528j; i13++) {
                                hh.b a12 = aVar2.a(i13);
                                if (cVar.f508a == 1) {
                                    a12.f18342h++;
                                } else {
                                    a12.f18341g++;
                                }
                            }
                        }
                        if (cVar.f508a == 1) {
                            a11.f18342h++;
                            aVar2.f18335e = gVar2.f528j;
                        } else {
                            a11.f18341g++;
                            aVar2.f18334d = gVar2.f528j;
                        }
                        aVar.f17811s = a11;
                        str2 = w7;
                    }
                }
            } else if (gVar2.f530l >= 0) {
                zh.h f10 = gVar.f(hVar2.b());
                r o10 = lVar.getControl().o();
                if (o10.f21072e == null) {
                    o10.f21072e = new m7.g(5);
                }
                m7.g gVar3 = o10.f21072e;
                int i14 = gVar2.f530l;
                if (i14 >= 0) {
                    if (i14 < ((List) gVar3.f21833a).size()) {
                        str = (String) ((List) gVar3.f21833a).get(i14);
                    }
                } else {
                    gVar3.getClass();
                }
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                hVar = f10;
            }
            if (hVar2 != null && hVar != null) {
                zh.b bVar2 = zh.b.f32374b;
                ai.b bVar3 = aVar.f17810r;
                zh.f d10 = hVar2.d();
                zh.f d11 = hVar.d();
                bVar2.getClass();
                zh.b.a(bVar3, d10, d11);
            }
            ai.b bVar4 = aVar.f17810r;
            boolean z10 = bVar4.f496e;
            if (z10 && bVar4.f498g) {
                aVar.f17809q.setTextSkewX(-0.2f);
                aVar.f17809q.setFakeBoldText(true);
            } else if (z10) {
                aVar.f17809q.setFakeBoldText(true);
            } else if (bVar4.f498g) {
                aVar.f17809q.setTextSkewX(-0.25f);
            }
            aVar.f17809q.setTypeface(Typeface.create(Typeface.SERIF, 0));
            Paint paint = aVar.f17809q;
            ai.b bVar5 = aVar.f17810r;
            paint.setTextSize((bVar5.c / 100.0f) * bVar5.f493a * 1.3333334f);
            aVar.f17809q.setColor(aVar.f17810r.f495d);
            int length = str2.length();
            float[] fArr = new float[length];
            aVar.f17809q.getTextWidths(str2, fArr);
            float f11 = 0.0f;
            for (int i15 = 0; i15 < length; i15++) {
                f11 += fArr[i15];
            }
            int i16 = (int) ((aVar.f480b + f11) % 28.0f);
            if (i16 > 0) {
                f11 += 28.0f - i16;
            }
            aVar.f481d = (int) f11;
            aVar.f482e = (int) Math.ceil(aVar.f17809q.descent() - aVar.f17809q.ascent());
            aVar.f17808p = str2;
        }
        lVar.f17862p = aVar;
        return aVar;
    }

    public static ge.a p(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return new f9.l();
            }
            return new f9.e();
        }
        return new f9.l();
    }

    public static void q(File file) {
        File[] listFiles;
        try {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        } catch (Throwable th2) {
            c5.a b10 = c5.a.b();
            b10.a();
            b10.c.f5583e.k("", th2);
        }
    }

    public static final void s(CoroutineContext coroutineContext) {
        y0 y0Var = (y0) coroutineContext.get(y0.b.f20277a);
        if (y0Var != null && !y0Var.a()) {
            throw y0Var.i();
        }
    }

    public static String t(String str, double d10) {
        String[] split = str.split(";");
        int length = split.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3 && length != 4) {
                    return "";
                }
                if (Math.abs(d10) > 1.0E-6d) {
                    return Q(split[0] + ";" + split[1], d10);
                }
                return Q(split[2], 0.0d);
            }
            return Q(split[0] + ";" + split[1], d10);
        }
        return Q(split[0], d10);
    }

    public static final String u(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / 1000000) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM)) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM)) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / 1000000) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        return a.f(new Object[]{str}, 1, "%6s", "format(format, *args)");
    }

    public static String v(int i10) {
        String str = "";
        while (i10 >= 0) {
            str = ((char) (((char) (i10 % 26)) + 'A')) + str;
            i10 = (i10 / 26) - 1;
        }
        return str;
    }

    public static EscherProperty w(EscherOptRecord escherOptRecord, int i10) {
        if (escherOptRecord != null) {
            for (EscherProperty escherProperty : escherOptRecord.getEscherProperties()) {
                if (escherProperty.getPropertyNumber() == i10) {
                    return escherProperty;
                }
            }
            return null;
        }
        return null;
    }

    public static final LifecycleCoroutineScopeImpl x(p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z10;
        g.e(pVar, "<this>");
        Lifecycle lifecycle = pVar.getLifecycle();
        g.e(lifecycle, "<this>");
        while (true) {
            AtomicReference<Object> atomicReference = lifecycle.f3980a;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl == null) {
                m1 m1Var = new m1(null);
                lg.b bVar = j0.f20206a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, m1Var.plus(kotlinx.coroutines.internal.l.f20194a.v()));
                while (true) {
                    if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReference.get() != null) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
                if (z10) {
                    lifecycleCoroutineScopeImpl.c();
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:8|9|(2:10|11)|(9:13|14|(1:16)(6:43|44|45|(2:47|(1:49)(6:50|51|52|(2:54|(1:56)(1:57))|58|(0)(0)))|61|(0)(0))|17|18|(4:23|(1:25)(2:33|(1:35)(1:37))|26|(2:28|29)(3:30|31|32))|39|(1:41)|42)|67|14|(0)(0)|17|18|(5:20|23|(0)(0)|26|(0)(0))|39|(0)|42) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        if (r15 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
        r14.printStackTrace();
        r14 = r14.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ca, code lost:
        if (r4 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[Catch: all -> 0x0031, Exception -> 0x00c2, TRY_ENTER, TryCatch #4 {Exception -> 0x00c2, blocks: (B:17:0x0037, B:33:0x0075, B:35:0x0090, B:38:0x0097, B:41:0x00a2, B:25:0x0052, B:32:0x006c), top: B:75:0x0035, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[Catch: all -> 0x0031, Exception -> 0x00c2, TRY_ENTER, TryCatch #4 {Exception -> 0x00c2, blocks: (B:17:0x0037, B:33:0x0075, B:35:0x0090, B:38:0x0097, B:41:0x00a2, B:25:0x0052, B:32:0x006c), top: B:75:0x0035, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[Catch: all -> 0x0031, Exception -> 0x00c2, TRY_ENTER, TryCatch #4 {Exception -> 0x00c2, blocks: (B:17:0x0037, B:33:0x0075, B:35:0x0090, B:38:0x0097, B:41:0x00a2, B:25:0x0052, B:32:0x006c), top: B:75:0x0035, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[Catch: all -> 0x0031, Exception -> 0x00c2, TRY_LEAVE, TryCatch #4 {Exception -> 0x00c2, blocks: (B:17:0x0037, B:33:0x0075, B:35:0x0090, B:38:0x0097, B:41:0x00a2, B:25:0x0052, B:32:0x006c), top: B:75:0x0035, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String y(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.y(android.content.Context, java.lang.String):java.lang.String");
    }

    public static kh.b z(EscherOptRecord escherOptRecord) {
        EscherSimpleProperty escherSimpleProperty;
        float propertyValue;
        EscherSimpleProperty escherSimpleProperty2;
        float propertyValue2;
        EscherSimpleProperty escherSimpleProperty3;
        float propertyValue3;
        EscherSimpleProperty escherSimpleProperty4;
        float propertyValue4;
        boolean z10;
        EscherSimpleProperty escherSimpleProperty5;
        EscherSimpleProperty escherSimpleProperty6;
        if (escherOptRecord == null) {
            return null;
        }
        kh.b bVar = new kh.b();
        if (((EscherSimpleProperty) w(escherOptRecord, WGL4Names.NUMBER_OF_MAC_GLYPHS)) == null) {
            propertyValue = 0.0f;
        } else {
            propertyValue = escherSimpleProperty.getPropertyValue() / 65536.0f;
        }
        if (((EscherSimpleProperty) w(escherOptRecord, 256)) == null) {
            propertyValue2 = 0.0f;
        } else {
            propertyValue2 = escherSimpleProperty2.getPropertyValue() / 65536.0f;
        }
        if (((EscherSimpleProperty) w(escherOptRecord, 259)) == null) {
            propertyValue3 = 0.0f;
        } else {
            propertyValue3 = escherSimpleProperty3.getPropertyValue() / 65536.0f;
        }
        if (((EscherSimpleProperty) w(escherOptRecord, 257)) == null) {
            propertyValue4 = 0.0f;
        } else {
            propertyValue4 = escherSimpleProperty4.getPropertyValue() / 65536.0f;
        }
        boolean z11 = true;
        if (propertyValue == 0.0f && propertyValue2 == 0.0f && propertyValue3 == 0.0f && propertyValue4 == 0.0f) {
            z10 = false;
        } else {
            bVar.f19753a = new kh.a(propertyValue, propertyValue2, propertyValue3, propertyValue4);
            z10 = true;
        }
        EscherSimpleProperty escherSimpleProperty7 = (EscherSimpleProperty) w(escherOptRecord, 319);
        if (escherSimpleProperty7 != null) {
            int propertyValue5 = escherSimpleProperty7.getPropertyValue() & 15;
            if (propertyValue5 == 4) {
                bVar.f19754b = Boolean.TRUE;
            } else if (propertyValue5 == 6) {
                bVar.c = Float.valueOf(128.0f);
            }
            z10 = true;
        }
        if (((EscherSimpleProperty) w(escherOptRecord, 265)) != null) {
            bVar.f19755d = Float.valueOf((escherSimpleProperty5.getPropertyValue() / 32768.0f) * 255.0f);
            z10 = true;
        }
        if (((EscherSimpleProperty) w(escherOptRecord, 264)) != null) {
            bVar.f19756e = Float.valueOf(Math.min(escherSimpleProperty6.getPropertyValue() / 65536.0f, 10.0f));
            z10 = true;
        }
        EscherSimpleProperty escherSimpleProperty8 = (EscherSimpleProperty) w(escherOptRecord, 263);
        if (escherSimpleProperty8 != null) {
            int propertyValue6 = escherSimpleProperty8.getPropertyValue();
            bVar.f19757f = Integer.valueOf(Color.rgb(propertyValue6 & FunctionEval.FunctionID.EXTERNAL_FUNC, (65280 & propertyValue6) >> 8, (propertyValue6 & 16711680) >> 16));
        } else {
            z11 = z10;
        }
        if (!z11) {
            return null;
        }
        return bVar;
    }

    public void W(x.a aVar, float f10) {
        CardView.a aVar2 = (CardView.a) aVar;
        x.b bVar = (x.b) aVar2.f2728a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f10 != bVar.f31407e || bVar.f31408f != useCompatPadding || bVar.f31409g != preventCornerOverlap) {
            bVar.f31407e = f10;
            bVar.f31408f = useCompatPadding;
            bVar.f31409g = preventCornerOverlap;
            bVar.c(null);
            bVar.invalidateSelf();
        }
        d0(aVar2);
    }

    public void a0(View view, int i10) {
        if (!f5171d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5171d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                c.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // ce.a
    public void b() {
        aj.b.f570r = true;
    }

    @Override // ce.a
    public void c() {
        aj.b.f570r = false;
        ce.g a10 = ce.g.a();
        a10.f5686a = null;
        a10.f5687b = null;
        a10.c = null;
        ce.g.f5685d = null;
    }

    @Override // ce.a
    public void d() {
        aj.b.f570r = false;
        cg.a aVar = aj.b.f571s;
        if (aVar != null) {
            aVar.invoke();
        }
        ce.g a10 = ce.g.a();
        a10.f5686a = null;
        a10.f5687b = null;
        a10.c = null;
        ce.g.f5685d = null;
    }

    public void d0(x.a aVar) {
        float f10;
        CardView.a aVar2 = (CardView.a) aVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar2.a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = aVar2.f2728a;
        float f11 = ((x.b) drawable).f31407e;
        float f12 = ((x.b) drawable).f31404a;
        CardView cardView = CardView.this;
        if (cardView.getPreventCornerOverlap()) {
            f10 = (float) (((1.0d - x.c.f31414a) * f12) + f11);
        } else {
            int i10 = x.c.f31415b;
            f10 = f11;
        }
        int ceil = (int) Math.ceil(f10);
        int ceil2 = (int) Math.ceil(x.c.a(f11, f12, cardView.getPreventCornerOverlap()));
        aVar2.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // o3.d0
    public Object g(JsonReader jsonReader, float f10) {
        return o3.m.b(jsonReader, f10);
    }

    public synchronized void r(File file, String str) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            g.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStream.close();
        } finally {
        }
    }

    @Override // ce.a
    public void a() {
    }

    public static final void M(String str, Throwable th2) {
    }
}
