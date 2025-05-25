package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal zaa = new o0();
    public static final /* synthetic */ int zad = 0;
    @KeepName
    private p0 resultGuardian;
    protected final CallbackHandler zab;
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private ResultCallback zah;
    private final AtomicReference zai;
    private Result zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private ICancelToken zao;
    private volatile zada zap;
    private boolean zaq;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    /* loaded from: classes.dex */
    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zau {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        public final void a(ResultCallback resultCallback, Result result) {
            int i10 = BasePendingResult.zad;
            Preconditions.j(resultCallback);
            sendMessage(obtainMessage(1, new Pair(resultCallback, result)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    Log.wtf("BasePendingResult", b.a.c("Don't know how to handle message: ", i10), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f10924h);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.a(result);
            } catch (RuntimeException e10) {
                BasePendingResult.zal(result);
                throw e10;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new CallbackHandler(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    private final Result zaa() {
        Result result;
        synchronized (this.zae) {
            Preconditions.l("Result has already been consumed.", !this.zal);
            Preconditions.l("Result is not ready.", isReady());
            result = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        j0 j0Var = (j0) this.zai.getAndSet(null);
        if (j0Var != null) {
            j0Var.f11013a.f11144a.remove(this);
        }
        Preconditions.j(result);
        return result;
    }

    private final void zab(Result result) {
        this.zaj = result;
        this.zak = result.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            ResultCallback resultCallback = this.zah;
            if (resultCallback == null) {
                if (this.zaj instanceof Releasable) {
                    this.resultGuardian = new p0(this);
                }
            } else {
                this.zab.removeMessages(2);
                this.zab.a(resultCallback, zaa());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((PendingResult.StatusListener) arrayList.get(i10)).a();
        }
        this.zag.clear();
    }

    public static void zal(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(result));
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(PendingResult.StatusListener statusListener) {
        boolean z10;
        if (statusListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.a("Callback cannot be null.", z10);
        synchronized (this.zae) {
            if (isReady()) {
                statusListener.a();
            } else {
                this.zag.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @ResultIgnorabilityUnspecified
    public final R await() {
        Preconditions.i("await must not be called on the UI thread");
        Preconditions.l("Result has already been consumed", !this.zal);
        Preconditions.l("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f10922f);
        }
        Preconditions.l("Result is not ready.", isReady());
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                ICancelToken iCancelToken = this.zao;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(createFailedResult(Status.f10925i));
            }
        }
    }

    @KeepForSdk
    public abstract R createFailedResult(Status status);

    @KeepForSdk
    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    @KeepForSdk
    public final boolean isReady() {
        if (this.zaf.getCount() == 0) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public final void setCancelToken(ICancelToken iCancelToken) {
        synchronized (this.zae) {
            this.zao = iCancelToken;
        }
    }

    @KeepForSdk
    public final void setResult(R r4) {
        synchronized (this.zae) {
            if (!this.zan && !this.zam) {
                isReady();
                Preconditions.l("Results have already been set", !isReady());
                Preconditions.l("Result has already been consumed", !this.zal);
                zab(r4);
                return;
            }
            zal(r4);
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(ResultCallback<? super R> resultCallback) {
        synchronized (this.zae) {
            if (resultCallback == null) {
                this.zah = null;
                return;
            }
            boolean z10 = true;
            Preconditions.l("Result has already been consumed.", !this.zal);
            if (this.zap != null) {
                z10 = false;
            }
            Preconditions.l("Cannot set callbacks if then() has been called.", z10);
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.a(resultCallback, zaa());
            } else {
                this.zah = resultCallback;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        boolean z10;
        zada b10;
        Preconditions.l("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            boolean z11 = false;
            if (this.zap == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.l("Cannot call then() twice.", z10);
            if (this.zah == null) {
                z11 = true;
            }
            Preconditions.l("Cannot call then() if callbacks are set.", z11);
            Preconditions.l("Cannot call then() if result was canceled.", !this.zam);
            this.zaq = true;
            this.zap = new zada(this.zac);
            b10 = this.zap.b(resultTransform);
            if (isReady()) {
                this.zab.a(this.zap, zaa());
            } else {
                this.zah = this.zap;
            }
        }
        return b10;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            if (((GoogleApiClient) this.zac.get()) == null || !this.zaq) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zan(j0 j0Var) {
        this.zai.set(j0Var);
    }

    @KeepForSdk
    @Deprecated
    public BasePendingResult(Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new CallbackHandler(looper);
        this.zac = new WeakReference(null);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @ResultIgnorabilityUnspecified
    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            Preconditions.i("await must not be called on the UI thread when time is greater than zero.");
        }
        Preconditions.l("Result has already been consumed.", !this.zal);
        Preconditions.l("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f10924h);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f10922f);
        }
        Preconditions.l("Result is not ready.", isReady());
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(ResultCallback<? super R> resultCallback, long j10, TimeUnit timeUnit) {
        synchronized (this.zae) {
            if (resultCallback == null) {
                this.zah = null;
                return;
            }
            boolean z10 = true;
            Preconditions.l("Result has already been consumed.", !this.zal);
            if (this.zap != null) {
                z10 = false;
            }
            Preconditions.l("Cannot set callbacks if then() has been called.", z10);
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.a(resultCallback, zaa());
            } else {
                this.zah = resultCallback;
                CallbackHandler callbackHandler = this.zab;
                callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j10));
            }
        }
    }

    @KeepForSdk
    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new CallbackHandler(googleApiClient != null ? googleApiClient.j() : Looper.getMainLooper());
        this.zac = new WeakReference(googleApiClient);
    }

    @KeepForSdk
    public BasePendingResult(CallbackHandler<R> callbackHandler) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        if (callbackHandler != null) {
            this.zab = callbackHandler;
            this.zac = new WeakReference(null);
            return;
        }
        throw new NullPointerException("CallbackHandler must not be null");
    }
}
