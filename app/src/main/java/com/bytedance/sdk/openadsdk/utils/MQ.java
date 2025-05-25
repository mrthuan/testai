package com.bytedance.sdk.openadsdk.utils;

import a6.h;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import com.bytedance.sdk.openadsdk.core.act.AdActAction;
import java.util.HashMap;
import k0.i;
import u.e;
import u.l;

/* compiled from: OpenUtils.java */
/* loaded from: classes.dex */
public class MQ {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJ(String str, int i10, com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJVar = new com.bytedance.sdk.openadsdk.Gm.Qhi.cJ();
        cJVar.Qhi(str);
        cJVar.Qhi(tPVar);
        cJVar.cJ(js.Qhi(tPVar));
        cJVar.Qhi(i10);
        cJVar.Qhi(false);
        cJVar.cJ(tPVar.ip());
        return cJVar;
    }

    public static boolean Qhi(Context context, final String str, final com.bytedance.sdk.openadsdk.core.model.tP tPVar, final String str2) {
        if (context instanceof Activity) {
            if (!Qhi((Activity) context)) {
                context = null;
            }
        } else {
            Activity cJ = com.bytedance.sdk.openadsdk.core.pA.Qhi().fl().cJ();
            if (cJ != null && Qhi(cJ)) {
                context = cJ;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
        }
        if (context == null) {
            return false;
        }
        final String Qhi = js.Qhi(tPVar);
        if (!com.bytedance.sdk.component.utils.hpZ.Qhi(str)) {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJ(str2, 5, tPVar));
            return false;
        }
        final String cJ2 = com.bytedance.sdk.openadsdk.core.model.tP.cJ(context, tPVar);
        if (!TextUtils.isEmpty(cJ2)) {
            try {
                final e.b bVar = new e.b();
                Intent intent = bVar.f30090a;
                intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", false);
                bVar.f30092d = 2;
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                if (context instanceof Activity) {
                    Integer valueOf = Integer.valueOf(((Activity) context).getWindow().getNavigationBarColor() | (-16777216));
                    Bundle bundle = new Bundle();
                    if (valueOf != null) {
                        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                    }
                    bVar.c = bundle;
                }
                final Context context2 = context;
                new AdActAction(context, tPVar, str2, str).Qhi(new AdActAction.BindCustomTabsServiceCallback() { // from class: com.bytedance.sdk.openadsdk.utils.MQ.1
                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindFail(int i10, String str3) {
                        com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJ3 = MQ.cJ(str2, i10, tPVar);
                        cJ3.ac(str3);
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJ3);
                        MQ.cJ(context2, str, tPVar, str2, Qhi);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindSuccess(l lVar) {
                        if (lVar != null) {
                            try {
                                e.b bVar2 = e.b.this;
                                bVar2.getClass();
                                String packageName = lVar.f30109d.getPackageName();
                                Intent intent2 = bVar2.f30090a;
                                intent2.setPackage(packageName);
                                IBinder asBinder = lVar.c.asBinder();
                                Bundle bundle2 = new Bundle();
                                i.b(bundle2, "android.support.customtabs.extra.SESSION", asBinder);
                                PendingIntent pendingIntent = lVar.f30110e;
                                if (pendingIntent != null) {
                                    bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                                }
                                intent2.putExtras(bundle2);
                            } catch (Throwable th2) {
                                String message = th2.getMessage();
                                com.bytedance.sdk.component.utils.ABk.Qhi("OpenUtils", message);
                                com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJ3 = MQ.cJ(str2, 13, tPVar);
                                cJ3.ac(message);
                                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJ3);
                                MQ.cJ(context2, str, tPVar, str2, Qhi);
                                return;
                            }
                        }
                        e a10 = e.b.this.a();
                        if (!(context2 instanceof Activity)) {
                            a10.f30089a.addFlags(268435456);
                        }
                        com.bytedance.sdk.openadsdk.core.act.ac.Qhi(context2, cJ2, a10, Uri.parse(str));
                        Context context3 = context2;
                        if (context3 instanceof TTBaseActivity) {
                            ((TTBaseActivity) context3).Qhi(true);
                        }
                        com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJ4 = MQ.cJ(str2, 100, tPVar);
                        cJ4.Qhi(true);
                        cJ4.cJ(8);
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJ4);
                    }
                });
                return true;
            } catch (Throwable th2) {
                String message = th2.getMessage();
                com.bytedance.sdk.component.utils.ABk.Qhi("OpenUtils", message);
                com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJ3 = cJ(str2, 12, tPVar);
                cJ3.ac(message);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJ3);
                return cJ(context, str, tPVar, str2, Qhi);
            }
        }
        return cJ(context, str, tPVar, str2, Qhi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean cJ(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tP tPVar, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJ = cJ(str2, 100, tPVar);
                cJ.Qhi(true);
                cJ.cJ(2);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJ);
                return true;
            } catch (Throwable th2) {
                String message = th2.getMessage();
                com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJ2 = cJ(str2, 7, tPVar);
                cJ2.ac(message);
                cJ2.cJ(2);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJ2);
                return false;
            }
        } catch (Throwable th3) {
            String message2 = th3.getMessage();
            com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJ3 = cJ(str2, 6, tPVar);
            cJ3.ac(message2);
            cJ3.cJ(2);
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJ3);
            return false;
        }
    }

    public static boolean cJ(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tP tPVar, String str2) {
        if (context instanceof Activity) {
            if (!Qhi((Activity) context)) {
                context = null;
            }
        } else {
            Activity cJ = com.bytedance.sdk.openadsdk.core.pA.Qhi().fl().cJ();
            if (cJ != null && Qhi(cJ)) {
                context = cJ;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
        }
        if (context != null && Qhi(str)) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            HashMap h10 = h.h("deeplink_url", str);
            h10.put("jsb_deeplink", 1);
            if (js.Sf(context)) {
                if (js.Qhi(context, intent)) {
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str2, "open_url_app", h10);
                    try {
                        if (!(context instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        context.startActivity(intent);
                        com.bytedance.sdk.openadsdk.cJ.ABk.Qhi().Qhi(h10).Qhi(tPVar, str2);
                        return true;
                    } catch (Throwable unused) {
                    }
                }
                return false;
            }
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str2, "open_url_app", h10);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.cJ.ABk.Qhi().Qhi(h10).Qhi(tPVar, str2);
                return true;
            } catch (Exception unused2) {
                return false;
            }
        }
        return false;
    }

    public static boolean Qhi(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean Qhi(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
