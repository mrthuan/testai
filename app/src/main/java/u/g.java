package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import e.b;

/* compiled from: CustomTabsServiceConnection.java */
/* loaded from: classes.dex */
public abstract class g implements ServiceConnection {
    private Context mApplicationContext;

    /* compiled from: CustomTabsServiceConnection.java */
    /* loaded from: classes.dex */
    public class a extends d {
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, d dVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e.b c0202a;
        if (this.mApplicationContext != null) {
            int i10 = b.a.f16315a;
            if (iBinder == null) {
                c0202a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(e.b.W0);
                if (queryLocalInterface != null && (queryLocalInterface instanceof e.b)) {
                    c0202a = (e.b) queryLocalInterface;
                } else {
                    c0202a = new b.a.C0202a(iBinder);
                }
            }
            onCustomTabsServiceConnected(componentName, new a(c0202a, componentName, this.mApplicationContext));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
