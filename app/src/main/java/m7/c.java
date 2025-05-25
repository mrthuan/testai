package m7;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21826a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f21827b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f21828d;

    public c(Context context, String str, boolean z10, boolean z11) {
        this.f21826a = context;
        this.f21827b = str;
        this.c = z10;
        this.f21828d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzt zztVar = zzu.B.c;
        AlertDialog.Builder i10 = zzt.i(this.f21826a);
        i10.setMessage(this.f21827b);
        if (this.c) {
            i10.setTitle("Error");
        } else {
            i10.setTitle("Info");
        }
        if (this.f21828d) {
            i10.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            i10.setPositiveButton("Learn More", new b(this));
            i10.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        i10.create().show();
    }
}
