package com.google.android.gms.internal.measurement;

import b.a;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class zzlb<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjk<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zznl zzc = zznl.zzc();

    private final int zza(zzmt zzmtVar) {
        if (zzmtVar == null) {
            return zzmq.zza().zzb(getClass()).zza(this);
        }
        return zzmtVar.zza(this);
    }

    public static zzlb zzbC(Class cls) {
        Map map = zza;
        zzlb zzlbVar = (zzlb) map.get(cls);
        if (zzlbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzlbVar = (zzlb) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzlbVar == null) {
            zzlbVar = (zzlb) ((zzlb) zznu.zze(cls)).zzl(6, null, null);
            if (zzlbVar != null) {
                map.put(cls, zzlbVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzlbVar;
    }

    public static zzlg zzbE() {
        return zzlc.zzf();
    }

    public static zzlh zzbF() {
        return zzlx.zzf();
    }

    public static zzlh zzbG(zzlh zzlhVar) {
        int i10;
        int size = zzlhVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzlhVar.zze(i10);
    }

    public static zzli zzbH() {
        return zzmr.zze();
    }

    public static zzli zzbI(zzli zzliVar) {
        int i10;
        int size = zzliVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzliVar.zzd(i10);
    }

    public static Object zzbK(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zzbL(zzmi zzmiVar, String str, Object[] objArr) {
        return new zzms(zzmiVar, str, objArr);
    }

    public static void zzbO(Class cls, zzlb zzlbVar) {
        zzlbVar.zzbN();
        zza.put(cls, zzlbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzmq.zza().zzb(getClass()).zzj(this, (zzlb) obj);
    }

    public final int hashCode() {
        if (!zzbR()) {
            int i10 = this.zzb;
            if (i10 == 0) {
                int zzby = zzby();
                this.zzb = zzby;
                return zzby;
            }
            return i10;
        }
        return zzby();
    }

    public final String toString() {
        return zzmk.zza(this, super.toString());
    }

    public final zzkx zzbA() {
        return (zzkx) zzl(5, null, null);
    }

    public final zzkx zzbB() {
        zzkx zzkxVar = (zzkx) zzl(5, null, null);
        zzkxVar.zzaB(this);
        return zzkxVar;
    }

    public final zzlb zzbD() {
        return (zzlb) zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ zzmh zzbJ() {
        return (zzkx) zzl(5, null, null);
    }

    public final void zzbM() {
        zzmq.zza().zzb(getClass()).zzf(this);
        zzbN();
    }

    public final void zzbN() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final void zzbP(int i10) {
        this.zzd = (this.zzd & SlideAtom.USES_MASTER_SLIDE_ID) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void zzbQ(zzki zzkiVar) {
        zzmq.zza().zzb(getClass()).zzi(this, zzkj.zza(zzkiVar));
    }

    public final boolean zzbR() {
        if ((this.zzd & SlideAtom.USES_MASTER_SLIDE_ID) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* synthetic */ zzmi zzbV() {
        return (zzlb) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzjk
    public final int zzbu(zzmt zzmtVar) {
        if (zzbR()) {
            int zza2 = zza(zzmtVar);
            if (zza2 >= 0) {
                return zza2;
            }
            throw new IllegalStateException(a.c("serialized size must be non-negative, was ", zza2));
        }
        int i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza3 = zza(zzmtVar);
        if (zza3 >= 0) {
            this.zzd = (this.zzd & SlideAtom.USES_MASTER_SLIDE_ID) | zza3;
            return zza3;
        }
        throw new IllegalStateException(a.c("serialized size must be non-negative, was ", zza3));
    }

    public final int zzby() {
        return zzmq.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final int zzbz() {
        int i10;
        if (zzbR()) {
            i10 = zza(null);
            if (i10 < 0) {
                throw new IllegalStateException(a.c("serialized size must be non-negative, was ", i10));
            }
        } else {
            i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zza(null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & SlideAtom.USES_MASTER_SLIDE_ID) | i10;
                } else {
                    throw new IllegalStateException(a.c("serialized size must be non-negative, was ", i10));
                }
            }
        }
        return i10;
    }

    public abstract Object zzl(int i10, Object obj, Object obj2);
}
