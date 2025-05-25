package q7;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class d extends e<Void> {
    public d(int i10, Bundle bundle) {
        super(i10, 2, bundle);
    }

    @Override // q7.e
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new zzq(4, "Invalid response to one way request", null));
        }
    }

    @Override // q7.e
    public final boolean b() {
        return true;
    }
}
