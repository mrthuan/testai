package lib.zj.office.fc.doc;

import fj.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import lib.zj.office.system.b;
import lib.zj.office.system.f;
import zh.g;
import zh.i;
import zh.j;
import zh.l;

/* loaded from: classes3.dex */
public class TXTReader extends b {
    private String encoding;
    private String filePath;
    private long offset;
    private g wpdoc;

    public TXTReader(f fVar, String str, String str2) {
        this.control = fVar;
        this.filePath = str;
        this.encoding = str2;
    }

    public boolean authenticate(String str) {
        if (this.encoding != null) {
            return true;
        }
        this.encoding = str;
        if (str != null) {
            try {
                this.control.r(0, getModel());
                return true;
            } catch (Throwable th2) {
                this.control.o().c().a(false, th2);
            }
        }
        return false;
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public void dispose() {
        isReaderFinish();
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public Object getModel() {
        g gVar = this.wpdoc;
        if (gVar != null) {
            return gVar;
        }
        this.wpdoc = new e();
        if (this.encoding != null) {
            readFile();
        }
        return this.wpdoc;
    }

    public void readFile() {
        String concat;
        l lVar = new l();
        zh.f fVar = lVar.c;
        zh.b.f32374b.getClass();
        zh.b.K(fVar, 11906);
        zh.b.E(fVar, 16838);
        zh.b.G(fVar, 1800);
        zh.b.H(fVar, 1800);
        zh.b.I(fVar, 1440);
        zh.b.F(fVar, 1440);
        lVar.f32371a = this.offset;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(this.filePath)), this.encoding));
        while (true) {
            String readLine = bufferedReader.readLine();
            if ((readLine != null || this.offset == 0) && !this.abortReader) {
                if (readLine == null) {
                    concat = "\n";
                } else {
                    concat = readLine.concat("\n");
                }
                String replace = concat.replace('\t', ' ');
                int length = replace.length();
                if (length > 500) {
                    int i10 = 200;
                    int i11 = 0;
                    while (i10 <= length) {
                        String concat2 = replace.substring(i11, i10).concat("\n");
                        j jVar = new j();
                        jVar.f32371a = this.offset;
                        i iVar = new i(concat2);
                        long j10 = this.offset;
                        iVar.f32371a = j10;
                        long length2 = j10 + concat2.length();
                        this.offset = length2;
                        iVar.f32372b = length2;
                        jVar.e(iVar);
                        jVar.f32372b = this.offset;
                        this.wpdoc.j(jVar, 0L);
                        if (i10 == length) {
                            break;
                        }
                        int i12 = i10 + 100;
                        if (i12 > length) {
                            i12 = length;
                        }
                        int i13 = i12;
                        i11 = i10;
                        i10 = i13;
                    }
                } else {
                    j jVar2 = new j();
                    jVar2.f32371a = this.offset;
                    i iVar2 = new i(replace);
                    long j11 = this.offset;
                    iVar2.f32371a = j11;
                    long length3 = j11 + replace.length();
                    this.offset = length3;
                    iVar2.f32372b = length3;
                    jVar2.e(iVar2);
                    jVar2.f32372b = this.offset;
                    this.wpdoc.j(jVar2, 0L);
                }
            }
        }
        bufferedReader.close();
        lVar.f32372b = this.offset;
        this.wpdoc.h(lVar);
    }

    @Override // lib.zj.office.system.b
    public boolean searchContent(File file, String str) {
        String readLine;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        do {
            readLine = bufferedReader.readLine();
            if (readLine == null) {
                return false;
            }
        } while (readLine.indexOf(str) <= 0);
        return true;
    }
}
