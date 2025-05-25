package q9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class v extends a {
    public v(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void g0(Bundle bundle) {
        Parcel K = K();
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        L0(3, K);
    }
}
