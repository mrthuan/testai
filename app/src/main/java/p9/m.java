package p9;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public final n f23810a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f23811b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f23812d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public l f23813e = null;

    public m(n nVar, IntentFilter intentFilter, Context context) {
        this.f23810a = nVar;
        this.f23811b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    public final synchronized void a(t9.a aVar) {
        this.f23810a.c("registerListener", new Object[0]);
        this.f23812d.add(aVar);
        c();
    }

    public final synchronized void b(t9.a aVar) {
        this.f23810a.c("unregisterListener", new Object[0]);
        if (aVar != null) {
            this.f23812d.remove(aVar);
            c();
        } else {
            throw new NullPointerException("Unregistered Play Core listener should not be null.");
        }
    }

    public final void c() {
        l lVar;
        HashSet hashSet = this.f23812d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!isEmpty && this.f23813e == null) {
            l lVar2 = new l(this);
            this.f23813e = lVar2;
            int i10 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f23811b;
            if (i10 >= 33) {
                context.registerReceiver(lVar2, intentFilter, 2);
            } else {
                context.registerReceiver(lVar2, intentFilter);
            }
        }
        if (hashSet.isEmpty() && (lVar = this.f23813e) != null) {
            context.unregisterReceiver(lVar);
            this.f23813e = null;
        }
    }
}
