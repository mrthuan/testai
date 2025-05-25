package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* compiled from: FileDescriptorAssetPathFetcher.java */
/* loaded from: classes.dex */
public final class h extends b<ParcelFileDescriptor> {
    @Override // com.bumptech.glide.load.data.d
    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.b
    public final void c(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.b
    public final ParcelFileDescriptor f(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
