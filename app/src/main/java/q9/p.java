package q9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class p extends a implements r {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // q9.r
    public final void A(String str, ArrayList arrayList, Bundle bundle, com.google.android.play.core.assetpacks.w wVar) {
        Parcel K = K();
        K.writeString(str);
        K.writeTypedList(arrayList);
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        K.writeStrongBinder(wVar);
        L0(12, K);
    }

    @Override // q9.r
    public final void A0(String str, Bundle bundle, Bundle bundle2, com.google.android.play.core.assetpacks.v vVar) {
        Parcel K = K();
        K.writeString(str);
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        K.writeInt(1);
        bundle2.writeToParcel(K, 0);
        K.writeStrongBinder(vVar);
        L0(9, K);
    }

    @Override // q9.r
    public final void B(String str, Bundle bundle, Bundle bundle2, com.google.android.play.core.assetpacks.t tVar) {
        Parcel K = K();
        K.writeString(str);
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        K.writeInt(1);
        bundle2.writeToParcel(K, 0);
        K.writeStrongBinder(tVar);
        L0(6, K);
    }

    @Override // q9.r
    public final void H(String str, ArrayList arrayList, Bundle bundle, com.google.android.play.core.assetpacks.x xVar) {
        Parcel K = K();
        K.writeString(str);
        K.writeTypedList(arrayList);
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        K.writeStrongBinder(xVar);
        L0(2, K);
    }

    @Override // q9.r
    public final void J(String str, ArrayList arrayList, Bundle bundle, com.google.android.play.core.assetpacks.p pVar) {
        Parcel K = K();
        K.writeString(str);
        K.writeTypedList(arrayList);
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        K.writeStrongBinder(pVar);
        L0(14, K);
    }

    @Override // q9.r
    public final void W(String str, Bundle bundle, com.google.android.play.core.assetpacks.s sVar) {
        Parcel K = K();
        K.writeString(str);
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        K.writeStrongBinder(sVar);
        L0(10, K);
    }

    @Override // q9.r
    public final void f(String str, Bundle bundle, Bundle bundle2, com.google.android.play.core.assetpacks.u uVar) {
        Parcel K = K();
        K.writeString(str);
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        K.writeInt(1);
        bundle2.writeToParcel(K, 0);
        K.writeStrongBinder(uVar);
        L0(7, K);
    }

    @Override // q9.r
    public final void h0(String str, Bundle bundle, Bundle bundle2, com.google.android.play.core.assetpacks.p pVar) {
        Parcel K = K();
        K.writeString(str);
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        K.writeInt(1);
        bundle2.writeToParcel(K, 0);
        K.writeStrongBinder(pVar);
        L0(13, K);
    }

    @Override // q9.r
    public final void n(String str, Bundle bundle, Bundle bundle2, com.google.android.play.core.assetpacks.q qVar) {
        Parcel K = K();
        K.writeString(str);
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        K.writeInt(1);
        bundle2.writeToParcel(K, 0);
        K.writeStrongBinder(qVar);
        L0(11, K);
    }

    @Override // q9.r
    public final void x0(String str, Bundle bundle, com.google.android.play.core.assetpacks.r rVar) {
        Parcel K = K();
        K.writeString(str);
        int i10 = o.f29130a;
        K.writeInt(1);
        bundle.writeToParcel(K, 0);
        K.writeStrongBinder(rVar);
        L0(5, K);
    }
}
