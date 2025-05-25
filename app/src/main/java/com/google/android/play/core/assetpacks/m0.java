package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final q9.k f13304a;

    public m0(q9.k kVar) {
        this.f13304a = kVar;
    }

    public final ParcelFileDescriptor.AutoCloseInputStream a(int i10, int i11, String str, String str2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) Tasks.a(((t2) this.f13304a.a()).g(i10, i11, str, str2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new ck(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), i10);
        } catch (InterruptedException e10) {
            throw new ck("Extractor was interrupted while waiting for chunk file.", e10, i10);
        } catch (ExecutionException e11) {
            throw new ck(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), e11, i10);
        }
    }
}
