package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import c6.f;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.appevents.AppEvent;
import com.facebook.d;
import com.facebook.internal.c;
import com.facebook.internal.p;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import o6.a;

/* compiled from: RemoteServiceWrapper.kt */
/* loaded from: classes.dex */
public final class RemoteServiceWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final RemoteServiceWrapper f9645a = new RemoteServiceWrapper();

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f9646b;

    /* compiled from: RemoteServiceWrapper.kt */
    /* loaded from: classes.dex */
    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        
        private final String eventType;

        EventType(String str) {
            this.eventType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.eventType;
        }
    }

    /* compiled from: RemoteServiceWrapper.kt */
    /* loaded from: classes.dex */
    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    /* compiled from: RemoteServiceWrapper.kt */
    /* loaded from: classes.dex */
    public static final class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f9649a = new CountDownLatch(1);

        /* renamed from: b  reason: collision with root package name */
        public IBinder f9650b;

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName name) {
            g.e(name, "name");
            this.f9649a.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            g.e(name, "name");
            g.e(serviceBinder, "serviceBinder");
            this.f9650b = serviceBinder;
            this.f9649a.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName name) {
            g.e(name, "name");
        }
    }

    public final Intent a(Context context) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage(FbValidationUtils.FB_PACKAGE);
                if (packageManager.resolveService(intent, 0) != null && c.a(context, FbValidationUtils.FB_PACKAGE)) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage(FbValidationUtils.DEBUG_FB_PACKAGE);
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (c.a(context, FbValidationUtils.DEBUG_FB_PACKAGE)) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final ServiceResult b(EventType eventType, String str, List<AppEvent> list) {
        ServiceResult serviceResult;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            ServiceResult serviceResult2 = ServiceResult.SERVICE_NOT_AVAILABLE;
            int i10 = f.f5607a;
            Context a10 = d.a();
            Intent a11 = a(a10);
            if (a11 != null) {
                a aVar = new a();
                if (a10.bindService(a11, aVar, 1)) {
                    try {
                        aVar.f9649a.await(5L, TimeUnit.SECONDS);
                        IBinder iBinder = aVar.f9650b;
                        if (iBinder != null) {
                            o6.a K = a.AbstractBinderC0303a.K(iBinder);
                            Bundle a12 = b.a(eventType, str, list);
                            if (a12 != null) {
                                K.h(a12);
                                a12.toString();
                                p pVar = p.f9815a;
                            }
                            serviceResult2 = ServiceResult.OPERATION_SUCCESS;
                        }
                        a10.unbindService(aVar);
                        p pVar2 = p.f9815a;
                        return serviceResult2;
                    } catch (RemoteException unused) {
                        serviceResult = ServiceResult.SERVICE_ERROR;
                        p pVar3 = p.f9815a;
                        d dVar = d.f9685a;
                        ServiceResult serviceResult3 = serviceResult;
                        a10.unbindService(aVar);
                        return serviceResult3;
                    } catch (InterruptedException unused2) {
                        serviceResult = ServiceResult.SERVICE_ERROR;
                        p pVar4 = p.f9815a;
                        d dVar2 = d.f9685a;
                        ServiceResult serviceResult32 = serviceResult;
                        a10.unbindService(aVar);
                        return serviceResult32;
                    }
                }
                return ServiceResult.SERVICE_ERROR;
            }
            return serviceResult2;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}
