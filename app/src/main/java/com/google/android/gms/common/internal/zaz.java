package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zaz extends RemoteCreator {

    /* renamed from: a  reason: collision with root package name */
    public static final zaz f11288a = new zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i10, int i11) {
        zaz zazVar = f11288a;
        try {
            zax zaxVar = new zax(1, i10, i11, null);
            ObjectWrapper objectWrapper = new ObjectWrapper(context);
            zam zamVar = (zam) zazVar.getRemoteCreatorInstance(context);
            Parcel zaa = zamVar.zaa();
            com.google.android.gms.internal.base.zac.zad(zaa, objectWrapper);
            com.google.android.gms.internal.base.zac.zac(zaa, zaxVar);
            Parcel zab = zamVar.zab(2, zaa);
            IObjectWrapper K = IObjectWrapper.Stub.K(zab.readStrongBinder());
            zab.recycle();
            return (View) ObjectWrapper.L0(K);
        } catch (Exception e10) {
            throw new RemoteCreator.RemoteCreatorException(a0.d.b("Could not get button with size ", i10, " and color ", i11), e10);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof zam) {
            return (zam) queryLocalInterface;
        }
        return new zam(iBinder);
    }
}
