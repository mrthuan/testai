package q7;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public abstract class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f29091a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<T> f29092b = new TaskCompletionSource<>();
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f29093d;

    public e(int i10, int i11, Bundle bundle) {
        this.f29091a = i10;
        this.c = i11;
        this.f29093d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            new StringBuilder(valueOf.length() + 14 + valueOf2.length());
        }
        this.f29092b.a(zzqVar);
    }

    public final void d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle);
            new StringBuilder(valueOf.length() + 16 + valueOf2.length());
        }
        this.f29092b.b(bundle);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(this.c);
        sb2.append(" id=");
        sb2.append(this.f29091a);
        sb2.append(" oneWay=");
        sb2.append(b());
        sb2.append("}");
        return sb2.toString();
    }
}
