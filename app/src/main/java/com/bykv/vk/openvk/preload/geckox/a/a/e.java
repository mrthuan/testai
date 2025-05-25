package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.List;

/* compiled from: FIFOCachePolicy.java */
/* loaded from: classes.dex */
final class e extends b {
    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        for (String str : this.f7503f) {
            List<File> b10 = com.bykv.vk.openvk.preload.geckox.utils.c.b(new File(this.f7502e, str));
            if (b10 != null && b10.size() > this.f7501d.f7495a) {
                for (File file : b10.subList(0, b10.size() - this.f7501d.f7495a)) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(file.getAbsolutePath());
                    if (this.f7501d.c != null) {
                        file.getName();
                    }
                }
            }
        }
    }
}
