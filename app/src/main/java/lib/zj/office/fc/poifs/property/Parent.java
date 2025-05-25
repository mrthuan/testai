package lib.zj.office.fc.poifs.property;

import java.util.Iterator;

/* loaded from: classes3.dex */
public interface Parent extends Child {
    void addChild(Property property);

    Iterator getChildren();

    @Override // lib.zj.office.fc.poifs.property.Child
    void setNextChild(Child child);

    @Override // lib.zj.office.fc.poifs.property.Child
    void setPreviousChild(Child child);
}
