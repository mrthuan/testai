package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvu;
import com.google.android.gms.internal.ads.zzgvv;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgvu<MessageType extends zzgvv<MessageType, BuilderType>, BuilderType extends zzgvu<MessageType, BuilderType>> implements zzgzi {
    private String zza(String str) {
        return a0.d.d("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size = list.size();
        for (T t4 : iterable) {
            if (t4 == null) {
                String g10 = a0.a.g("Element at index ", list.size() - size, " is null.");
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    list.remove(size2);
                }
                throw new NullPointerException(g10);
            }
            list.add(t4);
        }
    }

    public static zzhar zzbb(zzgzj zzgzjVar) {
        return new zzhar(zzgzjVar);
    }

    @Deprecated
    public static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    public static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgyl.zzb;
        iterable.getClass();
        if (iterable instanceof zzgyv) {
            List zza = ((zzgyv) iterable).zza();
            zzgyv zzgyvVar = (zzgyv) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    String g10 = a0.a.g("Element at index ", zzgyvVar.size() - size, " is null.");
                    int size2 = zzgyvVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        zzgyvVar.remove(size2);
                    }
                    throw new NullPointerException(g10);
                } else if (obj instanceof zzgwm) {
                    zzgwm zzgwmVar = (zzgwm) obj;
                    zzgyvVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    zzgwm.zzv(bArr2, 0, bArr2.length);
                    zzgyvVar.zzb();
                } else {
                    zzgyvVar.add((String) obj);
                }
            }
        } else if (iterable instanceof zzgzs) {
            list.addAll((Collection) iterable);
        } else {
            zzb(iterable, list);
        }
    }

    @Override // 
    /* renamed from: zzaC */
    public abstract BuilderType zzaP();

    public abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgwm zzgwmVar) {
        try {
            zzgww zzl = zzgwmVar.zzl();
            zzaR(zzl);
            zzl.zzy(0);
            return this;
        } catch (zzgyn e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("ByteString"), e11);
        }
    }

    /* renamed from: zzaF */
    public BuilderType zzaR(zzgww zzgwwVar) {
        int i10 = zzgxi.zzb;
        int i11 = zzgzt.zza;
        return zzaW(zzgwwVar, zzgxi.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaG */
    public BuilderType zzaS(zzgzj zzgzjVar) {
        if (zzbt().getClass().isInstance(zzgzjVar)) {
            return (BuilderType) zzaD((zzgvv) zzgzjVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) {
        zzgww zzG = zzgww.zzG(inputStream, 4096);
        zzaR(zzG);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaI */
    public BuilderType zzaU(byte[] bArr) {
        return zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        try {
            zzgww zzl = zzgwmVar.zzl();
            zzaW(zzl, zzgxiVar);
            zzl.zzy(0);
            return this;
        } catch (zzgyn e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("ByteString"), e11);
        }
    }

    @Override // 
    /* renamed from: zzaK */
    public abstract BuilderType zzaW(zzgww zzgwwVar, zzgxi zzgxiVar);

    public BuilderType zzaL(InputStream inputStream, zzgxi zzgxiVar) {
        zzgww zzG = zzgww.zzG(inputStream, 4096);
        zzaW(zzG, zzgxiVar);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaM */
    public BuilderType zzaY(byte[] bArr, zzgxi zzgxiVar) {
        return zzba(bArr, 0, bArr.length, zzgxiVar);
    }

    @Override // 
    /* renamed from: zzaN */
    public BuilderType zzaZ(byte[] bArr, int i10, int i11) {
        try {
            zzgww zzH = zzgww.zzH(bArr, i10, i11, false);
            zzaR(zzH);
            zzH.zzy(0);
            return this;
        } catch (zzgyn e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    @Override // 
    /* renamed from: zzaO */
    public BuilderType zzba(byte[] bArr, int i10, int i11, zzgxi zzgxiVar) {
        try {
            zzgww zzH = zzgww.zzH(bArr, i10, i11, false);
            zzaW(zzH, zzgxiVar);
            zzH.zzy(0);
            return this;
        } catch (zzgyn e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    public /* bridge */ /* synthetic */ zzgzi zzaQ(zzgwm zzgwmVar) {
        zzaE(zzgwmVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzi zzaT(InputStream inputStream) {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzi zzaV(zzgwm zzgwmVar, zzgxi zzgxiVar) {
        zzaJ(zzgwmVar, zzgxiVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzi zzaX(InputStream inputStream, zzgxi zzgxiVar) {
        zzaL(inputStream, zzgxiVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) {
        int i10 = zzgxi.zzb;
        int i11 = zzgzt.zza;
        return zzbf(inputStream, zzgxi.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgxi zzgxiVar) {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaL(new zzgvt(inputStream, zzgww.zzE(read, inputStream)), zzgxiVar);
        return true;
    }
}
