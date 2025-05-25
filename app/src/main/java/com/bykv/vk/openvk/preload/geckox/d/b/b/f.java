package com.bykv.vk.openvk.preload.geckox.d.b.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.k;
import java.io.File;

/* compiled from: UnZipMergedZipInterceptor.java */
/* loaded from: classes.dex */
public class f extends com.bykv.vk.openvk.preload.b.d<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>, Pair<File, UpdatePackage>> {
    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* bridge */ /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<Pair<File, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) {
        return a2(bVar, pair);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Object a2(com.bykv.vk.openvk.preload.b.b<Pair<File, UpdatePackage>> bVar, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage> pair) {
        GeckoLogger.d("gecko-debug-tag", "start unzip merged zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        com.bykv.vk.openvk.preload.geckox.buffer.a aVar = (com.bykv.vk.openvk.preload.geckox.buffer.a) pair.first;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        aVar.b(0L);
        File parentFile = aVar.f().getParentFile();
        try {
            k.a(new com.bykv.vk.openvk.preload.geckox.buffer.stream.a(aVar), parentFile.getAbsolutePath(), updatePackage.getChannel());
            aVar.a();
            File file = new File(parentFile, "res");
            com.bykv.vk.openvk.preload.geckox.utils.c.a(file);
            if (new File(parentFile, updatePackage.getChannel()).renameTo(file)) {
                return bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<File, UpdatePackage>>) new Pair<>(aVar.f(), updatePackage));
            }
            throw new RuntimeException("rename unzip merged zip file failed:" + parentFile.getAbsolutePath());
        } catch (Exception e10) {
            throw new RuntimeException("unzip merged zip file failed, channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + e10.getMessage(), e10);
        }
    }
}
