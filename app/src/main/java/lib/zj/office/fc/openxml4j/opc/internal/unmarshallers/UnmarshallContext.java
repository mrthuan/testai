package lib.zj.office.fc.openxml4j.opc.internal.unmarshallers;

import java.util.zip.ZipEntry;
import lib.zj.office.fc.openxml4j.opc.PackagePartName;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;

/* loaded from: classes3.dex */
public final class UnmarshallContext {
    private ZipPackage _package;
    private PackagePartName partName;
    private ZipEntry zipEntry;

    public UnmarshallContext(ZipPackage zipPackage, PackagePartName packagePartName) {
        this._package = zipPackage;
        this.partName = packagePartName;
    }

    public ZipPackage getPackage() {
        return this._package;
    }

    public PackagePartName getPartName() {
        return this.partName;
    }

    public ZipEntry getZipEntry() {
        return this.zipEntry;
    }

    public void setPackage(ZipPackage zipPackage) {
        this._package = zipPackage;
    }

    public void setPartName(PackagePartName packagePartName) {
        this.partName = packagePartName;
    }

    public void setZipEntry(ZipEntry zipEntry) {
        this.zipEntry = zipEntry;
    }
}
