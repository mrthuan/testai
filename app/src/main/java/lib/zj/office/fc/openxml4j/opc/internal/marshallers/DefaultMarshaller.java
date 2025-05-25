package lib.zj.office.fc.openxml4j.opc.internal.marshallers;

import java.io.OutputStream;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.internal.PartMarshaller;

/* loaded from: classes3.dex */
public final class DefaultMarshaller implements PartMarshaller {
    @Override // lib.zj.office.fc.openxml4j.opc.internal.PartMarshaller
    public boolean marshall(PackagePart packagePart, OutputStream outputStream) {
        return packagePart.save(outputStream);
    }
}
