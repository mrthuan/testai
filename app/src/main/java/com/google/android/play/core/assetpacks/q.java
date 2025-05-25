package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class q extends o {
    @Override // com.google.android.play.core.assetpacks.o, q9.t
    public final void r0(Bundle bundle, Bundle bundle2) {
        super.r0(bundle, bundle2);
        this.f13341a.d((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
