package com.pgl.ssdk;

import com.pgl.ssdk.ApkUtils;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pgl.ssdk.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class V2VerifierSimple {
    @DungeonFlag
    private static CertificateInfo a(ByteBuffer byteBuffer) {
        ByteBuffer a10 = ApkSigningBlockUtilsLite.a(byteBuffer);
        a10.get(new byte[a10.remaining()]);
        a10.flip();
        a10.position(0);
        ApkSigningBlockUtilsLite.a(a10);
        byte[] b10 = ApkSigningBlockUtilsLite.b(ApkSigningBlockUtilsLite.a(a10));
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b10));
            if (generateCertificate instanceof X509Certificate) {
                return new CertificateInfo(String.valueOf(((X509Certificate) generateCertificate).getSubjectDN()), b10);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<CertificateInfo> a(DataSource dataSource, ApkUtils.a aVar) {
        try {
            try {
                ByteBuffer a10 = ApkSigningBlockUtilsLite.a(ApkSigningBlockUtilsLite.a(dataSource, aVar, 1896449818).f15828a);
                if (a10.hasRemaining()) {
                    ArrayList arrayList = new ArrayList();
                    while (a10.hasRemaining()) {
                        try {
                            arrayList.add(a(ApkSigningBlockUtilsLite.a(a10)));
                        } catch (NoSuchAlgorithmException | CertificateException unused) {
                        }
                    }
                    return arrayList;
                }
                return null;
            } catch (ApkFormatException | BufferUnderflowException unused2) {
                return null;
            }
        } catch (SignatureNotFoundException e10) {
            throw new ApkSigningBlockUtils(e10.getMessage());
        }
    }
}
