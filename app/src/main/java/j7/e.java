package j7;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19050a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19051b;
    public final TreeMap c = new TreeMap();

    /* renamed from: d  reason: collision with root package name */
    public String f19052d;

    /* renamed from: e  reason: collision with root package name */
    public String f19053e;

    /* renamed from: f  reason: collision with root package name */
    public final String f19054f;

    public e(Context context, String str) {
        String concat;
        this.f19050a = context.getApplicationContext();
        this.f19051b = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + Wrappers.a(context).c(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            zzm.g(6);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f19054f = concat;
    }
}
