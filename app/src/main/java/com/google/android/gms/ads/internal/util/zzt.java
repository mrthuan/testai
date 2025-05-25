package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import androidx.activity.f;
import androidx.core.content.a;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzcea;
import com.google.android.gms.internal.ads.zzcfm;
import com.google.android.gms.internal.ads.zzdpo;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzfeo;
import com.google.android.gms.internal.ads.zzfui;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzhfv;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import m7.k;
import m7.l;
import m7.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.e;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzt {

    /* renamed from: l  reason: collision with root package name */
    public static final zzf f10496l = new zzf(Looper.getMainLooper());

    /* renamed from: g  reason: collision with root package name */
    public String f10502g;

    /* renamed from: h  reason: collision with root package name */
    public volatile String f10503h;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f10497a = new AtomicReference(null);

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f10498b = new AtomicReference(null);
    public final AtomicReference c = new AtomicReference(new Bundle());

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f10499d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public boolean f10500e = true;

    /* renamed from: f  reason: collision with root package name */
    public final Object f10501f = new Object();

    /* renamed from: i  reason: collision with root package name */
    public boolean f10504i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10505j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ExecutorService f10506k = Executors.newSingleThreadExecutor();

    public static int A(Context context, Uri uri) {
        int i10;
        if (context == null) {
            zze.h("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zze.h("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        } else {
            i10 = 0;
        }
        zzbbn zzbbnVar = zzbbw.zzec;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        zzbbn zzbbnVar2 = zzbbw.zzed;
        zzbbu zzbbuVar = zzbaVar.c;
        if (true == ((Boolean) zzbaVar.c.zza(zzbbnVar)).equals(zzbbuVar.zza(zzbbnVar2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) zzbbuVar.zza(zzbbnVar)).booleanValue()) {
            zzbct zzbctVar = new zzbct();
            zzbctVar.zze(new k(zzbctVar, context, uri));
            zzbctVar.zzb((Activity) context);
        }
        if (((Boolean) zzbbuVar.zza(zzbbnVar2)).booleanValue()) {
            e a10 = new e.b().a();
            String zza = zzhfv.zza(context);
            Intent intent2 = a10.f30089a;
            intent2.setPackage(zza);
            intent2.setData(uri);
            a.startActivity(context, intent2, null);
            return 5;
        }
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean B(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzt.B(android.view.View):boolean");
    }

    public static final String C(Context context) {
        Bundle bundle;
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        try {
            bundle = Wrappers.a(context).a(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            zze.i();
            bundle = null;
        }
        return r(bundle);
    }

    public static final String D() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String E() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return f.m(str, " ", str2);
    }

    public static final DisplayMetrics F(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final HashMap G(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        String optString = optJSONArray.optString(i10);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    public static final long H(View view) {
        float f10;
        int i10;
        float f11 = Float.MAX_VALUE;
        ViewParent viewParent = view;
        do {
            f10 = 0.0f;
            if (!(viewParent instanceof View)) {
                break;
            }
            View view2 = viewParent;
            f11 = Math.min(f11, view2.getAlpha());
            i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            viewParent = view2.getParent();
        } while (i10 > 0);
        if (f11 >= 0.0f) {
            f10 = f11;
        }
        return Math.round(f10 * 100.0f);
    }

    public static final zzbr I(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                com.google.android.gms.ads.internal.util.client.zzm.c("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof zzbr) {
                return (zzbr) queryLocalInterface;
            }
            return new zzbp(iBinder);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean a(Context context, String str) {
        Context zza = zzbvl.zza(context);
        if (Wrappers.a(zza).f11391a.getPackageManager().checkPermission(str, zza.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(Context context) {
        boolean z10;
        try {
            if (DeviceProperties.f11376f == null) {
                if (PlatformVersion.b() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                DeviceProperties.f11376f = Boolean.valueOf(z10);
            }
            return DeviceProperties.f11376f.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean c(String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.c()) {
            return false;
        }
        zzbbn zzbbnVar = zzbbw.zzev;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzbaVar.c.zza(zzbbw.zzex);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzew);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean e(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        if (powerManager.isScreenOn()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean f(Context context) {
        Bundle bundle;
        try {
            try {
                bundle = Wrappers.a(context).a(128, context.getPackageName()).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                zze.i();
                bundle = null;
            }
            String string = bundle.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(r(bundle))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (RemoteException unused2) {
            return false;
        }
    }

    public static final boolean g(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void h(View view, int i10) {
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        String str2;
        zzfel zzD;
        zzfeo zzR;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdpo) {
                view2 = ((zzdpo) view2).getChildAt(0);
            }
            if (!(view2 instanceof com.google.android.gms.ads.formats.zzj) && !(view2 instanceof NativeAdView)) {
                str = "UNKNOWN";
                i12 = 0;
            } else {
                str = "NATIVE";
                i12 = 1;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i14 = rect.width();
                i13 = rect.height();
            } else {
                i13 = 0;
                i14 = 0;
            }
            zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            long H = H(view2);
            view2.getLocationOnScreen(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof zzcfm) || (zzR = ((zzcfm) view2).zzR()) == null) {
                str2 = "none";
            } else {
                str2 = zzR.zzb;
                view2.setContentDescription(str2 + ":" + view2.hashCode());
            }
            if ((view2 instanceof zzcea) && (zzD = ((zzcea) view2).zzD()) != null) {
                str = zzfel.zza(zzD.zzb);
                i12 = zzD.zze;
                str3 = zzD.zzE;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[15];
            objArr[0] = Integer.valueOf(view2.hashCode());
            objArr[1] = packageName;
            objArr[2] = str3;
            objArr[3] = str2;
            objArr[4] = str;
            objArr[5] = Integer.valueOf(i12);
            try {
                objArr[6] = view2.getClass().getName();
                objArr[7] = Integer.valueOf(i15);
                objArr[8] = Integer.valueOf(i16);
                objArr[9] = Integer.valueOf(view2.getWidth());
                objArr[10] = Integer.valueOf(view2.getHeight());
                objArr[11] = Integer.valueOf(i14);
                objArr[12] = Integer.valueOf(i13);
                objArr[13] = Long.valueOf(H);
                objArr[14] = Integer.toString(i10, 2);
                com.google.android.gms.ads.internal.util.client.zzm.d(String.format(locale, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", objArr));
            } catch (Exception unused) {
                i11 = 6;
                com.google.android.gms.ads.internal.util.client.zzm.g(i11);
            }
        } catch (Exception unused2) {
            i11 = 6;
        }
    }

    public static final AlertDialog.Builder i(Context context) {
        zzu zzuVar = com.google.android.gms.ads.internal.zzu.B.f10555e;
        return new AlertDialog.Builder(context, 16974374);
    }

    public static final void j(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new zzbw(context, str, (String) it.next()).zzb();
        }
    }

    public static final int k(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final HashMap l(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final int[] m(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(16908290)) != null) {
            return new int[]{findViewById.getWidth(), findViewById.getHeight()};
        }
        return new int[]{0, 0};
    }

    public static final int[] n(Activity activity) {
        int[] iArr;
        View findViewById;
        Window window = activity.getWindow();
        if (window != null && (findViewById = window.findViewById(16908290)) != null) {
            iArr = new int[]{findViewById.getTop(), findViewById.getBottom()};
        } else {
            iArr = new int[]{0, 0};
        }
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f10107f;
        return new int[]{zzayVar.f10108a.f(activity, iArr[0]), zzayVar.f10108a.f(activity, iArr[1])};
    }

    public static final boolean o(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10;
        if (!com.google.android.gms.ads.internal.zzu.B.c.f10500e && keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode() && !B(view)) {
            z10 = false;
        } else {
            z10 = true;
        }
        long H = H(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            zzbbn zzbbnVar = zzbbw.zzbc;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) zzbaVar.c.zza(zzbbw.zzjI)).booleanValue()) {
                    return true;
                }
                if (H >= ((Integer) zzbaVar.c.zza(zzbbw.zzjK)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void p(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzo(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            com.google.android.gms.ads.internal.util.client.zzm.b("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public static final int[] q(Activity activity) {
        int[] m10 = m(activity);
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f10107f;
        return new int[]{zzayVar.f10108a.f(activity, m10[0]), zzayVar.f10108a.f(activity, m10[1])};
    }

    public static String r(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            if (!TextUtils.isEmpty(string)) {
                if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
                    return string;
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public static int s(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 > 0) {
            com.google.android.gms.ads.internal.util.client.zzm.e("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
            return 60000;
        }
        return 60000;
    }

    public static boolean t(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final String u(final Context context, String str) {
        final Context context2;
        if (str != null) {
            String str2 = null;
            try {
                zzcg a10 = zzcg.a();
                if (TextUtils.isEmpty(a10.f10449a)) {
                    AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f10886a;
                    try {
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    } catch (PackageManager.NameNotFoundException unused) {
                        context2 = null;
                    }
                    a10.f10449a = (String) zzcd.a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcf
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            boolean z10 = false;
                            Context context3 = context2;
                            Context context4 = context;
                            if (context3 != null) {
                                zze.h("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                zze.h("Attempting to read user agent from local cache.");
                                sharedPreferences = context4.getSharedPreferences("admob_user_agent", 0);
                                z10 = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (TextUtils.isEmpty(string)) {
                                zze.h("Reading user agent from WebSettings");
                                string = WebSettings.getDefaultUserAgent(context4);
                                if (z10) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    zze.h("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                str2 = a10.f10449a;
            } catch (Exception unused2) {
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = D();
            }
            String m10 = f.m(str2, " (Mobile; ", str);
            try {
                if (Wrappers.a(context).d()) {
                    m10 = m10 + ";aia";
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdUtil.getUserAgent");
            }
            return m10.concat(")");
        }
        return D();
    }

    public static ArrayList w() {
        zzbbn zzbbnVar = zzbbw.zza;
        List<String> zzb = com.google.android.gms.ads.internal.client.zzba.f10115d.f10116a.zzb();
        ArrayList arrayList = new ArrayList();
        for (String str : zzb) {
            for (String str2 : zzfvh.zzb(zzfui.zzc(',')).zzc(str)) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    zze.h("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static final void zzT(Context context, Intent intent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkc)).booleanValue()) {
            try {
                try {
                    context.startActivity(intent);
                    return;
                } catch (SecurityException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(5);
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdUtil.startActivityWithUnknownContext");
                    return;
                }
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            context.startActivity(intent);
        } catch (Throwable unused2) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final void zzo(Context context, Intent intent) {
        Bundle bundle;
        if (intent == null) {
            return;
        }
        if (intent.getExtras() != null) {
            bundle = intent.getExtras();
        } else {
            bundle = new Bundle();
        }
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        bundle.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(bundle);
    }

    public final String v(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkp)).booleanValue()) {
            if (this.f10503h != null) {
                return this.f10503h;
            }
            this.f10503h = u(context, str);
            return this.f10503h;
        }
        synchronized (this.f10501f) {
            String str2 = this.f10502g;
            if (str2 != null) {
                return str2;
            }
            String u7 = u(context, str);
            this.f10502g = u7;
            return u7;
        }
    }

    public final void x(Context context, String str, HttpURLConnection httpURLConnection, int i10) {
        int s4 = s(i10);
        com.google.android.gms.ads.internal.util.client.zzm.d("HTTP timeout: " + s4 + " milliseconds.");
        httpURLConnection.setConnectTimeout(s4);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(s4);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", v(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void y(Context context) {
        if (this.f10505j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbbw.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkb)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new l(), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new l(), intentFilter);
        }
        this.f10505j = true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void z(Context context) {
        if (this.f10504i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbbw.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkb)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(new m(this), intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(new m(this), intentFilter);
        }
        this.f10504i = true;
    }
}
