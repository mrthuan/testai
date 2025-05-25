package com.bykv.vk.openvk.preload.geckox.d.b.a;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;

/* compiled from: DownloadFullZipInterceptor.java */
/* loaded from: classes.dex */
public class b extends com.bykv.vk.openvk.preload.b.d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: g  reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f7561g;

    /* renamed from: h  reason: collision with root package name */
    private File f7562h;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f7561g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f7562h = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) {
        GeckoLogger.d("gecko-debug-tag", "start download full zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.f7562h;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(updatePackage.getAccessKey());
        String str = File.separator;
        sb2.append(str);
        sb2.append(updatePackage.getChannel());
        sb2.append(str);
        sb2.append(updatePackage.getVersion());
        sb2.append("--updating");
        File file2 = new File(file, sb2.toString());
        file2.mkdirs();
        com.bykv.vk.openvk.preload.geckox.buffer.a a10 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new File(file2, "res.zip"), length);
        try {
            this.f7561g.f7511d.downloadFile(uri, length, new BufferOutputStream(a10));
            try {
                return bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a10, updatePackage));
            } finally {
                a10.e();
            }
        } catch (Throwable th2) {
            a10.e();
            StringBuilder g10 = b.a.g("download full zip file failed, url:", uri, ", channel:");
            g10.append(updatePackage.getChannel());
            g10.append(", pkg id:");
            g10.append(updatePackage.getFullPackage().getId());
            g10.append(", caused by:");
            g10.append(th2.getMessage());
            throw new com.bykv.vk.openvk.preload.geckox.b.a(g10.toString(), th2);
        }
    }
}
