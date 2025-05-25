package com.google.android.gms.internal.play_billing;

import b.a;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.play_billing.zzcn;
import com.google.android.gms.internal.play_billing.zzcs;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public abstract class zzcs<MessageType extends zzcs<MessageType, BuilderType>, BuilderType extends zzcn<MessageType, BuilderType>> extends zzay<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzfg zzc = zzfg.zzc();

    public static zzcs zzj(Class cls) {
        Map map = zzb;
        zzcs zzcsVar = (zzcs) map.get(cls);
        if (zzcsVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzcsVar = (zzcs) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzcsVar == null) {
            zzcsVar = (zzcs) ((zzcs) zzfp.zze(cls)).zzx(6, null, null);
            if (zzcsVar != null) {
                map.put(cls, zzcsVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzcsVar;
    }

    public static zzcs zzm(zzcs zzcsVar, byte[] bArr, zzcd zzcdVar) {
        zzcs zzz = zzz(zzcsVar, bArr, 0, bArr.length, zzcdVar);
        if (zzz != null && !zzz.zzk()) {
            zzdc zza = new zzfe(zzz).zza();
            zza.zzf(zzz);
            throw zza;
        }
        return zzz;
    }

    public static zzcx zzn() {
        return zzct.zzf();
    }

    public static zzcz zzo() {
        return zzem.zze();
    }

    public static Object zzp(Method method, Object obj, Object... objArr) {
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

    public static Object zzq(zzec zzecVar, String str, Object[] objArr) {
        return new zzen(zzecVar, str, objArr);
    }

    public static void zzt(Class cls, zzcs zzcsVar) {
        zzcsVar.zzs();
        zzb.put(cls, zzcsVar);
    }

    public static final boolean zzv(zzcs zzcsVar, boolean z10) {
        Object obj;
        byte byteValue = ((Byte) zzcsVar.zzx(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzel.zza().zzb(zzcsVar.getClass()).zzk(zzcsVar);
        if (z10) {
            if (true != zzk) {
                obj = null;
            } else {
                obj = zzcsVar;
            }
            zzcsVar.zzx(2, obj, null);
        }
        return zzk;
    }

    private final int zzy(zzeo zzeoVar) {
        return zzel.zza().zzb(getClass()).zza(this);
    }

    private static zzcs zzz(zzcs zzcsVar, byte[] bArr, int i10, int i11, zzcd zzcdVar) {
        if (i11 == 0) {
            return zzcsVar;
        }
        zzcs zzl = zzcsVar.zzl();
        try {
            zzeo zzb2 = zzel.zza().zzb(zzl.getClass());
            zzb2.zzh(zzl, bArr, 0, i11, new zzbc(zzcdVar));
            zzb2.zzf(zzl);
            return zzl;
        } catch (zzdc e10) {
            e10.zzf(zzl);
            throw e10;
        } catch (zzfe e11) {
            zzdc zza = e11.zza();
            zza.zzf(zzl);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzdc) {
                throw ((zzdc) e12.getCause());
            }
            zzdc zzdcVar = new zzdc(e12);
            zzdcVar.zzf(zzl);
            throw zzdcVar;
        } catch (IndexOutOfBoundsException unused) {
            zzdc zzg = zzdc.zzg();
            zzg.zzf(zzl);
            throw zzg;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzel.zza().zzb(getClass()).zzj(this, (zzcs) obj);
    }

    public final int hashCode() {
        if (!zzw()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int zzd = zzd();
                this.zza = zzd;
                return zzd;
            }
            return i10;
        }
        return zzd();
    }

    public final String toString() {
        return zzee.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final /* synthetic */ zzeb zzE() {
        return (zzcn) zzx(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final /* synthetic */ zzeb zzF() {
        zzcn zzcnVar = (zzcn) zzx(5, null, null);
        zzcnVar.zzc(this);
        return zzcnVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzay
    public final int zza(zzeo zzeoVar) {
        if (zzw()) {
            int zza = zzeoVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(a.c("serialized size must be non-negative, was ", zza));
        }
        int i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 == Integer.MAX_VALUE) {
            int zza2 = zzeoVar.zza(this);
            if (zza2 >= 0) {
                this.zzd = (this.zzd & SlideAtom.USES_MASTER_SLIDE_ID) | zza2;
                return zza2;
            }
            throw new IllegalStateException(a.c("serialized size must be non-negative, was ", zza2));
        }
        return i10;
    }

    final int zzd() {
        return zzel.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final void zze(zzby zzbyVar) {
        zzel.zza().zzb(getClass()).zzi(this, zzbz.zza(zzbyVar));
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final int zzf() {
        int i10;
        if (zzw()) {
            i10 = zzy(null);
            if (i10 < 0) {
                throw new IllegalStateException(a.c("serialized size must be non-negative, was ", i10));
            }
        } else {
            i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zzy(null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & SlideAtom.USES_MASTER_SLIDE_ID) | i10;
                } else {
                    throw new IllegalStateException(a.c("serialized size must be non-negative, was ", i10));
                }
            }
        }
        return i10;
    }

    public final zzcn zzg() {
        return (zzcn) zzx(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final /* synthetic */ zzec zzh() {
        return (zzcs) zzx(6, null, null);
    }

    public final zzcn zzi() {
        zzcn zzcnVar = (zzcn) zzx(5, null, null);
        zzcnVar.zzc(this);
        return zzcnVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final boolean zzk() {
        return zzv(this, true);
    }

    public final zzcs zzl() {
        return (zzcs) zzx(4, null, null);
    }

    public final void zzr() {
        zzel.zza().zzb(getClass()).zzf(this);
        zzs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final void zzu(int i10) {
        this.zzd = (this.zzd & SlideAtom.USES_MASTER_SLIDE_ID) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzw() {
        if ((this.zzd & SlideAtom.USES_MASTER_SLIDE_ID) != 0) {
            return true;
        }
        return false;
    }

    public abstract Object zzx(int i10, Object obj, Object obj2);
}
