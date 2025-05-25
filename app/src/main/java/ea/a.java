package ea;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.activity.r;
import cg.l;
import com.adjust.sdk.Constants;
import com.android.billingclient.api.a0;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import industries.deepthought.decode.Decoder;
import j3.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.k;
import kotlin.text.Regex;
import kotlin.text.j;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.internal.p;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import wd.s;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.2 */
/* loaded from: classes2.dex */
public /* synthetic */ class a implements ga.e, SuccessContinuation, r5.a, pdf.pdfreader.viewer.editor.free.fnbridge.b {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f16518b = true;

    /* renamed from: g  reason: collision with root package name */
    public static Application f16522g;

    /* renamed from: i  reason: collision with root package name */
    public static pdf.pdfreader.viewer.editor.free.fnbridge.b f16524i;

    /* renamed from: j  reason: collision with root package name */
    public static pdf.pdfreader.viewer.editor.free.fnbridge.b f16525j;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f16517a = new a();
    public static final a0 c = new a0("NO_VALUE", 8);

    /* renamed from: d  reason: collision with root package name */
    public static final a0 f16519d = new a0("NULL", 8);

    /* renamed from: e  reason: collision with root package name */
    public static final a0 f16520e = new a0("UNINITIALIZED", 8);

    /* renamed from: f  reason: collision with root package name */
    public static final a0 f16521f = new a0("CONDITION_FALSE", 8);

    /* renamed from: h  reason: collision with root package name */
    public static final a f16523h = new a();

    public static final Object A(p pVar, p pVar2, cg.p pVar3) {
        Object pVar4;
        Object Z;
        try {
            k.c(2, pVar3);
            pVar4 = pVar3.invoke(pVar2, pVar);
        } catch (Throwable th2) {
            pVar4 = new kotlinx.coroutines.p(false, th2);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (pVar4 != coroutineSingletons && (Z = pVar.Z(pVar4)) != aj.b.f562j) {
            if (!(Z instanceof kotlinx.coroutines.p)) {
                return aj.b.Z(Z);
            }
            throw ((kotlinx.coroutines.p) Z).f20226a;
        }
        return coroutineSingletons;
    }

    public static final String B(String str) {
        boolean z10;
        InetAddress o10;
        g.e(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (kotlin.text.k.O(str, ":", false)) {
            if (j.M(str, "[", false) && j.F(str, "]", false)) {
                o10 = o(1, str.length() - 1, str);
            } else {
                o10 = o(0, str.length(), str);
            }
            if (o10 == null) {
                return null;
            }
            byte[] address = o10.getAddress();
            if (address.length == 16) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < address.length) {
                    int i14 = i12;
                    while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                        i14 += 2;
                    }
                    int i15 = i14 - i12;
                    if (i15 > i13 && i15 >= 4) {
                        i11 = i12;
                        i13 = i15;
                    }
                    i12 = i14 + 2;
                }
                kk.f fVar = new kk.f();
                while (i10 < address.length) {
                    if (i10 == i11) {
                        fVar.q(58);
                        i10 += i13;
                        if (i10 == 16) {
                            fVar.q(58);
                        }
                    } else {
                        if (i10 > 0) {
                            fVar.q(58);
                        }
                        byte b10 = address[i10];
                        byte[] bArr = ak.b.f665a;
                        fVar.s(((b10 & 255) << 8) | (address[i10 + 1] & 255));
                        i10 += 2;
                    }
                }
                return fVar.k();
            } else if (address.length == 4) {
                return o10.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        }
        try {
            String ascii = IDN.toASCII(str);
            g.d(ascii, "toASCII(host)");
            Locale US = Locale.US;
            g.d(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            g.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            int length = lowerCase.length();
            int i16 = 0;
            while (i16 < length) {
                int i17 = i16 + 1;
                char charAt = lowerCase.charAt(i16);
                if (g.f(charAt, 31) > 0 && g.f(charAt, ShapeTypes.VERTICAL_SCROLL) < 0 && kotlin.text.k.U(" #%/:?@[\\]", charAt, 0, false, 6) == -1) {
                    i16 = i17;
                }
                i10 = 1;
                break;
            }
            if (i10 != 0) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static float c(float f10) {
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static v d(int i10, int i11) {
        BufferOverflow bufferOverflow;
        boolean z10;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        } else {
            bufferOverflow = null;
        }
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
                z11 = false;
            }
            if (z11) {
                int i12 = 0 + i10;
                if (i12 < 0) {
                    i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                return new v(i10, i12, bufferOverflow);
            }
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
        throw new IllegalArgumentException(b.a.c("replay cannot be negative, but was ", i10).toString());
    }

    public static float e(float f10) {
        if (f10 <= 0.0031308f) {
            return f10 * 12.92f;
        }
        return (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static boolean f() {
        String str;
        try {
            String str2 = Build.MANUFACTURER;
            if (g.a("unknown", str2)) {
                str2 = Build.BRAND;
            }
            if (j.G(str2, Constants.REFERRER_API_XIAOMI, true) || j.G(str2, "poco", true) || j.G(str2, "blackshark", true)) {
                try {
                    Method getMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
                    Properties properties = new Properties();
                    g.d(getMethod, "getMethod");
                    str = t(properties, getMethod);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    return new Regex("^v1[3-9][0-9]*").matches(str);
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return false;
    }

    public static void g(je.a aVar, String str, String str2, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            boolean z14 = false;
            int i10 = 0;
            while (i10 < length) {
                String order = jSONArray.getString(i10);
                g.d(order, "order");
                boolean z15 = true;
                if (j.M(order, "in_m-b-", z14)) {
                    String K = j.K(order, "in_m-b-", "");
                    if (K.length() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        if (str2.length() != 0) {
                            z15 = false;
                        }
                        if (!z15) {
                            h hVar = new h(K);
                            ((Bundle) hVar.c).putString("account_id", str2);
                            arrayList.add(new yd.c(u4.b.f30157a, order, hVar));
                        }
                    }
                } else if (j.M(order, "in_m-i-", false)) {
                    String K2 = j.K(order, "in_m-i-", "");
                    if (K2.length() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (str2.length() != 0) {
                            z15 = false;
                        }
                        if (!z15) {
                            h hVar2 = new h(K2);
                            ((Bundle) hVar2.c).putString("account_id", str2);
                            arrayList.add(new yd.c(u4.b.f30159d, order, hVar2));
                        }
                    }
                } else if (j.M(order, "in_m-v-", false)) {
                    String K3 = j.K(order, "in_m-v-", "");
                    if (K3.length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (str2.length() != 0) {
                            z15 = false;
                        }
                        if (!z15) {
                            h hVar3 = new h(K3);
                            ((Bundle) hVar3.c).putString("account_id", str2);
                            arrayList.add(new yd.c(u4.b.f30160e, order, hVar3));
                        }
                    }
                } else if (j.M(order, "in_m-n-", false)) {
                    o9.d.h(arrayList, new w4.a(str2, j.K(order, "in_m-n-", "")), aVar, order);
                } else {
                    z10 = false;
                    if (j.M(order, "in_m-nb-", false)) {
                        o9.d.i(arrayList, new w4.a(str2, j.K(order, "in_m-nb-", "")), aVar, order);
                    }
                    i10++;
                    z14 = z10;
                }
                z10 = false;
                i10++;
                z14 = z10;
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static final void h(Context context, Bundle bundle) {
        g.e(context, "context");
        float f10 = (float) bundle.getDouble("value");
        if (s.f31176a == null) {
            s.f31176a = context.getSharedPreferences("sp_tai_chi", 0);
        }
        SharedPreferences sharedPreferences = s.f31176a;
        g.b(sharedPreferences);
        float f11 = sharedPreferences.getFloat("taichiTroasCache", 0.0f);
        float f12 = f11 + f10;
        String str = "TaiChiHelper admobStatistic last=" + f11 + " curr=" + f10 + " all=" + f12;
        if (xd.a.f31647a) {
            fe.a.a().b(str);
        }
        double d10 = f12;
        if (d10 >= 0.01d) {
            Bundle bundle2 = new Bundle();
            bundle2.putDouble("value", d10);
            bundle2.putString("currency", "USD");
            FirebaseAnalytics.getInstance(context).b(bundle2, "Total_Ads_Revenue_001");
            String str2 = "sendEvent--Total_Ads_Revenue_001 | " + bundle2;
            if (xd.a.f31647a) {
                fe.a.a().b(str2);
            }
            x(context, "Total_Ads_Revenue_001", d10);
            s.a(context, 0.0f);
            return;
        }
        s.a(context, f12);
    }

    public static final void i(StringBuilder sb2, Object obj, l lVar) {
        boolean z10;
        if (lVar != null) {
            sb2.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof CharSequence;
        }
        if (z10) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) String.valueOf(obj));
        }
    }

    public static int l(Context context, String str) {
        boolean z10;
        int c10;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d10 = k0.g.d(str);
        if (d10 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && w0.b.a(packageName2, packageName)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c11 = k0.h.c(context);
                    c10 = k0.h.a(c11, d10, Binder.getCallingUid(), packageName);
                    if (c10 == 0) {
                        c10 = k0.h.a(c11, d10, myUid, k0.h.b(context));
                    }
                } else {
                    c10 = k0.g.c((AppOpsManager) k0.g.a(context, AppOpsManager.class), d10, packageName);
                }
            } else {
                c10 = k0.g.c((AppOpsManager) k0.g.a(context, AppOpsManager.class), d10, packageName);
            }
            if (c10 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final long m(InputStream inputStream, OutputStream outputStream, int i10) {
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00de, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress o(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.a.o(int, int, java.lang.String):java.net.InetAddress");
    }

    public static String p(String str, String str2) {
        byte[] decodeBytesNative;
        if (!Decoder.f18572a) {
            decodeBytesNative = str.getBytes();
        } else {
            decodeBytesNative = Decoder.decodeBytesNative(str, str2);
        }
        return new String(decodeBytesNative, StandardCharsets.UTF_8);
    }

    public static int q(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f;
        float c10 = c(((i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float c11 = c(((i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float c12 = c((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float c13 = c(((i11 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float c14 = c(((i11 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float c15 = c((i11 & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f);
        float l10 = r.l(((i11 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC) / 255.0f, f11, f10, f11);
        float l11 = r.l(c13, c10, f10, c10);
        float l12 = r.l(c14, c11, f10, c11);
        float l13 = r.l(c15, c12, f10, c12);
        int round = Math.round(e(l11) * 255.0f) << 16;
        return Math.round(e(l13) * 255.0f) | round | (Math.round(l10 * 255.0f) << 24) | (Math.round(e(l12) * 255.0f) << 8);
    }

    public static Object r(lh.e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int round4;
        int round5;
        int round6;
        int round7;
        int round8;
        int round9;
        int round10;
        int round11;
        int round12;
        int round13;
        int round14;
        int round15;
        int i10;
        int i11;
        int round16;
        int i12;
        int i13;
        int round17;
        int round18;
        int round19;
        int round20;
        int round21;
        int round22;
        int round23;
        int round24;
        if (eVar.f20617o) {
            return wg.b.b(eVar, rect);
        }
        wg.a.O().reset();
        int i14 = eVar.f20615m;
        if (i14 != 13) {
            if (i14 != 15) {
                if (i14 != 55) {
                    if (i14 != 99) {
                        if (i14 != 182) {
                            if (i14 != 93) {
                                if (i14 != 94) {
                                    switch (i14) {
                                        case 66:
                                            Path O = wg.a.O();
                                            Float[] fArr = eVar.f20616n;
                                            if (fArr != null && fArr.length >= 1) {
                                                if (fArr[0] != null) {
                                                    round5 = a0.a.c(fArr[0], rect.width());
                                                } else {
                                                    round5 = Math.round(rect.width() * 0.25f);
                                                }
                                                if (fArr.length >= 2 && fArr[1] != null) {
                                                    round6 = a0.a.c(fArr[1], rect.height());
                                                } else {
                                                    round6 = Math.round(rect.height() * 0.25f);
                                                }
                                            } else {
                                                round5 = Math.round(rect.width() * 0.25f);
                                                round6 = Math.round(rect.height() * 0.25f);
                                            }
                                            O.moveTo(rect.left, rect.centerY());
                                            O.lineTo(rect.left + round5, rect.top);
                                            O.lineTo(rect.left + round5, rect.top + round6);
                                            O.lineTo(rect.right, rect.top + round6);
                                            O.lineTo(rect.right, rect.bottom - round6);
                                            O.lineTo(rect.left + round5, rect.bottom - round6);
                                            O.lineTo(rect.left + round5, rect.bottom);
                                            O.close();
                                            return O;
                                        case 67:
                                            Path O2 = wg.a.O();
                                            Float[] fArr2 = eVar.f20616n;
                                            if (fArr2 != null && fArr2.length >= 1) {
                                                if (fArr2[0] != null) {
                                                    round7 = a0.a.c(fArr2[0], rect.height());
                                                } else {
                                                    round7 = Math.round(rect.height() * 0.75f);
                                                }
                                                if (fArr2.length >= 2 && fArr2[1] != null) {
                                                    round8 = a0.a.c(fArr2[1], rect.width());
                                                } else {
                                                    round8 = Math.round(rect.width() * 0.25f);
                                                }
                                            } else {
                                                round7 = Math.round(rect.height() * 0.75f);
                                                round8 = Math.round(rect.width() * 0.25f);
                                            }
                                            O2.moveTo(rect.left + round8, rect.top);
                                            O2.lineTo(rect.right - round8, rect.top);
                                            O2.lineTo(rect.right - round8, rect.top + round7);
                                            O2.lineTo(rect.right, rect.top + round7);
                                            O2.lineTo(rect.centerX(), rect.bottom);
                                            O2.lineTo(rect.left, rect.top + round7);
                                            O2.lineTo(rect.left + round8, rect.top + round7);
                                            O2.close();
                                            return O2;
                                        case 68:
                                            Path O3 = wg.a.O();
                                            Float[] fArr3 = eVar.f20616n;
                                            if (fArr3 != null && fArr3.length >= 1) {
                                                if (fArr3[0] != null) {
                                                    round9 = a0.a.c(fArr3[0], rect.height());
                                                } else {
                                                    round9 = Math.round(rect.height() * 0.25f);
                                                }
                                                if (fArr3.length >= 2 && fArr3[1] != null) {
                                                    round10 = a0.a.c(fArr3[1], rect.width());
                                                } else {
                                                    round10 = Math.round(rect.width() * 0.25f);
                                                }
                                            } else {
                                                round9 = Math.round(rect.height() * 0.25f);
                                                round10 = Math.round(rect.width() * 0.25f);
                                            }
                                            O3.moveTo(rect.centerX(), rect.top);
                                            O3.lineTo(rect.right, rect.top + round9);
                                            O3.lineTo(rect.right - round10, rect.top + round9);
                                            O3.lineTo(rect.right - round10, rect.bottom);
                                            O3.lineTo(rect.left + round10, rect.bottom);
                                            O3.lineTo(rect.left + round10, rect.top + round9);
                                            O3.lineTo(rect.left, rect.top + round9);
                                            O3.close();
                                            return O3;
                                        case 69:
                                            Path O4 = wg.a.O();
                                            Float[] fArr4 = eVar.f20616n;
                                            if (fArr4 != null && fArr4.length >= 1) {
                                                if (fArr4[0] != null) {
                                                    round11 = a0.a.c(fArr4[0], rect.width());
                                                } else {
                                                    round11 = Math.round(rect.width() * 0.2f);
                                                }
                                                if (fArr4.length >= 2 && fArr4[1] != null) {
                                                    round12 = a0.a.c(fArr4[1], rect.height());
                                                } else {
                                                    round12 = Math.round(rect.height() * 0.25f);
                                                }
                                            } else {
                                                round11 = Math.round(rect.width() * 0.2f);
                                                round12 = Math.round(rect.height() * 0.25f);
                                            }
                                            O4.moveTo(rect.left, rect.centerY());
                                            O4.lineTo(rect.left + round11, rect.top);
                                            O4.lineTo(rect.left + round11, rect.top + round12);
                                            O4.lineTo(rect.right - round11, rect.top + round12);
                                            O4.lineTo(rect.right - round11, rect.top);
                                            O4.lineTo(rect.right, rect.centerY());
                                            O4.lineTo(rect.right - round11, rect.bottom);
                                            O4.lineTo(rect.right - round11, rect.bottom - round12);
                                            O4.lineTo(rect.left + round11, rect.bottom - round12);
                                            O4.lineTo(rect.left + round11, rect.bottom);
                                            O4.close();
                                            return O4;
                                        case 70:
                                            Path O5 = wg.a.O();
                                            Float[] fArr5 = eVar.f20616n;
                                            if (fArr5 != null && fArr5.length >= 1) {
                                                if (fArr5[0] != null) {
                                                    round13 = a0.a.c(fArr5[0], rect.width());
                                                } else {
                                                    round13 = Math.round(rect.width() * 0.25f);
                                                }
                                                if (fArr5.length >= 2 && fArr5[1] != null) {
                                                    round14 = a0.a.c(fArr5[1], rect.height());
                                                } else {
                                                    round14 = Math.round(rect.height() * 0.25f);
                                                }
                                            } else {
                                                round13 = Math.round(rect.width() * 0.25f);
                                                round14 = Math.round(rect.height() * 0.25f);
                                            }
                                            O5.moveTo(rect.centerX(), rect.top);
                                            O5.lineTo(rect.right, rect.top + round14);
                                            O5.lineTo(rect.right - round13, rect.top + round14);
                                            O5.lineTo(rect.right - round13, rect.bottom - round14);
                                            O5.lineTo(rect.right, rect.bottom - round14);
                                            O5.lineTo(rect.centerX(), rect.bottom);
                                            O5.lineTo(rect.left, rect.bottom - round14);
                                            O5.lineTo(rect.left + round13, rect.bottom - round14);
                                            O5.lineTo(rect.left + round13, rect.top + round14);
                                            O5.lineTo(rect.left, rect.top + round14);
                                            O5.close();
                                            return O5;
                                        default:
                                            switch (i14) {
                                                case 76:
                                                    Path O6 = wg.a.O();
                                                    Float[] fArr6 = eVar.f20616n;
                                                    if (fArr6 != null && fArr6.length >= 1) {
                                                        if (fArr6[0] != null) {
                                                            i11 = a0.a.c(fArr6[0], rect.height());
                                                            i13 = a0.a.c(fArr6[0], rect.width());
                                                        } else {
                                                            int round25 = Math.round(rect.height() * 0.3f);
                                                            i13 = Math.round(rect.width() * 0.3f);
                                                            i11 = round25;
                                                        }
                                                        if (fArr6.length >= 2 && fArr6[1] != null) {
                                                            i10 = a0.a.c(fArr6[1], rect.height());
                                                            round15 = a0.a.c(fArr6[1], rect.width());
                                                        } else {
                                                            int round26 = Math.round(rect.height() * 0.4f);
                                                            round15 = Math.round(rect.width() * 0.4f);
                                                            i10 = round26;
                                                        }
                                                        if (fArr6.length >= 3 && fArr6[2] != null) {
                                                            i12 = a0.a.c(fArr6[2], rect.width());
                                                            round16 = a0.a.c(fArr6[2], rect.height());
                                                        } else {
                                                            i12 = Math.round(rect.width() * 0.2f);
                                                            round16 = Math.round(rect.height() * 0.2f);
                                                        }
                                                    } else {
                                                        int round27 = Math.round(rect.height() * 0.3f);
                                                        int round28 = Math.round(rect.height() * 0.4f);
                                                        int round29 = Math.round(rect.width() * 0.2f);
                                                        int round30 = Math.round(rect.width() * 0.3f);
                                                        round15 = Math.round(rect.width() * 0.4f);
                                                        i10 = round28;
                                                        i11 = round27;
                                                        round16 = Math.round(rect.height() * 0.2f);
                                                        i12 = round29;
                                                        i13 = round30;
                                                    }
                                                    O6.moveTo(rect.left + round15, rect.bottom - i10);
                                                    O6.lineTo(rect.left + i12, rect.bottom - i10);
                                                    O6.lineTo(rect.left + i12, rect.bottom - i11);
                                                    O6.lineTo(rect.left, rect.centerY());
                                                    O6.lineTo(rect.left + i12, rect.top + i11);
                                                    O6.lineTo(rect.left + i12, rect.top + i10);
                                                    O6.lineTo(rect.left + round15, rect.top + i10);
                                                    O6.lineTo(rect.left + round15, rect.top + round16);
                                                    O6.lineTo(rect.left + i13, rect.top + round16);
                                                    O6.lineTo(rect.centerX(), rect.top);
                                                    O6.lineTo(rect.right - i13, rect.top + round16);
                                                    O6.lineTo(rect.right - round15, rect.top + round16);
                                                    O6.lineTo(rect.right - round15, rect.top + i10);
                                                    O6.lineTo(rect.right - i12, rect.top + i10);
                                                    O6.lineTo(rect.right - i12, rect.top + i11);
                                                    O6.lineTo(rect.right, rect.centerY());
                                                    O6.lineTo(rect.right - i12, rect.bottom - i11);
                                                    O6.lineTo(rect.right - i12, rect.bottom - i10);
                                                    O6.lineTo(rect.right - round15, rect.bottom - i10);
                                                    O6.lineTo(rect.right - round15, rect.bottom - round16);
                                                    O6.lineTo(rect.right - i13, rect.bottom - round16);
                                                    O6.lineTo(rect.centerX(), rect.bottom);
                                                    O6.lineTo(rect.left + i13, rect.bottom - round16);
                                                    O6.lineTo(rect.left + round15, rect.bottom - round16);
                                                    O6.close();
                                                    return O6;
                                                case 77:
                                                    Path O7 = wg.a.O();
                                                    Float[] fArr7 = eVar.f20616n;
                                                    if (fArr7 != null && fArr7.length >= 1) {
                                                        if (fArr7[0] != null) {
                                                            round17 = a0.a.c(fArr7[0], rect.width());
                                                        } else {
                                                            round17 = Math.round(rect.width() * 0.33f);
                                                        }
                                                        if (fArr7.length >= 2 && fArr7[1] != null) {
                                                            round18 = a0.a.c(fArr7[1], rect.height());
                                                        } else {
                                                            round18 = Math.round(rect.height() * 0.25f);
                                                        }
                                                        if (fArr7.length >= 3 && fArr7[2] != null) {
                                                            round19 = a0.a.c(fArr7[2], rect.width());
                                                        } else {
                                                            round19 = Math.round(rect.width() * 0.17f);
                                                        }
                                                        if (fArr7.length >= 4 && fArr7[3] != null) {
                                                            round20 = a0.a.c(fArr7[3], rect.height());
                                                        } else {
                                                            round20 = Math.round(rect.height() * 0.375f);
                                                        }
                                                    } else {
                                                        round17 = Math.round(rect.width() * 0.33f);
                                                        round18 = Math.round(rect.height() * 0.25f);
                                                        round19 = Math.round(rect.width() * 0.17f);
                                                        round20 = Math.round(rect.height() * 0.375f);
                                                    }
                                                    O7.moveTo(rect.left, rect.centerY());
                                                    O7.lineTo(rect.left + round19, rect.top + round18);
                                                    O7.lineTo(rect.left + round19, rect.top + round20);
                                                    O7.lineTo(rect.left + round17, rect.top + round20);
                                                    O7.lineTo(rect.left + round17, rect.top);
                                                    O7.lineTo(rect.right, rect.top);
                                                    O7.lineTo(rect.right, rect.bottom);
                                                    O7.lineTo(rect.left + round17, rect.bottom);
                                                    O7.lineTo(rect.left + round17, rect.bottom - round20);
                                                    O7.lineTo(rect.left + round19, rect.bottom - round20);
                                                    O7.lineTo(rect.left + round19, rect.bottom - round18);
                                                    O7.close();
                                                    return O7;
                                                case 78:
                                                    Path O8 = wg.a.O();
                                                    Float[] fArr8 = eVar.f20616n;
                                                    if (fArr8 != null && fArr8.length >= 1) {
                                                        if (fArr8[0] != null) {
                                                            round21 = a0.a.c(fArr8[0], rect.width());
                                                        } else {
                                                            round21 = Math.round(rect.width() * 0.67f);
                                                        }
                                                        if (fArr8.length >= 2 && fArr8[1] != null) {
                                                            round22 = a0.a.c(fArr8[1], rect.height());
                                                        } else {
                                                            round22 = Math.round(rect.height() * 0.25f);
                                                        }
                                                        if (fArr8.length >= 3 && fArr8[2] != null) {
                                                            round23 = a0.a.c(fArr8[2], rect.width());
                                                        } else {
                                                            round23 = Math.round(rect.width() * 0.83f);
                                                        }
                                                        if (fArr8.length >= 4 && fArr8[3] != null) {
                                                            round24 = a0.a.c(fArr8[3], rect.height());
                                                        } else {
                                                            round24 = Math.round(rect.height() * 0.375f);
                                                        }
                                                    } else {
                                                        round21 = Math.round(rect.width() * 0.67f);
                                                        round22 = Math.round(rect.height() * 0.25f);
                                                        round23 = Math.round(rect.width() * 0.83f);
                                                        round24 = Math.round(rect.height() * 0.375f);
                                                    }
                                                    O8.moveTo(rect.left, rect.top);
                                                    O8.lineTo(rect.left + round21, rect.top);
                                                    O8.lineTo(rect.left + round21, rect.top + round24);
                                                    O8.lineTo(rect.left + round23, rect.top + round24);
                                                    O8.lineTo(rect.left + round23, rect.top + round22);
                                                    O8.lineTo(rect.right, rect.centerY());
                                                    O8.lineTo(rect.left + round23, rect.bottom - round22);
                                                    O8.lineTo(rect.left + round23, rect.bottom - round24);
                                                    O8.lineTo(rect.left + round21, rect.bottom - round24);
                                                    O8.lineTo(rect.left + round21, rect.bottom);
                                                    O8.lineTo(rect.left, rect.bottom);
                                                    O8.close();
                                                    return O8;
                                                case 79:
                                                    return wg.a.S(eVar, rect);
                                                case 80:
                                                    return wg.a.J(eVar, rect);
                                                case 81:
                                                    return wg.a.K(eVar, rect);
                                                case 82:
                                                    return wg.a.T(eVar, rect);
                                                case 83:
                                                    return wg.a.P(eVar, rect);
                                                default:
                                                    switch (i14) {
                                                        case 89:
                                                            return wg.a.M(eVar, rect);
                                                        case 90:
                                                            return wg.a.D(eVar, rect);
                                                        case 91:
                                                            return wg.a.C(eVar, rect);
                                                        default:
                                                            switch (i14) {
                                                                case 101:
                                                                    Path O9 = wg.a.O();
                                                                    RectF Q = wg.a.Q();
                                                                    int width = rect.width();
                                                                    int height = rect.height();
                                                                    O9.moveTo(rect.left, rect.bottom);
                                                                    float f10 = height;
                                                                    float f11 = 0.38f * f10;
                                                                    O9.lineTo(rect.left, rect.top + f11);
                                                                    float f12 = rect.top;
                                                                    float f13 = width;
                                                                    Q.set(rect.left, f12, rect.right - (0.14f * f13), (0.76f * f10) + f12);
                                                                    O9.arcTo(Q, 180.0f, 180.0f);
                                                                    O9.lineTo(rect.right, rect.top + f11);
                                                                    float f14 = f13 * 0.28f;
                                                                    O9.lineTo(rect.right - f14, (0.66f * f10) + rect.top);
                                                                    O9.lineTo(rect.right - (0.56f * f13), rect.top + f11);
                                                                    float f15 = f13 * 0.42000002f;
                                                                    O9.lineTo(rect.right - f15, rect.top + f11);
                                                                    float f16 = rect.top;
                                                                    Q.set(rect.left + f14, (0.28f * f10) + f16, rect.right - f15, (f10 * 0.48f) + f16);
                                                                    O9.arcTo(Q, 0.0f, -180.0f);
                                                                    O9.lineTo(rect.left + f14, rect.bottom);
                                                                    O9.close();
                                                                    return O9;
                                                                case 102:
                                                                    return wg.a.H(eVar, rect);
                                                                case 103:
                                                                    return wg.a.G(eVar, rect);
                                                                case 104:
                                                                    return wg.a.I(eVar, rect);
                                                                case 105:
                                                                    return wg.a.F(eVar, rect);
                                                                default:
                                                                    return new PathHolder();
                                                            }
                                                    }
                                            }
                                    }
                                }
                                return wg.a.N(eVar, rect);
                            }
                            return wg.a.R(eVar, rect);
                        }
                        return wg.a.L(eVar, rect);
                    }
                    return wg.a.E(eVar, rect);
                }
                Path O10 = wg.a.O();
                Float[] fArr9 = eVar.f20616n;
                if (fArr9 != null && fArr9.length == 1 && fArr9[0] != null) {
                    round4 = a0.a.c(fArr9[0], rect.width());
                } else {
                    round4 = Math.round(rect.width() * 0.75f);
                }
                O10.moveTo(rect.left, rect.top);
                O10.lineTo(rect.left + round4, rect.top);
                O10.lineTo(rect.right, rect.centerY());
                O10.lineTo(rect.left + round4, rect.bottom);
                O10.lineTo(rect.left, rect.bottom);
                O10.lineTo((rect.width() + rect.left) - round4, rect.centerY());
                O10.close();
                return O10;
            }
            Path O11 = wg.a.O();
            Float[] fArr10 = eVar.f20616n;
            if (fArr10 != null && fArr10.length == 1 && fArr10[0] != null) {
                round3 = a0.a.c(fArr10[0], rect.width());
            } else {
                round3 = Math.round(rect.width() * 0.75f);
            }
            O11.moveTo(rect.left, rect.top);
            O11.lineTo(rect.left + round3, rect.top);
            O11.lineTo(rect.right, rect.centerY());
            O11.lineTo(rect.left + round3, rect.bottom);
            O11.lineTo(rect.left, rect.bottom);
            O11.close();
            return O11;
        }
        Path O12 = wg.a.O();
        Float[] fArr11 = eVar.f20616n;
        if (fArr11 != null && fArr11.length >= 1) {
            if (fArr11[0] != null) {
                round = a0.a.c(fArr11[0], rect.width());
            } else {
                round = Math.round(rect.width() * 0.75f);
            }
            if (fArr11.length >= 2 && fArr11[1] != null) {
                round2 = a0.a.c(fArr11[1], rect.height());
            } else {
                round2 = Math.round(rect.height() * 0.25f);
            }
        } else {
            round = Math.round(rect.width() * 0.75f);
            round2 = Math.round(rect.height() * 0.25f);
        }
        O12.moveTo(rect.left, rect.top + round2);
        O12.lineTo(rect.left + round, rect.top + round2);
        O12.lineTo(rect.left + round, rect.top);
        O12.lineTo(rect.right, rect.centerY());
        O12.lineTo(rect.left + round, rect.bottom);
        O12.lineTo(rect.left + round, rect.bottom - round2);
        O12.lineTo(rect.left, rect.bottom - round2);
        O12.close();
        return O12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb A[Catch: IOException -> 0x00c7, DONT_GENERATE, TryCatch #2 {IOException -> 0x00c7, blocks: (B:50:0x00c3, B:54:0x00cb, B:56:0x00d0), top: B:80:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0 A[Catch: IOException -> 0x00c7, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {IOException -> 0x00c7, blocks: (B:50:0x00c3, B:54:0x00cb, B:56:0x00d0), top: B:80:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6 A[FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String s(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.a.s(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String t(Properties properties, Method method) {
        String name = properties.getProperty("ro.miui.ui.version.name");
        if (name == null) {
            try {
                Object invoke = method.invoke(null, "ro.miui.ui.version.name");
                g.c(invoke, "null cannot be cast to non-null type kotlin.String");
                name = (String) invoke;
            } catch (Exception unused) {
            }
        }
        if (name != null) {
            Locale locale = Locale.getDefault();
            g.d(locale, "getDefault()");
            name = name.toLowerCase(locale);
            g.d(name, "this as java.lang.String).toLowerCase(locale)");
        }
        g.d(name, "name");
        return name;
    }

    public static final HashSet u(Object... objArr) {
        HashSet hashSet = new HashSet(t0.g0(objArr.length));
        kotlin.collections.f.G(hashSet, objArr);
        return hashSet;
    }

    public static boolean v(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static final byte[] w(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        g.d(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static final void x(Context context, String str, double d10) {
        g.e(context, "context");
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fb_currency", "USD");
            new com.facebook.appevents.l(context, (String) null).e(str, d10, bundle);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static final Set y(Object obj) {
        Set singleton = Collections.singleton(obj);
        g.d(singleton, "singleton(element)");
        return singleton;
    }

    public static final Set z(Object... objArr) {
        if (objArr.length > 0) {
            int length = objArr.length;
            if (length != 0) {
                if (length != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(t0.g0(objArr.length));
                    kotlin.collections.f.G(linkedHashSet, objArr);
                    return linkedHashSet;
                }
                return y(objArr[0]);
            }
            return EmptySet.INSTANCE;
        }
        return EmptySet.INSTANCE;
    }

    @Override // ga.e
    public Object a(ga.r rVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(rVar);
    }

    @Override // r5.a
    public boolean b(File file) {
        if (System.currentTimeMillis() - file.lastModified() > 259200000) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task j(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.e(Boolean.TRUE);
    }
}
