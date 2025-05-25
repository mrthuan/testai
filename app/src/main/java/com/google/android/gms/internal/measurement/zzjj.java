package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjk;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class zzjj<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzjj<MessageType, BuilderType>> implements zzmh {
    @Override // 
    /* renamed from: zzav */
    public abstract zzjj clone();

    public zzjj zzaw(byte[] bArr, int i10, int i11) {
        throw null;
    }

    public zzjj zzax(byte[] bArr, int i10, int i11, zzkn zzknVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    public final /* synthetic */ zzmh zzay(byte[] bArr) {
        return zzaw(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    public final /* synthetic */ zzmh zzaz(byte[] bArr, zzkn zzknVar) {
        return zzax(bArr, 0, bArr.length, zzknVar);
    }
}
