package lib.zj.office.fc.pdf;

import lib.zj.office.system.b;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public class PDFReader extends b {
    private String filePath;

    /* renamed from: lib  reason: collision with root package name */
    private PDFLib f20680lib;

    public PDFReader(f fVar, String str) {
        this.control = fVar;
        this.filePath = str;
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public void dispose() {
        super.dispose();
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public Object getModel() {
        this.control.r(26, Boolean.FALSE);
        PDFLib pDFLib = PDFLib.getPDFLib();
        this.f20680lib = pDFLib;
        pDFLib.openFileSync(this.filePath);
        return this.f20680lib;
    }
}
