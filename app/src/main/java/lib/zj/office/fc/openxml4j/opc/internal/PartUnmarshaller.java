package lib.zj.office.fc.openxml4j.opc.internal;

import java.io.InputStream;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.internal.unmarshallers.UnmarshallContext;

/* loaded from: classes3.dex */
public interface PartUnmarshaller {
    PackagePart unmarshall(UnmarshallContext unmarshallContext, InputStream inputStream);
}
