package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbuz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuz> CREATOR = new zzbva();
    @SafeParcelable.Field
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    @SafeParcelable.Constructor
    public zzbuz(@SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.zza == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbuy
                            @Override // java.lang.Runnable
                            public final void run() {
                                Parcelable.Creator<zzbuz> creator = zzbuz.CREATOR;
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = marshall;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            IOUtils.a(dataOutputStream2);
                                        } catch (IOException e10) {
                                            e = e10;
                                            dataOutputStream = dataOutputStream2;
                                            com.google.android.gms.ads.internal.util.client.zzm.g(6);
                                            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                IOUtils.a(outputStream);
                                            } else {
                                                IOUtils.a(dataOutputStream);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                IOUtils.a(outputStream);
                                            } else {
                                                IOUtils.a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                }
                            }
                        });
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e10) {
                        e = e10;
                        com.google.android.gms.ads.internal.util.client.zzm.g(6);
                        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e, "LargeParcelTeleporter.pipeData.2");
                        IOUtils.a(autoCloseOutputStream);
                        this.zza = parcelFileDescriptor;
                        int o10 = SafeParcelWriter.o(20293, parcel);
                        SafeParcelWriter.i(parcel, 2, this.zza, i10);
                        SafeParcelWriter.p(o10, parcel);
                    }
                } catch (IOException e11) {
                    e = e11;
                    autoCloseOutputStream = null;
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th2) {
                obtain.recycle();
                throw th2;
            }
        }
        int o102 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.i(parcel, 2, this.zza, i10);
        SafeParcelWriter.p(o102, parcel);
    }

    public final SafeParcelable zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                com.google.android.gms.ads.internal.util.client.zzm.c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    IOUtils.a(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(6);
                    IOUtils.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th3) {
                IOUtils.a(dataInputStream);
                throw th3;
            }
        }
        return (SafeParcelable) this.zzb;
    }
}
