package lib.zj.office.fc.openxml4j.opc.internal.marshallers;

import java.io.OutputStream;
import java.util.zip.ZipOutputStream;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackagePartName;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipCollection;
import lib.zj.office.fc.openxml4j.opc.internal.PartMarshaller;

/* loaded from: classes3.dex */
public final class ZipPartMarshaller implements PartMarshaller {
    public static boolean marshallRelationshipPart(PackageRelationshipCollection packageRelationshipCollection, PackagePartName packagePartName, ZipOutputStream zipOutputStream) {
        return true;
    }

    @Override // lib.zj.office.fc.openxml4j.opc.internal.PartMarshaller
    public boolean marshall(PackagePart packagePart, OutputStream outputStream) {
        return true;
    }
}
