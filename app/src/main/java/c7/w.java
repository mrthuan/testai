package c7;

import android.content.Context;
import com.google.android.play.core.assetpacks.j1;
import com.google.android.play.core.assetpacks.s2;
import com.google.android.play.core.assetpacks.v1;
import com.google.android.play.core.assetpacks.y;
import com.google.android.play.core.assetpacks.y0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes.dex */
public final class w implements x6.b, q9.l {

    /* renamed from: a  reason: collision with root package name */
    public Object f5664a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5665b;
    public final Object c;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3) {
        this.f5664a = obj;
        this.f5665b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(xj.b r7, com.google.android.play.core.assetpacks.j1 r8) {
        /*
            java.util.List<xj.e> r0 = r7.f31832p
            if (r0 == 0) goto L82
            int r0 = r0.size()
            if (r0 > 0) goto Lc
            goto L82
        Lc:
            java.util.List<xj.e> r0 = r7.f31832p
            if (r0 != 0) goto L11
            goto L79
        L11:
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            xj.e r1 = (xj.e) r1
            if (r1 != 0) goto L24
            goto L15
        L24:
            long r2 = r1.f31837b
            net.lingala.zip4j.headers.HeaderSignature r4 = net.lingala.zip4j.headers.HeaderSignature.AES_EXTRA_DATA_RECORD
            long r5 = r4.getValue()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L15
            byte[] r0 = r1.f31838d
            if (r0 == 0) goto L71
            int r0 = r0.length
            r2 = 7
            if (r0 != r2) goto L71
            xj.a r0 = new xj.a
            r0.<init>()
            r0.f17399a = r4
            byte[] r1 = r1.f31838d
            r8.getClass()
            r8 = 0
            int r2 = com.google.android.play.core.assetpacks.j1.k(r8, r1)
            net.lingala.zip4j.model.enums.AesVersion r2 = net.lingala.zip4j.model.enums.AesVersion.getFromVersionNumber(r2)
            r0.f31817b = r2
            r2 = 2
            byte[] r3 = new byte[r2]
            java.lang.System.arraycopy(r1, r2, r3, r8, r2)
            java.lang.String r8 = new java.lang.String
            r8.<init>(r3)
            r8 = 4
            r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            net.lingala.zip4j.model.enums.AesKeyStrength r8 = net.lingala.zip4j.model.enums.AesKeyStrength.getAesKeyStrengthFromRawCode(r8)
            r0.c = r8
            r8 = 5
            int r8 = com.google.android.play.core.assetpacks.j1.k(r8, r1)
            net.lingala.zip4j.model.enums.CompressionMethod r8 = net.lingala.zip4j.model.enums.CompressionMethod.getCompressionMethodFromCode(r8)
            r0.f31818d = r8
            goto L7a
        L71:
            net.lingala.zip4j.exception.ZipException r7 = new net.lingala.zip4j.exception.ZipException
            java.lang.String r8 = "corrupt AES extra data records"
            r7.<init>(r8)
            throw r7
        L79:
            r0 = 0
        L7a:
            if (r0 == 0) goto L82
            r7.f31830n = r0
            net.lingala.zip4j.model.enums.EncryptionMethod r8 = net.lingala.zip4j.model.enums.EncryptionMethod.AES
            r7.f31827k = r8
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.w.c(xj.b, com.google.android.play.core.assetpacks.j1):void");
    }

    public static xj.k f(List list, j1 j1Var, long j10, long j11, long j12, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xj.e eVar = (xj.e) it.next();
            if (eVar != null && HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue() == eVar.f31837b) {
                xj.k kVar = new xj.k();
                byte[] bArr = eVar.f31838d;
                int i11 = eVar.c;
                if (i11 <= 0) {
                    return null;
                }
                int i12 = 0;
                if (i11 > 0 && j10 == 4294967295L) {
                    kVar.c = j1Var.i(0, bArr);
                    i12 = 8;
                }
                if (i12 < eVar.c && j11 == 4294967295L) {
                    kVar.f31847b = j1Var.i(i12, bArr);
                    i12 += 8;
                }
                if (i12 < eVar.c && j12 == 4294967295L) {
                    kVar.f31848d = j1Var.i(i12, bArr);
                    i12 += 8;
                }
                if (i12 < eVar.c && i10 == 65535) {
                    j1Var.getClass();
                    kVar.f31849e = j1.f(i12, bArr);
                }
                return kVar;
            }
        }
        return null;
    }

    public static void g(RandomAccessFile randomAccessFile, long j10) {
        if (randomAccessFile instanceof wj.g) {
            ((wj.g) randomAccessFile).c.seek(j10);
        } else {
            randomAccessFile.seek(j10);
        }
    }

    @Override // q9.m
    public final /* bridge */ /* synthetic */ Object a() {
        return new y(((s2) ((q9.m) this.f5664a)).b(), (y0) ((q9.m) this.f5665b).a(), (v1) ((q9.m) this.c).a());
    }

    public final ArrayList b(int i10, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < i10) {
            xj.e eVar = new xj.e();
            j1 j1Var = (j1) this.f5665b;
            j1Var.getClass();
            eVar.f31837b = j1.k(i11, bArr);
            int i12 = i11 + 2;
            j1Var.getClass();
            int k10 = j1.k(i12, bArr);
            eVar.c = k10;
            int i13 = i12 + 2;
            if (k10 > 0) {
                byte[] bArr2 = new byte[k10];
                System.arraycopy(bArr, i13, bArr2, 0, k10);
                eVar.f31838d = bArr2;
            }
            i11 = i13 + k10;
            arrayList.add(eVar);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        return arrayList;
    }

    public final xj.l d(RandomAccessFile randomAccessFile, u8.b bVar) {
        long j10;
        long j11;
        int m10;
        byte b10;
        boolean z10;
        xj.l lVar;
        w1.f fVar;
        byte[] bArr;
        xj.f fVar2;
        byte[] bArr2;
        boolean z11;
        char c;
        List<xj.e> emptyList;
        w wVar = this;
        Object obj = wVar.f5665b;
        if (randomAccessFile.length() == 0) {
            return new xj.l();
        }
        if (randomAccessFile.length() >= 22) {
            xj.l lVar2 = new xj.l();
            wVar.f5664a = lVar2;
            try {
                lVar2.f31851b = wVar.e(randomAccessFile, (j1) obj, bVar);
                xj.l lVar3 = (xj.l) wVar.f5664a;
                xj.d dVar = lVar3.f31851b;
                if (dVar.c == 0) {
                    return lVar3;
                }
                j1 j1Var = (j1) obj;
                long j12 = dVar.f31836e;
                xj.i iVar = new xj.i();
                g(randomAccessFile, (((j12 - 4) - 8) - 4) - 4);
                HeaderSignature headerSignature = HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_LOCATOR;
                if (j1Var.h(randomAccessFile) == headerSignature.getValue()) {
                    ((xj.l) wVar.f5664a).f31855g = true;
                    iVar.f17399a = headerSignature;
                    j1Var.h(randomAccessFile);
                    iVar.f31843b = j1Var.j(randomAccessFile);
                    j1Var.h(randomAccessFile);
                } else {
                    ((xj.l) wVar.f5664a).f31855g = false;
                    iVar = null;
                }
                lVar3.c = iVar;
                xj.l lVar4 = (xj.l) wVar.f5664a;
                if (lVar4.f31855g) {
                    xj.i iVar2 = lVar4.c;
                    if (iVar2 != null) {
                        long j13 = iVar2.f31843b;
                        if (j13 >= 0) {
                            randomAccessFile.seek(j13);
                            xj.j jVar = new xj.j();
                            HeaderSignature headerSignature2 = HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_RECORD;
                            if (j1Var.h(randomAccessFile) == headerSignature2.getValue()) {
                                jVar.f17399a = headerSignature2;
                                jVar.f31844b = j1Var.j(randomAccessFile);
                                j1Var.m(randomAccessFile);
                                j1Var.m(randomAccessFile);
                                jVar.c = j1Var.h(randomAccessFile);
                                j1Var.h(randomAccessFile);
                                j1Var.j(randomAccessFile);
                                jVar.f31845d = j1Var.j(randomAccessFile);
                                j1Var.j(randomAccessFile);
                                jVar.f31846e = j1Var.j(randomAccessFile);
                                long j14 = jVar.f31844b - 44;
                                if (j14 > 0) {
                                    randomAccessFile.readFully(new byte[(int) j14]);
                                }
                                lVar4.f31852d = jVar;
                                xj.l lVar5 = (xj.l) wVar.f5664a;
                                xj.j jVar2 = lVar5.f31852d;
                                if (jVar2 != null && jVar2.c > 0) {
                                    lVar5.f31853e = true;
                                } else {
                                    lVar5.f31853e = false;
                                }
                            } else {
                                throw new ZipException("invalid signature for zip64 end of central directory record");
                            }
                        } else {
                            throw new ZipException("invalid offset for start of end of central directory record");
                        }
                    } else {
                        throw new ZipException("invalid zip64 end of central directory locator");
                    }
                }
                xj.l lVar6 = (xj.l) wVar.f5664a;
                Charset charset = (Charset) bVar.c;
                w1.f fVar3 = new w1.f(7);
                ArrayList arrayList = new ArrayList();
                xj.l lVar7 = (xj.l) wVar.f5664a;
                boolean z12 = lVar7.f31855g;
                if (z12) {
                    j10 = lVar7.f31852d.f31846e;
                } else {
                    j10 = lVar7.f31851b.f31835d;
                }
                if (z12) {
                    j11 = lVar7.f31852d.f31845d;
                } else {
                    j11 = lVar7.f31851b.c;
                }
                randomAccessFile.seek(j10);
                byte[] bArr3 = new byte[2];
                byte[] bArr4 = new byte[4];
                int i10 = 0;
                while (i10 < j11) {
                    xj.f fVar4 = new xj.f();
                    long h10 = j1Var.h(randomAccessFile);
                    HeaderSignature headerSignature3 = HeaderSignature.CENTRAL_DIRECTORY;
                    if (h10 == headerSignature3.getValue()) {
                        fVar4.f17399a = headerSignature3;
                        j1Var.m(randomAccessFile);
                        j1Var.m(randomAccessFile);
                        byte[] bArr5 = new byte[2];
                        randomAccessFile.readFully(bArr5);
                        fVar4.f31826j = com.google.android.play.core.assetpacks.c.K(bArr5[0], 0);
                        fVar4.f31828l = com.google.android.play.core.assetpacks.c.K(bArr5[0], 3);
                        long j15 = j11;
                        fVar4.f31831o = com.google.android.play.core.assetpacks.c.K(bArr5[1], 3);
                        fVar4.f31819b = (byte[]) bArr5.clone();
                        fVar4.c = CompressionMethod.getCompressionMethodFromCode(j1Var.m(randomAccessFile));
                        fVar4.f31820d = j1Var.h(randomAccessFile);
                        randomAccessFile.readFully(bArr4);
                        fVar4.f31821e = j1Var.i(0, bArr4);
                        Object obj2 = j1Var.c;
                        byte[] bArr6 = (byte[]) obj2;
                        Arrays.fill(bArr6, (byte) 0);
                        randomAccessFile.readFully(bArr6, 0, 4);
                        int i11 = i10;
                        fVar4.f31822f = j1Var.i(0, bArr6);
                        byte[] bArr7 = (byte[]) obj2;
                        Arrays.fill(bArr7, (byte) 0);
                        randomAccessFile.readFully(bArr7, 0, 4);
                        fVar4.f31823g = j1Var.i(0, bArr7);
                        int m11 = j1Var.m(randomAccessFile);
                        fVar4.f31824h = j1Var.m(randomAccessFile);
                        int m12 = j1Var.m(randomAccessFile);
                        fVar4.f31839r = j1Var.m(randomAccessFile);
                        randomAccessFile.readFully(bArr3);
                        randomAccessFile.readFully(bArr4);
                        fVar4.f31840s = (byte[]) bArr4.clone();
                        randomAccessFile.readFully(bArr4);
                        byte[] bArr8 = bArr3;
                        fVar4.f31841t = j1Var.i(0, bArr4);
                        if (m11 > 0) {
                            byte[] bArr9 = new byte[m11];
                            randomAccessFile.readFully(bArr9);
                            String t4 = ge.a.t(bArr9, fVar4.f31831o, charset);
                            fVar4.f31825i = t4;
                            byte[] bArr10 = fVar4.f31840s;
                            byte b11 = bArr10[0];
                            if ((b11 == 0 || !com.google.android.play.core.assetpacks.c.K(b11, 4)) && (((b10 = bArr10[3]) == 0 || !com.google.android.play.core.assetpacks.c.K(b10, 6)) && !t4.endsWith(PackagingURIHelper.FORWARD_SLASH_STRING) && !t4.endsWith("\\"))) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            fVar4.f31833q = z10;
                            int i12 = fVar4.f31824h;
                            if (i12 > 0) {
                                if (i12 < 4) {
                                    if (i12 > 0) {
                                        randomAccessFile.skipBytes(i12);
                                    }
                                    emptyList = null;
                                } else {
                                    byte[] bArr11 = new byte[i12];
                                    randomAccessFile.read(bArr11);
                                    try {
                                        emptyList = wVar.b(i12, bArr11);
                                    } catch (Exception unused) {
                                        emptyList = Collections.emptyList();
                                    }
                                }
                                fVar4.f31832p = emptyList;
                            }
                            List<xj.e> list = fVar4.f31832p;
                            if (list != null && list.size() > 0) {
                                lVar = lVar6;
                                fVar = fVar3;
                                bArr2 = bArr8;
                                bArr = bArr4;
                                fVar2 = fVar4;
                                c = 2;
                                z11 = false;
                                xj.k f10 = f(fVar4.f31832p, j1Var, fVar4.f31823g, fVar4.f31822f, fVar4.f31841t, fVar4.f31839r);
                                if (f10 != null) {
                                    fVar2.f31829m = f10;
                                    long j16 = f10.c;
                                    if (j16 != -1) {
                                        fVar2.f31823g = j16;
                                    }
                                    long j17 = f10.f31847b;
                                    if (j17 != -1) {
                                        fVar2.f31822f = j17;
                                    }
                                    long j18 = f10.f31848d;
                                    if (j18 != -1) {
                                        fVar2.f31841t = j18;
                                    }
                                    int i13 = f10.f31849e;
                                    if (i13 != -1) {
                                        fVar2.f31839r = i13;
                                    }
                                }
                            } else {
                                lVar = lVar6;
                                fVar = fVar3;
                                bArr = bArr4;
                                fVar2 = fVar4;
                                bArr2 = bArr8;
                                z11 = false;
                                c = 2;
                            }
                            c(fVar2, j1Var);
                            if (m12 > 0) {
                                byte[] bArr12 = new byte[m12];
                                randomAccessFile.readFully(bArr12);
                                ge.a.t(bArr12, fVar2.f31831o, charset);
                            }
                            if (fVar2.f31826j) {
                                if (fVar2.f31830n != null) {
                                    fVar2.f31827k = EncryptionMethod.AES;
                                } else {
                                    fVar2.f31827k = EncryptionMethod.ZIP_STANDARD;
                                }
                            }
                            arrayList.add(fVar2);
                            i10 = i11 + 1;
                            wVar = this;
                            j11 = j15;
                            lVar6 = lVar;
                            fVar3 = fVar;
                            bArr3 = bArr2;
                            bArr4 = bArr;
                        } else {
                            throw new ZipException("Invalid entry name in file header");
                        }
                    } else {
                        throw new ZipException("Expected central directory entry not found (#" + (i10 + 1) + ")");
                    }
                }
                xj.l lVar8 = lVar6;
                w1.f fVar5 = fVar3;
                fVar5.f30907b = arrayList;
                if (j1Var.h(randomAccessFile) == HeaderSignature.DIGITAL_SIGNATURE.getValue() && (m10 = j1Var.m(randomAccessFile)) > 0) {
                    byte[] bArr13 = new byte[m10];
                    randomAccessFile.readFully(bArr13);
                    new String(bArr13);
                }
                lVar8.f31850a = fVar5;
                return (xj.l) this.f5664a;
            } catch (ZipException e10) {
                throw e10;
            } catch (IOException e11) {
                e11.printStackTrace();
                throw new ZipException("Zip headers not found. Probably not a zip file or a corrupted zip file", e11);
            }
        }
        throw new ZipException("Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file");
    }

    public final xj.d e(RandomAccessFile randomAccessFile, j1 j1Var, u8.b bVar) {
        long length = randomAccessFile.length();
        if (length >= 22) {
            long j10 = length - 22;
            g(randomAccessFile, j10);
            j1 j1Var2 = (j1) this.f5665b;
            if (j1Var2.h(randomAccessFile) != HeaderSignature.END_OF_CENTRAL_DIRECTORY.getValue()) {
                j10 = randomAccessFile.length() - 22;
                long j11 = 65536;
                if (randomAccessFile.length() < 65536) {
                    j11 = randomAccessFile.length();
                }
                while (j11 > 0 && j10 > 0) {
                    j10--;
                    g(randomAccessFile, j10);
                    if (j1Var2.h(randomAccessFile) != HeaderSignature.END_OF_CENTRAL_DIRECTORY.getValue()) {
                        j11--;
                    }
                }
                throw new ZipException("Zip headers not found. Probably not a zip file");
            }
            g(randomAccessFile, 4 + j10);
            xj.d dVar = new xj.d();
            dVar.f17399a = HeaderSignature.END_OF_CENTRAL_DIRECTORY;
            dVar.f31834b = j1Var.m(randomAccessFile);
            j1Var.m(randomAccessFile);
            j1Var.m(randomAccessFile);
            dVar.c = j1Var.m(randomAccessFile);
            j1Var.h(randomAccessFile);
            dVar.f31836e = j10;
            byte[] bArr = (byte[]) this.c;
            randomAccessFile.readFully(bArr);
            boolean z10 = false;
            dVar.f31835d = j1Var.i(0, bArr);
            int m10 = j1Var.m(randomAccessFile);
            Charset charset = (Charset) bVar.c;
            if (m10 > 0) {
                try {
                    byte[] bArr2 = new byte[m10];
                    randomAccessFile.readFully(bArr2);
                    if (charset == null) {
                        charset = zj.b.c;
                    }
                    ge.a.t(bArr2, false, charset);
                } catch (IOException unused) {
                }
            }
            xj.l lVar = (xj.l) this.f5664a;
            if (dVar.f31834b > 0) {
                z10 = true;
            }
            lVar.f31853e = z10;
            return dVar;
        }
        throw new ZipException("Zip file size less than size of zip headers. Probably not a zip file.");
    }

    @Override // pf.a
    public final Object get() {
        return new v((Context) ((pf.a) this.f5664a).get(), (String) ((pf.a) this.f5665b).get(), ((Integer) ((pf.a) this.c).get()).intValue());
    }

    public w(String str, String str2, String str3) {
        kotlin.jvm.internal.g.e(str, ea.a.p("R2k_bBZTFnIbbmc=", "JVSlXXxX"));
        kotlin.jvm.internal.g.e(str2, ea.a.p("V2UocyB0EGkcZw==", "QJaawfW1"));
        this.f5664a = str;
        this.f5665b = str2;
        this.c = str3;
    }

    public w() {
        this.f5665b = new j1();
        this.c = new byte[4];
    }
}
