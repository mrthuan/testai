package com.bykv.vk.openvk.preload.geckox.d;

import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;

/* compiled from: FileTypeBranchInterceptor.java */
/* loaded from: classes.dex */
public class a extends com.bykv.vk.openvk.preload.b.a<UpdatePackage, UpdatePackage> {
    @Override // com.bykv.vk.openvk.preload.b.a
    public final /* synthetic */ String a(UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        if (packageType != 0) {
            if (packageType == 1) {
                return "branch_single_file";
            }
            throw new RuntimeException("unknow file type: ".concat(String.valueOf(packageType)));
        }
        return "branch_zip";
    }
}
