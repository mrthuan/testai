package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zzys extends Handler implements Runnable {
    final /* synthetic */ zzyx zza;
    private final zzyt zzb;
    private final long zzc;
    private zzyp zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzys(zzyx zzyxVar, Looper looper, zzyt zzytVar, zzyp zzypVar, int i10, long j10) {
        super(looper);
        this.zza = zzyxVar;
        this.zzb = zzytVar;
        this.zzd = zzypVar;
        this.zzc = j10;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzys zzysVar;
        this.zze = null;
        zzyx zzyxVar = this.zza;
        executorService = zzyxVar.zzc;
        zzysVar = zzyxVar.zzd;
        zzysVar.getClass();
        executorService.execute(zzysVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10;
        int i11;
        int i12;
        long j10;
        long min;
        if (!this.zzi) {
            int i13 = message.what;
            if (i13 == 0) {
                zzd();
            } else if (i13 != 3) {
                this.zza.zzd = null;
                long j11 = this.zzc;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = elapsedRealtime - j11;
                zzyp zzypVar = this.zzd;
                zzypVar.getClass();
                if (this.zzh) {
                    zzypVar.zzJ(this.zzb, elapsedRealtime, j12, false);
                    return;
                }
                int i14 = message.what;
                if (i14 != 1) {
                    if (i14 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.zze = iOException;
                        int i15 = this.zzf + 1;
                        this.zzf = i15;
                        zzyr zzu = zzypVar.zzu(this.zzb, elapsedRealtime, j12, iOException, i15);
                        i10 = zzu.zza;
                        if (i10 != 3) {
                            i11 = zzu.zza;
                            if (i11 != 2) {
                                i12 = zzu.zza;
                                if (i12 == 1) {
                                    this.zzf = 1;
                                }
                                j10 = zzu.zzb;
                                if (j10 != -9223372036854775807L) {
                                    min = zzu.zzb;
                                } else {
                                    min = Math.min((this.zzf - 1) * 1000, 5000);
                                }
                                zzc(min);
                                return;
                            }
                            return;
                        }
                        this.zza.zze = this.zze;
                        return;
                    }
                    return;
                }
                try {
                    zzypVar.zzK(this.zzb, elapsedRealtime, j12);
                } catch (RuntimeException e10) {
                    zzea.zzd("LoadTask", "Unexpected exception handling load completed", e10);
                    this.zza.zze = new zzyw(e10);
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z10) {
                Trace.beginSection("load:".concat(this.zzb.getClass().getSimpleName()));
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (!this.zzi) {
                sendEmptyMessage(1);
            }
        } catch (IOException e10) {
            if (!this.zzi) {
                obtainMessage(2, e10).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.zzi) {
                zzea.zzd("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(2, new zzyw(e11)).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.zzi) {
                zzea.zzd("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(3, e12).sendToTarget();
            }
            throw e12;
        } catch (Exception e13) {
            if (!this.zzi) {
                zzea.zzd("LoadTask", "Unexpected exception loading stream", e13);
                obtainMessage(2, new zzyw(e13)).sendToTarget();
            }
        }
    }

    public final void zza(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.zza.zzd = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzyp zzypVar = this.zzd;
            zzypVar.getClass();
            zzypVar.zzJ(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i10) {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j10) {
        zzys zzysVar;
        boolean z10;
        zzysVar = this.zza.zzd;
        if (zzysVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        this.zza.zzd = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            zzd();
        }
    }
}
