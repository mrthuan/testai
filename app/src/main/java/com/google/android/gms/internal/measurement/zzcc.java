package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public interface zzcc extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(zzcf zzcfVar);

    void getAppInstanceId(zzcf zzcfVar);

    void getCachedAppInstanceId(zzcf zzcfVar);

    void getConditionalUserProperties(String str, String str2, zzcf zzcfVar);

    void getCurrentScreenClass(zzcf zzcfVar);

    void getCurrentScreenName(zzcf zzcfVar);

    void getGmpAppId(zzcf zzcfVar);

    void getMaxUserProperties(String str, zzcf zzcfVar);

    void getSessionId(zzcf zzcfVar);

    void getTestFlag(zzcf zzcfVar, int i10);

    void getUserProperties(String str, String str2, boolean z10, zzcf zzcfVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzcl zzclVar, long j10);

    void isDataCollectionEnabled(zzcf zzcfVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j10);

    void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j10);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j10);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcfVar, long j10);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j10);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j10);

    void performAction(Bundle bundle, zzcf zzcfVar, long j10);

    void registerOnMeasurementEventListener(zzci zzciVar);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzci zzciVar);

    void setInstanceIdProvider(zzck zzckVar);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(zzci zzciVar);
}
