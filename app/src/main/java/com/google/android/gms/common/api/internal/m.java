package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.common.internal.zzw;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class m extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zaaw f11018b;
    public final /* synthetic */ com.google.android.gms.signin.internal.zak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zaaw zaawVar, zaaw zaawVar2, com.google.android.gms.signin.internal.zak zakVar) {
        super(zaawVar);
        this.f11018b = zaawVar2;
        this.c = zakVar;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void a() {
        IAccountAccessor zzwVar;
        IAccountAccessor iAccountAccessor;
        zaaw zaawVar = this.f11018b;
        boolean z10 = false;
        if (zaawVar.o(0)) {
            com.google.android.gms.signin.internal.zak zakVar = this.c;
            ConnectionResult connectionResult = zakVar.f11958b;
            if (connectionResult.f()) {
                zav zavVar = zakVar.c;
                Preconditions.j(zavVar);
                ConnectionResult connectionResult2 = zavVar.c;
                if (!connectionResult2.f()) {
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                    zaawVar.l(connectionResult2);
                    return;
                }
                zaawVar.f11064n = true;
                IBinder iBinder = zavVar.f11282b;
                if (iBinder == null) {
                    iAccountAccessor = null;
                } else {
                    int i10 = IAccountAccessor.Stub.f11215a;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    if (queryLocalInterface instanceof IAccountAccessor) {
                        zzwVar = (IAccountAccessor) queryLocalInterface;
                    } else {
                        zzwVar = new zzw(iBinder);
                    }
                    iAccountAccessor = zzwVar;
                }
                Preconditions.j(iAccountAccessor);
                zaawVar.f11065o = iAccountAccessor;
                zaawVar.f11066p = zavVar.f11283d;
                zaawVar.f11067q = zavVar.f11284e;
                zaawVar.n();
                return;
            }
            if (zaawVar.f11062l && !connectionResult.d()) {
                z10 = true;
            }
            if (z10) {
                zaawVar.i();
                zaawVar.n();
                return;
            }
            zaawVar.l(connectionResult);
        }
    }
}
