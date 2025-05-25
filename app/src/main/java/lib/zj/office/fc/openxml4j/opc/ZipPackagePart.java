package lib.zj.office.fc.openxml4j.opc;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import lib.zj.office.fc.openxml4j.exceptions.InvalidOperationException;
import lib.zj.office.fc.openxml4j.opc.internal.marshallers.ZipPartMarshaller;

/* loaded from: classes3.dex */
public class ZipPackagePart extends PackagePart {
    private ZipEntry zipEntry;

    public ZipPackagePart(ZipPackage zipPackage, PackagePartName packagePartName, String str) {
        super(zipPackage, packagePartName, str);
    }

    @Override // lib.zj.office.fc.openxml4j.opc.PackagePart
    public void close() {
        throw new InvalidOperationException("Method not implemented !");
    }

    @Override // lib.zj.office.fc.openxml4j.opc.PackagePart
    public void flush() {
        throw new InvalidOperationException("Method not implemented !");
    }

    @Override // lib.zj.office.fc.openxml4j.opc.PackagePart
    public InputStream getInputStreamImpl() {
        return this._container.getZipArchive().getInputStream(this.zipEntry);
    }

    @Override // lib.zj.office.fc.openxml4j.opc.PackagePart
    public OutputStream getOutputStreamImpl() {
        return null;
    }

    public ZipEntry getZipArchive() {
        return this.zipEntry;
    }

    @Override // lib.zj.office.fc.openxml4j.opc.PackagePart
    public boolean load(InputStream inputStream) {
        throw new InvalidOperationException("Method not implemented !");
    }

    @Override // lib.zj.office.fc.openxml4j.opc.PackagePart
    public boolean save(OutputStream outputStream) {
        return new ZipPartMarshaller().marshall(this, outputStream);
    }

    public ZipPackagePart(ZipPackage zipPackage, ZipEntry zipEntry, PackagePartName packagePartName, String str) {
        super(zipPackage, packagePartName, str);
        this.zipEntry = zipEntry;
    }
}
