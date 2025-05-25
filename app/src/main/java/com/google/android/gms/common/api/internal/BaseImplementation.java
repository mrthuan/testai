package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class BaseImplementation {

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public interface ResultHolder<R> {
        @KeepForSdk
        void setResult(R r4);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {
        @KeepForSdk
        private final Api<?> api;
        @KeepForSdk
        private final Api.AnyClientKey<A> clientKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @KeepForSdk
        @Deprecated
        public ApiMethodImpl(Api.AnyClientKey<A> anyClientKey, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            if (googleApiClient != null) {
                Preconditions.j(anyClientKey);
                this.clientKey = anyClientKey;
                this.api = null;
                return;
            }
            throw new NullPointerException("GoogleApiClient must not be null");
        }

        @KeepForSdk
        private void setFailedResult(RemoteException remoteException) {
            setFailedResult(new Status(8, remoteException.getLocalizedMessage(), null, null));
        }

        @KeepForSdk
        public abstract void doExecute(A a10);

        @KeepForSdk
        public final Api<?> getApi() {
            return this.api;
        }

        @KeepForSdk
        public final Api.AnyClientKey<A> getClientKey() {
            return this.clientKey;
        }

        @KeepForSdk
        public final void run(A a10) {
            try {
                doExecute(a10);
            } catch (DeadObjectException e10) {
                setFailedResult(e10);
                throw e10;
            } catch (RemoteException e11) {
                setFailedResult(e11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public /* bridge */ /* synthetic */ void setResult(Object obj) {
            super.setResult((ApiMethodImpl<R, A>) ((Result) obj));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @KeepForSdk
        public ApiMethodImpl(Api<?> api, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            if (googleApiClient != null) {
                if (api != null) {
                    this.clientKey = api.f10898b;
                    this.api = api;
                    return;
                }
                throw new NullPointerException("Api must not be null");
            }
            throw new NullPointerException("GoogleApiClient must not be null");
        }

        @KeepForSdk
        public final void setFailedResult(Status status) {
            Preconditions.a("Failed result must not be success", !status.d());
            R createFailedResult = createFailedResult(status);
            setResult((ApiMethodImpl<R, A>) createFailedResult);
            onSetFailedResult(createFailedResult);
        }

        @KeepForSdk
        public ApiMethodImpl(BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.clientKey = new Api.AnyClientKey<>();
            this.api = null;
        }

        @KeepForSdk
        public void onSetFailedResult(R r4) {
        }
    }
}
