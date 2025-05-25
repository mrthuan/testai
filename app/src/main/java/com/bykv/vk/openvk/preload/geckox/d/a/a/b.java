package com.bykv.vk.openvk.preload.geckox.d.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: DownloadFullSingleFileInterceptor.java */
/* loaded from: classes.dex */
public class b extends d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: g  reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f7556g;

    /* renamed from: h  reason: collision with root package name */
    private File f7557h;

    public static String a(UpdatePackage updatePackage, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(PackagingURIHelper.FORWARD_SLASH_STRING);
            if (lastIndexOf != -1) {
                String substring = str.substring(lastIndexOf + 1);
                if (TextUtils.isEmpty(substring)) {
                    throw new RuntimeException("url path illegal, url:".concat(str));
                }
                return substring;
            }
            throw new RuntimeException("url path illegal, url:".concat(str));
        }
        throw new RuntimeException("url empty, channel:" + updatePackage.getChannel());
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f7556g = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f7557h = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) {
        GeckoLogger.d("gecko-debug-tag", "start download full single file channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.f7557h;
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
        com.bykv.vk.openvk.preload.geckox.buffer.a a10 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new File(file2, "res" + str + a(updatePackage, uri)), length);
        try {
            this.f7556g.f7511d.downloadFile(uri, length, new BufferOutputStream(a10));
            try {
                try {
                    Object a11 = bVar.a((com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>>) new Pair<>(a10, updatePackage));
                    try {
                        a10.e();
                    } catch (Exception e10) {
                        GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e10);
                    }
                    return a11;
                } catch (Exception e11) {
                    throw e11;
                }
            } catch (Throwable th2) {
                try {
                    a10.e();
                } catch (Exception e12) {
                    GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e12);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            a10.e();
            StringBuilder g10 = b.a.g("download full single file failed! url:", uri, ", channel:");
            g10.append(updatePackage.getChannel());
            g10.append(", pkg id:");
            g10.append(updatePackage.getFullPackage().getId());
            g10.append(", caused by:");
            g10.append(th3.getMessage());
            throw new com.bykv.vk.openvk.preload.geckox.b.a(g10.toString(), th3);
        }
    }
}
