package q9;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import java.util.HashSet;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public final y f29133a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f29134b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f29135d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public w f29136e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f29137f = false;

    public x(y yVar, IntentFilter intentFilter, Context context) {
        this.f29133a = yVar;
        this.f29134b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        w wVar;
        if ((this.f29137f || !this.f29135d.isEmpty()) && this.f29136e == null) {
            w wVar2 = new w(this);
            this.f29136e = wVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.c.registerReceiver(wVar2, this.f29134b, 2);
            } else {
                this.c.registerReceiver(wVar2, this.f29134b);
            }
        }
        if (!this.f29137f && this.f29135d.isEmpty() && (wVar = this.f29136e) != null) {
            this.c.unregisterReceiver(wVar);
            this.f29136e = null;
        }
    }

    public abstract void b(Intent intent);

    public final synchronized void c(NativeSoLoaderHelper.Companion.a aVar) {
        this.f29133a.d("registerListener", new Object[0]);
        this.f29135d.add(aVar);
        a();
    }

    public final synchronized boolean d() {
        if (this.f29136e != null) {
            return true;
        }
        return false;
    }
}
