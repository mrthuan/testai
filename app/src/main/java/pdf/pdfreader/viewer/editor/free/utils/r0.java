package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingStoragePermissionGuideActivity;

/* compiled from: PermissionUtil.java */
/* loaded from: classes3.dex */
public final class r0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0027 A[Catch: Exception -> 0x0021, TryCatch #1 {Exception -> 0x0021, blocks: (B:10:0x0018, B:18:0x0027, B:20:0x0038), top: B:57:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List<nl.c>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static nl.d a(android.content.Context r13, android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.r0.a(android.content.Context, android.content.Intent):nl.d");
    }

    public static void b(Activity activity) {
        try {
            activity.startActivityForResult(new Intent(ea.a.p("Lm5VchZpUy4pZT50HG4PcxtBPlAJSSZBH0kBThxED1QOSX1TJlNyVA5JBEdT", "8NUVKNCJ"), Uri.parse(ea.a.p("P2FSaxhnUjo=", "lzh4xlEV") + activity.getPackageName())), 102);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void c(Context context) {
        t1.b(ea.a.p("H2VDbRBzRGk1bh90HGxIclBxG2U2dChhCWECZRRsIkYmbFRQHHJaaSlzI28bIBt0VHJ0", "tGxPgeUN"));
        Intent intent = new Intent(ea.a.p("Um4vchxpBi4BZUB0AG4xc2pNc04HRwZfI1AzX3FMFF91SQdFIF8jQzFFZ1M2UBNSCUlhUw9PTg==", "bc0XdxvR"), Uri.parse(ea.a.p("Q2EoaxJnBzoCZFIuGWQwciFhVmU0LjVpDHcTcnxlK2lHbzkuFXIHZQ==", "ivROqMaU")));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            t1.b(ea.a.p("KGUYbTtzK2knbjN0XWx3cl1xJ2U6dHthGmEWZRBsLkYRbA9QN3I1aTtzD29aIDFhUWx-ID1yTyAaZQl0", "GWxjRXH8"));
            Intent intent2 = new Intent();
            intent2.setAction(ea.a.p("Um4vchxpBi4BZUB0AG4xc2pNc04HRwZfcUwbXz5JKUVgXwpDMEUxUy1QcVIkSQVTDU9O", "0WxeJgoQ"));
            try {
                context.startActivity(intent2);
            } catch (ActivityNotFoundException e10) {
                dp.a.a().getClass();
                dp.a.d(context, e10);
            }
            intent = null;
        }
        try {
            nl.d a10 = a(context, intent);
            if (a10.f22599a) {
                context.startActivity(new Intent(context, SettingStoragePermissionGuideActivity.class));
                if (context instanceof Activity) {
                    ((Activity) context).overridePendingTransition(0, 0);
                }
            }
            String p10 = ea.a.p("P2VDbRBzRGk1bhUxMQ==", "iEvcoYs4");
            String p11 = ea.a.p("CmVAbRNzH2knbjlzTXMIc1Bvdw==", "H6z2zlHg");
            tn.a.d(context, p10, p11, Build.MODEL + ea.a.p("Xw==", "9QvdULPH") + Build.VERSION.SDK_INT + ea.a.p("Xw==", "IoLlIqlk") + a10.f22600b, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
