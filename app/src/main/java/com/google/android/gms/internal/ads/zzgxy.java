package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzgxs;
import com.google.android.gms.internal.ads.zzgxy;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgxy<MessageType extends zzgxy<MessageType, BuilderType>, BuilderType extends zzgxs<MessageType, BuilderType>> extends zzgvv<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Object, zzgxy<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhat zzt = zzhat.zzc();

    public static zzgya zzbA() {
        return zzgwc.zzd();
    }

    public static zzgya zzbB(zzgya zzgyaVar) {
        int i10;
        int size = zzgyaVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgyaVar.zze(i10);
    }

    public static zzgyb zzbC() {
        return zzgxf.zze();
    }

    public static zzgyb zzbD(zzgyb zzgybVar) {
        int i10;
        int size = zzgybVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgybVar.zzg(i10);
    }

    public static zzgyf zzbE() {
        return zzgxp.zze();
    }

    public static zzgyf zzbF(zzgyf zzgyfVar) {
        int i10;
        int size = zzgyfVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgyfVar.zzg(i10);
    }

    public static zzgyg zzbG() {
        return zzgxz.zzg();
    }

    public static zzgyg zzbH(zzgyg zzgygVar) {
        int i10;
        int size = zzgygVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgygVar.zzh(i10);
    }

    public static zzgyj zzbI() {
        return zzgyy.zzh();
    }

    public static zzgyj zzbJ(zzgyj zzgyjVar) {
        int i10;
        int size = zzgyjVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgyjVar.zze(i10);
    }

    public static <E> zzgyk<E> zzbK() {
        return zzgzu.zzd();
    }

    public static <E> zzgyk<E> zzbL(zzgyk<E> zzgykVar) {
        int i10;
        int size = zzgykVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgykVar.zzf(i10);
    }

    public static Object zzbR(Method method, Object obj, Object... objArr) {
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

    public static Object zzbS(zzgzj zzgzjVar, String str, Object[] objArr) {
        return new zzgzv(zzgzjVar, str, objArr);
    }

    public static Method zzbT(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(a0.d.d("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e10);
        }
    }

    public static <ContainingType extends zzgzj, Type> zzgxw<ContainingType, Type> zzbe(ContainingType containingtype, zzgzj zzgzjVar, zzgyd zzgydVar, int i10, zzhbf zzhbfVar, boolean z10, Class cls) {
        return new zzgxw<>(containingtype, Collections.emptyList(), zzgzjVar, new zzgxv(zzgydVar, i10, zzhbfVar, true, z10), cls);
    }

    public static <ContainingType extends zzgzj, Type> zzgxw<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzgzj zzgzjVar, zzgyd zzgydVar, int i10, zzhbf zzhbfVar, Class cls) {
        return new zzgxw<>(containingtype, type, zzgzjVar, new zzgxv(zzgydVar, i10, zzhbfVar, false, false), cls);
    }

    public static <T extends zzgxy> T zzbh(Class<T> cls) {
        zzgxy<?, ?> zzgxyVar = zzc.get(cls);
        if (zzgxyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgxyVar = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzgxyVar == null) {
            zzgxyVar = ((zzgxy) zzhaz.zzg(cls)).zzbt();
            if (zzgxyVar != null) {
                zzc.put(cls, zzgxyVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgxyVar;
    }

    public static <T extends zzgxy<T, ?>> T zzbk(T t4, InputStream inputStream) {
        int i10 = zzgxi.zzb;
        int i11 = zzgzt.zza;
        T t10 = (T) zzf(t4, inputStream, zzgxi.zza);
        zze(t10);
        return t10;
    }

    public static <T extends zzgxy<T, ?>> T zzbl(T t4, InputStream inputStream, zzgxi zzgxiVar) {
        T t10 = (T) zzf(t4, inputStream, zzgxiVar);
        zze(t10);
        return t10;
    }

    public static <T extends zzgxy<T, ?>> T zzbm(T t4, zzgwm zzgwmVar) {
        int i10 = zzgxi.zzb;
        int i11 = zzgzt.zza;
        T t10 = (T) zzbr(t4, zzgwmVar, zzgxi.zza);
        zze(t10);
        return t10;
    }

    public static <T extends zzgxy<T, ?>> T zzbn(T t4, zzgww zzgwwVar) {
        int i10 = zzgxi.zzb;
        int i11 = zzgzt.zza;
        return (T) zzbs(t4, zzgwwVar, zzgxi.zza);
    }

    public static <T extends zzgxy<T, ?>> T zzbo(T t4, InputStream inputStream) {
        zzgww zzG = zzgww.zzG(inputStream, 4096);
        int i10 = zzgxi.zzb;
        int i11 = zzgzt.zza;
        T t10 = (T) zzbz(t4, zzG, zzgxi.zza);
        zze(t10);
        return t10;
    }

    public static <T extends zzgxy<T, ?>> T zzbp(T t4, ByteBuffer byteBuffer) {
        int i10 = zzgxi.zzb;
        int i11 = zzgzt.zza;
        return (T) zzbv(t4, byteBuffer, zzgxi.zza);
    }

    public static <T extends zzgxy<T, ?>> T zzbq(T t4, byte[] bArr) {
        int length = bArr.length;
        int i10 = zzgxi.zzb;
        int i11 = zzgzt.zza;
        T t10 = (T) zzh(t4, bArr, 0, length, zzgxi.zza);
        zze(t10);
        return t10;
    }

    public static <T extends zzgxy<T, ?>> T zzbr(T t4, zzgwm zzgwmVar, zzgxi zzgxiVar) {
        T t10 = (T) zzg(t4, zzgwmVar, zzgxiVar);
        zze(t10);
        return t10;
    }

    public static <T extends zzgxy<T, ?>> T zzbs(T t4, zzgww zzgwwVar, zzgxi zzgxiVar) {
        T t10 = (T) zzbz(t4, zzgwwVar, zzgxiVar);
        zze(t10);
        return t10;
    }

    public static <T extends zzgxy<T, ?>> T zzbu(T t4, InputStream inputStream, zzgxi zzgxiVar) {
        T t10 = (T) zzbz(t4, zzgww.zzG(inputStream, 4096), zzgxiVar);
        zze(t10);
        return t10;
    }

    public static <T extends zzgxy<T, ?>> T zzbv(T t4, ByteBuffer byteBuffer, zzgxi zzgxiVar) {
        zzgww zzH;
        if (byteBuffer.hasArray()) {
            zzH = zzgww.zzH(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhaz.zzB()) {
            zzH = new zzgwu(byteBuffer, false, null);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzH = zzgww.zzH(bArr, 0, remaining, true);
        }
        T t10 = (T) zzbs(t4, zzH, zzgxiVar);
        zze(t10);
        return t10;
    }

    public static <T extends zzgxy<T, ?>> T zzbx(T t4, byte[] bArr, zzgxi zzgxiVar) {
        T t10 = (T) zzh(t4, bArr, 0, bArr.length, zzgxiVar);
        zze(t10);
        return t10;
    }

    public static <T extends zzgxy<T, ?>> T zzby(T t4, zzgww zzgwwVar) {
        int i10 = zzgxi.zzb;
        int i11 = zzgzt.zza;
        return (T) zzbz(t4, zzgwwVar, zzgxi.zza);
    }

    public static <T extends zzgxy<T, ?>> T zzbz(T t4, zzgww zzgwwVar, zzgxi zzgxiVar) {
        T t10 = (T) t4.zzbj();
        try {
            zzhae zzb2 = zzgzt.zza().zzb(t10.getClass());
            zzb2.zzh(t10, zzgwx.zzq(zzgwwVar), zzgxiVar);
            zzb2.zzf(t10);
            return t10;
        } catch (zzgyn e10) {
            if (e10.zzk()) {
                throw new zzgyn(e10);
            }
            throw e10;
        } catch (zzhar e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgyn) {
                throw ((zzgyn) e12.getCause());
            }
            throw new zzgyn(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzgyn) {
                throw ((zzgyn) e13.getCause());
            }
            throw e13;
        }
    }

    private int zzc(zzhae<?> zzhaeVar) {
        if (zzhaeVar == null) {
            return zzgzt.zza().zzb(getClass()).zza(this);
        }
        return zzhaeVar.zza(this);
    }

    public static <T extends zzgxy> void zzcb(Class<T> cls, T t4) {
        t4.zzbX();
        zzc.put(cls, t4);
    }

    public static final <T extends zzgxy<T, ?>> boolean zzce(T t4, boolean z10) {
        Object obj;
        byte byteValue = ((Byte) t4.zzbP(zzgxx.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzgzt.zza().zzb(t4.getClass()).zzl(t4);
        if (z10) {
            if (true != zzl) {
                obj = null;
            } else {
                obj = t4;
            }
            t4.zzbQ(zzgxx.SET_MEMOIZED_IS_INITIALIZED, obj);
        }
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgxu<MessageType, BuilderType>, BuilderType, T> zzgxw<MessageType, T> zzd(zzgxg<MessageType, T> zzgxgVar) {
        return (zzgxw) zzgxgVar;
    }

    private static <T extends zzgxy<T, ?>> T zze(T t4) {
        if (t4 != null && !t4.zzbw()) {
            throw t4.zzaP().zza();
        }
        return t4;
    }

    private static <T extends zzgxy<T, ?>> T zzf(T t4, InputStream inputStream, zzgxi zzgxiVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzgww zzG = zzgww.zzG(new zzgvt(inputStream, zzgww.zzE(read, inputStream)), 4096);
            T t10 = (T) zzbz(t4, zzG, zzgxiVar);
            zzG.zzy(0);
            return t10;
        } catch (zzgyn e10) {
            if (e10.zzk()) {
                throw new zzgyn(e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new zzgyn(e11);
        }
    }

    private static <T extends zzgxy<T, ?>> T zzg(T t4, zzgwm zzgwmVar, zzgxi zzgxiVar) {
        zzgww zzl = zzgwmVar.zzl();
        T t10 = (T) zzbz(t4, zzl, zzgxiVar);
        zzl.zzy(0);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgxy<T, ?>> T zzh(T t4, byte[] bArr, int i10, int i11, zzgxi zzgxiVar) {
        if (i11 == 0) {
            return t4;
        }
        T t10 = (T) t4.zzbj();
        try {
            zzhae zzb2 = zzgzt.zza().zzb(t10.getClass());
            zzb2.zzi(t10, bArr, i10, i10 + i11, new zzgwa(zzgxiVar));
            zzb2.zzf(t10);
            return t10;
        } catch (zzgyn e10) {
            if (e10.zzk()) {
                throw new zzgyn(e10);
            }
            throw e10;
        } catch (zzhar e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgyn) {
                throw ((zzgyn) e12.getCause());
            }
            throw new zzgyn(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgyn.zzi();
        }
    }

    private void zzi() {
        if (this.zzt == zzhat.zzc()) {
            this.zzt = zzhat.zzf();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgzt.zza().zzb(getClass()).zzk(this, (zzgxy) obj);
    }

    public int hashCode() {
        if (zzcf()) {
            return zzaW();
        }
        if (zzcd()) {
            zzcc(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzgzl.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public int zzaL() {
        return this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public int zzaM(zzhae zzhaeVar) {
        if (zzcf()) {
            int zzc2 = zzc(zzhaeVar);
            if (zzc2 >= 0) {
                return zzc2;
            }
            throw new IllegalStateException(b.a.c("serialized size must be non-negative, was ", zzc2));
        } else if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        } else {
            int zzc3 = zzc(zzhaeVar);
            zzaS(zzc3);
            return zzc3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public zzgzo zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public void zzaS(int i10) {
        if (i10 >= 0) {
            this.zzd = i10 | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(b.a.c("serialized size must be non-negative, was ", i10));
    }

    public int zzaW() {
        return zzgzt.zza().zzb(getClass()).zzb(this);
    }

    public int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public int zzaY() {
        return zzaM(null);
    }

    public final <MessageType extends zzgxy<MessageType, BuilderType>, BuilderType extends zzgxs<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzbP(zzgxx.NEW_BUILDER);
    }

    public final zzgzr<MessageType> zzbN() {
        return (zzgzr) zzbP(zzgxx.GET_PARSER);
    }

    public Object zzbO() {
        return zzbP(zzgxx.BUILD_MESSAGE_INFO);
    }

    public Object zzbP(zzgxx zzgxxVar) {
        return zzde(zzgxxVar, null, null);
    }

    public Object zzbQ(zzgxx zzgxxVar, Object obj) {
        return zzde(zzgxxVar, obj, null);
    }

    public void zzbU() {
        this.zzq = 0;
    }

    public void zzbV() {
        zzaS(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public void zzbW() {
        zzgzt.zza().zzb(getClass()).zzf(this);
        zzbX();
    }

    public void zzbX() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public void zzbY(int i10, zzgwm zzgwmVar) {
        zzi();
        zzhat zzhatVar = this.zzt;
        zzhatVar.zzg();
        if (i10 != 0) {
            zzhatVar.zzj((i10 << 3) | 2, zzgwmVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void zzbZ(zzhat zzhatVar) {
        this.zzt = zzhat.zze(this.zzt, zzhatVar);
    }

    public final <MessageType extends zzgxy<MessageType, BuilderType>, BuilderType extends zzgxs<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType zzaZ = zzaZ();
        zzaZ.zzbj(messagetype);
        return zzaZ;
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    /* renamed from: zzbb */
    public final BuilderType zzcZ() {
        return (BuilderType) zzbP(zzgxx.NEW_BUILDER);
    }

    /* renamed from: zzbc */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzbP(zzgxx.NEW_BUILDER);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    /* renamed from: zzbi */
    public final MessageType zzbt() {
        return (MessageType) zzbP(zzgxx.GET_DEFAULT_INSTANCE);
    }

    public MessageType zzbj() {
        return (MessageType) zzbP(zzgxx.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final boolean zzbw() {
        return zzce(this, true);
    }

    public void zzca(int i10, int i11) {
        zzi();
        zzhat zzhatVar = this.zzt;
        zzhatVar.zzg();
        if (i10 != 0) {
            zzhatVar.zzj(i10 << 3, Long.valueOf(i11));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public void zzcc(int i10) {
        this.zzq = i10;
    }

    public boolean zzcd() {
        if (zzaX() == 0) {
            return true;
        }
        return false;
    }

    public boolean zzcf() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public boolean zzcg(int i10, zzgww zzgwwVar) {
        if ((i10 & 7) == 4) {
            return false;
        }
        zzi();
        return this.zzt.zzm(i10, zzgwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzj
    public void zzda(zzgxd zzgxdVar) {
        zzgzt.zza().zzb(getClass()).zzj(this, zzgxe.zza(zzgxdVar));
    }

    public abstract Object zzde(zzgxx zzgxxVar, Object obj, Object obj2);
}
