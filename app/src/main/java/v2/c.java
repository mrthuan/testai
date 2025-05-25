package v2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o2.h;

/* compiled from: BroadcastReceiverConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: g  reason: collision with root package name */
    public final a f30481g;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.onBroadcastReceive(context, intent);
            }
        }
    }

    static {
        h.e("BrdcstRcvrCnstrntTrckr");
    }

    public c(Context context, z2.a aVar) {
        super(context, aVar);
        this.f30481g = new a();
    }

    @Override // v2.d
    public final void d() {
        h c = h.c();
        String.format("%s: registering receiver", getClass().getSimpleName());
        c.a(new Throwable[0]);
        this.f30485b.registerReceiver(this.f30481g, f());
    }

    @Override // v2.d
    public final void e() {
        h c = h.c();
        String.format("%s: unregistering receiver", getClass().getSimpleName());
        c.a(new Throwable[0]);
        this.f30485b.unregisterReceiver(this.f30481g);
    }

    public abstract IntentFilter f();

    public abstract void onBroadcastReceive(Context context, Intent intent);
}
