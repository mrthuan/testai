package lib.zj.office.fc.hwpf.usermodel;

import java.util.Collection;
import lib.zj.office.fc.hwpf.model.FieldsDocumentPart;

/* loaded from: classes3.dex */
public interface Fields {
    Field getFieldByStartOffset(FieldsDocumentPart fieldsDocumentPart, int i10);

    Collection<Field> getFields(FieldsDocumentPart fieldsDocumentPart);
}
