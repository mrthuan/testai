package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: VerifySoUtil.java */
/* loaded from: classes3.dex */
public final class q1 implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f28752a;

    public q1(Activity activity) {
        this.f28752a = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        boolean z10;
        Activity activity = this.f28752a;
        if (i10 == -1) {
            try {
                Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + activity.getPackageName())).addFlags(268435456);
                try {
                    z10 = activity.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled;
                } catch (PackageManager.NameNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    addFlags.setPackage("com.android.vending");
                }
                activity.startActivity(addFlags);
            } catch (ActivityNotFoundException e10) {
                e10.printStackTrace();
            }
        }
        activity.finishAndRemoveTask();
        ReaderPdfApplication.f23862n = false;
        Iterator<Activity> it = ReaderPdfApplication.f23858j.iterator();
        while (it.hasNext()) {
            it.next().finishAndRemoveTask();
        }
    }
}
