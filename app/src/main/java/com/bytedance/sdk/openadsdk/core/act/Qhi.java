package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.iMK;
import java.util.ArrayList;
import java.util.List;
import u.b;
import u.d;
import u.k;
import u.l;
import u.n;

/* compiled from: ActHelper.java */
/* loaded from: classes.dex */
public class Qhi {
    private static volatile boolean CJ = false;
    private static String Qhi = null;
    private static ActServiceConnection Tgh = null;

    /* renamed from: ac  reason: collision with root package name */
    private static int f8993ac = -1;
    private static int cJ = -1;

    /* renamed from: fl  reason: collision with root package name */
    private static Boolean f8994fl;

    private Qhi() {
    }

    public static int cJ(Context context) {
        return !TextUtils.isEmpty(Qhi(context)) ? 1 : 0;
    }

    public static int ac() {
        return f8993ac;
    }

    public static String Qhi(final Context context) {
        String str = Qhi;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                Qhi = null;
            } else if (!TextUtils.isEmpty(str2) && !Qhi(context, intent) && arrayList.contains(str2)) {
                Qhi = str2;
            } else {
                Qhi = (String) arrayList.get(0);
            }
            if (!TextUtils.isEmpty(Qhi)) {
                synchronized (Qhi.class) {
                    if (!CJ) {
                        cJ cJVar = new cJ() { // from class: com.bytedance.sdk.openadsdk.core.act.Qhi.1
                            @Override // com.bytedance.sdk.openadsdk.core.act.cJ
                            public void Qhi(final d dVar) {
                                iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.Qhi.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        boolean z10;
                                        try {
                                            b bVar = new b();
                                            n nVar = new n() { // from class: com.bytedance.sdk.openadsdk.core.act.Qhi.1.1.1
                                                @Override // u.n
                                                public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
                                                }

                                                @Override // u.n
                                                public void onSessionEnded(boolean z11, Bundle bundle) {
                                                }

                                                @Override // u.n
                                                public void onVerticalScrollEvent(boolean z11, Bundle bundle) {
                                                }
                                            };
                                            l b10 = dVar.b(bVar);
                                            boolean z11 = false;
                                            if (b10 != null) {
                                                try {
                                                    z10 = b10.f30108b.b0(b10.c, Bundle.EMPTY);
                                                } catch (SecurityException e10) {
                                                    throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                int unused = Qhi.cJ = 1;
                                                Bundle bundle = Bundle.EMPTY;
                                                b10.getClass();
                                                try {
                                                    boolean w02 = b10.f30108b.w0(b10.c, new k(nVar), bundle);
                                                    if (w02) {
                                                        int unused2 = Qhi.f8993ac = 1;
                                                    }
                                                    z11 = w02;
                                                } catch (SecurityException e11) {
                                                    throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e11);
                                                }
                                            } else {
                                                int unused3 = Qhi.cJ = 0;
                                            }
                                            if (!z10 || !z11) {
                                                Boolean unused4 = Qhi.f8994fl = Boolean.FALSE;
                                            } else {
                                                Boolean unused5 = Qhi.f8994fl = Boolean.TRUE;
                                            }
                                        } catch (Throwable th2) {
                                            ABk.Qhi("CustomTabsHelper", th2.getMessage());
                                        }
                                        ActServiceConnection actServiceConnection = Qhi.Tgh;
                                        if (Qhi.CJ && actServiceConnection != null) {
                                            try {
                                                context.unbindService(actServiceConnection);
                                            } catch (Throwable unused6) {
                                            }
                                        }
                                    }
                                });
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.act.cJ
                            public void Qhi() {
                                ActServiceConnection unused = Qhi.Tgh = null;
                            }
                        };
                        if (Tgh == null) {
                            Tgh = new ActServiceConnection(cJVar);
                        }
                        d.a(context, Qhi, Tgh);
                        CJ = true;
                    }
                }
            }
        } catch (Throwable th2) {
            ABk.Qhi("CustomTabsHelper", th2.getMessage());
        }
        return Qhi;
    }

    public static int cJ() {
        return cJ;
    }

    public static void cJ(int i10) {
        f8993ac = i10;
    }

    private static boolean Qhi(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
        }
        if (queryIntentActivities.size() == 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                return true;
            }
        }
        return false;
    }

    public static int Qhi() {
        Boolean bool = f8994fl;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void Qhi(int i10) {
        cJ = i10;
    }
}
