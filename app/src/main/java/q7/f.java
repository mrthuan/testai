package q7;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class f extends e<Bundle> {
    public f(int i10, Bundle bundle) {
        super(i10, 1, bundle);
    }

    @Override // q7.e
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // q7.e
    public final boolean b() {
        return false;
    }
}
