package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes2.dex */
public final class Sa implements X {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14699a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14700b;

    public Sa(String location, byte[] imageBytes) {
        kotlin.jvm.internal.g.e(imageBytes, "imageBytes");
        kotlin.jvm.internal.g.e(location, "location");
        this.f14699a = imageBytes;
        this.f14700b = location;
    }

    @Override // com.inmobi.media.X
    public final Object a() {
        byte[] bArr = this.f14699a;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        kotlin.jvm.internal.g.b(decodeByteArray);
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.g.d(uuid, "toString(...)");
        String concat = uuid.concat(".jpg");
        File file = new File(this.f14700b);
        if (!file.exists()) {
            file.mkdirs();
        }
        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(this.f14700b + PackagingURIHelper.FORWARD_SLASH_CHAR + concat)));
        return this.f14700b + PackagingURIHelper.FORWARD_SLASH_CHAR + concat;
    }
}
