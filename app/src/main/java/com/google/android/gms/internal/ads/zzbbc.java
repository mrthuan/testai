package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hpsf.Variant;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbbc {

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* renamed from: com.google.android.gms.internal.ads.zzbbc$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zza;

        static {
            int[] iArr = new int[zzgxx.values().length];
            zza = iArr;
            try {
                iArr[zzgxx.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza[zzgxx.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zza[zzgxx.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zza[zzgxx.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zza[zzgxx.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zza[zzgxx.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zza[zzgxx.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zza extends zzgxy<zza, zzb> implements zzf {
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        public static final int zzk = 17;
        private static final zza zzl;
        private static volatile zzgzr<zza> zzm;
        private zzx zzA;
        private zzz zzB;
        private int zzn;
        private int zzo;
        private zzg zzu;
        private zzi zzv;
        private zzk zzx;
        private zzah zzy;
        private zzac zzz;
        private int zzp = 1000;
        private zzgyk<zzd> zzw = zzgxy.zzbK();
        private zzgyk<zzat> zzC = zzgxy.zzbK();

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbbc$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0157zza implements zzgyc {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10),
            REWARDED_INTERSTITIAL(11);
            
            public static final int zzm = 0;
            public static final int zzn = 1;
            public static final int zzo = 2;
            public static final int zzp = 3;
            public static final int zzq = 4;
            public static final int zzr = 5;
            public static final int zzs = 6;
            public static final int zzt = 7;
            public static final int zzu = 8;
            public static final int zzv = 9;
            public static final int zzw = 10;
            public static final int zzx = 11;
            private static final zzgyd<EnumC0157zza> zzy = new zzgyd<EnumC0157zza>() { // from class: com.google.android.gms.internal.ads.zzbbc.zza.zza.1
                /* renamed from: zza */
                public EnumC0157zza zzb(int i10) {
                    return EnumC0157zza.zzb(i10);
                }
            };
            private final int zzA;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbbc$zza$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0158zza implements zzgye {
                static final zzgye zza = new C0158zza();

                private C0158zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgye
                public boolean zza(int i10) {
                    if (EnumC0157zza.zzb(i10) != null) {
                        return true;
                    }
                    return false;
                }
            }

            EnumC0157zza(int i10) {
                this.zzA = i10;
            }

            public static EnumC0157zza zzb(int i10) {
                switch (i10) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    case 11:
                        return REWARDED_INTERSTITIAL;
                    default:
                        return null;
                }
            }

            public static zzgyd<EnumC0157zza> zzd() {
                return zzy;
            }

            public static zzgye zze() {
                return C0158zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgyc
            public final int zza() {
                return this.zzA;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zzb extends zzgxs<zza, zzb> implements zzf {
            private zzb() {
                super(zza.zzl);
            }

            public zzb zzA(zzac zzacVar) {
                zzbu();
                ((zza) this.zza).zzcv(zzacVar);
                return this;
            }

            public zzb zzB(zzg zzgVar) {
                zzbu();
                ((zza) this.zza).zzcw(zzgVar);
                return this;
            }

            public zzb zzC(zzi zziVar) {
                zzbu();
                ((zza) this.zza).zzcx(zziVar);
                return this;
            }

            public zzb zzD(zzah zzahVar) {
                zzbu();
                ((zza) this.zza).zzcy(zzahVar);
                return this;
            }

            public zzb zzE(zzk zzkVar) {
                zzbu();
                ((zza) this.zza).zzcz(zzkVar);
                return this;
            }

            public zzb zzF(int i10) {
                zzbu();
                ((zza) this.zza).zzcA(i10);
                return this;
            }

            public zzb zzG(int i10) {
                zzbu();
                ((zza) this.zza).zzcB(i10);
                return this;
            }

            public zzb zzH(EnumC0157zza enumC0157zza) {
                zzbu();
                ((zza) this.zza).zzcC(enumC0157zza);
                return this;
            }

            public zzb zzI(zzx.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcD(zzaVar.zzbr());
                return this;
            }

            public zzb zzJ(zzx zzxVar) {
                zzbu();
                ((zza) this.zza).zzcD(zzxVar);
                return this;
            }

            public zzb zzK(zzq zzqVar) {
                zzbu();
                ((zza) this.zza).zzcE(zzqVar);
                return this;
            }

            public zzb zzL(zzz.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zzb zzM(zzz zzzVar) {
                zzbu();
                ((zza) this.zza).zzcF(zzzVar);
                return this;
            }

            public zzb zzN(zzac.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcG(zzaVar.zzbr());
                return this;
            }

            public zzb zzO(zzac zzacVar) {
                zzbu();
                ((zza) this.zza).zzcG(zzacVar);
                return this;
            }

            public zzb zzP(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzcH(i10, zzbVar.zzbr());
                return this;
            }

            public zzb zzQ(int i10, zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzcH(i10, zzdVar);
                return this;
            }

            public zzb zzR(zzg.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcI(zzaVar.zzbr());
                return this;
            }

            public zzb zzS(zzg zzgVar) {
                zzbu();
                ((zza) this.zza).zzcI(zzgVar);
                return this;
            }

            public zzb zzT(zzi.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zzb zzU(zzi zziVar) {
                zzbu();
                ((zza) this.zza).zzcJ(zziVar);
                return this;
            }

            public zzb zzV(zzah.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcK(zzaVar.zzbr());
                return this;
            }

            public zzb zzW(zzah zzahVar) {
                zzbu();
                ((zza) this.zza).zzcK(zzahVar);
                return this;
            }

            public zzb zzX(zzk.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcL(zzaVar.zzbr());
                return this;
            }

            public zzb zzY(zzk zzkVar) {
                zzbu();
                ((zza) this.zza).zzcL(zzkVar);
                return this;
            }

            public zzb zzZ(int i10, zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcM(i10, zzaVar.zzbr());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public int zza() {
                return ((zza) this.zza).zza();
            }

            public zzb zzaa(int i10, zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzcM(i10, zzatVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public zzd zzab(int i10) {
                return ((zza) this.zza).zzab(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public zzg zzac() {
                return ((zza) this.zza).zzac();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public zzi zzad() {
                return ((zza) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public zzk zzae() {
                return ((zza) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public zzq zzaf() {
                return ((zza) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public zzx zzag() {
                return ((zza) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public zzz zzah() {
                return ((zza) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public zzac zzai() {
                return ((zza) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public zzah zzaj() {
                return ((zza) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public zzat zzak(int i10) {
                return ((zza) this.zza).zzak(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public List<zzd> zzal() {
                return Collections.unmodifiableList(((zza) this.zza).zzal());
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public List<zzat> zzam() {
                return Collections.unmodifiableList(((zza) this.zza).zzam());
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public boolean zzan() {
                return ((zza) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public boolean zzao() {
                return ((zza) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public boolean zzap() {
                return ((zza) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public boolean zzaq() {
                return ((zza) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public boolean zzar() {
                return ((zza) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public boolean zzas() {
                return ((zza) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public boolean zzat() {
                return ((zza) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public boolean zzau() {
                return ((zza) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public boolean zzav() {
                return ((zza) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public int zzb() {
                return ((zza) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzf
            public EnumC0157zza zzc() {
                return ((zza) this.zza).zzc();
            }

            public zzb zzd(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zza) this.zza).zzaE(iterable);
                return this;
            }

            public zzb zze(Iterable<? extends zzat> iterable) {
                zzbu();
                ((zza) this.zza).zzaF(iterable);
                return this;
            }

            public zzb zzf(zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzaG(zzbVar.zzbr());
                return this;
            }

            public zzb zzg(zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzaG(zzdVar);
                return this;
            }

            public zzb zzh(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzaH(i10, zzbVar.zzbr());
                return this;
            }

            public zzb zzi(int i10, zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzaH(i10, zzdVar);
                return this;
            }

            public zzb zzj(zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzaI(zzaVar.zzbr());
                return this;
            }

            public zzb zzk(zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzaI(zzatVar);
                return this;
            }

            public zzb zzl(int i10, zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzaJ(i10, zzaVar.zzbr());
                return this;
            }

            public zzb zzm(int i10, zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzaJ(i10, zzatVar);
                return this;
            }

            public zzb zzn() {
                zzbu();
                ((zza) this.zza).zzaK();
                return this;
            }

            public zzb zzo() {
                zzbu();
                ((zza) this.zza).zzch();
                return this;
            }

            public zzb zzp() {
                zzbu();
                ((zza) this.zza).zzci();
                return this;
            }

            public zzb zzq() {
                zzbu();
                ((zza) this.zza).zzcj();
                return this;
            }

            public zzb zzr() {
                zzbu();
                ((zza) this.zza).zzck();
                return this;
            }

            public zzb zzs() {
                zzbu();
                ((zza) this.zza).zzcl();
                return this;
            }

            public zzb zzt() {
                zzbu();
                ((zza) this.zza).zzcm();
                return this;
            }

            public zzb zzu() {
                zzbu();
                ((zza) this.zza).zzcn();
                return this;
            }

            public zzb zzv() {
                zzbu();
                ((zza) this.zza).zzco();
                return this;
            }

            public zzb zzw() {
                zzbu();
                ((zza) this.zza).zzcp();
                return this;
            }

            public zzb zzx() {
                zzbu();
                ((zza) this.zza).zzcq();
                return this;
            }

            public zzb zzy(zzx zzxVar) {
                zzbu();
                ((zza) this.zza).zzct(zzxVar);
                return this;
            }

            public zzb zzz(zzz zzzVar) {
                zzbu();
                ((zza) this.zza).zzcu(zzzVar);
                return this;
            }

            public /* synthetic */ zzb(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzl = zzaVar;
            zzgxy.zzcb(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(Iterable<? extends zzd> iterable) {
            zzcr();
            zzgvv.zzaQ(iterable, this.zzw);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(Iterable<? extends zzat> iterable) {
            zzcs();
            zzgvv.zzaQ(iterable, this.zzC);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG(zzd zzdVar) {
            zzdVar.getClass();
            zzcr();
            this.zzw.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaH(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzcr();
            this.zzw.add(i10, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI(zzat zzatVar) {
            zzatVar.getClass();
            zzcs();
            this.zzC.add(zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ(int i10, zzat zzatVar) {
            zzatVar.getClass();
            zzcs();
            this.zzC.add(i10, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaK() {
            this.zzn &= -2;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(int i10) {
            zzcr();
            this.zzw.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(int i10) {
            zzcs();
            this.zzC.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(EnumC0157zza enumC0157zza) {
            this.zzo = enumC0157zza.zza();
            this.zzn |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(zzx zzxVar) {
            zzxVar.getClass();
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzn |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzz zzzVar) {
            zzzVar.getClass();
            this.zzB = zzzVar;
            this.zzn |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(zzac zzacVar) {
            zzacVar.getClass();
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzcr();
            this.zzw.set(i10, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(zzg zzgVar) {
            zzgVar.getClass();
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(zzi zziVar) {
            zziVar.getClass();
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(zzah zzahVar) {
            zzahVar.getClass();
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcL(zzk zzkVar) {
            zzkVar.getClass();
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcM(int i10, zzat zzatVar) {
            zzatVar.getClass();
            zzcs();
            this.zzC.set(i10, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzA = null;
            this.zzn &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzB = null;
            this.zzn &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzz = null;
            this.zzn &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzw = zzgxy.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzu = null;
            this.zzn &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzv = null;
            this.zzn &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco() {
            this.zzy = null;
            this.zzn &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp() {
            this.zzx = null;
            this.zzn &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq() {
            this.zzC = zzgxy.zzbK();
        }

        private void zzcr() {
            zzgyk<zzd> zzgykVar = this.zzw;
            if (!zzgykVar.zzc()) {
                this.zzw = zzgxy.zzbL(zzgykVar);
            }
        }

        private void zzcs() {
            zzgyk<zzat> zzgykVar = this.zzC;
            if (!zzgykVar.zzc()) {
                this.zzC = zzgxy.zzbL(zzgykVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct(zzx zzxVar) {
            zzxVar.getClass();
            zzx zzxVar2 = this.zzA;
            if (zzxVar2 != null && zzxVar2 != zzx.zzg()) {
                zzx.zza zze2 = zzx.zze(zzxVar2);
                zze2.zzbj(zzxVar);
                zzxVar = zze2.zzbs();
            }
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu(zzz zzzVar) {
            zzzVar.getClass();
            zzz zzzVar2 = this.zzB;
            if (zzzVar2 != null && zzzVar2 != zzz.zzg()) {
                zzz.zza zze2 = zzz.zze(zzzVar2);
                zze2.zzbj(zzzVar);
                zzzVar = zze2.zzbs();
            }
            this.zzB = zzzVar;
            this.zzn |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv(zzac zzacVar) {
            zzacVar.getClass();
            zzac zzacVar2 = this.zzz;
            if (zzacVar2 != null && zzacVar2 != zzac.zzf()) {
                zzac.zza zzd2 = zzac.zzd(zzacVar2);
                zzd2.zzbj(zzacVar);
                zzacVar = zzd2.zzbs();
            }
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw(zzg zzgVar) {
            zzgVar.getClass();
            zzg zzgVar2 = this.zzu;
            if (zzgVar2 != null && zzgVar2 != zzg.zzg()) {
                zzg.zza zze2 = zzg.zze(zzgVar2);
                zze2.zzbj(zzgVar);
                zzgVar = zze2.zzbs();
            }
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzi zziVar) {
            zziVar.getClass();
            zzi zziVar2 = this.zzv;
            if (zziVar2 != null && zziVar2 != zzi.zzg()) {
                zzi.zza zze2 = zzi.zze(zziVar2);
                zze2.zzbj(zziVar);
                zziVar = zze2.zzbs();
            }
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zzah zzahVar) {
            zzahVar.getClass();
            zzah zzahVar2 = this.zzy;
            if (zzahVar2 != null && zzahVar2 != zzah.zzn()) {
                zzah.zza zzl2 = zzah.zzl(zzahVar2);
                zzl2.zzbj(zzahVar);
                zzahVar = zzl2.zzbs();
            }
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(zzk zzkVar) {
            zzkVar.getClass();
            zzk zzkVar2 = this.zzx;
            if (zzkVar2 != null && zzkVar2 != zzk.zzg()) {
                zzk.zza zze2 = zzk.zze(zzkVar2);
                zze2.zzbj(zzkVar);
                zzkVar = zze2.zzbs();
            }
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        public static zzb zzd() {
            return zzl.zzaZ();
        }

        public static zzb zze(zza zzaVar) {
            return zzl.zzba(zzaVar);
        }

        public static zza zzg() {
            return zzl;
        }

        public static zza zzh(InputStream inputStream) {
            return (zza) zzgxy.zzbk(zzl, inputStream);
        }

        public static zza zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zza) zzgxy.zzbl(zzl, inputStream, zzgxiVar);
        }

        public static zza zzj(zzgwm zzgwmVar) {
            return (zza) zzgxy.zzbm(zzl, zzgwmVar);
        }

        public static zza zzk(zzgww zzgwwVar) {
            return (zza) zzgxy.zzbn(zzl, zzgwwVar);
        }

        public static zza zzl(InputStream inputStream) {
            return (zza) zzgxy.zzbo(zzl, inputStream);
        }

        public static zza zzm(ByteBuffer byteBuffer) {
            return (zza) zzgxy.zzbp(zzl, byteBuffer);
        }

        public static zza zzn(byte[] bArr) {
            return (zza) zzgxy.zzbq(zzl, bArr);
        }

        public static zza zzo(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zza) zzgxy.zzbr(zzl, zzgwmVar, zzgxiVar);
        }

        public static zza zzp(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zza) zzgxy.zzbs(zzl, zzgwwVar, zzgxiVar);
        }

        public static zza zzq(InputStream inputStream, zzgxi zzgxiVar) {
            return (zza) zzgxy.zzbu(zzl, inputStream, zzgxiVar);
        }

        public static zza zzr(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zza) zzgxy.zzbv(zzl, byteBuffer, zzgxiVar);
        }

        public static zza zzs(byte[] bArr, zzgxi zzgxiVar) {
            return (zza) zzgxy.zzbx(zzl, bArr, zzgxiVar);
        }

        public static zzgzr<zza> zzv() {
            return zzl.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public int zza() {
            return this.zzw.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public zzd zzab(int i10) {
            return this.zzw.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public zzg zzac() {
            zzg zzgVar = this.zzu;
            if (zzgVar == null) {
                return zzg.zzg();
            }
            return zzgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public zzi zzad() {
            zzi zziVar = this.zzv;
            if (zziVar == null) {
                return zzi.zzg();
            }
            return zziVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public zzk zzae() {
            zzk zzkVar = this.zzx;
            if (zzkVar == null) {
                return zzk.zzg();
            }
            return zzkVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public zzq zzaf() {
            zzq zzb2 = zzq.zzb(this.zzp);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public zzx zzag() {
            zzx zzxVar = this.zzA;
            if (zzxVar == null) {
                return zzx.zzg();
            }
            return zzxVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public zzz zzah() {
            zzz zzzVar = this.zzB;
            if (zzzVar == null) {
                return zzz.zzg();
            }
            return zzzVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public zzac zzai() {
            zzac zzacVar = this.zzz;
            if (zzacVar == null) {
                return zzac.zzf();
            }
            return zzacVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public zzah zzaj() {
            zzah zzahVar = this.zzy;
            if (zzahVar == null) {
                return zzah.zzn();
            }
            return zzahVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public zzat zzak(int i10) {
            return this.zzC.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public List<zzd> zzal() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public List<zzat> zzam() {
            return this.zzC;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public boolean zzan() {
            if ((this.zzn & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public boolean zzao() {
            if ((this.zzn & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public boolean zzap() {
            if ((this.zzn & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public boolean zzaq() {
            if ((this.zzn & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public boolean zzar() {
            if ((this.zzn & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public boolean zzas() {
            if ((this.zzn & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public boolean zzat() {
            if ((this.zzn & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public boolean zzau() {
            if ((this.zzn & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public boolean zzav() {
            if ((this.zzn & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public int zzb() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzf
        public EnumC0157zza zzc() {
            EnumC0157zza zzb2 = EnumC0157zza.zzb(this.zzo);
            if (zzb2 == null) {
                return EnumC0157zza.AD_INITIATER_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzl, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", EnumC0157zza.zze(), "zzp", zzq.zze(), "zzu", "zzv", "zzw", zzd.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", zzat.class});
                case 3:
                    return new zza();
                case 4:
                    return new zzb(null);
                case 5:
                    return zzl;
                case 6:
                    zzgzr<zza> zzgzrVar = zzm;
                    if (zzgzrVar == null) {
                        synchronized (zza.class) {
                            zzgzrVar = zzm;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzl);
                                zzm = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public zze zzt(int i10) {
            return this.zzw.get(i10);
        }

        public zzbi zzu(int i10) {
            return this.zzC.get(i10);
        }

        public List<? extends zze> zzw() {
            return this.zzw;
        }

        public List<? extends zzbi> zzx() {
            return this.zzC;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzaa extends zzgzk {
        boolean zzA();

        boolean zzB();

        int zza();

        zzq zzb();

        zzv zzc();

        zzan zzw(int i10);

        zzap zzx();

        List<zzan> zzy();

        boolean zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzab extends zzgxy<zzab, zza> implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzc;
        private static volatile zzgzr<zzab> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzab, zza> implements zzae {
            private zza() {
                super(zzab.zzc);
            }

            public zza zza() {
                zzbu();
                ((zzab) this.zza).zzA();
                return this;
            }

            public zza zzb() {
                zzbu();
                ((zzab) this.zza).zzB();
                return this;
            }

            public zza zzc(zzb zzbVar) {
                zzbu();
                ((zzab) this.zza).zzC(zzbVar);
                return this;
            }

            public zza zzd(zzc zzcVar) {
                zzbu();
                ((zzab) this.zza).zzD(zzcVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzae
            public zzb zze() {
                return ((zzab) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzae
            public zzc zzf() {
                return ((zzab) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzae
            public boolean zzg() {
                return ((zzab) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzae
            public boolean zzh() {
                return ((zzab) this.zza).zzh();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public enum zzb implements zzgyc {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);
            
            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 4;
            private static final zzgyd<zzb> zzi = new zzgyd<zzb>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzab.zzb.1
                /* renamed from: zza */
                public zzb zzb(int i10) {
                    return zzb.zzb(i10);
                }
            };
            private final int zzk;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* loaded from: classes2.dex */
            public final class zza implements zzgye {
                static final zzgye zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgye
                public boolean zza(int i10) {
                    if (zzb.zzb(i10) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i10) {
                this.zzk = i10;
            }

            public static zzb zzb(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 4) {
                                return null;
                            }
                            return LTE;
                        }
                        return THREE_G;
                    }
                    return TWO_G;
                }
                return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }

            public static zzgyd<zzb> zzd() {
                return zzi;
            }

            public static zzgye zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgyc
            public final int zza() {
                return this.zzk;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public enum zzc implements zzgyc {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);
            
            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzgyd<zzc> zzg = new zzgyd<zzc>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzab.zzc.1
                /* renamed from: zza */
                public zzc zzb(int i10) {
                    return zzc.zzb(i10);
                }
            };
            private final int zzi;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* loaded from: classes2.dex */
            public final class zza implements zzgye {
                static final zzgye zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgye
                public boolean zza(int i10) {
                    if (zzc.zzb(i10) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzc(int i10) {
                this.zzi = i10;
            }

            public static zzc zzb(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return WIFI;
                    }
                    return CELL;
                }
                return NETWORKTYPE_UNSPECIFIED;
            }

            public static zzgyd<zzc> zzd() {
                return zzg;
            }

            public static zzgye zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgyc
            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzc = zzabVar;
            zzgxy.zzcb(zzab.class, zzabVar);
        }

        private zzab() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(zzb zzbVar) {
            this.zzg = zzbVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzc zzcVar) {
            this.zzf = zzcVar.zza();
            this.zze |= 1;
        }

        public static zza zza() {
            return zzc.zzaZ();
        }

        public static zza zzc(zzab zzabVar) {
            return zzc.zzba(zzabVar);
        }

        public static zzab zzi() {
            return zzc;
        }

        public static zzab zzj(InputStream inputStream) {
            return (zzab) zzgxy.zzbk(zzc, inputStream);
        }

        public static zzab zzk(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzab) zzgxy.zzbl(zzc, inputStream, zzgxiVar);
        }

        public static zzab zzl(zzgwm zzgwmVar) {
            return (zzab) zzgxy.zzbm(zzc, zzgwmVar);
        }

        public static zzab zzm(zzgww zzgwwVar) {
            return (zzab) zzgxy.zzbn(zzc, zzgwwVar);
        }

        public static zzab zzn(InputStream inputStream) {
            return (zzab) zzgxy.zzbo(zzc, inputStream);
        }

        public static zzab zzo(ByteBuffer byteBuffer) {
            return (zzab) zzgxy.zzbp(zzc, byteBuffer);
        }

        public static zzab zzp(byte[] bArr) {
            return (zzab) zzgxy.zzbq(zzc, bArr);
        }

        public static zzab zzq(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzab) zzgxy.zzbr(zzc, zzgwmVar, zzgxiVar);
        }

        public static zzab zzr(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzab) zzgxy.zzbs(zzc, zzgwwVar, zzgxiVar);
        }

        public static zzab zzs(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzab) zzgxy.zzbu(zzc, inputStream, zzgxiVar);
        }

        public static zzab zzt(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzab) zzgxy.zzbv(zzc, byteBuffer, zzgxiVar);
        }

        public static zzab zzu(byte[] bArr, zzgxi zzgxiVar) {
            return (zzab) zzgxy.zzbx(zzc, bArr, zzgxiVar);
        }

        public static zzgzr<zzab> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zzc.zze(), "zzg", zzb.zze()});
                case 3:
                    return new zzab();
                case 4:
                    return new zza(null);
                case 5:
                    return zzc;
                case 6:
                    zzgzr<zzab> zzgzrVar = zzd;
                    if (zzgzrVar == null) {
                        synchronized (zzab.class) {
                            zzgzrVar = zzd;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzc);
                                zzd = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzae
        public zzb zze() {
            zzb zzb2 = zzb.zzb(this.zzg);
            if (zzb2 == null) {
                return zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzae
        public zzc zzf() {
            zzc zzb2 = zzc.zzb(this.zzf);
            if (zzb2 == null) {
                return zzc.NETWORKTYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzae
        public boolean zzg() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzae
        public boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzac extends zzgxy<zzac, zza> implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzc;
        private static volatile zzgzr<zzac> zzd;
        private int zze;
        private int zzf;
        private zzap zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzac, zza> implements zzad {
            private zza() {
                super(zzac.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzad
            public zzq zza() {
                return ((zzac) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzac) this.zza).zzB();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzac) this.zza).zzC();
                return this;
            }

            public zza zzd(zzap zzapVar) {
                zzbu();
                ((zzac) this.zza).zzD(zzapVar);
                return this;
            }

            public zza zze(zzap.zza zzaVar) {
                zzbu();
                ((zzac) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zza zzf(zzap zzapVar) {
                zzbu();
                ((zzac) this.zza).zzE(zzapVar);
                return this;
            }

            public zza zzg(zzq zzqVar) {
                zzbu();
                ((zzac) this.zza).zzF(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzad
            public zzap zzh() {
                return ((zzac) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzad
            public boolean zzi() {
                return ((zzac) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzad
            public boolean zzj() {
                return ((zzac) this.zza).zzj();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzc = zzacVar;
            zzgxy.zzcb(zzac.class, zzacVar);
        }

        private zzac() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzg = zzapVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzac zzacVar) {
            return zzc.zzba(zzacVar);
        }

        public static zzac zzf() {
            return zzc;
        }

        public static zzac zzg(InputStream inputStream) {
            return (zzac) zzgxy.zzbk(zzc, inputStream);
        }

        public static zzac zzk(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzac) zzgxy.zzbl(zzc, inputStream, zzgxiVar);
        }

        public static zzac zzl(zzgwm zzgwmVar) {
            return (zzac) zzgxy.zzbm(zzc, zzgwmVar);
        }

        public static zzac zzm(zzgww zzgwwVar) {
            return (zzac) zzgxy.zzbn(zzc, zzgwwVar);
        }

        public static zzac zzn(InputStream inputStream) {
            return (zzac) zzgxy.zzbo(zzc, inputStream);
        }

        public static zzac zzo(ByteBuffer byteBuffer) {
            return (zzac) zzgxy.zzbp(zzc, byteBuffer);
        }

        public static zzac zzp(byte[] bArr) {
            return (zzac) zzgxy.zzbq(zzc, bArr);
        }

        public static zzac zzq(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzac) zzgxy.zzbr(zzc, zzgwmVar, zzgxiVar);
        }

        public static zzac zzr(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzac) zzgxy.zzbs(zzc, zzgwwVar, zzgxiVar);
        }

        public static zzac zzs(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzac) zzgxy.zzbu(zzc, inputStream, zzgxiVar);
        }

        public static zzac zzt(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzac) zzgxy.zzbv(zzc, byteBuffer, zzgxiVar);
        }

        public static zzac zzu(byte[] bArr, zzgxi zzgxiVar) {
            return (zzac) zzgxy.zzbx(zzc, bArr, zzgxiVar);
        }

        public static zzgzr<zzac> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzad
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzf);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
                case 3:
                    return new zzac();
                case 4:
                    return new zza(null);
                case 5:
                    return zzc;
                case 6:
                    zzgzr<zzac> zzgzrVar = zzd;
                    if (zzgzrVar == null) {
                        synchronized (zzac.class) {
                            zzgzrVar = zzd;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzc);
                                zzd = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzad
        public zzap zzh() {
            zzap zzapVar = this.zzg;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzad
        public boolean zzi() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzad
        public boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzad extends zzgzk {
        zzq zza();

        zzap zzh();

        boolean zzi();

        boolean zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzae extends zzgzk {
        zzab.zzb zze();

        zzab.zzc zzf();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzaf extends zzgxy<zzaf, zzc> implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzi;
        private static volatile zzgzr<zzaf> zzj;
        private int zzk;
        private int zzm;
        private int zzn;
        private long zzo;
        private long zzv;
        private int zzw;
        private zzgyk<zza> zzl = zzgxy.zzbK();
        private String zzp = "";
        private String zzu = "";

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxy<zza, C0159zza> implements zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            public static final int zzd = 4;
            public static final int zze = 5;
            public static final int zzf = 6;
            public static final int zzg = 7;
            public static final int zzh = 8;
            public static final int zzi = 9;
            public static final int zzj = 10;
            public static final int zzk = 11;
            public static final int zzl = 12;
            public static final int zzm = 13;
            private static final zzgyh<zzd.zza> zzn = new zzgyh<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzaf.zza.1
                @Override // com.google.android.gms.internal.ads.zzgyh
                /* renamed from: zza */
                public zzd.zza zzb(int i10) {
                    zzd.zza zzb2 = zzd.zza.zzb(i10);
                    if (zzb2 == null) {
                        return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    return zzb2;
                }
            };
            private static final zza zzo;
            private static volatile zzgzr<zza> zzp;
            private zzab zzA;
            private int zzB;
            private int zzC;
            private int zzD;
            private int zzE;
            private int zzF;
            private int zzG;
            private long zzH;
            private int zzu;
            private long zzv;
            private int zzw;
            private long zzx;
            private long zzy;
            private zzgyg zzz = zzgxy.zzbG();

            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbbc$zzaf$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0159zza extends zzgxs<zza, C0159zza> implements zzb {
                private C0159zza() {
                    super(zza.zzo);
                }

                public C0159zza zzA() {
                    zzbu();
                    ((zza) this.zza).zzaI();
                    return this;
                }

                public C0159zza zzB() {
                    zzbu();
                    ((zza) this.zza).zzaJ();
                    return this;
                }

                public C0159zza zzC(zzab zzabVar) {
                    zzbu();
                    ((zza) this.zza).zzch(zzabVar);
                    return this;
                }

                public C0159zza zzD(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzci(zzqVar);
                    return this;
                }

                public C0159zza zzE(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcj(zzqVar);
                    return this;
                }

                public C0159zza zzF(int i10, zzd.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzck(i10, zzaVar);
                    return this;
                }

                public C0159zza zzG(int i10) {
                    zzbu();
                    ((zza) this.zza).zzcl(i10);
                    return this;
                }

                public C0159zza zzH(zzd zzdVar) {
                    zzbu();
                    ((zza) this.zza).zzcm(zzdVar);
                    return this;
                }

                public C0159zza zzI(zzab.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzcn(zzaVar.zzbr());
                    return this;
                }

                public C0159zza zzJ(zzab zzabVar) {
                    zzbu();
                    ((zza) this.zza).zzcn(zzabVar);
                    return this;
                }

                public C0159zza zzK(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzco(zzqVar);
                    return this;
                }

                public C0159zza zzL(long j10) {
                    zzbu();
                    ((zza) this.zza).zzcp(j10);
                    return this;
                }

                public C0159zza zzM(long j10) {
                    zzbu();
                    ((zza) this.zza).zzcq(j10);
                    return this;
                }

                public C0159zza zzN(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcr(zzqVar);
                    return this;
                }

                public C0159zza zzO(long j10) {
                    zzbu();
                    ((zza) this.zza).zzcs(j10);
                    return this;
                }

                public C0159zza zzP(long j10) {
                    zzbu();
                    ((zza) this.zza).zzct(j10);
                    return this;
                }

                public C0159zza zzQ(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcu(zzqVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public zzd zzR() {
                    return ((zza) this.zza).zzR();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public List<zzd.zza> zzS() {
                    return ((zza) this.zza).zzS();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzT() {
                    return ((zza) this.zza).zzT();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzU() {
                    return ((zza) this.zza).zzU();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzV() {
                    return ((zza) this.zza).zzV();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzW() {
                    return ((zza) this.zza).zzW();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzX() {
                    return ((zza) this.zza).zzX();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzY() {
                    return ((zza) this.zza).zzY();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzZ() {
                    return ((zza) this.zza).zzZ();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public int zza() {
                    return ((zza) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzaa() {
                    return ((zza) this.zza).zzaa();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzab() {
                    return ((zza) this.zza).zzab();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzac() {
                    return ((zza) this.zza).zzac();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzad() {
                    return ((zza) this.zza).zzad();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public boolean zzae() {
                    return ((zza) this.zza).zzae();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public int zzb() {
                    return ((zza) this.zza).zzb();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public long zzc() {
                    return ((zza) this.zza).zzc();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public long zzd() {
                    return ((zza) this.zza).zzd();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public long zze() {
                    return ((zza) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public long zzf() {
                    return ((zza) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public zzd.zza zzg(int i10) {
                    return ((zza) this.zza).zzg(i10);
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public zzq zzh() {
                    return ((zza) this.zza).zzh();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public zzq zzi() {
                    return ((zza) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public zzq zzj() {
                    return ((zza) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public zzq zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public zzq zzl() {
                    return ((zza) this.zza).zzl();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
                public zzab zzm() {
                    return ((zza) this.zza).zzm();
                }

                public C0159zza zzn(Iterable<? extends zzd.zza> iterable) {
                    zzbu();
                    ((zza) this.zza).zzav(iterable);
                    return this;
                }

                public C0159zza zzo(zzd.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzaw(zzaVar);
                    return this;
                }

                public C0159zza zzp() {
                    zzbu();
                    ((zza) this.zza).zzax();
                    return this;
                }

                public C0159zza zzq() {
                    zzbu();
                    ((zza) this.zza).zzay();
                    return this;
                }

                public C0159zza zzr() {
                    zzbu();
                    ((zza) this.zza).zzaz();
                    return this;
                }

                public C0159zza zzs() {
                    zzbu();
                    ((zza) this.zza).zzaA();
                    return this;
                }

                public C0159zza zzt() {
                    zzbu();
                    ((zza) this.zza).zzaB();
                    return this;
                }

                public C0159zza zzu() {
                    zzbu();
                    ((zza) this.zza).zzaC();
                    return this;
                }

                public C0159zza zzv() {
                    zzbu();
                    ((zza) this.zza).zzaD();
                    return this;
                }

                public C0159zza zzw() {
                    zzbu();
                    ((zza) this.zza).zzaE();
                    return this;
                }

                public C0159zza zzx() {
                    zzbu();
                    ((zza) this.zza).zzaF();
                    return this;
                }

                public C0159zza zzy() {
                    zzbu();
                    ((zza) this.zza).zzaG();
                    return this;
                }

                public C0159zza zzz() {
                    zzbu();
                    ((zza) this.zza).zzaH();
                    return this;
                }

                public /* synthetic */ C0159zza(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzo = zzaVar;
                zzgxy.zzcb(zza.class, zzaVar);
            }

            private zza() {
            }

            public static zza zzA(InputStream inputStream, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbu(zzo, inputStream, zzgxiVar);
            }

            public static zza zzB(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbv(zzo, byteBuffer, zzgxiVar);
            }

            public static zza zzC(byte[] bArr, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbx(zzo, bArr, zzgxiVar);
            }

            public static zzgzr<zza> zzD() {
                return zzo.zzbN();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaA() {
                this.zzu &= -257;
                this.zzE = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaB() {
                this.zzu &= -1025;
                this.zzG = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaC() {
                this.zzA = null;
                this.zzu &= -17;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaD() {
                this.zzu &= -513;
                this.zzF = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaE() {
                this.zzu &= -9;
                this.zzy = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaF() {
                this.zzu &= -5;
                this.zzx = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaG() {
                this.zzu &= -3;
                this.zzw = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaH() {
                this.zzu &= -2;
                this.zzv = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaI() {
                this.zzu &= -2049;
                this.zzH = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaJ() {
                this.zzu &= -33;
                this.zzB = 0;
            }

            private void zzaK() {
                zzgyg zzgygVar = this.zzz;
                if (!zzgygVar.zzc()) {
                    this.zzz = zzgxy.zzbH(zzgygVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzav(Iterable<? extends zzd.zza> iterable) {
                zzaK();
                for (zzd.zza zzaVar : iterable) {
                    this.zzz.zzi(zzaVar.zza());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaw(zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaK();
                this.zzz.zzi(zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzax() {
                this.zzu &= -65;
                this.zzC = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzay() {
                this.zzu &= -129;
                this.zzD = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaz() {
                this.zzz = zzgxy.zzbG();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzch(zzab zzabVar) {
                zzabVar.getClass();
                zzab zzabVar2 = this.zzA;
                if (zzabVar2 != null && zzabVar2 != zzab.zzi()) {
                    zzab.zza zzc2 = zzab.zzc(zzabVar2);
                    zzc2.zzbj(zzabVar);
                    zzabVar = zzc2.zzbs();
                }
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzci(zzq zzqVar) {
                this.zzC = zzqVar.zza();
                this.zzu |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcj(zzq zzqVar) {
                this.zzD = zzqVar.zza();
                this.zzu |= 128;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzck(int i10, zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaK();
                this.zzz.zze(i10, zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcl(int i10) {
                this.zzu |= 256;
                this.zzE = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcm(zzd zzdVar) {
                this.zzG = zzdVar.zza();
                this.zzu |= 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcn(zzab zzabVar) {
                zzabVar.getClass();
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzco(zzq zzqVar) {
                this.zzF = zzqVar.zza();
                this.zzu |= 512;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcp(long j10) {
                this.zzu |= 8;
                this.zzy = j10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcq(long j10) {
                this.zzu |= 4;
                this.zzx = j10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcr(zzq zzqVar) {
                this.zzw = zzqVar.zza();
                this.zzu |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcs(long j10) {
                this.zzu |= 1;
                this.zzv = j10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzct(long j10) {
                this.zzu |= 2048;
                this.zzH = j10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcu(zzq zzqVar) {
                this.zzB = zzqVar.zza();
                this.zzu |= 32;
            }

            public static C0159zza zzn() {
                return zzo.zzaZ();
            }

            public static C0159zza zzo(zza zzaVar) {
                return zzo.zzba(zzaVar);
            }

            public static zza zzq() {
                return zzo;
            }

            public static zza zzr(InputStream inputStream) {
                return (zza) zzgxy.zzbk(zzo, inputStream);
            }

            public static zza zzs(InputStream inputStream, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbl(zzo, inputStream, zzgxiVar);
            }

            public static zza zzt(zzgwm zzgwmVar) {
                return (zza) zzgxy.zzbm(zzo, zzgwmVar);
            }

            public static zza zzu(zzgww zzgwwVar) {
                return (zza) zzgxy.zzbn(zzo, zzgwwVar);
            }

            public static zza zzv(InputStream inputStream) {
                return (zza) zzgxy.zzbo(zzo, inputStream);
            }

            public static zza zzw(ByteBuffer byteBuffer) {
                return (zza) zzgxy.zzbp(zzo, byteBuffer);
            }

            public static zza zzx(byte[] bArr) {
                return (zza) zzgxy.zzbq(zzo, bArr);
            }

            public static zza zzy(zzgwm zzgwmVar, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbr(zzo, zzgwmVar, zzgxiVar);
            }

            public static zza zzz(zzgww zzgwwVar, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbs(zzo, zzgwwVar, zzgxiVar);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public zzd zzR() {
                zzd zzb2 = zzd.zzb(this.zzG);
                if (zzb2 == null) {
                    return zzd.UNSPECIFIED;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public List<zzd.zza> zzS() {
                return new zzgyi(this.zzz, zzn);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzT() {
                if ((this.zzu & 64) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzU() {
                if ((this.zzu & 128) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzV() {
                if ((this.zzu & 256) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzW() {
                if ((this.zzu & 1024) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzX() {
                if ((this.zzu & 16) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzY() {
                if ((this.zzu & 512) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzZ() {
                if ((this.zzu & 8) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public int zza() {
                return this.zzz.size();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzaa() {
                if ((this.zzu & 4) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzab() {
                if ((this.zzu & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzac() {
                if ((this.zzu & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzad() {
                if ((this.zzu & 2048) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public boolean zzae() {
                if ((this.zzu & 32) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public int zzb() {
                return this.zzE;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public long zzc() {
                return this.zzy;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public long zzd() {
                return this.zzx;
            }

            @Override // com.google.android.gms.internal.ads.zzgxy
            public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
                switch (zzgxxVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return zzgxy.zzbS(zzo, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", zzq.zze(), "zzx", "zzy", "zzz", zzd.zza.zze(), "zzA", "zzB", zzq.zze(), "zzC", zzq.zze(), "zzD", zzq.zze(), "zzE", "zzF", zzq.zze(), "zzG", zzd.zze(), "zzH"});
                    case 3:
                        return new zza();
                    case 4:
                        return new C0159zza(null);
                    case 5:
                        return zzo;
                    case 6:
                        zzgzr<zza> zzgzrVar = zzp;
                        if (zzgzrVar == null) {
                            synchronized (zza.class) {
                                zzgzrVar = zzp;
                                if (zzgzrVar == null) {
                                    zzgzrVar = new zzgxt(zzo);
                                    zzp = zzgzrVar;
                                }
                            }
                        }
                        return zzgzrVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public long zze() {
                return this.zzv;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public long zzf() {
                return this.zzH;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public zzd.zza zzg(int i10) {
                zzd.zza zzb2 = zzd.zza.zzb(this.zzz.zzd(i10));
                if (zzb2 == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public zzq zzh() {
                zzq zzb2 = zzq.zzb(this.zzC);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public zzq zzi() {
                zzq zzb2 = zzq.zzb(this.zzD);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public zzq zzj() {
                zzq zzb2 = zzq.zzb(this.zzF);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public zzq zzk() {
                zzq zzb2 = zzq.zzb(this.zzw);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public zzq zzl() {
                zzq zzb2 = zzq.zzb(this.zzB);
                if (zzb2 == null) {
                    return zzq.ENUM_FALSE;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaf.zzb
            public zzab zzm() {
                zzab zzabVar = this.zzA;
                if (zzabVar == null) {
                    return zzab.zzi();
                }
                return zzabVar;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public interface zzb extends zzgzk {
            zzd zzR();

            List<zzd.zza> zzS();

            boolean zzT();

            boolean zzU();

            boolean zzV();

            boolean zzW();

            boolean zzX();

            boolean zzY();

            boolean zzZ();

            int zza();

            boolean zzaa();

            boolean zzab();

            boolean zzac();

            boolean zzad();

            boolean zzae();

            int zzb();

            long zzc();

            long zzd();

            long zze();

            long zzf();

            zzd.zza zzg(int i10);

            zzq zzh();

            zzq zzi();

            zzq zzj();

            zzq zzk();

            zzq zzl();

            zzab zzm();
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zzc extends zzgxs<zzaf, zzc> implements zzag {
            private zzc() {
                super(zzaf.zzi);
            }

            public zzc zzA(int i10) {
                zzbu();
                ((zzaf) this.zza).zzaA(i10);
                return this;
            }

            public zzc zzB(long j10) {
                zzbu();
                ((zzaf) this.zza).zzaB(j10);
                return this;
            }

            public zzc zzC(int i10, zza.C0159zza c0159zza) {
                zzbu();
                ((zzaf) this.zza).zzaC(i10, c0159zza.zzbr());
                return this;
            }

            public zzc zzD(int i10, zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzaC(i10, zzaVar);
                return this;
            }

            public zzc zzE(int i10) {
                zzbu();
                ((zzaf) this.zza).zzaD(i10);
                return this;
            }

            public zzc zzF(long j10) {
                zzbu();
                ((zzaf) this.zza).zzaE(j10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public zzgwm zzG() {
                return ((zzaf) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public zzgwm zzH() {
                return ((zzaf) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public String zzI() {
                return ((zzaf) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public String zzJ() {
                return ((zzaf) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public List<zza> zzK() {
                return Collections.unmodifiableList(((zzaf) this.zza).zzK());
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public boolean zzL() {
                return ((zzaf) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public boolean zzM() {
                return ((zzaf) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public boolean zzN() {
                return ((zzaf) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public boolean zzO() {
                return ((zzaf) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public boolean zzP() {
                return ((zzaf) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public boolean zzQ() {
                return ((zzaf) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public boolean zzR() {
                return ((zzaf) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public int zza() {
                return ((zzaf) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public int zzb() {
                return ((zzaf) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public int zzc() {
                return ((zzaf) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public int zzd() {
                return ((zzaf) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public long zze() {
                return ((zzaf) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public long zzf() {
                return ((zzaf) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzag
            public zza zzg(int i10) {
                return ((zzaf) this.zza).zzg(i10);
            }

            public zzc zzh(Iterable<? extends zza> iterable) {
                zzbu();
                ((zzaf) this.zza).zzai(iterable);
                return this;
            }

            public zzc zzi(zza.C0159zza c0159zza) {
                zzbu();
                ((zzaf) this.zza).zzaj(c0159zza.zzbr());
                return this;
            }

            public zzc zzj(zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzaj(zzaVar);
                return this;
            }

            public zzc zzk(int i10, zza.C0159zza c0159zza) {
                zzbu();
                ((zzaf) this.zza).zzak(i10, c0159zza.zzbr());
                return this;
            }

            public zzc zzl(int i10, zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzak(i10, zzaVar);
                return this;
            }

            public zzc zzm() {
                zzbu();
                ((zzaf) this.zza).zzal();
                return this;
            }

            public zzc zzn() {
                zzbu();
                ((zzaf) this.zza).zzam();
                return this;
            }

            public zzc zzo() {
                zzbu();
                ((zzaf) this.zza).zzan();
                return this;
            }

            public zzc zzp() {
                zzbu();
                ((zzaf) this.zza).zzao();
                return this;
            }

            public zzc zzq() {
                zzbu();
                ((zzaf) this.zza).zzap();
                return this;
            }

            public zzc zzr() {
                zzbu();
                ((zzaf) this.zza).zzaq();
                return this;
            }

            public zzc zzs() {
                zzbu();
                ((zzaf) this.zza).zzar();
                return this;
            }

            public zzc zzt() {
                zzbu();
                ((zzaf) this.zza).zzas();
                return this;
            }

            public zzc zzu(int i10) {
                zzbu();
                ((zzaf) this.zza).zzau(i10);
                return this;
            }

            public zzc zzv(String str) {
                zzbu();
                ((zzaf) this.zza).zzav(str);
                return this;
            }

            public zzc zzw(zzgwm zzgwmVar) {
                zzbu();
                ((zzaf) this.zza).zzaw(zzgwmVar);
                return this;
            }

            public zzc zzx(int i10) {
                zzbu();
                ((zzaf) this.zza).zzax(i10);
                return this;
            }

            public zzc zzy(String str) {
                zzbu();
                ((zzaf) this.zza).zzay(str);
                return this;
            }

            public zzc zzz(zzgwm zzgwmVar) {
                zzbu();
                ((zzaf) this.zza).zzaz(zzgwmVar);
                return this;
            }

            public /* synthetic */ zzc(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public enum zzd implements zzgyc {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);
            
            public static final int zzg = 0;
            public static final int zzh = 1;
            public static final int zzi = 2;
            public static final int zzj = 3;
            public static final int zzk = 4;
            public static final int zzl = 5;
            private static final zzgyd<zzd> zzm = new zzgyd<zzd>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzaf.zzd.1
                /* renamed from: zza */
                public zzd zzb(int i10) {
                    return zzd.zzb(i10);
                }
            };
            private final int zzo;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* loaded from: classes2.dex */
            public final class zza implements zzgye {
                static final zzgye zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgye
                public boolean zza(int i10) {
                    if (zzd.zzb(i10) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzd(int i10) {
                this.zzo = i10;
            }

            public static zzd zzb(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        return null;
                                    }
                                    return SUSPENDED;
                                }
                                return DISCONNECTED;
                            }
                            return DISCONNECTING;
                        }
                        return CONNECTED;
                    }
                    return CONNECTING;
                }
                return UNSPECIFIED;
            }

            public static zzgyd<zzd> zzd() {
                return zzm;
            }

            public static zzgye zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgyc
            public final int zza() {
                return this.zzo;
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzi = zzafVar;
            zzgxy.zzcb(zzaf.class, zzafVar);
        }

        private zzaf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA(int i10) {
            this.zzk |= 1;
            this.zzm = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB(long j10) {
            this.zzk |= 32;
            this.zzv = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC(int i10, zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.set(i10, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD(int i10) {
            this.zzk |= 2;
            this.zzn = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(long j10) {
            this.zzk |= 4;
            this.zzo = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai(Iterable<? extends zza> iterable) {
            zzat();
            zzgvv.zzaQ(iterable, this.zzl);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(int i10, zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.add(i10, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal() {
            this.zzk &= -9;
            this.zzp = zzl().zzI();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam() {
            this.zzk &= -65;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan() {
            this.zzk &= -17;
            this.zzu = zzl().zzJ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao() {
            this.zzk &= -2;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap() {
            this.zzk &= -33;
            this.zzv = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq() {
            this.zzl = zzgxy.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar() {
            this.zzk &= -3;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas() {
            this.zzk &= -5;
            this.zzo = 0L;
        }

        private void zzat() {
            zzgyk<zza> zzgykVar = this.zzl;
            if (!zzgykVar.zzc()) {
                this.zzl = zzgxy.zzbL(zzgykVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau(int i10) {
            zzat();
            this.zzl.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzav(String str) {
            str.getClass();
            this.zzk |= 8;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaw(zzgwm zzgwmVar) {
            this.zzp = zzgwmVar.zzx();
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzax(int i10) {
            this.zzk |= 64;
            this.zzw = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzay(String str) {
            str.getClass();
            this.zzk |= 16;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz(zzgwm zzgwmVar) {
            this.zzu = zzgwmVar.zzx();
            this.zzk |= 16;
        }

        public static zzc zzi() {
            return zzi.zzaZ();
        }

        public static zzc zzj(zzaf zzafVar) {
            return zzi.zzba(zzafVar);
        }

        public static zzaf zzl() {
            return zzi;
        }

        public static zzaf zzm(InputStream inputStream) {
            return (zzaf) zzgxy.zzbk(zzi, inputStream);
        }

        public static zzaf zzn(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzaf) zzgxy.zzbl(zzi, inputStream, zzgxiVar);
        }

        public static zzaf zzo(zzgwm zzgwmVar) {
            return (zzaf) zzgxy.zzbm(zzi, zzgwmVar);
        }

        public static zzaf zzp(zzgww zzgwwVar) {
            return (zzaf) zzgxy.zzbn(zzi, zzgwwVar);
        }

        public static zzaf zzq(InputStream inputStream) {
            return (zzaf) zzgxy.zzbo(zzi, inputStream);
        }

        public static zzaf zzr(ByteBuffer byteBuffer) {
            return (zzaf) zzgxy.zzbp(zzi, byteBuffer);
        }

        public static zzaf zzs(byte[] bArr) {
            return (zzaf) zzgxy.zzbq(zzi, bArr);
        }

        public static zzaf zzt(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzaf) zzgxy.zzbr(zzi, zzgwmVar, zzgxiVar);
        }

        public static zzaf zzu(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzaf) zzgxy.zzbs(zzi, zzgwwVar, zzgxiVar);
        }

        public static zzaf zzv(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzaf) zzgxy.zzbu(zzi, inputStream, zzgxiVar);
        }

        public static zzaf zzw(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzaf) zzgxy.zzbv(zzi, byteBuffer, zzgxiVar);
        }

        public static zzaf zzx(byte[] bArr, zzgxi zzgxiVar) {
            return (zzaf) zzgxy.zzbx(zzi, bArr, zzgxiVar);
        }

        public static zzgzr<zzaf> zzy() {
            return zzi.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public zzgwm zzG() {
            return zzgwm.zzw(this.zzp);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public zzgwm zzH() {
            return zzgwm.zzw(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public String zzI() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public String zzJ() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public List<zza> zzK() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public boolean zzL() {
            if ((this.zzk & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public boolean zzM() {
            if ((this.zzk & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public boolean zzN() {
            if ((this.zzk & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public boolean zzO() {
            if ((this.zzk & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public boolean zzP() {
            if ((this.zzk & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public boolean zzQ() {
            if ((this.zzk & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public boolean zzR() {
            if ((this.zzk & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public int zza() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public int zzb() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public int zzc() {
            return this.zzl.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public int zzd() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzi, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", zza.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
                case 3:
                    return new zzaf();
                case 4:
                    return new zzc(null);
                case 5:
                    return zzi;
                case 6:
                    zzgzr<zzaf> zzgzrVar = zzj;
                    if (zzgzrVar == null) {
                        synchronized (zzaf.class) {
                            zzgzrVar = zzj;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzi);
                                zzj = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public long zze() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public long zzf() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzag
        public zza zzg(int i10) {
            return this.zzl.get(i10);
        }

        public zzb zzh(int i10) {
            return this.zzl.get(i10);
        }

        public List<? extends zzb> zzz() {
            return this.zzl;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzag extends zzgzk {
        zzgwm zzG();

        zzgwm zzH();

        String zzI();

        String zzJ();

        List<zzaf.zza> zzK();

        boolean zzL();

        boolean zzM();

        boolean zzN();

        boolean zzO();

        boolean zzP();

        boolean zzQ();

        boolean zzR();

        int zza();

        int zzb();

        int zzc();

        int zzd();

        long zze();

        long zzf();

        zzaf.zza zzg(int i10);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzah extends zzgxy<zzah, zza> implements zzak {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        public static final int zzi = 9;
        public static final int zzj = 10;
        public static final int zzk = 11;
        private static final zzah zzl;
        private static volatile zzgzr<zzah> zzm;
        private int zzA;
        private int zzB;
        private zzai zzC;
        private int zzn;
        private int zzo = 1000;
        private int zzp = 1000;
        private int zzu;
        private int zzv;
        private int zzw;
        private int zzx;
        private int zzy;
        private int zzz;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzah, zza> implements zzak {
            private zza() {
                super(zzah.zzl);
            }

            public zza zzA(int i10) {
                zzbu();
                ((zzah) this.zza).zzaA(i10);
                return this;
            }

            public zza zzB(int i10) {
                zzbu();
                ((zzah) this.zza).zzaB(i10);
                return this;
            }

            public zza zzC(int i10) {
                zzbu();
                ((zzah) this.zza).zzaC(i10);
                return this;
            }

            public zza zzD(zzai.zza zzaVar) {
                zzbu();
                ((zzah) this.zza).zzaD(zzaVar.zzbr());
                return this;
            }

            public zza zzE(zzai zzaiVar) {
                zzbu();
                ((zzah) this.zza).zzaD(zzaiVar);
                return this;
            }

            public zza zzF(int i10) {
                zzbu();
                ((zzah) this.zza).zzaE(i10);
                return this;
            }

            public zza zzG(int i10) {
                zzbu();
                ((zzah) this.zza).zzaF(i10);
                return this;
            }

            public zza zzH(int i10) {
                zzbu();
                ((zzah) this.zza).zzaG(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public zzai zzI() {
                return ((zzah) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzJ() {
                return ((zzah) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzK() {
                return ((zzah) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzL() {
                return ((zzah) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzM() {
                return ((zzah) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzN() {
                return ((zzah) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzO() {
                return ((zzah) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzP() {
                return ((zzah) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzQ() {
                return ((zzah) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzR() {
                return ((zzah) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzS() {
                return ((zzah) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public boolean zzT() {
                return ((zzah) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public int zza() {
                return ((zzah) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public int zzb() {
                return ((zzah) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public int zzc() {
                return ((zzah) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public int zzd() {
                return ((zzah) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public int zze() {
                return ((zzah) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public int zzf() {
                return ((zzah) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public int zzg() {
                return ((zzah) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public int zzh() {
                return ((zzah) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public zzq zzi() {
                return ((zzah) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzak
            public zzq zzj() {
                return ((zzah) this.zza).zzj();
            }

            public zza zzk() {
                zzbu();
                ((zzah) this.zza).zzak();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzah) this.zza).zzal();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzah) this.zza).zzam();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzah) this.zza).zzan();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzah) this.zza).zzao();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzah) this.zza).zzap();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzah) this.zza).zzaq();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzah) this.zza).zzar();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzah) this.zza).zzas();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzah) this.zza).zzat();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzah) this.zza).zzau();
                return this;
            }

            public zza zzv(zzai zzaiVar) {
                zzbu();
                ((zzah) this.zza).zzav(zzaiVar);
                return this;
            }

            public zza zzw(zzq zzqVar) {
                zzbu();
                ((zzah) this.zza).zzaw(zzqVar);
                return this;
            }

            public zza zzx(zzq zzqVar) {
                zzbu();
                ((zzah) this.zza).zzax(zzqVar);
                return this;
            }

            public zza zzy(int i10) {
                zzbu();
                ((zzah) this.zza).zzay(i10);
                return this;
            }

            public zza zzz(int i10) {
                zzbu();
                ((zzah) this.zza).zzaz(i10);
                return this;
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzl = zzahVar;
            zzgxy.zzcb(zzah.class, zzahVar);
        }

        private zzah() {
        }

        public static zzgzr<zzah> zzA() {
            return zzl.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA(int i10) {
            this.zzn |= 8;
            this.zzv = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB(int i10) {
            this.zzn |= 512;
            this.zzB = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC(int i10) {
            this.zzn |= 256;
            this.zzA = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD(zzai zzaiVar) {
            zzaiVar.getClass();
            this.zzC = zzaiVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(int i10) {
            this.zzn |= 4;
            this.zzu = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(int i10) {
            this.zzn |= 32;
            this.zzx = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG(int i10) {
            this.zzn |= 16;
            this.zzw = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal() {
            this.zzn &= -2;
            this.zzo = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam() {
            this.zzn &= -65;
            this.zzy = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan() {
            this.zzn &= -129;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao() {
            this.zzn &= -9;
            this.zzv = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap() {
            this.zzn &= -513;
            this.zzB = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq() {
            this.zzn &= -257;
            this.zzA = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar() {
            this.zzC = null;
            this.zzn &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas() {
            this.zzn &= -5;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat() {
            this.zzn &= -33;
            this.zzx = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau() {
            this.zzn &= -17;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzav(zzai zzaiVar) {
            zzaiVar.getClass();
            zzai zzaiVar2 = this.zzC;
            if (zzaiVar2 != null && zzaiVar2 != zzai.zzf()) {
                zzai.zza zzd2 = zzai.zzd(zzaiVar2);
                zzd2.zzbj(zzaiVar);
                zzaiVar = zzd2.zzbs();
            }
            this.zzC = zzaiVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaw(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzn |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzax(zzq zzqVar) {
            this.zzo = zzqVar.zza();
            this.zzn |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzay(int i10) {
            this.zzn |= 64;
            this.zzy = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz(int i10) {
            this.zzn |= 128;
            this.zzz = i10;
        }

        public static zza zzk() {
            return zzl.zzaZ();
        }

        public static zza zzl(zzah zzahVar) {
            return zzl.zzba(zzahVar);
        }

        public static zzah zzn() {
            return zzl;
        }

        public static zzah zzo(InputStream inputStream) {
            return (zzah) zzgxy.zzbk(zzl, inputStream);
        }

        public static zzah zzp(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzah) zzgxy.zzbl(zzl, inputStream, zzgxiVar);
        }

        public static zzah zzq(zzgwm zzgwmVar) {
            return (zzah) zzgxy.zzbm(zzl, zzgwmVar);
        }

        public static zzah zzr(zzgww zzgwwVar) {
            return (zzah) zzgxy.zzbn(zzl, zzgwwVar);
        }

        public static zzah zzs(InputStream inputStream) {
            return (zzah) zzgxy.zzbo(zzl, inputStream);
        }

        public static zzah zzt(ByteBuffer byteBuffer) {
            return (zzah) zzgxy.zzbp(zzl, byteBuffer);
        }

        public static zzah zzu(byte[] bArr) {
            return (zzah) zzgxy.zzbq(zzl, bArr);
        }

        public static zzah zzv(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzah) zzgxy.zzbr(zzl, zzgwmVar, zzgxiVar);
        }

        public static zzah zzw(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzah) zzgxy.zzbs(zzl, zzgwwVar, zzgxiVar);
        }

        public static zzah zzx(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzah) zzgxy.zzbu(zzl, inputStream, zzgxiVar);
        }

        public static zzah zzy(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzah) zzgxy.zzbv(zzl, byteBuffer, zzgxiVar);
        }

        public static zzah zzz(byte[] bArr, zzgxi zzgxiVar) {
            return (zzah) zzgxy.zzbx(zzl, bArr, zzgxiVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public zzai zzI() {
            zzai zzaiVar = this.zzC;
            if (zzaiVar == null) {
                return zzai.zzf();
            }
            return zzaiVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzJ() {
            if ((this.zzn & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzK() {
            if ((this.zzn & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzL() {
            if ((this.zzn & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzM() {
            if ((this.zzn & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzN() {
            if ((this.zzn & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzO() {
            if ((this.zzn & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzP() {
            if ((this.zzn & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzQ() {
            if ((this.zzn & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzR() {
            if ((this.zzn & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzS() {
            if ((this.zzn & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public boolean zzT() {
            if ((this.zzn & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public int zza() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public int zzb() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public int zzc() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public int zzd() {
            return this.zzB;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzl, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", zzq.zze(), "zzp", zzq.zze(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
                case 3:
                    return new zzah();
                case 4:
                    return new zza(null);
                case 5:
                    return zzl;
                case 6:
                    zzgzr<zzah> zzgzrVar = zzm;
                    if (zzgzrVar == null) {
                        synchronized (zzah.class) {
                            zzgzrVar = zzm;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzl);
                                zzm = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public int zze() {
            return this.zzA;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public int zzf() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public int zzg() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public int zzh() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public zzq zzi() {
            zzq zzb2 = zzq.zzb(this.zzp);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzak
        public zzq zzj() {
            zzq zzb2 = zzq.zzb(this.zzo);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzai extends zzgxy<zzai, zza> implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzc;
        private static volatile zzgzr<zzai> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzai, zza> implements zzaj {
            private zza() {
                super(zzai.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaj
            public int zza() {
                return ((zzai) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaj
            public int zzb() {
                return ((zzai) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzai) this.zza).zzz();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzai) this.zza).zzA();
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzai) this.zza).zzB(i10);
                return this;
            }

            public zza zzf(int i10) {
                zzbu();
                ((zzai) this.zza).zzC(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaj
            public boolean zzg() {
                return ((zzai) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaj
            public boolean zzh() {
                return ((zzai) this.zza).zzh();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzc = zzaiVar;
            zzgxy.zzcb(zzai.class, zzaiVar);
        }

        private zzai() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB(int i10) {
            this.zze |= 1;
            this.zzf = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(int i10) {
            this.zze |= 2;
            this.zzg = i10;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzai zzaiVar) {
            return zzc.zzba(zzaiVar);
        }

        public static zzai zzf() {
            return zzc;
        }

        public static zzai zzi(InputStream inputStream) {
            return (zzai) zzgxy.zzbk(zzc, inputStream);
        }

        public static zzai zzj(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzai) zzgxy.zzbl(zzc, inputStream, zzgxiVar);
        }

        public static zzai zzk(zzgwm zzgwmVar) {
            return (zzai) zzgxy.zzbm(zzc, zzgwmVar);
        }

        public static zzai zzl(zzgww zzgwwVar) {
            return (zzai) zzgxy.zzbn(zzc, zzgwwVar);
        }

        public static zzai zzm(InputStream inputStream) {
            return (zzai) zzgxy.zzbo(zzc, inputStream);
        }

        public static zzai zzn(ByteBuffer byteBuffer) {
            return (zzai) zzgxy.zzbp(zzc, byteBuffer);
        }

        public static zzai zzo(byte[] bArr) {
            return (zzai) zzgxy.zzbq(zzc, bArr);
        }

        public static zzai zzp(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzai) zzgxy.zzbr(zzc, zzgwmVar, zzgxiVar);
        }

        public static zzai zzq(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzai) zzgxy.zzbs(zzc, zzgwwVar, zzgxiVar);
        }

        public static zzai zzr(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzai) zzgxy.zzbu(zzc, inputStream, zzgxiVar);
        }

        public static zzai zzs(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzai) zzgxy.zzbv(zzc, byteBuffer, zzgxiVar);
        }

        public static zzai zzt(byte[] bArr, zzgxi zzgxiVar) {
            return (zzai) zzgxy.zzbx(zzc, bArr, zzgxiVar);
        }

        public static zzgzr<zzai> zzu() {
            return zzc.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzz() {
            this.zze &= -2;
            this.zzf = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaj
        public int zza() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaj
        public int zzb() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 3:
                    return new zzai();
                case 4:
                    return new zza(null);
                case 5:
                    return zzc;
                case 6:
                    zzgzr<zzai> zzgzrVar = zzd;
                    if (zzgzrVar == null) {
                        synchronized (zzai.class) {
                            zzgzrVar = zzd;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzc);
                                zzd = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaj
        public boolean zzg() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaj
        public boolean zzh() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzaj extends zzgzk {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzak extends zzgzk {
        zzai zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        boolean zzM();

        boolean zzN();

        boolean zzO();

        boolean zzP();

        boolean zzQ();

        boolean zzR();

        boolean zzS();

        boolean zzT();

        int zza();

        int zzb();

        int zzc();

        int zzd();

        int zze();

        int zzf();

        int zzg();

        int zzh();

        zzq zzi();

        zzq zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzal extends zzgxy<zzal, zza> implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzc;
        private static volatile zzgzr<zzal> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzal, zza> implements zzam {
            private zza() {
                super(zzal.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzam
            public int zza() {
                return ((zzal) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzam
            public int zzb() {
                return ((zzal) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzal) this.zza).zzz();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzal) this.zza).zzA();
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzal) this.zza).zzB(i10);
                return this;
            }

            public zza zzf(int i10) {
                zzbu();
                ((zzal) this.zza).zzC(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzam
            public boolean zzg() {
                return ((zzal) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzam
            public boolean zzh() {
                return ((zzal) this.zza).zzh();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzal zzalVar = new zzal();
            zzc = zzalVar;
            zzgxy.zzcb(zzal.class, zzalVar);
        }

        private zzal() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB(int i10) {
            this.zze |= 2;
            this.zzg = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(int i10) {
            this.zze |= 1;
            this.zzf = i10;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzal zzalVar) {
            return zzc.zzba(zzalVar);
        }

        public static zzal zzf() {
            return zzc;
        }

        public static zzal zzi(InputStream inputStream) {
            return (zzal) zzgxy.zzbk(zzc, inputStream);
        }

        public static zzal zzj(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzal) zzgxy.zzbl(zzc, inputStream, zzgxiVar);
        }

        public static zzal zzk(zzgwm zzgwmVar) {
            return (zzal) zzgxy.zzbm(zzc, zzgwmVar);
        }

        public static zzal zzl(zzgww zzgwwVar) {
            return (zzal) zzgxy.zzbn(zzc, zzgwwVar);
        }

        public static zzal zzm(InputStream inputStream) {
            return (zzal) zzgxy.zzbo(zzc, inputStream);
        }

        public static zzal zzn(ByteBuffer byteBuffer) {
            return (zzal) zzgxy.zzbp(zzc, byteBuffer);
        }

        public static zzal zzo(byte[] bArr) {
            return (zzal) zzgxy.zzbq(zzc, bArr);
        }

        public static zzal zzp(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzal) zzgxy.zzbr(zzc, zzgwmVar, zzgxiVar);
        }

        public static zzal zzq(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzal) zzgxy.zzbs(zzc, zzgwwVar, zzgxiVar);
        }

        public static zzal zzr(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzal) zzgxy.zzbu(zzc, inputStream, zzgxiVar);
        }

        public static zzal zzs(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzal) zzgxy.zzbv(zzc, byteBuffer, zzgxiVar);
        }

        public static zzal zzt(byte[] bArr, zzgxi zzgxiVar) {
            return (zzal) zzgxy.zzbx(zzc, bArr, zzgxiVar);
        }

        public static zzgzr<zzal> zzu() {
            return zzc.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzz() {
            this.zze &= -3;
            this.zzg = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzam
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzam
        public int zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 3:
                    return new zzal();
                case 4:
                    return new zza(null);
                case 5:
                    return zzc;
                case 6:
                    zzgzr<zzal> zzgzrVar = zzd;
                    if (zzgzrVar == null) {
                        synchronized (zzal.class) {
                            zzgzrVar = zzd;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzc);
                                zzd = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzam
        public boolean zzg() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzam
        public boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzam extends zzgzk {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzan extends zzgxy<zzan, zza> implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzd;
        private static volatile zzgzr<zzan> zze;
        private int zzf;
        private String zzg = "";
        private int zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzan, zza> implements zzao {
            private zza() {
                super(zzan.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzao
            public zzq zza() {
                return ((zzan) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzan) this.zza).zzH();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzan) this.zza).zzI();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzan) this.zza).zzJ();
                return this;
            }

            public zza zze(zzap zzapVar) {
                zzbu();
                ((zzan) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzf(String str) {
                zzbu();
                ((zzan) this.zza).zzL(str);
                return this;
            }

            public zza zzg(zzgwm zzgwmVar) {
                zzbu();
                ((zzan) this.zza).zzM(zzgwmVar);
                return this;
            }

            public zza zzh(zzap.zza zzaVar) {
                zzbu();
                ((zzan) this.zza).zzN(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbu();
                ((zzan) this.zza).zzN(zzapVar);
                return this;
            }

            public zza zzj(zzq zzqVar) {
                zzbu();
                ((zzan) this.zza).zzO(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzao
            public zzap zzk() {
                return ((zzan) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzao
            public zzgwm zzl() {
                return ((zzan) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzao
            public String zzm() {
                return ((zzan) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzao
            public boolean zzn() {
                return ((zzan) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzao
            public boolean zzo() {
                return ((zzan) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzao
            public boolean zzp() {
                return ((zzan) this.zza).zzp();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzd = zzanVar;
            zzgxy.zzcb(zzan.class, zzanVar);
        }

        private zzan() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzf &= -2;
            this.zzg = zzf().zzm();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzgwm zzgwmVar) {
            this.zzg = zzgwmVar.zzx();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(zzq zzqVar) {
            this.zzh = zzqVar.zza();
            this.zzf |= 2;
        }

        public static zza zzc() {
            return zzd.zzaZ();
        }

        public static zza zzd(zzan zzanVar) {
            return zzd.zzba(zzanVar);
        }

        public static zzan zzf() {
            return zzd;
        }

        public static zzan zzg(InputStream inputStream) {
            return (zzan) zzgxy.zzbk(zzd, inputStream);
        }

        public static zzan zzh(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzan) zzgxy.zzbl(zzd, inputStream, zzgxiVar);
        }

        public static zzan zzi(zzgwm zzgwmVar) {
            return (zzan) zzgxy.zzbm(zzd, zzgwmVar);
        }

        public static zzan zzj(zzgww zzgwwVar) {
            return (zzan) zzgxy.zzbn(zzd, zzgwwVar);
        }

        public static zzan zzq(InputStream inputStream) {
            return (zzan) zzgxy.zzbo(zzd, inputStream);
        }

        public static zzan zzr(ByteBuffer byteBuffer) {
            return (zzan) zzgxy.zzbp(zzd, byteBuffer);
        }

        public static zzan zzs(byte[] bArr) {
            return (zzan) zzgxy.zzbq(zzd, bArr);
        }

        public static zzan zzt(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzan) zzgxy.zzbr(zzd, zzgwmVar, zzgxiVar);
        }

        public static zzan zzu(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzan) zzgxy.zzbs(zzd, zzgwwVar, zzgxiVar);
        }

        public static zzan zzv(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzan) zzgxy.zzbu(zzd, inputStream, zzgxiVar);
        }

        public static zzan zzw(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzan) zzgxy.zzbv(zzd, byteBuffer, zzgxiVar);
        }

        public static zzan zzx(byte[] bArr, zzgxi zzgxiVar) {
            return (zzan) zzgxy.zzbx(zzd, bArr, zzgxiVar);
        }

        public static zzgzr<zzan> zzy() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzao
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzh);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", zzq.zze(), "zzi"});
                case 3:
                    return new zzan();
                case 4:
                    return new zza(null);
                case 5:
                    return zzd;
                case 6:
                    zzgzr<zzan> zzgzrVar = zze;
                    if (zzgzrVar == null) {
                        synchronized (zzan.class) {
                            zzgzrVar = zze;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzd);
                                zze = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzao
        public zzap zzk() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzao
        public zzgwm zzl() {
            return zzgwm.zzw(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzao
        public String zzm() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzao
        public boolean zzn() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzao
        public boolean zzo() {
            if ((this.zzf & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzao
        public boolean zzp() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzao extends zzgzk {
        zzq zza();

        zzap zzk();

        zzgwm zzl();

        String zzm();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzap extends zzgxy<zzap, zza> implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzc;
        private static volatile zzgzr<zzap> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzap, zza> implements zzaq {
            private zza() {
                super(zzap.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaq
            public int zza() {
                return ((zzap) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaq
            public int zzb() {
                return ((zzap) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzap) this.zza).zzz();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzap) this.zza).zzA();
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzap) this.zza).zzB(i10);
                return this;
            }

            public zza zzf(int i10) {
                zzbu();
                ((zzap) this.zza).zzC(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaq
            public boolean zzg() {
                return ((zzap) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaq
            public boolean zzh() {
                return ((zzap) this.zza).zzh();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzc = zzapVar;
            zzgxy.zzcb(zzap.class, zzapVar);
        }

        private zzap() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB(int i10) {
            this.zze |= 2;
            this.zzg = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(int i10) {
            this.zze |= 1;
            this.zzf = i10;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzap zzapVar) {
            return zzc.zzba(zzapVar);
        }

        public static zzap zzf() {
            return zzc;
        }

        public static zzap zzi(InputStream inputStream) {
            return (zzap) zzgxy.zzbk(zzc, inputStream);
        }

        public static zzap zzj(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzap) zzgxy.zzbl(zzc, inputStream, zzgxiVar);
        }

        public static zzap zzk(zzgwm zzgwmVar) {
            return (zzap) zzgxy.zzbm(zzc, zzgwmVar);
        }

        public static zzap zzl(zzgww zzgwwVar) {
            return (zzap) zzgxy.zzbn(zzc, zzgwwVar);
        }

        public static zzap zzm(InputStream inputStream) {
            return (zzap) zzgxy.zzbo(zzc, inputStream);
        }

        public static zzap zzn(ByteBuffer byteBuffer) {
            return (zzap) zzgxy.zzbp(zzc, byteBuffer);
        }

        public static zzap zzo(byte[] bArr) {
            return (zzap) zzgxy.zzbq(zzc, bArr);
        }

        public static zzap zzp(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzap) zzgxy.zzbr(zzc, zzgwmVar, zzgxiVar);
        }

        public static zzap zzq(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzap) zzgxy.zzbs(zzc, zzgwwVar, zzgxiVar);
        }

        public static zzap zzr(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzap) zzgxy.zzbu(zzc, inputStream, zzgxiVar);
        }

        public static zzap zzs(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzap) zzgxy.zzbv(zzc, byteBuffer, zzgxiVar);
        }

        public static zzap zzt(byte[] bArr, zzgxi zzgxiVar) {
            return (zzap) zzgxy.zzbx(zzc, bArr, zzgxiVar);
        }

        public static zzgzr<zzap> zzu() {
            return zzc.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzz() {
            this.zze &= -3;
            this.zzg = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaq
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaq
        public int zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 3:
                    return new zzap();
                case 4:
                    return new zza(null);
                case 5:
                    return zzc;
                case 6:
                    zzgzr<zzap> zzgzrVar = zzd;
                    if (zzgzrVar == null) {
                        synchronized (zzap.class) {
                            zzgzrVar = zzd;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzc);
                                zzd = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaq
        public boolean zzg() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaq
        public boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzaq extends zzgzk {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzar extends zzgxy<zzar, zza> implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzd;
        private static volatile zzgzr<zzar> zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzar, zza> implements zzas {
            private zza() {
                super(zzar.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzas
            public int zza() {
                return ((zzar) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzas
            public int zzb() {
                return ((zzar) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzas
            public int zzc() {
                return ((zzar) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzar) this.zza).zzD();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzar) this.zza).zzE();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzar) this.zza).zzF();
                return this;
            }

            public zza zzg(int i10) {
                zzbu();
                ((zzar) this.zza).zzG(i10);
                return this;
            }

            public zza zzh(int i10) {
                zzbu();
                ((zzar) this.zza).zzH(i10);
                return this;
            }

            public zza zzi(int i10) {
                zzbu();
                ((zzar) this.zza).zzI(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzas
            public boolean zzj() {
                return ((zzar) this.zza).zzj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzas
            public boolean zzk() {
                return ((zzar) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzas
            public boolean zzl() {
                return ((zzar) this.zza).zzl();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzd = zzarVar;
            zzgxy.zzcb(zzar.class, zzarVar);
        }

        private zzar() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD() {
            this.zzf &= -2;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE() {
            this.zzf &= -5;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG(int i10) {
            this.zzf |= 1;
            this.zzg = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH(int i10) {
            this.zzf |= 4;
            this.zzi = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(int i10) {
            this.zzf |= 2;
            this.zzh = i10;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zze(zzar zzarVar) {
            return zzd.zzba(zzarVar);
        }

        public static zzar zzg() {
            return zzd;
        }

        public static zzar zzh(InputStream inputStream) {
            return (zzar) zzgxy.zzbk(zzd, inputStream);
        }

        public static zzar zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzar) zzgxy.zzbl(zzd, inputStream, zzgxiVar);
        }

        public static zzar zzm(zzgwm zzgwmVar) {
            return (zzar) zzgxy.zzbm(zzd, zzgwmVar);
        }

        public static zzar zzn(zzgww zzgwwVar) {
            return (zzar) zzgxy.zzbn(zzd, zzgwwVar);
        }

        public static zzar zzo(InputStream inputStream) {
            return (zzar) zzgxy.zzbo(zzd, inputStream);
        }

        public static zzar zzp(ByteBuffer byteBuffer) {
            return (zzar) zzgxy.zzbp(zzd, byteBuffer);
        }

        public static zzar zzq(byte[] bArr) {
            return (zzar) zzgxy.zzbq(zzd, bArr);
        }

        public static zzar zzr(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzar) zzgxy.zzbr(zzd, zzgwmVar, zzgxiVar);
        }

        public static zzar zzs(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzar) zzgxy.zzbs(zzd, zzgwwVar, zzgxiVar);
        }

        public static zzar zzt(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzar) zzgxy.zzbu(zzd, inputStream, zzgxiVar);
        }

        public static zzar zzu(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzar) zzgxy.zzbv(zzd, byteBuffer, zzgxiVar);
        }

        public static zzar zzv(byte[] bArr, zzgxi zzgxiVar) {
            return (zzar) zzgxy.zzbx(zzd, bArr, zzgxiVar);
        }

        public static zzgzr<zzar> zzw() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzas
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzas
        public int zzb() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzas
        public int zzc() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                case 3:
                    return new zzar();
                case 4:
                    return new zza(null);
                case 5:
                    return zzd;
                case 6:
                    zzgzr<zzar> zzgzrVar = zze;
                    if (zzgzrVar == null) {
                        synchronized (zzar.class) {
                            zzgzrVar = zze;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzd);
                                zze = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzas
        public boolean zzj() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzas
        public boolean zzk() {
            if ((this.zzf & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzas
        public boolean zzl() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzas extends zzgzk {
        int zza();

        int zzb();

        int zzc();

        boolean zzj();

        boolean zzk();

        boolean zzl();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzat extends zzgxy<zzat, zza> implements zzbi {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        public static final int zze = 9;
        public static final int zzf = 10;
        public static final int zzg = 11;
        public static final int zzh = 12;
        public static final int zzi = 13;
        public static final int zzj = 14;
        public static final int zzk = 15;
        public static final int zzl = 16;
        public static final int zzm = 17;
        public static final int zzn = 18;
        public static final int zzo = 19;
        public static final int zzp = 20;
        private static final zzat zzu;
        private static volatile zzgzr<zzat> zzv;
        private zzbj zzA;
        private zzau zzB;
        private zzbc zzC;
        private zzay zzD;
        private int zzE;
        private int zzF;
        private zzap zzG;
        private int zzH;
        private int zzI;
        private int zzJ;
        private int zzK;
        private int zzL;
        private long zzM;
        private int zzw;
        private zzba zzx;
        private zzbe zzy;
        private zzbg zzz;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzat, zza> implements zzbi {
            private zza() {
                super(zzat.zzu);
            }

            public zza zzA(zzay zzayVar) {
                zzbu();
                ((zzat) this.zza).zzcy(zzayVar);
                return this;
            }

            public zza zzB(zzba zzbaVar) {
                zzbu();
                ((zzat) this.zza).zzcz(zzbaVar);
                return this;
            }

            public zza zzC(zzbc zzbcVar) {
                zzbu();
                ((zzat) this.zza).zzcA(zzbcVar);
                return this;
            }

            public zza zzD(zzbe zzbeVar) {
                zzbu();
                ((zzat) this.zza).zzcB(zzbeVar);
                return this;
            }

            public zza zzE(zzbg zzbgVar) {
                zzbu();
                ((zzat) this.zza).zzcC(zzbgVar);
                return this;
            }

            public zza zzF(zzap zzapVar) {
                zzbu();
                ((zzat) this.zza).zzcD(zzapVar);
                return this;
            }

            public zza zzG(zzbj zzbjVar) {
                zzbu();
                ((zzat) this.zza).zzcE(zzbjVar);
                return this;
            }

            public zza zzH(zzau.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zza zzI(zzau zzauVar) {
                zzbu();
                ((zzat) this.zza).zzcF(zzauVar);
                return this;
            }

            public zza zzJ(zzay.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcG(zzaVar.zzbr());
                return this;
            }

            public zza zzK(zzay zzayVar) {
                zzbu();
                ((zzat) this.zza).zzcG(zzayVar);
                return this;
            }

            public zza zzL(zzba.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zza zzM(zzba zzbaVar) {
                zzbu();
                ((zzat) this.zza).zzcH(zzbaVar);
                return this;
            }

            public zza zzN(zzbc.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcI(zzaVar.zzbr());
                return this;
            }

            public zza zzO(zzbc zzbcVar) {
                zzbu();
                ((zzat) this.zza).zzcI(zzbcVar);
                return this;
            }

            public zza zzP(zzbe.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zza zzQ(zzbe zzbeVar) {
                zzbu();
                ((zzat) this.zza).zzcJ(zzbeVar);
                return this;
            }

            public zza zzR(zzbg.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcK(zzaVar.zzbr());
                return this;
            }

            public zza zzS(zzbg zzbgVar) {
                zzbu();
                ((zzat) this.zza).zzcK(zzbgVar);
                return this;
            }

            public zza zzT(int i10) {
                zzbu();
                ((zzat) this.zza).zzcL(i10);
                return this;
            }

            public zza zzU(int i10) {
                zzbu();
                ((zzat) this.zza).zzcM(i10);
                return this;
            }

            public zza zzV(int i10) {
                zzbu();
                ((zzat) this.zza).zzcN(i10);
                return this;
            }

            public zza zzW(int i10) {
                zzbu();
                ((zzat) this.zza).zzcO(i10);
                return this;
            }

            public zza zzX(int i10) {
                zzbu();
                ((zzat) this.zza).zzcP(i10);
                return this;
            }

            public zza zzY(int i10) {
                zzbu();
                ((zzat) this.zza).zzcQ(i10);
                return this;
            }

            public zza zzZ(int i10) {
                zzbu();
                ((zzat) this.zza).zzcR(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public int zza() {
                return ((zzat) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzaA() {
                return ((zzat) this.zza).zzaA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzaB() {
                return ((zzat) this.zza).zzaB();
            }

            public zza zzaa(zzap.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcS(zzaVar.zzbr());
                return this;
            }

            public zza zzab(zzap zzapVar) {
                zzbu();
                ((zzat) this.zza).zzcS(zzapVar);
                return this;
            }

            public zza zzac(long j10) {
                zzbu();
                ((zzat) this.zza).zzcT(j10);
                return this;
            }

            public zza zzad(zzbj.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcU(zzaVar.zzbr());
                return this;
            }

            public zza zzae(zzbj zzbjVar) {
                zzbu();
                ((zzat) this.zza).zzcU(zzbjVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public zzau zzaf() {
                return ((zzat) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public zzay zzag() {
                return ((zzat) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public zzba zzah() {
                return ((zzat) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public zzbc zzai() {
                return ((zzat) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public zzbe zzaj() {
                return ((zzat) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public zzbg zzak() {
                return ((zzat) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public zzbj zzal() {
                return ((zzat) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzam() {
                return ((zzat) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzan() {
                return ((zzat) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzao() {
                return ((zzat) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzap() {
                return ((zzat) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzaq() {
                return ((zzat) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzar() {
                return ((zzat) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzas() {
                return ((zzat) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzat() {
                return ((zzat) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzau() {
                return ((zzat) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzav() {
                return ((zzat) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzaw() {
                return ((zzat) this.zza).zzaw();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzax() {
                return ((zzat) this.zza).zzax();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzay() {
                return ((zzat) this.zza).zzay();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public boolean zzaz() {
                return ((zzat) this.zza).zzaz();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public int zzb() {
                return ((zzat) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public int zzc() {
                return ((zzat) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public int zzd() {
                return ((zzat) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public int zze() {
                return ((zzat) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public int zzf() {
                return ((zzat) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public int zzg() {
                return ((zzat) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public long zzh() {
                return ((zzat) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
            public zzap zzi() {
                return ((zzat) this.zza).zzi();
            }

            public zza zzj() {
                zzbu();
                ((zzat) this.zza).zzch();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzat) this.zza).zzci();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzat) this.zza).zzcj();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzat) this.zza).zzck();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzat) this.zza).zzcl();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzat) this.zza).zzcm();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzat) this.zza).zzcn();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzat) this.zza).zzco();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzat) this.zza).zzcp();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzat) this.zza).zzcq();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzat) this.zza).zzcr();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzat) this.zza).zzcs();
                return this;
            }

            public zza zzv() {
                zzbu();
                ((zzat) this.zza).zzct();
                return this;
            }

            public zza zzw() {
                zzbu();
                ((zzat) this.zza).zzcu();
                return this;
            }

            public zza zzx() {
                zzbu();
                ((zzat) this.zza).zzcv();
                return this;
            }

            public zza zzy() {
                zzbu();
                ((zzat) this.zza).zzcw();
                return this;
            }

            public zza zzz(zzau zzauVar) {
                zzbu();
                ((zzat) this.zza).zzcx(zzauVar);
                return this;
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzu = zzatVar;
            zzgxy.zzcb(zzat.class, zzatVar);
        }

        private zzat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(zzbc zzbcVar) {
            zzbcVar.getClass();
            zzbc zzbcVar2 = this.zzC;
            if (zzbcVar2 != null && zzbcVar2 != zzbc.zzg()) {
                zzbc.zza zze2 = zzbc.zze(zzbcVar2);
                zze2.zzbj(zzbcVar);
                zzbcVar = zze2.zzbs();
            }
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(zzbe zzbeVar) {
            zzbeVar.getClass();
            zzbe zzbeVar2 = this.zzy;
            if (zzbeVar2 != null && zzbeVar2 != zzbe.zzj()) {
                zzbe.zza zzh2 = zzbe.zzh(zzbeVar2);
                zzh2.zzbj(zzbeVar);
                zzbeVar = zzh2.zzbs();
            }
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(zzbg zzbgVar) {
            zzbgVar.getClass();
            zzbg zzbgVar2 = this.zzz;
            if (zzbgVar2 != null && zzbgVar2 != zzbg.zzg()) {
                zzbg.zza zze2 = zzbg.zze(zzbgVar2);
                zze2.zzbj(zzbgVar);
                zzbgVar = zze2.zzbs();
            }
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzG;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzG = zzapVar;
            this.zzw |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(zzbj zzbjVar) {
            zzbjVar.getClass();
            zzbj zzbjVar2 = this.zzA;
            if (zzbjVar2 != null && zzbjVar2 != zzbj.zzf()) {
                zzbj.zza zzd2 = zzbj.zzd(zzbjVar2);
                zzd2.zzbj(zzbjVar);
                zzbjVar = zzd2.zzbs();
            }
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzau zzauVar) {
            zzauVar.getClass();
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(zzay zzayVar) {
            zzayVar.getClass();
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzba zzbaVar) {
            zzbaVar.getClass();
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(zzbc zzbcVar) {
            zzbcVar.getClass();
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(zzbe zzbeVar) {
            zzbeVar.getClass();
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(zzbg zzbgVar) {
            zzbgVar.getClass();
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcL(int i10) {
            this.zzw |= 8192;
            this.zzK = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcM(int i10) {
            this.zzw |= 16384;
            this.zzL = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcN(int i10) {
            this.zzw |= 1024;
            this.zzH = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcO(int i10) {
            this.zzw |= 128;
            this.zzE = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcP(int i10) {
            this.zzw |= 256;
            this.zzF = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcQ(int i10) {
            this.zzw |= 2048;
            this.zzI = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcR(int i10) {
            this.zzw |= 4096;
            this.zzJ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcS(zzap zzapVar) {
            zzapVar.getClass();
            this.zzG = zzapVar;
            this.zzw |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcT(long j10) {
            this.zzw |= Variant.VT_RESERVED;
            this.zzM = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcU(zzbj zzbjVar) {
            zzbjVar.getClass();
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzB = null;
            this.zzw &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzD = null;
            this.zzw &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzx = null;
            this.zzw &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzC = null;
            this.zzw &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzy = null;
            this.zzw &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzz = null;
            this.zzw &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzw &= -8193;
            this.zzK = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco() {
            this.zzw &= -16385;
            this.zzL = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp() {
            this.zzw &= -1025;
            this.zzH = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq() {
            this.zzw &= -129;
            this.zzE = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr() {
            this.zzw &= -257;
            this.zzF = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcs() {
            this.zzw &= -2049;
            this.zzI = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct() {
            this.zzw &= -4097;
            this.zzJ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu() {
            this.zzG = null;
            this.zzw &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv() {
            this.zzw &= -32769;
            this.zzM = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw() {
            this.zzA = null;
            this.zzw &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzau zzauVar) {
            zzauVar.getClass();
            zzau zzauVar2 = this.zzB;
            if (zzauVar2 != null && zzauVar2 != zzau.zzf()) {
                zzau.zza zzd2 = zzau.zzd(zzauVar2);
                zzd2.zzbj(zzauVar);
                zzauVar = zzd2.zzbs();
            }
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zzay zzayVar) {
            zzayVar.getClass();
            zzay zzayVar2 = this.zzD;
            if (zzayVar2 != null && zzayVar2 != zzay.zzh()) {
                zzay.zza zzf2 = zzay.zzf(zzayVar2);
                zzf2.zzbj(zzayVar);
                zzayVar = zzf2.zzbs();
            }
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(zzba zzbaVar) {
            zzbaVar.getClass();
            zzba zzbaVar2 = this.zzx;
            if (zzbaVar2 != null && zzbaVar2 != zzba.zzi()) {
                zzba.zza zzg2 = zzba.zzg(zzbaVar2);
                zzg2.zzbj(zzbaVar);
                zzbaVar = zzg2.zzbs();
            }
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        public static zza zzj() {
            return zzu.zzaZ();
        }

        public static zza zzk(zzat zzatVar) {
            return zzu.zzba(zzatVar);
        }

        public static zzat zzm() {
            return zzu;
        }

        public static zzat zzn(InputStream inputStream) {
            return (zzat) zzgxy.zzbk(zzu, inputStream);
        }

        public static zzat zzo(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzat) zzgxy.zzbl(zzu, inputStream, zzgxiVar);
        }

        public static zzat zzp(zzgwm zzgwmVar) {
            return (zzat) zzgxy.zzbm(zzu, zzgwmVar);
        }

        public static zzat zzq(zzgww zzgwwVar) {
            return (zzat) zzgxy.zzbn(zzu, zzgwwVar);
        }

        public static zzat zzr(InputStream inputStream) {
            return (zzat) zzgxy.zzbo(zzu, inputStream);
        }

        public static zzat zzs(ByteBuffer byteBuffer) {
            return (zzat) zzgxy.zzbp(zzu, byteBuffer);
        }

        public static zzat zzt(byte[] bArr) {
            return (zzat) zzgxy.zzbq(zzu, bArr);
        }

        public static zzat zzu(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzat) zzgxy.zzbr(zzu, zzgwmVar, zzgxiVar);
        }

        public static zzat zzv(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzat) zzgxy.zzbs(zzu, zzgwwVar, zzgxiVar);
        }

        public static zzat zzw(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzat) zzgxy.zzbu(zzu, inputStream, zzgxiVar);
        }

        public static zzat zzx(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzat) zzgxy.zzbv(zzu, byteBuffer, zzgxiVar);
        }

        public static zzat zzy(byte[] bArr, zzgxi zzgxiVar) {
            return (zzat) zzgxy.zzbx(zzu, bArr, zzgxiVar);
        }

        public static zzgzr<zzat> zzz() {
            return zzu.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public int zza() {
            return this.zzK;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzaA() {
            if ((this.zzw & Variant.VT_RESERVED) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzaB() {
            if ((this.zzw & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public zzau zzaf() {
            zzau zzauVar = this.zzB;
            if (zzauVar == null) {
                return zzau.zzf();
            }
            return zzauVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public zzay zzag() {
            zzay zzayVar = this.zzD;
            if (zzayVar == null) {
                return zzay.zzh();
            }
            return zzayVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public zzba zzah() {
            zzba zzbaVar = this.zzx;
            if (zzbaVar == null) {
                return zzba.zzi();
            }
            return zzbaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public zzbc zzai() {
            zzbc zzbcVar = this.zzC;
            if (zzbcVar == null) {
                return zzbc.zzg();
            }
            return zzbcVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public zzbe zzaj() {
            zzbe zzbeVar = this.zzy;
            if (zzbeVar == null) {
                return zzbe.zzj();
            }
            return zzbeVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public zzbg zzak() {
            zzbg zzbgVar = this.zzz;
            if (zzbgVar == null) {
                return zzbg.zzg();
            }
            return zzbgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public zzbj zzal() {
            zzbj zzbjVar = this.zzA;
            if (zzbjVar == null) {
                return zzbj.zzf();
            }
            return zzbjVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzam() {
            if ((this.zzw & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzan() {
            if ((this.zzw & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzao() {
            if ((this.zzw & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzap() {
            if ((this.zzw & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzaq() {
            if ((this.zzw & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzar() {
            if ((this.zzw & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzas() {
            if ((this.zzw & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzat() {
            if ((this.zzw & 16384) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzau() {
            if ((this.zzw & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzav() {
            if ((this.zzw & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzaw() {
            if ((this.zzw & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzax() {
            if ((this.zzw & 2048) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzay() {
            if ((this.zzw & 4096) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public boolean zzaz() {
            if ((this.zzw & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public int zzb() {
            return this.zzL;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public int zzc() {
            return this.zzH;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public int zzd() {
            return this.zzE;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzu, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
                case 3:
                    return new zzat();
                case 4:
                    return new zza(null);
                case 5:
                    return zzu;
                case 6:
                    zzgzr<zzat> zzgzrVar = zzv;
                    if (zzgzrVar == null) {
                        synchronized (zzat.class) {
                            zzgzrVar = zzv;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzu);
                                zzv = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public int zze() {
            return this.zzF;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public int zzf() {
            return this.zzI;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public int zzg() {
            return this.zzJ;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public long zzh() {
            return this.zzM;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbi
        public zzap zzi() {
            zzap zzapVar = this.zzG;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzau extends zzgxy<zzau, zza> implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzd;
        private static volatile zzgzr<zzau> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzau, zza> implements zzav {
            private zza() {
                super(zzau.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzav
            public zzq zza() {
                return ((zzau) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzav
            public zzap zzb() {
                return ((zzau) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzau) this.zza).zzF();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzau) this.zza).zzG();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzau) this.zza).zzH();
                return this;
            }

            public zza zzf(zzaw zzawVar) {
                zzbu();
                ((zzau) this.zza).zzI(zzawVar);
                return this;
            }

            public zza zzg(zzap zzapVar) {
                zzbu();
                ((zzau) this.zza).zzJ(zzapVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbu();
                ((zzau) this.zza).zzK(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbu();
                ((zzau) this.zza).zzK(zzawVar);
                return this;
            }

            public zza zzj(zzap.zza zzaVar) {
                zzbu();
                ((zzau) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbu();
                ((zzau) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzl(zzq zzqVar) {
                zzbu();
                ((zzau) this.zza).zzM(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzav
            public zzaw zzm() {
                return ((zzau) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzav
            public boolean zzn() {
                return ((zzau) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzav
            public boolean zzo() {
                return ((zzau) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzav
            public boolean zzp() {
                return ((zzau) this.zza).zzp();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzau zzauVar = new zzau();
            zzd = zzauVar;
            zzgxy.zzcb(zzau.class, zzauVar);
        }

        private zzau() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzc() {
            return zzd.zzaZ();
        }

        public static zza zzd(zzau zzauVar) {
            return zzd.zzba(zzauVar);
        }

        public static zzau zzf() {
            return zzd;
        }

        public static zzau zzg(InputStream inputStream) {
            return (zzau) zzgxy.zzbk(zzd, inputStream);
        }

        public static zzau zzh(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzau) zzgxy.zzbl(zzd, inputStream, zzgxiVar);
        }

        public static zzau zzi(zzgwm zzgwmVar) {
            return (zzau) zzgxy.zzbm(zzd, zzgwmVar);
        }

        public static zzau zzj(zzgww zzgwwVar) {
            return (zzau) zzgxy.zzbn(zzd, zzgwwVar);
        }

        public static zzau zzk(InputStream inputStream) {
            return (zzau) zzgxy.zzbo(zzd, inputStream);
        }

        public static zzau zzl(ByteBuffer byteBuffer) {
            return (zzau) zzgxy.zzbp(zzd, byteBuffer);
        }

        public static zzau zzq(byte[] bArr) {
            return (zzau) zzgxy.zzbq(zzd, bArr);
        }

        public static zzau zzr(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzau) zzgxy.zzbr(zzd, zzgwmVar, zzgxiVar);
        }

        public static zzau zzs(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzau) zzgxy.zzbs(zzd, zzgwwVar, zzgxiVar);
        }

        public static zzau zzt(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzau) zzgxy.zzbu(zzd, inputStream, zzgxiVar);
        }

        public static zzau zzu(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzau) zzgxy.zzbv(zzd, byteBuffer, zzgxiVar);
        }

        public static zzau zzv(byte[] bArr, zzgxi zzgxiVar) {
            return (zzau) zzgxy.zzbx(zzd, bArr, zzgxiVar);
        }

        public static zzgzr<zzau> zzw() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzav
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzav
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
                case 3:
                    return new zzau();
                case 4:
                    return new zza(null);
                case 5:
                    return zzd;
                case 6:
                    zzgzr<zzau> zzgzrVar = zze;
                    if (zzgzrVar == null) {
                        synchronized (zzau.class) {
                            zzgzrVar = zze;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzd);
                                zze = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzav
        public zzaw zzm() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzav
        public boolean zzn() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzav
        public boolean zzo() {
            if ((this.zzf & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzav
        public boolean zzp() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzav extends zzgzk {
        zzq zza();

        zzap zzb();

        zzaw zzm();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzaw extends zzgxy<zzaw, zza> implements zzax {
        public static final int zza = 1;
        private static final zzaw zzb;
        private static volatile zzgzr<zzaw> zzc;
        private int zzd;
        private int zze;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzaw, zza> implements zzax {
            private zza() {
                super(zzaw.zzb);
            }

            public zza zza() {
                zzbu();
                ((zzaw) this.zza).zzw();
                return this;
            }

            public zza zzb(zzb zzbVar) {
                zzbu();
                ((zzaw) this.zza).zzx(zzbVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzax
            public zzb zzc() {
                return ((zzaw) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzax
            public boolean zzd() {
                return ((zzaw) this.zza).zzd();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public enum zzb implements zzgyc {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);
            
            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 3;
            private static final zzgyd<zzb> zzi = new zzgyd<zzb>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzaw.zzb.1
                /* renamed from: zza */
                public zzb zzb(int i10) {
                    return zzb.zzb(i10);
                }
            };
            private final int zzk;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* loaded from: classes2.dex */
            public final class zza implements zzgye {
                static final zzgye zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgye
                public boolean zza(int i10) {
                    if (zzb.zzb(i10) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i10) {
                this.zzk = i10;
            }

            public static zzb zzb(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return null;
                            }
                            return ANDROID_TARGET_API_TOO_LOW;
                        }
                        return CACHE_LOAD_FAILED;
                    }
                    return OPENGL_RENDERING_FAILED;
                }
                return VIDEO_ERROR_CODE_UNSPECIFIED;
            }

            public static zzgyd<zzb> zzd() {
                return zzi;
            }

            public static zzgye zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgyc
            public final int zza() {
                return this.zzk;
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzb = zzawVar;
            zzgxy.zzcb(zzaw.class, zzawVar);
        }

        private zzaw() {
        }

        public static zza zza() {
            return zzb.zzaZ();
        }

        public static zza zze(zzaw zzawVar) {
            return zzb.zzba(zzawVar);
        }

        public static zzaw zzg() {
            return zzb;
        }

        public static zzaw zzh(InputStream inputStream) {
            return (zzaw) zzgxy.zzbk(zzb, inputStream);
        }

        public static zzaw zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzaw) zzgxy.zzbl(zzb, inputStream, zzgxiVar);
        }

        public static zzaw zzj(zzgwm zzgwmVar) {
            return (zzaw) zzgxy.zzbm(zzb, zzgwmVar);
        }

        public static zzaw zzk(zzgww zzgwwVar) {
            return (zzaw) zzgxy.zzbn(zzb, zzgwwVar);
        }

        public static zzaw zzl(InputStream inputStream) {
            return (zzaw) zzgxy.zzbo(zzb, inputStream);
        }

        public static zzaw zzm(ByteBuffer byteBuffer) {
            return (zzaw) zzgxy.zzbp(zzb, byteBuffer);
        }

        public static zzaw zzn(byte[] bArr) {
            return (zzaw) zzgxy.zzbq(zzb, bArr);
        }

        public static zzaw zzo(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzaw) zzgxy.zzbr(zzb, zzgwmVar, zzgxiVar);
        }

        public static zzaw zzp(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzaw) zzgxy.zzbs(zzb, zzgwwVar, zzgxiVar);
        }

        public static zzaw zzq(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzaw) zzgxy.zzbu(zzb, inputStream, zzgxiVar);
        }

        public static zzaw zzr(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzaw) zzgxy.zzbv(zzb, byteBuffer, zzgxiVar);
        }

        public static zzaw zzs(byte[] bArr, zzgxi zzgxiVar) {
            return (zzaw) zzgxy.zzbx(zzb, bArr, zzgxiVar);
        }

        public static zzgzr<zzaw> zzt() {
            return zzb.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzw() {
            this.zzd &= -2;
            this.zze = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzx(zzb zzbVar) {
            this.zze = zzbVar.zza();
            this.zzd |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzax
        public zzb zzc() {
            zzb zzb2 = zzb.zzb(this.zze);
            if (zzb2 == null) {
                return zzb.VIDEO_ERROR_CODE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzax
        public boolean zzd() {
            if ((this.zzd & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzb.zze()});
                case 3:
                    return new zzaw();
                case 4:
                    return new zza(null);
                case 5:
                    return zzb;
                case 6:
                    zzgzr<zzaw> zzgzrVar = zzc;
                    if (zzgzrVar == null) {
                        synchronized (zzaw.class) {
                            zzgzrVar = zzc;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzb);
                                zzc = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzax extends zzgzk {
        zzaw.zzb zzc();

        boolean zzd();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzay extends zzgxy<zzay, zza> implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zze;
        private static volatile zzgzr<zzay> zzf;
        private int zzg;
        private zzar zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private zzap zzk;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzay, zza> implements zzaz {
            private zza() {
                super(zzay.zze);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
            public zzq zza() {
                return ((zzay) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
            public zzap zzb() {
                return ((zzay) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
            public zzar zzc() {
                return ((zzay) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
            public zzaw zzd() {
                return ((zzay) this.zza).zzd();
            }

            public zza zze() {
                zzbu();
                ((zzay) this.zza).zzK();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzay) this.zza).zzL();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzay) this.zza).zzM();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzay) this.zza).zzN();
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbu();
                ((zzay) this.zza).zzO(zzawVar);
                return this;
            }

            public zza zzj(zzap zzapVar) {
                zzbu();
                ((zzay) this.zza).zzP(zzapVar);
                return this;
            }

            public zza zzk(zzar zzarVar) {
                zzbu();
                ((zzay) this.zza).zzQ(zzarVar);
                return this;
            }

            public zza zzl(zzaw.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzR(zzaVar.zzbr());
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzay) this.zza).zzR(zzawVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbu();
                ((zzay) this.zza).zzS(zzapVar);
                return this;
            }

            public zza zzp(zzq zzqVar) {
                zzbu();
                ((zzay) this.zza).zzT(zzqVar);
                return this;
            }

            public zza zzq(zzar.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzU(zzaVar.zzbr());
                return this;
            }

            public zza zzr(zzar zzarVar) {
                zzbu();
                ((zzay) this.zza).zzU(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
            public boolean zzs() {
                return ((zzay) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
            public boolean zzt() {
                return ((zzay) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
            public boolean zzu() {
                return ((zzay) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
            public boolean zzv() {
                return ((zzay) this.zza).zzv();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzay zzayVar = new zzay();
            zze = zzayVar;
            zzgxy.zzcb(zzay.class, zzayVar);
        }

        private zzay() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK() {
            this.zzj = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL() {
            this.zzk = null;
            this.zzg &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM() {
            this.zzg &= -3;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzh = null;
            this.zzg &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzh;
            if (zzarVar2 != null && zzarVar2 != zzar.zzg()) {
                zzar.zza zze2 = zzar.zze(zzarVar2);
                zze2.zzbj(zzarVar);
                zzarVar = zze2.zzbs();
            }
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(zzar zzarVar) {
            zzarVar.getClass();
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        public static zza zze() {
            return zze.zzaZ();
        }

        public static zza zzf(zzay zzayVar) {
            return zze.zzba(zzayVar);
        }

        public static zzay zzh() {
            return zze;
        }

        public static zzay zzi(InputStream inputStream) {
            return (zzay) zzgxy.zzbk(zze, inputStream);
        }

        public static zzay zzj(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzay) zzgxy.zzbl(zze, inputStream, zzgxiVar);
        }

        public static zzay zzk(zzgwm zzgwmVar) {
            return (zzay) zzgxy.zzbm(zze, zzgwmVar);
        }

        public static zzay zzl(zzgww zzgwwVar) {
            return (zzay) zzgxy.zzbn(zze, zzgwwVar);
        }

        public static zzay zzm(InputStream inputStream) {
            return (zzay) zzgxy.zzbo(zze, inputStream);
        }

        public static zzay zzn(ByteBuffer byteBuffer) {
            return (zzay) zzgxy.zzbp(zze, byteBuffer);
        }

        public static zzay zzo(byte[] bArr) {
            return (zzay) zzgxy.zzbq(zze, bArr);
        }

        public static zzay zzp(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzay) zzgxy.zzbr(zze, zzgwmVar, zzgxiVar);
        }

        public static zzay zzq(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzay) zzgxy.zzbs(zze, zzgwwVar, zzgxiVar);
        }

        public static zzay zzr(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzay) zzgxy.zzbu(zze, inputStream, zzgxiVar);
        }

        public static zzay zzw(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzay) zzgxy.zzbv(zze, byteBuffer, zzgxiVar);
        }

        public static zzay zzx(byte[] bArr, zzgxi zzgxiVar) {
            return (zzay) zzgxy.zzbx(zze, bArr, zzgxiVar);
        }

        public static zzgzr<zzay> zzy() {
            return zze.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
        public zzap zzb() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
        public zzar zzc() {
            zzar zzarVar = this.zzh;
            if (zzarVar == null) {
                return zzar.zzg();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
        public zzaw zzd() {
            zzaw zzawVar = this.zzj;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", zzq.zze(), "zzj", "zzk"});
                case 3:
                    return new zzay();
                case 4:
                    return new zza(null);
                case 5:
                    return zze;
                case 6:
                    zzgzr<zzay> zzgzrVar = zzf;
                    if (zzgzrVar == null) {
                        synchronized (zzay.class) {
                            zzgzrVar = zzf;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zze);
                                zzf = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
        public boolean zzs() {
            if ((this.zzg & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
        public boolean zzt() {
            if ((this.zzg & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
        public boolean zzu() {
            if ((this.zzg & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaz
        public boolean zzv() {
            if ((this.zzg & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzaz extends zzgzk {
        zzq zza();

        zzap zzb();

        zzar zzc();

        zzaw zzd();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzb extends zzgxy<zzb, zzc> implements zzc {
        public static final int zza = 1;
        private static final zzb zzb;
        private static volatile zzgzr<zzb> zzc;
        private zzgyk<zza> zzd = zzgxy.zzbK();

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxy<zza, C0160zza> implements InterfaceC0161zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzd;
            private static volatile zzgzr<zza> zze;
            private int zzf;
            private int zzg;
            private zze zzh;
            private zzg zzi;

            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbbc$zzb$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0160zza extends zzgxs<zza, C0160zza> implements InterfaceC0161zzb {
                private C0160zza() {
                    super(zza.zzd);
                }

                public C0160zza zza() {
                    zzbu();
                    ((zza) this.zza).zzG();
                    return this;
                }

                public C0160zza zzb() {
                    zzbu();
                    ((zza) this.zza).zzH();
                    return this;
                }

                public C0160zza zzc() {
                    zzbu();
                    ((zza) this.zza).zzI();
                    return this;
                }

                public C0160zza zzd(zze zzeVar) {
                    zzbu();
                    ((zza) this.zza).zzJ(zzeVar);
                    return this;
                }

                public C0160zza zze(zzg zzgVar) {
                    zzbu();
                    ((zza) this.zza).zzK(zzgVar);
                    return this;
                }

                public C0160zza zzf(zzd zzdVar) {
                    zzbu();
                    ((zza) this.zza).zzL(zzdVar);
                    return this;
                }

                public C0160zza zzg(zze.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzM(zzaVar.zzbr());
                    return this;
                }

                public C0160zza zzh(zze zzeVar) {
                    zzbu();
                    ((zza) this.zza).zzM(zzeVar);
                    return this;
                }

                public C0160zza zzi(zzg.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzN(zzaVar.zzbr());
                    return this;
                }

                public C0160zza zzj(zzg zzgVar) {
                    zzbu();
                    ((zza) this.zza).zzN(zzgVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
                public zzd zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
                public zze zzl() {
                    return ((zza) this.zza).zzl();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
                public zzg zzm() {
                    return ((zza) this.zza).zzm();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
                public boolean zzn() {
                    return ((zza) this.zza).zzn();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
                public boolean zzo() {
                    return ((zza) this.zza).zzo();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
                public boolean zzp() {
                    return ((zza) this.zza).zzp();
                }

                public /* synthetic */ C0160zza(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzd = zzaVar;
                zzgxy.zzcb(zza.class, zzaVar);
            }

            private zza() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzG() {
                this.zzf &= -2;
                this.zzg = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzH() {
                this.zzh = null;
                this.zzf &= -3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzI() {
                this.zzi = null;
                this.zzf &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzJ(zze zzeVar) {
                zzeVar.getClass();
                zze zzeVar2 = this.zzh;
                if (zzeVar2 != null && zzeVar2 != zze.zzi()) {
                    zze.zza zzd2 = zze.zzd(zzeVar2);
                    zzd2.zzbj(zzeVar);
                    zzeVar = zzd2.zzbs();
                }
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzK(zzg zzgVar) {
                zzgVar.getClass();
                zzg zzgVar2 = this.zzi;
                if (zzgVar2 != null && zzgVar2 != zzg.zzf()) {
                    zzg.zza zzd2 = zzg.zzd(zzgVar2);
                    zzd2.zzbj(zzgVar);
                    zzgVar = zzd2.zzbs();
                }
                this.zzi = zzgVar;
                this.zzf |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzL(zzd zzdVar) {
                this.zzg = zzdVar.zza();
                this.zzf |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzM(zze zzeVar) {
                zzeVar.getClass();
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzN(zzg zzgVar) {
                zzgVar.getClass();
                this.zzi = zzgVar;
                this.zzf |= 4;
            }

            public static C0160zza zza() {
                return zzd.zzaZ();
            }

            public static C0160zza zzc(zza zzaVar) {
                return zzd.zzba(zzaVar);
            }

            public static zza zze() {
                return zzd;
            }

            public static zza zzf(InputStream inputStream) {
                return (zza) zzgxy.zzbk(zzd, inputStream);
            }

            public static zza zzg(InputStream inputStream, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbl(zzd, inputStream, zzgxiVar);
            }

            public static zza zzh(zzgwm zzgwmVar) {
                return (zza) zzgxy.zzbm(zzd, zzgwmVar);
            }

            public static zza zzi(zzgww zzgwwVar) {
                return (zza) zzgxy.zzbn(zzd, zzgwwVar);
            }

            public static zza zzj(InputStream inputStream) {
                return (zza) zzgxy.zzbo(zzd, inputStream);
            }

            public static zza zzq(ByteBuffer byteBuffer) {
                return (zza) zzgxy.zzbp(zzd, byteBuffer);
            }

            public static zza zzr(byte[] bArr) {
                return (zza) zzgxy.zzbq(zzd, bArr);
            }

            public static zza zzs(zzgwm zzgwmVar, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbr(zzd, zzgwmVar, zzgxiVar);
            }

            public static zza zzt(zzgww zzgwwVar, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbs(zzd, zzgwwVar, zzgxiVar);
            }

            public static zza zzu(InputStream inputStream, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbu(zzd, inputStream, zzgxiVar);
            }

            public static zza zzv(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbv(zzd, byteBuffer, zzgxiVar);
            }

            public static zza zzw(byte[] bArr, zzgxi zzgxiVar) {
                return (zza) zzgxy.zzbx(zzd, bArr, zzgxiVar);
            }

            public static zzgzr<zza> zzx() {
                return zzd.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzgxy
            public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
                switch (zzgxxVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return zzgxy.zzbS(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzd.zze(), "zzh", "zzi"});
                    case 3:
                        return new zza();
                    case 4:
                        return new C0160zza(null);
                    case 5:
                        return zzd;
                    case 6:
                        zzgzr<zza> zzgzrVar = zze;
                        if (zzgzrVar == null) {
                            synchronized (zza.class) {
                                zzgzrVar = zze;
                                if (zzgzrVar == null) {
                                    zzgzrVar = new zzgxt(zzd);
                                    zze = zzgzrVar;
                                }
                            }
                        }
                        return zzgzrVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
            public zzd zzk() {
                zzd zzb2 = zzd.zzb(this.zzg);
                if (zzb2 == null) {
                    return zzd.UNSPECIFIED;
                }
                return zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
            public zze zzl() {
                zze zzeVar = this.zzh;
                if (zzeVar == null) {
                    return zze.zzi();
                }
                return zzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
            public zzg zzm() {
                zzg zzgVar = this.zzi;
                if (zzgVar == null) {
                    return zzg.zzf();
                }
                return zzgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
            public boolean zzn() {
                if ((this.zzf & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
            public boolean zzo() {
                if ((this.zzf & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.InterfaceC0161zzb
            public boolean zzp() {
                if ((this.zzf & 4) != 0) {
                    return true;
                }
                return false;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbbc$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0161zzb extends zzgzk {
            zzd zzk();

            zze zzl();

            zzg zzm();

            boolean zzn();

            boolean zzo();

            boolean zzp();
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zzc extends zzgxs<zzb, zzc> implements zzc {
            private zzc() {
                super(zzb.zzb);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzc
            public int zza() {
                return ((zzb) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzc
            public zza zzb(int i10) {
                return ((zzb) this.zza).zzb(i10);
            }

            public zzc zzc(Iterable<? extends zza> iterable) {
                zzbu();
                ((zzb) this.zza).zzC(iterable);
                return this;
            }

            public zzc zzd(zza.C0160zza c0160zza) {
                zzbu();
                ((zzb) this.zza).zzD(c0160zza.zzbr());
                return this;
            }

            public zzc zze(zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzD(zzaVar);
                return this;
            }

            public zzc zzf(int i10, zza.C0160zza c0160zza) {
                zzbu();
                ((zzb) this.zza).zzE(i10, c0160zza.zzbr());
                return this;
            }

            public zzc zzg(int i10, zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzE(i10, zzaVar);
                return this;
            }

            public zzc zzh() {
                zzbu();
                ((zzb) this.zza).zzF();
                return this;
            }

            public zzc zzi(int i10) {
                zzbu();
                ((zzb) this.zza).zzH(i10);
                return this;
            }

            public zzc zzj(int i10, zza.C0160zza c0160zza) {
                zzbu();
                ((zzb) this.zza).zzI(i10, c0160zza.zzbr());
                return this;
            }

            public zzc zzk(int i10, zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzI(i10, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzc
            public List<zza> zzl() {
                return Collections.unmodifiableList(((zzb) this.zza).zzl());
            }

            public /* synthetic */ zzc(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public enum zzd implements zzgyc {
            UNSPECIFIED(0),
            IN_MEMORY(1);
            
            public static final int zzc = 0;
            public static final int zzd = 1;
            private static final zzgyd<zzd> zze = new zzgyd<zzd>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzb.zzd.1
                /* renamed from: zza */
                public zzd zzb(int i10) {
                    return zzd.zzb(i10);
                }
            };
            private final int zzg;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* loaded from: classes2.dex */
            public final class zza implements zzgye {
                static final zzgye zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgye
                public boolean zza(int i10) {
                    if (zzd.zzb(i10) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzd(int i10) {
                this.zzg = i10;
            }

            public static zzd zzb(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return IN_MEMORY;
                }
                return UNSPECIFIED;
            }

            public static zzgyd<zzd> zzd() {
                return zze;
            }

            public static zzgye zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgyc
            public final int zza() {
                return this.zzg;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zze extends zzgxy<zze, zza> implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzc;
            private static volatile zzgzr<zze> zzd;
            private int zze;
            private boolean zzf;
            private int zzg;

            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* loaded from: classes2.dex */
            public final class zza extends zzgxs<zze, zza> implements zzf {
                private zza() {
                    super(zze.zzc);
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzf
                public int zza() {
                    return ((zze) this.zza).zza();
                }

                public zza zzb() {
                    zzbu();
                    ((zze) this.zza).zzA();
                    return this;
                }

                public zza zzc() {
                    zzbu();
                    ((zze) this.zza).zzB();
                    return this;
                }

                public zza zzd(boolean z10) {
                    zzbu();
                    ((zze) this.zza).zzC(z10);
                    return this;
                }

                public zza zze(int i10) {
                    zzbu();
                    ((zze) this.zza).zzD(i10);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzf
                public boolean zzf() {
                    return ((zze) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzf
                public boolean zzg() {
                    return ((zze) this.zza).zzg();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzf
                public boolean zzh() {
                    return ((zze) this.zza).zzh();
                }

                public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            static {
                zze zzeVar = new zze();
                zzc = zzeVar;
                zzgxy.zzcb(zze.class, zzeVar);
            }

            private zze() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzA() {
                this.zze &= -2;
                this.zzf = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzB() {
                this.zze &= -3;
                this.zzg = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzC(boolean z10) {
                this.zze |= 1;
                this.zzf = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzD(int i10) {
                this.zze |= 2;
                this.zzg = i10;
            }

            public static zza zzc() {
                return zzc.zzaZ();
            }

            public static zza zzd(zze zzeVar) {
                return zzc.zzba(zzeVar);
            }

            public static zze zzi() {
                return zzc;
            }

            public static zze zzj(InputStream inputStream) {
                return (zze) zzgxy.zzbk(zzc, inputStream);
            }

            public static zze zzk(InputStream inputStream, zzgxi zzgxiVar) {
                return (zze) zzgxy.zzbl(zzc, inputStream, zzgxiVar);
            }

            public static zze zzl(zzgwm zzgwmVar) {
                return (zze) zzgxy.zzbm(zzc, zzgwmVar);
            }

            public static zze zzm(zzgww zzgwwVar) {
                return (zze) zzgxy.zzbn(zzc, zzgwwVar);
            }

            public static zze zzn(InputStream inputStream) {
                return (zze) zzgxy.zzbo(zzc, inputStream);
            }

            public static zze zzo(ByteBuffer byteBuffer) {
                return (zze) zzgxy.zzbp(zzc, byteBuffer);
            }

            public static zze zzp(byte[] bArr) {
                return (zze) zzgxy.zzbq(zzc, bArr);
            }

            public static zze zzq(zzgwm zzgwmVar, zzgxi zzgxiVar) {
                return (zze) zzgxy.zzbr(zzc, zzgwmVar, zzgxiVar);
            }

            public static zze zzr(zzgww zzgwwVar, zzgxi zzgxiVar) {
                return (zze) zzgxy.zzbs(zzc, zzgwwVar, zzgxiVar);
            }

            public static zze zzs(InputStream inputStream, zzgxi zzgxiVar) {
                return (zze) zzgxy.zzbu(zzc, inputStream, zzgxiVar);
            }

            public static zze zzt(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
                return (zze) zzgxy.zzbv(zzc, byteBuffer, zzgxiVar);
            }

            public static zze zzu(byte[] bArr, zzgxi zzgxiVar) {
                return (zze) zzgxy.zzbx(zzc, bArr, zzgxiVar);
            }

            public static zzgzr<zze> zzv() {
                return zzc.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzf
            public int zza() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzgxy
            public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
                switch (zzgxxVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return zzgxy.zzbS(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    case 3:
                        return new zze();
                    case 4:
                        return new zza(null);
                    case 5:
                        return zzc;
                    case 6:
                        zzgzr<zze> zzgzrVar = zzd;
                        if (zzgzrVar == null) {
                            synchronized (zze.class) {
                                zzgzrVar = zzd;
                                if (zzgzrVar == null) {
                                    zzgzrVar = new zzgxt(zzc);
                                    zzd = zzgzrVar;
                                }
                            }
                        }
                        return zzgzrVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzf
            public boolean zzf() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzf
            public boolean zzg() {
                if ((this.zze & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzf
            public boolean zzh() {
                if ((this.zze & 2) != 0) {
                    return true;
                }
                return false;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public interface zzf extends zzgzk {
            int zza();

            boolean zzf();

            boolean zzg();

            boolean zzh();
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zzg extends zzgxy<zzg, zza> implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzd;
            private static volatile zzgzr<zzg> zze;
            private int zzf;
            private boolean zzg;
            private boolean zzh;
            private int zzi;

            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* loaded from: classes2.dex */
            public final class zza extends zzgxs<zzg, zza> implements zzh {
                private zza() {
                    super(zzg.zzd);
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
                public int zza() {
                    return ((zzg) this.zza).zza();
                }

                public zza zzb() {
                    zzbu();
                    ((zzg) this.zza).zzE();
                    return this;
                }

                public zza zzc() {
                    zzbu();
                    ((zzg) this.zza).zzF();
                    return this;
                }

                public zza zzd() {
                    zzbu();
                    ((zzg) this.zza).zzG();
                    return this;
                }

                public zza zze(boolean z10) {
                    zzbu();
                    ((zzg) this.zza).zzH(z10);
                    return this;
                }

                public zza zzf(boolean z10) {
                    zzbu();
                    ((zzg) this.zza).zzI(z10);
                    return this;
                }

                public zza zzg(int i10) {
                    zzbu();
                    ((zzg) this.zza).zzJ(i10);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
                public boolean zzh() {
                    return ((zzg) this.zza).zzh();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
                public boolean zzi() {
                    return ((zzg) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
                public boolean zzj() {
                    return ((zzg) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
                public boolean zzk() {
                    return ((zzg) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
                public boolean zzl() {
                    return ((zzg) this.zza).zzl();
                }

                public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            static {
                zzg zzgVar = new zzg();
                zzd = zzgVar;
                zzgxy.zzcb(zzg.class, zzgVar);
            }

            private zzg() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzE() {
                this.zzf &= -2;
                this.zzg = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzF() {
                this.zzf &= -3;
                this.zzh = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzG() {
                this.zzf &= -5;
                this.zzi = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzH(boolean z10) {
                this.zzf |= 1;
                this.zzg = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzI(boolean z10) {
                this.zzf |= 2;
                this.zzh = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzJ(int i10) {
                this.zzf |= 4;
                this.zzi = i10;
            }

            public static zza zzc() {
                return zzd.zzaZ();
            }

            public static zza zzd(zzg zzgVar) {
                return zzd.zzba(zzgVar);
            }

            public static zzg zzf() {
                return zzd;
            }

            public static zzg zzg(InputStream inputStream) {
                return (zzg) zzgxy.zzbk(zzd, inputStream);
            }

            public static zzg zzm(InputStream inputStream, zzgxi zzgxiVar) {
                return (zzg) zzgxy.zzbl(zzd, inputStream, zzgxiVar);
            }

            public static zzg zzn(zzgwm zzgwmVar) {
                return (zzg) zzgxy.zzbm(zzd, zzgwmVar);
            }

            public static zzg zzo(zzgww zzgwwVar) {
                return (zzg) zzgxy.zzbn(zzd, zzgwwVar);
            }

            public static zzg zzp(InputStream inputStream) {
                return (zzg) zzgxy.zzbo(zzd, inputStream);
            }

            public static zzg zzq(ByteBuffer byteBuffer) {
                return (zzg) zzgxy.zzbp(zzd, byteBuffer);
            }

            public static zzg zzr(byte[] bArr) {
                return (zzg) zzgxy.zzbq(zzd, bArr);
            }

            public static zzg zzs(zzgwm zzgwmVar, zzgxi zzgxiVar) {
                return (zzg) zzgxy.zzbr(zzd, zzgwmVar, zzgxiVar);
            }

            public static zzg zzt(zzgww zzgwwVar, zzgxi zzgxiVar) {
                return (zzg) zzgxy.zzbs(zzd, zzgwwVar, zzgxiVar);
            }

            public static zzg zzu(InputStream inputStream, zzgxi zzgxiVar) {
                return (zzg) zzgxy.zzbu(zzd, inputStream, zzgxiVar);
            }

            public static zzg zzv(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
                return (zzg) zzgxy.zzbv(zzd, byteBuffer, zzgxiVar);
            }

            public static zzg zzw(byte[] bArr, zzgxi zzgxiVar) {
                return (zzg) zzgxy.zzbx(zzd, bArr, zzgxiVar);
            }

            public static zzgzr<zzg> zzx() {
                return zzd.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
            public int zza() {
                return this.zzi;
            }

            @Override // com.google.android.gms.internal.ads.zzgxy
            public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
                switch (zzgxxVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return zzgxy.zzbS(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                    case 3:
                        return new zzg();
                    case 4:
                        return new zza(null);
                    case 5:
                        return zzd;
                    case 6:
                        zzgzr<zzg> zzgzrVar = zze;
                        if (zzgzrVar == null) {
                            synchronized (zzg.class) {
                                zzgzrVar = zze;
                                if (zzgzrVar == null) {
                                    zzgzrVar = new zzgxt(zzd);
                                    zze = zzgzrVar;
                                }
                            }
                        }
                        return zzgzrVar;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
            public boolean zzh() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
            public boolean zzi() {
                return this.zzh;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
            public boolean zzj() {
                if ((this.zzf & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
            public boolean zzk() {
                if ((this.zzf & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzb.zzh
            public boolean zzl() {
                if ((this.zzf & 4) != 0) {
                    return true;
                }
                return false;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public interface zzh extends zzgzk {
            int zza();

            boolean zzh();

            boolean zzi();

            boolean zzj();

            boolean zzk();

            boolean zzl();
        }

        static {
            zzb zzbVar = new zzb();
            zzb = zzbVar;
            zzgxy.zzcb(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(Iterable<? extends zza> iterable) {
            zzG();
            zzgvv.zzaQ(iterable, this.zzd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zza zzaVar) {
            zzaVar.getClass();
            zzG();
            this.zzd.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(int i10, zza zzaVar) {
            zzaVar.getClass();
            zzG();
            this.zzd.add(i10, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzd = zzgxy.zzbK();
        }

        private void zzG() {
            zzgyk<zza> zzgykVar = this.zzd;
            if (!zzgykVar.zzc()) {
                this.zzd = zzgxy.zzbL(zzgykVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH(int i10) {
            zzG();
            this.zzd.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(int i10, zza zzaVar) {
            zzaVar.getClass();
            zzG();
            this.zzd.set(i10, zzaVar);
        }

        public static zzc zzd() {
            return zzb.zzaZ();
        }

        public static zzc zze(zzb zzbVar) {
            return zzb.zzba(zzbVar);
        }

        public static zzb zzg() {
            return zzb;
        }

        public static zzb zzh(InputStream inputStream) {
            return (zzb) zzgxy.zzbk(zzb, inputStream);
        }

        public static zzb zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzb) zzgxy.zzbl(zzb, inputStream, zzgxiVar);
        }

        public static zzb zzj(zzgwm zzgwmVar) {
            return (zzb) zzgxy.zzbm(zzb, zzgwmVar);
        }

        public static zzb zzk(zzgww zzgwwVar) {
            return (zzb) zzgxy.zzbn(zzb, zzgwwVar);
        }

        public static zzb zzm(InputStream inputStream) {
            return (zzb) zzgxy.zzbo(zzb, inputStream);
        }

        public static zzb zzn(ByteBuffer byteBuffer) {
            return (zzb) zzgxy.zzbp(zzb, byteBuffer);
        }

        public static zzb zzo(byte[] bArr) {
            return (zzb) zzgxy.zzbq(zzb, bArr);
        }

        public static zzb zzp(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzb) zzgxy.zzbr(zzb, zzgwmVar, zzgxiVar);
        }

        public static zzb zzq(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzb) zzgxy.zzbs(zzb, zzgwwVar, zzgxiVar);
        }

        public static zzb zzr(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzb) zzgxy.zzbu(zzb, inputStream, zzgxiVar);
        }

        public static zzb zzs(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzb) zzgxy.zzbv(zzb, byteBuffer, zzgxiVar);
        }

        public static zzb zzt(byte[] bArr, zzgxi zzgxiVar) {
            return (zzb) zzgxy.zzbx(zzb, bArr, zzgxiVar);
        }

        public static zzgzr<zzb> zzu() {
            return zzb.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzc
        public int zza() {
            return this.zzd.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzc
        public zza zzb(int i10) {
            return this.zzd.get(i10);
        }

        public InterfaceC0161zzb zzc(int i10) {
            return this.zzd.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zza.class});
                case 3:
                    return new zzb();
                case 4:
                    return new zzc(null);
                case 5:
                    return zzb;
                case 6:
                    zzgzr<zzb> zzgzrVar = zzc;
                    if (zzgzrVar == null) {
                        synchronized (zzb.class) {
                            zzgzrVar = zzc;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzb);
                                zzc = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzc
        public List<zza> zzl() {
            return this.zzd;
        }

        public List<? extends InterfaceC0161zzb> zzv() {
            return this.zzd;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzba extends zzgxy<zzba, zza> implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzf;
        private static volatile zzgzr<zzba> zzg;
        private int zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private int zzk;
        private int zzl;
        private int zzm;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzba, zza> implements zzbb {
            private zza() {
                super(zzba.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
            public int zza() {
                return ((zzba) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
            public int zzb() {
                return ((zzba) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
            public int zzc() {
                return ((zzba) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
            public zzq zzd() {
                return ((zzba) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
            public zzaw zze() {
                return ((zzba) this.zza).zze();
            }

            public zza zzf() {
                zzbu();
                ((zzba) this.zza).zzM();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzba) this.zza).zzN();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzba) this.zza).zzO();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzba) this.zza).zzP();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzba) this.zza).zzQ();
                return this;
            }

            public zza zzk(zzaw zzawVar) {
                zzbu();
                ((zzba) this.zza).zzR(zzawVar);
                return this;
            }

            public zza zzl(zzaw.zza zzaVar) {
                zzbu();
                ((zzba) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzba) this.zza).zzS(zzawVar);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzba) this.zza).zzT(zzqVar);
                return this;
            }

            public zza zzo(int i10) {
                zzbu();
                ((zzba) this.zza).zzU(i10);
                return this;
            }

            public zza zzp(int i10) {
                zzbu();
                ((zzba) this.zza).zzV(i10);
                return this;
            }

            public zza zzq(int i10) {
                zzbu();
                ((zzba) this.zza).zzW(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
            public boolean zzr() {
                return ((zzba) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
            public boolean zzs() {
                return ((zzba) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
            public boolean zzt() {
                return ((zzba) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
            public boolean zzu() {
                return ((zzba) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
            public boolean zzv() {
                return ((zzba) this.zza).zzv();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzba zzbaVar = new zzba();
            zzf = zzbaVar;
            zzgxy.zzcb(zzba.class, zzbaVar);
        }

        private zzba() {
        }

        public static zzgzr<zzba> zzA() {
            return zzf.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM() {
            this.zzj = null;
            this.zzh &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzh &= -2;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO() {
            this.zzh &= -17;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP() {
            this.zzh &= -5;
            this.zzk = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzh &= -9;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzj = zzawVar;
            this.zzh |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzh |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzh |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(int i10) {
            this.zzh |= 16;
            this.zzm = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(int i10) {
            this.zzh |= 4;
            this.zzk = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(int i10) {
            this.zzh |= 8;
            this.zzl = i10;
        }

        public static zza zzf() {
            return zzf.zzaZ();
        }

        public static zza zzg(zzba zzbaVar) {
            return zzf.zzba(zzbaVar);
        }

        public static zzba zzi() {
            return zzf;
        }

        public static zzba zzj(InputStream inputStream) {
            return (zzba) zzgxy.zzbk(zzf, inputStream);
        }

        public static zzba zzk(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzba) zzgxy.zzbl(zzf, inputStream, zzgxiVar);
        }

        public static zzba zzl(zzgwm zzgwmVar) {
            return (zzba) zzgxy.zzbm(zzf, zzgwmVar);
        }

        public static zzba zzm(zzgww zzgwwVar) {
            return (zzba) zzgxy.zzbn(zzf, zzgwwVar);
        }

        public static zzba zzn(InputStream inputStream) {
            return (zzba) zzgxy.zzbo(zzf, inputStream);
        }

        public static zzba zzo(ByteBuffer byteBuffer) {
            return (zzba) zzgxy.zzbp(zzf, byteBuffer);
        }

        public static zzba zzp(byte[] bArr) {
            return (zzba) zzgxy.zzbq(zzf, bArr);
        }

        public static zzba zzq(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzba) zzgxy.zzbr(zzf, zzgwmVar, zzgxiVar);
        }

        public static zzba zzw(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzba) zzgxy.zzbs(zzf, zzgwwVar, zzgxiVar);
        }

        public static zzba zzx(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzba) zzgxy.zzbu(zzf, inputStream, zzgxiVar);
        }

        public static zzba zzy(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzba) zzgxy.zzbv(zzf, byteBuffer, zzgxiVar);
        }

        public static zzba zzz(byte[] bArr, zzgxi zzgxiVar) {
            return (zzba) zzgxy.zzbx(zzf, bArr, zzgxiVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
        public int zza() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
        public int zzb() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
        public int zzc() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
        public zzq zzd() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", zzq.zze(), "zzj", "zzk", "zzl", "zzm"});
                case 3:
                    return new zzba();
                case 4:
                    return new zza(null);
                case 5:
                    return zzf;
                case 6:
                    zzgzr<zzba> zzgzrVar = zzg;
                    if (zzgzrVar == null) {
                        synchronized (zzba.class) {
                            zzgzrVar = zzg;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzf);
                                zzg = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
        public zzaw zze() {
            zzaw zzawVar = this.zzj;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
        public boolean zzr() {
            if ((this.zzh & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
        public boolean zzs() {
            if ((this.zzh & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
        public boolean zzt() {
            if ((this.zzh & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
        public boolean zzu() {
            if ((this.zzh & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbb
        public boolean zzv() {
            if ((this.zzh & 8) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzbb extends zzgzk {
        int zza();

        int zzb();

        int zzc();

        zzq zzd();

        zzaw zze();

        boolean zzr();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzbc extends zzgxy<zzbc, zza> implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzd;
        private static volatile zzgzr<zzbc> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzbc, zza> implements zzbd {
            private zza() {
                super(zzbc.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
            public zzq zza() {
                return ((zzbc) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
            public zzap zzb() {
                return ((zzbc) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
            public zzaw zzc() {
                return ((zzbc) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzbc) this.zza).zzF();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzbc) this.zza).zzG();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzbc) this.zza).zzH();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbc) this.zza).zzI(zzawVar);
                return this;
            }

            public zza zzh(zzap zzapVar) {
                zzbu();
                ((zzbc) this.zza).zzJ(zzapVar);
                return this;
            }

            public zza zzi(zzaw.zza zzaVar) {
                zzbu();
                ((zzbc) this.zza).zzK(zzaVar.zzbr());
                return this;
            }

            public zza zzj(zzaw zzawVar) {
                zzbu();
                ((zzbc) this.zza).zzK(zzawVar);
                return this;
            }

            public zza zzk(zzap.zza zzaVar) {
                zzbu();
                ((zzbc) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzl(zzap zzapVar) {
                zzbu();
                ((zzbc) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzm(zzq zzqVar) {
                zzbu();
                ((zzbc) this.zza).zzM(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
            public boolean zzn() {
                return ((zzbc) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
            public boolean zzo() {
                return ((zzbc) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
            public boolean zzp() {
                return ((zzbc) this.zza).zzp();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzd = zzbcVar;
            zzgxy.zzcb(zzbc.class, zzbcVar);
        }

        private zzbc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zze(zzbc zzbcVar) {
            return zzd.zzba(zzbcVar);
        }

        public static zzbc zzg() {
            return zzd;
        }

        public static zzbc zzh(InputStream inputStream) {
            return (zzbc) zzgxy.zzbk(zzd, inputStream);
        }

        public static zzbc zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzbc) zzgxy.zzbl(zzd, inputStream, zzgxiVar);
        }

        public static zzbc zzj(zzgwm zzgwmVar) {
            return (zzbc) zzgxy.zzbm(zzd, zzgwmVar);
        }

        public static zzbc zzk(zzgww zzgwwVar) {
            return (zzbc) zzgxy.zzbn(zzd, zzgwwVar);
        }

        public static zzbc zzl(InputStream inputStream) {
            return (zzbc) zzgxy.zzbo(zzd, inputStream);
        }

        public static zzbc zzm(ByteBuffer byteBuffer) {
            return (zzbc) zzgxy.zzbp(zzd, byteBuffer);
        }

        public static zzbc zzq(byte[] bArr) {
            return (zzbc) zzgxy.zzbq(zzd, bArr);
        }

        public static zzbc zzr(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzbc) zzgxy.zzbr(zzd, zzgwmVar, zzgxiVar);
        }

        public static zzbc zzs(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzbc) zzgxy.zzbs(zzd, zzgwwVar, zzgxiVar);
        }

        public static zzbc zzt(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzbc) zzgxy.zzbu(zzd, inputStream, zzgxiVar);
        }

        public static zzbc zzu(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzbc) zzgxy.zzbv(zzd, byteBuffer, zzgxiVar);
        }

        public static zzbc zzv(byte[] bArr, zzgxi zzgxiVar) {
            return (zzbc) zzgxy.zzbx(zzd, bArr, zzgxiVar);
        }

        public static zzgzr<zzbc> zzw() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
        public zzaw zzc() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
                case 3:
                    return new zzbc();
                case 4:
                    return new zza(null);
                case 5:
                    return zzd;
                case 6:
                    zzgzr<zzbc> zzgzrVar = zze;
                    if (zzgzrVar == null) {
                        synchronized (zzbc.class) {
                            zzgzrVar = zze;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzd);
                                zze = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
        public boolean zzn() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
        public boolean zzo() {
            if ((this.zzf & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbd
        public boolean zzp() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzbd extends zzgzk {
        zzq zza();

        zzap zzb();

        zzaw zzc();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzbe extends zzgxy<zzbe, zza> implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzg;
        private static volatile zzgzr<zzbe> zzh;
        private int zzi;
        private int zzj = 1000;
        private zzaw zzk;
        private int zzl;
        private int zzm;
        private int zzn;
        private long zzo;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzbe, zza> implements zzbf {
            private zza() {
                super(zzbe.zzg);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public int zza() {
                return ((zzbe) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public int zzb() {
                return ((zzbe) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public int zzc() {
                return ((zzbe) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public long zzd() {
                return ((zzbe) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public zzq zze() {
                return ((zzbe) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public zzaw zzf() {
                return ((zzbe) this.zza).zzf();
            }

            public zza zzg() {
                zzbu();
                ((zzbe) this.zza).zzQ();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzbe) this.zza).zzR();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzbe) this.zza).zzS();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzbe) this.zza).zzT();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzbe) this.zza).zzU();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzbe) this.zza).zzV();
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzbe) this.zza).zzW(zzawVar);
                return this;
            }

            public zza zzn(long j10) {
                zzbu();
                ((zzbe) this.zza).zzX(j10);
                return this;
            }

            public zza zzo(zzaw.zza zzaVar) {
                zzbu();
                ((zzbe) this.zza).zzY(zzaVar.zzbr());
                return this;
            }

            public zza zzp(zzaw zzawVar) {
                zzbu();
                ((zzbe) this.zza).zzY(zzawVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzbe) this.zza).zzZ(zzqVar);
                return this;
            }

            public zza zzr(int i10) {
                zzbu();
                ((zzbe) this.zza).zzaa(i10);
                return this;
            }

            public zza zzs(int i10) {
                zzbu();
                ((zzbe) this.zza).zzab(i10);
                return this;
            }

            public zza zzt(int i10) {
                zzbu();
                ((zzbe) this.zza).zzac(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public boolean zzu() {
                return ((zzbe) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public boolean zzv() {
                return ((zzbe) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public boolean zzw() {
                return ((zzbe) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public boolean zzx() {
                return ((zzbe) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public boolean zzy() {
                return ((zzbe) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
            public boolean zzz() {
                return ((zzbe) this.zza).zzz();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzg = zzbeVar;
            zzgxy.zzcb(zzbe.class, zzbeVar);
        }

        private zzbe() {
        }

        public static zzbe zzA(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzbe) zzgxy.zzbv(zzg, byteBuffer, zzgxiVar);
        }

        public static zzbe zzB(byte[] bArr, zzgxi zzgxiVar) {
            return (zzbe) zzgxy.zzbx(zzg, bArr, zzgxiVar);
        }

        public static zzgzr<zzbe> zzC() {
            return zzg.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzi &= -33;
            this.zzo = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzk = null;
            this.zzi &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS() {
            this.zzi &= -2;
            this.zzj = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT() {
            this.zzi &= -17;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU() {
            this.zzi &= -5;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV() {
            this.zzi &= -9;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzk;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(long j10) {
            this.zzi |= 32;
            this.zzo = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzi |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(int i10) {
            this.zzi |= 16;
            this.zzn = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(int i10) {
            this.zzi |= 4;
            this.zzl = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac(int i10) {
            this.zzi |= 8;
            this.zzm = i10;
        }

        public static zza zzg() {
            return zzg.zzaZ();
        }

        public static zza zzh(zzbe zzbeVar) {
            return zzg.zzba(zzbeVar);
        }

        public static zzbe zzj() {
            return zzg;
        }

        public static zzbe zzk(InputStream inputStream) {
            return (zzbe) zzgxy.zzbk(zzg, inputStream);
        }

        public static zzbe zzl(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzbe) zzgxy.zzbl(zzg, inputStream, zzgxiVar);
        }

        public static zzbe zzm(zzgwm zzgwmVar) {
            return (zzbe) zzgxy.zzbm(zzg, zzgwmVar);
        }

        public static zzbe zzn(zzgww zzgwwVar) {
            return (zzbe) zzgxy.zzbn(zzg, zzgwwVar);
        }

        public static zzbe zzo(InputStream inputStream) {
            return (zzbe) zzgxy.zzbo(zzg, inputStream);
        }

        public static zzbe zzp(ByteBuffer byteBuffer) {
            return (zzbe) zzgxy.zzbp(zzg, byteBuffer);
        }

        public static zzbe zzq(byte[] bArr) {
            return (zzbe) zzgxy.zzbq(zzg, bArr);
        }

        public static zzbe zzr(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzbe) zzgxy.zzbr(zzg, zzgwmVar, zzgxiVar);
        }

        public static zzbe zzs(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzbe) zzgxy.zzbs(zzg, zzgwwVar, zzgxiVar);
        }

        public static zzbe zzt(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzbe) zzgxy.zzbu(zzg, inputStream, zzgxiVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public int zza() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public int zzb() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public int zzc() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public long zzd() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", zzq.zze(), "zzk", "zzl", "zzm", "zzn", "zzo"});
                case 3:
                    return new zzbe();
                case 4:
                    return new zza(null);
                case 5:
                    return zzg;
                case 6:
                    zzgzr<zzbe> zzgzrVar = zzh;
                    if (zzgzrVar == null) {
                        synchronized (zzbe.class) {
                            zzgzrVar = zzh;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzg);
                                zzh = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public zzq zze() {
            zzq zzb2 = zzq.zzb(this.zzj);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public zzaw zzf() {
            zzaw zzawVar = this.zzk;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public boolean zzu() {
            if ((this.zzi & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public boolean zzv() {
            if ((this.zzi & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public boolean zzw() {
            if ((this.zzi & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public boolean zzx() {
            if ((this.zzi & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public boolean zzy() {
            if ((this.zzi & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbf
        public boolean zzz() {
            if ((this.zzi & 8) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzbf extends zzgzk {
        int zza();

        int zzb();

        int zzc();

        long zzd();

        zzq zze();

        zzaw zzf();

        boolean zzu();

        boolean zzv();

        boolean zzw();

        boolean zzx();

        boolean zzy();

        boolean zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzbg extends zzgxy<zzbg, zza> implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzd;
        private static volatile zzgzr<zzbg> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzbg, zza> implements zzbh {
            private zza() {
                super(zzbg.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
            public zzq zza() {
                return ((zzbg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
            public zzap zzb() {
                return ((zzbg) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
            public zzaw zzc() {
                return ((zzbg) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzbg) this.zza).zzF();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzbg) this.zza).zzG();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzbg) this.zza).zzH();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbg) this.zza).zzI(zzawVar);
                return this;
            }

            public zza zzh(zzap zzapVar) {
                zzbu();
                ((zzbg) this.zza).zzJ(zzapVar);
                return this;
            }

            public zza zzi(zzaw.zza zzaVar) {
                zzbu();
                ((zzbg) this.zza).zzK(zzaVar.zzbr());
                return this;
            }

            public zza zzj(zzaw zzawVar) {
                zzbu();
                ((zzbg) this.zza).zzK(zzawVar);
                return this;
            }

            public zza zzk(zzap.zza zzaVar) {
                zzbu();
                ((zzbg) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzl(zzap zzapVar) {
                zzbu();
                ((zzbg) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzm(zzq zzqVar) {
                zzbu();
                ((zzbg) this.zza).zzM(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
            public boolean zzn() {
                return ((zzbg) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
            public boolean zzo() {
                return ((zzbg) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
            public boolean zzp() {
                return ((zzbg) this.zza).zzp();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzd = zzbgVar;
            zzgxy.zzcb(zzbg.class, zzbgVar);
        }

        private zzbg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze2 = zzaw.zze(zzawVar2);
                zze2.zzbj(zzawVar);
                zzawVar = zze2.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zze(zzbg zzbgVar) {
            return zzd.zzba(zzbgVar);
        }

        public static zzbg zzg() {
            return zzd;
        }

        public static zzbg zzh(InputStream inputStream) {
            return (zzbg) zzgxy.zzbk(zzd, inputStream);
        }

        public static zzbg zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzbg) zzgxy.zzbl(zzd, inputStream, zzgxiVar);
        }

        public static zzbg zzj(zzgwm zzgwmVar) {
            return (zzbg) zzgxy.zzbm(zzd, zzgwmVar);
        }

        public static zzbg zzk(zzgww zzgwwVar) {
            return (zzbg) zzgxy.zzbn(zzd, zzgwwVar);
        }

        public static zzbg zzl(InputStream inputStream) {
            return (zzbg) zzgxy.zzbo(zzd, inputStream);
        }

        public static zzbg zzm(ByteBuffer byteBuffer) {
            return (zzbg) zzgxy.zzbp(zzd, byteBuffer);
        }

        public static zzbg zzq(byte[] bArr) {
            return (zzbg) zzgxy.zzbq(zzd, bArr);
        }

        public static zzbg zzr(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzbg) zzgxy.zzbr(zzd, zzgwmVar, zzgxiVar);
        }

        public static zzbg zzs(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzbg) zzgxy.zzbs(zzd, zzgwwVar, zzgxiVar);
        }

        public static zzbg zzt(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzbg) zzgxy.zzbu(zzd, inputStream, zzgxiVar);
        }

        public static zzbg zzu(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzbg) zzgxy.zzbv(zzd, byteBuffer, zzgxiVar);
        }

        public static zzbg zzv(byte[] bArr, zzgxi zzgxiVar) {
            return (zzbg) zzgxy.zzbx(zzd, bArr, zzgxiVar);
        }

        public static zzgzr<zzbg> zzw() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzg);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
        public zzaw zzc() {
            zzaw zzawVar = this.zzh;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
                case 3:
                    return new zzbg();
                case 4:
                    return new zza(null);
                case 5:
                    return zzd;
                case 6:
                    zzgzr<zzbg> zzgzrVar = zze;
                    if (zzgzrVar == null) {
                        synchronized (zzbg.class) {
                            zzgzrVar = zze;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzd);
                                zze = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
        public boolean zzn() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
        public boolean zzo() {
            if ((this.zzf & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbh
        public boolean zzp() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzbh extends zzgzk {
        zzq zza();

        zzap zzb();

        zzaw zzc();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzbi extends zzgzk {
        int zza();

        boolean zzaA();

        boolean zzaB();

        zzau zzaf();

        zzay zzag();

        zzba zzah();

        zzbc zzai();

        zzbe zzaj();

        zzbg zzak();

        zzbj zzal();

        boolean zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        boolean zzav();

        boolean zzaw();

        boolean zzax();

        boolean zzay();

        boolean zzaz();

        int zzb();

        int zzc();

        int zzd();

        int zze();

        int zzf();

        int zzg();

        long zzh();

        zzap zzi();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzbj extends zzgxy<zzbj, zza> implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzc;
        private static volatile zzgzr<zzbj> zzd;
        private int zze;
        private int zzf = 1000;
        private zzaw zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzbj, zza> implements zzbk {
            private zza() {
                super(zzbj.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbk
            public zzq zza() {
                return ((zzbj) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbk
            public zzaw zzb() {
                return ((zzbj) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzbj) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzbj) this.zza).zzB();
                return this;
            }

            public zza zze(zzaw zzawVar) {
                zzbu();
                ((zzbj) this.zza).zzC(zzawVar);
                return this;
            }

            public zza zzf(zzaw.zza zzaVar) {
                zzbu();
                ((zzbj) this.zza).zzD(zzaVar.zzbr());
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbj) this.zza).zzD(zzawVar);
                return this;
            }

            public zza zzh(zzq zzqVar) {
                zzbu();
                ((zzbj) this.zza).zzE(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbk
            public boolean zzi() {
                return ((zzbj) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbk
            public boolean zzj() {
                return ((zzbj) this.zza).zzj();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzc = zzbjVar;
            zzgxy.zzcb(zzbj.class, zzbjVar);
        }

        private zzbj() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -2;
            this.zzf = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzg;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zze = zzaw.zze(zzawVar2);
                zze.zzbj(zzawVar);
                zzawVar = zze.zzbs();
            }
            this.zzg = zzawVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzg = zzawVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzbj zzbjVar) {
            return zzc.zzba(zzbjVar);
        }

        public static zzbj zzf() {
            return zzc;
        }

        public static zzbj zzg(InputStream inputStream) {
            return (zzbj) zzgxy.zzbk(zzc, inputStream);
        }

        public static zzbj zzh(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzbj) zzgxy.zzbl(zzc, inputStream, zzgxiVar);
        }

        public static zzbj zzk(zzgwm zzgwmVar) {
            return (zzbj) zzgxy.zzbm(zzc, zzgwmVar);
        }

        public static zzbj zzl(zzgww zzgwwVar) {
            return (zzbj) zzgxy.zzbn(zzc, zzgwwVar);
        }

        public static zzbj zzm(InputStream inputStream) {
            return (zzbj) zzgxy.zzbo(zzc, inputStream);
        }

        public static zzbj zzn(ByteBuffer byteBuffer) {
            return (zzbj) zzgxy.zzbp(zzc, byteBuffer);
        }

        public static zzbj zzo(byte[] bArr) {
            return (zzbj) zzgxy.zzbq(zzc, bArr);
        }

        public static zzbj zzp(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzbj) zzgxy.zzbr(zzc, zzgwmVar, zzgxiVar);
        }

        public static zzbj zzq(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzbj) zzgxy.zzbs(zzc, zzgwwVar, zzgxiVar);
        }

        public static zzbj zzr(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzbj) zzgxy.zzbu(zzc, inputStream, zzgxiVar);
        }

        public static zzbj zzs(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzbj) zzgxy.zzbv(zzc, byteBuffer, zzgxiVar);
        }

        public static zzbj zzt(byte[] bArr, zzgxi zzgxiVar) {
            return (zzbj) zzgxy.zzbx(zzc, bArr, zzgxiVar);
        }

        public static zzgzr<zzbj> zzu() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbk
        public zzq zza() {
            zzq zzb2 = zzq.zzb(this.zzf);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbk
        public zzaw zzb() {
            zzaw zzawVar = this.zzg;
            if (zzawVar == null) {
                return zzaw.zzg();
            }
            return zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
                case 3:
                    return new zzbj();
                case 4:
                    return new zza(null);
                case 5:
                    return zzc;
                case 6:
                    zzgzr<zzbj> zzgzrVar = zzd;
                    if (zzgzrVar == null) {
                        synchronized (zzbj.class) {
                            zzgzrVar = zzd;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzc);
                                zzd = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbk
        public boolean zzi() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbk
        public boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzbk extends zzgzk {
        zzq zza();

        zzaw zzb();

        boolean zzi();

        boolean zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzbl extends zzgxy<zzbl, zza> implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzc;
        private static volatile zzgzr<zzbl> zzd;
        private int zze;
        private boolean zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzbl, zza> implements zzbm {
            private zza() {
                super(zzbl.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbm
            public int zza() {
                return ((zzbl) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzbl) this.zza).zzA();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzbl) this.zza).zzB();
                return this;
            }

            public zza zzd(boolean z10) {
                zzbu();
                ((zzbl) this.zza).zzC(z10);
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzbl) this.zza).zzD(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbm
            public boolean zzf() {
                return ((zzbl) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbm
            public boolean zzg() {
                return ((zzbl) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzbm
            public boolean zzh() {
                return ((zzbl) this.zza).zzh();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzbl zzblVar = new zzbl();
            zzc = zzblVar;
            zzgxy.zzcb(zzbl.class, zzblVar);
        }

        private zzbl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(boolean z10) {
            this.zze |= 1;
            this.zzf = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i10) {
            this.zze |= 2;
            this.zzg = i10;
        }

        public static zza zzc() {
            return zzc.zzaZ();
        }

        public static zza zzd(zzbl zzblVar) {
            return zzc.zzba(zzblVar);
        }

        public static zzbl zzi() {
            return zzc;
        }

        public static zzbl zzj(InputStream inputStream) {
            return (zzbl) zzgxy.zzbk(zzc, inputStream);
        }

        public static zzbl zzk(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzbl) zzgxy.zzbl(zzc, inputStream, zzgxiVar);
        }

        public static zzbl zzl(zzgwm zzgwmVar) {
            return (zzbl) zzgxy.zzbm(zzc, zzgwmVar);
        }

        public static zzbl zzm(zzgww zzgwwVar) {
            return (zzbl) zzgxy.zzbn(zzc, zzgwwVar);
        }

        public static zzbl zzn(InputStream inputStream) {
            return (zzbl) zzgxy.zzbo(zzc, inputStream);
        }

        public static zzbl zzo(ByteBuffer byteBuffer) {
            return (zzbl) zzgxy.zzbp(zzc, byteBuffer);
        }

        public static zzbl zzp(byte[] bArr) {
            return (zzbl) zzgxy.zzbq(zzc, bArr);
        }

        public static zzbl zzq(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzbl) zzgxy.zzbr(zzc, zzgwmVar, zzgxiVar);
        }

        public static zzbl zzr(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzbl) zzgxy.zzbs(zzc, zzgwwVar, zzgxiVar);
        }

        public static zzbl zzs(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzbl) zzgxy.zzbu(zzc, inputStream, zzgxiVar);
        }

        public static zzbl zzt(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzbl) zzgxy.zzbv(zzc, byteBuffer, zzgxiVar);
        }

        public static zzbl zzu(byte[] bArr, zzgxi zzgxiVar) {
            return (zzbl) zzgxy.zzbx(zzc, bArr, zzgxiVar);
        }

        public static zzgzr<zzbl> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbm
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 3:
                    return new zzbl();
                case 4:
                    return new zza(null);
                case 5:
                    return zzc;
                case 6:
                    zzgzr<zzbl> zzgzrVar = zzd;
                    if (zzgzrVar == null) {
                        synchronized (zzbl.class) {
                            zzgzrVar = zzd;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzc);
                                zzd = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbm
        public boolean zzf() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbm
        public boolean zzg() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzbm
        public boolean zzh() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzbm extends zzgzk {
        int zza();

        boolean zzf();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzc extends zzgzk {
        int zza();

        zzb.zza zzb(int i10);

        List<zzb.zza> zzl();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzd extends zzgxy<zzd, zzb> implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzc;
        private static volatile zzgzr<zzd> zzd;
        private int zze;
        private int zzf;
        private zzal zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public enum zza implements zzgyc {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);
            
            public static final int zzl = 0;
            public static final int zzm = 1;
            public static final int zzn = 2;
            public static final int zzo = 3;
            public static final int zzp = 4;
            public static final int zzq = 5;
            public static final int zzr = 6;
            public static final int zzs = 7;
            public static final int zzt = 8;
            public static final int zzu = 9;
            public static final int zzv = 10;
            private static final zzgyd<zza> zzw = new zzgyd<zza>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzd.zza.1
                /* renamed from: zza */
                public zza zzb(int i10) {
                    return zza.zzb(i10);
                }
            };
            private final int zzy;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbbc$zzd$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public final class C0162zza implements zzgye {
                static final zzgye zza = new C0162zza();

                private C0162zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgye
                public boolean zza(int i10) {
                    if (zza.zzb(i10) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zza(int i10) {
                this.zzy = i10;
            }

            public static zza zzb(int i10) {
                switch (i10) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzgyd<zza> zzd() {
                return zzw;
            }

            public static zzgye zze() {
                return C0162zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgyc
            public final int zza() {
                return this.zzy;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zzb extends zzgxs<zzd, zzb> implements zze {
            private zzb() {
                super(zzd.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zze
            public zza zza() {
                return ((zzd) this.zza).zza();
            }

            public zzb zzb() {
                zzbu();
                ((zzd) this.zza).zzB();
                return this;
            }

            public zzb zzc() {
                zzbu();
                ((zzd) this.zza).zzC();
                return this;
            }

            public zzb zzd(zzal zzalVar) {
                zzbu();
                ((zzd) this.zza).zzD(zzalVar);
                return this;
            }

            public zzb zze(zzal.zza zzaVar) {
                zzbu();
                ((zzd) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zzb zzf(zzal zzalVar) {
                zzbu();
                ((zzd) this.zza).zzE(zzalVar);
                return this;
            }

            public zzb zzg(zza zzaVar) {
                zzbu();
                ((zzd) this.zza).zzF(zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zze
            public zzal zzh() {
                return ((zzd) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zze
            public boolean zzi() {
                return ((zzd) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zze
            public boolean zzj() {
                return ((zzd) this.zza).zzj();
            }

            public /* synthetic */ zzb(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzgxy.zzcb(zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzal zzalVar) {
            zzalVar.getClass();
            zzal zzalVar2 = this.zzg;
            if (zzalVar2 != null && zzalVar2 != zzal.zzf()) {
                zzal.zza zzd2 = zzal.zzd(zzalVar2);
                zzd2.zzbj(zzalVar);
                zzalVar = zzd2.zzbs();
            }
            this.zzg = zzalVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zzal zzalVar) {
            zzalVar.getClass();
            this.zzg = zzalVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF(zza zzaVar) {
            this.zzf = zzaVar.zza();
            this.zze |= 1;
        }

        public static zzb zzc() {
            return zzc.zzaZ();
        }

        public static zzb zzd(zzd zzdVar) {
            return zzc.zzba(zzdVar);
        }

        public static zzd zzf() {
            return zzc;
        }

        public static zzd zzg(InputStream inputStream) {
            return (zzd) zzgxy.zzbk(zzc, inputStream);
        }

        public static zzd zzk(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzd) zzgxy.zzbl(zzc, inputStream, zzgxiVar);
        }

        public static zzd zzl(zzgwm zzgwmVar) {
            return (zzd) zzgxy.zzbm(zzc, zzgwmVar);
        }

        public static zzd zzm(zzgww zzgwwVar) {
            return (zzd) zzgxy.zzbn(zzc, zzgwwVar);
        }

        public static zzd zzn(InputStream inputStream) {
            return (zzd) zzgxy.zzbo(zzc, inputStream);
        }

        public static zzd zzo(ByteBuffer byteBuffer) {
            return (zzd) zzgxy.zzbp(zzc, byteBuffer);
        }

        public static zzd zzp(byte[] bArr) {
            return (zzd) zzgxy.zzbq(zzc, bArr);
        }

        public static zzd zzq(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzd) zzgxy.zzbr(zzc, zzgwmVar, zzgxiVar);
        }

        public static zzd zzr(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzd) zzgxy.zzbs(zzc, zzgwwVar, zzgxiVar);
        }

        public static zzd zzs(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzd) zzgxy.zzbu(zzc, inputStream, zzgxiVar);
        }

        public static zzd zzt(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzd) zzgxy.zzbv(zzc, byteBuffer, zzgxiVar);
        }

        public static zzd zzu(byte[] bArr, zzgxi zzgxiVar) {
            return (zzd) zzgxy.zzbx(zzc, bArr, zzgxiVar);
        }

        public static zzgzr<zzd> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zze
        public zza zza() {
            zza zzb2 = zza.zzb(this.zzf);
            if (zzb2 == null) {
                return zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zza.zze(), "zzg"});
                case 3:
                    return new zzd();
                case 4:
                    return new zzb(null);
                case 5:
                    return zzc;
                case 6:
                    zzgzr<zzd> zzgzrVar = zzd;
                    if (zzgzrVar == null) {
                        synchronized (zzd.class) {
                            zzgzrVar = zzd;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzc);
                                zzd = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zze
        public zzal zzh() {
            zzal zzalVar = this.zzg;
            if (zzalVar == null) {
                return zzal.zzf();
            }
            return zzalVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zze
        public boolean zzi() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zze
        public boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zze extends zzgzk {
        zzd.zza zza();

        zzal zzh();

        boolean zzi();

        boolean zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzf extends zzgzk {
        int zza();

        zzd zzab(int i10);

        zzg zzac();

        zzi zzad();

        zzk zzae();

        zzq zzaf();

        zzx zzag();

        zzz zzah();

        zzac zzai();

        zzah zzaj();

        zzat zzak(int i10);

        List<zzd> zzal();

        List<zzat> zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        boolean zzav();

        int zzb();

        zza.EnumC0157zza zzc();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzg extends zzgxy<zzg, zza> implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzd;
        private static volatile zzgzr<zzg> zze;
        private int zzf;
        private String zzg = "";
        private zzgyk<zzd> zzh = zzgxy.zzbK();
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzg, zza> implements zzh {
            private zza() {
                super(zzg.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzh
            public int zza() {
                return ((zzg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzh
            public zzd zzb(int i10) {
                return ((zzg) this.zza).zzb(i10);
            }

            public zza zzc(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zzg) this.zza).zzM(iterable);
                return this;
            }

            public zza zzd(zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzN(zzbVar.zzbr());
                return this;
            }

            public zza zze(zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzN(zzdVar);
                return this;
            }

            public zza zzf(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzO(i10, zzbVar.zzbr());
                return this;
            }

            public zza zzg(int i10, zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzO(i10, zzdVar);
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzg) this.zza).zzP();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzg) this.zza).zzQ();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzg) this.zza).zzR();
                return this;
            }

            public zza zzk(int i10) {
                zzbu();
                ((zzg) this.zza).zzT(i10);
                return this;
            }

            public zza zzl(String str) {
                zzbu();
                ((zzg) this.zza).zzU(str);
                return this;
            }

            public zza zzm(zzgwm zzgwmVar) {
                zzbu();
                ((zzg) this.zza).zzV(zzgwmVar);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzg) this.zza).zzW(zzqVar);
                return this;
            }

            public zza zzo(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzX(i10, zzbVar.zzbr());
                return this;
            }

            public zza zzp(int i10, zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzX(i10, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzh
            public zzq zzq() {
                return ((zzg) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzh
            public zzgwm zzr() {
                return ((zzg) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzh
            public String zzs() {
                return ((zzg) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzh
            public List<zzd> zzt() {
                return Collections.unmodifiableList(((zzg) this.zza).zzt());
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzh
            public boolean zzu() {
                return ((zzg) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzh
            public boolean zzv() {
                return ((zzg) this.zza).zzv();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzd = zzgVar;
            zzgxy.zzcb(zzg.class, zzgVar);
        }

        private zzg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(Iterable<? extends zzd> iterable) {
            zzS();
            zzgvv.zzaQ(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzd zzdVar) {
            zzdVar.getClass();
            zzS();
            this.zzh.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzS();
            this.zzh.add(i10, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP() {
            this.zzf &= -2;
            this.zzg = zzg().zzs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzf &= -3;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzh = zzgxy.zzbK();
        }

        private void zzS() {
            zzgyk<zzd> zzgykVar = this.zzh;
            if (!zzgykVar.zzc()) {
                this.zzh = zzgxy.zzbL(zzgykVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(int i10) {
            zzS();
            this.zzh.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzgwm zzgwmVar) {
            this.zzg = zzgwmVar.zzx();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzS();
            this.zzh.set(i10, zzdVar);
        }

        public static zza zzd() {
            return zzd.zzaZ();
        }

        public static zza zze(zzg zzgVar) {
            return zzd.zzba(zzgVar);
        }

        public static zzg zzg() {
            return zzd;
        }

        public static zzg zzh(InputStream inputStream) {
            return (zzg) zzgxy.zzbk(zzd, inputStream);
        }

        public static zzg zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzg) zzgxy.zzbl(zzd, inputStream, zzgxiVar);
        }

        public static zzg zzj(zzgwm zzgwmVar) {
            return (zzg) zzgxy.zzbm(zzd, zzgwmVar);
        }

        public static zzg zzk(zzgww zzgwwVar) {
            return (zzg) zzgxy.zzbn(zzd, zzgwwVar);
        }

        public static zzg zzl(InputStream inputStream) {
            return (zzg) zzgxy.zzbo(zzd, inputStream);
        }

        public static zzg zzm(ByteBuffer byteBuffer) {
            return (zzg) zzgxy.zzbp(zzd, byteBuffer);
        }

        public static zzg zzn(byte[] bArr) {
            return (zzg) zzgxy.zzbq(zzd, bArr);
        }

        public static zzg zzo(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzg) zzgxy.zzbr(zzd, zzgwmVar, zzgxiVar);
        }

        public static zzg zzp(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzg) zzgxy.zzbs(zzd, zzgwwVar, zzgxiVar);
        }

        public static zzg zzw(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzg) zzgxy.zzbu(zzd, inputStream, zzgxiVar);
        }

        public static zzg zzx(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzg) zzgxy.zzbv(zzd, byteBuffer, zzgxiVar);
        }

        public static zzg zzy(byte[] bArr, zzgxi zzgxiVar) {
            return (zzg) zzgxy.zzbx(zzd, bArr, zzgxiVar);
        }

        public static zzgzr<zzg> zzz() {
            return zzd.zzbN();
        }

        public List<? extends zze> zzA() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzh
        public int zza() {
            return this.zzh.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzh
        public zzd zzb(int i10) {
            return this.zzh.get(i10);
        }

        public zze zzc(int i10) {
            return this.zzh.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", zzq.zze()});
                case 3:
                    return new zzg();
                case 4:
                    return new zza(null);
                case 5:
                    return zzd;
                case 6:
                    zzgzr<zzg> zzgzrVar = zze;
                    if (zzgzrVar == null) {
                        synchronized (zzg.class) {
                            zzgzrVar = zze;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzd);
                                zze = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzh
        public zzq zzq() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzh
        public zzgwm zzr() {
            return zzgwm.zzw(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzh
        public String zzs() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzh
        public List<zzd> zzt() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzh
        public boolean zzu() {
            if ((this.zzf & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzh
        public boolean zzv() {
            if ((this.zzf & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzh extends zzgzk {
        int zza();

        zzd zzb(int i10);

        zzq zzq();

        zzgwm zzr();

        String zzs();

        List<zzd> zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzi extends zzgxy<zzi, zza> implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzf;
        private static volatile zzgzr<zzi> zzg;
        private int zzh;
        private String zzi = "";
        private zzgyk<zzd> zzj = zzgxy.zzbK();
        private int zzk = 1000;
        private int zzl = 1000;
        private int zzm = 1000;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzi, zza> implements zzj {
            private zza() {
                super(zzi.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public boolean zzA() {
                return ((zzi) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public boolean zzB() {
                return ((zzi) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public boolean zzC() {
                return ((zzi) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public boolean zzD() {
                return ((zzi) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public int zza() {
                return ((zzi) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public zzd zzb(int i10) {
                return ((zzi) this.zza).zzb(i10);
            }

            public zza zzc(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zzi) this.zza).zzU(iterable);
                return this;
            }

            public zza zzd(zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzV(zzbVar.zzbr());
                return this;
            }

            public zza zze(zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzV(zzdVar);
                return this;
            }

            public zza zzf(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzW(i10, zzbVar.zzbr());
                return this;
            }

            public zza zzg(int i10, zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzW(i10, zzdVar);
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzi) this.zza).zzX();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzi) this.zza).zzY();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzi) this.zza).zzZ();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzi) this.zza).zzaa();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzi) this.zza).zzab();
                return this;
            }

            public zza zzm(int i10) {
                zzbu();
                ((zzi) this.zza).zzad(i10);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzae(zzqVar);
                return this;
            }

            public zza zzo(String str) {
                zzbu();
                ((zzi) this.zza).zzaf(str);
                return this;
            }

            public zza zzp(zzgwm zzgwmVar) {
                zzbu();
                ((zzi) this.zza).zzag(zzgwmVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzah(zzqVar);
                return this;
            }

            public zza zzr(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzai(zzqVar);
                return this;
            }

            public zza zzs(int i10, zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzaj(i10, zzbVar.zzbr());
                return this;
            }

            public zza zzt(int i10, zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzaj(i10, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public zzq zzu() {
                return ((zzi) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public zzq zzv() {
                return ((zzi) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public zzq zzw() {
                return ((zzi) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public zzgwm zzx() {
                return ((zzi) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public String zzy() {
                return ((zzi) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzj
            public List<zzd> zzz() {
                return Collections.unmodifiableList(((zzi) this.zza).zzz());
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzi zziVar = new zzi();
            zzf = zziVar;
            zzgxy.zzcb(zzi.class, zziVar);
        }

        private zzi() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(Iterable<? extends zzd> iterable) {
            zzac();
            zzgvv.zzaQ(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzd zzdVar) {
            zzdVar.getClass();
            zzac();
            this.zzj.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzac();
            this.zzj.add(i10, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX() {
            this.zzh &= -9;
            this.zzm = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY() {
            this.zzh &= -2;
            this.zzi = zzg().zzy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ() {
            this.zzh &= -5;
            this.zzl = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa() {
            this.zzh &= -3;
            this.zzk = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab() {
            this.zzj = zzgxy.zzbK();
        }

        private void zzac() {
            zzgyk<zzd> zzgykVar = this.zzj;
            if (!zzgykVar.zzc()) {
                this.zzj = zzgxy.zzbL(zzgykVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad(int i10) {
            zzac();
            this.zzj.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae(zzq zzqVar) {
            this.zzm = zzqVar.zza();
            this.zzh |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf(String str) {
            str.getClass();
            this.zzh |= 1;
            this.zzi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag(zzgwm zzgwmVar) {
            this.zzi = zzgwmVar.zzx();
            this.zzh |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah(zzq zzqVar) {
            this.zzl = zzqVar.zza();
            this.zzh |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai(zzq zzqVar) {
            this.zzk = zzqVar.zza();
            this.zzh |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(int i10, zzd zzdVar) {
            zzdVar.getClass();
            zzac();
            this.zzj.set(i10, zzdVar);
        }

        public static zza zzd() {
            return zzf.zzaZ();
        }

        public static zza zze(zzi zziVar) {
            return zzf.zzba(zziVar);
        }

        public static zzi zzg() {
            return zzf;
        }

        public static zzi zzh(InputStream inputStream) {
            return (zzi) zzgxy.zzbk(zzf, inputStream);
        }

        public static zzi zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzi) zzgxy.zzbl(zzf, inputStream, zzgxiVar);
        }

        public static zzi zzj(zzgwm zzgwmVar) {
            return (zzi) zzgxy.zzbm(zzf, zzgwmVar);
        }

        public static zzi zzk(zzgww zzgwwVar) {
            return (zzi) zzgxy.zzbn(zzf, zzgwwVar);
        }

        public static zzi zzl(InputStream inputStream) {
            return (zzi) zzgxy.zzbo(zzf, inputStream);
        }

        public static zzi zzm(ByteBuffer byteBuffer) {
            return (zzi) zzgxy.zzbp(zzf, byteBuffer);
        }

        public static zzi zzn(byte[] bArr) {
            return (zzi) zzgxy.zzbq(zzf, bArr);
        }

        public static zzi zzo(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzi) zzgxy.zzbr(zzf, zzgwmVar, zzgxiVar);
        }

        public static zzi zzp(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzi) zzgxy.zzbs(zzf, zzgwwVar, zzgxiVar);
        }

        public static zzi zzq(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzi) zzgxy.zzbu(zzf, inputStream, zzgxiVar);
        }

        public static zzi zzr(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzi) zzgxy.zzbv(zzf, byteBuffer, zzgxiVar);
        }

        public static zzi zzs(byte[] bArr, zzgxi zzgxiVar) {
            return (zzi) zzgxy.zzbx(zzf, bArr, zzgxiVar);
        }

        public static zzgzr<zzi> zzt() {
            return zzf.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public boolean zzA() {
            if ((this.zzh & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public boolean zzB() {
            if ((this.zzh & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public boolean zzC() {
            if ((this.zzh & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public boolean zzD() {
            if ((this.zzh & 2) != 0) {
                return true;
            }
            return false;
        }

        public List<? extends zze> zzE() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public int zza() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public zzd zzb(int i10) {
            return this.zzj.get(i10);
        }

        public zze zzc(int i10) {
            return this.zzj.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", zzd.class, "zzk", zzq.zze(), "zzl", zzq.zze(), "zzm", zzq.zze()});
                case 3:
                    return new zzi();
                case 4:
                    return new zza(null);
                case 5:
                    return zzf;
                case 6:
                    zzgzr<zzi> zzgzrVar = zzg;
                    if (zzgzrVar == null) {
                        synchronized (zzi.class) {
                            zzgzrVar = zzg;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzf);
                                zzg = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public zzq zzu() {
            zzq zzb2 = zzq.zzb(this.zzm);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public zzq zzv() {
            zzq zzb2 = zzq.zzb(this.zzl);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public zzq zzw() {
            zzq zzb2 = zzq.zzb(this.zzk);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public zzgwm zzx() {
            return zzgwm.zzw(this.zzi);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public String zzy() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzj
        public List<zzd> zzz() {
            return this.zzj;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzj extends zzgzk {
        boolean zzA();

        boolean zzB();

        boolean zzC();

        boolean zzD();

        int zza();

        zzd zzb(int i10);

        zzq zzu();

        zzq zzv();

        zzq zzw();

        zzgwm zzx();

        String zzy();

        List<zzd> zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzk extends zzgxy<zzk, zza> implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzg;
        private static volatile zzgzr<zzk> zzh;
        private int zzi;
        private int zzj;
        private zzap zzk;
        private zzap zzl;
        private zzap zzm;
        private zzgyk<zzap> zzn = zzgxy.zzbK();
        private int zzo;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzk, zza> implements zzl {
            private zza() {
                super(zzk.zzg);
            }

            public zza zzA(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzar(zzapVar);
                return this;
            }

            public zza zzB(int i10) {
                zzbu();
                ((zzk) this.zza).zzas(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public zzap zzC() {
                return ((zzk) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public zzap zzD() {
                return ((zzk) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public zzap zzE(int i10) {
                return ((zzk) this.zza).zzE(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public zzap zzF() {
                return ((zzk) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public List<zzap> zzG() {
                return Collections.unmodifiableList(((zzk) this.zza).zzG());
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public boolean zzH() {
                return ((zzk) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public boolean zzI() {
                return ((zzk) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public boolean zzJ() {
                return ((zzk) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public boolean zzK() {
                return ((zzk) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public boolean zzL() {
                return ((zzk) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public int zza() {
                return ((zzk) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public int zzb() {
                return ((zzk) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzl
            public int zzc() {
                return ((zzk) this.zza).zzc();
            }

            public zza zzd(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzZ(zzaVar.zzbr());
                return this;
            }

            public zza zze(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzZ(zzapVar);
                return this;
            }

            public zza zzf(int i10, zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzaa(i10, zzaVar.zzbr());
                return this;
            }

            public zza zzg(int i10, zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaa(i10, zzapVar);
                return this;
            }

            public zza zzh(Iterable<? extends zzap> iterable) {
                zzbu();
                ((zzk) this.zza).zzab(iterable);
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzk) this.zza).zzac();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzk) this.zza).zzad();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzk) this.zza).zzae();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzk) this.zza).zzaf();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzk) this.zza).zzag();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzk) this.zza).zzah();
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaj(zzapVar);
                return this;
            }

            public zza zzp(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzak(zzapVar);
                return this;
            }

            public zza zzq(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzal(zzapVar);
                return this;
            }

            public zza zzr(int i10) {
                zzbu();
                ((zzk) this.zza).zzam(i10);
                return this;
            }

            public zza zzs(int i10) {
                zzbu();
                ((zzk) this.zza).zzan(i10);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzao(zzaVar.zzbr());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzao(zzapVar);
                return this;
            }

            public zza zzv(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzap(zzaVar.zzbr());
                return this;
            }

            public zza zzw(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzap(zzapVar);
                return this;
            }

            public zza zzx(int i10, zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzaq(i10, zzaVar.zzbr());
                return this;
            }

            public zza zzy(int i10, zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaq(i10, zzapVar);
                return this;
            }

            public zza zzz(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzar(zzaVar.zzbr());
                return this;
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzg = zzkVar;
            zzgxy.zzcb(zzk.class, zzkVar);
        }

        private zzk() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzap zzapVar) {
            zzapVar.getClass();
            zzai();
            this.zzn.add(zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(int i10, zzap zzapVar) {
            zzapVar.getClass();
            zzai();
            this.zzn.add(i10, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(Iterable<? extends zzap> iterable) {
            zzai();
            zzgvv.zzaQ(iterable, this.zzn);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac() {
            this.zzi &= -2;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad() {
            this.zzl = null;
            this.zzi &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae() {
            this.zzk = null;
            this.zzi &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf() {
            this.zzn = zzgxy.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag() {
            this.zzm = null;
            this.zzi &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah() {
            this.zzi &= -17;
            this.zzo = 0;
        }

        private void zzai() {
            zzgyk<zzap> zzgykVar = this.zzn;
            if (!zzgykVar.zzc()) {
                this.zzn = zzgxy.zzbL(zzgykVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzl;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam(int i10) {
            zzai();
            this.zzn.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan(int i10) {
            this.zzi |= 1;
            this.zzj = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao(zzap zzapVar) {
            zzapVar.getClass();
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq(int i10, zzap zzapVar) {
            zzapVar.getClass();
            zzai();
            this.zzn.set(i10, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(int i10) {
            this.zzi |= 16;
            this.zzo = i10;
        }

        public static zza zzd() {
            return zzg.zzaZ();
        }

        public static zza zze(zzk zzkVar) {
            return zzg.zzba(zzkVar);
        }

        public static zzk zzg() {
            return zzg;
        }

        public static zzk zzh(InputStream inputStream) {
            return (zzk) zzgxy.zzbk(zzg, inputStream);
        }

        public static zzk zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzk) zzgxy.zzbl(zzg, inputStream, zzgxiVar);
        }

        public static zzk zzj(zzgwm zzgwmVar) {
            return (zzk) zzgxy.zzbm(zzg, zzgwmVar);
        }

        public static zzk zzk(zzgww zzgwwVar) {
            return (zzk) zzgxy.zzbn(zzg, zzgwwVar);
        }

        public static zzk zzl(InputStream inputStream) {
            return (zzk) zzgxy.zzbo(zzg, inputStream);
        }

        public static zzk zzm(ByteBuffer byteBuffer) {
            return (zzk) zzgxy.zzbp(zzg, byteBuffer);
        }

        public static zzk zzn(byte[] bArr) {
            return (zzk) zzgxy.zzbq(zzg, bArr);
        }

        public static zzk zzo(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzk) zzgxy.zzbr(zzg, zzgwmVar, zzgxiVar);
        }

        public static zzk zzp(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzk) zzgxy.zzbs(zzg, zzgwwVar, zzgxiVar);
        }

        public static zzk zzq(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzk) zzgxy.zzbu(zzg, inputStream, zzgxiVar);
        }

        public static zzk zzr(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzk) zzgxy.zzbv(zzg, byteBuffer, zzgxiVar);
        }

        public static zzk zzs(byte[] bArr, zzgxi zzgxiVar) {
            return (zzk) zzgxy.zzbx(zzg, bArr, zzgxiVar);
        }

        public static zzgzr<zzk> zzu() {
            return zzg.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public zzap zzC() {
            zzap zzapVar = this.zzl;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public zzap zzD() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public zzap zzE(int i10) {
            return this.zzn.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public zzap zzF() {
            zzap zzapVar = this.zzm;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public List<zzap> zzG() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public boolean zzH() {
            if ((this.zzi & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public boolean zzI() {
            if ((this.zzi & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public boolean zzJ() {
            if ((this.zzi & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public boolean zzK() {
            if ((this.zzi & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public boolean zzL() {
            if ((this.zzi & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public int zza() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public int zzb() {
            return this.zzn.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzl
        public int zzc() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzg, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzap.class, "zzo"});
                case 3:
                    return new zzk();
                case 4:
                    return new zza(null);
                case 5:
                    return zzg;
                case 6:
                    zzgzr<zzk> zzgzrVar = zzh;
                    if (zzgzrVar == null) {
                        synchronized (zzk.class) {
                            zzgzrVar = zzh;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzg);
                                zzh = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public zzaq zzt(int i10) {
            return this.zzn.get(i10);
        }

        public List<? extends zzaq> zzv() {
            return this.zzn;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzl extends zzgzk {
        zzap zzC();

        zzap zzD();

        zzap zzE(int i10);

        zzap zzF();

        List<zzap> zzG();

        boolean zzH();

        boolean zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        int zza();

        int zzb();

        int zzc();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzm extends zzgxy<zzm, zza> implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzi;
        private static volatile zzgzr<zzm> zzj;
        private int zzk;
        private zzap zzm;
        private int zzn;
        private zzar zzo;
        private int zzp;
        private String zzl = "";
        private int zzu = 1000;
        private int zzv = 1000;
        private int zzw = 1000;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzm, zza> implements zzn {
            private zza() {
                super(zzm.zzi);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public zzap zzA() {
                return ((zzm) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public zzar zzB() {
                return ((zzm) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public zzgwm zzC() {
                return ((zzm) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public String zzD() {
                return ((zzm) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public boolean zzE() {
                return ((zzm) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public boolean zzF() {
                return ((zzm) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public boolean zzG() {
                return ((zzm) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public boolean zzH() {
                return ((zzm) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public boolean zzI() {
                return ((zzm) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public boolean zzJ() {
                return ((zzm) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public boolean zzK() {
                return ((zzm) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public boolean zzL() {
                return ((zzm) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public int zza() {
                return ((zzm) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public int zzb() {
                return ((zzm) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzm) this.zza).zzab();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzm) this.zza).zzac();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzm) this.zza).zzad();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzm) this.zza).zzae();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzm) this.zza).zzaf();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzm) this.zza).zzag();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzm) this.zza).zzah();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzm) this.zza).zzai();
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbu();
                ((zzm) this.zza).zzaj(zzapVar);
                return this;
            }

            public zza zzl(zzar zzarVar) {
                zzbu();
                ((zzm) this.zza).zzak(zzarVar);
                return this;
            }

            public zza zzm(String str) {
                zzbu();
                ((zzm) this.zza).zzal(str);
                return this;
            }

            public zza zzn(zzgwm zzgwmVar) {
                zzbu();
                ((zzm) this.zza).zzam(zzgwmVar);
                return this;
            }

            public zza zzo(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzan(zzqVar);
                return this;
            }

            public zza zzp(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzao(zzqVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzap(zzqVar);
                return this;
            }

            public zza zzr(zzap.zza zzaVar) {
                zzbu();
                ((zzm) this.zza).zzaq(zzaVar.zzbr());
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbu();
                ((zzm) this.zza).zzaq(zzapVar);
                return this;
            }

            public zza zzt(int i10) {
                zzbu();
                ((zzm) this.zza).zzar(i10);
                return this;
            }

            public zza zzu(int i10) {
                zzbu();
                ((zzm) this.zza).zzas(i10);
                return this;
            }

            public zza zzv(zzar.zza zzaVar) {
                zzbu();
                ((zzm) this.zza).zzat(zzaVar.zzbr());
                return this;
            }

            public zza zzw(zzar zzarVar) {
                zzbu();
                ((zzm) this.zza).zzat(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public zzq zzx() {
                return ((zzm) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public zzq zzy() {
                return ((zzm) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzn
            public zzq zzz() {
                return ((zzm) this.zza).zzz();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzi = zzmVar;
            zzgxy.zzcb(zzm.class, zzmVar);
        }

        private zzm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab() {
            this.zzk &= -2;
            this.zzl = zzf().zzD();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac() {
            this.zzk &= -33;
            this.zzu = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad() {
            this.zzk &= -65;
            this.zzv = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae() {
            this.zzk &= -129;
            this.zzw = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf() {
            this.zzm = null;
            this.zzk &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag() {
            this.zzk &= -17;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah() {
            this.zzk &= -5;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai() {
            this.zzo = null;
            this.zzk &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzo;
            if (zzarVar2 != null && zzarVar2 != zzar.zzg()) {
                zzar.zza zze2 = zzar.zze(zzarVar2);
                zze2.zzbj(zzarVar);
                zzarVar = zze2.zzbs();
            }
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal(String str) {
            str.getClass();
            this.zzk |= 1;
            this.zzl = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam(zzgwm zzgwmVar) {
            this.zzl = zzgwmVar.zzx();
            this.zzk |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan(zzq zzqVar) {
            this.zzu = zzqVar.zza();
            this.zzk |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao(zzq zzqVar) {
            this.zzv = zzqVar.zza();
            this.zzk |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap(zzq zzqVar) {
            this.zzw = zzqVar.zza();
            this.zzk |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar(int i10) {
            this.zzk |= 16;
            this.zzp = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(int i10) {
            this.zzk |= 4;
            this.zzn = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat(zzar zzarVar) {
            zzarVar.getClass();
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        public static zza zzc() {
            return zzi.zzaZ();
        }

        public static zza zzd(zzm zzmVar) {
            return zzi.zzba(zzmVar);
        }

        public static zzm zzf() {
            return zzi;
        }

        public static zzm zzg(InputStream inputStream) {
            return (zzm) zzgxy.zzbk(zzi, inputStream);
        }

        public static zzm zzh(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzm) zzgxy.zzbl(zzi, inputStream, zzgxiVar);
        }

        public static zzm zzi(zzgwm zzgwmVar) {
            return (zzm) zzgxy.zzbm(zzi, zzgwmVar);
        }

        public static zzm zzj(zzgww zzgwwVar) {
            return (zzm) zzgxy.zzbn(zzi, zzgwwVar);
        }

        public static zzm zzk(InputStream inputStream) {
            return (zzm) zzgxy.zzbo(zzi, inputStream);
        }

        public static zzm zzl(ByteBuffer byteBuffer) {
            return (zzm) zzgxy.zzbp(zzi, byteBuffer);
        }

        public static zzm zzm(byte[] bArr) {
            return (zzm) zzgxy.zzbq(zzi, bArr);
        }

        public static zzm zzn(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzm) zzgxy.zzbr(zzi, zzgwmVar, zzgxiVar);
        }

        public static zzm zzo(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzm) zzgxy.zzbs(zzi, zzgwwVar, zzgxiVar);
        }

        public static zzm zzp(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzm) zzgxy.zzbu(zzi, inputStream, zzgxiVar);
        }

        public static zzm zzq(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzm) zzgxy.zzbv(zzi, byteBuffer, zzgxiVar);
        }

        public static zzm zzr(byte[] bArr, zzgxi zzgxiVar) {
            return (zzm) zzgxy.zzbx(zzi, bArr, zzgxiVar);
        }

        public static zzgzr<zzm> zzs() {
            return zzi.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public zzap zzA() {
            zzap zzapVar = this.zzm;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public zzar zzB() {
            zzar zzarVar = this.zzo;
            if (zzarVar == null) {
                return zzar.zzg();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public zzgwm zzC() {
            return zzgwm.zzw(this.zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public String zzD() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public boolean zzE() {
            if ((this.zzk & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public boolean zzF() {
            if ((this.zzk & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public boolean zzG() {
            if ((this.zzk & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public boolean zzH() {
            if ((this.zzk & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public boolean zzI() {
            if ((this.zzk & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public boolean zzJ() {
            if ((this.zzk & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public boolean zzK() {
            if ((this.zzk & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public boolean zzL() {
            if ((this.zzk & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public int zza() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public int zzb() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzi, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzq.zze(), "zzv", zzq.zze(), "zzw", zzq.zze()});
                case 3:
                    return new zzm();
                case 4:
                    return new zza(null);
                case 5:
                    return zzi;
                case 6:
                    zzgzr<zzm> zzgzrVar = zzj;
                    if (zzgzrVar == null) {
                        synchronized (zzm.class) {
                            zzgzrVar = zzj;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzi);
                                zzj = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public zzq zzx() {
            zzq zzb2 = zzq.zzb(this.zzu);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public zzq zzy() {
            zzq zzb2 = zzq.zzb(this.zzv);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzn
        public zzq zzz() {
            zzq zzb2 = zzq.zzb(this.zzw);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzn extends zzgzk {
        zzap zzA();

        zzar zzB();

        zzgwm zzC();

        String zzD();

        boolean zzE();

        boolean zzF();

        boolean zzG();

        boolean zzH();

        boolean zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        int zza();

        int zzb();

        zzq zzx();

        zzq zzy();

        zzq zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzo extends zzgxy<zzo, zza> implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zze;
        private static volatile zzgzr<zzo> zzf;
        private int zzg;
        private int zzh;
        private zzar zzi;
        private String zzj = "";
        private String zzk = "";

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzo, zza> implements zzp {
            private zza() {
                super(zzo.zze);
            }

            public zza zza() {
                zzbu();
                ((zzo) this.zza).zzN();
                return this;
            }

            public zza zzb() {
                zzbu();
                ((zzo) this.zza).zzO();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzo) this.zza).zzP();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzo) this.zza).zzQ();
                return this;
            }

            public zza zze(zzar zzarVar) {
                zzbu();
                ((zzo) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzf(String str) {
                zzbu();
                ((zzo) this.zza).zzS(str);
                return this;
            }

            public zza zzg(zzgwm zzgwmVar) {
                zzbu();
                ((zzo) this.zza).zzT(zzgwmVar);
                return this;
            }

            public zza zzh(zzar.zza zzaVar) {
                zzbu();
                ((zzo) this.zza).zzU(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzar zzarVar) {
                zzbu();
                ((zzo) this.zza).zzU(zzarVar);
                return this;
            }

            public zza zzj(zzb zzbVar) {
                zzbu();
                ((zzo) this.zza).zzV(zzbVar);
                return this;
            }

            public zza zzk(String str) {
                zzbu();
                ((zzo) this.zza).zzW(str);
                return this;
            }

            public zza zzl(zzgwm zzgwmVar) {
                zzbu();
                ((zzo) this.zza).zzX(zzgwmVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzp
            public zzb zzm() {
                return ((zzo) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzp
            public zzar zzn() {
                return ((zzo) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzp
            public zzgwm zzo() {
                return ((zzo) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzp
            public zzgwm zzp() {
                return ((zzo) this.zza).zzp();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzp
            public String zzq() {
                return ((zzo) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzp
            public String zzr() {
                return ((zzo) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzp
            public boolean zzs() {
                return ((zzo) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzp
            public boolean zzt() {
                return ((zzo) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzp
            public boolean zzu() {
                return ((zzo) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzp
            public boolean zzv() {
                return ((zzo) this.zza).zzv();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public enum zzb implements zzgyc {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);
            
            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzgyd<zzb> zzg = new zzgyd<zzb>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzo.zzb.1
                /* renamed from: zza */
                public zzb zzb(int i10) {
                    return zzb.zzb(i10);
                }
            };
            private final int zzi;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
            /* loaded from: classes2.dex */
            public final class zza implements zzgye {
                static final zzgye zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgye
                public boolean zza(int i10) {
                    if (zzb.zzb(i10) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i10) {
                this.zzi = i10;
            }

            public static zzb zzb(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return ANDROID;
                    }
                    return IOS;
                }
                return PLATFORM_UNSPECIFIED;
            }

            public static zzgyd<zzb> zzd() {
                return zzg;
            }

            public static zzgye zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(zza());
            }

            @Override // com.google.android.gms.internal.ads.zzgyc
            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zze = zzoVar;
            zzgxy.zzcb(zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static zzo zzA(byte[] bArr, zzgxi zzgxiVar) {
            return (zzo) zzgxy.zzbx(zze, bArr, zzgxiVar);
        }

        public static zzgzr<zzo> zzB() {
            return zze.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzg &= -5;
            this.zzj = zze().zzq();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO() {
            this.zzi = null;
            this.zzg &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP() {
            this.zzg &= -2;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzg &= -9;
            this.zzk = zze().zzr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzi;
            if (zzarVar2 != null && zzarVar2 != zzar.zzg()) {
                zzar.zza zze2 = zzar.zze(zzarVar2);
                zze2.zzbj(zzarVar);
                zzarVar = zze2.zzbs();
            }
            this.zzi = zzarVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(String str) {
            str.getClass();
            this.zzg |= 4;
            this.zzj = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(zzgwm zzgwmVar) {
            this.zzj = zzgwmVar.zzx();
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(zzar zzarVar) {
            zzarVar.getClass();
            this.zzi = zzarVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzb zzbVar) {
            this.zzh = zzbVar.zza();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(String str) {
            str.getClass();
            this.zzg |= 8;
            this.zzk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(zzgwm zzgwmVar) {
            this.zzk = zzgwmVar.zzx();
            this.zzg |= 8;
        }

        public static zza zza() {
            return zze.zzaZ();
        }

        public static zza zzc(zzo zzoVar) {
            return zze.zzba(zzoVar);
        }

        public static zzo zze() {
            return zze;
        }

        public static zzo zzf(InputStream inputStream) {
            return (zzo) zzgxy.zzbk(zze, inputStream);
        }

        public static zzo zzg(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzo) zzgxy.zzbl(zze, inputStream, zzgxiVar);
        }

        public static zzo zzh(zzgwm zzgwmVar) {
            return (zzo) zzgxy.zzbm(zze, zzgwmVar);
        }

        public static zzo zzi(zzgww zzgwwVar) {
            return (zzo) zzgxy.zzbn(zze, zzgwwVar);
        }

        public static zzo zzj(InputStream inputStream) {
            return (zzo) zzgxy.zzbo(zze, inputStream);
        }

        public static zzo zzk(ByteBuffer byteBuffer) {
            return (zzo) zzgxy.zzbp(zze, byteBuffer);
        }

        public static zzo zzl(byte[] bArr) {
            return (zzo) zzgxy.zzbq(zze, bArr);
        }

        public static zzo zzw(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzo) zzgxy.zzbr(zze, zzgwmVar, zzgxiVar);
        }

        public static zzo zzx(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzo) zzgxy.zzbs(zze, zzgwwVar, zzgxiVar);
        }

        public static zzo zzy(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzo) zzgxy.zzbu(zze, inputStream, zzgxiVar);
        }

        public static zzo zzz(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzo) zzgxy.zzbv(zze, byteBuffer, zzgxiVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zze, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", zzb.zze(), "zzi", "zzj", "zzk"});
                case 3:
                    return new zzo();
                case 4:
                    return new zza(null);
                case 5:
                    return zze;
                case 6:
                    zzgzr<zzo> zzgzrVar = zzf;
                    if (zzgzrVar == null) {
                        synchronized (zzo.class) {
                            zzgzrVar = zzf;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zze);
                                zzf = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzp
        public zzb zzm() {
            zzb zzb2 = zzb.zzb(this.zzh);
            if (zzb2 == null) {
                return zzb.PLATFORM_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzp
        public zzar zzn() {
            zzar zzarVar = this.zzi;
            if (zzarVar == null) {
                return zzar.zzg();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzp
        public zzgwm zzo() {
            return zzgwm.zzw(this.zzj);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzp
        public zzgwm zzp() {
            return zzgwm.zzw(this.zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzp
        public String zzq() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzp
        public String zzr() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzp
        public boolean zzs() {
            if ((this.zzg & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzp
        public boolean zzt() {
            if ((this.zzg & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzp
        public boolean zzu() {
            if ((this.zzg & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzp
        public boolean zzv() {
            if ((this.zzg & 8) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzp extends zzgzk {
        zzo.zzb zzm();

        zzar zzn();

        zzgwm zzo();

        zzgwm zzp();

        String zzq();

        String zzr();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public enum zzq implements zzgyc {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);
        
        public static final int zzd = 0;
        public static final int zze = 1;
        public static final int zzf = 1000;
        private static final zzgyd<zzq> zzg = new zzgyd<zzq>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzq.1
            /* renamed from: zza */
            public zzq zzb(int i10) {
                return zzq.zzb(i10);
            }
        };
        private final int zzi;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza implements zzgye {
            static final zzgye zza = new zza();

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zzgye
            public boolean zza(int i10) {
                if (zzq.zzb(i10) != null) {
                    return true;
                }
                return false;
            }
        }

        zzq(int i10) {
            this.zzi = i10;
        }

        public static zzq zzb(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 1000) {
                        return null;
                    }
                    return ENUM_UNKNOWN;
                }
                return ENUM_TRUE;
            }
            return ENUM_FALSE;
        }

        public static zzgyd<zzq> zzd() {
            return zzg;
        }

        public static zzgye zze() {
            return zza.zza;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(zza());
        }

        @Override // com.google.android.gms.internal.ads.zzgyc
        public final int zza() {
            return this.zzi;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzr extends zzgxy<zzr, zza> implements zzs {
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        private static final zzgyh<zzd.zza> zzk = new zzgyh<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzr.1
            @Override // com.google.android.gms.internal.ads.zzgyh
            /* renamed from: zza */
            public zzd.zza zzb(int i10) {
                zzd.zza zzb2 = zzd.zza.zzb(i10);
                if (zzb2 == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return zzb2;
            }
        };
        private static final zzgyh<zzd.zza> zzl = new zzgyh<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbbc.zzr.2
            @Override // com.google.android.gms.internal.ads.zzgyh
            /* renamed from: zza */
            public zzd.zza zzb(int i10) {
                zzd.zza zzb2 = zzd.zza.zzb(i10);
                if (zzb2 == null) {
                    return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                }
                return zzb2;
            }
        };
        private static final zzr zzm;
        private static volatile zzgzr<zzr> zzn;
        private int zzA;
        private int zzo;
        private int zzp;
        private zzar zzv;
        private int zzw;
        private int zzz;
        private String zzu = "";
        private String zzx = "";
        private String zzy = "";
        private zzgyg zzB = zzgxy.zzbG();
        private zzgyg zzC = zzgxy.zzbG();

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzr, zza> implements zzs {
            private zza() {
                super(zzr.zzm);
            }

            public zza zzA(String str) {
                zzbu();
                ((zzr) this.zza).zzcj(str);
                return this;
            }

            public zza zzB(zzgwm zzgwmVar) {
                zzbu();
                ((zzr) this.zza).zzck(zzgwmVar);
                return this;
            }

            public zza zzC(String str) {
                zzbu();
                ((zzr) this.zza).zzcl(str);
                return this;
            }

            public zza zzD(zzgwm zzgwmVar) {
                zzbu();
                ((zzr) this.zza).zzcm(zzgwmVar);
                return this;
            }

            public zza zzE(int i10) {
                zzbu();
                ((zzr) this.zza).zzcn(i10);
                return this;
            }

            public zza zzF(zzar.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzco(zzaVar.zzbr());
                return this;
            }

            public zza zzG(zzar zzarVar) {
                zzbu();
                ((zzr) this.zza).zzco(zzarVar);
                return this;
            }

            public zza zzH(zzo.zzb zzbVar) {
                zzbu();
                ((zzr) this.zza).zzcp(zzbVar);
                return this;
            }

            public zza zzI(int i10, zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcq(i10, zzaVar);
                return this;
            }

            public zza zzJ(int i10, zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcr(i10, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public zzab.zzc zzK() {
                return ((zzr) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public zzar zzL() {
                return ((zzr) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public zzgwm zzM() {
                return ((zzr) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public zzgwm zzN() {
                return ((zzr) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public zzgwm zzO() {
                return ((zzr) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public String zzP() {
                return ((zzr) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public String zzQ() {
                return ((zzr) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public String zzR() {
                return ((zzr) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public List<zzd.zza> zzS() {
                return ((zzr) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public List<zzd.zza> zzT() {
                return ((zzr) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public boolean zzU() {
                return ((zzr) this.zza).zzU();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public boolean zzV() {
                return ((zzr) this.zza).zzV();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public boolean zzW() {
                return ((zzr) this.zza).zzW();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public boolean zzX() {
                return ((zzr) this.zza).zzX();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public boolean zzY() {
                return ((zzr) this.zza).zzY();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public boolean zzZ() {
                return ((zzr) this.zza).zzZ();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public int zza() {
                return ((zzr) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public boolean zzaa() {
                return ((zzr) this.zza).zzaa();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public boolean zzab() {
                return ((zzr) this.zza).zzab();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public int zzb() {
                return ((zzr) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public int zzc() {
                return ((zzr) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public zza.EnumC0157zza zzd() {
                return ((zzr) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public zzd.zza zze(int i10) {
                return ((zzr) this.zza).zze(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public zzd.zza zzf(int i10) {
                return ((zzr) this.zza).zzf(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzs
            public zzo.zzb zzg() {
                return ((zzr) this.zza).zzg();
            }

            public zza zzh(Iterable<? extends zzd.zza> iterable) {
                zzbu();
                ((zzr) this.zza).zzas(iterable);
                return this;
            }

            public zza zzi(Iterable<? extends zzd.zza> iterable) {
                zzbu();
                ((zzr) this.zza).zzat(iterable);
                return this;
            }

            public zza zzj(zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzau(zzaVar);
                return this;
            }

            public zza zzk(zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzav(zzaVar);
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzr) this.zza).zzaw();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzr) this.zza).zzax();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzr) this.zza).zzay();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzr) this.zza).zzaz();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzr) this.zza).zzaA();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzr) this.zza).zzaB();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzr) this.zza).zzaC();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzr) this.zza).zzaD();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzr) this.zza).zzaE();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzr) this.zza).zzaF();
                return this;
            }

            public zza zzv(zzar zzarVar) {
                zzbu();
                ((zzr) this.zza).zzaI(zzarVar);
                return this;
            }

            public zza zzw(zza.EnumC0157zza enumC0157zza) {
                zzbu();
                ((zzr) this.zza).zzaJ(enumC0157zza);
                return this;
            }

            public zza zzx(String str) {
                zzbu();
                ((zzr) this.zza).zzaK(str);
                return this;
            }

            public zza zzy(zzgwm zzgwmVar) {
                zzbu();
                ((zzr) this.zza).zzch(zzgwmVar);
                return this;
            }

            public zza zzz(zzab.zzc zzcVar) {
                zzbu();
                ((zzr) this.zza).zzci(zzcVar);
                return this;
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzm = zzrVar;
            zzgxy.zzcb(zzr.class, zzrVar);
        }

        private zzr() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA() {
            this.zzo &= -3;
            this.zzu = zzk().zzR();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB() {
            this.zzo &= -2;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC() {
            this.zzv = null;
            this.zzo &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD() {
            this.zzo &= -9;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE() {
            this.zzC = zzgxy.zzbG();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF() {
            this.zzB = zzgxy.zzbG();
        }

        private void zzaG() {
            zzgyg zzgygVar = this.zzC;
            if (!zzgygVar.zzc()) {
                this.zzC = zzgxy.zzbH(zzgygVar);
            }
        }

        private void zzaH() {
            zzgyg zzgygVar = this.zzB;
            if (!zzgygVar.zzc()) {
                this.zzB = zzgxy.zzbH(zzgygVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzv;
            if (zzarVar2 != null && zzarVar2 != zzar.zzg()) {
                zzar.zza zze2 = zzar.zze(zzarVar2);
                zze2.zzbj(zzarVar);
                zzarVar = zze2.zzbs();
            }
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ(zza.EnumC0157zza enumC0157zza) {
            this.zzA = enumC0157zza.zza();
            this.zzo |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaK(String str) {
            str.getClass();
            this.zzo |= 16;
            this.zzx = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(Iterable<? extends zzd.zza> iterable) {
            zzaG();
            for (zzd.zza zzaVar : iterable) {
                this.zzC.zzi(zzaVar.zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat(Iterable<? extends zzd.zza> iterable) {
            zzaH();
            for (zzd.zza zzaVar : iterable) {
                this.zzB.zzi(zzaVar.zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaG();
            this.zzC.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzav(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaH();
            this.zzB.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaw() {
            this.zzo &= -129;
            this.zzA = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzax() {
            this.zzo &= -17;
            this.zzx = zzk().zzP();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzay() {
            this.zzo &= -65;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz() {
            this.zzo &= -33;
            this.zzy = zzk().zzQ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch(zzgwm zzgwmVar) {
            this.zzx = zzgwmVar.zzx();
            this.zzo |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci(zzab.zzc zzcVar) {
            this.zzz = zzcVar.zza();
            this.zzo |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj(String str) {
            str.getClass();
            this.zzo |= 32;
            this.zzy = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck(zzgwm zzgwmVar) {
            this.zzy = zzgwmVar.zzx();
            this.zzo |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl(String str) {
            str.getClass();
            this.zzo |= 2;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm(zzgwm zzgwmVar) {
            this.zzu = zzgwmVar.zzx();
            this.zzo |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn(int i10) {
            this.zzo |= 1;
            this.zzp = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco(zzar zzarVar) {
            zzarVar.getClass();
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp(zzo.zzb zzbVar) {
            this.zzw = zzbVar.zza();
            this.zzo |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq(int i10, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaG();
            this.zzC.zze(i10, zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr(int i10, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaH();
            this.zzB.zze(i10, zzaVar.zza());
        }

        public static zza zzh() {
            return zzm.zzaZ();
        }

        public static zza zzi(zzr zzrVar) {
            return zzm.zzba(zzrVar);
        }

        public static zzr zzk() {
            return zzm;
        }

        public static zzr zzl(InputStream inputStream) {
            return (zzr) zzgxy.zzbk(zzm, inputStream);
        }

        public static zzr zzm(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzr) zzgxy.zzbl(zzm, inputStream, zzgxiVar);
        }

        public static zzr zzn(zzgwm zzgwmVar) {
            return (zzr) zzgxy.zzbm(zzm, zzgwmVar);
        }

        public static zzr zzo(zzgww zzgwwVar) {
            return (zzr) zzgxy.zzbn(zzm, zzgwwVar);
        }

        public static zzr zzp(InputStream inputStream) {
            return (zzr) zzgxy.zzbo(zzm, inputStream);
        }

        public static zzr zzq(ByteBuffer byteBuffer) {
            return (zzr) zzgxy.zzbp(zzm, byteBuffer);
        }

        public static zzr zzr(byte[] bArr) {
            return (zzr) zzgxy.zzbq(zzm, bArr);
        }

        public static zzr zzs(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzr) zzgxy.zzbr(zzm, zzgwmVar, zzgxiVar);
        }

        public static zzr zzt(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzr) zzgxy.zzbs(zzm, zzgwwVar, zzgxiVar);
        }

        public static zzr zzu(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzr) zzgxy.zzbu(zzm, inputStream, zzgxiVar);
        }

        public static zzr zzv(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzr) zzgxy.zzbv(zzm, byteBuffer, zzgxiVar);
        }

        public static zzr zzw(byte[] bArr, zzgxi zzgxiVar) {
            return (zzr) zzgxy.zzbx(zzm, bArr, zzgxiVar);
        }

        public static zzgzr<zzr> zzx() {
            return zzm.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public zzab.zzc zzK() {
            zzab.zzc zzb2 = zzab.zzc.zzb(this.zzz);
            if (zzb2 == null) {
                return zzab.zzc.NETWORKTYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public zzar zzL() {
            zzar zzarVar = this.zzv;
            if (zzarVar == null) {
                return zzar.zzg();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public zzgwm zzM() {
            return zzgwm.zzw(this.zzx);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public zzgwm zzN() {
            return zzgwm.zzw(this.zzy);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public zzgwm zzO() {
            return zzgwm.zzw(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public String zzP() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public String zzQ() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public String zzR() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public List<zzd.zza> zzS() {
            return new zzgyi(this.zzC, zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public List<zzd.zza> zzT() {
            return new zzgyi(this.zzB, zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public boolean zzU() {
            if ((this.zzo & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public boolean zzV() {
            if ((this.zzo & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public boolean zzW() {
            if ((this.zzo & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public boolean zzX() {
            if ((this.zzo & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public boolean zzY() {
            if ((this.zzo & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public boolean zzZ() {
            if ((this.zzo & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public int zza() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public boolean zzaa() {
            if ((this.zzo & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public boolean zzab() {
            if ((this.zzo & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public int zzb() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public int zzc() {
            return this.zzB.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public zza.EnumC0157zza zzd() {
            zza.EnumC0157zza zzb2 = zza.EnumC0157zza.zzb(this.zzA);
            if (zzb2 == null) {
                return zza.EnumC0157zza.AD_INITIATER_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzm, "\u0001\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzo", "zzp", "zzu", "zzv", "zzw", zzo.zzb.zze(), "zzx", "zzy", "zzz", zzab.zzc.zze(), "zzA", zza.EnumC0157zza.zze(), "zzB", zzd.zza.zze(), "zzC", zzd.zza.zze()});
                case 3:
                    return new zzr();
                case 4:
                    return new zza(null);
                case 5:
                    return zzm;
                case 6:
                    zzgzr<zzr> zzgzrVar = zzn;
                    if (zzgzrVar == null) {
                        synchronized (zzr.class) {
                            zzgzrVar = zzn;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzm);
                                zzn = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public zzd.zza zze(int i10) {
            zzd.zza zzb2 = zzd.zza.zzb(this.zzC.zzd(i10));
            if (zzb2 == null) {
                return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public zzd.zza zzf(int i10) {
            zzd.zza zzb2 = zzd.zza.zzb(this.zzB.zzd(i10));
            if (zzb2 == null) {
                return zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzs
        public zzo.zzb zzg() {
            zzo.zzb zzb2 = zzo.zzb.zzb(this.zzw);
            if (zzb2 == null) {
                return zzo.zzb.PLATFORM_UNSPECIFIED;
            }
            return zzb2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzs extends zzgzk {
        zzab.zzc zzK();

        zzar zzL();

        zzgwm zzM();

        zzgwm zzN();

        zzgwm zzO();

        String zzP();

        String zzQ();

        String zzR();

        List<zzd.zza> zzS();

        List<zzd.zza> zzT();

        boolean zzU();

        boolean zzV();

        boolean zzW();

        boolean zzX();

        boolean zzY();

        boolean zzZ();

        int zza();

        boolean zzaa();

        boolean zzab();

        int zzb();

        int zzc();

        zza.EnumC0157zza zzd();

        zzd.zza zze(int i10);

        zzd.zza zzf(int i10);

        zzo.zzb zzg();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzt extends zzgxy<zzt, zza> implements zzu {
        public static final int zza = 9;
        public static final int zzb = 10;
        public static final int zzc = 11;
        public static final int zzd = 12;
        public static final int zze = 13;
        public static final int zzf = 14;
        public static final int zzg = 15;
        public static final int zzh = 16;
        public static final int zzi = 17;
        public static final int zzj = 18;
        public static final int zzk = 19;
        public static final int zzl = 20;
        public static final int zzm = 21;
        private static final zzt zzn;
        private static volatile zzgzr<zzt> zzo;
        private zzm zzA;
        private zzo zzB;
        private zzab zzC;
        private zza zzD;
        private zzaf zzE;
        private zzbl zzF;
        private zzb zzG;
        private int zzp;
        private int zzu;
        private int zzw;
        private zzar zzy;
        private String zzv = "";
        private int zzx = 1000;
        private zzgyj zzz = zzgxy.zzbI();

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzt, zza> implements zzu {
            private zza() {
                super(zzt.zzn);
            }

            public zza zzA(zzm zzmVar) {
                zzbu();
                ((zzt) this.zza).zzcs(zzmVar);
                return this;
            }

            public zza zzB(zzo zzoVar) {
                zzbu();
                ((zzt) this.zza).zzct(zzoVar);
                return this;
            }

            public zza zzC(zzab zzabVar) {
                zzbu();
                ((zzt) this.zza).zzcu(zzabVar);
                return this;
            }

            public zza zzD(zzaf zzafVar) {
                zzbu();
                ((zzt) this.zza).zzcv(zzafVar);
                return this;
            }

            public zza zzE(zzar zzarVar) {
                zzbu();
                ((zzt) this.zza).zzcw(zzarVar);
                return this;
            }

            public zza zzF(zzbl zzblVar) {
                zzbu();
                ((zzt) this.zza).zzcx(zzblVar);
                return this;
            }

            public zza zzG(zza.zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcy(zzbVar.zzbr());
                return this;
            }

            public zza zzH(zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcy(zzaVar);
                return this;
            }

            public zza zzI(zzb.zzc zzcVar) {
                zzbu();
                ((zzt) this.zza).zzcz(zzcVar.zzbr());
                return this;
            }

            public zza zzJ(zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcz(zzbVar);
                return this;
            }

            public zza zzK(zzm.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcA(zzaVar.zzbr());
                return this;
            }

            public zza zzL(zzm zzmVar) {
                zzbu();
                ((zzt) this.zza).zzcA(zzmVar);
                return this;
            }

            public zza zzM(zzo.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcB(zzaVar.zzbr());
                return this;
            }

            public zza zzN(zzo zzoVar) {
                zzbu();
                ((zzt) this.zza).zzcB(zzoVar);
                return this;
            }

            public zza zzO(String str) {
                zzbu();
                ((zzt) this.zza).zzcC(str);
                return this;
            }

            public zza zzP(zzgwm zzgwmVar) {
                zzbu();
                ((zzt) this.zza).zzcD(zzgwmVar);
                return this;
            }

            public zza zzQ(int i10, long j10) {
                zzbu();
                ((zzt) this.zza).zzcE(i10, j10);
                return this;
            }

            public zza zzR(zzq zzqVar) {
                zzbu();
                ((zzt) this.zza).zzcF(zzqVar);
                return this;
            }

            public zza zzS(int i10) {
                zzbu();
                ((zzt) this.zza).zzcG(i10);
                return this;
            }

            public zza zzT(zzab.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zza zzU(zzab zzabVar) {
                zzbu();
                ((zzt) this.zza).zzcH(zzabVar);
                return this;
            }

            public zza zzV(zzaf.zzc zzcVar) {
                zzbu();
                ((zzt) this.zza).zzcI(zzcVar.zzbr());
                return this;
            }

            public zza zzW(zzaf zzafVar) {
                zzbu();
                ((zzt) this.zza).zzcI(zzafVar);
                return this;
            }

            public zza zzX(zzar.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zza zzY(zzar zzarVar) {
                zzbu();
                ((zzt) this.zza).zzcJ(zzarVar);
                return this;
            }

            public zza zzZ(int i10) {
                zzbu();
                ((zzt) this.zza).zzcK(i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public int zza() {
                return ((zzt) this.zza).zza();
            }

            public zza zzaa(zzbl.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcL(zzaVar.zzbr());
                return this;
            }

            public zza zzab(zzbl zzblVar) {
                zzbu();
                ((zzt) this.zza).zzcL(zzblVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public zzab zzac() {
                return ((zzt) this.zza).zzac();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public zzaf zzad() {
                return ((zzt) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public zzar zzae() {
                return ((zzt) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public zzbl zzaf() {
                return ((zzt) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public zzgwm zzag() {
                return ((zzt) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public String zzah() {
                return ((zzt) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public List<Long> zzai() {
                return Collections.unmodifiableList(((zzt) this.zza).zzai());
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzaj() {
                return ((zzt) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzak() {
                return ((zzt) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzal() {
                return ((zzt) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzam() {
                return ((zzt) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzan() {
                return ((zzt) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzao() {
                return ((zzt) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzap() {
                return ((zzt) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzaq() {
                return ((zzt) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzar() {
                return ((zzt) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzas() {
                return ((zzt) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzat() {
                return ((zzt) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public boolean zzau() {
                return ((zzt) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public int zzb() {
                return ((zzt) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public int zzc() {
                return ((zzt) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public long zzd(int i10) {
                return ((zzt) this.zza).zzd(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public zza zze() {
                return ((zzt) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public zzb zzf() {
                return ((zzt) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public zzm zzg() {
                return ((zzt) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public zzo zzh() {
                return ((zzt) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzu
            public zzq zzi() {
                return ((zzt) this.zza).zzi();
            }

            public zza zzj(Iterable<? extends Long> iterable) {
                zzbu();
                ((zzt) this.zza).zzaE(iterable);
                return this;
            }

            public zza zzk(long j10) {
                zzbu();
                ((zzt) this.zza).zzaF(j10);
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzt) this.zza).zzaG();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzt) this.zza).zzaH();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzt) this.zza).zzaI();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzt) this.zza).zzaJ();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzt) this.zza).zzaK();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzt) this.zza).zzch();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzt) this.zza).zzci();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzt) this.zza).zzcj();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzt) this.zza).zzck();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzt) this.zza).zzcl();
                return this;
            }

            public zza zzv() {
                zzbu();
                ((zzt) this.zza).zzcm();
                return this;
            }

            public zza zzw() {
                zzbu();
                ((zzt) this.zza).zzcn();
                return this;
            }

            public zza zzx() {
                zzbu();
                ((zzt) this.zza).zzco();
                return this;
            }

            public zza zzy(zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcq(zzaVar);
                return this;
            }

            public zza zzz(zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcr(zzbVar);
                return this;
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzt zztVar = new zzt();
            zzn = zztVar;
            zzgxy.zzcb(zzt.class, zztVar);
        }

        private zzt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(Iterable<? extends Long> iterable) {
            zzcp();
            zzgvv.zzaQ(iterable, this.zzz);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(long j10) {
            zzcp();
            this.zzz.zzg(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG() {
            this.zzD = null;
            this.zzp &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaH() {
            this.zzG = null;
            this.zzp &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI() {
            this.zzA = null;
            this.zzp &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ() {
            this.zzB = null;
            this.zzp &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaK() {
            this.zzp &= -3;
            this.zzv = zzm().zzah();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(zzm zzmVar) {
            zzmVar.getClass();
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(zzo zzoVar) {
            zzoVar.getClass();
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(String str) {
            str.getClass();
            this.zzp |= 2;
            this.zzv = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(zzgwm zzgwmVar) {
            this.zzv = zzgwmVar.zzx();
            this.zzp |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(int i10, long j10) {
            zzcp();
            this.zzz.zzd(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzq zzqVar) {
            this.zzx = zzqVar.zza();
            this.zzp |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(int i10) {
            this.zzp |= 1;
            this.zzu = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzab zzabVar) {
            zzabVar.getClass();
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzE = zzafVar;
            this.zzp |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(zzar zzarVar) {
            zzarVar.getClass();
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(int i10) {
            this.zzp |= 4;
            this.zzw = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcL(zzbl zzblVar) {
            zzblVar.getClass();
            this.zzF = zzblVar;
            this.zzp |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzz = zzgxy.zzbI();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzp &= -9;
            this.zzx = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzp &= -2;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzC = null;
            this.zzp &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzE = null;
            this.zzp &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzy = null;
            this.zzp &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzp &= -5;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco() {
            this.zzF = null;
            this.zzp &= -1025;
        }

        private void zzcp() {
            zzgyj zzgyjVar = this.zzz;
            if (!zzgyjVar.zzc()) {
                this.zzz = zzgxy.zzbJ(zzgyjVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq(zza zzaVar) {
            zzaVar.getClass();
            zza zzaVar2 = this.zzD;
            if (zzaVar2 != null && zzaVar2 != zza.zzg()) {
                zza.zzb zze2 = zza.zze(zzaVar2);
                zze2.zzbj(zzaVar);
                zzaVar = zze2.zzbs();
            }
            this.zzD = zzaVar;
            this.zzp |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr(zzb zzbVar) {
            zzbVar.getClass();
            zzb zzbVar2 = this.zzG;
            if (zzbVar2 != null && zzbVar2 != zzb.zzg()) {
                zzb.zzc zze2 = zzb.zze(zzbVar2);
                zze2.zzbj(zzbVar);
                zzbVar = zze2.zzbs();
            }
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcs(zzm zzmVar) {
            zzmVar.getClass();
            zzm zzmVar2 = this.zzA;
            if (zzmVar2 != null && zzmVar2 != zzm.zzf()) {
                zzm.zza zzd2 = zzm.zzd(zzmVar2);
                zzd2.zzbj(zzmVar);
                zzmVar = zzd2.zzbs();
            }
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct(zzo zzoVar) {
            zzoVar.getClass();
            zzo zzoVar2 = this.zzB;
            if (zzoVar2 != null && zzoVar2 != zzo.zze()) {
                zzo.zza zzc2 = zzo.zzc(zzoVar2);
                zzc2.zzbj(zzoVar);
                zzoVar = zzc2.zzbs();
            }
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu(zzab zzabVar) {
            zzabVar.getClass();
            zzab zzabVar2 = this.zzC;
            if (zzabVar2 != null && zzabVar2 != zzab.zzi()) {
                zzab.zza zzc2 = zzab.zzc(zzabVar2);
                zzc2.zzbj(zzabVar);
                zzabVar = zzc2.zzbs();
            }
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv(zzaf zzafVar) {
            zzafVar.getClass();
            zzaf zzafVar2 = this.zzE;
            if (zzafVar2 != null && zzafVar2 != zzaf.zzl()) {
                zzaf.zzc zzj2 = zzaf.zzj(zzafVar2);
                zzj2.zzbj(zzafVar);
                zzafVar = zzj2.zzbs();
            }
            this.zzE = zzafVar;
            this.zzp |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzy;
            if (zzarVar2 != null && zzarVar2 != zzar.zzg()) {
                zzar.zza zze2 = zzar.zze(zzarVar2);
                zze2.zzbj(zzarVar);
                zzarVar = zze2.zzbs();
            }
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzbl zzblVar) {
            zzblVar.getClass();
            zzbl zzblVar2 = this.zzF;
            if (zzblVar2 != null && zzblVar2 != zzbl.zzi()) {
                zzbl.zza zzd2 = zzbl.zzd(zzblVar2);
                zzd2.zzbj(zzblVar);
                zzblVar = zzd2.zzbs();
            }
            this.zzF = zzblVar;
            this.zzp |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zza zzaVar) {
            zzaVar.getClass();
            this.zzD = zzaVar;
            this.zzp |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(zzb zzbVar) {
            zzbVar.getClass();
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        public static zza zzj() {
            return zzn.zzaZ();
        }

        public static zza zzk(zzt zztVar) {
            return zzn.zzba(zztVar);
        }

        public static zzt zzm() {
            return zzn;
        }

        public static zzt zzn(InputStream inputStream) {
            return (zzt) zzgxy.zzbk(zzn, inputStream);
        }

        public static zzt zzo(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzt) zzgxy.zzbl(zzn, inputStream, zzgxiVar);
        }

        public static zzt zzp(zzgwm zzgwmVar) {
            return (zzt) zzgxy.zzbm(zzn, zzgwmVar);
        }

        public static zzt zzq(zzgww zzgwwVar) {
            return (zzt) zzgxy.zzbn(zzn, zzgwwVar);
        }

        public static zzt zzr(InputStream inputStream) {
            return (zzt) zzgxy.zzbo(zzn, inputStream);
        }

        public static zzt zzs(ByteBuffer byteBuffer) {
            return (zzt) zzgxy.zzbp(zzn, byteBuffer);
        }

        public static zzt zzt(byte[] bArr) {
            return (zzt) zzgxy.zzbq(zzn, bArr);
        }

        public static zzt zzu(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzt) zzgxy.zzbr(zzn, zzgwmVar, zzgxiVar);
        }

        public static zzt zzv(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzt) zzgxy.zzbs(zzn, zzgwwVar, zzgxiVar);
        }

        public static zzt zzw(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzt) zzgxy.zzbu(zzn, inputStream, zzgxiVar);
        }

        public static zzt zzx(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzt) zzgxy.zzbv(zzn, byteBuffer, zzgxiVar);
        }

        public static zzt zzy(byte[] bArr, zzgxi zzgxiVar) {
            return (zzt) zzgxy.zzbx(zzn, bArr, zzgxiVar);
        }

        public static zzgzr<zzt> zzz() {
            return zzn.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public int zza() {
            return this.zzz.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public zzab zzac() {
            zzab zzabVar = this.zzC;
            if (zzabVar == null) {
                return zzab.zzi();
            }
            return zzabVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public zzaf zzad() {
            zzaf zzafVar = this.zzE;
            if (zzafVar == null) {
                return zzaf.zzl();
            }
            return zzafVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public zzar zzae() {
            zzar zzarVar = this.zzy;
            if (zzarVar == null) {
                return zzar.zzg();
            }
            return zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public zzbl zzaf() {
            zzbl zzblVar = this.zzF;
            if (zzblVar == null) {
                return zzbl.zzi();
            }
            return zzblVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public zzgwm zzag() {
            return zzgwm.zzw(this.zzv);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public String zzah() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public List<Long> zzai() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzaj() {
            if ((this.zzp & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzak() {
            if ((this.zzp & 2048) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzal() {
            if ((this.zzp & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzam() {
            if ((this.zzp & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzan() {
            if ((this.zzp & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzao() {
            if ((this.zzp & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzap() {
            if ((this.zzp & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzaq() {
            if ((this.zzp & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzar() {
            if ((this.zzp & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzas() {
            if ((this.zzp & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzat() {
            if ((this.zzp & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public boolean zzau() {
            if ((this.zzp & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public int zzb() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public int zzc() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public long zzd(int i10) {
            return this.zzz.zza(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzn, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", zzq.zze(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
                case 3:
                    return new zzt();
                case 4:
                    return new zza(null);
                case 5:
                    return zzn;
                case 6:
                    zzgzr<zzt> zzgzrVar = zzo;
                    if (zzgzrVar == null) {
                        synchronized (zzt.class) {
                            zzgzrVar = zzo;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzn);
                                zzo = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public zza zze() {
            zza zzaVar = this.zzD;
            if (zzaVar == null) {
                return zza.zzg();
            }
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public zzb zzf() {
            zzb zzbVar = this.zzG;
            if (zzbVar == null) {
                return zzb.zzg();
            }
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public zzm zzg() {
            zzm zzmVar = this.zzA;
            if (zzmVar == null) {
                return zzm.zzf();
            }
            return zzmVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public zzo zzh() {
            zzo zzoVar = this.zzB;
            if (zzoVar == null) {
                return zzo.zze();
            }
            return zzoVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzu
        public zzq zzi() {
            zzq zzb2 = zzq.zzb(this.zzx);
            if (zzb2 == null) {
                return zzq.ENUM_UNKNOWN;
            }
            return zzb2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzu extends zzgzk {
        int zza();

        zzab zzac();

        zzaf zzad();

        zzar zzae();

        zzbl zzaf();

        zzgwm zzag();

        String zzah();

        List<Long> zzai();

        boolean zzaj();

        boolean zzak();

        boolean zzal();

        boolean zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        int zzb();

        int zzc();

        long zzd(int i10);

        zza zze();

        zzb zzf();

        zzm zzg();

        zzo zzh();

        zzq zzi();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzv extends zzgxy<zzv, zza> implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zze;
        private static volatile zzgzr<zzv> zzf;
        private int zzg;
        private int zzi;
        private zzap zzk;
        private String zzh = "";
        private zzgyg zzj = zzgxy.zzbG();

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzv, zza> implements zzw {
            private zza() {
                super(zzv.zze);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzw
            public int zza(int i10) {
                return ((zzv) this.zza).zza(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzw
            public int zzb() {
                return ((zzv) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzw
            public zzq zzc() {
                return ((zzv) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends Integer> iterable) {
                zzbu();
                ((zzv) this.zza).zzN(iterable);
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzv) this.zza).zzO(i10);
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzv) this.zza).zzP();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzv) this.zza).zzQ();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzv) this.zza).zzR();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzv) this.zza).zzS();
                return this;
            }

            public zza zzj(zzap zzapVar) {
                zzbu();
                ((zzv) this.zza).zzU(zzapVar);
                return this;
            }

            public zza zzk(String str) {
                zzbu();
                ((zzv) this.zza).zzV(str);
                return this;
            }

            public zza zzl(zzgwm zzgwmVar) {
                zzbu();
                ((zzv) this.zza).zzW(zzgwmVar);
                return this;
            }

            public zza zzm(zzap.zza zzaVar) {
                zzbu();
                ((zzv) this.zza).zzX(zzaVar.zzbr());
                return this;
            }

            public zza zzn(zzap zzapVar) {
                zzbu();
                ((zzv) this.zza).zzX(zzapVar);
                return this;
            }

            public zza zzo(zzq zzqVar) {
                zzbu();
                ((zzv) this.zza).zzY(zzqVar);
                return this;
            }

            public zza zzp(int i10, int i11) {
                zzbu();
                ((zzv) this.zza).zzZ(i10, i11);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzw
            public zzap zzq() {
                return ((zzv) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzw
            public zzgwm zzr() {
                return ((zzv) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzw
            public String zzs() {
                return ((zzv) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzw
            public List<Integer> zzt() {
                return Collections.unmodifiableList(((zzv) this.zza).zzt());
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzw
            public boolean zzu() {
                return ((zzv) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzw
            public boolean zzv() {
                return ((zzv) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzw
            public boolean zzw() {
                return ((zzv) this.zza).zzw();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzv zzvVar = new zzv();
            zze = zzvVar;
            zzgxy.zzcb(zzv.class, zzvVar);
        }

        private zzv() {
        }

        public static zzgzr<zzv> zzA() {
            return zze.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(Iterable<? extends Integer> iterable) {
            zzT();
            zzgvv.zzaQ(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(int i10) {
            zzT();
            this.zzj.zzi(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP() {
            this.zzg &= -2;
            this.zzh = zzg().zzs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzk = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzg &= -3;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS() {
            this.zzj = zzgxy.zzbG();
        }

        private void zzT() {
            zzgyg zzgygVar = this.zzj;
            if (!zzgygVar.zzc()) {
                this.zzj = zzgxy.zzbH(zzgygVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(String str) {
            str.getClass();
            this.zzg |= 1;
            this.zzh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzgwm zzgwmVar) {
            this.zzh = zzgwmVar.zzx();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(int i10, int i11) {
            zzT();
            this.zzj.zze(i10, i11);
        }

        public static zza zzd() {
            return zze.zzaZ();
        }

        public static zza zze(zzv zzvVar) {
            return zze.zzba(zzvVar);
        }

        public static zzv zzg() {
            return zze;
        }

        public static zzv zzh(InputStream inputStream) {
            return (zzv) zzgxy.zzbk(zze, inputStream);
        }

        public static zzv zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzv) zzgxy.zzbl(zze, inputStream, zzgxiVar);
        }

        public static zzv zzj(zzgwm zzgwmVar) {
            return (zzv) zzgxy.zzbm(zze, zzgwmVar);
        }

        public static zzv zzk(zzgww zzgwwVar) {
            return (zzv) zzgxy.zzbn(zze, zzgwwVar);
        }

        public static zzv zzl(InputStream inputStream) {
            return (zzv) zzgxy.zzbo(zze, inputStream);
        }

        public static zzv zzm(ByteBuffer byteBuffer) {
            return (zzv) zzgxy.zzbp(zze, byteBuffer);
        }

        public static zzv zzn(byte[] bArr) {
            return (zzv) zzgxy.zzbq(zze, bArr);
        }

        public static zzv zzo(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzv) zzgxy.zzbr(zze, zzgwmVar, zzgxiVar);
        }

        public static zzv zzp(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzv) zzgxy.zzbs(zze, zzgwwVar, zzgxiVar);
        }

        public static zzv zzx(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzv) zzgxy.zzbu(zze, inputStream, zzgxiVar);
        }

        public static zzv zzy(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzv) zzgxy.zzbv(zze, byteBuffer, zzgxiVar);
        }

        public static zzv zzz(byte[] bArr, zzgxi zzgxiVar) {
            return (zzv) zzgxy.zzbx(zze, bArr, zzgxiVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzw
        public int zza(int i10) {
            return this.zzj.zzd(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzw
        public int zzb() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzw
        public zzq zzc() {
            zzq zzb2 = zzq.zzb(this.zzi);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzq.zze(), "zzj", "zzk"});
                case 3:
                    return new zzv();
                case 4:
                    return new zza(null);
                case 5:
                    return zze;
                case 6:
                    zzgzr<zzv> zzgzrVar = zzf;
                    if (zzgzrVar == null) {
                        synchronized (zzv.class) {
                            zzgzrVar = zzf;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zze);
                                zzf = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzw
        public zzap zzq() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzw
        public zzgwm zzr() {
            return zzgwm.zzw(this.zzh);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzw
        public String zzs() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzw
        public List<Integer> zzt() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzw
        public boolean zzu() {
            if ((this.zzg & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzw
        public boolean zzv() {
            if ((this.zzg & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzw
        public boolean zzw() {
            if ((this.zzg & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzw extends zzgzk {
        int zza(int i10);

        int zzb();

        zzq zzc();

        zzap zzq();

        zzgwm zzr();

        String zzs();

        List<Integer> zzt();

        boolean zzu();

        boolean zzv();

        boolean zzw();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzx extends zzgxy<zzx, zza> implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzc;
        private static volatile zzgzr<zzx> zzd;
        private int zze;
        private int zzf;
        private zzgyg zzg = zzgxy.zzbG();

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzx, zza> implements zzy {
            private zza() {
                super(zzx.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzy
            public int zza(int i10) {
                return ((zzx) this.zza).zza(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzy
            public int zzb() {
                return ((zzx) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzy
            public zzq zzc() {
                return ((zzx) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends Integer> iterable) {
                zzbu();
                ((zzx) this.zza).zzC(iterable);
                return this;
            }

            public zza zze(int i10) {
                zzbu();
                ((zzx) this.zza).zzD(i10);
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzx) this.zza).zzE();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzx) this.zza).zzF();
                return this;
            }

            public zza zzh(int i10, int i11) {
                zzbu();
                ((zzx) this.zza).zzH(i10, i11);
                return this;
            }

            public zza zzi(zzq zzqVar) {
                zzbu();
                ((zzx) this.zza).zzI(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzy
            public List<Integer> zzj() {
                return Collections.unmodifiableList(((zzx) this.zza).zzj());
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzy
            public boolean zzk() {
                return ((zzx) this.zza).zzk();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzc = zzxVar;
            zzgxy.zzcb(zzx.class, zzxVar);
        }

        private zzx() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(Iterable<? extends Integer> iterable) {
            zzG();
            zzgvv.zzaQ(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i10) {
            zzG();
            this.zzg.zzi(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE() {
            this.zzg = zzgxy.zzbG();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zze &= -2;
            this.zzf = 0;
        }

        private void zzG() {
            zzgyg zzgygVar = this.zzg;
            if (!zzgygVar.zzc()) {
                this.zzg = zzgxy.zzbH(zzgygVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH(int i10, int i11) {
            zzG();
            this.zzg.zze(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzd() {
            return zzc.zzaZ();
        }

        public static zza zze(zzx zzxVar) {
            return zzc.zzba(zzxVar);
        }

        public static zzx zzg() {
            return zzc;
        }

        public static zzx zzh(InputStream inputStream) {
            return (zzx) zzgxy.zzbk(zzc, inputStream);
        }

        public static zzx zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzx) zzgxy.zzbl(zzc, inputStream, zzgxiVar);
        }

        public static zzx zzl(zzgwm zzgwmVar) {
            return (zzx) zzgxy.zzbm(zzc, zzgwmVar);
        }

        public static zzx zzm(zzgww zzgwwVar) {
            return (zzx) zzgxy.zzbn(zzc, zzgwwVar);
        }

        public static zzx zzn(InputStream inputStream) {
            return (zzx) zzgxy.zzbo(zzc, inputStream);
        }

        public static zzx zzo(ByteBuffer byteBuffer) {
            return (zzx) zzgxy.zzbp(zzc, byteBuffer);
        }

        public static zzx zzp(byte[] bArr) {
            return (zzx) zzgxy.zzbq(zzc, bArr);
        }

        public static zzx zzq(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzx) zzgxy.zzbr(zzc, zzgwmVar, zzgxiVar);
        }

        public static zzx zzr(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzx) zzgxy.zzbs(zzc, zzgwwVar, zzgxiVar);
        }

        public static zzx zzs(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzx) zzgxy.zzbu(zzc, inputStream, zzgxiVar);
        }

        public static zzx zzt(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzx) zzgxy.zzbv(zzc, byteBuffer, zzgxiVar);
        }

        public static zzx zzu(byte[] bArr, zzgxi zzgxiVar) {
            return (zzx) zzgxy.zzbx(zzc, bArr, zzgxiVar);
        }

        public static zzgzr<zzx> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzy
        public int zza(int i10) {
            return this.zzg.zzd(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzy
        public int zzb() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzy
        public zzq zzc() {
            zzq zzb2 = zzq.zzb(this.zzf);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
                case 3:
                    return new zzx();
                case 4:
                    return new zza(null);
                case 5:
                    return zzc;
                case 6:
                    zzgzr<zzx> zzgzrVar = zzd;
                    if (zzgzrVar == null) {
                        synchronized (zzx.class) {
                            zzgzrVar = zzd;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zzc);
                                zzd = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzy
        public List<Integer> zzj() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzy
        public boolean zzk() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public interface zzy extends zzgzk {
        int zza(int i10);

        int zzb();

        zzq zzc();

        List<Integer> zzj();

        boolean zzk();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
    /* loaded from: classes2.dex */
    public final class zzz extends zzgxy<zzz, zza> implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zze;
        private static volatile zzgzr<zzz> zzf;
        private int zzg;
        private zzv zzh;
        private zzgyk<zzan> zzi = zzgxy.zzbK();
        private int zzj;
        private zzap zzk;

        /* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
        /* loaded from: classes2.dex */
        public final class zza extends zzgxs<zzz, zza> implements zzaa {
            private zza() {
                super(zzz.zze);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
            public boolean zzA() {
                return ((zzz) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
            public boolean zzB() {
                return ((zzz) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
            public int zza() {
                return ((zzz) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
            public zzq zzb() {
                return ((zzz) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
            public zzv zzc() {
                return ((zzz) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends zzan> iterable) {
                zzbu();
                ((zzz) this.zza).zzQ(iterable);
                return this;
            }

            public zza zze(zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzR(zzaVar.zzbr());
                return this;
            }

            public zza zzf(zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzR(zzanVar);
                return this;
            }

            public zza zzg(int i10, zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzS(i10, zzaVar.zzbr());
                return this;
            }

            public zza zzh(int i10, zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzS(i10, zzanVar);
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzz) this.zza).zzT();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzz) this.zza).zzU();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzz) this.zza).zzV();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzz) this.zza).zzW();
                return this;
            }

            public zza zzm(zzv zzvVar) {
                zzbu();
                ((zzz) this.zza).zzY(zzvVar);
                return this;
            }

            public zza zzn(zzap zzapVar) {
                zzbu();
                ((zzz) this.zza).zzZ(zzapVar);
                return this;
            }

            public zza zzo(int i10) {
                zzbu();
                ((zzz) this.zza).zzaa(i10);
                return this;
            }

            public zza zzp(zzv.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzab(zzaVar.zzbr());
                return this;
            }

            public zza zzq(zzv zzvVar) {
                zzbu();
                ((zzz) this.zza).zzab(zzvVar);
                return this;
            }

            public zza zzr(zzap.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzac(zzaVar.zzbr());
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbu();
                ((zzz) this.zza).zzac(zzapVar);
                return this;
            }

            public zza zzt(zzq zzqVar) {
                zzbu();
                ((zzz) this.zza).zzad(zzqVar);
                return this;
            }

            public zza zzu(int i10, zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzae(i10, zzaVar.zzbr());
                return this;
            }

            public zza zzv(int i10, zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzae(i10, zzanVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
            public zzan zzw(int i10) {
                return ((zzz) this.zza).zzw(i10);
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
            public zzap zzx() {
                return ((zzz) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
            public List<zzan> zzy() {
                return Collections.unmodifiableList(((zzz) this.zza).zzy());
            }

            @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
            public boolean zzz() {
                return ((zzz) this.zza).zzz();
            }

            public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        static {
            zzz zzzVar = new zzz();
            zze = zzzVar;
            zzgxy.zzcb(zzz.class, zzzVar);
        }

        private zzz() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ(Iterable<? extends zzan> iterable) {
            zzX();
            zzgvv.zzaQ(iterable, this.zzi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzan zzanVar) {
            zzanVar.getClass();
            zzX();
            this.zzi.add(zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(int i10, zzan zzanVar) {
            zzanVar.getClass();
            zzX();
            this.zzi.add(i10, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT() {
            this.zzh = null;
            this.zzg &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU() {
            this.zzk = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV() {
            this.zzg &= -3;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW() {
            this.zzi = zzgxy.zzbK();
        }

        private void zzX() {
            zzgyk<zzan> zzgykVar = this.zzi;
            if (!zzgykVar.zzc()) {
                this.zzi = zzgxy.zzbL(zzgykVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(zzv zzvVar) {
            zzvVar.getClass();
            zzv zzvVar2 = this.zzh;
            if (zzvVar2 != null && zzvVar2 != zzv.zzg()) {
                zzv.zza zze2 = zzv.zze(zzvVar2);
                zze2.zzbj(zzvVar);
                zzvVar = zze2.zzbs();
            }
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzf()) {
                zzap.zza zzd2 = zzap.zzd(zzapVar2);
                zzd2.zzbj(zzapVar);
                zzapVar = zzd2.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(int i10) {
            zzX();
            this.zzi.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(zzv zzvVar) {
            zzvVar.getClass();
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae(int i10, zzan zzanVar) {
            zzanVar.getClass();
            zzX();
            this.zzi.set(i10, zzanVar);
        }

        public static zza zzd() {
            return zze.zzaZ();
        }

        public static zza zze(zzz zzzVar) {
            return zze.zzba(zzzVar);
        }

        public static zzz zzg() {
            return zze;
        }

        public static zzz zzh(InputStream inputStream) {
            return (zzz) zzgxy.zzbk(zze, inputStream);
        }

        public static zzz zzi(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzz) zzgxy.zzbl(zze, inputStream, zzgxiVar);
        }

        public static zzz zzj(zzgwm zzgwmVar) {
            return (zzz) zzgxy.zzbm(zze, zzgwmVar);
        }

        public static zzz zzk(zzgww zzgwwVar) {
            return (zzz) zzgxy.zzbn(zze, zzgwwVar);
        }

        public static zzz zzl(InputStream inputStream) {
            return (zzz) zzgxy.zzbo(zze, inputStream);
        }

        public static zzz zzm(ByteBuffer byteBuffer) {
            return (zzz) zzgxy.zzbp(zze, byteBuffer);
        }

        public static zzz zzn(byte[] bArr) {
            return (zzz) zzgxy.zzbq(zze, bArr);
        }

        public static zzz zzo(zzgwm zzgwmVar, zzgxi zzgxiVar) {
            return (zzz) zzgxy.zzbr(zze, zzgwmVar, zzgxiVar);
        }

        public static zzz zzp(zzgww zzgwwVar, zzgxi zzgxiVar) {
            return (zzz) zzgxy.zzbs(zze, zzgwwVar, zzgxiVar);
        }

        public static zzz zzq(InputStream inputStream, zzgxi zzgxiVar) {
            return (zzz) zzgxy.zzbu(zze, inputStream, zzgxiVar);
        }

        public static zzz zzr(ByteBuffer byteBuffer, zzgxi zzgxiVar) {
            return (zzz) zzgxy.zzbv(zze, byteBuffer, zzgxiVar);
        }

        public static zzz zzs(byte[] bArr, zzgxi zzgxiVar) {
            return (zzz) zzgxy.zzbx(zze, bArr, zzgxiVar);
        }

        public static zzgzr<zzz> zzu() {
            return zze.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
        public boolean zzA() {
            if ((this.zzg & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
        public boolean zzB() {
            if ((this.zzg & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
        public int zza() {
            return this.zzi.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
        public zzq zzb() {
            zzq zzb2 = zzq.zzb(this.zzj);
            if (zzb2 == null) {
                return zzq.ENUM_FALSE;
            }
            return zzb2;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
        public zzv zzc() {
            zzv zzvVar = this.zzh;
            if (zzvVar == null) {
                return zzv.zzg();
            }
            return zzvVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgxy
        public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
            switch (zzgxxVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return zzgxy.zzbS(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzan.class, "zzj", zzq.zze(), "zzk"});
                case 3:
                    return new zzz();
                case 4:
                    return new zza(null);
                case 5:
                    return zze;
                case 6:
                    zzgzr<zzz> zzgzrVar = zzf;
                    if (zzgzrVar == null) {
                        synchronized (zzz.class) {
                            zzgzrVar = zzf;
                            if (zzgzrVar == null) {
                                zzgzrVar = new zzgxt(zze);
                                zzf = zzgzrVar;
                            }
                        }
                    }
                    return zzgzrVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public zzao zzt(int i10) {
            return this.zzi.get(i10);
        }

        public List<? extends zzao> zzv() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
        public zzan zzw(int i10) {
            return this.zzi.get(i10);
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
        public zzap zzx() {
            zzap zzapVar = this.zzk;
            if (zzapVar == null) {
                return zzap.zzf();
            }
            return zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
        public List<zzan> zzy() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbbc.zzaa
        public boolean zzz() {
            if ((this.zzg & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    private zzbbc() {
    }

    public static void zza(zzgxi zzgxiVar) {
    }
}
