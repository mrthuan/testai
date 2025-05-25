package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class SignInClientImpl extends GmsClient<zaf> implements com.google.android.gms.signin.zae {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f11947e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11948a;

    /* renamed from: b  reason: collision with root package name */
    public final ClientSettings f11949b;
    public final Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f11950d;

    public SignInClientImpl(Context context, Looper looper, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f11948a = true;
        this.f11949b = clientSettings;
        this.c = bundle;
        this.f11950d = clientSettings.f11188i;
    }

    @Override // com.google.android.gms.signin.zae
    public final void a() {
        try {
            zaf zafVar = (zaf) getService();
            Integer num = this.f11950d;
            Preconditions.j(num);
            int intValue = num.intValue();
            Parcel zaa = zafVar.zaa();
            zaa.writeInt(intValue);
            zafVar.zac(7, zaa);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.signin.zae
    public final void b(zae zaeVar) {
        GoogleSignInAccount googleSignInAccount;
        if (zaeVar != null) {
            try {
                Account account = this.f11949b.f11181a;
                if (account == null) {
                    account = new Account(BaseGmsClient.DEFAULT_ACCOUNT, "com.google");
                }
                if (BaseGmsClient.DEFAULT_ACCOUNT.equals(account.name)) {
                    Storage a10 = Storage.a(getContext());
                    ReentrantLock reentrantLock = a10.f10830a;
                    reentrantLock.lock();
                    String string = a10.f10831b.getString("defaultGoogleSignInAccount", null);
                    reentrantLock.unlock();
                    if (!TextUtils.isEmpty(string)) {
                        String str = "googleSignInAccount:" + string;
                        ReentrantLock reentrantLock2 = a10.f10830a;
                        reentrantLock2.lock();
                        String string2 = a10.f10831b.getString(str, null);
                        reentrantLock2.unlock();
                        if (string2 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.f(string2);
                            } catch (JSONException unused) {
                            }
                            Integer num = this.f11950d;
                            Preconditions.j(num);
                            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccount);
                            zaf zafVar = (zaf) getService();
                            zai zaiVar = new zai(1, zatVar);
                            Parcel zaa = zafVar.zaa();
                            com.google.android.gms.internal.base.zac.zac(zaa, zaiVar);
                            com.google.android.gms.internal.base.zac.zad(zaa, zaeVar);
                            zafVar.zac(12, zaa);
                            return;
                        }
                    }
                }
                googleSignInAccount = null;
                Integer num2 = this.f11950d;
                Preconditions.j(num2);
                zat zatVar2 = new zat(2, account, num2.intValue(), googleSignInAccount);
                zaf zafVar2 = (zaf) getService();
                zai zaiVar2 = new zai(1, zatVar2);
                Parcel zaa2 = zafVar2.zaa();
                com.google.android.gms.internal.base.zac.zac(zaa2, zaiVar2);
                com.google.android.gms.internal.base.zac.zad(zaa2, zaeVar);
                zafVar2.zac(12, zaa2);
                return;
            } catch (RemoteException e10) {
                try {
                    zaeVar.s(new zak(1, new ConnectionResult(8, null), null));
                    return;
                } catch (RemoteException unused2) {
                    Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
                    return;
                }
            }
        }
        throw new NullPointerException("Expecting a valid ISignInCallbacks");
    }

    @Override // com.google.android.gms.signin.zae
    public final void c(IAccountAccessor iAccountAccessor, boolean z10) {
        try {
            zaf zafVar = (zaf) getService();
            Integer num = this.f11950d;
            Preconditions.j(num);
            int intValue = num.intValue();
            Parcel zaa = zafVar.zaa();
            com.google.android.gms.internal.base.zac.zad(zaa, iAccountAccessor);
            zaa.writeInt(intValue);
            zaa.writeInt(z10 ? 1 : 0);
            zafVar.zac(9, zaa);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zaf) {
            return (zaf) queryLocalInterface;
        }
        return new zaf(iBinder);
    }

    @Override // com.google.android.gms.signin.zae
    public final void d() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        ClientSettings clientSettings = this.f11949b;
        boolean equals = getContext().getPackageName().equals(clientSettings.f11185f);
        Bundle bundle = this.c;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", clientSettings.f11185f);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.f11948a;
    }
}
