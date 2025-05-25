package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzqw {
    private static final byte[] zza = {Field.AUTOTEXT, 103, 103, Field.FORMDROPDOWN, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Field.NUMCHARS, -43, -59, -9, 1, 19, Field.AUTOTEXT, 112, 117, 115, Field.NOTEREF, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {Field.AUTOTEXT, 103, 103, Field.FORMDROPDOWN, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, Field.CONTROL, Field.FORMDROPDOWN, 1, 16, Field.AUTOTEXT, 112, 117, 115, Field.ADVANCE, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzct.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byte b10;
        byteBuffer.put(Field.AUTOTEXT);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put(Field.FORMDROPDOWN);
        byteBuffer.put((byte) 0);
        if (true != z10) {
            b10 = 0;
        } else {
            b10 = 2;
        }
        byteBuffer.put(b10);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgas.zza(i11));
    }

    public final void zza(zzhd zzhdVar, List list) {
        int i10;
        ByteBuffer byteBuffer = zzhdVar.zzc;
        byteBuffer.getClass();
        if (byteBuffer.limit() - zzhdVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = zzhdVar.zzc;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i11 = limit - position;
        int i12 = this.zzd;
        int i13 = (i11 + FunctionEval.FunctionID.EXTERNAL_FUNC) / FunctionEval.FunctionID.EXTERNAL_FUNC;
        int i14 = i13 + 27 + i11;
        if (i12 == 2) {
            if (bArr != null) {
                i10 = bArr.length + 28;
            } else {
                i10 = 47;
            }
            i14 += i10 + 44;
        } else {
            i10 = 0;
        }
        if (this.zzc.capacity() < i14) {
            this.zzc = ByteBuffer.allocate(i14).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer3 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                zzc(byteBuffer3, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer3.put(zzgas.zza(length));
                byteBuffer3.put(bArr);
                int i15 = length + 28;
                byteBuffer3.putInt(22, zzet.zze(byteBuffer3.array(), byteBuffer3.arrayOffset(), i15, 0));
                byteBuffer3.position(i15);
            } else {
                byteBuffer3.put(zza);
            }
            byteBuffer3.put(zzb);
        }
        int zzc = this.zze + zzade.zzc(byteBuffer2);
        this.zze = zzc;
        zzc(byteBuffer3, zzc, this.zzd, i13, false);
        for (int i16 = 0; i16 < i13; i16++) {
            if (i11 >= 255) {
                byteBuffer3.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer3.put((byte) i11);
                i11 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.zzd == 2) {
            byteBuffer3.putInt(i10 + 66, zzet.zze(byteBuffer3.array(), byteBuffer3.arrayOffset() + i10 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, zzet.zze(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer3;
        zzhdVar.zzb();
        zzhdVar.zzi(this.zzc.remaining());
        zzhdVar.zzc.put(this.zzc);
        zzhdVar.zzj();
    }

    public final void zzb() {
        this.zzc = zzct.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
