package com.bykv.vk.openvk.preload.geckox.d.b.b;

import android.util.Pair;
import androidx.activity.r;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.BsPatch;
import java.io.File;

/* compiled from: MergePatchZipInterceptor.java */
/* loaded from: classes.dex */
public class d extends com.bykv.vk.openvk.preload.b.d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: g  reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f7565g;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* bridge */ /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) {
        return a2(bVar, pair);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f7565g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Object a2(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) {
        GeckoLogger.d("gecko-debug-tag", "start merge patch zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        File f10 = aVar.f();
        aVar.a();
        aVar.e();
        File parentFile = f10.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(updatePackage.getLocalVersion());
        File file = new File(parentFile, r.g(sb2, File.separator, "res.zip"));
        File file2 = new File(f10.getParentFile(), "res.zip");
        com.bykv.vk.openvk.preload.geckox.utils.c.a(file2);
        try {
            try {
                BsPatch.a(file, f10, file2.getParentFile(), file2.getName());
                com.bykv.vk.openvk.preload.geckox.utils.c.a(f10);
                com.bykv.vk.openvk.preload.geckox.buffer.a a10 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file2, file2.length());
                try {
                    return bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a10, updatePackage));
                } finally {
                    a10.e();
                }
            } catch (Exception e10) {
                throw new RuntimeException("merged patch zip file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e10.getMessage(), e10);
            }
        } catch (Throwable th2) {
            com.bykv.vk.openvk.preload.geckox.utils.c.a(f10);
            throw th2;
        }
    }
}
