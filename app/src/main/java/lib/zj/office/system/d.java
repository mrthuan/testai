package lib.zj.office.system;

import java.io.File;
import java.text.SimpleDateFormat;
import lib.zj.office.fc.OldFileFormatException;
import lib.zj.office.fc.poifs.filesystem.OfficeXmlFileException;

/* compiled from: ErrorUtil.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public r f21023a;

    static {
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public d(r rVar) {
        f fVar;
        this.f21023a = rVar;
        if (rVar != null && (fVar = rVar.f21076i) != null && fVar.s() != null) {
            synchronized (this) {
                f fVar2 = rVar.f21076i;
                if (fVar2 == null) {
                    return;
                }
                i s4 = fVar2.s();
                if (s4 == null) {
                    return;
                }
                if (s4.B0()) {
                    File G0 = s4.G0();
                    if (G0 == null) {
                        return;
                    }
                    if (G0.exists() && G0.canWrite()) {
                        File file = new File(G0.getAbsolutePath() + File.separatorChar + "ASReader");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        new File(file.getAbsolutePath() + File.separatorChar + "errorLog.txt");
                    }
                }
            }
        }
    }

    public final void a(boolean z10, Throwable th2) {
        f fVar;
        int i10;
        r rVar = this.f21023a;
        if (rVar != null && (fVar = rVar.f21076i) != null && fVar.s() != null) {
            i s4 = this.f21023a.f21076i.s();
            String th3 = th2.toString();
            if (th3.contains("SD")) {
                i10 = 8;
            } else if (th3.contains("parse pdf error")) {
                i10 = 11;
            } else if (th3.contains("Write Permission denied")) {
                i10 = 9;
            } else if (th3.contains("No space left on device")) {
                i10 = 10;
            } else if (!(th2 instanceof OutOfMemoryError) && !th3.contains("OutOfMemoryError")) {
                if (!th3.contains("no such entry") && !th3.contains("Format error") && !th3.contains("Unable to read entire header") && !(th2 instanceof OfficeXmlFileException) && !th3.contains("The text piece table is corrupted") && !th3.contains("Invalid header signature")) {
                    if (th3.contains("The document is really a RTF file")) {
                        i10 = 5;
                    } else if (th2 instanceof OldFileFormatException) {
                        i10 = 3;
                    } else if (th3.contains("Cannot process encrypted office file")) {
                        i10 = 6;
                    } else if (th3.contains("Password is incorrect")) {
                        i10 = 7;
                    } else if (z10) {
                        i10 = 4;
                    } else {
                        if (!(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof ClassCastException)) {
                            this.f21023a.getClass();
                        }
                        i10 = 1;
                    }
                } else {
                    i10 = 2;
                }
            } else {
                i10 = 0;
            }
            s4.v0(i10, th2);
        }
    }
}
