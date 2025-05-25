package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zach;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.api.internal.zag;
import com.google.android.gms.common.api.internal.zah;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collection;
import java.util.Collections;
import y.d;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    protected final GoogleApiManager zaa;
    private final Context zab;
    private final String zac;
    private final Api zad;
    private final Api.ApiOptions zae;
    private final ApiKey zaf;
    private final Looper zag;
    private final int zah;
    private final GoogleApiClient zai;
    private final StatusExceptionMapper zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Settings {
        @KeepForSdk
        public static final Settings c = new Builder().a();

        /* renamed from: a  reason: collision with root package name */
        public final StatusExceptionMapper f10900a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f10901b;

        /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
        @KeepForSdk
        /* loaded from: classes.dex */
        public static class Builder {

            /* renamed from: a  reason: collision with root package name */
            public StatusExceptionMapper f10902a;

            /* renamed from: b  reason: collision with root package name */
            public Looper f10903b;

            @KeepForSdk
            public final Settings a() {
                if (this.f10902a == null) {
                    this.f10902a = new ApiExceptionMapper();
                }
                if (this.f10903b == null) {
                    this.f10903b = Looper.getMainLooper();
                }
                return new Settings(this.f10902a, this.f10903b);
            }
        }

        public Settings(StatusExceptionMapper statusExceptionMapper, Looper looper) {
            this.f10900a = statusExceptionMapper;
            this.f10901b = looper;
        }
    }

    @KeepForSdk
    public GoogleApi(Activity activity, Api<O> api, O o10, Settings settings) {
        this(activity, activity, api, o10, settings);
    }

    private final BaseImplementation.ApiMethodImpl zad(int i10, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.getClass();
        zach zachVar = new zach(new com.google.android.gms.common.api.internal.zae(i10, apiMethodImpl), googleApiManager.f10947i.get(), this);
        zau zauVar = googleApiManager.f10952n;
        zauVar.sendMessage(zauVar.obtainMessage(4, zachVar));
        return apiMethodImpl;
    }

    private final Task zae(int i10, TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        StatusExceptionMapper statusExceptionMapper = this.zaj;
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.getClass();
        googleApiManager.f(taskCompletionSource, taskApiCall.c, this);
        zach zachVar = new zach(new zag(i10, taskApiCall, taskCompletionSource, statusExceptionMapper), googleApiManager.f10947i.get(), this);
        zau zauVar = googleApiManager.f10952n;
        zauVar.sendMessage(zauVar.obtainMessage(4, zachVar));
        return taskCompletionSource.f11978a;
    }

    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    @KeepForSdk
    public ClientSettings.Builder createClientSettingsBuilder() {
        Account b10;
        Collection emptySet;
        GoogleSignInAccount a10;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.zae;
        if ((apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) && (a10 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).a()) != null) {
            String str = a10.f10803d;
            if (str != null) {
                b10 = new Account(str, "com.google");
            }
            b10 = null;
        } else {
            Api.ApiOptions apiOptions2 = this.zae;
            if (apiOptions2 instanceof Api.ApiOptions.HasAccountOptions) {
                b10 = ((Api.ApiOptions.HasAccountOptions) apiOptions2).b();
            }
            b10 = null;
        }
        builder.f11189a = b10;
        Api.ApiOptions apiOptions3 = this.zae;
        if (apiOptions3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) {
            GoogleSignInAccount a11 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions3).a();
            if (a11 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = a11.d();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        if (builder.f11190b == null) {
            builder.f11190b = new d();
        }
        builder.f11190b.addAll(emptySet);
        builder.f11191d = this.zab.getClass().getName();
        builder.c = this.zab.getPackageName();
        return builder;
    }

    @KeepForSdk
    public Task<Boolean> disconnectService() {
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.getClass();
        com.google.android.gms.common.api.internal.d dVar = new com.google.android.gms.common.api.internal.d(getApiKey());
        zau zauVar = googleApiManager.f10952n;
        zauVar.sendMessage(zauVar.obtainMessage(14, dVar));
        return dVar.f10996b.f11978a;
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(T t4) {
        zad(2, t4);
        return t4;
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(T t4) {
        zad(0, t4);
        return t4;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(T t4, U u7) {
        Preconditions.j(t4);
        Preconditions.j(u7);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(T t4) {
        zad(1, t4);
        return t4;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    public final ApiKey<O> getApiKey() {
        return this.zaf;
    }

    @KeepForSdk
    public O getApiOptions() {
        return (O) this.zae;
    }

    @KeepForSdk
    public Context getApplicationContext() {
        return this.zab;
    }

    @KeepForSdk
    public String getContextAttributionTag() {
        return this.zac;
    }

    @KeepForSdk
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @KeepForSdk
    public Looper getLooper() {
        return this.zag;
    }

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(L l10, String str) {
        return ListenerHolders.a(this.zag, l10, str);
    }

    public final int zaa() {
        return this.zah;
    }

    public final Api.Client zab(Looper looper, zabq zabqVar) {
        ClientSettings.Builder createClientSettingsBuilder = createClientSettingsBuilder();
        ClientSettings clientSettings = new ClientSettings(createClientSettingsBuilder.f11189a, createClientSettingsBuilder.f11190b, null, createClientSettingsBuilder.c, createClientSettingsBuilder.f11191d, createClientSettingsBuilder.f11192e);
        Api.AbstractClientBuilder abstractClientBuilder = this.zad.f10897a;
        Preconditions.j(abstractClientBuilder);
        Api.Client buildClient = abstractClientBuilder.buildClient(this.zab, looper, clientSettings, (ClientSettings) this.zae, (GoogleApiClient.ConnectionCallbacks) zabqVar, (GoogleApiClient.OnConnectionFailedListener) zabqVar);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) buildClient).getClass();
        }
        return buildClient;
    }

    public final zact zac(Context context, Handler handler) {
        ClientSettings.Builder createClientSettingsBuilder = createClientSettingsBuilder();
        return new zact(context, handler, new ClientSettings(createClientSettingsBuilder.f11189a, createClientSettingsBuilder.f11190b, null, createClientSettingsBuilder.c, createClientSettingsBuilder.f11191d, createClientSettingsBuilder.f11192e));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GoogleApi(android.app.Activity r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            if (r5 == 0) goto L21
            r0.f10902a = r5
            android.os.Looper r5 = r2.getMainLooper()
            if (r5 == 0) goto L19
            r0.f10903b = r5
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        L19:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Looper must not be null."
            r2.<init>(r3)
            throw r2
        L21:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "StatusExceptionMapper must not be null."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.app.Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey, int i10) {
        if (listenerKey != null) {
            GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            googleApiManager.f(taskCompletionSource, i10, this);
            zach zachVar = new zach(new zah(listenerKey, taskCompletionSource), googleApiManager.f10947i.get(), this);
            zau zauVar = googleApiManager.f10952n;
            zauVar.sendMessage(zauVar.obtainMessage(13, zachVar));
            return taskCompletionSource.f11978a;
        }
        throw new NullPointerException("Listener key cannot be null.");
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.j(registrationMethods);
        throw null;
    }

    private GoogleApi(Context context, Activity activity, Api api, Api.ApiOptions apiOptions, Settings settings) {
        String apiFallbackAttributionTag;
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (api == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (settings != null) {
            Context applicationContext = context.getApplicationContext();
            Preconditions.k(applicationContext, "The provided context did not have an application context.");
            this.zab = applicationContext;
            if (Build.VERSION.SDK_INT >= 30) {
                apiFallbackAttributionTag = context.getAttributionTag();
            } else {
                apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
            }
            this.zac = apiFallbackAttributionTag;
            this.zad = api;
            this.zae = apiOptions;
            this.zag = settings.f10901b;
            ApiKey apiKey = new ApiKey(api, apiOptions, apiFallbackAttributionTag);
            this.zaf = apiKey;
            this.zai = new zabv(this);
            GoogleApiManager g10 = GoogleApiManager.g(applicationContext);
            this.zaa = g10;
            this.zah = g10.f10946h.getAndIncrement();
            this.zaj = settings.f10900a;
            if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                LifecycleFragment c = LifecycleCallback.c(new LifecycleActivity(activity));
                zaae zaaeVar = (zaae) c.h(zaae.class, "ConnectionlessLifecycleHelper");
                zaaeVar = zaaeVar == null ? new zaae(c, g10, GoogleApiAvailability.f10882d) : zaaeVar;
                zaaeVar.f11047f.add(apiKey);
                g10.a(zaaeVar);
            }
            zau zauVar = g10.f10952n;
            zauVar.sendMessage(zauVar.obtainMessage(7, this));
            return;
        }
        throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, android.os.Looper r5, com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            if (r5 == 0) goto L1d
            r0.f10903b = r5
            if (r6 == 0) goto L15
            r0.f10902a = r6
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        L15:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "StatusExceptionMapper must not be null."
            r2.<init>(r3)
            throw r2
        L1d:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Looper must not be null."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, android.os.Looper, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    @KeepForSdk
    public GoogleApi(Context context, Api<O> api, O o10, Settings settings) {
        this(context, (Activity) null, api, o10, settings);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GoogleApi(android.content.Context r2, com.google.android.gms.common.api.Api<O> r3, O r4, com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            if (r5 == 0) goto L11
            r0.f10902a = r5
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        L11:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "StatusExceptionMapper must not be null."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }
}
