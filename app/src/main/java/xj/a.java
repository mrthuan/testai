package xj;

import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionMethod;

/* compiled from: AESExtraDataRecord.java */
/* loaded from: classes3.dex */
public final class a extends g1.c {

    /* renamed from: b  reason: collision with root package name */
    public AesVersion f31817b;
    public AesKeyStrength c;

    /* renamed from: d  reason: collision with root package name */
    public CompressionMethod f31818d;

    public a() {
        super(3);
        this.f17399a = HeaderSignature.AES_EXTRA_DATA_RECORD;
        this.f31817b = AesVersion.TWO;
        this.c = AesKeyStrength.KEY_STRENGTH_256;
        this.f31818d = CompressionMethod.DEFLATE;
    }
}
