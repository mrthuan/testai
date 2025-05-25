package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class RemoteCreator<T> {
    private final String zza;
    private Object zzb;

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(String str) {
            super(str);
        }

        @KeepForSdk
        public RemoteCreatorException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    @KeepForSdk
    public RemoteCreator(String str) {
        this.zza = str;
    }

    @KeepForSdk
    public abstract T getRemoteCreator(IBinder iBinder);

    @KeepForSdk
    public final T getRemoteCreatorInstance(Context context) {
        Context context2;
        if (this.zzb == null) {
            Preconditions.j(context);
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f10886a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 != null) {
                try {
                    this.zzb = getRemoteCreator((IBinder) context2.getClassLoader().loadClass(this.zza).newInstance());
                } catch (ClassNotFoundException e10) {
                    throw new RemoteCreatorException("Could not load creator class.", e10);
                } catch (IllegalAccessException e11) {
                    throw new RemoteCreatorException("Could not access creator.", e11);
                } catch (InstantiationException e12) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e12);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return (T) this.zzb;
    }
}
