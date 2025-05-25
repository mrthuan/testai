package wd;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Admob.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f31073a = wd.b.class.getName();

    /* renamed from: b  reason: collision with root package name */
    public static final String f31074b = h.class.getName();
    public static final String c = l.class.getName();

    /* renamed from: d  reason: collision with root package name */
    public static final String f31075d = e.class.getName();

    /* renamed from: e  reason: collision with root package name */
    public static final String f31076e = r.class.getName();

    /* renamed from: f  reason: collision with root package name */
    public static final String f31077f = o.class.getName();

    /* renamed from: g  reason: collision with root package name */
    public static boolean f31078g = false;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f31079h = false;

    /* renamed from: i  reason: collision with root package name */
    public static final ArrayList<d> f31080i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public static int f31081j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static b f31082k;

    /* compiled from: Admob.java */
    /* renamed from: wd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0390a implements OnInitializationCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31083a;

        public C0390a(Context context) {
            this.f31083a = context;
        }

        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
        public final void a() {
            a.f31078g = false;
            a.f31079h = true;
            a.c(true);
        }
    }

    /* compiled from: Admob.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public static synchronized void a(d dVar) {
        synchronized (a.class) {
            ArrayList<d> arrayList = f31080i;
            if (arrayList != null) {
                if (arrayList.size() >= 5) {
                    arrayList.get(0).a(false);
                    arrayList.remove(0);
                }
                arrayList.add(dVar);
            }
        }
    }

    public static void b(Context context, boolean z10, d dVar) {
        if ((z10 && !xd.a.b(context)) || f31079h) {
            dVar.a(true);
        } else if (!f31078g) {
            f31078g = true;
            a(dVar);
            try {
                MobileAds.a(context, new C0390a(context));
            } catch (Throwable th2) {
                th2.printStackTrace();
                f31078g = false;
                c(false);
            }
        } else {
            a(dVar);
        }
    }

    public static synchronized void c(boolean z10) {
        synchronized (a.class) {
            try {
                ArrayList<d> arrayList = f31080i;
                if (arrayList != null) {
                    Iterator<d> it = arrayList.iterator();
                    while (it.hasNext()) {
                        d next = it.next();
                        if (next != null) {
                            next.a(z10);
                        }
                    }
                    f31080i.clear();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static void d(Context context, AdValue adValue, String str, String str2, String str3, String str4) {
        try {
            if (f31081j == -1) {
                if (TextUtils.isEmpty(str4)) {
                    f31081j = de.e.d(context, null, "closePaidEvent", 0);
                } else {
                    f31081j = de.e.d(context, str4, "closePaidEvent", 0);
                }
            }
            if (f31081j == 0) {
                Bundle bundle = new Bundle();
                double d10 = adValue.f10032b / 1000000.0d;
                bundle.putDouble("value", d10);
                bundle.putString("currency", "USD");
                bundle.putString("adUnitId", str);
                bundle.putString("format", str3);
                bundle.putString("precisionType", String.valueOf(adValue.f10031a));
                bundle.putString("adNetwork", str2);
                FirebaseAnalytics.getInstance(context).b(bundle, "Ad_Impression_Revenue");
                ea.a.x(context, "Ad_Impression_Revenue", d10);
                b bVar = f31082k;
                if (bVar != null) {
                    ((il.b) bVar).a(bundle);
                    if (s.f31176a == null) {
                        s.f31176a = context.getSharedPreferences("sp_tai_chi", 0);
                    }
                    SharedPreferences sharedPreferences = s.f31176a;
                    kotlin.jvm.internal.g.b(sharedPreferences);
                    if (!sharedPreferences.contains("taichiTroasCache")) {
                        bundle.putBoolean("isNew", true);
                    }
                    f31082k.getClass();
                }
                ea.a.h(context, bundle);
                if (!xd.a.f31651f.isEmpty() && xd.a.f31651f.equals(bundle.getString("adUnitId")) && xd.a.f31650e != null && !de.e.i(context).contains("h_send")) {
                    xd.a.f31650e.a(bundle);
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void e(boolean z10) {
        boolean z11;
        try {
            fe.a a10 = fe.a.a();
            a10.b("Admob updateMuteStatus:" + z10);
            if (f31079h) {
                zzej b10 = zzej.b();
                synchronized (b10.f10172e) {
                    if (b10.f10173f != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Preconditions.l("MobileAds.initialize() must be called prior to setting app muted state.", z11);
                    try {
                        b10.f10173f.zzp(z10);
                    } catch (RemoteException unused) {
                        zzm.g(6);
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void f() {
        RequestConfiguration.Builder a10 = zzej.b().f10175h.a();
        a10.c(1);
        a10.b(OperatorName.STROKING_COLOR_GRAY);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = a10.f10046d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        MobileAds.b(a10.a());
    }
}
