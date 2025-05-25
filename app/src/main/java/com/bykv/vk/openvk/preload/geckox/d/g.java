package com.bykv.vk.openvk.preload.geckox.d;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.k;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.util.List;

/* compiled from: RetryFullDownloadInterceptor.java */
/* loaded from: classes.dex */
public class g extends k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* renamed from: h  reason: collision with root package name */
    private int f7580h = 0;

    @Override // com.bykv.vk.openvk.preload.b.k
    public final boolean a(Throwable th2) {
        GeckoLogger.w("gecko-debug-tag", "full update failed and retry", th2);
        if (this.f7580h >= ((UpdatePackage) this.f7471g).getFullPackage().getUrlList().size()) {
            return false;
        }
        return (th2 instanceof com.bykv.vk.openvk.preload.geckox.b.a) || (th2 instanceof com.bykv.vk.openvk.preload.geckox.b.b);
    }

    @Override // com.bykv.vk.openvk.preload.b.k
    public final /* synthetic */ Pair<Uri, UpdatePackage> a() {
        UpdatePackage updatePackage = (UpdatePackage) this.f7471g;
        List<String> urlList = updatePackage.getFullPackage().getUrlList();
        int i10 = this.f7580h;
        this.f7580h = i10 + 1;
        return new Pair<>(Uri.parse(urlList.get(i10)), updatePackage);
    }
}
