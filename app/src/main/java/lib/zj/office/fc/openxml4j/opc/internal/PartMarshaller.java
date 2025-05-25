package lib.zj.office.fc.openxml4j.opc.internal;

import java.io.OutputStream;
import lib.zj.office.fc.openxml4j.opc.PackagePart;

/* loaded from: classes3.dex */
public interface PartMarshaller {
    boolean marshall(PackagePart packagePart, OutputStream outputStream);
}
